/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.HashSet;

/**
 *
 * @author sebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Student[] arr = new Student[5];
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Carlos");
        estudiante1.setApellido("Castro");
        estudiante1.setId("1245");
        //System.out.println(estudiante1.toString());
        Estudiante est2 = new Estudiante("123","Sebastian","Hoyos","aaa@123","dir1");
        est2.setApellido("Ortiz");
        est2.setEsBecado(true);
        //System.out.println(est2.toString());
        //Estudiante est3 = new Estudiante(est2);
        //System.out.println(est3.toString());
        
        ProgramaAcademico progAcademico = new ProgramaAcademico();
        progAcademico.setId("123");
        progAcademico.setNombre("TecnologiaSW");
        progAcademico.setCosto(2000000);
        progAcademico.setNumeroSemestres(6);
        
        est2.agregarProgramaAcademico(progAcademico);
        System.out.println(est2.toString());
        
        
    }
    
}
