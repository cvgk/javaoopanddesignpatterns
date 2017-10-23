package oop;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape = new Square(4);
		if(shape instanceof Square)
		{
			System.out.println(1);
		}

	}

}
