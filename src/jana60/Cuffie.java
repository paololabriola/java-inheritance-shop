package jana60;

public class Cuffie extends Prodotto {
	
	String coloreCuffie;
	boolean opzioneWireless;

	public Cuffie(int codiceProdotto, String nomeProdotto, String marcaProdotto, double prezzoProdotto, String coloreCuffie, boolean opzioneWireless) {
		
		super(codiceProdotto, nomeProdotto, marcaProdotto, prezzoProdotto);
		this.coloreCuffie = coloreCuffie;
		this.opzioneWireless = opzioneWireless;
		
	}
	
	public String getColoreCuffie() {
		return coloreCuffie;
	}



	public void setColoreCuffie(String coloreCuffie) {
		this.coloreCuffie = coloreCuffie;
	}



	public boolean isOpzioneWireless() {
		return opzioneWireless;
	}



	public void setOpzioneWireless(boolean opzioneWireless) {
		this.opzioneWireless = opzioneWireless;
	}

	@Override
	public String toString() {
		
String opzione = "";
		
		if(opzioneWireless)
			opzione += "On";
		else
			opzione += "Off";
		
		return super.toString() + "\nColore: " + coloreCuffie + "\nOpzione wireless: " + opzione;
	
	}
	
}
