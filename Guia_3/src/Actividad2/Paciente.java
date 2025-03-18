
package Actividad2;

/**
 *Kimberly Castro
 *Katherin Trochez
 *Eduar Sachica
 */
public class Paciente {
    //Atributos
    private int id;
    private String nombre;
    private int edad;
    private String clinica;
    
    //Metodos
    //Metodo Constructor

    public Paciente(int id, String nombre, int edad, String clinica) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.clinica = clinica;
    }
     // Métodos Getters 
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getClinica() {
        return clinica;
    }
    //Devolver Datos
    @Override
    public String toString() {
        return "Paciente" + " ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Clinica: " + clinica;
    }
    
}

