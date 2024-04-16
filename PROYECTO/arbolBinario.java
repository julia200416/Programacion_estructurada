package PROYECTO;

import javax.print.attribute.standard.MediaSize.NA;

public class arbolBinario {
  Nodo raiz;
  public arbolBinario(){
    this.raiz=null;
  }
  public void insertar(int valor){
    raiz= insertarNodo(raiz,valor);
  }

  private Nodo insertarNodo(Nodo raizActual, int valor){
    if (raizActual==null) {
        return new Nodo(valor);
    }
    if (valor<raizActual.valor) {
        raizActual.izquierdo= insertarNodo(raizActual.izquierdo, valor);
    }
    else if(valor>raizActual.valor){
      raizActual.derecha= insertarNodo(raizActual.derecha, valor);

    }
      return raizActual;
  }

   public void inOrden(Nodo nodo){//Ordena de menor a mayor
    if (nodo!= null) {
      inOrden(nodo.izquierdo);
      System.out.println(nodo.valor+" ");
      inOrden(nodo.derecha);
    }
  }

  public void preOrden(Nodo nodo){
    if (nodo!= null) {
      System.out.println(nodo.valor+" ");
      preOrden(nodo.izquierdo);
      preOrden(nodo.derecha);
    }
  }

  public void postOrden (Nodo nodo){
    if (nodo!=null) {
      postOrden(nodo.izquierdo);
      postOrden(nodo.derecha);
      System.out.println(nodo.valor);
    }
  }

  public void eliminar(int valor){
    raiz = eliminarNodo(raiz, valor);
  }

  private Nodo eliminarNodo(Nodo raizActual, int valor){
    if (raizActual == null) {
      return raizActual;
    }
    if (valor < raizActual.valor) {
      raizActual.izquierdo = eliminarNodo(raizActual.izquierdo, valor);
    }
    else if (valor > raizActual.valor) {
      raizActual.derecha = eliminarNodo(raizActual.derecha, valor);
    }
    else{
      if (raizActual.izquierdo == null) {
        return raizActual.derecha;
      }else if (raizActual.derecha == null) {
        return raizActual.izquierdo;
      }
      Nodo sucesor = encontrarSucesor(raizActual.derecha);
      raizActual.valor= sucesor.valor;//el sucesor siempre va ser derecho y mayor
      raizActual.derecha= eliminarNodo(raizActual.derecha, sucesor.valor);
    }
    return raizActual;
  }

  private Nodo encontrarSucesor(Nodo nodo){
    Nodo actual= nodo;
    while (actual.izquierdo != null){
      actual = actual.izquierdo;
    }
    return actual;
  }

  public Nodo buscar(int valor){
    return buscarNodo(raiz, valor);
  }

  private Nodo buscarNodo(Nodo raizActual, int valor){
    if (raizActual== null || raizActual.valor== valor) {
      return raizActual;
    }
    if (valor < raizActual.valor) {
      return buscarNodo(raizActual.izquierdo, valor);
    }
    else{
      return buscarNodo(raizActual.derecha, valor);
    }
  }

  public int contarNodos(){
    return contarNodos(raiz);
  }
  private int contarNodos(Nodo nodo){
    if (nodo /*o raizActual*/== null) {
      return 0;
    }
    return 1 + contarNodos(nodo.izquierdo) + contarNodos(nodo.derecha);
  }
  
  public int alturaArbol(){
   return alturaArbol(raiz);
  }
  public int alturaArbol(Nodo nodo){
    if (nodo== null) {
      return 0;
    }
    return 1 + Math.max(alturaArbol(nodo.izquierdo), alturaArbol(nodo.derecha));
  }

  public int contarHojas(){
    return contarHojas(raiz);
  }

  public int contarHojas(Nodo nodo){
    if (nodo==null) {
      return 0;
    }
    if (nodo.izquierdo == null  && nodo.derecha==null) {
      return 1;
    }
    return contarHojas(nodo.izquierdo)+ contarHojas(nodo.derecha);
  }

  public int valorMinimo ( Nodo nodo){
    if (nodo == null) {
      throw new NullPointerException("Esta vacia");
    }
    if (nodo.izquierdo== null) {
      return nodo.valor;
    }
    return valorMinimo(nodo.izquierdo);
  }

  public int valorMaximo(Nodo nodo){
    if (nodo== null) {
      throw new NullPointerException("Esta vacia");
    }
    if (nodo.derecha == null) {
      return nodo.valor;
    }
    return valorMaximo(nodo.derecha);
  }
}