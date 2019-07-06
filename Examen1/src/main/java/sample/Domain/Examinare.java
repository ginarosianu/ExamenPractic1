package sample.Domain;

public class Examinare extends Entity {
    private int idPersExam;
    private String rezultat;
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Examinare(int id, int data) {
        super( id );
        this.data = data;
    }

    public Examinare(int id, int idPersExam, String rezultat) {
        super( id );
        this.idPersExam = idPersExam;
        this.rezultat = rezultat;
    }

    public int getIdPersExam() {
        return idPersExam;
    }

    public void setIdPersExam(int idPersExam) {
        this.idPersExam = idPersExam;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }
}
