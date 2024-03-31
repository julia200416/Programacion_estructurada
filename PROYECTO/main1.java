package PROYECTO;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int op=0, op2=0;

        while (true) { //ABARCA TODAS LAS OPCIONES
            System.out.println("Bienvenido al menu principal");
            System.out.println("1. Listas enlazadas\n2. Colas\n3. Pilas \n4. Salir");
            int opm= entrada.nextInt();
            menu1:
            switch (opm) {//OPCIONES DEL MENU PRINCIPAL(listas,colas,pilas...)
                case 1:System.out.println("Usted esta en el menu de listas enlazadas");
                  
                 while (true) {//ABARCA TODAS LAS OPCIONES DE LISTAS(insertar...eliminar...)
                     System.out.println("Digite una opcion: \n1. Insertar \n2. Eliminar \n3. Obtener nodo\n4. Eliminar nodo \n5. Salir al menu principal");
                     op=entrada.nextInt();
                     menu2:
                      switch (op) {//OPCIONES DE LISTAS(insertar,eliminar, obtener...)
                         case 1: System.out.println("Digite alguna opcion:\n1. Insertar al inicio \n2. Insertar al final\n3. Insertar en posicion\n4. Salir al menu de listas \n5. Salir al menu principal");
                         listas listas= new listas();
                         op2= entrada.nextInt();
                         while (op2>5) {
                             System.out.println("ERROR!!!");
                             System.out.println("Digite alguna opcion:\n1. Insertar al inicio \n2. Insertar al final\n3. Insertar en posicion \n4. Salir al menu de listas \n5. Salir al menu principal");
                             op2=entrada.nextInt();
                            }
                         switch (op2) {//OP2 DE INSERTAR AL inicio,final o posicion
                            case 1:System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'mostrar' para ver las lista\n Digite 'salir' para regresar al menu pricipal");
                            while (entrada.hasNext()) {//hasNext es MIENTRAS HALLA UN DATO VA A REPETIRSE EL BUCLE
                                  if (entrada.hasNextInt()) {//hasNextInt dato de tipo de entero
                                     int input= entrada.nextInt();
                                     listas.InsertarAlInicio(input);
  
                                    System.out.println("Digite alguna opcion:\n Ingrese otro valor de tipo entero \n Digite 'mostrar' para ver las listas\n Digite 'salir' para regresar al menu pricipal");
                                  }else{//seran datos de tipo string
                                     String input= entrada.next();
                                     if(input.equalsIgnoreCase("salir")) {
                                         System.out.println("Usted ha regresado al menu principal");
                                         break menu1;  
                                        }
                                     if(input.equalsIgnoreCase("mostrar")) {
                                          System.out.println("La lista de nodos es: ");
                                          listas.mostrarNodox();
                                          break;   
                                        }
                                     else{
                                         System.out.println("ERROR!!!");
                                         System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'mostrar' para ver las lista\n Digite 'salir' para regresar al menu pricipal");
                                         
                                        }
                                     
                                    }
                                }
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                               
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
                                        System.out.println("Ha regresado al menu de listas");
                                        break menu2;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                        //input=entrada.nextLine();
                                    }
                                    
                                }
                            case 2://Inserta al final
                             System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal");
                             while(entrada.hasNext()){
                                 if(entrada.hasNextInt()){
                                     int input2 = entrada.nextInt();
                                     listas.insertarAlFinal(input2);
                                     System.out.println("Digite alguna opcion:\n Ingrese otro valor de tipo entero \n Digite 'mostrar' para ver las listas\n Digite 'salir' para regresar al menu pricipal");
                                    }else{
                                     String input2= entrada.next();
                                     if(input2.equalsIgnoreCase("salir")){
                                         System.out.println("Usted ha regresado al menu principal");
                                         break menu1;
                                        }
                                     if(input2.equalsIgnoreCase("mostrar")) {
                                         System.out.println("La lista de nodos es: ");
                                         listas.mostrarNodox();
                                         break;   
                                        }
                                     else{
                                         System.out.println("ERROR!!!");
                                         System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'mostrar' para ver las lista\n Digite 'salir' para regresar al menu pricipal");
         
                                        }
                                    }
                                
                                }
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                               
                                while (true) {
                                    String input2=entrada.next();
                                    if (input2.equals("uno")) {
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input2.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input2.equalsIgnoreCase("tres")) {
                                        System.out.println("Ha regresado al menu de listas");
                                        break menu2;
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                        
                                    }
                                }

                             case 3://Inserta en posicion
                                    System.out.println("Ingrese un valor de tipo de entero");
                                    System.out.println(" Digite 'siguiente' para ingresar la posicion\n Digite 'salir' para regresar al menu principal");
                                 while (entrada.hasNext()) {
                                     if (entrada.hasNextInt()) {
                                         int input3= entrada.nextInt();
                                         listas.insertarAlFinal(input3);
                                         System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo entero\n Digite 'salir' para regresar al menu principal");
                                         System.out.println(" Digite 'siguiente' para ingresar la posicion");
                                        }else{
                                         String input3=entrada.next();
                                         if(input3.equalsIgnoreCase("salir")){
                                             System.out.println("usted ha regresado al menu principal'");
                                             break menu1;
                                            }
                                         if(input3.equalsIgnoreCase("siguiente")){
                                             System.out.println("Digite la posicion: ");
                                             while (!entrada.hasNextInt()) {
                                                System.out.println("ERROR!! La posicion debe ser un numero entero");
                                                System.out.println("Digite la posicion:");
                                                entrada.next();
                                             }
                                             int posicion=entrada.nextInt();
                                             System.out.println("Digite el nuevo valor: ");
                                             while (!entrada.hasNextInt()) {
                                                System.out.println("ERROR!! El valor debe ser un numero entero");
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
                                             System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'salir' para regresar al menu pricipal");
                                             System.out.println(" Digite 'siguiente' para ingresar la posicion");
                                        
                                            }
                                        }
                                    }
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu pprincipal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                   
                                    while (true) {
                                        String input3=entrada.next();
                                        if (input3.equals("uno")) {
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (input3.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (input3.equalsIgnoreCase("tres")) {
                                            System.out.println("Ha regresado al menu de listas");
                                            break menu2;
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                            
                                        }
    
                                    }
                                //AGREGAR EN CASO DE QUE EL USUARIO INGRESE 
                                //OTRA OPCION DENTRO DEL INSERTAR
                                case 4: System.out.println("Usted esta en el menu de listas");
                                      break;
                                case 5: System.out.println("Usted esta en el menu principal");
                                      break menu1;

                            }//SWITCH//OP2 DE INSERTAR AL inicio,final o posicion
                          
                        break;

                         case 2://ELIMINAR
                             System.out.println("Digite alguna opcion:\n1. Eliminar al inicio \n2. Eliminar al final\n3. Eliminar en posicion\n4. Salir al menu de listas \n5. Salir al menu principal");
                             listas listas2=new listas();
                             op2=entrada.nextInt();
                             while (op2>5) {
                                System.out.println("ERROR!!!");
                                System.out.println("Digite alguna opcion:\n1. Eliminar al inicio \n2. Eliminar al final\n3. Eliminar en posicion\n5. Salir al menu de listas \n5. Salir al menu principal");
                                op2=entrada.nextInt();
                             }
                            switch (op2) {
                                case 1: //Eliminar al inicio
                                 System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'mostrar' para ver las lista de nodos\n Digite 'salir' para regresar al menu pricipal");
                                 while (entrada.hasNext()) {
                                     if (entrada.hasNextInt()) {
                                          int input= entrada.nextInt();
                                         listas2.InsertarAlInicio(input);
                                         System.out.println("Digite alguna opcion:\n Ingrese otro valor de tipo entero \n Digite 'mostrar' para ver las listas de nodos\n Digite 'salir' para regresar al menu pricipal");   
                                        }
                                     else{
                                         String input= entrada.next();
                                         if (input.equalsIgnoreCase("salir")) {
                                              System.out.println("Usted ha regresado al menu principal");
                                             break menu2;
                                            }
                                         if (input.equalsIgnoreCase("mostrar")) {
                                             System.out.println("La lista de nodos es: ");
                                             listas2.eliminarAlInicio();
                                             listas2.mostrarNodox();
                                             break;   
                                            }
                                         else{
                                             System.out.println("ERROR!!!");
                                             System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'mostrar' para ver las lista\n Digite 'salir' para regresar al menu pricipal");
                                            }
                                        }
                                    } 
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                       
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
                                            System.out.println("Ha regresado al menu de listas");
                                            break menu2;   
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                            
                                        }
                                    }
                                case 2: //eliminar al final
                                 System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo de entero \n Digite 'mostrar' para ver la lista\n Digite 'salir' para regresar al menu principal");
                                 while (entrada.hasNext()) {
                                     if (entrada.hasNextInt()) {
                                         int input2 = entrada.nextInt();
                                         listas2.insertarAlFinal(input2);
                                         System.out.println("Digite alguna opcion:\n Ingrese otro valor de tipo entero \n Digite 'mostrar ' para ver las listas\n Digite 'salir' para regresar al menu pricipal");
                                     }else{
                                         String input2= entrada.next();
                                         if(input2.equalsIgnoreCase("salir")){
                                             System.out.println("Usted ha regresado al menu principal");
                                             break menu1;
                                            }
                                         if (input2.equalsIgnoreCase("mostrar")) {
                                             System.out.println("La lista de nodos es: ");
                                             listas2.eliminarAlFinal();
                                             System.out.println("Los nodos restantes son: "+ listas2.contarNodos());
                                             listas2.mostrarNodox();
                                             break;   
                                            }
                                         else{
                                             System.out.println("ERROR!!!");
                                             System.out.println("Digite alguna opcion:\n Ingrese un valor de tipo entero \n Digite 'mostrar' para ver las lista\n Digite 'salir' para regresar al menu pricipal");
                                            }
                                        }
                                    } 
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                    
                                    while (true) {
                                        String input2=entrada.next();
                                        if (input2.equals("uno")) {
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (input2.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (input2.equalsIgnoreCase("tres")) {
                                            System.out.println("Ha regresado al menu de listas");
                                            break menu2;
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal\n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas ");
                                            
                                        }
                                    }               

                                case 3: //eliminar en posicion
                                 System.out.println("Ingrese un valor de tipo de entero");
                                 System.out.println("Digite 'siguiente' para ingresar la posicion\n Digite 'salir' para regresar al menu principal");
                                 while (entrada.hasNext()) {
                                     if (entrada.hasNextInt()) {
                                         int input3= entrada.nextInt();
                                         listas2.insertarAlFinal(input3);
                                         System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo entero\n Digite 'salir' para regresar al menu principal");
                                         System.out.println("Digite 'siguiente' para ingresar la posicion");
                                    
                                        }else{//seran datos de tipo string
                                         String input3= entrada.next();
                                         if(input3.equalsIgnoreCase("salir")) {
                                             System.out.println("Usted ha regresado al menu principal");
                                             break menu1;  
                                            }
                                         if(input3.equalsIgnoreCase("siguiente")) {
                                             System.out.println("Digite la posicion para eliminar: ");
                                             while(!entrada.hasNextInt()){
                                                 System.out.println("ERROR!!! La posicion debe ser un numero entero");
                                                 System.out.println("Digite la posicion para eliminar:");
                                                 entrada.next();
                                                }
                                             int posicion= entrada.nextInt();
                                             System.out.println("Digite el nuevo valor:");
                                             while(!entrada.hasNextInt()){
                                                 System.out.println("ERROR!!! El valor debe ser un numero entero");
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
                                             System.out.println("Digite una opcion: \n Ingrese un valor de tipo entero \n Digite 'siguiente' para ver las lista \n Digite 'salir' para regresar al menu pricipal ");
                                               
                                            }
                                        }
                                    } 
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                    
                                    while (true) {
                                        String input3=entrada.next();
                                        if (input3.equals("uno")) {
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (input3.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (input3.equalsIgnoreCase("tres")) {
                                            System.out.println("Ha regresado al menu de listas");
                                            break menu2;   
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                            
                                        }
                                    }
                                    case 4: System.out.println("Usted esta en el menu de listas");
                                       break;
                                    case 5: System.out.println("Usted esta en el menu principal");
                                       break menu1;
                                  
                            }
                           break; 

                         case 3: // OBTENER NODO
                         System.out.println("Ingrese un valor de tipo de entero");
                         System.out.println("Digite 'siguiente' para pasar a ingresar la posicion\nDigite 'salir' para regresar al menu principal");
                         listas listas3= new listas();
                         while (entrada.hasNext()) {
                             if (entrada.hasNextInt()) {
                                 int input= entrada.nextInt();
                                 listas3.insertarAlFinal(input);
                                 System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo entero\n Digite 'salir' para regresar al menu principal");
                                 System.out.println("Digite 'siguiente' para ingresar la posicion");
                            
                                }else{//seran datos de tipo string
                                     String input= entrada.next();
                                     if(input.equalsIgnoreCase("salir")) {
                                     System.out.println("Usted ha regresado al menu principal");
                                     break menu1;  
                                    }
                                 if(input.equalsIgnoreCase("siguiente")) {
                                     System.out.println("Digite la posicion a eliminar: ");
                                     while(!entrada.hasNextInt()){
                                         System.out.println("ERROR!!! La posicion debe ser un numero entero");
                                         System.out.println("Digite la posicion a eliminar:");
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
                                    System.out.println("Digite una opcion: \n Ingrese un valor de tipo entero \n Digite 'siguiente' para ver las lista \n Digite 'salir' para regresar al menu pricipal ");
                                               
                                     }
                                }
                            }
                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                            
                            while (true) {
                                String input3=entrada.next();
                                if (input3.equals("uno")) {
                                    System.out.println("Usted ha regresado al menu principal");
                                    break menu1;
                                }
                                if (input3.equalsIgnoreCase("dos")) {
                                    System.out.println("Adios amigo:)");
                                    return;   
                                }
                                if (input3.equalsIgnoreCase("tres")) {
                                    System.out.println("Ha regresado al menu de listas");
                                    break menu2;   
                                }
                                else{
                                    System.out.println("ERROR!!!");
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                    
                                }
                            }
                         case 4:// ELIMINAR
                          System.out.println("Ingrese un valor de tipo de entero");
                          System.out.println("Digite 'siguiente' para ingresar la posicion\nDigite 'salir' para regresar al menu principal");
                          listas listas4= new listas();
                          while (entrada.hasNext()) {
                             if (entrada.hasNextInt()) {
                                 int input2= entrada.nextInt();
                                 listas4.insertarAlFinal(input2);
                                 System.out.println("Digite alguna opcion: \n Ingrese un valor de tipo entero\n Digite 'salir' para regresar al menu principal");
                                 System.out.println("Digite 'siguiente' para ingresar la posicion");
                            
                                }else{//seran datos de tipo string
                                 String input2= entrada.next();
                                 if(input2.equalsIgnoreCase("salir")) {
                                     System.out.println("Usted ha regresado al menu principal");
                                     break menu1;  
                                    }
                                 if(input2.equalsIgnoreCase("siguiente")) {
                                     System.out.println("Digite la posicion para eliminar: ");
                                     while (!entrada.hasNextInt()) {
                                         System.out.println("ERROR!!! La posicion debe ser un numero entero");
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
                                     System.out.println("Digite una opcion: \n Ingrese un valor de tipo entero \n Digite 'siguiente' para ver las lista \n Digite 'salir' para regresar al menu pricipal ");
                                   
                                    }
                                }   
                            }
                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                            
                            while (true) {
                                String input2=entrada.next();
                                if (input2.equals("uno")) {
                                    System.out.println("Usted ha regresado al menu principal");
                                    break menu1;
                                }
                                if (input2.equalsIgnoreCase("dos")) {
                                    System.out.println("Adios amigo:)");
                                    return;   
                                }
                                if (input2.equalsIgnoreCase("tres")) {
                                    System.out.println("Ha regresado al menu de listas");
                                    break menu2;   
                                }
                                else{
                                    System.out.println("ERROR!!!");
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de listas");
                                }
                            }
                               
                         case 5: System.out.println("Usted ha regresado al menu principal");
                            break menu1;
                            default:System.out.println("ERROR!!, esa opcion no es valida");
                            break;

                        }//SWITCH-OP-//OPCIONES DE LISTAS(insertar,eliminar, obtener...)
                    }//WHILE //ABARCA TODAS LAS OPCIONES DE LISTAS(insertar,eliminar, obtener...)
                case 2:System.out.println("Usted esta en el menu de colas");
                        
                      while (true) {
                        System.out.println("Digite una opcion: \n1. Insertar cola \n2. Eliminar cola \n3. Obtener siguiente \n4. Salir al menu principal");
                        op=entrada.nextInt();
                        menu0:
                        switch (op) {
                            case 1: //Agregar cola
                              System.out.println("Digite alguna opcion: \n Digite 'obtener cola' para ver las listas\n Digite 'salir' para regresar al menu pricipal");
                              System.out.println(" -Digite el numero del pedido: ");
                              while (!entrada.hasNextInt()) {
                                 System.out.println("ERROR!!!");
                                 System.out.println(" -Digite el numero del pedido: ");
                                 entrada.next();
                                }
                              colas colasPedidos= new colas();
                              //System.out.println(" -Digite el nombre del cliente:");
                              
                                while (entrada.hasNext()) {//hasNext es MIENTRAS HALLA UN DATO VA A REPETIRSE EL BUCLE
                                    if (entrada.hasNextInt()) {//hasNextInt dato de tipo de entero
                                        int numeroPedido= entrada.nextInt();
                                        System.out.println(" -Digite el nombre del cliente:");
                                        String nombreCliente= entrada.next();
                                        while (!nombreCliente.matches("[a-zA-Z]+")){
                                             System.out.println("ERROR!!! El nombre del cliente no debe ser un numero");
                                             System.out.println(" -Digite el nombre del cliente: ");
                                            nombreCliente=entrada.next();
                                        }
                                        colasPedidos.AgregarCola(numeroPedido, nombreCliente);
                                        System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal");
                                        System.out.println(" -Digite el numero del pedido: ");
                                        }else{//seran datos de tipo string
                                        String input= entrada.next();
                                         if (input.equalsIgnoreCase("salir")) {
                                             System.out.println("Usted ha regresado al menu principal");
                                             break menu1;  
                                            }
                                         if(input.equalsIgnoreCase("obtener")){
                                                System.out.println("La lista de colas es: ");
                                                colasPedidos.obtener();
                                                break;
                                            }
                                         else{
                                             System.out.println("ERROR!!!");
                                             System.out.println(" -Digite el numero del pedido: ");
                                            }
                                        }
                                }
                                    System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                    String input=entrada.next();
                                    while(true){
                                        if (input.equals("uno")) {
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (input.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (input.equalsIgnoreCase("tres")) {
                                            System.out.println("Ha regresado al menu de colas");
                                            break menu0;   
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                            input=entrada.nextLine();
                                        }

                                    }
                                case 2: //eliminar cola
                                System.out.println("Digite alguna opcion: \n  Digite 'obtener cola' para ver las listas\n  Digite 'salir' para regresar al menu pricipal");
                                System.out.println(" Digite el numero de pedido: ");
                                while (!entrada.hasNextInt()) {
                                    System.out.println("ERROR!!! El numero  debe ser un numero de tipo entero");
                                    System.out.println(" Digite el numero de pedido: ");
                                    entrada.next();
                                }
                                colas colass= new colas();
                                while (entrada.hasNext()) {
                                    if (entrada.hasNextInt()) {
                                        int pedido = entrada.nextInt();
                                        entrada.nextLine();
                                        System.out.println("Digite el nombre del cliente: ");
                                        String cliente = entrada.nextLine();
                                        while (!cliente.matches("[a-z A-Z]+")) {
                                            System.out.println("ERROR!!! No debe ser un numero ni un caracter, sino un nombre");
                                            System.out.println("Digite el nombre del cliente: ");
                                            cliente=entrada.nextLine();
                                        }
                                        colass.AgregarCola(pedido, cliente);
                                        System.out.println("Digite ·salir· o digite ·siguiente·");
                                        System.out.println(" Digite el numero de pedido: ");
                                    
                                    }else{
                                        String input1 = entrada.next();

                                        if(input1.equalsIgnoreCase("salir")){
                                            System.out.println("Usted ha regresado al menu principal.");
                                            break menu1;
                                        }
                                        if(input1.equalsIgnoreCase("siguiente")){

                                            System.out.println("Digite el 'numero del cliente' anterior que desea eliminar.");
                                            while (!entrada.hasNextInt()) {
                                                System.out.println("ERROR!!! Debe ser un numero de tipo entero");
                                                System.out.println("Digite el 'numero de cliente' anterior que desea eliminar");
                                                entrada.next();
                                            }
                                            int pedido = entrada.nextInt();
                                            entrada.nextLine();
                                            System.out.println("Digite el 'nombre del cliente' anterior que desea eliminar.");
                                            String cliente = entrada.nextLine();
                                            while (!cliente.matches("[a-z A-Z]+")) {
                                                System.out.println("ERROR!!! Debe ser el nombre del cliente ingresado");
                                                System.out.println("Digite el 'nombre del cliente' anterior que desea eliminar");
                                                cliente=entrada.nextLine();
                                            }
                                            colass.AgregarCola(pedido, cliente);
                                            colass.Eliminar();
                                            System.out.println("El id y el cliente que elimino es: ");
                                            colass.obtener();
                                            break;
                                        }
                                    }
                                }
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                    String inpu=entrada.next();
                                    while(true){
                                        if (inpu.equals("uno")) {
                                            System.out.println("Usted ha regresado al menu principal");
                                            break menu1;
                                        }
                                        if (inpu.equalsIgnoreCase("dos")) {
                                            System.out.println("Adios amigo:)");
                                            return;   
                                        }
                                        if (inpu.equalsIgnoreCase("tres")) {
                                            System.out.println("Ha regresado al menu de colas");
                                            break menu0;   
                                        }
                                        else{
                                            System.out.println("ERROR!!!");
                                            System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                            inpu=entrada.nextLine();
                                        }

                                    }
                                case 3:// obtener siguiente 
                                System.out.println("Digite alguna opcion: \n  Digite 'siguiente' para ver las colas\n  Digite 'salir' para regresar al menu pricipal");
                                System.out.println(" Digite el numero de pedido: ");
                                while (!entrada.hasNextInt()) {
                                     System.out.println("ERROR!!!");
                                     System.out.println(" -Digite el numero del pedido: ");
                                     entrada.next();
                                    }
                                colas colass1= new colas();
                                  while (entrada.hasNext()) {
                                     if (entrada.hasNextInt()) {
                                         int pedido = entrada.nextInt();
                                         System.out.println("Digite el nombre del cliente: ");
                                         String cliente = entrada.next();
                                         while (!cliente.matches("[a-zA-Z]+")) {
                                             System.out.println("ERROR!!! No debe ser un numero ni un caracter, sino un nombre");
                                             System.out.println("Digite el nombre del cliente: ");
                                             cliente=entrada.next();
                                            }
                                         colass1.AgregarCola(pedido, cliente);
                                         System.out.println("Digite alguna opcion: \n  Digite 'siguiente' para ver las colas\n Digite 'salir' para regresar al menu pricipal");
                                         System.out.println(" Digite el numero de pedido: ");
                                    
                                        }else{
                                         String input1 = entrada.next();

                                         if(input1.equalsIgnoreCase("salir")){
                                             System.out.println("Usted ha regresado al menu principal.");
                                             break menu1;
                                            }
                                         if(input1.equalsIgnoreCase("siguiente")){
                                             System.out.println("La lista es: ");
                                             colass1.obtenerSiguiente();
                                             break;
                                            }
                                        }
                                    }
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de colas");
                                String input2=entrada.next();
                                while (true) {
                                    if (input2.equals("uno")) {
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;
                                    }
                                    if (input2.equalsIgnoreCase("dos")) {
                                        System.out.println("Adios amigo:)");
                                        return;   
                                    }
                                    if (input2.equalsIgnoreCase("tres")) {
                                        System.out.println("Ha regresado al menu de colas");
                                        break menu0;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa\n Digite 'tres' para regresar al menu de colas");
                                        input2=entrada.nextLine();
                                    }
                                    
                                }//
                                case 4: System.out.println("Usted ha regresado al menu principal");
                                   break menu1;
                                   default:System.out.println("ERROR!! esa opcion no es valida");
                                   break;    

                        }
                      }
                 
                case 3:System.out.println("Usted esta en el menu de pilas");
                    while(true){
                        System.out.println("Digite una opcion: \n1. Apilar pilas \n2. Desapilar N pila \n3. Destruir \n4. Salir al menu principal");
                        op=entrada.nextInt();
                        menu0:
                        switch (op) {
                            case 1://Apilar pilas
                               System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                               System.out.println(" -Digite el numero del libro: ");
                               while (!entrada.hasNextInt()) {
                                 System.out.println("ERROR!!! El numero debe ser entero");
                                 System.out.println(" -Digite el numero del libro: ");
                                 entrada.next();
                               }
                               pilas pilass= new pilas();
                               while (entrada.hasNext()) {
                                 if (entrada.hasNextInt() && entrada.hasNextLine()) {
                                     int numero=entrada.nextInt();
                                     entrada.nextLine();
                                     System.out.println("-Digite el nombre del autor");
                                     String autor= entrada.nextLine();
                                     while (!autor.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El autor debe ser un nombre");
                                         System.out.println("-Digite el nombre del autor");
                                         autor=entrada.nextLine();
                                        }
                                     System.out.println("-Digite el titulo del libro");
                                     String libro= entrada.nextLine();
                                     while (!libro.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El titulo debe ser un nombre");
                                         System.out.println("-Digite el titulo del libro");
                                         libro=entrada.nextLine();
                                        }
                                     pilass.apilar(numero, autor, libro);
                                     System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal");
                                     System.out.println(" -Digite el numero de libro: ");
                                    }else{ 
                                    String input= entrada.next();
                                     if (input.equalsIgnoreCase("salir")) {
                                         System.out.println("Usted ha regresado al menu principal");
                                         break menu1;  
                                       }
                                     if(input.equalsIgnoreCase("obtener")){
                                         System.out.println("La lista de pilas es: ");
                                         pilass.obtenerTope();
                                         break;
                                       }
                                    else{
                                         System.out.println("ERROR!!!");
                                         System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal");
                                         System.out.println("-Digite el numero del libro: ");
                                        }
                                    }
                                }    
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
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
                                        System.out.println("Ha regresado al menu de pilas");
                                        break menu0;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
                                        input=entrada.nextLine();
                                    }   
                                }
                               

                            case 2://Desapilar N pila 
                             System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                             System.out.println(" -Digite el numero del libro: ");
                             while (!entrada.hasNextInt()) {
                                System.out.println("ERROR!!! El numero debe ser entero");
                                 System.out.println(" -Digite el numero del libro: ");
                                 entrada.next();
                                }
                             pilas pilas1= new pilas();
                             while (entrada.hasNext()) {
                                if (entrada.hasNextInt()) {
                                    //entrada.nextLine();
                                    int numero=entrada.nextInt();
                                    entrada.nextLine();
                                    System.out.println("-Digite el nombre del autor");
                                    String autor= entrada.nextLine();
                                    while (!autor.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El autor debe ser un nombre");
                                         System.out.println("-Digite el nombre del autor");
                                         autor=entrada.nextLine();
                                        }
                                    System.out.println("-Digite el titulo del libro");
                                    String libro= entrada.nextLine();
                                    while (!libro.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El titulo debe ser un nombre");
                                         System.out.println("-Digite el titulo del autor");
                                         libro=entrada.nextLine();
                                        }

                                    pilas1.apilar(numero, autor, libro);
                                    System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal");
                                    System.out.println(" -Digite el numero de libro: ");
                                   }else{ 
                                   String input= entrada.next();
                                    if (input.equalsIgnoreCase("salir")) {
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;  
                                      }
                                    if(input.equalsIgnoreCase("obtener")){
                                        System.out.println("Digite la cantidad a desapilar: ");
                                        
                                        while (!entrada.hasNextInt()) {
                                            System.out.println("ERROR!!! Debe ser un numero entero");
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
                                         System.out.println("-Digite el numero del libro: ");
                                        }
                                    }
                                }
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
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
                                        System.out.println("Ha regresado al menu de pilas");
                                        break menu0;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
                                        input=entrada.nextLine();
                                    }   
                                }


                            case 3: //Destruir pila
                              System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                              System.out.println(" -Digite el numero del libro: ");
                              while (!entrada.hasNextInt()) {
                                System.out.println("ERROR!!! El numero debe ser entero");
                                 System.out.println(" -Digite el numero del libro: ");
                                 entrada.next();
                                }
                              pilas pilas2= new pilas();
                              while (entrada.hasNext()) {
                                if (entrada.hasNextInt() && entrada.hasNextLine()) {
                                    int numero=entrada.nextInt();
                                    entrada.nextLine();
                                    System.out.println("-Digite el nombre del autor");
                                    String autor= entrada.nextLine();
                                    while (!autor.matches("[a-z A-Z]+")) {
                                         System.out.println("ERROR!!! El autor debe ser un nombre");
                                         System.out.println("-Digite el nombre del autor");
                                         autor=entrada.nextLine();
                                        }   
                                    System.out.println("-Digite el tituloo del libro");
                                    String libro= entrada.nextLine();
                                    while (!libro.matches("[a-z A-Z]+")) {
                                        System.out.println("ERROR!!! El titulo debe ser un nombre");
                                        System.out.println("-Digite el titulo del libro");
                                        libro=entrada.nextLine();
                                       }
                                    pilas2.apilar(numero, autor, libro);
                                    System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal");
                                    System.out.println(" -Digite el numero de libro: ");
                                   }else{ 
                                   String input= entrada.next();
                                    if (input.equalsIgnoreCase("salir")) {
                                        System.out.println("Usted ha regresado al menu principal");
                                        break menu1;  
                                      }
                                    if(input.equalsIgnoreCase("obtener")){
                                        System.out.println("La lista de pilas es: ");
                                        System.out.println(pilas2.length());
                                        pilas2.destructor();
                                        System.out.println(pilas2.length());
                                        break;
                                      }
                                   else{
                                         System.out.println("ERROR!!!");
                                         System.out.println("-Digite el numero del libro: ");
                                        }
                                    }
                                }
                                System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
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
                                        System.out.println("Ha regresado al menu de pilas");
                                        break menu0;   
                                    }
                                    else{
                                        System.out.println("ERROR!!!");
                                        System.out.println("Digite una opcion: \n Digite 'uno' para regresar al menu principal \n Digite 'dos' para terminar el programa \n Digite 'tres' para regresar al menu de pilas");
                                        input=entrada.nextLine();
                                    }   
                                }

                            case 4:
                            System.out.println("Usted ha regresado al menu principal");
                             break menu1;
                             default:System.out.println("ERROR!! esa opcion no es valida");
                             break;
                        }
                    }
                 
                case 4:System.out.println("Usted ha salido del programa");
                  return;
                  default:System.out.println("ERROR!! esa opcion no es valida");
                  break;

            }//SWITCH-OPM-//OPCIONES DEL MENU PRINCIPAL(listas,colas,pilas...)
            
        }//WHILE//ABARCA TODAS LAS OPCIONES
    }
}