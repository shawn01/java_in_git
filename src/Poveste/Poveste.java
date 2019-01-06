package Poveste;

public class Poveste {
	public static void main(String[] args) {
		Personaj greiere = new Personaj("greiere",1,0,new Camara());
		Personaj furnica = new Personaj("furnica",0,1,new Camara());
		
		System.out.println(greiere.getCamara().graunte);
		System.out.println(furnica.getCamara().graunte);
		Timp timp = new Timp();
		for(int i=0;i<3;i++){
			greiere.getCamara().graunte += timp.vara(greiere);
			furnica.getCamara().graunte += timp.vara(furnica);
		}
		for(int i=0;i<5;i++){
			timp.iarna(greiere);
			timp.iarna(furnica);
		}
		
		
	}

}
