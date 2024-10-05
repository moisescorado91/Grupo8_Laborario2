/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author carlo
 */
public class CongeladosPorAire extends ProductosCongelados {

    public CongeladosPorAire(float porcentajeNitrogeno, float porcentajeOxigeno, float porcentajeDioxidoCarbono, float porcentajeVaporAgua) {
        this.porcentaje_nitrogeno = porcentajeNitrogeno;
        this.porcentaje_oxigeno = porcentajeOxigeno;
        this.porcentaje_dioxido_carbono = porcentajeDioxidoCarbono;
        this.porcentaje_vapor_agua = porcentajeVaporAgua;
    }

    @Override
    public void mostrar_informacion() {
        // Verificamos que los valores heredados no sean null
        if (getNombre() == null) {
            setNombre("No especificado");
        }
        if (getCategoria() == null) {
            setCategoria("No especificada");
        }
        if (getTemperatura_mantenimiento() == null) {
            setTemperatura_mantenimiento("No especificada");
        }
        if (getFecha_envasado() == null) {
            setFecha_envasado("No especificada");
        }

        // Mostrar la información del producto congelado
        super.mostrar_informacion();
        System.out.println("Composición del aire:");
        System.out.println("Nitrógeno: " + porcentaje_nitrogeno + "%");
        System.out.println("Oxígeno: " + porcentaje_oxigeno + "%");
        System.out.println("Dióxido de Carbono: " + porcentaje_dioxido_carbono + "%");
        System.out.println("Vapor de Agua: " + porcentaje_vapor_agua + "%");
    }
}
