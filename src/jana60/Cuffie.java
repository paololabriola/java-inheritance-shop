package jana60;

public class Cuffie extends Prodotto {
	
	String coloreCuffie;
	boolean opzioneWireless;

	public Cuffie(int codiceProdotto, int ivaProdotto, String nomeProdotto, String marcaProdotto, double prezzoProdotto, String coloreCuffie, boolean opzioneWireless) {
		
		super(codiceProdotto, ivaProdotto, nomeProdotto, marcaProdotto, prezzoProdotto);
		this.coloreCuffie = coloreCuffie;
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
