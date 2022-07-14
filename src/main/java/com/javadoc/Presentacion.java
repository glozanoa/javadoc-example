package com.javadoc;

/**
 * Ejemplo de presentacion de amistades
 * 
 * @author Isabel
 * @version 1.0
 * @since 2021-06-21
 */

public class Presentacion {
	/**
	 * Una presentacion generica en caso de que escribas ""
	 *
	 */
	public static final String fraseGenerica = "Hola, te presento a ";

	/**
	 * Documentacion para Main Imprime toda la frase de presentacion para la persona
	 * presentada
	 * 
	 * @param presentacion la frase con que presentas a la persona
	 * @param presentada el nombre de la persona que vas a presentar
	 */
	public void decirPresentacion(String presentacion, String presentada) {
		String mensaje;
		if (presentacion.isEmpty()) {
			mensaje = Presentacion.fraseGenerica + ", " + presentada + "!";
		} else {
			mensaje = presentacion + ", " + presentada + "!";
		}
		System.out.println(mensaje);
	}
}
