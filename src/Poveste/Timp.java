package Poveste;

public class Timp {
	int vaAduna;
	public int vara(Personaj personaj){
		if (personaj.getLene() > personaj.getHarnicie()){
			return vaAduna = 0;
		} else {
			if (vaAduna < 0 ){
				return vaAduna = 0;
			} else {
			return vaAduna = personaj.getHarnicie() - personaj.getLene();
			}
		}
	}
	public void iarna(Personaj personaj){
		if (personaj.getCamara().graunte < 3){
			personaj.isAlive = false;
		} else {
			personaj.getCamara().graunte--;
		};
	}
	
}
