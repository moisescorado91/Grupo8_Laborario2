/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

public class ProductosFrescos extends Articulos {
    public ProductosFrescos(){
        
    }
    public ProductosFrescos(int id_articulo, String nombre, String categoria, int lote, String fecha_ingreso, String fecha_caducidad){
        setId_articulo(id_articulo);
        setNombre(nombre);
        setCategoria(categoria);
        setNumero_lote(lote);
        setFecha_ingreso(fecha_ingreso);
        setFecha_caducidad(fecha_caducidad);
    }

    @Override
    public void mostrar_informacion() {
        System.out.println("ID ARTICULO: " + getId_articulo()
                + " NOMBRE: " + getNombre()
                + " CATEGORIA: " + getCategoria()
                + " LOTE: " + getNumero_lote()
                + " FECHA INGRESO: " + getFecha_ingreso()
                + " FECHA CADUCIDAD : " + getFecha_caducidad());
    }

}
