package sample.Service;

import sample.Domain.Examinator;
import sample.Repository.IRepository;

import java.util.List;

public class ExaminatorService {
    private IRepository<Examinator> repository;
    //private Stack<UndoRedoOperation<Persoana>> undoableOperations = new Stack<>();
    //private Stack<UndoRedoOperation<Persoana>> redoableOperations = new Stack<>();

    /**
     * Constructs a service.
     *
     * @param repository the backing repository.
     */
    public ExaminatorService(IRepository<Examinator> repository) {
        this.repository = repository;
    }


    /**
     * Adds an car with the given fields.
     *
     * @param id    - unic
     * @param nume - the base km
     * @param CNP    - the rental price / day
     */
    public void add(int id, String nume, String CNP) {

        Examinator persoana = new Examinator(id, nume, CNP);
        repository.upsert(persoana);
        //undoableOperations.add(new AddOperation<>(repository, persoana));
        //  redoableOperations.clear();
    }

//

    /**
     * Gets a list of all cars.
     *
     * @return a list of all cars.
     */
    public List<Examinator> getAll() {
        return repository.getAll();
    }



  /*  public void undo() {
        if (!undoableOperations.empty()) {
            UndoRedoOperation<Persoana> lastOperation = undoableOperations.pop();
            lastOperation.doUndo();
            redoableOperations.add(lastOperation);
        }
    }

    public void redo() {
        if (!redoableOperations.empty()) {
            UndoRedoOperation<Persoana> lastOperation = redoableOperations.pop();
            lastOperation.doRedo();
            undoableOperations.add(lastOperation);
        }*/
}


