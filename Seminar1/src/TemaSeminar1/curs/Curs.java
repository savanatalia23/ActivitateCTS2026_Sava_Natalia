package TemaSeminar1.curs;

import TemaSeminar1.persoana.Profesor;
import TemaSeminar1.persoana.Student;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private Profesor profesor;
    private List<Student> listaStudenti;

    public void adaugaStudent(Student student){
        listaStudenti.add(student);
    }

    public int getCredite() {
        return credite;
    }

    public String getNumeCurs() {
        return numeCurs;
    }
}
