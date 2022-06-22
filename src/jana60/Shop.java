package jana60;

public class Shop {

	public static void main(String[] args) {
		
		System.out.println("Lo scopo di questo codice è stampare a schermo le caratteristiche di un prodotto.");
		
		Smartphone prodotto1 = new Smartphone(10, 20, "iphone4", "Apple", 499.99, 16 );
		Televisore prodotto2 = new Televisore(11, 20, "iphone6", "Apple", 799.99, 15, true );
		Cuffie prodotto3 = new Cuffie(12, 20, "Fnatic REACT", "FNATIC", 44.99, "Nere", false);
		
		System.out.println(prodotto1.toString());
		System.out.println(prodotto2.toString());
		System.out.println(prodotto3.toString());
		
	}

}
