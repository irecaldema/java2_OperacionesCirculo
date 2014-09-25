public class Circulo {

	private double radio;
	private double area;
	private double circu;
	
public void setRadio(double radio) 
 {
	this.radio = radio;
	area = 3.1416*radio*radio;
	circu = 2*3.1416*radio;
 }
 
public double getArea() 
 {	
	return area;
 }
 
public double getCircu() 
 {	
	return circu;
 }

}
