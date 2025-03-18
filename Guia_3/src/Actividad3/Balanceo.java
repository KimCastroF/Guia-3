
package Actividad3;
/**
 *Kimberly Castro
 *Katherin Trochez
 *Eduar Sachica
 */
import java.util.Stack;

public class Balanceo {
    public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();
        
        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } 
            else if (c == ')') {
                if (pila.isEmpty()) {
                    return false; // Paréntesis desbalanceados
                }
                pila.pop();
            }
        }
        
        return pila.isEmpty(); // Si la pila está vacía, los paréntesis están balanceados
    }
}

   

