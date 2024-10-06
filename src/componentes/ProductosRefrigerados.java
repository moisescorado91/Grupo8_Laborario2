/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

public class ProductosRefrigerados extends Articulos {
    
    public ProductosRefrigerados() {
        
    }
    
    public ProductosRefrigerados(int id_articulo, String nombre, String categoria, int lote, String fecha_envasado, String temperatura, String pais_origen) {
        setId_articulo(id_articulo);
        setNombre(nombre);
        setCategoria(categoria);
        setNumero_lote(lote);
        setFecha_envasado(fecha_envasado);
        setTemperatura_mantenimiento(temperatura);
        setPais_origen(pais_origen);
    }
    
    @Override
    public void mostrar_informacion() {
        System.out.println("ID ARTICULO: " + getId_articulo()
                + " NOMBRE: " + getNombre()
                + " CATEGORIA: " + getCategoria()
                + " LOTE: " + getNumero_lote()
                + " FECHA ENVASADO: " + getFecha_envasado()
                + " TEMPERATURA RECOMENDADA : " + getTemperatura_mantenimiento()
                + " PAIS DE ORIGEN: " + getPais_origen());
    }
}
