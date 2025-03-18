
package Actividad2;
/**
 * Implementación de una lista enlazada simple para gestionar pacientes.
 */

public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza =null;
    }
    
    // Inserta un nuevo paciente al final de la lista.
     
    //Insertar un nuevo Nodo al final
    public void insertar(Paciente paciente){
        Nodo nuevo =new Nodo(paciente);
        if(cabeza == null){
            cabeza = nuevo;
        }
        else{
            Nodo actual = cabeza;
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    //Eliminar a un pasiente por su ID
    public void eliminarPaciente(int id){ //Recibe un valor entero
        if (cabeza == null) return;

        if (cabeza.paciente.getId() == id) {
            cabeza = cabeza.siguiente;
            System.out.println("Paciente eliminado con éxito.");
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.paciente.getId() != id) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("Paciente eliminado con éxito.");
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }
    //Busca un paciente por su ID y lo retorna.
    public Paciente buscar(int id) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.paciente.getId() == id) {
            System.out.println("Paciente encontrado: ");
            return actual.paciente; // Retorna el objeto paciente encontrado
            }
            actual = actual.siguiente;
        }   
        System.out.println("Paciente con ID " + id + " no encontrado.");
        return null; // Retorna null si no lo encuentra
    }
    //Muestra todos los pacientes de la lista.
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay pacientes Registrados");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.paciente);
            actual = actual.siguiente;
        }
    }
}
