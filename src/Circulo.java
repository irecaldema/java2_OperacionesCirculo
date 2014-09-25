public class Circulo {

	static final double NUM_PI =3.1416;

	private double radio = 0;
	private double area = 0;
	private double circu = 0;
	
public void setRadio(double radio) 
 {
	this.radio = radio;
	area = NUM_PI*radio*radio;
	circu = 2*NUM_PI*radio;
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
