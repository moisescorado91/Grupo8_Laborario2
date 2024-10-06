/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import java.util.Scanner;

/**
 *
 * @author Moises Molina
 */
public class AgregarProductos extends ComponentesMenu {

    public ProductosFrescos agregar_producto_fresco(Scanner entrada, int id_articulo) {
        ProductosFrescos objeto_producto_fresco = new ProductosFrescos();

        objeto_producto_fresco.setId_articulo(id_articulo);
        objeto_producto_fresco.setCategoria(tipos_productos_frescos(entrada));

        System.out.println("Ingresa El nombre del articulo");
        objeto_producto_fresco.setNombre(entrada.nextLine());


        System.out.println("Ingresa numero de lote del articulo");
        objeto_producto_fresco.setNumero_lote(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Ingresa fecha de ingreso del articulo");
        objeto_producto_fresco.setFecha_ingreso(entrada.nextLine());

        System.out.println("Ingresa fecha de caducidad del articulo");
        objeto_producto_fresco.setFecha_caducidad(entrada.nextLine());

        return objeto_producto_fresco;
    }

    public ProductosRefrigerados agregar_producto_refrigerado(Scanner entrada, int id_articulo) {
        ProductosRefrigerados objeto_producto_refrigerado = new ProductosRefrigerados();

        objeto_producto_refrigerado.setId_articulo(id_articulo);
        objeto_producto_refrigerado.setCategoria(tipos_productos_refrigerados(entrada));

        System.out.println("Ingresa El nombre del articulo");
        objeto_producto_refrigerado.setNombre(entrada.nextLine());
        entrada.nextLine();

        System.out.println("Ingresa numero de lote del articulo");
        objeto_producto_refrigerado.setNumero_lote(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Ingresa fecha de envasado del articulo");
        objeto_producto_refrigerado.setFecha_envasado(entrada.nextLine());

        System.out.println("Ingresa temperatura de ambiente relacionado");
        objeto_producto_refrigerado.setTemperatura_mantenimiento(entrada.nextLine());

        System.out.println("Ingresa el pais de origen del articulo");
        objeto_producto_refrigerado.setPais_origen(entrada.nextLine());

        return objeto_producto_refrigerado;
    }

    public ProductosCongelados agregar_producto_congelado(Scanner entrada, int id_articulo) {
        
        int tipoCongelado = tipo_de_congelacion_producto(entrada);
        ProductosCongelados producto = null;

        switch (tipoCongelado) {
            case 1:
                System.out.println("Ingresa porcentaje de nitrógeno:");
                float nitrogeno = entrada.nextFloat();
                
                System.out.println("Ingresa porcentaje de oxígeno:");
                float oxigeno = entrada.nextFloat();
                
                System.out.println("Ingresa porcentaje de dióxido de carbono:");
                float dioxidoCarbono = entrada.nextFloat();
                
                System.out.println("Ingresa porcentaje de vapor de agua:");
                float vaporAgua = entrada.nextFloat();
                
                producto = new CongeladosPorAire(nitrogeno, oxigeno, dioxidoCarbono, vaporAgua);
                break;
            case 2:
                System.out.println("Ingresa la salinidad del agua (gramos de sal por litro):");
                float salinidad = entrada.nextFloat();
                producto = new CongeladosPorAgua(salinidad);
                break;
            case 3:
                System.out.println("Ingresa el metodo de congelacion empleado");
                String metodo_congelacion = entrada.nextLine();
                entrada.nextLine(); 
                System.out.println("Ingresa el tiempo de exposición al nitrógeno (en segundos):");
                int tiempoExposicion = entrada.nextInt();
                producto = new CongeladosPorNitrogeno(metodo_congelacion, tiempoExposicion);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        if (producto != null) {
            producto.setId_articulo(id_articulo);
            entrada.nextLine();  
            
            System.out.println("Ingresa el nombre del artículo:");
            producto.setNombre(entrada.nextLine());
            
            System.out.println("Ingresa número de lote:");
            producto.setNumero_lote(entrada.nextInt());
            entrada.nextLine();
            
            System.out.println("Ingresa fecha de envasado:");
            producto.setFecha_envasado(entrada.nextLine());
            
            System.out.println("Ingresa la temperatura de mantenimiento recomendada:");
            producto.setTemperatura_mantenimiento(entrada.nextLine());
        }

        return producto;
    }

    public ProductosEnvasados agregar_producto_envasados(Scanner entrada, int id_articulo) {
        ProductosEnvasados objeto_producto_envasados = new ProductosEnvasados();

        objeto_producto_envasados.setId_articulo(id_articulo);
        objeto_producto_envasados.setCategoria(tipos_productos_envasados(entrada));

        System.out.println("Ingresa El nombre del articulo");
        objeto_producto_envasados.setNombre(entrada.nextLine());
        entrada.nextLine();

        System.out.println("Ingresa numero de lote del articulo");
        objeto_producto_envasados.setNumero_lote(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Ingresa fecha de envasado del articulo");
        objeto_producto_envasados.setFecha_envasado(entrada.nextLine());

        System.out.println("Ingresa fecha de caducidad del articulo");
        objeto_producto_envasados.setFecha_caducidad(entrada.nextLine());

        System.out.println("Ingresa temperatura de ambiente relacionado");
        objeto_producto_envasados.setTemperatura_mantenimiento(entrada.nextLine());

        System.out.println("¿Necesita Refrigerar luego de abrir?");
        System.out.println("1. Si \n 2. No");
        boolean condicion = false;
        int valor = entrada.nextInt();
        if (valor == 1) {
            condicion = true;
        }
        objeto_producto_envasados.setRefrigerar_despues_abierto(condicion);

        return objeto_producto_envasados;
    }
}
