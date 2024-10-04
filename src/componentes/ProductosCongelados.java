/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author Moises Molina
 */
public class ProductosCongelados extends Articulos {

    private String tipo_congelado;
    private float porcentaje_nitrogeno;
    private float porcentaje_oxigeno;
    private float porcentaje_dioxido_carbono;
    private float porcentaje_vapor_agua;

    //private String salinidad_agua;
    private float sal_por_litro;

    private String metodo_congelacion;
    private String tiempo_exposicion_nitrogeno;

    public ProductosCongelados() {
        this.porcentaje_nitrogeno = 0;
        this.porcentaje_oxigeno = 0;
        this.porcentaje_dioxido_carbono = 0;
        this.porcentaje_vapor_agua = 0;
        this.sal_por_litro = 0;
    }

    public ProductosCongelados(int id_articulo, String nombre, String categoria, int lote, String fecha_envasado, String temperatura, double porcentaje_nitrogeno, double porcentaje_oxigeno, double porcentaje_dioxido_carbono, double porcentaje_vapor_agua, double sal_por_litro) {
        setId_articulo(id_articulo);
        setNombre(nombre);
        setCategoria(categoria);
        setNumero_lote(lote);
        setFecha_envasado(fecha_envasado);
        setTemperatura_mantenimiento(temperatura);
        this.porcentaje_nitrogeno = (float) porcentaje_nitrogeno;
        this.porcentaje_oxigeno = (float) porcentaje_oxigeno;
        this.porcentaje_dioxido_carbono = (float) porcentaje_dioxido_carbono;
        this.porcentaje_vapor_agua = (float) porcentaje_vapor_agua;
        this.sal_por_litro = (float) sal_por_litro;
    }

    @Override
    public void mostrar_informacion() {
        System.out.println("ID ARTICULO: " + getId_articulo()
                + " NOMBRE: " + getNombre()
                + " CATEGORIA: " + getCategoria()
                + " LOTE: " + getNumero_lote()
                + " FECHA ENVASADO: " + getFecha_envasado()
                + " TEMPERATURA RECOMENDADA : " + getTemperatura_mantenimiento());

        if (this.getMetodo_congelacion() != null) {
            System.out.println("Método de congelación: " + getMetodo_congelacion());
        } else {
            System.out.println("Método de congelación no especificado.");
        }

        if (this.getTiempo_exposicion_nitrogeno() != null) {
            System.out.println("Tiempo de exposición al nitrógeno: " + getTiempo_exposicion_nitrogeno() + " segundos");
        } else {
            System.out.println("Tiempo de exposición no especificado.");
        }
    }

    /**
     * @return the tipo_congelado
     */
    public String getTipo_congelado() {
        return tipo_congelado;
    }

    /**
     * @param tipo_congelado the tipo_congelado to set
     */
    public void setTipo_congelado(String tipo_congelado) {
        this.tipo_congelado = tipo_congelado;
    }

    /**
     * @return the porcentaje_nitrogeno
     */
    public float getPorcentaje_nitrogeno() {
        return porcentaje_nitrogeno;
    }

    /**
     * @param porcentaje_nitrogeno the porcentaje_nitrogeno to set
     */
    public void setPorcentaje_nitrogeno(float porcentaje_nitrogeno) {
        this.porcentaje_nitrogeno = porcentaje_nitrogeno;
    }

    /**
     * @return the porcentaje_oxigeno
     */
    public float getPorcentaje_oxigeno() {
        return porcentaje_oxigeno;
    }

    /**
     * @param porcentaje_oxigeno the porcentaje_oxigeno to set
     */
    public void setPorcentaje_oxigeno(float porcentaje_oxigeno) {
        this.porcentaje_oxigeno = porcentaje_oxigeno;
    }

    /**
     * @return the porcentaje_dioxido_carbono
     */
    public float getPorcentaje_dioxido_carbono() {
        return porcentaje_dioxido_carbono;
    }

    /**
     * @param porcentaje_dioxido_carbono the porcentaje_dioxido_carbono to set
     */
    public void setPorcentaje_dioxido_carbono(float porcentaje_dioxido_carbono) {
        this.porcentaje_dioxido_carbono = porcentaje_dioxido_carbono;
    }

    /**
     * @return the porcentaje_vapor_agua
     */
    public float getPorcentaje_vapor_agua() {
        return porcentaje_vapor_agua;
    }

    /**
     * @param porcentaje_vapor_agua the porcentaje_vapor_agua to set
     */
    public void setPorcentaje_vapor_agua(float porcentaje_vapor_agua) {
        this.porcentaje_vapor_agua = porcentaje_vapor_agua;
    }

    /**
     * @return the sal_por_litro
     */
    public float getSal_por_litro() {
        return sal_por_litro;
    }

    /**
     * @param sal_por_litro the sal_por_litro to set
     */
    public void setSal_por_litro(float sal_por_litro) {
        this.sal_por_litro = sal_por_litro;
    }

    /**
     * @return the metodo_congelacion
     */
    public String getMetodo_congelacion() {
        return metodo_congelacion;
    }

    /**
     * @param metodo_congelacion the metodo_congelacion to set
     */
    public void setMetodo_congelacion(String metodo_congelacion) {
        this.metodo_congelacion = metodo_congelacion;
    }

    /**
     * @return the tiempo_exposicion_nitrogeno
     */
    public String getTiempo_exposicion_nitrogeno() {
        return tiempo_exposicion_nitrogeno;
    }

    /**
     * @param tiempo_exposicion_nitrogeno the tiempo_exposicion_nitrogeno to set
     */
    public void setTiempo_exposicion_nitrogeno(String tiempo_exposicion_nitrogeno) {
        this.tiempo_exposicion_nitrogeno = tiempo_exposicion_nitrogeno;
    }

//    @Override
//    public void mostrar_informacion() {
//        switch (this.getMetodo_congelacion()) {
//            case "aire":
//                System.out.println("ID ARTICULO: " + getId_articulo()
//                        + " NOMBRE: " + getNombre()
//                        + " CATEGORIA: " + getCategoria()
//                        + " LOTE: " + getNumero_lote()
//                        + " FECHA ENVASADO: " + getFecha_envasado()
//                        + " TEMPERATURA RECOMENDADA : " + getTemperatura_mantenimiento()
//                        + " % NITROGENO: " + getPorcentaje_nitrogeno()
//                        + " % OXIGENO: " + getPorcentaje_oxigeno()
//                        + " % DIOXIDO DE CARBONO: " + getPorcentaje_dioxido_carbono()
//                        + " % VAPOR DE AGUA " + getPorcentaje_vapor_agua()
//                );
//                break;
//            case "agua":
//                System.out.println("ID ARTICULO: " + getId_articulo()
//                        + " NOMBRE: " + getNombre()
//                        + " CATEGORIA: " + getCategoria()
//                        + " LOTE: " + getNumero_lote()
//                        + " FECHA ENVASADO: " + getFecha_envasado()
//                        + " TEMPERATURA RECOMENDADA : " + getTemperatura_mantenimiento()
//                        + " gramos de sal por litro de agua: " + getSal_por_litro()
//                );
//                break;
//            case "nitrogeno":
//                System.out.println("ID ARTICULO: " + getId_articulo()
//                        + " NOMBRE: " + getNombre()
//                        + " CATEGORIA: " + getCategoria()
//                        + " LOTE: " + getNumero_lote()
//                        + " FECHA ENVASADO: " + getFecha_envasado()
//                        + " TEMPERATURA RECOMENDADA : " + getTemperatura_mantenimiento()
//                        + " METODO CONGELACION: " + getMetodo_congelacion()
//                        + " EXPOSICION DE NITROGENO EN SEGUNDOS: " + getTiempo_exposicion_nitrogeno()
//                );
//                break;
//            default:
//                System.out.println("ID ARTICULO: " + getId_articulo()
//                        + " NOMBRE: " + getNombre()
//                        + " CATEGORIA: " + getCategoria()
//                        + " LOTE: " + getNumero_lote()
//                        + " FECHA ENVASADO: " + getFecha_envasado()
//                        + " TEMPERATURA RECOMENDADA : " + getTemperatura_mantenimiento()
//                );
//        }
//    }
}
