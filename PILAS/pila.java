package PILAS;

public class pila {
    /*Tope nos sirve para indicar en donde tenemos que insertar 
    Longitud se emplea para obtener el tamaño de la pila
    */
    private Nodo tope= null;
    private int longitud=0;

    public class Nodo {
        public int isbn;//es un libro
        public String autor;
        public String titulo; 
        public Nodo fondo= null;

        //Constructor nodo... Cada parametro es separado por  una coma
        public Nodo (int isbn, String autor, String titulo){
            this.isbn= isbn;
            this.autor= autor;
            this.titulo= titulo;
        }
    }

    public boolean isEmptyList(){
        return tope==null;
    }
    public int length(){
        return longitud;
    }

    public void apilar(int isbn, String autor, String titulo){
        Nodo nodoPush= new Nodo(isbn, autor, titulo);
        nodoPush.fondo= tope;
        tope= nodoPush;
        longitud++;//Cada vez que se agrega un elemento se incrementa la longitud
    }
    public void desapilar(){
        if (tope!=null) {
            Nodo nodoPop= tope;
            tope= tope.fondo;
            nodoPop=null;
        }
        longitud--;
    }


    public void obtenerTope(){
        if (!isEmptyList()) {
            Nodo nodoCima= tope;
            System.out.println("El libro actual es: ["+ nodoCima.isbn +","+ nodoCima.autor+","+ nodoCima.titulo+"]");
        }
        else{
            System.out.println("La pila esta vacia");
        }
    }
    //Realizar un metodo destructor que elimine todos los elementos de una pila
    public void destructor(){
        while ((!isEmptyList())) {
            desapilar();
            
        }

    }
    //Realizar un metodo desapilarN en el cual se desapilan un numero N de elementos de una pila
    /*ublic void desapilarN(int n) {
        if (n <= 0) {
            System.out.println("El número de elementos a desapilar debe ser mayor que cero.");
            return;
        }
        
        if (n > longitud) {
            System.out.println("No hay suficientes elementos en la pila para desapilar " + n + " elementos.");
            return;
        }
        
        Nodo nodoActual = tope;
        for (int i = 0 ; i <n; i++) {
            System.out.println("Desapilando elementos ["+nodoActual.isbn+","+nodoActual.titulo+","+nodoActual.autor+"]");
            
            nodoActual=nodoActual.fondo;
        }
    }*/

    public void desapilarN (int cantidad){
      if (!isEmptyList()) {
        if (length()>=cantidad) {
          for(int contador=0;contador< cantidad;contador++){
            desapilar();

          }
            
        }
        else{
            System.out.println("La pila no tiene el numero de libros de eliminar");
        }
      }
    }
}
