/*
 * La clase forma es parte comun de todas 
 */
package codigo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Diego Álvarez
 */
public class Forma extends Polygon{
     public Color color= null;
    public boolean relleno = false;
    
    //coordenadas del centro de la forma
    public int x = 0;
    public int y =0;
    
    public Forma (int _posX, int _posY, int _lados, Color _color, boolean _relleno){
         //inicializo el constructor del triangulo correctamente para que guarde el numero de _lados
         super(new int[_lados],new int[_lados],_lados);
         //guardo el centro de la forma
         this.x =_posX;
         this.y=_posY;
      
        color = _color;
        relleno = _relleno;
    }
    
     public void dibujate(Graphics2D g2, int _posY, int _posX, BasicStroke _trazo){
        //redibujas el triangulo (TODO)
        calculaVertices( y - _posY, x - _posX);
        g2.setColor(color);
        if(relleno){
        g2.fill(this);
    }
        else{
            g2.setStroke(_trazo);
            g2.draw(this);
        }
    }
     
     //recalcula la posicion de los vertices en un poligono regular
     public void calculaVertices (int _radio, double _giro){
        for(int i=0; i<npoints; i++){
            this.xpoints[i] = (int) (x + _radio*Math.cos((2*Math.PI * i + _giro)/npoints));
            this.ypoints[i] = (int) (y + _radio*Math.sin((2*Math.PI * i + _giro)/npoints));
        }
    }
}
