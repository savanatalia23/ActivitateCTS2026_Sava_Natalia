package TemaSeminar1.curs;

import TemaSeminar1.persoana.Profesor;
import TemaSeminar1.persoana.Student;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private Profesor profesor;
    private List<Student> listaStudenti;


    public Curs(String numeCurs, int credite, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.listaStudenti = new ArrayList<>();
    }

    public void adaugaStudent(Student student){
        listaStudenti.add(student);
    }

    public int getCredite() {
        return credite;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curs{");
        sb.append("numeCurs='").append(numeCurs).append('\'');
        sb.append(", credite=").append(credite);
        sb.append(", profesor=").append(profesor);
        sb.append(", listaStudenti=").append(listaStudenti);
        sb.append('}');
        return sb.toString();
    }
}
