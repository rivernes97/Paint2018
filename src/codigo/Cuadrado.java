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
public class Cuadrado extends Forma{
    public Cuadrado (int _posX, int _posY,Color _color, boolean _relleno){
         //inicializo el constructor del cuadrado correctamente para que guarde 4 lados.
         super(_posX,_posY,4, _color,_relleno);
     }
}
