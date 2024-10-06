/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

public class ProductosCongelados extends Articulos {

    protected String tipo_congelado;
    protected float porcentaje_nitrogeno;
    protected float porcentaje_oxigeno;
    protected float porcentaje_dioxido_carbono;
    protected float porcentaje_vapor_agua;

    //private String salinidad_agua;
    protected float sal_por_litro;

    protected String metodo_congelacion;
    protected float tiempo_exposicion_nitrogeno;

    public ProductosCongelados() {
        this.porcentaje_nitrogeno = 0;
        this.porcentaje_oxigeno = 0;
        this.porcentaje_dioxido_carbono = 0;
        this.porcentaje_vapor_agua = 0;
        this.sal_por_litro = 0;
    }

    public ProductosCongelados(int id_articulo, String nombre, String categoria, int lote, String fecha_envasado, String temperatura,
            String metodo_congelacion, String tipo_congelado, double porcentaje_nitrogeno, double porcentaje_oxigeno,
            double porcentaje_dioxido_carbono, double porcentaje_vapor_agua, double sal_por_litro, float tiempo_exposicion_nitrogeno) {
        setId_articulo(id_articulo);
        setNombre(nombre);
        setCategoria(categoria);
        setNumero_lote(lote);
        setFecha_envasado(fecha_envasado);
        setTemperatura_mantenimiento(temperatura);
        setMetodo_congelacion(metodo_congelacion);
        setTiempo_exposicion_nitrogeno(tiempo_exposicion_nitrogeno);
        this.tipo_congelado = tipo_congelado;
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
                + " TEMPERATURA RECOMENDADA : " + getTemperatura_mantenimiento()
                + "TIPO CONGELACION: " + getMetodo_congelacion());
        

        if (this.getMetodo_congelacion() != null) {
            System.out.println("Método de congelación: " + getMetodo_congelacion());
        } else {
            System.out.println("Método de congelación no especificado.");
        }

        if (this.getTiempo_exposicion_nitrogeno() > 0) {
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
    public float getTiempo_exposicion_nitrogeno() {
        return tiempo_exposicion_nitrogeno;
    }

    /**
     * @param tiempo_exposicion_nitrogeno the tiempo_exposicion_nitrogeno to set
     */
    public void setTiempo_exposicion_nitrogeno(float tiempo_exposicion_nitrogeno) {
        this.tiempo_exposicion_nitrogeno = tiempo_exposicion_nitrogeno;
    }

}
