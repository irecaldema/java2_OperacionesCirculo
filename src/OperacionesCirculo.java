import java.util.Scanner;

public class OperacionesCirculo 
{

public static void main (String args[]) 
	{
 double radio;

 Scanner sc = new Scanner(System.in);
 System.out.print("\ningresa el radio del circulo a analizar: ");
 radio = sc.nextDouble();
 
 Circulo operaciones = new Circulo(radio);
  
 //resultado = operaciones.area(radio);
 System.out.println("\nEl area del circulo es: " + operaciones.Area());

 //resultado = operaciones.circu(radio); 
 System.out.println("\nLa circunferencia del circulo es: " + operaciones.Circu());

 System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
