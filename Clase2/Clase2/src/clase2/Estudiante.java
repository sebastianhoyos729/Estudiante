/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

public class Estudiante {
    //Atributos
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private ProgramaAcademico programaAcademico = new ProgramaAcademico();
    private boolean esBecado ;
    
    // Constructor
    public Estudiante(){
        this.esBecado = false;
    }

    public Estudiante(String id, String nombre, String apellido, String correo, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.esBecado = false;
    }
    
    public Estudiante(Estudiante e){
        this.nombre = e.nombre;
        this.apellido = e.apellido;
        this.correo = e.correo;
        this.direccion = e.direccion;
    }
    
    // Metodos
    public String getId(){
        return this.id;
    }
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEsBecado(boolean esBecado) {
        this.esBecado = esBecado;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public boolean isEsBecado() {
        return esBecado;
    }
    public void agregarProgramaAcademico(ProgramaAcademico pa){
        this.programaAcademico = pa;
        
        
        System.out.println(this.programaAcademico.getNombre() + " " + this.programaAcademico.getId());
        /*
        this.programaAcademico.setNombre(pa.getNombre());
        this.programaAcademico.setId(pa.getId());*/
    }
    
    @Override
    public String toString() {
        return "El estudiante "+ this.getNombre() + " "+ this.getApellido() + " es becado : "+ this.isEsBecado()+" "+this.programaAcademico.getNombre();
    }
    public String toString(String s){
        return  "El estudiante "+ this.getNombre() + " "+ this.getApellido() + " es becado : "+ this.isEsBecado() + s;
    }
    
    public void imprimir(){
        System.out.println("El estudiante "+ this.getNombre() + " "+ this.getApellido() + " es becado : "+ this.isEsBecado());
    }  
   
}
