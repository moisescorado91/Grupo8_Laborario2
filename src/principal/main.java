/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * *********************************************************************************
                    *          EQUIPO 8
 * *********************************************************************************
 * 
 * INTEGRANTES:
 * 
 * MOISES ISAAC MOLINA CORADO   | MC23152
 * Solis Flores Carlos ManueL   | SF10020
 * Tulio Daniel Benitez López   | BL23018
 * Emerson Alberto Ponce Ángel  | PA23013
 * Roberto José Mena Medrano    | MM22025
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

        /**
         * PRODUCTOS POR DEFECTOS
         */
        ProductosFrescos test1_fresco = new ProductosFrescos(1001, "Manzana", "Frutas", 100102, "2024-10-03", "2024-10-03");
        ProductosFrescos test2_fresco = new ProductosFrescos(1002, "Papa", "Verdura", 100102, "2024-10-03", "2024-10-03");
        productos.add(test1_fresco);
        productos.add(test2_fresco);

        ProductosEnvasados test2_envasado = new ProductosEnvasados(1003, "Sopa de Tomate", "Sopa", 100302, "2024-09-30", "2025-09-30", true);
        ProductosEnvasados test3_envasado = new ProductosEnvasados(1004, "Frijoles Negros", "Frijoles", 100402, "2024-10-01", "2026-10-01", false);
        ProductosEnvasados test4_envasado = new ProductosEnvasados(1005, "Salsa de Tomate", "Salsas", 100502, "2024-08-15", "2025-08-15", true);
        productos.add(test2_envasado);
        productos.add(test3_envasado);
        productos.add(test4_envasado);

        ProductosRefrigerados test1_refrigerado = new ProductosRefrigerados(1006, "Refresco de Cola", "Refrescos", 100103, "2024-09-28", "2°C", "EE. UU.");
        ProductosRefrigerados test2_refrigerado = new ProductosRefrigerados(1007, "Pizza de Pepperoni", "Pizzas", 100203, "2024-10-01", "-18°C", "Italia");
        ProductosRefrigerados test3_refrigerado = new ProductosRefrigerados(1013, "Hamburguesa de Res", "Hamburguesas", 100303, "2024-10-03", "0°C", "EE. UU.");
        productos.add(test1_refrigerado);
        productos.add(test2_refrigerado);
        productos.add(test3_refrigerado);

        ProductosCongelados test1_congelado = new ProductosCongelados(1014, "Helado de Vainilla", "Helados", 100104, "2024-09-20", "-18°C", "Congelado por aire", "Aire", 78.0, 21.0, 0.04, 0.0, 0.0, 0);
        ProductosCongelados test2_congelado = new ProductosCongelados(1015, "Paleta de Frutas", "Paletas", 100204, "2024-09-22", "-18°C", "Congelado por aire", "Aire", 78.0, 21.0, 0.04, 0.0, 0.0, 0);
        ProductosCongelados test3_congelado = new ProductosCongelados(1016, "Hielo en Cubos", "Hielo", 100304, "2024-10-01", "-10°C", "Congelado por agua", "Agua", 0.0, 0.0, 0.0, 0.0, 0.5, 0);
        ProductosCongelados test4_congelado = new ProductosCongelados(1017, "Helado de Chocolate", "Helados", 100404, "2024-09-15", "-18°C", "Congelado por agua", "Agua", 0.0, 0.0, 0.0, 0.0, 0.8, 0);
        ProductosCongelados test5_congelado = new ProductosCongelados(1018, "Hamburguesa Congelada", "Hamburguesas", 100504, "2024-10-02", "-20°C", "Congelado por nitrógeno", "Nitrógeno", 0.0, 0.0, 0.0, 0.0, 0.0, 30);
        productos.add(test1_congelado);
        productos.add(test2_congelado);
        productos.add(test3_congelado);
        productos.add(test4_congelado);
        productos.add(test5_congelado);

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
                productos.forEach(Articulos::mostrar_informacion);
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
        System.out.println("**********************************************");
        System.out.println("            Sistema Cerrado                    ");
        System.out.println("**********************************************");
    }
}
