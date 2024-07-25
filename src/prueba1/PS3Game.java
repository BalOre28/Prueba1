/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

import java.util.Calendar;

/**
 *
 * @author Balto
 */
public class PS3Game extends RentItem{
    public Calendar fecha;

    public PS3Game(Calendar fecha, int codigo, String nombre, double renta) {
        super(codigo, nombre, renta);
        this.fecha = fecha;
    }
    
    
    
}
