package PILAS;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
       pila mipila= new pila();
       mipila.apilar(1, "Erick", "Libro1");
       mipila.apilar(2, "Juan", "Libro2");
       mipila.apilar(3, "Brenda", "Libro3");

       
       /*System.out.println(mipila.length());
       mipila.destructor();
       System.out.println(mipila.length());*/

       System.out.println(mipila.length());
       mipila.desapilarN(2);
       System.out.println(mipila.length());
       
       
}
}

