package Poveste;

public class Timp {
	int vaAduna;
	public void vara(Personaj personaj){
		if (personaj.getLene() > personaj.getHarnicie()){
			vaAduna = 0;
		}else{
			if (vaAduna < 0){
			    vaAduna = 0;
			}else{
			    vaAduna = personaj.getHarnicie() - personaj.getLene();
			}
		}
		personaj.getCamara().setGraunte(vaAduna);
	}
	public void iarna(Personaj personaj){
		if (personaj.getCamara().getGraunte()< 3){
			personaj.isAlive = false;
		} else {
			personaj.getCamara().setGraunte(personaj.getCamara().getGraunte() - 1);
		}
	}
	
}
