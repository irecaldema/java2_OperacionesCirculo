public class Circulo {

	private double radio;
	
public void setRadio(double radio) 
 {
	this.radio = radio;
 }
 
  public double getArea () 
 {
	double result = 3.1416*radio*radio;
	return result;
 }
 
 public double getCircu () 
 {
	double result  = 2*3.1416*radio;
	return result;
 }


}
