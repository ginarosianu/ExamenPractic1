package sample.Service;
import sample.Domain.Examinare;
import sample.Domain.Examinator;
import sample.Repository.IRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExaminareService {

    private IRepository< Examinare > examinareRepository;
    private IRepository< Examinator > examinatorRepository;

    public ExaminareService(IRepository<Examinare> examinareRepository, IRepository < Examinator > examinatorRepository) {
        this.examinareRepository = examinareRepository;
        this.examinatorRepository = examinatorRepository;
    }

    /**
     * Constructor
     * @param id
     * @param idPersExam
     * @param rezultat
     */
        public void add (int id, int idPersExam, String rezultat) {

            Examinator existingExaminator = examinatorRepository.findById(idPersExam);
        if (existingExaminator == null) {
            throw new RuntimeException("There is no person with the given id!");
        }

        Examinare persoanaExaminata = examinareRepository.findById(idPersExam);

        if (persoanaExaminata != null){
            if (persoanaExaminata.getRezultat().equals("admis") ){
            throw new RuntimeException("Nu poti adauga examinare pt o persoana admisa");
            }
        }
            Examinare examinare = new Examinare(id, idPersExam, rezultat );
            examinareRepository.upsert(examinare);
     }

    /**
     *
     * @return a list of all examinations;
     */
        public List<Examinare> getAll() {
            return examinareRepository.getAll();
     }
}

