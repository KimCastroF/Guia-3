
package Actividad2;


import java.util.Scanner;

//Clase principal que interactúa con el usuario.
public class Main {
    static Scanner entrada= new Scanner(System.in);
    
    public static void main(String[]args){
        ListaEnlazada lista= new ListaEnlazada();
      
        int opcion;
        do{
            System.out.println("---Bienvenido Al Registro de Pacientes---");
            System.out.println("""
                           Por favor Elija una Opcion:
                           1. Registrar Paciente
                           2. Elimina Paciente 
                           3. Encontrar Paciente por ID 
                           4. Mostrar Pacientes Registrados
                           5. Salir """);
            System.out.print("Seleccione la opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea
            
            switch(opcion){
                case 1 -> {
                    int id;
                    while(true){
                        System.out.println("Digite sin puntos");
                        System.out.print("Digite Su Id: ");
                        String input = entrada.next();
                        //Validar que solo contenga Numeros
                        if(input.matches("\\d+")){
                           id = Integer.parseInt(input);//Convertir a Entero
                           break;
                        }
                        else{
                            System.out.println("Error: El ID debe contener solo numeros");
                        }
                    }
                    System.out.println("ID valido!!");
                    
                    System.out.print("Digite su Nombre: ");
                    String nombre=entrada.next();
                    
                     System.out.print("Digite su Edad: ");
                     int edad=entrada.nextInt();
                    
                     System.out.print("Digite su Clinica: ");
                    String clinica=entrada.next();
                    
                    
                    Paciente paciente = new Paciente(id, nombre,edad,clinica);
                    lista.insertar(paciente);
                    System.out.println("Paciente registrado con Exito");
                    System.out.println("Presiona Enter para continuar...");
                            entrada.nextLine(); // Consumir el Enter sobrante de nextInt()
                            entrada.nextLine();
                }
                case 2-> {
                    int eliminar;
                    while(true){        
                    System.out.print("Digite ID del paciente que desea Eliminar: ");
                    String input = entrada.next();
                    //Validar que solo contenga Numeros
                        if(input.matches("\\d+")){
                           eliminar = Integer.parseInt(input);//Convertir a Entero
                           break;
                        }
                        else{
                            System.out.println("Error: El ID debe contener solo numeros");
                        }
                    }
                    
                    lista.eliminarPaciente(eliminar);
                    System.out.println("Presiona Enter para continuar...");
                            entrada.nextLine(); // Consumir el Enter sobrante de nextInt()
                            entrada.nextLine();
                         
                }
                case 3-> {
                    int encontrar;
                    
                    while(true){ 
                    System.out.print("Digite el ID del Paciente que desea encontrar: ");
                    String input = entrada.next();
                    //Validar que solo contenga Numeros
                        if(input.matches("\\d+")){
                           encontrar = Integer.parseInt(input);//Convertir a Entero
                           break;
                        }
                        else{
                            System.out.println("Error: El ID debe contener solo numeros");
                        }
                    }
                    System.out.println("Registro: "+ lista.buscar(encontrar));
                    System.out.println("Presiona Enter para continuar...");
                            entrada.nextLine(); // Consumir el Enter sobrante de nextInt()
                            entrada.nextLine();
                }
                case 4 -> {
                    System.out.println("Pacientes Registrados:");
                    lista.mostrar();
                    System.out.println("Presiona Enter para continuar...");
                            entrada.nextLine(); // Consumir el Enter sobrante de nextInt()
                            entrada.nextLine();
                }
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción incorrecta, intente nuevamente.");
            }    
    
            

       
            
        }while(opcion != 5);
        entrada.close();

    }
}
