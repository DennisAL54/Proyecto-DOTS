/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

/**
 *
 * @author roy
 */
public class socket implements Runnable{
    
    
    //Variables
    ServerSocket server = null;
    Socket socket;
    int puerto = 9000;
    Thread running = null;
    boolean parado = false;
    
    //Establece el puerto
   public socket (int puerto){
        this.puerto = puerto;
    }
       
   public void run(){
       synchronized(this){
       this.running = Thread.currentThread();
   }
    
       
       
   }   

    
    
}
