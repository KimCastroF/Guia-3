
package Actividad2;

/**
 * Clase Nodo que almacena un objeto Paciente y referencia al siguiente nodo.
 */
public class Nodo {
    Paciente paciente;
    Nodo siguiente;
// Constructor
    public Nodo(Paciente paciente) {
        this.paciente = paciente;
        this.siguiente =null;
    }
}
