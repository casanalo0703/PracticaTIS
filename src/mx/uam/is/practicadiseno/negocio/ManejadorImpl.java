package mx.uam.is.practicadiseno.negocio;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;
import java.util.ArrayList;
import java.util.List;

public class ManejadorImpl implements Manejador {

	//Estructura que contiene a los Obsevadores
	private static final List<Observador> observadores = new ArrayList<>();
	// La estructura que contiene los datos
	private final MapeadorDatos mapeadorDatos;

	public ManejadorImpl(MapeadorDatos mapeadorDatos) {
		super();
		this.mapeadorDatos = mapeadorDatos;
	}

	@Override
	public String[] dameDatos() {return mapeadorDatos.dameDatos();}

	@Override
	public boolean agrega(String dato) {
		boolean agregado = mapeadorDatos.agrega(dato);
		notifica();
		return agregado;
	}

	@Override
	public boolean borra(String dato) {
		boolean borrado = mapeadorDatos.borra(dato);
		notifica();
		return borrado;
	}

	@Override
	public boolean agregaObservador(Observador o){return observadores.add(o);}

	private void notifica(){observadores.forEach(Observador::actualiza);}

	@Override
	public boolean quitaObservador(Observador o){return observadores.remove(o);}

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza() {
		if (observadores.isEmpty()){
			System.exit(0);
		}
	}
}
