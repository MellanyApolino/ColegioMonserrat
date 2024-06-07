/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Archivos.GestionadorArchivos;
public class Gestionador {

    public Gestionador() {
    }
    
    
    public String AñadirAlumno(Alumno alumno, String nomArchivo){
        String mensaje ;
        GestionadorArchivos<Alumno> archivo = new GestionadorArchivos<>();
        if(archivo.VerificarExistenciaArchivo(nomArchivo)){
            mensaje = archivo.AdicionarElementoAlArchivo(nomArchivo, alumno);
        }else{
            mensaje=archivo.CrearArchivo(nomArchivo, alumno);
        }
        return mensaje;
    }
    
    
    
    
    
}
