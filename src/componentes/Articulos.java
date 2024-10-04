/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author Moises Molina
 */
public abstract class Articulos {

    private int id_articulo;
    private String nombre;
    private String categoria;
    private int numero_lote;
    private String temperatura_mantenimiento;

    //para productos frescos verduras o frutas
    private String fecha_ingreso;
    private String fecha_caducidad;

    //para productos refrigerados
    private String fecha_envasado;
    private String pais_origen;


    private boolean refrigerar_despues_abierto;
    
    
    public abstract void mostrar_informacion();

    /**
     * @return the id_articulo
     */
    public int getId_articulo() {
        return id_articulo;
    }

    /**
     * @param id_articulo the id_articulo to set
     */
    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the numero_lote
     */
    public int getNumero_lote() {
        return numero_lote;
    }

    /**
     * @param numero_lote the numero_lote to set
     */
    public void setNumero_lote(int numero_lote) {
        this.numero_lote = numero_lote;
    }

    /**
     * @return the temperatura_mantenimiento
     */
    public String getTemperatura_mantenimiento() {
        return temperatura_mantenimiento;
    }

    /**
     * @param temperatura_mantenimiento the temperatura_mantenimiento to set
     */
    public void setTemperatura_mantenimiento(String temperatura_mantenimiento) {
        this.temperatura_mantenimiento = temperatura_mantenimiento;
    }

    /**
     * @return the fecha_ingreso
     */
    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    /**
     * @param fecha_ingreso the fecha_ingreso to set
     */
    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    /**
     * @return the fecha_caducidad
     */
    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    /**
     * @param fecha_caducidad the fecha_caducidad to set
     */
    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    /**
     * @return the fecha_envasado
     */
    public String getFecha_envasado() {
        return fecha_envasado;
    }

    /**
     * @param fecha_envasado the fecha_envasado to set
     */
    public void setFecha_envasado(String fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    /**
     * @return the pais_origen
     */
    public String getPais_origen() {
        return pais_origen;
    }

    /**
     * @param pais_origen the pais_origen to set
     */
    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    /**
     * @return the refrigerar_despues_abierto
     */
    public boolean isRefrigerar_despues_abierto() {
        return refrigerar_despues_abierto;
    }

    /**
     * @param refrigerar_despues_abierto the refrigerar_despues_abierto to set
     */
    public void setRefrigerar_despues_abierto(boolean refrigerar_despues_abierto) {
        this.refrigerar_despues_abierto = refrigerar_despues_abierto;
    }

}
