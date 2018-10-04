/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.net.*;
import com.google.gson.Gson; // Import de GSON
import java.io.IOException; // Import para las IO exception
import java.util.ArrayList; // Import para los Arrays
import java.util.List; // Import para las listas
import java.net.Socket; // Import para los Sockets
import java.net.ServerSocket; //Import para el server
import java.io.ObjectInputStream; //Import para los input y output streams
import java.io.ObjectOutputStream;
import static java.util.Collections.list;
import java.util.logging.Level; // Import para los loggin
import java.util.logging.Logger;


/**
 *
 * @author aleji
 */
public class Server { // Class para el server
    private boolean turno; // Manejo del turno
    private String dataentrante; // Datos entrantes
    private List<List> Jugadas;

    /**
     *
     * @return
     */
    public boolean getTurno() { // Getters
        return turno;
    }
    public void AsigTurno(){ // Boolean para el turno
        if (getTurno() == false) {
            
        }
    }

    /**
     *
     */
    /*public void mainSerializador(){ // Serializador principal
        List<List> Botones; // Variable de tipo lista
        List<Integer> Fila1;//Variables para las filas
        List<Integer> Fila2;
        List<Integer> Fila3;
        Botones = new ArrayList<>(); // Declaracion de Lista de listas
        Fila1 = new ArrayList<>();// Declaracion de las filas
        Fila2 = new ArrayList<>();
        Fila3 = new ArrayList<>();
        Fila1.add(1); //Adicion de botones a las listas (filas)
        Fila1.add(2);
        Fila1.add(3);
        Fila2.add(4);
        Fila2.add(5);
        Fila2.add(6);
        Fila3.add(7);
        Fila3.add(8);
        Fila3.add(9);
        Botones.add(Fila1);// Adicion de las filas a la lista de lista
        Botones.add(Fila2);
        Botones.add(Fila3);
        Gson gson = new Gson();
        String jsonData = gson.toJson(Botones);// Se serializa el boton
    }

    /**
     *
     */
    public void Socket(){ // Metodo del socket
        List<Integer> JugadasR;
        JugadasR = new ArrayList();
        try {
            ServerSocket servidor = new ServerSocket(4500);// Declaracion de nuevo Socket server
            Socket NuevoCliente = servidor.accept();// Declaracion de un cliente
            ObjectInputStream entrada = new ObjectInputStream(NuevoCliente.getInputStream());
            String mensaje = (String)entrada.readObject();
            System.out.println(mensaje);
            //Gson gsonI = new Gson();
           // dataentrante = mensaje;
            //gsonI.fromJson(dataentrante, Server.class);
            //JugadasR = JugadasR += mensaje[0];
            
            NuevoCliente.close();
            servidor.close();
            
        } catch (IOException | ClassNotFoundException ex){
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }

    /**
     *
     */
    /*public void mainDeseralizador(){ //Deserializador de Json
        dataentrante = "{'boton1': 'Alpha'}";
        Gson gsonI = new Gson();
        
        gsonI.fromJson(dataentrante, Server.class);*/
}
