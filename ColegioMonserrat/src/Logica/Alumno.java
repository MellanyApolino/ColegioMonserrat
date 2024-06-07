package Logica;

import java.io.Serializable;



public class Alumno extends Persona implements Serializable {
    private int Grado;
   
     public Alumno(String codigo, String nombre, String apellido, String DNI, String sexo, int grado) {
        super(codigo, nombre, apellido, DNI, sexo);
        this.Grado=grado;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format( "%d", Grado);
    }
    //solo se crea para ael nivel secundaria
    public String CrearNombreDelArchivo(String Grado){
        String nombreArchivo;
        nombreArchivo="ArchivoAlumno"+Grado+"secundaria.txt";
        return nombreArchivo;
    }
}