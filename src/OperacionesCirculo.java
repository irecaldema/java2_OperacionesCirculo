import java.util.Scanner;

public class OperacionesCirculo 
{

public static void main (String args[]) 
	{
 double radio, resultado;
 Circulo operaciones = new Circulo();
 
 Scanner sc = new Scanner(System.in);
 System.out.print("\ningresa el radio del circulo a analizar: ");
 radio = sc.nextDouble();

 //resultado = operaciones.area(radio);
 operaciones.setRadio(radio);
 System.out.println("\nEl area del circulo es: " + getArea());

 resultado = operaciones.circu(radio); 
 System.out.println("\nLa circunferencia del circulo es: " + getCircu());

 System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
