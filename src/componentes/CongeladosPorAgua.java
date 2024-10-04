/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author carlo
 */
public class CongeladosPorAgua extends ProductosCongelados {

    private float salPorLitro;

    public CongeladosPorAgua(float salPorLitro) {
        this.salPorLitro = salPorLitro;
    }

    @Override
    public void mostrar_informacion() {
        super.mostrar_informacion();
        System.out.println("Salinidad del agua: " + salPorLitro + " gramos de sal por litro de agua");
    }
}