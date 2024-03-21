package COLAS;

public class main {
    public static void main(String[] args) {
        colas colaPedidos=new colas();

        colaPedidos.agregarCola(1, "Julian");
        colaPedidos.agregarCola(2, "Alice");
        colaPedidos.agregarCola(3, "Perla");
        colaPedidos.agregarCola(4, "Carlos");

        colaPedidos.obtener();

        colaPedidos.eliminar();
        
        colaPedidos.obtener();
        colaPedidos.obtenerSiguiente();

    }      
}
