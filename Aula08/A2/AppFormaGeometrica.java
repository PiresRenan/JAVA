package A2;

public class AppFormaGeometrica {

	public static void main(String[] args) {

		FormaGeometrica square = new Square(8, "Quadrado");
		FormaGeometrica circle = new Circle(5, "Bola");
		FormaGeometrica losangle = new Losangle(8, 4, "Losango");
		FormaGeometrica triangle = new Triangle(5, 10, "Triângulo");
		FormaGeometrica trapezoid = new Trapezoid(6, 7, 10, "Trapezóide");
		FormaGeometrica ellipse = new Ellipse(20, 35, "Elipse");
		
		System.out.println("====Área do Quadrado====");
		System.out.println("==>" + square.print());
		System.out.println("==>área: " + square.calculateArea() + " m." );
		
		System.out.println();
		
		System.out.println("====Área do Círculo====");
		System.out.println("==>" + circle.print());
		System.out.println("==>área: " + circle.calculateArea() + " m." );
		
		System.out.println();
		
		System.out.println("====Área do Losango====");
		System.out.println("==>" + losangle.print());
		System.out.println("==>área: " + losangle.calculateArea() + " m." );
		
        System.out.println();
		
		System.out.println("====Área do Triangulo====");
		System.out.println("==>" + triangle.print());
		System.out.println("==>área: " + triangle.calculateArea() + " m." );
		
        System.out.println();
		
		System.out.println("====Área do Trapezóide====");
		System.out.println("==>" + trapezoid.print());
		System.out.println("==>área: " + trapezoid.calculateArea() + " m." );
		
        System.out.println();
		
		System.out.println("====Área do Elipse====");
		System.out.println("==>" + ellipse.print());
		System.out.println("==>área: " + ellipse.calculateArea() + " m." );
	}
}
