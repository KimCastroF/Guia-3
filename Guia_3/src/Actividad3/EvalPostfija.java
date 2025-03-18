
package Actividad3;

import java.util.Stack;

public class EvalPostfija {
    public static double evaluar(String expresionPostfija) {
        Stack<Double> pila = new Stack<>();
        String[] tokens = expresionPostfija.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+")) { // Si es un número
                pila.push(Double.parseDouble(token));
            } else { // Si es un operador
                if (pila.size() < 2) {
                    throw new IllegalArgumentException("Expresión postfija inválida.");
                }
                double num2 = pila.pop();
                double num1 = pila.pop();

                switch (token) {
                    case "+": pila.push(num1 + num2); 
                    break;
                    case "-": pila.push(num1 - num2); 
                    break;
                    case "*": pila.push(num1 * num2);
                    break;
                    case "/":
                        if (num2 == 0) throw new ArithmeticException("División por cero.");
                        pila.push(num1 / num2);
                        break;
                    default:
                        throw new IllegalArgumentException("Operador no válido: " + token);
                }
            }
        }

        if (pila.size() != 1) {
            throw new IllegalArgumentException("Expresión postfija mal formada.");
        }

        return pila.pop(); // Retornar el resultado final
    }
}

