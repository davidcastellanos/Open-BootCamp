package Ejercicios1;

import java.util.Locale;
import java.util.Scanner;

public class TresParametros {
    public static double sumarParams(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Ingrese tres números positivos o negativos");
        System.out.println("Ingrese el 1er número:");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el 2do número:");
        double num2 = sc.nextDouble();
        System.out.println("Ingrese el 3er número:");
        double num3 = sc.nextDouble();

        System.out.println("El resultado final es: " + sumarParams(num1, num2, num3));
    }

}
