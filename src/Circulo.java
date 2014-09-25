public class Circulo {

	static final double NUM_PI =3.1416;

	private double radio;
	private double area;
	private double circu;
	
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
