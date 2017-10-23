package oop;

public class Triangle implements TwoDimensionalShape {
    private int yukseklik;
    private int taban;
    public Triangle() {
    	
    }
    public Triangle(int taban,int yukseklik)
    {
    	this.yukseklik = yukseklik;
    	this.taban = taban;
    }
	public int getYukseklik() {
		return yukseklik;
	}
	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
	public int getTaban() {
		return taban;
	}
	public void setTaban(int taban) {
		this.taban = taban;
	}
	@Override
	public int getArea() {
		
		return yukseklik * taban /2;
	}

}
