package oop;

public class Square implements TwoDimensionalShape {
    private int kenarUzunlugu;
    public Square() {
    	
    }
    public Square(int kenarUzunlugu)
    {
    	this.kenarUzunlugu = kenarUzunlugu;
    }
	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}
	public void setKenarUzunlugu(int kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}
	@Override
	public int getArea() {
		
		return kenarUzunlugu*kenarUzunlugu;
	}

}
