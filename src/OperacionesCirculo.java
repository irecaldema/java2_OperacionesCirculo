import java.util.Scanner;

public class OperacionesCirculo 
{

public static void main (String args[]) 
	{
 int radio;
 double resultado;
 Circulo operaciones = new Circulo();
 
 Scanner sc = new Scanner(System.in);
 System.out.print("\ningresa el radio del circulo a analizar: ");
 radio = sc.nextInt();

 resultado = operaciones.circu(radio); 
 System.out.println("\nLa circunferencia del circulo es: " + resultado);

 resultado = operaciones.area(radio);
 System.out.println("\nEl area del circulo es: " + resultado);


 System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
