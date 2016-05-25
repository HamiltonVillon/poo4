
public class simuladorGeometrico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Punto p = new Punto(9.5,7.8);
        double x = p.getX();
        double y = p.getY();
        p.imprimir();
        
         
        
        
        
        
        Circulo c = new Circulo(p, 5);
        c.imprimirCirculo();
	}
}