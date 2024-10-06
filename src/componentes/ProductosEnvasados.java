/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

public class ProductosEnvasados extends Articulos {
    public ProductosEnvasados() {
        
    }

    public ProductosEnvasados(int id_articulo, String nombre, String categoria, int lote, String fecha_envasado, String fecha_caducidad, boolean refrigerar_despues_abierto) {
        setId_articulo(id_articulo);
        setNombre(nombre);
        setCategoria(categoria);
        setNumero_lote(lote);
        setFecha_envasado(fecha_envasado);
        setFecha_caducidad(fecha_caducidad);
        setRefrigerar_despues_abierto(refrigerar_despues_abierto);
    }


    @Override
    public void mostrar_informacion() {
        System.out.println("ID ARTICULO: " + getId_articulo()
                + " NOMBRE: " + getNombre()
                + " CATEGORIA: " + getCategoria()
                + " LOTE: " + getNumero_lote()
                + " FECHA ENVASADO: " + getFecha_envasado()
                 + " FECHA CADUCIDAD : " + getFecha_caducidad()
                + " REFRIGERAR LUEGO DE ABRIR : " + isRefrigerar_despues_abierto());
    }

}
