package modelo;

/**
 * Clase mediante la cual creamos objetos de tipo producto y interactuamos con
 * el mediante metodos
 *
 * @author Aroka
 */
public class Producto {

    private String codigo;
    private float precio;

    /**
     * Constructor que recoje dos parametros
     *
     * @param codigo Este parametro es el codigo del producto
     * @param precio Este parametro es el precio del producto
     */
    public Producto(String codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
