package mx.uam.is.practicadiseno.negocio;

public interface Manejador {
	/**
	 * Recupera los datos
	 *
	 * @return la lista de datos
	 */
	String[] dameDatos();

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 *
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	boolean agrega(String dato);

	/**
	 * Borra un dato de la list
	 *
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	boolean borra(String dato);

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	void finaliza();

	/**
	 * quitar un observador de la lista de observadores
	 *
	 * @param o Recibe un observador
	 * @return true si se quito, false si no
	 */
	boolean quitaObservador(Observador o);

	/**
	 * agregar un observador de la lista de observadores
	 *
	 * @param o Recibe un observador
	 * @return true si se agrego, false si no
	 */
	boolean agregaObservador(Observador o);

	// llamar actualiza() sobre todos los observadores
	private void notifica(){}


}
