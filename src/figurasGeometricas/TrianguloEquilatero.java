package figurasGeometricas;

public class TrianguloEquilatero {
	public static int numeroFiguras = 0;
	private int lado;
	private int altura;
	
	TrianguloEquilatero (){
		this.lado = this.altura = 0;
		numeroFiguras++;
	}
	TrianguloEquilatero (int lado, int altura){
		this.lado = lado;
		this.altura = altura;
		numeroFiguras++;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularArea () {
		int area= 0;
		if (altura == 0) {
			throw new ArithmeticException("Altura no puede ser cero"); 
			}
		else {
			area = (lado * 2) / altura;
		}	
		return area;
	}
	
	public int calcularPerimetro () {
		int perimetro = 3 * lado;
		return perimetro;
	}
	
	public void imprimirFigura() {
		System.out.println("La figura TriánguloEquilátero tiene lado: " + lado 
				+ " y altura: " + altura);
		
	}	
}
