package Dots;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 * 
 * @author Bryan
 */
public class Main extends JFrame {

    /**
     *
     */
    public Main(){
        add(new Ventana()); //Añade la ventana que tiene la malla 
        setTitle("Dots"); // Título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da clic en la X
        Image icon = new ImageIcon(getClass().getResource("images/Icon.png")).getImage();// coloca icono en la ventana
        setIconImage(icon); // colocar icono de la vantana
        setResizable(false); // Cambiar tamaño de la ventana
        setSize(320,400); //tamaño de la ventana
        setLocationRelativeTo(null); // localización de la ventana
        setVisible(true); // muestra la ventana   
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        new Main();
        Ventana v = new Ventana();
        v.ListaEnvio();
    }
    
}