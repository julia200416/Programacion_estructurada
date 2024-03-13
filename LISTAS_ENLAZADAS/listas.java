package LISTAS_ENLAZADAS;

public class listas {
    private Nodox head=null; // null es CABEZA
    private int Longitud=0;//Para ver la longitud del nodo
    //public String contarNodos;

    //Clase interna llamada nodo
    public class Nodox{
        public int data; //dato
        public Nodox next;//Es el enlace al siguiente nodo -puntero-
     //linea 10 a 14Es el constructor de mi clase nodo
     //El constructor inicializa las variables de mi clase nodo
        Nodox (int valor){
            data=valor;
            next=null;//El puntero va apuntando al vacio 
        }
    }
    public boolean isEmptyList(){ // public boolean es el tipo de funcion
                                  // isEmptyList es el nombre de la funcion
        return head== null;       // Se declara lo que hara la funcion es decir va a regresar al primer NODO
                                       //este hara el rol de que el 1er valor sera el ultimo y el ultimo el primero
    }

    public int obtenerNodo(int posicion){//Es para mostrar cierto nodo
        if (isEmptyList()) {
         return 0;
        }else{
         Nodox puntero= head;
         int contador= 0;
         while (contador < posicion && puntero.next!=null) {
             puntero= puntero.next;
             contador++;
         }
         if (contador!=posicion) {
             return 0;
         } else{
             return puntero.data;
         }
        }
     }


    public int contarNodos(){
        return Longitud; //retornar el valor de tipo entero es decir actualiza el tamaño de la lista, si se agrega uno o dos o tres....etc...
    }

    public void mostrarNodox(){//El VOID se utiliza para que no regrese NADA
        Nodox current=head; //Para posicionar al inicio de la lista. CURRENT es ACTUAL 
        int contador=0;//Inicia con 0
        while (current !=null) {//MIENTRAS QUE NODOACTUAL SEA DIFERENTE O IGUAL A NULL LOS VA A MOSTRAR es decir si hay un valor dentro del nodo  
                                //este se va a repetir pero si no hay ningun valor se rompera el bucle
            System.out.println("El elemento "+ (contador+1)+" del nodo es "+current.data);//Mostrara la lista de los nodos ingresados
            current= current.next; //ACTUALIZA LOS DATOS DE CURRENT es decir el nodoActual lo tomara como 2do dato si es que existe y sucesibamente 

            contador++;
        }
    }


    public void InsertarAlInicio(int valor){// VOID para que no retorne datos
        Nodox nodox= new Nodox(valor); //Para insertar un nodo al inicio. Nodox es la clase y nodox es el nombre de la clase
        nodox.next=head; //Apunta el puntero del nodo creado
        //A la cabeza se...
        head= nodox;
        Longitud++;
   }


   //SEGUNDAAAA PARTE
   public void insertarAlFinal(int valor){
    Nodox nodox= new Nodox(valor);
    if (isEmptyList()) {//head==null
        head=nodox;
    }
    else{
        Nodox puntero= head;
        while (puntero.next != null) {//SI PUNTERO ES IGUAL A NULL LOS VA IR RECORRIENDO
            puntero= puntero.next;
        }
        puntero.next= nodox;
    }
    Longitud++;
   }

   //TERCERA PARTEE
   public void InsetarEnPosicion (int posicion, int valor){
    Nodox nodox= new Nodox(valor);
    if (isEmptyList()) {
        head=nodox;
    }
    else{
        Nodox puntero= head;
        int contador=0;
        while (contador<posicion && puntero.next!=null) {
            puntero= puntero.next;
            contador++;
        }
        nodox.next=puntero.next;
        puntero.next= nodox;
    }
    Longitud++;
   }

   /*public int contarNodos(){
    int contador=0;
    Nodox nodox=head;
    while ((nodox !=null)) {
        contador++;
        nodox= nodox.next;
        
    }
    return contador;
   }*/
   //ELIMINAR AL INICIO
   public void eliminarAlInicio(){
    if (!isEmptyList()) {// ! es negacion
        Nodox first= head; //Por va eliminar al inicio
        head= head.next;//Ahora la cabeza ñtiene que apuntar al siguiente
        first.next= null;// Ahora no esta apuntando a nada
        Longitud--;
    }
   }
   public void eliminarAlFinal(){
    if (!isEmptyList()) {//Lista no tiene que estar vacia
        if (head.next==null) {//Verifica que al menos hay un nodo
            head=null;
            Longitud--;
        }
        else{
            Nodox puntero=head;
            while (puntero.next.next!=null) {//va apuntando de 2 en 2
                puntero=puntero.next; //se va ir actualizando el puntero
            }
             puntero.next=null;
             Longitud--;
        }
    }
   }

   public void eliminarPosicion (int posicion){
    if(head!=null){//!isEmptyList
        Nodox first= head;
        head = head.next;
        first.next= null;
        Longitud --;
    }else if (posicion<Longitud) {
        Nodox puntero = head;
        int contador=0;
        while (contador<(posicion-1)) {
                puntero=puntero.next;
                contador++;
        }
        Nodox temporal= puntero.next;
        puntero.next=temporal.next;
        temporal.next=null;
        Longitud--;
    }
   }

}
