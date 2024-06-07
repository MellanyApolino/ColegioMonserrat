
package ListaEnlazada;


public class Lista<T> {
    private Nodo<T> primero;
    private int tamaño;
    public Lista(){
        this.primero=null;
        this.tamaño=0;
    }
    public Nodo<T> getPrimero(){
        return primero;
    }
    public void setPrimero(Nodo<T> primero){
        this.primero=primero;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void add(T dato){
        Nodo<T> nuevo = new Nodo(dato);
        if( primero ==null){
            this.primero=nuevo;
            tamaño++;
        }else{
            Nodo<T> aux = primero;
            while(aux.getNodoSig()!= null){
                aux=aux.getNodoSig();
            }
            aux.setNodoSig(nuevo);
            tamaño++;
        }        
    }
    public T obtener( int index){
        int contador=0;
        Nodo<T> temporal = primero;
        while(contador<index){
            temporal =temporal.getNodoSig();
            contador++;
        }
        return temporal.getDato();
    }
    public void eliminar(int index){
        if(index==0){
            primero=primero.getNodoSig();
        }else{
            int contador=0;
            Nodo<T> temporal =primero;
            while(contador<index-1){
                temporal =temporal.getNodoSig();
                contador++;
            }
            temporal.enlazarSiguiente(temporal.getNodoSig().getNodoSig());
        }
        tamaño --;
    }
    
    // Podemos adicionar mas metodos para que me guarden en el archivos 
    
}
