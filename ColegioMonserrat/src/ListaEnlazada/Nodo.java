/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlazada;

/**
 *
 * @author Personal
 */
public class Nodo <T> {
    
    private T dato;
    private Nodo nodoSig;
    
    
    public Nodo(T dato){
        this.dato=dato;
        this.nodoSig=null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getNodoSig() {
        return nodoSig;
    }

    public void setNodoSig(Nodo nodoSig) {
        this.nodoSig = nodoSig;
    }
    
    public void enlazarSiguiente(Nodo n){
        nodoSig=n;
    }
}
