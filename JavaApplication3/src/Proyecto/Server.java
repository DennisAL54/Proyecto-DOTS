/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author aleji
 */
public class Server {
    private boolean turno;
    private String dataentrante;

    public boolean getTurno() {
        return turno;
    }
    public void AsigTurno(){
        if (getTurno() == false) {
            
        }
    }

    public void mainSerializador(){
        List<List> Botones;
        List<Integer> Fila1;
        List<Integer> Fila2;
        List<Integer> Fila3;
        Botones = new ArrayList<>();
        Fila1 = new ArrayList<>();
        Fila2 = new ArrayList<>();
        Fila3 = new ArrayList<>();
        Fila1.add(1);
        Fila1.add(2);
        Fila1.add(3);
        Fila2.add(4);
        Fila2.add(5);
        Fila2.add(6);
        Fila3.add(7);
        Fila3.add(8);
        Fila3.add(9);
        Botones.add(Fila1);
        Botones.add(Fila2);
        Botones.add(Fila3);
        Gson gson = new Gson();
        String jsonData = gson.toJson(Botones);
    }
    public void Socket(){
        try {
            ServerSocket servidor = new ServerSocket(4500);
            Socket NuevoCliente = servidor.accept();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void mainDeseralizador(){
        dataentrante = "{'boton1': 'Alpha'}";
        Gson gsonI = new Gson();
        
        gsonI.fromJson(dataentrante, Server.class);
    }
}
