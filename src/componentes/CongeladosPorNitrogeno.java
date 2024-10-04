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

    private String metodoCongelacion;
    private int tiempoExposicionNitrogeno;

    public CongeladosPorNitrogeno(String metodoCongelacion, int tiempoExposicionNitrogeno) {
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    @Override
    public void mostrar_informacion() {
        super.mostrar_informacion();
        System.out.println("Método de congelación: " + metodoCongelacion);
        System.out.println("Tiempo de exposición al nitrógeno: " + tiempoExposicionNitrogeno + " segundos");
    }
}
