# Guia-3
 Solución Guía 3 - Desarrollo de Software - Universidad EAN

# Readme Guía 3

## **Actividad 2. Estructuras de datos lineales enlazadas**

### **Central de Paciente**

#### **Descripción**
El presente proyecto es el resultado de un aplicativo desarrollado en Java el cual utiliza el concepto Listas Enlazadas como parte fundamental para el desarrollo del ejercicio, El código permite el registro de pacientes, eliminar y observar la lista de pacientes. Esto permite tener una base de datos de los pacientes.

#### **Datos Solicitados para el Cálculo**
Con el objetivo de obtener los datos de los pacientes, el usuario final debe ingresar la siguiente información al formulario:
 
* Numero de identificación.
* Nombre.
* Edad.
* Clínica a la que se encuentra afiliado

#### **Instalación y Uso**

**1. Clonar el repositorio**  
Si utilizas git, ejecuta el siguiente comando:
```
git clone https://github.com/KimCastroF/Guia-3.git
```
O descárgalo en formato .zip desde GitHub y extráelo en tu computadora.
 
**2. Abrir en NetBeans**

1. Abre NetBeans
2. Ve a Archivo > Abrir Proyecto
3. Selecciona la carpeta del proyecto y presiona Abrir.

**3. Ejecutar Aplicación**  
Compila el código en NetBeans.

#### **Tecnologías Utilizadas**
* Java 8 o superior
* Swing para la GUI
* NeatBeans IDE (opcional, pero recomendado)
* Patrón de diseño MVC
 
#### **Estructura del Proyecto**
El ejercicio se encuentra en un paquete el cual contiene las diferentes clases utilizadas para el funcionamiento satisfactorio de proyecto.

#### **Clases**
* **Paciente**  
  La clase Paciente representa la información de un paciente en el sistema
* **Nodo**  
  La clase Nodo representa un nodo de la lista enlazada que almacena un objeto Paciente.
* **Lista Enlazada**  
  La clase Lista Enlazada gestiona la estructura de la lista enlazada.
* **Main**  
  La clase Main contiene el método principal para ejecutar el programa.

#### **Características Clave**
* **Interfaz de consola:** Interactiva con el usuario
* **Ofrece menú de opciones:** Permite Al usuario elegir entre las distintas opciones, Agregar, Eliminar y ver pacientes registrados
* **Validación de datos:** Manejo de errores en la entrada de usuario.

#### **Autores y Créditos**
* Kimberly Julieth Castro French
* Eduar Sachica Camilo Sachica Rodríguez
* Lizeth Katherine Trochez Páez

---

## **Actividad 3. El TAD Pila y el TAD Cola**

### **Evaluador de Expresiones Aritméticas**

#### **Descripción**
El presente proyecto es el resultado de un aplicativo desarrollado en Java el cual permite valuar expresiones aritméticas escritas en notación infija. Para ello, el programa debe convertir la expresión a notación postfija (Polaca Inversa) y evaluarla utilizando una estructura de datos tipo Pila.

#### **Datos Solicitados para el Cálculo**
Con el objetivo de obtener los datos de la expresión el usuario final debe ingresar la expresión aritmética, la cual será analizada para detectar el balanceo de los paréntesis.
* Expresión Aritmética

#### **Instalación y Uso**

**1. Clonar el repositorio**  
Si utilizas git, ejecuta el siguiente comando:
```
git clone https://github.com/KimCastroF/Guia-3.git
```
O descárgalo en formato .zip desde GitHub y extráelo en tu computadora.
 
**2. Abrir en NetBeans**

1. Abre NetBeans
2. Ve a Archivo > Abrir Proyecto
3. Selecciona la carpeta del proyecto y presiona Abrir.

**3. Ejecutar Aplicación**  
Compila el código en NetBeans.

#### **Tecnologías Utilizadas**
* Java 8 o superior
* Swing para la GUI
* NeatBeans IDE (opcional, pero recomendado)
* Patrón de diseño MVC
 
#### **Estructura del Proyecto**
El ejercicio se encuentra en un paquete el cual contiene las diferentes clases utilizadas para el funcionamiento satisfactorio de proyecto.

#### **Clases**
* **Clase Balanceo**  
  Verifica si una expresión infija tiene los paréntesis correctamente balanceados.
* **Clase Convertidor Postfija**  
  Convierte una expresión de notación infija a notación postfija.
* **Clase Eval Postfija**  
  Evalúa la expresión en notación postfija y devuelve el resultado numérico.
* **Clase Main**  
  Se encarga del funcionamiento del programa.

#### **Características Clave**
* **Interfaz de consola:** Interactiva con el usuario
* **Ofrece menú de opciones:** Permite al usuario ingresar la expresión
* **Validación de datos:** Manejo de errores en la entrada de usuario.
* **Balanceo de paréntesis:** Verifica que la expresión sea correcta

#### **Autores y Créditos**
* Kimberly Julieth Castro French
* Eduar Sachica Camilo Sachica Rodríguez
* Lizeth Katherine Trochez Páez
