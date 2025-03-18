
package Actividad3;


import java.util.Stack;
import java.util.StringTokenizer; //Se usa para delimitador para separar las palabras.

public class ConvertidorPostfija {
    public static String convertir(String expresion) {
        StringBuilder postfija = new StringBuilder();
        Stack<Character> pila = new Stack<>();
        StringTokenizer tokens = new StringTokenizer(expresion, "+-*/^()", true);
        
        boolean prevEsOperador = true; // Para manejar números negativos correctamente
        
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();

            if (token.matches("\\d+")) { // Números de más de una cifra
                postfija.append(token).append(' ');
                prevEsOperador = false;
            } else if (token.equals("(")) {
                pila.push(token.charAt(0));
                prevEsOperador = true;
            } else if (token.equals(")")) {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfija.append(pila.pop()).append(' ');
                }
                pila.pop(); // Quitar '('
                prevEsOperador = false;
            } else if (esOperador(token.charAt(0))) {
                if (token.equals("-") && prevEsOperador) { 
                    // Manejo de números negativos
                    postfija.append("0 "); 
                }
                while (!pila.isEmpty() && prioridad(pila.peek()) >= prioridad(token.charAt(0))) {
                    if (token.charAt(0) == '^' && pila.peek() == '^') break; // Exponentes son asociativos a la derecha
                    postfija.append(pila.pop()).append(' ');
                }
                pila.push(token.charAt(0));
                prevEsOperador = true;
            }
        }

        // Vaciar la pila en la salida
        while (!pila.isEmpty()) {
            postfija.append(pila.pop()).append(' ');
        }

        return postfija.toString().trim();
    }

    private static int prioridad(char operador) {
        switch (operador) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            default: return -1;
        }
    }

    private static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}   

