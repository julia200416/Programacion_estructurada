package LISTAS_ENLAZADAS;

public class main1 {
    public static void main(String[] args) {
        listas lista = new listas();
        //El ultimo valor que es 89 es el primero que se va a imprimir 
        lista.InsertarAlInicio( 20);
        lista.InsertarAlInicio( 34);
        lista.InsertarAlInicio( 89);

       /* lista.insertarAlFinal(13);

        lista.InsetarEnPosicion(2, 25);

        lista.mostrarNodox();
        System.out.println();
        System.out.println(lista.contarNodos());

        lista.eliminarAlInicio();

        System.out.println();
        System.out.println(lista.contarNodos());
        lista.mostrarNodox();

        lista.eliminarAlFinal();
        System.out.println(lista.contarNodos());
        lista.mostrarNodox();*/


        lista.eliminarPosicion(2);

        lista.mostrarNodox();
        System.out.println();
       // System.out.println(lista.contarNodos());



        //int cantidadNodos=lista.contarNodos();
        //System.out.println("El total de nodos son: "+cantidadNodos);
    }

}
