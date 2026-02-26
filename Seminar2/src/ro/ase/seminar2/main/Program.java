package ro.ase.seminar2.main;


import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.readers.AngajatiReader;
import ro.ase.seminar2.clase.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			AplicantReader ra = new AngajatiReader();
			listaAplicanti = ra.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
