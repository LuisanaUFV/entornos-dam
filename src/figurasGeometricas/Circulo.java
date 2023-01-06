package figurasGeometricas;

public class Circulo {
	public static int numeroFiguras = 0;
	private static final double PI = 3.1416; 
	private int radio=0;

	public Circulo (){
		radio = 0;
		numeroFiguras ++;
	} 
	public Circulo (int radio){
     this.radio=radio;
     numeroFiguras ++;
    }
 
    public int getRadio() {
		return radio;
    }
    public void setRadio(int radio) {
		this.radio = radio;
    }
    public double calcularArea () {
    	double area = PI * radio * radio;
    	return area;
	}
	public double calcularPerimetro () {
		double perimetro = 2 * PI * radio;
		return perimetro;
	}
	public void imprimirFigura() {
		System.out.println("La FIGURA CÍRCULO TIENE radio: " + radio);
	}
}
