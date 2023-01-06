package figurasGeometricas;

public class Rectangulo {
	public static int numeroFiguras = 0;
	 private int ancho;
	 private int alto;

	 Rectangulo () {
		 this.ancho = this.alto = 0;
		 numeroFiguras++;
	 }
	 Rectangulo (int ancho, int alto) {
		 this.ancho = ancho;
		 this.alto = alto;
		 numeroFiguras++;
	 }
	 
	 public int getAlto() {
	   return alto;
	 }
	 
	 public void setAlto(int alto) {
		 this.alto = alto;
	 }
	 public int getAncho() {
	   return ancho;
	 }
	 public void setAncho (int ancho) {
	   this.ancho = ancho;
	 }
	 public int calcularArea() {
		 int area = this.ancho * this.alto;
		 return area;
	 }
	 public int calcularPerimetro() {
		 int perimetro = 2 * (this.ancho + this.alto);
		 return perimetro;
	 }
	 public void imprimirFigura() {
			System.out.println("La figura Rectángulo tiene ancho: " + ancho + " y alto: " + alto);
	 }
}
