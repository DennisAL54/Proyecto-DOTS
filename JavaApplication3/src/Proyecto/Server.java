/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleji
 */
public class Server {
    private boolean turno;
    
    public void mainConversor(){
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
        System.out.println(Botones);
    }
}
