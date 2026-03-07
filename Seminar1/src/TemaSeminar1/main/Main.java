package TemaSeminar1.main;

import TemaSeminar1.curs.Curs;
import TemaSeminar1.persoana.Profesor;
import TemaSeminar1.persoana.Student;

public class Main {
    public static void main(String []args){

        Profesor profesor1 = new Profesor("1", "Andreea");
        Curs curs1= new Curs("Curs1", 10, profesor1);

        Student student1 = new Student("1", "Natalia");
        Student student2 = new Student("1", "Maria");

        curs1.adaugaStudent(student1);
        curs1.adaugaStudent(student2);
        System.out.println(curs1);
    }
}
