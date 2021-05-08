package mx.uam.is.practicadiseno.negocio;

public class ManejadorProxy implements Manejador{

    private final Manejador manejador;

    public ManejadorProxy(Manejador manejador) {
        this.manejador = manejador;
    }

    @Override
    public String[] dameDatos() {
        System.out.println("Se invocó el método dameDatos()");
        return manejador.dameDatos();
    }

    @Override
    public boolean agrega(String dato) {
        System.out.println("Se invocó el método agrega(String dato)");
        return manejador.agrega(dato);
    }

    @Override
    public boolean borra(String dato) {
        System.out.println("Se invocó el método borra(String dato)");
        return manejador.borra(dato);
    }

    @Override
    public void finaliza() {
        System.out.println("Se invocó el método finaliza()");
        manejador.finaliza();
    }

    @Override
    public boolean quitaObservador(Observador o) {
        System.out.println("Se invocó el método quitaObservador(Observador o)");
        return manejador.quitaObservador(o);
    }

    @Override
    public boolean agregaObservador(Observador o) {
        System.out.println("Se invocó el método agregaObservador(Observador o)");
        return manejador.agregaObservador(o);
    }
}
