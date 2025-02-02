package Tema02.ej04Avanzado;

import java.util.Scanner;

public class Ej01 {
	
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         boolean v = true;
         int suma = 0;

         do {
             System.out.println("Ingrese un número mayor a 0:");
             int n = sc.nextInt();
             
             if (n <= 0) {
                 System.out.println("El número debe ser mayor a 0.");
             } else {
              // Imprimir y sumar números impares hasta n
                 for (int i = 1; i <= n; i += 2) { // Incremento en 2 para solo iterar impares
                     System.out.print(i); // Imprime el número impar
                     if (i + 2 <= n) {
                         System.out.print(" + ");
                     }
                     suma += i; // Sumar el número impar
                 }
                 
                 System.out.println(" = " + suma);
                 v = false; // Salir del bucle
             }
         } while (v);

         sc.close();
     }
 }