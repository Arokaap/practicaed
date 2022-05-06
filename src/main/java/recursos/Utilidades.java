package recursos;

import modelo.Producto;

/**
 * Clase para usar metodos utiles de forma general
 *
 * @author Aroka
 */
public class Utilidades {

    /**
     * Metodo mediante el que calculamos el factorial de un numero
     *
     * @param numero Numero al que le calculamos el factorial
     * @return Devuelve el factorial
     */
    public static float calcularFactorial(float numero) {
        float resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    /**
     * Metodo con el que calculamos el precio final del producto
     *
     * @param producto Se le pasa un objeto de la clase Producto al que le
     * calculamos el precio
     * @return Devuelve el precio final de ese producto
     */
    public static float precioFinal(Producto producto) {
        final int AUMENTO_FIJO = 10;
        final float GASTOS_DE_ENVIO = 0.16f;
        float precioFinal = producto.getPrecio();

        if (producto.getPrecio() > 300) {
            precioFinal += producto.getPrecio() * GASTOS_DE_ENVIO;
        }

        return precioFinal + AUMENTO_FIJO;
    }
}
