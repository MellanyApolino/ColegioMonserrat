
package Logica;
import java.io.Serializable;

import java.util.ArrayList;

public class Curso implements Serializable {
    private String codigo;
    private String nombre;
    private ArrayList<Alumno> alumnos;
    private Docente docente;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.alumnos=new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos){
        this.alumnos=alumnos;
    }
    public void asignarDocente(Docente docente){
        this.docente=docente;
    }
    
    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }
    
    
}
