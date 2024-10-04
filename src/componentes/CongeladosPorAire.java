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

    private float porcentajeNitrogeno;
    private float porcentajeOxigeno;
    private float porcentajeDioxidoCarbono;
    private float porcentajeVaporAgua;

    public CongeladosPorAire(float porcentajeNitrogeno, float porcentajeOxigeno, 
                             float porcentajeDioxidoCarbono, float porcentajeVaporAgua) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
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
        System.out.println("Nitrógeno: " + porcentajeNitrogeno + "%");
        System.out.println("Oxígeno: " + porcentajeOxigeno + "%");
        System.out.println("Dióxido de Carbono: " + porcentajeDioxidoCarbono + "%");
        System.out.println("Vapor de Agua: " + porcentajeVaporAgua + "%");
    }
}