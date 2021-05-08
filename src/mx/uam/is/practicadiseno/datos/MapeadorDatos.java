package mx.uam.is.practicadiseno.datos;

public interface MapeadorDatos {
	/**
	 * Agrega un dato
	 *
	 * @param dato recibe un dato
	 * @return boolean
	 */
	boolean agrega(String dato);

	/**
	 * Borra un dato
	 *
	 * @param dato recibe el dato a borrar
	 * @return boolean
	 */
	boolean borra(String dato);

	/**
	 * Recupera un dato
	 *
	 * @return la lista de datos
	 */
	String[] dameDatos();

	/**
	 * Checa si un dato esta presente
	 *
	 * @param dato revisa si existe el dato
	 * @return boolean
	 */
	boolean contiene(String dato);
}
