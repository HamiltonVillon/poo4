/**
 * Esta clase crea un circulo a traves de un punto
 * @author Hamilton
 *
 */
public class Circulo {
// Atributos/Propiedades
	private double radio=1;
	public static final double pi = 3.1415926535;
	private Punto p;
	
	//contructor
	
	public Circulo(Punto centro, double r)
	{
		p=centro;
		radio= r;
	}
	
	/**
	 * este metodo calcula el area y
	 * @return Double Area
	 */
	public double calcularArea()
	{
		return pi*Math.pow(radio, 2);
	}
	
	/**
	 * Este metodo calcula el perimetro o circunferencia
	 * @return Double perimetro
	 */
	public double calcularCircunferencia()
	
	{
		return 2*pi*radio;
	}

	public void imprimirCirculo() {
		String salida =" El circulo tienes radio  " +  this.radio + " centrado en el punto ("+ p.getX() + ";" + p.getY() + " )";
		salida += " El area del circulo es: " + calcularArea() + " y su circunferencia es : "+ calcularCircunferencia();
		
		System.out.println(salida);
	}
}
