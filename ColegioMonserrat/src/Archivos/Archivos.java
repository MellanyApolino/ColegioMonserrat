/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos<T> {
    private String arch;
    
    private FileWriter fw;// escribir en eun archivo 
    private BufferedWriter bw;//envolver fw
    private PrintWriter salArch;//
    
    private FileReader fr;
    private BufferedReader entArch;
    //String arch="Usuario.dat" ;
 
    private String linea;
    
    public Archivos(String arch){
        this.arch=arch;
    }
    //Abrir el archivo 
    public void PRIMERsalida() throws IOException{ 
         fw = new FileWriter (arch);
         bw = new BufferedWriter (fw);
         salArch = new PrintWriter (bw);
    }
    
    public void PRIMERadicionar()throws IOException{
        fw=new FileWriter(arch,true);
        bw = new BufferedWriter (fw);
        salArch = new PrintWriter (bw);
        
    }
    //Escribir en el archivo 
    public void Poner(T obj)throws IOException{
        salArch.println(obj.toString());
    }
    //Cerrar la escrituta
    public String Marcar() throws IOException{   
        salArch.close ();
        return "se cerro archivo "+arch;
    }
    
    
   //Recorrer fila secuencial
    //Abrir lectura
    public void PRIMERentrada(){
        try { 
            fr = new FileReader (arch); 
            entArch = new BufferedReader (fr);
        }catch (FileNotFoundException ex){
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    
    public void CERRARentrada()
    { try { 
        entArch.close(); 
    }catch (IOException ex)
    {Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex); }
    }
    
    
    public String leer() { 
        try { linea = entArch.readLine (); } //Se lee una nueva línea
        catch (IOException ex)
        {Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex); }
        return linea;
    }
    
    
    
    public String Listar(){ 
        linea = null;
        String mensaje ="";
        PRIMERentrada ();
        linea = leer(); // TOMAR
        while (linea != null)
        { mensaje = mensaje + linea + "\n";
        // mensaje = mensaje + "\n"+linea.toString();
        linea = leer(); // TOMAR siguiente
        }
        return mensaje;
    }
    // contar cantidad de lineas en el archivo para que limite el arreglo 
    public int contarLineas(Archivos archivo) {
        archivo.PRIMERentrada();
        int contador = 0;
        try {
            while (archivo.leer() != null) {
                contador++;
            }
        } finally {
            archivo.CERRARentrada();
        }
        return contador;
    }
    
    
    
    
    
}
