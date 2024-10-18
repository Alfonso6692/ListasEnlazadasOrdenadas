public class Main {
    public static void main(String[] args) {
        /*
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.agregarInicio(1);
        listaEnlazada.agregarInicio(2);
        listaEnlazada.agregarInicio(3);
        listaEnlazada.agregarFinal(5);
        listaEnlazada.eliminar(3);
        listaEnlazada.verLista();
        */
         ListaEnlazadaOrdenada listaEnlazadaOrdenada = new ListaEnlazadaOrdenada();
         listaEnlazadaOrdenada.insertarOrden(1);
        listaEnlazadaOrdenada.insertarOrden(3);
        listaEnlazadaOrdenada.insertarOrden(2);
        listaEnlazadaOrdenada.insertarOrden(5);
        listaEnlazadaOrdenada.insertarOrden(4);
        listaEnlazadaOrdenada.verLista();

    }
}