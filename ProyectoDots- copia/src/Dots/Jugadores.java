/**
 * Implementación de una cola con listas enlazadas
 */
package Dots;

/**
 *
 * @author Bryan
 */
public class Jugadores{
    /**
     * Clase Nodo crea un objeto nodo para trabajar los elementos de la cola
     */
    class Node {
        Object elemento;
        Node Next;
        
    public Node(Object o){
        elemento = o;
        Next = null;
    }}
    
    Node primero; // Primera posición en la cola
    Node ultimo; // Ultimo elemento en la cola
    int tamaño; // Tamaño de la cola
    /**
     * Clase Jugadores, crea la cola donde se almacenan los jugadores
     */
    public Jugadores(){
        ultimo = null; // No hay primer elemento al estar vacía
        tamaño = 0; // Tamaño de inicio 
    }
    /**
     * Método enqueue, ingresa los elementos a la cola
     * @param o, elemento que entra se encola 
     */
    public void enqueue(Object o){
        Node new_node = new Node(o); // Se crea un nuevo nodo para ingresar a la lista
        if (primero == null){ // Si no hay un primer elemento
            primero = new_node; // Se define la entrada como el primer elemento de la cola 
            ultimo = new_node; // Se define la entrada como el último elemento de la cola
        }else {
            ultimo.Next = new_node; // El primer elemento de la lista pasa a ser el segundo
            ultimo = new_node; // El nuevo elemento que se inserta pasa a ser el primero de la cola
        }tamaño++; // Se aumenta en uno el tamaño de la lista 
    }; 
    /**
     * Método dequeue, elimina el primer elemento de la cola
     * @return primer elemento de la cola 
     */
    public Object dequeue(){
        if (primero == null) // Verifica que la lista esté vacía
            return null;
        ;
        Object o = primero.elemento; // Saca el primen elemento de la cola
        primero = primero.Next; // El siguiente elemento pasa a ser el primero de la cola
        tamaño--; // Se reduce en uno el tamaño de la lista
        return o;
    }
    /**
     * Método is Empty, vacía la cola 
     * @return tamaño de la cola cero
     */
    public boolean isEmpty(){
        return (tamaño == 0);
    }
    /**
     * Método tamaño
     * @return tamaño de la lista
     */
    public int tamaño(){
        return tamaño;
    }
    /**
     * Método primero, verifica cual es el primer elemento de la cola
     * @return el primer elemento de la cola
     */
    public Object primero(){
        if (primero == null){ // Verifica que la lista no esté vacía 
            return null;
        }else{
            return primero.elemento;}
    }
    public Object segundo(){
        if (primero.Next == null){ // Verifica que la lista no esté vacía 
            return null;
        }else{
            return primero.Next;}
    }
}