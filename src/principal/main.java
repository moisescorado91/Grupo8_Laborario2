/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;
import componentes.ProductosFrescos;
import componentes.ComponentesMenu;
import componentes.AgregarProductos;
import componentes.ProductosEnvasados;
import componentes.ProductosCongelados;
import componentes.ProductosRefrigerados;

/**
 *
 * @author Moises Molina
 */
public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //clase que tiene todas las validaciones y opciones de menu
        ComponentesMenu menu_opciones = new ComponentesMenu();
        AgregarProductos agregar_productos = new AgregarProductos();

        // listas para almacenar las instancias
        ArrayList<ProductosRefrigerados> productos_refrigerados = new ArrayList<>();
        ArrayList<ProductosCongelados> productos_congelados = new ArrayList<>();
        ArrayList<ProductosEnvasados> productos_envasados = new ArrayList<>();
        ArrayList<ProductosFrescos> productos_frescos = new ArrayList<>();

        int id_articulo = 1;
        int respuesta_menu;

        boolean seguir_agregando = true;
        do {
            respuesta_menu = menu_opciones.mostrar_menu_add(entrada);

            // opcion de registrar producto
            if (respuesta_menu == 1) {

                int tipo_producto = menu_opciones.tipos_producto(entrada);

                switch (tipo_producto) {
                    case 1: //productos frescos
                        var respuesta_producto_fresco = agregar_productos.agregar_producto_fresco(entrada, id_articulo);
                        productos_frescos.add(respuesta_producto_fresco);
                        id_articulo++;
                        break;
                    case 2: //productos refrigerados
                        var respuesta_producto_refrigerado = agregar_productos.agregar_producto_refrigerado(entrada, id_articulo);
                        productos_refrigerados.add(respuesta_producto_refrigerado);
                        id_articulo++;
                        break;
                    case 3: //productos congelados
                        var respuesta_producto_congelados = agregar_productos.agregar_producto_congelados(entrada, id_articulo);
                        productos_congelados.add(respuesta_producto_congelados);
                        id_articulo++;
                        break;
                    case 4: // productos envasados
                        var respuesta_producto_envasados = agregar_productos.agregar_producto_envasados(entrada, id_articulo);
                        productos_envasados.add(respuesta_producto_envasados);
                        id_articulo++;
                        break;
                    default:
                        System.out.println("No se encontro seleccion");
                }

                System.out.println("¿Necesitas seguir agregando? \n 1. Seguir \n 2. Salir");
                int salir = entrada.nextInt();
                if (salir == 2) {
                    seguir_agregando = false;
                }

            } else {
                seguir_agregando = false;
            }
        } while (seguir_agregando);

        /*
        *   MENU DE OPCIONES PARA VER EL LISTADO AGREGADO
         */
        boolean seguir_visualizando = true;
        do {
            respuesta_menu = menu_opciones.mostrar_menu_view(entrada);
            
            
            if (respuesta_menu == 1) {
                int respuesta_seleccion = menu_opciones.tipos_visualizaciones_categorias(entrada);
                switch (respuesta_seleccion) {
                    case 1:
                        productos_frescos.forEach(ProductosFrescos::mostrar_informacion);
                        break;
                    case 2:
                        productos_refrigerados.forEach(ProductosRefrigerados::mostrar_informacion);
                        break;
                    case 3:
                        productos_congelados.forEach(ProductosCongelados::mostrar_informacion);
                        break;
                    case 4:
                        productos_envasados.forEach(ProductosEnvasados::mostrar_informacion);
                        break;
                    default:
                        System.out.println("No se encontro seleccion");
                }

                System.out.println("¿Necesitas visualizar otra categoria? \n 1. Seguir \n 2. Salir");
                int salir = entrada.nextInt();
                if (salir == 2) {
                    seguir_visualizando = false;
                }
            } else {
                seguir_visualizando = false;
            }
        } while (seguir_visualizando);

        entrada.close();
        System.out.println("Sistema Cerrado");
    }
}
