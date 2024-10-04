/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author Moises Molina
 */
public class ProductosEnvasados extends Articulos {

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
