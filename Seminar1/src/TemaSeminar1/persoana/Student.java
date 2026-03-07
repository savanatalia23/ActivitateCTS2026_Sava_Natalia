package TemaSeminar1.persoana;

public class Student extends Persoana {
    private String idStudent;
    private String name;

    public Student(String idStudent, String name) {
        this.idStudent = idStudent;
        this.name = name;
    }

    public String getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("idStudent='").append(idStudent).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
