/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;

public class GestionadorArchivos<T> {
     private Archivos<T> archivo;
    // crear un archivo para guardar 
    //verificar si existe existe el archivo o no existe el archivo
    //Abrir el archivo que existe 
    public String CrearArchivo(String nombreArchivo , T obj ){
        archivo=new Archivos(nombreArchivo);
        try{
            archivo.PRIMERsalida();
            archivo.Poner(obj);
            archivo.Marcar();
        }catch(IOException ex){
            Logger.getLogger(GestionadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
               return "Error al escribir en el archivo de alumnos ";
        }
         return "Se adiciono con exito";
        
        
    }
    public String AdicionarElementoAlArchivo(String nombreArchivo , T obj){
        archivo= new Archivos(nombreArchivo);
        try {
            archivo.PRIMERadicionar();  // Utiliza el método para añadir al archivo
            archivo.Poner(obj);         // Método para añadir el objeto (alumno) al archivo
            archivo.Marcar();           // Método para cerrar el archivo después de escribir
        } catch (IOException ex) {
            Logger.getLogger(GestionadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
            return "Error al escribir en el archivo";
        }
        return "Elemento añadido con éxito";
    }
    
    public boolean VerificarExistenciaArchivo(String nombreArchivo){
        File arch=new File(nombreArchivo);
        return arch.exists();
        
    }
    
    
    
    
}
    
    
    

