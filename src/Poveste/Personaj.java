package Poveste;

public class Personaj {
	private String name;
	private int lene;
	private int harnicie;
	private Camara camara;
	public boolean isAlive = true;
	public Personaj(String name,int lene,int harnicie,Camara camara){
		this.name = name;
		this.lene = lene;
		this.harnicie = harnicie;
		this.camara = camara;
	}
	public Camara getCamara(){
		return camara;
	}
	public int getLene(){
		return this.lene;
	}
	public int getHarnicie(){
		return this.harnicie;
	}
}
