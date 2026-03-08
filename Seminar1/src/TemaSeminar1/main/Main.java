package TemaSeminar1.main;

import TemaSeminar1.curs.Curs;
import TemaSeminar1.persoana.Asistent;
import TemaSeminar1.persoana.Profesor;
import TemaSeminar1.persoana.Student;

public class Main {
    public static void main(String []args){

        Profesor profesor1 = new Profesor("Andreea", 21, "1");
        Curs curs1= new Curs("Curs1", 10, profesor1);

        Student student1 = new Student("Natalia", 21, "2");
        Student student2 = new Student("Maria", 22, "3");

        curs1.adaugaStudent(student1);
        curs1.adaugaStudent(student2);
        System.out.println(curs1);

        Asistent asistent1 = new Asistent("Alex", 27, "4");
        asistent1.preda();
        profesor1.preda();
    }
}
