package Logica;
public class Docente extends Persona {    
    //asignatura =  curso que enseña 
    private String Asignatura;
    public Docente(String Profesion,String Codigo, String identificacion, String nombre,String apellido,String DNI, String sexo) {
        super(Codigo, nombre,apellido,DNI,sexo);
        this.Asignatura = Profesion;
    }
     public Docente(){
        super(null, null, null,null,null);
        this.Asignatura= null;
    }
    
    public String getAsignatura() {
        return Asignatura;
    }
    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }
    @Override
    public String toString() {
        return this.getNombre() + " " + this.getAsignatura();
    }       
      
}