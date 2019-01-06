package Poveste;

public class Poveste {
	public static void main(String[] args) {
		Personaj greiere = new Personaj("greiere",1,0,new Camara());
		Personaj furnica = new Personaj("furnica",0,2,new Camara());
		
		System.out.println(greiere.getCamara().getGraunte());
		System.out.println(furnica.getCamara().getGraunte());
		Timp timp = new Timp();
		for(int i=0;i<3;i++){
			timp.vara(greiere);
			timp.vara(furnica);
		}
		for(int i=0;i<5;i++){
			timp.iarna(greiere);
			timp.iarna(furnica);
		}
		System.out.println(greiere.isAlive);
		System.out.println(furnica.isAlive);
		
	}

}
