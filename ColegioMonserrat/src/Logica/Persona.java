package Logica;
public class Persona {
    private String Codigo;
    private String nombre;
    private String apellido;
    private String DNI;
    private String sexo;
    

    public Persona(String Codigo, String nombre,String apellido,String DNI, String sexo) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.sexo=sexo;
        
        
    }
    public Persona(String identificacion, String nombre) {
            this.Codigo = identificacion;
            this.nombre = nombre;
            
        }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
     public String toString() {
        return String.format("%s, %s, %s, %s, %s",
                Codigo, nombre, apellido,DNI, sexo);
    }
   
}
