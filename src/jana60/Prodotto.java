package jana60;

import java.text.DecimalFormat;

public class Prodotto {

	private int codiceProdotto, ivaProdotto;
	private String nomeProdotto, marcaProdotto;
	private double prezzoProdotto;
	
	private DecimalFormat df = new DecimalFormat(".00€");

	public Prodotto(int codiceProdotto, int ivaProdotto, String nomeProdotto, String marcaProdotto, double prezzoProdotto) {
		
		super();
		this.codiceProdotto = codiceProdotto;
		this.ivaProdotto = ivaProdotto;
		this.nomeProdotto = nomeProdotto;
		this.marcaProdotto = marcaProdotto;
		this.prezzoProdotto = prezzoProdotto;
		
	}

	public int getIvaProdotto() {
		return ivaProdotto;
	}

	public void setIvaProdotto(int ivaProdotto) {
		this.ivaProdotto = ivaProdotto;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public String getMarcaProdotto() {
		return marcaProdotto;
	}

	public void setMarcaProdotto(String marcaProdotto) {
		this.marcaProdotto = marcaProdotto;
	}

	public String getPrezzoProdotto() {
		return df.format(prezzoProdotto);
	}

	public void setPrezzoProdotto(double prezzoProdotto) {
		this.prezzoProdotto = prezzoProdotto;
	}

	public int getCodiceProdotto() {
		return codiceProdotto;
	}
	
	public String stampaPrezzoProdotto() {
		
		double prezzoFinale;
		
		prezzoFinale = (prezzoProdotto * ivaProdotto) / 100;
		
		return "Il prezzo finale è pari a: " + df.format(prezzoFinale);
		
	}
	
	@Override
	public String toString() {
		
		return  "Nome prodotto: " + nomeProdotto + "\nMarca prodotto: " + marcaProdotto + "\nPrezzo finale: " + stampaPrezzoProdotto(); 
	
	}
	
}
