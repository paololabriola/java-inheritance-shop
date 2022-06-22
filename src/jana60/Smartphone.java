package jana60;

import java.text.DecimalFormat;
import java.util.Random;

public class Smartphone extends Prodotto {
	
	private String codiceIMEI;
	private int memoriaCellulare;

	private DecimalFormat df = new DecimalFormat("0 GB");
	private Random random = new Random();
	
	public Smartphone(int codiceProdotto, int ivaProdotto, String nomeProdotto, String marcaProdotto, double prezzoProdotto,  int memoriaCellulare) {
		
		super(codiceProdotto, ivaProdotto, nomeProdotto, marcaProdotto, prezzoProdotto);
		this.memoriaCellulare = memoriaCellulare;
		this.codiceIMEI = generaSerie(8) + "-" + generaSerie(6) + "-" + generaSerie(1) + "-" + generaSerie(2);
		
	}

	public String getMemoriaCellulare() {
		return df.format(memoriaCellulare);
	}

	public void setMemoriaCellulare(int memoriaCellulare) {
		this.memoriaCellulare = memoriaCellulare;
	}

	public String getCodiceIMEI() {
		return codiceIMEI;
	}

	private String generaNumeroSerie() {
		
		Integer numeroSerie = random.nextInt(10);
		
		return numeroSerie.toString();
		
	}
	
	private String generaSerie(int max) {
		
		String serie="";
		
		for(int i = 0; i < max; i++) {
			
			serie+= generaNumeroSerie();
			
		}
		
		return serie;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nCodice IMEI: " + getCodiceIMEI() + "\nMemoria cellulare: " + getMemoriaCellulare();
		
	}
	
}
