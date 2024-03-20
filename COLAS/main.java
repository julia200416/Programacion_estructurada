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
        colaPedidos.obtenerSiguiente();
    

        if (colaPedidos.isEmptyList()) {
            System.out.println("La cola esta vacia antes de eliminar elementos");
        }
        else{
            System.out.println("La cola no esta vacia antes de eliminar elementos");
        }
        
        colaPedidos.eliminar();

        if (colaPedidos.isEmptyList()) {
            System.out.println("La cola esta vacia despues de eliminar elementos");
        }
        else{
            System.out.println("La cola no esta vacia despues de eliminar elementos");
        }
    }      
}
