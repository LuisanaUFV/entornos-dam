
package figurasGeometricas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsoFiguras {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean salir = false; 
		int opcion = 0;
		int radio = 0, lado = 0, altura = 0, ancho = 0, alto = 0;
		
		do  {
			System.out.println("\n\t\tElige la figura a crear."
					+ "\n\t\t1) Círculo"
					+ "\n\t\t2) Triángulo Equilátero"
					+ "\n\t\t3) Rectángulo"
					+ "\n\t\t4) Finalizar");
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Ha de introducir un número");
				sc.next();
				opcion = 0;
			} catch (Exception ex) {
				System.err.println("Error desconocido " + ex.getMessage());
				sc.next();
				opcion = 0;
			}
			
			switch (opcion) {
			case 1:
				System.out.println("\n\t\tIntroduce el radio: ");
				radio = sc.nextInt();
				Circulo circulo = new Circulo (radio);
				circulo.imprimirFigura();
				System.out.println("El area de la figura es: " + circulo.calcularArea());
				System.out.println("El perímetro de la figura es: " + circulo.calcularPerimetro());
				break;
				
			case 2:
				System.out.println("\n\t\tIntroduce el lado: ");
				lado = sc.nextInt();
				System.out.println("\n\t\tIntroduce la altura: ");
				altura = sc.nextInt();
				TrianguloEquilatero triangulo = new TrianguloEquilatero (lado, altura);
				triangulo.imprimirFigura();
				double area = 0.0;
				try {
				  area = triangulo.calcularArea();
				} catch (ArithmeticException ex) {
					System.out.println("Error: " + ex.getMessage());
					//PROBAR salida error
					System.err.println("Error: " + ex.getMessage());
				} finally {
					System.out.println("El area de la figura es: " + area);	
				} 
					System.out.println("El perímetro de la figura es: " + triangulo.calcularPerimetro());
				break;
				
			case 3:
				System.out.println("\n\t\tIntroduce el ancho: ");
				ancho = sc.nextInt();
				System.out.println("\n\t\tIntroduce el alto: ");
				alto = sc.nextInt();
				Rectangulo rectangulo = new Rectangulo (ancho, alto);
				rectangulo.imprimirFigura();
				System.out.println("El area de la figura es: " + rectangulo.calcularArea());
				System.out.println("El perímetro de la figura es: " + rectangulo.calcularPerimetro());
				break;
				
			case 4:
				System.out.println("\n\t\tHas creado las siguientes figuras: \n\t\t" + 
						Circulo.numeroFiguras + " círculos\n\t\t" +
						TrianguloEquilatero.numeroFiguras + " triangulos\n\t\t" +
						Rectangulo.numeroFiguras + " rectangulos");
				salir = true;
			    break;
			
			default: 
				System.out.println("Opción no válida");
		  }
		} while (!salir);
		System.out.println("Bye!");
		sc.close();		
		
	}

}