/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author xp
 */
public class Linea extends Forma{
    public Linea (int _posX, int _posY,Color _color, boolean _relleno){
         //inicializo el constructor de la linea correctamente para que guarde 2 dimensiones.
         super(_posX,_posY,2, _color,_relleno);
     }
}
