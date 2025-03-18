
package Actividad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese una expresion aritmetica: ");
            String expresion = scanner.nextLine().replaceAll("\\s+", ""); // Eliminar espacios

            // 1️⃣ Verificar paréntesis balanceados
            if (!Balanceo.estaBalanceado(expresion)) {
                System.out.println("Error: La expresión tiene paréntesis desbalanceados.");
                return;
            }

            // 2️⃣ Convertir a notación postfija
            String postfija = ConvertidorPostfija.convertir(expresion);
            System.out.println("Expresión en notación postfija: " + postfija);

            // 3️⃣ Evaluar la expresión postfija
            try {
                double resultado = EvalPostfija.evaluar(postfija);
                System.out.println("Resultado de la evaluación: " + resultado);
            } catch (Exception e) {
                System.out.println("Error en la evaluación: " + e.getMessage());
            }

            scanner.close();
    }
}    

