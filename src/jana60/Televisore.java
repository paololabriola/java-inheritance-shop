package jana60;

public class Televisore extends Prodotto{
	
	private int dimensionePollici;
	boolean opzioneSmart;

	public Televisore(int codiceProdotto, String nomeProdotto, String marcaProdotto, double prezzoProdotto, int dimensionePollici, boolean opzioneSmart) {
	
		super(codiceProdotto, nomeProdotto, marcaProdotto, prezzoProdotto);
		this.dimensionePollici = dimensionePollici;
		this.opzioneSmart = opzioneSmart;
		
	}

	public int getDimensionePollici() {
		return dimensionePollici;
	}

	public void setDimensionePollici(int dimensionePollici) {
		this.dimensionePollici = dimensionePollici;
	}

	public boolean isOpzioneSmart() {
		return opzioneSmart;
	}

	public void setOpzioneSmart(boolean opzioneSmart) {
		this.opzioneSmart = opzioneSmart;
	}

	@Override
	public String toString() {
		
		String opzione = "";
		
		if(opzioneSmart)
			opzione += "On";
		else
			opzione += "Off";
			
		return super.toString() + "\nDimensione(Pollici): " + dimensionePollici + "\nOpzione Smart TV: " + opzione;
		
	}
	
}
