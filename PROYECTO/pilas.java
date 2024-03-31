package PROYECTO;

public class pilas {
    /*Tope nos sirve para indicar en donde tenemos que insertar 
    Longitud se emplea para obtener el tamaño de la pila
    */
    private Nodo tope= null;
    private int longitud=0;
    public class Nodo {
        public int isbn;
        public String autor;
        public String titulo;
        public Nodo fondo= null;

        public Nodo(int isbn, String autor, String titulo){
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
        Nodo nodopush= new Nodo(isbn, autor, titulo);
        nodopush.fondo= tope;
        tope= nodopush;
        longitud++;
    }
    public void desapilar(){
        if (tope!=null) {
            Nodo nodoPop= tope;
            tope= tope.fondo;
            nodoPop= null;
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
