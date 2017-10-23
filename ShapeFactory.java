package oop;

public class ShapeFactory {
    public Shape getShape(String shapeType)
    {
    	if(shapeType.equalsIgnoreCase("square"))
    	{
    		return new Square();
    	}else if(shapeType.equalsIgnoreCase("triangle"))
    	{
    		return new Triangle();
    	}else if(shapeType.equalsIgnoreCase("cylinder")){
    		return new Cylinder();
    	}
    	return null;
    }
}
