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
import componentes.Articulos; 

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // clase que tiene todas las validaciones y opciones de menú
        ComponentesMenu menu_opciones = new ComponentesMenu();
        AgregarProductos agregar_productos = new AgregarProductos();

        // Lista genérica para almacenar los productos
        ArrayList<Articulos> productos = new ArrayList<>();

        int id_articulo = 1;
        int respuesta_menu;

        boolean seguir_agregando = true;
        do {
            respuesta_menu = menu_opciones.mostrar_menu_add(entrada);

            // opción de registrar producto
            if (respuesta_menu == 1) {

                int tipo_producto = menu_opciones.tipos_producto(entrada);

                switch (tipo_producto) {
                    case 1: // productos frescos
                        var respuesta_producto_fresco = agregar_productos.agregar_producto_fresco(entrada, id_articulo);
                        productos.add(respuesta_producto_fresco);
                        id_articulo++;
                        break;
                    case 2: // productos refrigerados
                        var respuesta_producto_refrigerado = agregar_productos.agregar_producto_refrigerado(entrada, id_articulo);
                        productos.add(respuesta_producto_refrigerado);
                        id_articulo++;
                        break;
                    case 3: // productos congelados
                        var respuesta_producto_congelado = agregar_productos.agregar_producto_congelado(entrada, id_articulo);
                        productos.add(respuesta_producto_congelado);
                        id_articulo++;
                        break;
                    case 4: // productos envasados
                        var respuesta_producto_envasado = agregar_productos.agregar_producto_envasados(entrada, id_articulo);
                        productos.add(respuesta_producto_envasado);
                        id_articulo++;
                        break;
                    default:
                        System.out.println("Opción no válida.");
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
         * MENÚ DE OPCIONES PARA VER EL LISTADO AGREGADO
         */
        boolean seguir_visualizando = true;
        do {
            respuesta_menu = menu_opciones.mostrar_menu_view(entrada);

            if (respuesta_menu == 1) {
                int respuesta_seleccion = menu_opciones.tipos_visualizaciones_categorias(entrada);
                switch (respuesta_seleccion) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        productos.forEach(Articulos::mostrar_informacion);
                        break;
                    default:
                        System.out.println("No se encontró la selección.");
                }

                System.out.println("¿Necesitas visualizar otra categoría? \n 1. Seguir \n 2. Salir");
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

