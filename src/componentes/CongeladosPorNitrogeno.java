/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author carlo
 */
public class CongeladosPorNitrogeno extends ProductosCongelados {

    public CongeladosPorNitrogeno(String metodoCongelacion, int tiempoExposicionNitrogeno) {
        this.metodo_congelacion = metodoCongelacion;
        this.tiempo_exposicion_nitrogeno = tiempoExposicionNitrogeno;
    }

    @Override
    public void mostrar_informacion() {
        super.mostrar_informacion();
        System.out.println("Método de congelación: " + metodo_congelacion);
        System.out.println("Tiempo de exposición al nitrógeno: " + tiempo_exposicion_nitrogeno + " segundos");
    }
}
