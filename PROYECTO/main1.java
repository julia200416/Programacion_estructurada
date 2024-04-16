package PROYECTO;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int op=0, op2=0;

        while (true) { //ABARCA TODAS LAS OPCIONES
            System.out.println("Bienvenido al menu principal");
            System.out.println("1. Listas enlazadas\n2. Colas\n3. Pilas \n4. Arboles \n5. Salir");
            int opm= entrada.nextInt();
            menu1:
            switch (opm) {//OPCIONES DEL MENU PRINCIPAL(listas,colas,pilas...)
                case 1:
                  System.out.println();
                  System.out.println("Usted esta en el menu de listas enlazadas");
                  
                 while (true) {//ABARCA TODAS LAS OPCIONES DE LISTAS(insertar...eliminar...)
                     System.out.println("Digite una opcion: \n  1. Insertar \n  2. Eliminar \n  3. Obtener nodo\n  4. Eliminar nodo \n  5. Salir al menu principal");
                     op=entrada.nextInt();
                    
                     menu2:
                      switch (op) {//OPCIONES DE LISTAS(insertar,eliminar, obtener...)
                         case 1: 
                         System.out.println();
                         System.out.println("Digite alguna opcion:\n  1. Insertar al inicio \n  2. Insertar al final\n  3. Insertar en posicion\n  4. Salir al menu de listas \n  5. Salir al menu principal");
                         listas listas= new listas();
                         op2= entrada.nextInt();
                         while (op2>5) {
                             System.out.println("ERROR!!!");
                             System.out.println();
                             System.out.println("Digite alguna opcion:\n  1. Insertar al inicio \n  2. Insertar al final\n  3. Insertar en posicion \n  4. Salir al menu de listas \n  5. Salir al menu principal");
                             op2=entrada.nextInt();
                            }
                         switch (op2) {//OP2 DE INSERTAR AL inicio,final o posicion
                            case 1:
                             System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                             
                             while (entrada.hasNext()) {//hasNext es MIENTRAS HALLA UN DATO VA A REPETIRSE EL BUCLE
                                RegresarListaVacia:  
                                if (entrada.hasNextInt()) {//hasNextInt dato de tipo de entero
                                     int input= entrada.nextInt();
                                     listas.InsertarAlInicio(input);
                                     System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                             
                                    }else{//seran datos de tipo string
                                     String input= entrada.next();
                                     if(input.equalsIgnoreCase("salir")) {
                                        System.out.println();
                                         System.out.println("Usted ha regresado al menu principal");
                                         break menu1;  
                                        }
                                     if (input.equalsIgnoreCase("regresar")){
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu de listas enlazadas.");
                                            break menu2;
                                        }
                                     if(input.equalsIgnoreCase("mostrar")) {
                                        if (listas.isEmptyList()) {
                                            System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                            System.out.println();
                                            System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                            String respuesta = entrada.next();
                                            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                                System.out.println("Error, opcion no valida");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                respuesta=entrada.next();
                                            }
                                            if (respuesta.equalsIgnoreCase("si")) {
                                                System.out.println("La lista de nodos es:");
                                                listas.mostrarNodox();
                                                break;
                                            }
                                            else if (respuesta.equalsIgnoreCase("no")) {
                                                System.out.println();
                                                System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                                break RegresarListaVacia;
                                            }
                                        }
                                          System.out.println("La lista de nodos es: ");
                                          listas.mostrarNodox();
                                          break;   
                                        }
                                     else{
                                         System.out.println("ERROR!!!");
                                         System.out.println();
                                         System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'mostrar' para ver las lista\n Digite 'salir' para regresar al menu pricipal");
                                         
                                        }
                                     
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                               
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de listas");
                                        break menu2;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                        //input=entrada.nextLine();
                                    }
                                    
                                }
                            case 2://Inserta al final
                             System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                             while(entrada.hasNext()){
                                RegresarListaVacia1:
                                 if(entrada.hasNextInt()){
                                     int input2 = entrada.nextInt();
                                     listas.insertarAlFinal(input2);
                                     System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                             
                                    }else{
                                     String input2= entrada.next();
                                     if(input2.equalsIgnoreCase("salir")){
                                        System.out.println();
                                         System.out.println("Usted ha regresado al menu principal");
                                         break menu1;
                                        }
                                    if (input2.equalsIgnoreCase("regresar")){
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu de listas enlazadas.");
                                            break menu2;
                                        }
                                     if(input2.equalsIgnoreCase("mostrar")) {
                                        if (listas.isEmptyList()) {
                                            System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                            System.out.println();
                                            System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                            String respuesta = entrada.next();
                                            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                                System.out.println("Error, opcion no valida");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                respuesta=entrada.next();
                                            }
                                            if (respuesta.equalsIgnoreCase("si")) {
                                                System.out.println("La lista de nodos es: ");
                                                listas.mostrarNodox();
                                                break;
                                            }
                                            else if (respuesta.equalsIgnoreCase("no")) {
                                                System.out.println();
                                                System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                                break RegresarListaVacia1;
                                            }
                                        }
                                         System.out.println("La lista de nodos es: ");
                                         listas.mostrarNodox();
                                         break;   
                                        }
                                     else{
                                         System.out.println("ERROR!!!");
                                         System.out.println();
                                         System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'mostrar' para ver las lista\n Digite 'salir' para regresar al menu pricipal");
         
                                        }
                                    }
                                
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                               
                                while (true) {
                                    String input2=entrada.next();
                                    if (input2.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input2.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input2.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de listas");
                                        break menu2;
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                        
                                    }
                                }

                             case 3://Inserta en posicion
                                    System.out.println("Ingrese un valor de tipo de entero");
                                    System.out.println(" Digite 'siguiente' para ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                 while (entrada.hasNext()) {
                                    RegresarListaVacia2:
                                     if (entrada.hasNextInt()) {
                                         int input3= entrada.nextInt();
                                         listas.insertarAlFinal(input3);
                                         System.out.println("Ingrese un valor de tipo de entero");
                                         System.out.println(" Digite 'siguiente' para ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                 
                                        }else{
                                         String input3=entrada.next();
                                         if(input3.equalsIgnoreCase("salir")){
                                            System.out.println();
                                             System.out.println("Usted ha regresado al menu principal'");
                                             break menu1;
                                            }
                                            if (input3.equalsIgnoreCase("regresar")){
                                                System.out.println();
                                                System.out.println("Usted ha regresado al menu de listas enlazadas.");
                                                break menu2;
                                            }
                                         if(input3.equalsIgnoreCase("siguiente")){
                                            if (listas.isEmptyList()) {
                                                System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lisya vacia? Digite si o no' ");
                                                String respuesta = entrada.next();
                                                while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                                    System.out.println("Error, opcion no valida");
                                                    System.out.println();
                                                    System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                    respuesta=entrada.next();
                                                }
                                                if (respuesta.equalsIgnoreCase("si")) {
                                                    System.out.println("La lista es:");
                                                    listas.mostrarNodox();
                                                    break;
                                                }
                                                else if (respuesta.equalsIgnoreCase("no")) {
                                                    System.out.println();
                                                    System.out.println("Ingrese un valor de tipo de entero");
                                                    System.out.println(" Digite 'siguiente' para ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                 
                                                    break RegresarListaVacia2;
                                                }
                                                
                                            }
                                             System.out.println("Digite la posicion: ");
                                             while (!entrada.hasNextInt()) {
                                                System.out.println("ERROR!! La posicion debe ser un numero entero");
                                                System.out.println();
                                                System.out.println("Digite la posicion:");
                                                entrada.next();
                                             }
                                             int posicion=entrada.nextInt();
                                             System.out.println("Digite el nuevo valor: ");
                                             while (!entrada.hasNextInt()) {
                                                System.out.println("ERROR!! El valor debe ser un numero entero");
                                                System.out.println();
                                                System.out.println("Digite el valor:");
                                                entrada.next();
                                             }
                                             int valor = entrada.nextInt();
                                             listas.InsetarEnPosicion(posicion, valor);
                                             listas.mostrarNodox();
                                             break;
                                            }
                                        else{
                                             System.out.println("ERROR!!!");
                                             System.out.println();
                                             System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'salir' para regresar al menu pricipal");
                                             System.out.println(" Digite 'siguiente' para ingresar la posicion");
                                        
                                            }
                                        }
                                    }
                                    System.out.println();
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                   
                                    while (true) {
                                        String input3=entrada.next();
                                        if (input3.equals("uno")) {
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (input3.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (input3.equalsIgnoreCase("tres")) {
                                            System.out.println();
                                            System.out.println("Ha regresado al menu de listas");
                                            break menu2;
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println();
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                            
                                        }
    
                                    }
                                //AGREGAR EN CASO DE QUE EL USUARIO INGRESE 
                                //OTRA OPCION DENTRO DEL INSERTAR
                                case 4:
                                    System.out.println();
                                    System.out.println("Usted esta en el menu de listas");
                                      break;
                                case 5: 
                                System.out.println();
                                    System.out.println("Usted esta en el menu principal");
                                      break menu1;

                            }//SWITCH//OP2 DE INSERTAR AL inicio,final o posicion
                          
                        break;

                         case 2://ELIMINAR
                             System.out.println("Digite alguna opcion:\n  1. Eliminar al inicio \n  2. Eliminar al final\n  3. Eliminar en posicion\n  4. Salir al menu de listas \n  5. Salir al menu principal");
                             listas listas2=new listas();
                             op2=entrada.nextInt();
                             while (op2>5) {
                                System.out.println("ERROR!!!");
                                System.out.println();
                                System.out.println("Digite alguna opcion:\n1. Eliminar al inicio \n2. Eliminar al final\n3. Eliminar en posicion\n5. Salir al menu de listas \n5. Salir al menu principal");
                                op2=entrada.nextInt();
                             }
                            switch (op2) {
                                case 1: //Eliminar al inicio
                                 System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                 while (entrada.hasNext()) {
                                    RegresarListaVacia11:
                                     if (entrada.hasNextInt()) {
                                          int input= entrada.nextInt();
                                         listas2.InsertarAlInicio(input);
                                         System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                 
                                        }
                                     else{
                                         String input= entrada.next();
                                         if (input.equalsIgnoreCase("salir")) {
                                              System.out.println();
                                              System.out.println("Usted ha regresado al menu principal");
                                             break menu1;
                                            }
                                        if (input.equalsIgnoreCase("regresar")){
                                                System.out.println();
                                                System.out.println("Usted ha regresado al menu de listas enlazadas.");
                                                break menu2;
                                            }
                                         if (input.equalsIgnoreCase("mostrar")) {
                                            if (listas2.isEmptyList()) {
                                                System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                String respuesta = entrada.next();
                                                while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                                System.out.println("Error, opcion no valida");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                respuesta=entrada.next();
                                                }
                                                if (respuesta.equalsIgnoreCase("Si")) {
                                                    System.out.println("La lista de nodos es: ");
                                                    listas2.mostrarNodox();
                                                    break;
                                                }
                                                else if (respuesta.equalsIgnoreCase("No")) {
                                                    System.out.println();
                                                    System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                                    break RegresarListaVacia11;
                                                }
                                            }

                                             System.out.println("La lista de nodos es: ");
                                             listas2.eliminarAlInicio();
                                             listas2.mostrarNodox();
                                             break;   
                                            }
                                         else{
                                             System.out.println("ERROR!!!");
                                             System.out.println();
                                             System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                            }
                                        }
                                    } 
                                    System.out.println();
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal\n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                       
                                    while (true) {
                                        String input=entrada.next();  
                                        if (input.equals("uno")) {
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (input.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (input.equalsIgnoreCase("tres")) {
                                            System.out.println();
                                            System.out.println("Ha regresado al menu de listas");
                                            break menu2;   
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println();
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                            
                                        }
                                    }
                                case 2: //eliminar al final
                                 System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                 while (entrada.hasNext()) {
                                    RegresarListaVacia22:
                                     if (entrada.hasNextInt()) {
                                         int input2 = entrada.nextInt();
                                         listas2.insertarAlFinal(input2);
                                         System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                 
                                    }else{
                                         String input2= entrada.next();
                                         if(input2.equalsIgnoreCase("salir")){
                                             System.out.println();
                                             System.out.println("Usted ha regresado al menu principal");
                                             break menu1;
                                            }
                                         if (input2.equalsIgnoreCase("regresar")){
                                                System.out.println();
                                                System.out.println("Usted ha regresado al menu de listas enlazadas.");
                                                break menu2;
                                            }
                                         if (input2.equalsIgnoreCase("mostrar")) {
                                            if (listas2.isEmptyList()) {
                                                System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                String respuesta = entrada.next();
                                                while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                                System.out.println("Error, opcion no valida");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                respuesta=entrada.next();
                                                }
                                                if (respuesta.equalsIgnoreCase("si")) {
                                                    System.out.println("La lista de nodos es:");
                                                    listas2.mostrarNodox();
                                                    break;
                                                }
                                                else if (respuesta.equalsIgnoreCase("no")) {
                                                    System.out.println();
                                                    System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                                    break RegresarListaVacia22;
                                                }
                                            }
                                             System.out.println("La lista de nodos es: ");
                                             listas2.eliminarAlFinal();
                                             System.out.println("Los nodos restantes son: "+ listas2.contarNodos());
                                             listas2.mostrarNodox();
                                             break;   
                                            }
                                         else{
                                             System.out.println("ERROR!!!");
                                             System.out.println();
                                             System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                            }
                                        }
                                    } 
                                    System.out.println();
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                    
                                    while (true) {
                                        String input2=entrada.next();
                                        if (input2.equals("uno")) {
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (input2.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (input2.equalsIgnoreCase("tres")) {
                                            System.out.println();
                                            System.out.println("Ha regresado al menu de listas");
                                            break menu2;
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println();
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal\n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas ");
                                            
                                        }
                                    }               

                                case 3: //eliminar en posicion
                                 System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo de entero \n Digite 'siguiente' para ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                 while (entrada.hasNext()) {
                                    RegresarListaVacia33:
                                     if (entrada.hasNextInt()) {
                                         int input3= entrada.nextInt();
                                         listas2.insertarAlFinal(input3);
                                         System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo de entero \n Digite 'siguiente' para ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                 
                                        }else{//seran datos de tipo string
                                         String input3= entrada.next();
                                         if(input3.equalsIgnoreCase("salir")) {
                                             System.out.println();
                                             System.out.println("Usted ha regresado al menu principal");
                                             break menu1;  
                                            }
                                         if (input3.equalsIgnoreCase("regresar")){
                                                System.out.println();
                                                System.out.println("Usted ha regresado al menu de listas enlazadas.");
                                                break menu2;
                                            }
                                         if(input3.equalsIgnoreCase("siguiente")) {
                                             if(listas2.isEmptyList()) {
                                                System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                String respuesta = entrada.next();
                                                while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                                System.out.println("Error, opcion no valida");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                respuesta=entrada.next();
                                                }
                                                if (respuesta.equalsIgnoreCase("si")) {
                                                    System.out.println("La lista es:");
                                                    listas2.mostrarNodox();
                                                    break;
                                                }
                                                else if (respuesta.equalsIgnoreCase("no")) {
                                                    System.out.println();
                                                    System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo de entero \n Digite 'siguiente' para ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                                    break RegresarListaVacia33;
                                                }
                                            }
                                             System.out.println();
                                             System.out.println("Digite la posicion para eliminar: ");
                                             while(!entrada.hasNextInt()){
                                                 System.out.println("ERROR!!! La posicion debe ser un numero entero");
                                                 System.out.println();
                                                 System.out.println("Digite la posicion para eliminar:");
                                                 entrada.next();
                                                }
                                             int posicion= entrada.nextInt();
                                             System.out.println();
                                             System.out.println("Digite el nuevo valor:");
                                             while(!entrada.hasNextInt()){
                                                 System.out.println("ERROR!!! El valor debe ser un numero entero");
                                                 System.out.println();
                                                 System.out.println("Digite el nuevo valor:");
                                                 entrada.next();
                                               }
                                             int valor=entrada.nextInt();
                                             System.out.println("La lista es:");
                                             listas2.Eliminarenposicion(posicion, valor);
                                             listas2.mostrarNodox();
                                             break;   
                                            }
                                        else{
                                             System.out.println("ERROR!!!");
                                             System.out.println();
                                             System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo de entero \n Digite 'siguiente' para ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                   
                                            }
                                        }
                                    } 
                                    System.out.println();
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                    
                                    while (true) {
                                        String input3=entrada.next();
                                        if (input3.equals("uno")) {
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (input3.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (input3.equalsIgnoreCase("tres")) {
                                            System.out.println();
                                            System.out.println("Ha regresado al menu de listas");
                                            break menu2;   
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println();
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                            
                                        }
                                    }
                                    case 4: 
                                       System.out.println();
                                       System.out.println("Usted esta en el menu de listas");
                                       break;
                                    case 5: 
                                       System.out.println();
                                       System.out.println("Usted esta en el menu principal");
                                       break menu1;
                                  
                            }
                           break; 

                         case 3: // OBTENER NODO
                         System.out.println("Digite una opcion: \n Ingrese un valor de tipo de entero\n Digite 'siguiente' para pasar a ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                         listas listas3= new listas();
                         while (entrada.hasNext()) {
                            RegresarListaVacia111:
                             if (entrada.hasNextInt()) {
                                 int input= entrada.nextInt();
                                 listas3.insertarAlFinal(input);
                                 System.out.println("Digite una opcion: \n Ingrese un valor de tipo de entero\n Digite 'siguiente' para pasar a ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                         
                                }else{//seran datos de tipo string
                                     String input= entrada.next();
                                     if(input.equalsIgnoreCase("salir")) {
                                     System.out.println();
                                     System.out.println("Usted ha regresado al menu principal");
                                     break menu1;  
                                    }
                                if (input.equalsIgnoreCase("regresar")){
                                    System.out.println();
                                        System.out.println("Usted ha regresado al menu de listas enlazadas.");
                                        break menu2;
                                    }
                                 if(input.equalsIgnoreCase("siguiente")) {
                                    if(listas3.isEmptyList()) {
                                            System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                            System.out.println();
                                            System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                            String respuesta = entrada.next();
                                            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                                System.out.println("Error, opcion no valida");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                respuesta=entrada.next();
                                            }
                                        if (respuesta.equalsIgnoreCase("si")) {
                                            System.out.println("La lista es:");
                                            listas3.mostrarNodox();
                                            break;
                                        }
                                        else if (respuesta.equalsIgnoreCase("no")) {
                                            System.out.println();
                                            System.out.println("Digite una opcion: \n Ingrese un valor de tipo de entero\n Digite 'siguiente' para pasar a ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                         
                                            break RegresarListaVacia111;
                                        }
                                    }
                                     System.out.println();
                                     System.out.println("Digite la posicion del nodo: ");
                                     while(!entrada.hasNextInt()){
                                         System.out.println("ERROR!!! La posicion debe ser un numero entero");
                                         System.out.println();
                                         System.out.println("Digite la posicion del nodo:");
                                         entrada.next();
                                        }
                                     int posicion= entrada.nextInt();
                                     listas3.obtenerNodo(posicion);
                                     System.out.println("La lista es:");
                                     listas3.mostrarNodoEnPosicion(posicion);
                                     //listas3.mostrarNodox();
                                     break;   
                                    }
                                 else{
                                     System.out.println("ERROR!!!");
                                     System.out.println();
                                     System.out.println("Digite una opcion: \n Ingrese un valor de tipo de entero\n Digite 'siguiente' para pasar a ingresar la posicion\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                                    }
                                }
                            }
                            System.out.println();
                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                            
                            while (true) {
                                String input3=entrada.next();
                                if (input3.equals("uno")) {
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menu principal");
                                    break menu1;
                                }
                                if (input3.equalsIgnoreCase("dos")) {
                                    System.out.println("Adios amigo:)");
                                    return;   
                                }
                                if (input3.equalsIgnoreCase("tres")) {
                                    System.out.println();
                                    System.out.println("Ha regresado al menu de listas");
                                    break menu2;   
                                }
                                else{
                                    System.out.println("ERROR!!!");
                                    System.out.println();
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                    
                                }
                            }
                         case 4:// ELIMINAR
                         System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo entero\n Digite 'siguiente' para ingresar la posicion \n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                         
                         listas listas4= new listas();
                          while (entrada.hasNext()) {
                            RegresarListaVacia44:
                             if (entrada.hasNextInt()) {
                                 int input2= entrada.nextInt();
                                 listas4.insertarAlFinal(input2);
                                 System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo entero\n Digite 'siguiente' para ingresar la posicion \n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                         
                                }else{//seran datos de tipo string
                                 String input2= entrada.next();
                                 if(input2.equalsIgnoreCase("salir")) {
                                     System.out.println();
                                     System.out.println("Usted ha regresado al menu principal");
                                     break menu1;  
                                    }
                                 if (input2.equalsIgnoreCase("regresar")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu de listas enlazadas.");
                                        break menu2;
                                    }
                                 if(input2.equalsIgnoreCase("siguiente")) {
                                    if(listas4.isEmptyList()) {
                                        System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                        System.out.println();
                                        System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                        String respuesta = entrada.next();
                                        while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                            System.out.println("Error, opcion no valida");
                                            System.out.println();
                                            System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                            respuesta=entrada.next();
                                        }
                                        if (respuesta.equalsIgnoreCase("si")) {
                                            System.out.println("La lista es:");
                                            listas4.mostrarNodox();
                                            break;
                                        }
                                        else if (respuesta.equalsIgnoreCase("no")) {
                                            System.out.println();
                                            System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo entero\n Digite 'siguiente' para ingresar la posicion \n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                         
                                            break RegresarListaVacia44;
                                        }
                                     System.out.println();
                                     System.out.println("Digite la posicion para eliminar: ");
                                     while (!entrada.hasNextInt()) {
                                         System.out.println("ERROR!!! La posicion debe ser un numero entero");
                                         System.out.println();
                                         System.out.println("Digite la posicion:");
                                         entrada.next();
                                        }
                                     int posicion= entrada.nextInt();
                                     listas4.eliminarNodo(posicion);
                                     System.out.println("La lista es:");
                                     listas4.mostrarNodox();
                                     break;   
                                    }
                                 else{
                                     System.out.println("ERROR!!!");
                                     System.out.println();
                                     System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo entero\n Digite 'siguiente' para ingresar la posicion \n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de listas enlazadas");
                         
                                    }
                                }   
                            }
                            System.out.println();
                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                            
                            while (true) {
                                String input2=entrada.next();
                                if (input2.equals("uno")) {
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menu principal");
                                    break menu1;
                                }
                                if (input2.equalsIgnoreCase("dos")) {
                                    System.out.println("Adios amigo:)");
                                    return;   
                                }
                                if (input2.equalsIgnoreCase("tres")) {
                                    System.out.println();
                                    System.out.println("Ha regresado al menu de listas");
                                    break menu2;   
                                }
                                else{
                                    System.out.println("ERROR!!!");
                                    System.out.println();
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                }
                            }}
                               
                         case 5: 
                                  System.out.println();
                                  System.out.println("Usted ha regresado al menu principal");
                            break menu1;
                            default:System.out.println("ERROR!!, esa opcion no es valida");
                                    System.out.println();
                            break;

                        }//SWITCH-OP-//OPCIONES DE LISTAS(insertar,eliminar, obtener...)
                        
                    }//WHILE //ABARCA TODAS LAS OPCIONES DE LISTAS(insertar,eliminar, obtener...)
                case 2:
                      System.out.println();
                      System.out.println("Usted esta en el menu de colas");
                        
                      while (true) {
                        System.out.println("Digite una opcion: \n  1. Insertar cola \n  2. Eliminar cola \n  3. Obtener siguiente \n  4. Salir al menu principal");
                        op=entrada.nextInt();
                        colas:
                        switch (op) {
                            case 1: //Agregar cola
                              System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas \n Digite el numero del pedido:");
                              colas colasPedidos= new colas();

                                while (entrada.hasNext()) {//hasNext es MIENTRAS HALLA UN DATO VA A REPETIRSE EL BUCLE
                                    Regresarcolavacia:
                                    if (entrada.hasNextInt() && entrada.hasNextLine()) {//hasNextInt dato de tipo de entero
                                        int numeroPedido= entrada.nextInt();
                                        entrada.nextLine();
                                        System.out.println();
                                        System.out.println("Digite el nombre del cliente:");
                                        String nombreCliente= entrada.nextLine();
                                        while (!nombreCliente.matches("[a-z A-Z]+")){
                                            System.out.println("ERROR!!! El nombre del cliente no debe ser un numero");
                                            System.out.println();
                                            System.out.println("Digite el nombre del cliente: ");
                                            nombreCliente=entrada.nextLine();
                                        }
                                        colasPedidos.AgregarCola(numeroPedido, nombreCliente);
                                        
                                        System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas \n Digite el numero del pedido:");
                             
                                        }else{//seran datos de tipo string
                                        String input= entrada.next();
                                         if (input.equalsIgnoreCase("salir")) {
                                             System.out.println();
                                             System.out.println("Usted ha regresado al menu principal");
                                             break menu1;  
                                            }
                                        if (input.equalsIgnoreCase("regresar")){
                                            System.out.println();
                                                System.out.println("Usted ha regresado al menu de colas.");
                                                break colas;
                                            }
                                         if(input.equalsIgnoreCase("obtener")){
                                            if (colasPedidos.isEmptyTail()) {
                                                System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                String respuesta = entrada.next();
                                                while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                                    System.out.println("Error, opcion no valida");
                                                    System.out.println();
                                                    System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                    respuesta=entrada.next();
                                                }
                                                if (respuesta.equalsIgnoreCase("si")) {
                                                    System.out.println("La lista es:");
                                                    colasPedidos.obtener();
                                                    break;
                                                }
                                                else if (respuesta.equalsIgnoreCase("no")) {
                                                    System.out.println();
                                                    System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas \n Digite el numero del pedido:");
                             
                                                    break Regresarcolavacia;
                                                }
                                            }
                                                System.out.println("La lista de colas es: ");
                                                colasPedidos.obtener();
                                                break;
                                            }
                                         else{
                                             System.out.println("ERROR!!!");
                                             System.out.println();
                                             System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas \n Digite el numero del pedido:");
                                            }
                                        }
                                    }
                                    System.out.println();
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                    String input=entrada.next();
                                    while(true){
                                        if (input.equals("uno")) {
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (input.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (input.equalsIgnoreCase("tres")) {
                                            System.out.println();
                                            System.out.println("Ha regresado al menu de colas");
                                            break colas;   
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println();
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                            input=entrada.next();
                                        }

                                    }
                                case 2: //eliminar cola
                                System.out.println("Digite alguna opcion: \n Digite 'siguiente' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas");
                             
                                System.out.println(" Digite el numero de pedido: ");
                                colas colass= new colas();
                                while (entrada.hasNext()) {
                                    Regresarcolavacia1:
                                    if (entrada.hasNextInt() && entrada.hasNextLine()) {
                                        int pedido = entrada.nextInt();
                                        entrada.nextLine();
                                        System.out.println();
                                        System.out.println("Digite el nombre del cliente: ");
                                        String cliente = entrada.nextLine();
                                        while (!cliente.matches("[a-z A-Z]+")) {
                                            System.out.println("ERROR!!! No debe ser un numero ni un caracter, sino un nombre");
                                            System.out.println();
                                            System.out.println("Digite el nombre del cliente: ");
                                            cliente=entrada.nextLine();
                                        }
                                        colass.AgregarCola(pedido, cliente);
                                        System.out.println();
                                        System.out.println("Digite alguna opcion: \n Digite 'siguiente' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas");
                                        System.out.println(" Digite el numero de pedido: ");
                                    
                                    }
                                    else{
                                        String input1 = entrada.next();

                                        if(input1.equalsIgnoreCase("salir")){
                                             System.out.println();
                                             System.out.println("Usted ha regresado al menu principal.");
                                             break menu1;
                                            }
                                        if (input1.equalsIgnoreCase("regresar")){
                                             System.out.println();
                                             System.out.println("Usted ha regresado al menu de colas.");
                                             break colas;
                                            }
                                        if(input1.equalsIgnoreCase("siguiente")){
                                            if (colass.isEmptyTail() ) {
                                                System.out.println("Advertencia!! No se ingreso ningun valor a la lista");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                String respuesta = entrada.next();
                                                while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                                    System.out.println("Error, opcion no valida");
                                                    System.out.println();
                                                    System.out.println("¿Desea continuar con la lista vacia? Digite 'si' o 'no' ");
                                                    respuesta=entrada.next();
                                                }
                                                if (respuesta.equalsIgnoreCase("si")) {
                                                    System.out.println("La lista es:");
                                                    colass.obtener();
                                                    break;
                                                }
                                                else if (respuesta.equalsIgnoreCase("no")) {
                                                    System.out.println();
                                                    System.out.println("Digite alguna opcion: \n Digite 'siguiente' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas");
                                                    System.out.println(" Digite el numero de pedido: ");
                                
                                                    break Regresarcolavacia1;
                                                }
                                            }
                                            colass.Eliminar();
                                            System.out.println("El id y el cliente que elimino es: ");
                                            colass.obtener();
                                            break;
                                            
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println();
                                            System.out.println("Digite alguna opcion: \n Digite 'siguiente' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas");
                                            System.out.println(" Digite el numero de pedido: ");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                    String inpu=entrada.next();
                                    while(true){
                                        if (inpu.equals("uno")) {
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (inpu.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (inpu.equalsIgnoreCase("tres")) {
                                            System.out.println();
                                            System.out.println("Ha regresado al menu de colas");
                                            break colas;   
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println();
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                            inpu=entrada.next();
                                        }

                                    }
                                case 3:// obtener siguiente 
                                 System.out.println();
                                 System.out.println("Digite alguna opcion: \n Digite 'siguiente' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas");
                                 System.out.println(" Digite el numero de pedido: ");
                                 colas colass1= new colas();
                                  while (entrada.hasNext()) {
                                     Regresarcolavacia2:
                                     if (entrada.hasNextInt() && entrada.hasNextLine()) {
                                         int input11= entrada.nextInt();
                                         entrada.nextLine();
                                         System.out.println();
                                         System.out.println("Digite el nombre del cliente: ");
                                         String cliente= entrada.nextLine();
                                        while (!cliente.matches("[a-z A-Z]+")) {
                                             System.out.println("Error, Debe ser un nombre");
                                             System.out.println();
                                             System.out.println("Digite el nombre del cliente:");
                                             cliente= entrada.nextLine();
                                            }
                                        colass1.AgregarCola(input11, cliente);
                                        System.out.println();
                                        System.out.println("Digite alguna opcion: \n Digite 'siguiente' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas");
                                        System.out.println(" Digite el numero de pedido: ");
                                        }
                                     else{
                                         String inputt = entrada.next();
                                        if(inputt.equalsIgnoreCase("siguiente")){
                                          if(colass1.isEmptyTail()){
                                             System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la cola. ");
                                             System.out.println();
                                             System.out.println("Desea continuar con la cola vacia? digite si o digite no");
                                             String respuesta = entrada.next();
                                            while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println();
                                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                            respuesta=entrada.next();
                                            }
                                          if(respuesta.equalsIgnoreCase("si")){
                                            System.out.println("La lista es: ");
                                            colass1.obtener();
                                            break;
                                            }
                                          if(respuesta.equalsIgnoreCase("no")){
                                            System.out.println();
                                            System.out.println("Digite alguna opcion: \n Digite 'siguiente' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas");
                                            System.out.println(" Digite el numero de pedido: ");
                                            break Regresarcolavacia2;
                                            }
                                            }
                                            System.out.println("El siguiente pedido es:");
                                            colass1.obtener();
                                            break;
                                        }
                                        if(inputt.equalsIgnoreCase("salir")){
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (inputt.equalsIgnoreCase("regresar")){
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu de colas.");
                                            break colas;
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println();
                                            System.out.println("Digite alguna opcion: \n Digite 'siguiente' para ver la lista de colas \n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de colas");
                                            System.out.println(" Digite el numero de pedido: ");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                String input2=entrada.next();
                                while (true) {
                                    if (input2.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input2.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input2.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de colas");
                                        break colas;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa\n Digite 'tres' para regresar al menu de colas");
                                        input2=entrada.next();
                                        
                                    }
                                    
                                }//
                                case 4: 
                                System.out.println();
                                   System.out.println("Usted ha regresado al menu principal");
                                   break menu1;
                                   default:System.out.println("ERROR!! esa opcion no es valida");
                                   System.out.println();
                                   break;    

                        }
                      }
                 
                case 3:
                    System.out.println();
                    System.out.println("Usted esta en el menu de pilas");
                    while(true){
                        System.out.println("Digite una opcion: \n  1. Apilar pilas \n  2. Desapilar N pila \n  3. Destruir \n  4. Salir al menu principal");
                        op=entrada.nextInt();
                        pilas:
                        switch (op) {
                            case 1://Apilar pilas
                               System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                               System.out.println(" Digite el numero del libro: ");
                               pilas pilass= new pilas();
                               while (entrada.hasNext()) {
                                  Regresarpilavacia:
                                 if (entrada.hasNextInt() && entrada.hasNextLine()) {
                                     int numero=entrada.nextInt();
                                     entrada.nextLine();
                                     System.out.println();
                                     System.out.println("Digite el nombre del autor");
                                     String autor= entrada.nextLine();
                                     while (!autor.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El autor debe ser un nombre");
                                         System.out.println();
                                         System.out.println("Digite el nombre del autor");
                                         autor=entrada.nextLine();
                                        }
                                     System.out.println();
                                     System.out.println("Digite el titulo del libro");
                                     String libro= entrada.nextLine();
                                     while (!libro.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El titulo debe ser un nombre");
                                         System.out.println();
                                         System.out.println("Digite el titulo del libro");
                                         libro=entrada.nextLine();
                                        }
                                     pilass.apilar(numero, autor, libro);
                                     System.out.println();
                                     System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                             
                                     System.out.println(" Digite el numero de libro: ");
                                    }else{ 
                                    String input= entrada.next();
                                     if (input.equalsIgnoreCase("salir")) {
                                        System.out.println();
                                         System.out.println("Usted ha regresado al menu principal");
                                         break menu1;  
                                        }
                                     if (input.equalsIgnoreCase("regresar")){
                                        System.out.println();
                                         System.out.println("Usted ha regresado al menu de pilas.");
                                         break pilas;
                                        }
                                     if(input.equalsIgnoreCase("obtener")){
                                         if (pilass.isEmptyList()) {
                                            System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la pila. ");
                                            System.out.println();
                                            System.out.println("Desea continuar con la pila vacia? digite si o digite no");
                                            String respuesta = entrada.next();
                                           while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                           System.out.println("Error, opcion no valida.");
                                           System.out.println();
                                           System.out.println("Desea continuar con la pila vacia? digite si o digite no");
                                           respuesta=entrada.next();
                                           }
                                         if(respuesta.equalsIgnoreCase("si")){
                                           System.out.println("La lista es: ");
                                           pilass.obtenerTope();
                                           break;
                                           }
                                         if(respuesta.equalsIgnoreCase("no")){
                                           System.out.println();
                                           System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                                           System.out.println(" Digite el numero del libro: ");
                                           break Regresarpilavacia;
                                           }
                                         }
                                         System.out.println("La lista de pilas es: ");
                                         pilass.obtenerTope();
                                         break;
                                        }
                                    else{
                                         System.out.println("ERROR!!!");
                                         System.out.println();
                                         System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                             
                                         System.out.println(" Digite el numero del libro: ");
                                        }
                                    }
                                }    
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de pilas");
                                        break pilas;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
                                        input=entrada.nextLine();
                                    }   
                                }
                               

                            case 2://Desapilar N pila 
                             System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                              
                             System.out.println(" Digite el numero del libro: ");
                             pilas pilas1= new pilas();
                             while (entrada.hasNext()) {
                                Regresarpilavacia1:
                                if (entrada.hasNextInt()) {
                                    //entrada.nextLine();
                                    int numero=entrada.nextInt();
                                    entrada.nextLine();
                                    System.out.println();
                                    System.out.println("Digite el nombre del autor");
                                    String autor= entrada.nextLine();
                                    while (!autor.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El autor debe ser un nombre");
                                         System.out.println();
                                         System.out.println("Digite el nombre del autor");
                                         autor=entrada.nextLine();
                                        }
                                    System.out.println();
                                    System.out.println("Digite el titulo del libro");
                                    String libro= entrada.nextLine();
                                    while (!libro.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El titulo debe ser un nombre");
                                         System.out.println();
                                         System.out.println("Digite el titulo del autor");
                                         libro=entrada.nextLine();
                                        }

                                    pilas1.apilar(numero, autor, libro);
                                    System.out.println();
                                    System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                             
                                    System.out.println(" Digite el numero de libro: ");
                                   }else{ 
                                   String input= entrada.next();
                                    if (input.equalsIgnoreCase("salir")) {
                                         System.out.println();
                                         System.out.println("Usted ha regresado al menu principal");
                                         break menu1;  
                                        }
                                    if(input.equalsIgnoreCase("regresar")){
                                        System.out.println();
                                            System.out.println("Usted ha regresado al menu de pilas.");
                                            break pilas;
                                        }
                                    if(input.equalsIgnoreCase("obtener")){
                                        if (pilas1.isEmptyList()) {
                                            System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la pila. ");
                                            System.out.println();
                                            System.out.println("Desea continuar con la pila vacia? digite si o digite no");
                                            String respuesta = entrada.next();
                                           while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                           System.out.println("Error, opcion no valida.");
                                           System.out.println();
                                           System.out.println("Desea continuar con la pila vacia? digite si o digite no");
                                           respuesta=entrada.next();
                                           }
                                         if(respuesta.equalsIgnoreCase("si")){
                                           System.out.println("La lista es: ");
                                           pilas1.obtenerTope();
                                           break;
                                           }
                                         if(respuesta.equalsIgnoreCase("no")){
                                           System.out.println();
                                           System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                                           System.out.println(" Digite el numero del libro: ");
                                           break Regresarpilavacia1;
                                           }
                                        }
                                        System.out.println();
                                        System.out.println("Digite la cantidad a desapilar: ");
                                        
                                        while (!entrada.hasNextInt()) {
                                            System.out.println("ERROR!!! Debe ser un numero entero");
                                            System.out.println();
                                            System.out.println("Digite la cantidad a desapilar:");
                                            entrada.next();
                                          }
                                        int cantidad= entrada.nextInt();
                                        System.out.println("La lista de pilas es: ");
                                        System.out.println(pilas1.length());
                                        pilas1.desapilarN(cantidad);
                                        System.out.println(pilas1.length());
                                        break;
                                      }
                                   else{
                                         System.out.println("ERROR!!!");
                                         System.out.println();
                                         System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                                         System.out.println(" Digite el numero del libro: ");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de pilas");
                                        break pilas;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
                                        input=entrada.nextLine();
                                    }   
                                }


                            case 3: //Destruir pila
                              System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                              System.out.println(" Digite el numero del libro: ");
                              pilas pilas2= new pilas();
                              while (entrada.hasNext()) {
                                Regresarpilavacia2:
                                if (entrada.hasNextInt() && entrada.hasNextLine()) {
                                    int numero=entrada.nextInt();
                                    entrada.nextLine();
                                    System.out.println();
                                    System.out.println("Digite el nombre del autor");
                                    String autor= entrada.nextLine();
                                    while (!autor.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El autor debe ser un nombre");
                                         System.out.println();
                                         System.out.println("Digite el nombre del autor");
                                         autor=entrada.nextLine();
                                        }   
                                        System.out.println();
                                    System.out.println("Digite el titulo del libro");
                                    String libro= entrada.nextLine();
                                    while (!libro.matches("[a-z A-Z]+")) {
                                        System.out.println("ERROR!!! El titulo debe ser un nombre");
                                        System.out.println();
                                        System.out.println("Digite el titulo del libro");
                                        libro=entrada.nextLine();
                                    }
                                    pilas2.apilar(numero, autor, libro);
                                    System.out.println();
                                    System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                             
                                    System.out.println(" Digite el numero de libro: ");
                                   }else{ 
                                   String input= entrada.next();
                                    if (input.equalsIgnoreCase("salir")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;  
                                    }
                                    if(input.equalsIgnoreCase("regresar")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu de pilas.");
                                        break pilas;
                                    }
                                    if(input.equalsIgnoreCase("obtener")){
                                        if (pilas2.isEmptyList()) {
                                            System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la pila. ");
                                            System.out.println();
                                            System.out.println("¿Desea continuar con la pila vacia? digite si o digite no");
                                            String respuesta = entrada.next();
                                           while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                           System.out.println("Error, opcion no valida.");
                                           System.out.println();
                                           System.out.println("¿Desea continuar con la pila vacia? digite si o digite no");
                                           respuesta=entrada.next();
                                           }
                                         if(respuesta.equalsIgnoreCase("si")){
                                           System.out.println("La lista es: ");
                                           pilas2.obtenerTope();
                                           break;
                                           }
                                         if(respuesta.equalsIgnoreCase("no")){
                                           System.out.println();
                                           System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                                           System.out.println(" Digite el numero del libro: ");
                                           break Regresarpilavacia2;
                                           }
                                        }
                                        System.out.println("La lista de pilas es: ");
                                        System.out.println(pilas2.length());
                                        pilas2.destructor();
                                        System.out.println(pilas2.length());
                                        break;
                                      }
                                   else{
                                         System.out.println("ERROR!!!");
                                         System.out.println();
                                         System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal \n Digite 'regresar' para volver al menu de pilas");
                                         System.out.println(" Digite el numero del libro: ");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal\n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de pilas");
                                        break pilas;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
                                        input=entrada.nextLine();
                                    }   
                                }

                            case 4:
                            System.out.println();
                            System.out.println("Usted ha regresado al menu principal");
                             break menu1;
                             default:
                             System.out.println();
                             System.out.println("ERROR!! esa opcion no es valida");
                             break;
                        }
                    }
                 case 4:
                    System.out.println();
                    System.out.println("Usted esta en el menu de árboles");
                       while (true) {
                        System.out.println("Digite una opcion: \n  1. Ordenar en 'inorder' \n  2. Ordenar en 'pre-orden' \n  3. Ordenar en 'post-orden' \n  4. Eliminar un nodo \n  5. Buscar un nodo \n  6. Contar hojas \n  7. Contar nodos \n  8. Altura del arbol \n  9. Valor menor \n  10. Valor mayor \n  11. Salir al menu principal");
                        op= entrada.nextInt();
                        arbol:
                        switch (op) {//inorder
                            case 1:
                                System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                arbolBinario arbol= new arbolBinario();
                                while (entrada.hasNext()) {
                                    Regresararbolvacio:
                                    if (entrada.hasNextInt()) {
                                        int nodo= entrada.nextInt();
                                        arbol.insertar(nodo);
                                        System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                
                                    }
                                    else{
                                        String input= entrada.next();
                                        if(input.equalsIgnoreCase("salir")){
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu prinicipal.");
                                            break menu1;
                                        }
                                        if(input.equalsIgnoreCase("regresar")){
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu de arboles.");
                                            break arbol;
                                        }
                                        if(input.equalsIgnoreCase("obtener")){
                                            if (arbol.raiz==null) {
                                                System.out.println("ADVERTENCIA!!. No se ingresó ningún valor en el arbol. ");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con el arbol vacio? digite 'si' o digite 'no' ");
                                                String respuesta = entrada.next();
                                               while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                               System.out.println("Error, opcion no valida.");
                                               System.out.println();
                                               System.out.println("Desea continuar con el arbol vaci0? digite 'si' o digite 'no' ");
                                               respuesta=entrada.next();
                                               }
                                             if(respuesta.equalsIgnoreCase("si")){
                                               System.out.println("El arbol esta vacio ");
                                               break;
                                               }
                                             if(respuesta.equalsIgnoreCase("no")){
                                               System.out.println();
                                               System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                               break Regresararbolvacio;
                                               }
                                            }
                                            System.out.println("El orden del arbol es: ");
                                            arbol.inOrden(arbol.raiz);
                                            break;
                                        }
                                        else{
                                            System.out.println("Error, opcion no valida");
                                            System.out.println();
                                            System.out.println("Digite los nodos del arbol \n Digite 'salir' para regresar al menu principal \n Digite 'obtener' para mostrar el arbol. \n Digite 'regresar' para volver al menu de arboles");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println("Ha regresado al menu de arboles");
                                        break arbol;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                        input=entrada.nextLine();
                                    }   
                                }
                            case 2:// pre-orden
                            System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                            arbolBinario arbol1= new arbolBinario();
                             while (entrada.hasNext()) {
                                Regresararbolvacio1:
                                if (entrada.hasNextInt()) {
                                    int nodo= entrada.nextInt();
                                    arbol1.insertar(nodo);
                                    System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                
                                }
                                else{
                                    String input= entrada.next();
                                    if(input.equalsIgnoreCase("salir")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal.");
                                        break menu1;
                                    }
                                    if(input.equalsIgnoreCase("regresar")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu de arboles.");
                                        break arbol;
                                    }
                                    if(input.equalsIgnoreCase("obtener")){
                                        if (arbol1.raiz==null) {
                                            System.out.println("ADVERTENCIA!!. No se ingresó ningún valor en el arbol. ");
                                            System.out.println();
                                            System.out.println("¿Desea continuar con el arbol vacio? digite 'si' o digite 'no' ");
                                            String respuesta = entrada.next();
                                           while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                           System.out.println("Error, opcion no valida.");
                                           System.out.println();
                                           System.out.println("Desea continuar con el arbol vaci0? digite 'si' o digite 'no' ");
                                           respuesta=entrada.next();
                                           }
                                         if(respuesta.equalsIgnoreCase("si")){
                                           System.out.println("El arbol esta vacio ");
                                           break;
                                           }
                                         if(respuesta.equalsIgnoreCase("no")){
                                           System.out.println();
                                           System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                           break Regresararbolvacio1;
                                           }
                                        }
                                        System.out.println("El preorden del arbol es: ");
                                        arbol1.preOrden(arbol1.raiz);
                                        break;
                                    }
                                    else{
                                        System.out.println("Error, opcion no valida");
                                        System.out.println();
                                        System.out.println("Digite los nodos del arbol \n Digite 'salir' para regresar al menu principal \n Digite 'obtener' para mostrar el arbol. \n Digite 'regresar' para volver al menu de arboles");
                                        
                                    }
                                }
                             }
                             System.out.println();
                             System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de arboles");
                                        break arbol;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                        input=entrada.nextLine();
                                    }   
                                }

                            case 3:// post-orden
                             System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                             arbolBinario arbol2= new arbolBinario();
                             while (entrada.hasNext()) {
                                  Regresararbolvacio2:
                                 if (entrada.hasNextInt()) {
                                     int nodo= entrada.nextInt();
                                     arbol2.insertar(nodo);
                                     System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                             
                                    }
                                else{
                                     String input= entrada.next();
                                    if(input.equalsIgnoreCase("salir")){
                                         System.out.println();
                                         System.out.println("Usted ha regresado al menu principal.");
                                         break menu1;
                                        }
                                    if(input.equalsIgnoreCase("regresar")){
                                         System.out.println();
                                         System.out.println("Usted ha regresado al menu de arboles.");
                                         break arbol;
                                        }
                                    if(input.equalsIgnoreCase("obtener")){
                                        if (arbol2.raiz==null) {
                                            System.out.println("ADVERTENCIA!!. No se ingresó ningún valor en el arbol. ");
                                            System.out.println();
                                            System.out.println("¿Desea continuar con el arbol vacio? digite 'si' o digite 'no' ");
                                            String respuesta = entrada.next();
                                           while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                           System.out.println("Error, opcion no valida.");
                                           System.out.println();
                                           System.out.println("Desea continuar con el arbol vaci0? digite 'si' o digite 'no' ");
                                           respuesta=entrada.next();
                                           }
                                         if(respuesta.equalsIgnoreCase("si")){
                                           System.out.println("El arbol esta vacio ");
                                           break;
                                           }
                                         if(respuesta.equalsIgnoreCase("no")){
                                           System.out.println();
                                           System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                           break Regresararbolvacio2;
                                           }
                                        }
                                         System.out.println("El preorden del arbol es: ");
                                         arbol2.postOrden(arbol2.raiz);
                                         break;
                                        }
                                    else{
                                         System.out.println("Error, opcion no valida");
                                         System.out.println();
                                         System.out.println("Digite los nodos del arbol \n Digite 'salir' para regresar al menu principal \n Digite 'obtener' para mostrar el arbol. \n Digite 'regresar' para volver al menu de arboles");
                                         
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de arboles");
                                        break arbol;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                        input=entrada.nextLine();
                                    }   
                                }
                            case 4://eliminar nodo predecesor
                             System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'regresar' para volver al menu de arboles");
                             arbolBinario arbol3= new arbolBinario();
                             System.out.println("  Digite 'siguiente' para ingresar la posicion");
                                 
                             while (entrada.hasNext()) {
                                 if (entrada.hasNextInt()) {
                                     int nodoo= entrada.nextInt();
                                     arbol3.insertar(nodoo);
                                     System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'regresar' para volver al menu de arboles");
                                     System.out.println("  Digite 'siguiente' para ingresar la posicion");
                                    }
                                     
                                   else{
                                     String input= entrada.next();
                                     if(input.equalsIgnoreCase("salir")){
                                         System.out.println();
                                         System.out.println("Usted ha regresado al menu principal.");
                                         break menu1;
                                        }
                                     if(input.equalsIgnoreCase("regresar")){
                                        System.out.println();    
                                        System.out.println("Usted ha regresado al menu de arboles.");
                                            break arbol;
                                        }
                                     if(input.equalsIgnoreCase("siguiente")){
                                         
                                         boolean entradavalida=false;
                                         while(!entradavalida){
                                             System.out.println();
                                             System.out.println("¿En que orden desea imprimir? Digite 'inorder', 'preorder' o 'postorder' ");
                                             String input2 = entrada.next();
                                             if(input2.equalsIgnoreCase("inorder")){
                                                 System.out.println("El total de numero de hojas es: "+arbol3.contarHojas());
                                                 
                                                 System.out.println("El arbol es: ");
                                                 arbol3.inOrden(arbol3.raiz);
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else if(input2.equalsIgnoreCase("preorder")){
                                                 System.out.println("El total de numero de hojas es: "+arbol3.contarHojas());
                                                 
                                                 System.out.println("El arbol es: ");
                                                 arbol3.preOrden(arbol3.raiz); 
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else if(input2.equalsIgnoreCase("postorder")){
                                                 System.out.println("El total de numero de hojas es: "+arbol3.contarHojas());
                                                 
                                                 System.out.println("El arbol es: ");
                                                 arbol3.postOrden(arbol3.raiz); 
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else{
                                                 System.out.println("Error, opcion no valida.");
                                                 
                                                }
                                            }
                                            break;
                                        }
                                        else{
                                            System.out.println("Error, opcion no valida");
                                            System.out.println();
                                            System.out.println("Digite los nodos del arbol\n Digite 'salir' para regresar al menu principal \n Digite 'regresar' para volver al menu de arboles");
                                            System.out.println(" Digite 'siguiente' para ingresar la posicion");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de arboles");
                                        break arbol;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                        input=entrada.nextLine();
                                    }   
                                }


                            case 5://Buscar nodo
                             System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'regresar' para volver al menu de arboles \n  Digite 'siguiente' para ir al siguiente paso");
                             arbolBinario arbol4= new arbolBinario();
                             while (entrada.hasNext()) {
                                if (entrada.hasNextInt()) {
                                    int nodo= entrada.nextInt();
                                    arbol4.insertar(nodo);
                                    System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'regresar' para volver al menu de arboles \n  Digite 'siguiente' para ir al siguiente paso");
                                }
                                else{
                                    String input= entrada.next();
                                    if(input.equalsIgnoreCase("salir")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu prinicipal.");
                                        break menu1;
                                    }
                                    if(input.equalsIgnoreCase("regresar")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu de arboles.");
                                        break arbol;
                                    }
                                    if(input.equalsIgnoreCase("siguiente")){
                                        if (arbol4.raiz==null) {
                                            System.out.println("Error, no se ha ingresado ningun valor");
                                            System.out.println();
                                            System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'regresar' para volver al menu de arboles \n  Digite 'siguiente' para ir al siguiente paso");

                                        }
                                        else{
                                        boolean entradavalida=false;
                                        while(!entradavalida){
                                            System.out.println();
                                            System.out.println("¿En que orden desea imprimir? Digite 'inorder', 'preorder' o 'postorder' ");
                                            String input2 = entrada.next();
                                            if(input2.equalsIgnoreCase("inorder")){
                                                 boolean encontrado= false;
                                                 while (!encontrado) {
                                                    System.out.println("Digite el valor a buscar:");
                                                    int  valor = entrada.nextInt();
                                                    Nodo buscando = arbol4.buscar(valor);
                                                    
                                                    if (buscando == null) {
                                                        System.out.println("No se encontró ese valor. Inténtalo de nuevo.");
                                                    } else {
                                                        System.out.println("El valor buscado es el numero: " + buscando.valor);
                                                        encontrado = true;
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                           else if(input2.equalsIgnoreCase("preorder")){
                                               boolean encontrado= false;
                                               while (!encontrado) {
                                                 System.out.println("Digite el valor a buscar:");
                                                 int  valor = entrada.nextInt();
                                                 Nodo buscando = arbol4.buscar(valor);
                                                
                                                  if (buscando == null) {
                                                      System.out.println("No se encontró ese valor. Inténtalo de nuevo.");
                                                    } else {
                                                     System.out.println("El valor buscado es el numero: " + buscando.valor);
                                                     encontrado = true;
                                                     break;
                                                    }
                                                }
                                                break;
                                            }
                                           else if(input2.equalsIgnoreCase("postorder")){
                                                boolean encontrado= false;
                                                while (!encontrado) {
                                                 System.out.println("Digite el valor a buscar:");
                                                 int  valor = entrada.nextInt();
                                                 Nodo buscando = arbol4.buscar(valor);
                                                  if (buscando == null) {
                                                     System.out.println("No se encontró ese valor. Inténtalo de nuevo.");
                                                    } else {
                                                     System.out.println("El valor buscado es el numero: " + buscando.valor);
                                                     encontrado = true;
                                                     break;
                                                    }
                                                }
                                                break;
                                            }
                                            else{
                                              System.out.println("Error, opcion no valida.");
                                            }
                                        }
                                        break;
                                        }
                                    }
                                    else{
                                        System.out.println("Error, opcion no valida");
                                        System.out.println();
                                        System.out.println("Digite los nodos del arbol \n Digite 'salir' para regresar al menu principal \n Digite 'obtener' para mostrar el arbol. \n Digite 'regresar' para volver al menu de arboles");
                                    }
                                }
                             }
                             System.out.println();
                             System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                             while (true) {
                                String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de arboles");
                                        break arbol;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                        input=entrada.nextLine();
                                    }   
                                }
                            
                             case 6: //Contar hojas
                             System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                             arbolBinario arbol5= new arbolBinario();
                              while (entrada.hasNext()) {
                                Regresararbolvacio3:
                                if (entrada.hasNextInt()) {
                                    int nodo= entrada.nextInt();
                                    arbol5.insertar(nodo);
                                    System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                                }
                                else{
                                    String input= entrada.next();
                                   if(input.equalsIgnoreCase("salir")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal.");
                                        break menu1;
                                       }
                                   if(input.equalsIgnoreCase("regresar")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu de arboles.");
                                        break arbol;
                                       }
                                   if(input.equalsIgnoreCase("obtener")){
                                    if (arbol5.raiz==null) {
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor en el arbol. ");
                                        System.out.println();
                                        System.out.println("¿Desea continuar con el arbol vacio? digite 'si' o digite 'no' ");
                                        String respuesta = entrada.next();
                                       while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                       System.out.println("Error, opcion no valida.");
                                       System.out.println();
                                       System.out.println("Desea continuar con el arbol vaci0? digite 'si' o digite 'no' ");
                                       respuesta=entrada.next();
                                       }
                                     if(respuesta.equalsIgnoreCase("si")){
                                       System.out.println("El arbol esta vacio ");
                                       break;
                                       }
                                     if(respuesta.equalsIgnoreCase("no")){
                                       System.out.println();
                                       System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                       break Regresararbolvacio3;
                                       }
                                    }
                                        boolean entradavalida=false;
                                         while(!entradavalida){
                                             System.out.println();
                                             System.out.println("¿En que orden desea imprimir? Digite 'inorder', 'preorder' o 'postorder'  ");
                                             String input2 = entrada.next();
                                             if(input2.equalsIgnoreCase("inorder")){
                                                 System.out.println("El total de numero de hojas es: "+arbol5.contarHojas());
                                                 System.out.println("El arbol es: ");
                                                 arbol5.inOrden(arbol5.raiz);
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else if(input2.equalsIgnoreCase("preorder")){
                                                 System.out.println("El total de numero de hojas es: "+arbol5.contarHojas());
                                                 System.out.println("El arbol es: ");
                                                 arbol5.preOrden(arbol5.raiz); 
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else if(input2.equalsIgnoreCase("postorder")){
                                                 System.out.println("El total de numero de hojas es: "+arbol5.contarHojas());
                                                 System.out.println("El arbol es: ");
                                                 arbol5.postOrden(arbol5.raiz); 
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else{
                                                 System.out.println("Error, opcion no valida.");
                                                }
                                            }
                                        break;
                                       }
                                   else{
                                        System.out.println("Error, opcion no valida");
                                        System.out.println();
                                        System.out.println("Digite los nodos del arbol \n Digite 'salir' para regresar al menu principal \n Digite 'obtener' para mostrar el arbol. \n Digite 'regresar' para volver al menu de arboles");
                                    }
                                   }
                              }
                              System.out.println();
                              System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                              while (true) {
                                String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de arboles");
                                        break arbol;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                        input=entrada.nextLine();
                                    }   
                                }


                             case 7:// Contar nodos
                              System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                              arbolBinario arbol6= new arbolBinario();
                              while (entrada.hasNext()) {
                                  Regresararbolvacio4:
                                 if (entrada.hasNextInt()) {
                                     int nodo= entrada.nextInt();
                                     arbol6.insertar(nodo);
                                     System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                                    }
                                    else{
                                        String input= entrada.next();
                                        if(input.equalsIgnoreCase("salir")){
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu prinicipal.");
                                            break menu1;
                                        }
                                        if(input.equalsIgnoreCase("regresar")){
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menu de arboles.");
                                            break arbol;
                                        }
                                        if(input.equalsIgnoreCase("obtener")){
                                            if (arbol6.raiz==null) {
                                                System.out.println("ADVERTENCIA!!. No se ingresó ningún valor en el arbol. ");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con el arbol vacio? digite 'si' o digite 'no' ");
                                                String respuesta = entrada.next();
                                               while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                               System.out.println("Error, opcion no valida.");
                                               System.out.println();
                                               System.out.println("Desea continuar con el arbol vaci0? digite 'si' o digite 'no' ");
                                               respuesta=entrada.next();
                                               }
                                             if(respuesta.equalsIgnoreCase("si")){
                                               System.out.println("El arbol esta vacio ");
                                               break;
                                               }
                                             if(respuesta.equalsIgnoreCase("no")){
                                               System.out.println();
                                               System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                               break Regresararbolvacio4;
                                               }
                                            }
                                            boolean entradavalida=false;
                                         while(!entradavalida){
                                             System.out.println();
                                             System.out.println("¿En que orden desea imprimir? Digite 'inorder', 'preorder' o 'postorder'");
                                             String input2 = entrada.next();
                                             if(input2.equalsIgnoreCase("inorder")){
                                                 System.out.println("El total de numero de nodos es: "+arbol6.contarNodos());
                                                 System.out.println("El arbol es: ");
                                                 arbol6.inOrden(arbol6.raiz);
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else if(input2.equalsIgnoreCase("preorder")){
                                                 System.out.println("El total de numero de nodos es: "+arbol6.contarNodos());
                                                 System.out.println("El arbol es: ");
                                                 arbol6.preOrden(arbol6.raiz); 
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else if(input2.equalsIgnoreCase("postorder")){
                                                 System.out.println("El total de numero de nodos es: "+arbol6.contarNodos());
                                                 System.out.println("El arbol es: ");
                                                 arbol6.postOrden(arbol6.raiz); 
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else{
                                                 System.out.println("Error, opcion no valida.");
                                                }
                                            }
                                            break;
                                        }
                                        else{
                                            System.out.println("Error, opcion no valida");
                                            System.out.println();
                                            System.out.println("Digite los nodos del arbol \n Digite 'salir' para regresar al menu principal \n Digite 'obtener' para mostrar el arbol. \n Digite 'regresar' para volver al menu de arboles");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de arboles");
                                        break arbol;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                        input=entrada.nextLine();
                                    }   
                                }
                             case 8://Altura de un arbol
                             System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                             arbolBinario arbol7= new arbolBinario();
                             while (entrada.hasNext()) {
                                Regresararbolvacio5:
                                 if (entrada.hasNextInt()) {
                                     int nodo= entrada.nextInt();
                                     arbol7.insertar(nodo);
                                     System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                                    }
                                 else{
                                     String input= entrada.next();
                                     if(input.equalsIgnoreCase("salir")){
                                         System.out.println(); 
                                         System.out.println("Usted ha regresado al menu principal.");
                                         break menu1;
                                        }
                                     if(input.equalsIgnoreCase("regresar")){
                                         System.out.println(); 
                                         System.out.println("Usted ha regresado al menu de arboles.");
                                         break arbol;
                                        }
                                     if(input.equalsIgnoreCase("obtener")){
                                        if (arbol7.raiz==null) {
                                            System.out.println("ADVERTENCIA!!. No se ingresó ningún valor en el arbol. ");
                                            System.out.println();
                                            System.out.println("¿Desea continuar con el arbol vacio? digite 'si' o digite 'no' ");
                                            String respuesta = entrada.next();
                                           while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                           System.out.println("Error, opcion no valida.");
                                           System.out.println();
                                           System.out.println("Desea continuar con el arbol vaci0? digite 'si' o digite 'no' ");
                                           respuesta=entrada.next();
                                           }
                                         if(respuesta.equalsIgnoreCase("si")){
                                           System.out.println("El arbol esta vacio ");
                                           break;
                                           }
                                         if(respuesta.equalsIgnoreCase("no")){
                                           System.out.println();
                                           System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                           break Regresararbolvacio5;
                                           }
                                        }
                                         boolean entradavalida=false;
                                         while(!entradavalida){
                                             System.out.println();
                                             System.out.println("¿En que orden desea imprimir? Digite 'inorder', 'preorder' o 'postorder'");
                                             String input2 = entrada.next();
                                             if(input2.equalsIgnoreCase("inorder")){
                                                 System.out.println("La altura del arbol es: "+arbol7.alturaArbol());
                                                 System.out.println("El arbol es: ");
                                                 arbol7.inOrden(arbol7.raiz);
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else if(input2.equalsIgnoreCase("preorder")){
                                                 System.out.println("La altura del arbol es: "+arbol7.alturaArbol());
                                                 System.out.println("El arbol es: ");
                                                 arbol7.preOrden(arbol7.raiz); 
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else if(input2.equalsIgnoreCase("postorder")){
                                                 System.out.println("La altura del arbol es: "+arbol7.alturaArbol());
                                                 System.out.println("El arbol es: ");
                                                 arbol7.postOrden(arbol7.raiz); 
                                                 entradavalida = true;
                                                 break;
                                                }
                                            else{
                                                 System.out.println("Error, opcion no valida.");
                                                }
                                            }
                                        
                                         break;
                                        }
                                     else{
                                         System.out.println("Error, opcion no valida");
                                         System.out.println();
                                         System.out.println("Digite los nodos del arbol \n Digite 'salir' para regresar al menu principal \n Digite 'obtener' para mostrar el arbol. \n Digite 'regresar' para volver al menu de arboles");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de arboles");
                                        break arbol;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                        input=entrada.nextLine();
                                    }  
                                }
                             case 9://valor menor
                              System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                              arbolBinario arbol8= new arbolBinario();
                              while(entrada.hasNext()){
                                Regresararbolvacio6:
                                if (entrada.hasNextInt()) {
                                    int nodo= entrada.nextInt();
                                    arbol8.insertar(nodo);
                                    System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                              }
                                else{
                                    String input= entrada.next();
                                    if(input.equalsIgnoreCase("salir")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal.");
                                        break menu1;
                                       }
                                    if(input.equalsIgnoreCase("regresar")){
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu de arboles.");
                                        break arbol;
                                       }
                                    if(input.equalsIgnoreCase("obtener")){
                                        if (arbol8.raiz==null) {
                                            System.out.println("ADVERTENCIA!!. No se ingresó ningún valor en el arbol. ");
                                            System.out.println();
                                            System.out.println("¿Desea continuar con el arbol vacio? digite 'si' o digite 'no' ");
                                            String respuesta = entrada.next();
                                           while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                           System.out.println("Error, opcion no valida.");
                                           System.out.println();
                                           System.out.println("Desea continuar con el arbol vaci0? digite 'si' o digite 'no' ");
                                           respuesta=entrada.next();
                                           }
                                         if(respuesta.equalsIgnoreCase("si")){
                                           System.out.println("El arbol esta vacio ");
                                           break;
                                           }
                                         if(respuesta.equalsIgnoreCase("no")){
                                           System.out.println();
                                           System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                           break Regresararbolvacio6;
                                           }
                                        }
                                        boolean entradavalida=false;
                                        while(!entradavalida){
                                             System.out.println();
                                             System.out.println("¿En que orden desea imprimir? Digite 'inorder', 'preorder' o 'postorder'");
                                             String input2 = entrada.next();
                                            if(input2.equalsIgnoreCase("inorder")){
                                                System.out.println("El valor minimo es: "+arbol8.valorMinimo(arbol8.raiz));
                                                System.out.println("El arbol es: ");
                                                arbol8.inOrden(arbol8.raiz);
                                                entradavalida = true;
                                                break;
                                               }
                                           else if(input2.equalsIgnoreCase("preorder")){
                                                System.out.println("El valor minimo es: "+arbol8.valorMinimo(arbol8.raiz));
                                                System.out.println("El arbol es: ");
                                                arbol8.preOrden(arbol8.raiz); 
                                                entradavalida = true;
                                                break;
                                               }
                                           else if(input2.equalsIgnoreCase("postorder")){
                                                System.out.println("El valor minimo es: "+arbol8.valorMinimo(arbol8.raiz));
                                                System.out.println();
                                                System.out.println("El arbol es: ");
                                                arbol8.postOrden(arbol8.raiz); 
                                                entradavalida = true;
                                                break;
                                               }
                                           else{
                                                System.out.println("Error, opcion no valida.");
                                            }
                                        }
                                        break;
                                    } 
                                    else{
                                        System.out.println("Error, opcion no valida");
                                        System.out.println();
                                        System.out.println("Digite los nodos del arbol \n Digite 'salir' para regresar al menu principal \n Digite 'obtener' para mostrar el arbol. \n Digite 'regresar' para volver al menu de arboles");
                                    }
                                }
                            }
                            System.out.println();
                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                            while (true) {
                                String input=entrada.next();
                                if (input.equals("uno")) {
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menu principal");
                                    break menu1;
                                }
                                if (input.equalsIgnoreCase("dos")) {
                                    System.out.println("Adios amigo:)");
                                    return;   
                                }
                                if (input.equalsIgnoreCase("tres")) {
                                    System.out.println();
                                    System.out.println("Ha regresado al menu de arboles");
                                    break arbol;   
                                }
                                else{
                                    System.out.println("ERROR!!!");
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                    input=entrada.nextLine();
                                }   
                            }
                                
                             case 10://valor mayor
                              System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                              arbolBinario arbol9= new arbolBinario();
                              while (entrada.hasNext()) {
                                Regresararbolvacio7:
                                 if (entrada.hasNextInt()) {
                                     int nodo= entrada.nextInt();
                                     arbol9.insertar(nodo);
                                     System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista \n  Digite 'regresar' para volver al menu de arboles");
                                    }
                                 else{
                                     String input= entrada.next();
                                    if(input.equalsIgnoreCase("salir")){
                                         System.out.println();
                                         System.out.println("Usted ha regresado al menu prinicipal.");
                                         break menu1;
                                        }
                                    if(input.equalsIgnoreCase("regresar")){
                                        System.out.println();
                                         System.out.println("Usted ha regresado al menu de arboles.");
                                         break arbol;
                                        }
                                        if(input.equalsIgnoreCase("obtener")){
                                            if (arbol9.raiz==null) {
                                                System.out.println("ADVERTENCIA!!. No se ingresó ningún valor en el arbol. ");
                                                System.out.println();
                                                System.out.println("¿Desea continuar con el arbol vacio? digite 'si' o digite 'no' ");
                                                String respuesta = entrada.next();
                                               while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                               System.out.println("Error, opcion no valida.");
                                               System.out.println();
                                               System.out.println("Desea continuar con el arbol vaci0? digite 'si' o digite 'no' ");
                                               respuesta=entrada.next();
                                               }
                                             if(respuesta.equalsIgnoreCase("si")){
                                               System.out.println("El arbol esta vacio ");
                                               break;
                                               }
                                             if(respuesta.equalsIgnoreCase("no")){
                                               System.out.println();
                                               System.out.println("Digite los nodos del arbol\n  Digite 'salir' para regresar al menu principal \n  Digite 'obtener' para mostrar la lista de arboles \n  Digite 'regresar' para volver al menu de arboles");
                                               break Regresararbolvacio7;
                                               }
                                            }
                                            boolean entradavalida=false;
                                          while(!entradavalida){
                                              System.out.println();
                                              System.out.println("¿En que orden desea imprimir? Digite 'inorder', 'preorder' o 'postorder'");
                                              String input2 = entrada.next();
                                              if(input2.equalsIgnoreCase("inorder")){
                                                 System.out.println("El valor maximo es: "+arbol9.valorMaximo(arbol9.raiz));
                                                  System.out.println("El arbol es: ");
                                                  arbol9.inOrden(arbol9.raiz);
                                                  entradavalida = true;
                                                  break;
                                                 }
                                             else if(input2.equalsIgnoreCase("preorder")){
                                                 System.out.println("El valor maximo es: "+arbol9.valorMaximo(arbol9.raiz));
                                                  System.out.println("El arbol es: ");
                                                  arbol9.preOrden(arbol9.raiz); 
                                                  entradavalida = true;
                                                  break;
                                                 }
                                             else if(input2.equalsIgnoreCase("postorder")){
                                                 System.out.println("El valor maximo es: "+arbol9.valorMaximo(arbol9.raiz));
                                                  System.out.println("El arbol es: ");
                                                  arbol9.postOrden(arbol9.raiz); 
                                                  entradavalida = true;
                                                  break;
                                                 }
                                             else{
                                                  System.out.println("Error, opcion no valida.");
                                                 }
                                             }
                                             break;
                                            }
                                         else{
                                             System.out.println("Error, opcion no valida");
                                             System.out.println();
                                             System.out.println("Digite los nodos del arbol \n Digite 'salir' para regresar al menu principal \n Digite 'obtener' para mostrar el arbol. \n Digite 'regresar' para volver al menu de arboles");
                                            }
                                    }
                                }
                                System.out.println();
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                while (true) {
                                    String input=entrada.next();
                                    if (input.equals("uno")) {
                                        System.out.println();
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input.equalsIgnoreCase("tres")) {
                                        System.out.println();
                                        System.out.println("Ha regresado al menu de arboles");
                                        break arbol;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println();
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de arboles");
                                        input=entrada.nextLine();
                                    }   
                                }

                             case 11://
                              break menu1;
                              default:System.out.println("ERROR!! esa opcion no es valida");
                              
                              break;
                        }
                    }
                    
                    

                case 5:System.out.println("Usted ha salido del programa");
                  return;
                  default:System.out.println("ERROR!! esa opcion no es valida");
                  break;

            }//SWITCH-OPM-//OPCIONES DEL MENU PRINCIPAL(listas,colas,pilas...)
            
        }//WHILE//ABARCA TODAS LAS OPCIONES
    }
}