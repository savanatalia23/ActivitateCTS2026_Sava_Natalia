package TemaSeminar1.persoana;

public class Student extends Persoana {
    private String idStudent;


    public Student(String nume, int varsta, String idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Studentul cu id-ul ");
        sb.append(idStudent).append('\'');
        sb.append(", are numele ").append(super.nume).append('\'');
        return sb.toString();
    }
}

