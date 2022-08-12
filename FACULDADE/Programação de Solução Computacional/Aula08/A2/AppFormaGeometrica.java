package A2;

public class AppFormaGeometrica {

	public static void main(String[] args) {

		FormaGeometrica square = new Square(8, "Quadrado");
		FormaGeometrica circle = new Circle(5, "Bola");
		FormaGeometrica losangle = new Losangle(8, 4, "Losango");
		FormaGeometrica triangle = new Triangle(5, 10, "Tri�ngulo");
		FormaGeometrica trapezoid = new Trapezoid(6, 7, 10, "Trapez�ide");
		FormaGeometrica ellipse = new Ellipse(20, 35, "Elipse");
		
		System.out.println("====�rea do Quadrado====");
		System.out.println("==>" + square.print());
		System.out.println("==>�rea: " + square.calculateArea() + " m." );
		
		System.out.println();
		
		System.out.println("====�rea do C�rculo====");
		System.out.println("==>" + circle.print());
		System.out.println("==>�rea: " + circle.calculateArea() + " m." );
		
		System.out.println();
		
		System.out.println("====�rea do Losango====");
		System.out.println("==>" + losangle.print());
		System.out.println("==>�rea: " + losangle.calculateArea() + " m." );
		
        System.out.println();
		
		System.out.println("====�rea do Triangulo====");
		System.out.println("==>" + triangle.print());
		System.out.println("==>�rea: " + triangle.calculateArea() + " m." );
		
        System.out.println();
		
		System.out.println("====�rea do Trapez�ide====");
		System.out.println("==>" + trapezoid.print());
		System.out.println("==>�rea: " + trapezoid.calculateArea() + " m." );
		
        System.out.println();
		
		System.out.println("====�rea do Elipse====");
		System.out.println("==>" + ellipse.print());
		System.out.println("==>�rea: " + ellipse.calculateArea() + " m." );
	}
}
