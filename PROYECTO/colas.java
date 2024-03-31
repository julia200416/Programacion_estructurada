package PROYECTO;

import PILAS.pila.Nodo;

public class colas {
    private NodoPedido cabeza,cola;
    public class NodoPedido {
       public int NumeroPedido;
       public String NombreCliente;
       public NodoPedido next=null;

       public NodoPedido (int NumPedido, String NombreCliente){
          this.NumeroPedido= NumPedido;
          this.NombreCliente= NombreCliente;
       }
        
    }
    public boolean isEmptyTail(){
        if (cabeza==null && cola==null) {
            return true;
        }else
            return false;
    }
    public void AgregarCola(int pedido, String cliente){
        NodoPedido NuevoPedido= new NodoPedido(pedido, cliente);
        if (cabeza==null && cola==null) {
            cabeza=NuevoPedido;
        }else{
            cola.next=NuevoPedido;
        }
        cola=NuevoPedido;
    }
    public void Eliminar(){
        if (cabeza!=null) {
            NodoPedido eliminar = cabeza;
            cabeza=cabeza.next;
            eliminar.next= null;
            if (cabeza==null) {
                cola=null;
            }
        }
    }
    public void obtener (){
        if (cabeza==null) {
            System.out.println("No hay elementos");
        }
        else{
            NodoPedido primero= cabeza;
            System.out.println("Los datos del pedido son: {id: " + primero.NumeroPedido + " cliente: " + primero.NombreCliente + "}");
             System.out.println(" id: " + primero.NumeroPedido + " cliente: " + primero.NombreCliente);
        }
    }
    public void obtenerSiguiente(){
        if (cabeza==null) {
            System.out.println("No hay elementos en la cola");
        }
        else{
            if (cabeza== null) {
                System.out.println("La cola solo tiene un elemento");
            }
            else{
             NodoPedido PeidoNext=cabeza.next;
             System.out.println("Los datos del siguiente pedido son: " + " id: " + PeidoNext.NumeroPedido + " cliente: " + PeidoNext.NombreCliente);
            }
        }
    }
}
