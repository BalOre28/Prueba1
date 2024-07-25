/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

/**
 *
 * @author Balto
 */
public class RentItem {
    public int codigo;
    public String nombre;
    public double preciorenta;

    public RentItem(int codigo, String nombre, double renta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.preciorenta = renta;
    }
    
    public double PagoRenta(int dias){
        return 0;
    }
    
    
    @Override
    public String toString(){
        return "Codigo: " +codigo+ "Nombre: " +nombre+ "Precio: " +preciorenta;
    }
    
}
