package oop;

public class Cylinder implements ThreeDimensionalShape {
    private int yaricap;
    private int uzunluk;
    public Cylinder() {
    	
    }
    public Cylinder(int yaricap,int uzunluk)
    {
    	this.yaricap = yaricap;
    	this.uzunluk = uzunluk;
    }
	public int getYaricap() {
		return yaricap;
	}
	public void setYaricap(int yaricap) {
		this.yaricap = yaricap;
	}
	public int getUzunluk() {
		return uzunluk;
	}
	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}
	@Override
	public double getArea() {
		return 2*Math.PI*yaricap*(yaricap+uzunluk);
	}

	@Override
	public double getVolume() {
		return Math.PI*yaricap*yaricap*uzunluk;
	}

}
