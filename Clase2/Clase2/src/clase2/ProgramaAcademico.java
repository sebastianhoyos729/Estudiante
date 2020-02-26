/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;


public class ProgramaAcademico {
    //Atributos
    private String id;
    private String nombre;
    private int numeroCreditos;
    private int numeroSemestres;
    private int costo;

    public ProgramaAcademico() {
        this.numeroSemestres = 0;
        this.numeroCreditos = 0;
    }

    public ProgramaAcademico(String id, String nombre, int numeroCreditos, int numeroSemestres, int costo) {
        this.id = id;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroSemestres = numeroSemestres;
        this.costo = costo;
    }

    public String getId() {
        return id;
    }

    public int getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public int getNumeroSemestres() {
        return numeroSemestres;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public void setNumeroSemestres(int numeroSemestres) {
        this.numeroSemestres = numeroSemestres;
    }
 
}
