package Dots;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 * 
 * @author Bryan
 */
public class Punto {
    private Image image; 
    private int x, y; // cordenadas de cada punto
    private boolean visible;
    /**
     * Constructor de la clase Punto
     * @param x coordenada en x del punto
     * @param y coordenada en y del punto
     */
    public Punto(int x, int y){
        ImageIcon ii = new ImageIcon(this.getClass().getResource("images/punto2.png")); // Determinar la imagen
        image = ii.getImage();
        this.x = x;
        this.y = y;
        visible = true; 
    } 
    /**
     * Posición en x
     * @return la posición x del punto
     */
    public int getX(){
        return x;
    }
    /**
     * Posicion en y
     * @return la posición y del punto
     */
    public int getY(){
        return y;
    }
    /**
     * Determinar valor de x
     * @param x: Valor entero para x
     */
    public void setX(int x){
        this.x = x;
    }
    /**
     * Determinar valor de y
     * @param y: Valor entero para y
     */
    public void setY(int y){
        this.y = y;
    }
    /**
     * Imagen del punto
     * @return Imagen seleccionada
     */
    public Image getImage(){
        return image;
    }
    /**
     * Permite ver el punto
     * @param visible: valor booleano para visible
     */
    public void setVisible(boolean visible){
        this.visible = visible;
    }
    /**
     * Permite que la imagen sea visible
     * @return valor que contiene visible
     */
    public boolean isVisible(){
        return visible;
    } 
    /**
     * Dimisiones del punto
     * @return Nueva sección con las dimensiones dadas
     */
    public Rectangle getBounds(){
        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    }

}
