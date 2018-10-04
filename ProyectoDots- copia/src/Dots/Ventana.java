package Dots;

import com.google.gson.Gson;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Bryan
 */
public class Ventana extends JComponent{
    
    private Punto puntos[][]; // Lista de listas que crea la malla
    // Posición de los puntos dentro de la lista de lista
    private final int PuntoColum, PuntoFila, Punto_inicioX, Punto_inicioY, Punto_Relleno;
    private Font font; // Fuente de la letra
    private String msg1, msg2; // mensaje en pantalla
    static int Marcador1 , Marcador2; // Marcador del jugador
    private int fin; // Cantidad de putos de la malla
    // Botones que hacen el papel de conectores entre líneas
    private JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,boton11,boton12,boton13,
             boton14,boton15,boton16,boton17,boton18,boton19,boton20,boton21,boton22,boton23,boton24;
    public boolean drawB1, drawB2, drawB3, drawB4, drawB5, drawB6, drawB7, drawB8, drawB9 = false;
    public boolean finJuego = false;
    
    public void ListaEnvio(){ // Controlador de entradas (Se encarga de comunicar al servidor sobre los movimientos realizados)
        boolean JugadaH;
        JugadaH = false;
        List<List> Datos;
        Datos = new ArrayList();
        List<Boolean> Turno;
        Turno = new ArrayList(); //Variable que almacena el dato turno turno
        List<Integer> Jugada;
        Jugada = new ArrayList();//Variable que almacena el dato Jugada
        boolean boton1yajugado; // Variables booleanas encargadas de revisar si un boton ya se jugo
        boolean boton2yajugado;
        boolean boton3yajugado;
        boolean boton4yajugado;
        boolean boton5yajugado;
        boolean boton6yajugado;
        boolean boton7yajugado;
        boolean boton8yajugado;
        boolean boton9yajugado;
        boolean boton10yajugado;
        boolean boton11yajugado;
        boolean boton12yajugado;
        boolean boton13yajugado;
        boolean boton14yajugado;
        boolean boton15yajugado;
        boolean boton16yajugado;
        boolean boton17yajugado;
        boolean boton18yajugado;
        boolean boton19yajugado;
        boolean boton20yajugado;
        boolean boton21yajugado;
        boolean boton22yajugado;
        boolean boton23yajugado;
        boolean boton24yajugado;
        boton1yajugado = false;
        boton2yajugado = false;
        boton3yajugado = false;
        boton4yajugado = false;
        boton5yajugado = false;
        boton6yajugado = false;
        boton7yajugado = false;
        boton8yajugado = false;
        boton9yajugado = false;
        boton10yajugado = false;
        boton11yajugado = false;
        boton12yajugado = false;
        boton13yajugado = false;
        boton14yajugado = false;
        boton15yajugado = false;
        boton16yajugado = false;
        boton17yajugado = false;
        boton18yajugado = false;
        boton19yajugado = false;
        boton20yajugado = false;
        boton21yajugado = false;
        boton22yajugado = false;
        boton23yajugado = false;
        boton24yajugado = false;
        if (boton1.isEnabled() == false){ //Condicionales a la espera de un movimiento
            boton1yajugado = true;
            Jugada.add(1);
            Turno.add(true);
            JugadaH = true;
            
        }
        if (boton2.isEnabled() == false){
            boton2yajugado = true;
            Jugada.add(2);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton3.isEnabled() == false){
            boton3yajugado = true;
            Jugada.add(3);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton4.isEnabled() == false){
            boton4yajugado = true;
            Jugada.add(4);
            Turno.add(true);
        }
        if (boton5.isEnabled() == false){
            boton5yajugado = true;
            Jugada.add(5);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton6.isEnabled() == false){
            boton6yajugado = true;
            Jugada.add(6);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton7.isEnabled() == false){
            boton7yajugado = true;
            Jugada.add(7);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton8.isEnabled() == false){
            boton8yajugado = true;
            Jugada.add(8);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton9.isEnabled() == false){
            boton9yajugado = true;
            Jugada.add(9);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton10.isEnabled() == false){
            boton10yajugado = true;
            Jugada.add(10);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton11.isEnabled() == false){
            boton11yajugado = true;
            Jugada.add(11);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton12.isEnabled() == false){
            boton12yajugado = true;
            Jugada.add(12);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton13.isEnabled() == false){
            boton13yajugado = true;
            Jugada.add(13);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton14.isEnabled() == false){
            boton14yajugado = true;
            Jugada.add(14);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton15.isEnabled() == false){
            boton15yajugado = true;
            Jugada.add(15);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton16.isEnabled() == false){
            boton16yajugado = true;
            Jugada.add(16);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton17.isEnabled() == false){
            boton17yajugado = true;
            Jugada.add(17);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton18.isEnabled() == false){
            boton18yajugado = true;
            Jugada.add(18);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton19.isEnabled() == false){
            boton19yajugado = true;
            Jugada.add(19);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton20.isEnabled() == false){
            boton20yajugado = true;
            Jugada.add(20);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton21.isEnabled() == false){
            boton21yajugado = true;
            Jugada.add(21);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton22.isEnabled() == false){
            boton22yajugado = true;
            Jugada.add(22);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton23.isEnabled() == false){
            boton23yajugado = true;
            Jugada.add(23);
            Turno.add(true);
            JugadaH = true;
        }
        if (boton24.isEnabled() == false){
            boton24yajugado = true;
            Jugada.add(24);
            Turno.add(true);
            JugadaH = true;
        }
        if(JugadaH == true){
        Datos.add(Jugada); // Se Añaden ambas variables de tipo lista a una lista mayor.
        Datos.add(Turno);
        try {
            Socket Cliente = new Socket("localhost", 4500); // Declaracion del socket cliente
            ObjectOutputStream mensaje = new ObjectOutputStream(Cliente.getOutputStream());// Envio de mensaje
            Gson gsonBot = new Gson(); // declaracion de variable Conversora a json
            String jsonData = gsonBot.toJson(Datos);// Conversion a Json
            mensaje.writeObject(jsonData);
            Cliente.close();
            
            System.out.println(jsonData);
            JugadaH = false;
            //mensaje.writeObject("jsonData"); // Envio del mensaje en formato json
            
            
        } catch (IOException ex) {// Excepcion (Parecido al del server)
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
        
    }
    /**
     * Constructor de las clase ventana donde se crea la malla
     */
    public Ventana(){ 
        super();
        // características de la letras del mensaje(msg)
        setDoubleBuffered(true);
        setBackground(Color.white);
        setFocusable(true);
        
        // malla de puntos 
        PuntoColum = 4; // Cantidad de columnas de la malla
        PuntoFila = 4; // Cantidad de filas de la malla
        Punto_inicioX = 30; // punto de inicio en X de la ventana
        Punto_inicioY = 40; // punto de inicio en  Y de la ventana
        Punto_Relleno = 2; // area del punto
        fin = PuntoColum * PuntoFila;
        puntos = new Punto[PuntoColum][PuntoFila]; // Declaración de las dimensiones de la malla
        // Colocación de cada punto según las coordenadas i, j
        for(int i = 0; i < PuntoColum; i++)
            for(int j = 0; j < PuntoFila; j++){
                puntos[i][j] = new Punto(Punto_inicioX, Punto_inicioY);
                puntos[i][j].setX(Punto_inicioX + i*puntos[i][j].getImage().getWidth(null) + i*Punto_Relleno);
                puntos[i][j].setY(Punto_inicioY + j*puntos[i][j].getImage().getHeight(null) + j*Punto_Relleno);
            }
             
        boton1 = new JButton(); // Creación de un botón
        boton1.setBounds(69, 65, 45, 10); // posicion x, posicion y, ancho, largo
        this.add(boton1); // añade el botón en la ventana
        boton1.setBackground(Color.WHITE); // Color del botón
        // Acciones que realiza el botón a ser utilizado
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton1.setEnabled(false); // desactiva el botón
                boton1.setBackground(Color.GREEN); // color del botón
                comprobarCuadros();}}); // llamada al metodo: comprobarCuadros()
 
        boton2 = new JButton();
        boton2.setBounds(130, 65, 45, 10);
        this.add(boton2);
        boton2.setEnabled(true);
        boton2.setBackground(Color.WHITE);
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton2.setEnabled(false);
                boton2.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton3 = new JButton();
        boton3.setBounds(192, 65, 45, 10);
        this.add(boton3);
        boton3.setBackground(Color.WHITE);
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton3.setEnabled(false);
                boton3.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton4 = new JButton();
        boton4.setBounds(55, 79, 10, 45);
        this.add(boton4);
        boton4.setBackground(Color.WHITE);
        boton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton4.setEnabled(false);
                boton4.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton5 = new JButton();
        boton5.setBounds(117, 79, 10, 45);
        this.add(boton5);
        boton5.setBackground(Color.WHITE);
        boton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton5.setEnabled(false);
                boton5.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton6 = new JButton();
        boton6.setBounds(179, 79, 10, 45);
        this.add(boton6);
        boton6.setBackground(Color.WHITE);
        boton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton6.setEnabled(false);
                boton6.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton7 = new JButton();
        boton7.setBounds(241, 79, 10, 45);
        this.add(boton7);
        boton7.setBackground(Color.WHITE);
        boton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton7.setEnabled(false);
                boton7.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton8 = new JButton();
        boton8.setBounds(68, 127, 45, 10);
        this.add(boton8);
        boton8.setBackground(Color.WHITE);
        boton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton8.setEnabled(false);
                boton8.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton9 = new JButton();
        boton9.setBounds(130, 127, 45, 10);
        this.add(boton9);
        boton9.setBackground(Color.WHITE);
        boton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton9.setEnabled(false);
                boton9.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton10 = new JButton();
        boton10.setBounds(192, 127, 45, 10);
        this.add(boton10);
        boton10.setBackground(Color.WHITE);
        boton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton10.setEnabled(false);
                boton10.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton11 = new JButton();
        boton11.setBounds(55, 141, 10, 45);
        this.add(boton11);
        boton11.setBackground(Color.WHITE);
        boton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton11.setEnabled(false);
                boton11.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton12 = new JButton();
        boton12.setBounds(117, 141, 10, 45);
        this.add(boton12);
        boton12.setBackground(Color.WHITE);
        boton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton12.setEnabled(false);
                boton12.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton13 = new JButton();
        boton13.setBounds(179, 141, 10, 45);
        this.add(boton13);
        boton13.setBackground(Color.WHITE);
        boton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton13.setEnabled(false);
                boton13.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton14 = new JButton();
        boton14.setBounds(241, 141, 10, 45);
        this.add(boton14);
        boton14.setBackground(Color.WHITE);
        boton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton14.setEnabled(false);
                boton14.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton15 = new JButton();
        boton15.setBounds(68, 189, 45, 10);
        this.add(boton15);
        boton15.setBackground(Color.WHITE);
        boton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton15.setEnabled(false);
                boton15.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton16 = new JButton();
        boton16.setBounds(130, 189, 45, 10);
        this.add(boton16);
        boton16.setBackground(Color.WHITE);
        boton16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton16.setEnabled(false);
                boton16.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton17 = new JButton();
        boton17.setBounds(192, 189, 45, 10);
        this.add(boton17);
        boton17.setBackground(Color.WHITE);
        boton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton17.setEnabled(false);
                boton17.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton18 = new JButton();
        boton18.setBounds(55, 203, 10, 45);
        this.add(boton18);
        boton18.setBackground(Color.WHITE);
        boton18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton18.setEnabled(false);
                boton18.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton19 = new JButton();
        boton19.setBounds(117, 203, 10, 45);
        this.add(boton19);
        boton19.setBackground(Color.WHITE);
        boton19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton19.setEnabled(false);
                boton19.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton20 = new JButton();
        boton20.setBounds(179, 203, 10, 45);
        this.add(boton20);
        boton20.setBackground(Color.WHITE);
        boton20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton20.setEnabled(false);
                boton20.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton21 = new JButton();
        boton21.setBounds(241, 203, 10, 45);
        this.add(boton21);
        boton21.setBackground(Color.WHITE);
        boton21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton21.setEnabled(false);
                boton21.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton22 = new JButton();
        boton22.setBounds(69, 251, 45, 10);
        this.add(boton22);
        boton22.setBackground(Color.WHITE);
        boton22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton22.setEnabled(false);
                boton22.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton23 = new JButton();
        boton23.setBounds(131, 251, 45, 10);
        this.add(boton23);
        boton23.setBackground(Color.WHITE);
        boton23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton23.setEnabled(false);
                boton23.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        boton24 = new JButton();
        boton24.setBounds(193, 251, 45, 10);
        this.add(boton24);
        boton24.setBackground(Color.WHITE);
        boton24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boton24.setEnabled(false);
                boton24.setBackground(Color.GREEN);
                comprobarCuadros();}});
        
        marcador(Marcador1, Marcador2);
    }
    /**
     * Lleva el control del marcador del jugador1 y jugador2
     * @param Marcador1: Puntuación del jugador1
     * @param Marcador2: Puntuación del jugador2
     */
    public void marcador(int Marcador1, int Marcador2){
        Marcador1 = 0; // Valor inicial del Marcador1
        font = new Font("Ventana", Font.PLAIN, 20); // Características de la letra al mostrarse en pantalla 
        msg1 = "Jugador 1: " + Marcador1; // Mensaje que se va a mostrar en pantalla 
        
        Marcador2 = 0;
        font = new Font("Ventana", Font.PLAIN, 20);
        msg2 = " Jugador 2: " + Marcador2;
        repaint(); // Cambia el marcador al hacer un cambio de puntuación
    }
    /**
     * Método que compraba si se cierra un cuadrado
     */
    public void comprobarCuadros(){
        // Comprueba si todos los espacios han sido utilizados
        if(drawB1==true & drawB2==true & drawB3==true & drawB4==true & drawB5==true & drawB6==true & drawB7==true & drawB8==true & drawB9==true){
            finJuego = true; // Cambia el valor a finJuego
            repaint();
        }else{// Comprueba si se cierra un cuadrado
            if (boton1.isEnabled()==false & boton4.isEnabled()==false & boton5.isEnabled()==false & boton8.isEnabled()==false){
                drawB1 = true;
                repaint();}
            if (boton2.isEnabled()==false & boton5.isEnabled()==false & boton6.isEnabled()==false & boton9.isEnabled()==false){
                drawB2 = true;
                repaint();}
            if (boton3.isEnabled()==false & boton6.isEnabled()==false & boton7.isEnabled()==false & boton10.isEnabled()==false){
                drawB3 = true;
                repaint();}
            if (boton8.isEnabled()==false & boton11.isEnabled()==false & boton12.isEnabled()==false & boton15.isEnabled()==false){
                drawB4 = true;
                repaint();}
            if (boton9.isEnabled()==false & boton12.isEnabled()==false & boton13.isEnabled()==false & boton16.isEnabled()==false){
                drawB5 = true;
                repaint();}
            if (boton10.isEnabled()==false & boton13.isEnabled()==false & boton14.isEnabled()==false & boton17.isEnabled()==false){
                drawB6 = true;
                repaint();}
            if (boton15.isEnabled()==false & boton18.isEnabled()==false & boton19.isEnabled()==false & boton22.isEnabled()==false){
                drawB7 = true;
                repaint();}
            if (boton16.isEnabled()==false & boton19.isEnabled()==false & boton20.isEnabled()==false & boton23.isEnabled()==false){
                drawB8 = true;
                repaint();}
            if (boton17.isEnabled()==false & boton20.isEnabled()==false & boton21.isEnabled()==false & boton24.isEnabled()==false){
                drawB9 = true;
                repaint();}
        }    
    }
    
    /**
     * Método paint, muestra las figuras, letras e imágenes en pantalla
     * @param g 
     */
    public void paint(Graphics g){
        super.paint(g);
        
        // Relleno de los cuadros
        g.setColor(Color.RED); // Color del relleno del cuadro
        g.setFont(new Font( "Tahoma", Font.BOLD, 25 ));
        if (drawB1) // Cuadro B1
            g.fill3DRect(65, 75, 52, 52, true); // Posición y dimensiones de cuadro 
        if (drawB2)
            g.fill3DRect(127, 75, 52, 52, true);
        if (drawB3)
            g.fill3DRect(189, 75, 52, 52, true);
        if (drawB4)
            g.fill3DRect(65, 137, 52, 52, true);
        if (drawB5)
            g.fill3DRect(127, 137, 52, 52, true);
        if (drawB6)
            g.fill3DRect(189, 137, 52, 52, true);
        if (drawB7)
            g.fill3DRect(65, 199, 52, 52, true);
        if (drawB8)
            g.fill3DRect(127, 199, 52, 52, true);
        if (drawB9)
            g.fill3DRect(189, 199, 52, 52, true);
        
        if(finJuego) // Indica el final del juego 
            g.drawString("Fin del Juego", 70, 320); // Mensaje y posición del texto
        comprobarCuadros(); // Vuelve a comprobar los cuadrados 
        Graphics2D g2d = (Graphics2D)g;
           
        // Dibujar la malla en la ventana
        for(int i = 0; i < PuntoColum; i++)
            for(int j = 0; j < PuntoFila; j++){
                if(puntos[i][j].isVisible())
                    g2d.drawImage(puntos[i][j].getImage(), puntos[i][j].getX(), puntos[i][j].getY(), this);
            }
        // Dibujar el texto en la ventana
        g2d.setColor(Color.black); // Color del marcador
        g2d.setFont(font);
        g2d.drawString(msg1, 5, 19); // Posición del Marcador1 en pantalla
        g2d.drawString(msg2, 190, 19); // Posición del Marcador2 en pantalla
        g.dispose(); 
    }   
}
