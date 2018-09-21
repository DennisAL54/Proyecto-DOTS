package Dots;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 * 
 * @author Bryan
 */
public class Ventana extends JComponent{
    
    private Punto puntos[][]; // Lista de listas que crea la malla
    // Posición de los puntos dentro de la lista de lista
    private final int PuntoColum, PuntoFila, Punto_inicioX, Punto_inicioY, Punto_Relleno;
    private Font font; // Fuente de la letra
    private String msg; // mensaje en pantalla
    static int Marcador; // Marcador del jugador
    private int fin; // Cantidad de putos de la malla
    // Botones que hacen el papel de conectores entre líneas
    private JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,boton11,boton12,boton13,
             boton14,boton15,boton16,boton17,boton18,boton19,boton20,boton21,boton22,boton23,boton24;
    
    
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
         
        Marcador = 0;
        font = new Font("Ventana", Font.PLAIN, 20);
        msg = "Marcador: " + Marcador;
 
    }
    /**
     * Método que compraba si se cierra un cuadrado
     */
    public void comprobarCuadros(){
            if (boton1.isEnabled()==false & boton4.isEnabled()==false & boton5.isEnabled()==false & boton8.isEnabled()==false){
                System.out.println("B1");}
            if (boton2.isEnabled()==false & boton5.isEnabled()==false & boton6.isEnabled()==false & boton9.isEnabled()==false){
                System.out.println("B2");}
            if (boton3.isEnabled()==false & boton6.isEnabled()==false & boton7.isEnabled()==false & boton10.isEnabled()==false){
                System.out.println("B3");}
            if (boton8.isEnabled()==false & boton11.isEnabled()==false & boton12.isEnabled()==false & boton15.isEnabled()==false){
                System.out.println("B4");}
            if (boton9.isEnabled()==false & boton12.isEnabled()==false & boton13.isEnabled()==false & boton16.isEnabled()==false){
                System.out.println("B5");}
            if (boton10.isEnabled()==false & boton13.isEnabled()==false & boton14.isEnabled()==false & boton17.isEnabled()==false){
                System.out.println("B6");}
            if (boton15.isEnabled()==false & boton18.isEnabled()==false & boton19.isEnabled()==false & boton22.isEnabled()==false){
                System.out.println("B7");}
            if (boton16.isEnabled()==false & boton19.isEnabled()==false & boton20.isEnabled()==false & boton23.isEnabled()==false){
                System.out.println("B8");}
            if (boton17.isEnabled()==false & boton20.isEnabled()==false & boton21.isEnabled()==false & boton24.isEnabled()==false){
                System.out.println("B9");} 
    }
    
    /**
     * Método paint, muestra las figuras, letras e imágenes en pantalla
     * @param g 
     */
    public void paint(Graphics g){
        super.paint(g);
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
        g2d.drawString(msg, 5, 19);
        g.dispose();
        
        // Cuadrados
        
        
    }   
}