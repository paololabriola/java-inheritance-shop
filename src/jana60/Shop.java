package jana60;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		
		System.out.println("Lo scopo di questo codice è stampare a schermo le caratteristiche di un prodotto.");
		
		/*
		Smartphone prodotto1 = new Smartphone(10, 20, "iphone4", "Apple", 499.99, 16 );
		Televisore prodotto2 = new Televisore(11, 20, "Tv LED", "Philips", 799.99, 15, true );
		Cuffie prodotto3 = new Cuffie(12, 20, "Fnatic REACT", "FNATIC", 44.99, "Nere", false);
		
		System.out.println(prodotto1.toString());
		System.out.println(prodotto2.toString());
		System.out.println(prodotto3.toString());
		*/
		
		boolean chiudiProgramma = false;
		Scanner scan = new Scanner(System.in);
		int codice = 0;
		String conferma;
		
		while(!chiudiProgramma) {
			
			int scelta;
			
			do {
				
				System.out.println("Inserisci 1. per acquistare uno Smartphone, 2. per acquistare un Televisore, 3. per acquistare un paio di cuffie, 4. per chiudere il programma.");
				scelta = Integer.parseInt(scan.nextLine());
				
				if(scelta != 1 && scelta != 2 && scelta != 3 && scelta != 4 && scelta != 5)
					System.out.println("ERRORE. Inserisci un valore valido.");
					
			}while(scelta != 1 && scelta != 2 && scelta != 3 && scelta != 4 && scelta != 5);
			
			switch (scelta){
				
				case 1 : 
					
					int numeroSmartphone;
					
					do {
						
						System.out.print("Inserisci il numero di cellulari che vuoi acquistare: ");
						numeroSmartphone = Integer.parseInt(scan.nextLine());
						
						if(numeroSmartphone <= 0)
							System.out.println("ERRORE. Inserisci un valore valido.");
						
					}while(numeroSmartphone <= 0);
					
					Smartphone[] prodotti1 = new Smartphone[numeroSmartphone];
					
					for(int i = 0; i < numeroSmartphone; i++) {
						
						String nomeProdotto;
						
						do {
							
							System.out.print("Inserisci il nome del " + (i + 1) + "° cellulare che vuoi acquistare: ");
							nomeProdotto = scan.nextLine();
							
							do {
							
								System.out.print("Confermi che il nome del cellulare che vuoi acquistare è " + nomeProdotto + "? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						String marcaProdotto;
						
						do {
							
							System.out.print("Inserisci la marca del " + (i + 1) + "° cellulare che vuoi acquistare: ");
							marcaProdotto = scan.nextLine();
							
							do {
							
								System.out.print("Confermi che la marca del cellulare che vuoi acquistare è " + marcaProdotto + "? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						Double prezzoProdotto;
						
						do {
						
							do {
								
								do {
									
									System.out.print("Inserisci il prezzo del " + (i + 1) + "° cellulare che vuoi acquistare: ");
									prezzoProdotto = Double.parseDouble(scan.nextLine());
									
									if(prezzoProdotto <= 0)
										System.out.println("ERRORE. Inserisci un valore valido.");
									
								}while(prezzoProdotto <= 0);
							
								System.out.print("Confermi che il prezzo del cellulare che vuoi acquistare è " + prezzoProdotto + "€? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						int memoriaProdotto;
						
						do {
							
							do {
								
								do {
									
									System.out.print("Inserisci il valore della memoria del " + (i + 1) + "° cellulare che vuoi acquistare: ");
									memoriaProdotto = Integer.parseInt(scan.nextLine());
									
									if(memoriaProdotto != 16 && memoriaProdotto != 32 && memoriaProdotto != 64 && memoriaProdotto !=128)
										System.out.println("ERRORE. Inserisci un valore valido: 16/32/64/128.");
									
								}while(memoriaProdotto != 16 && memoriaProdotto != 32 && memoriaProdotto != 64 && memoriaProdotto !=128);
							
								System.out.print("Confermi che la memoria del cellulare che vuoi acquistare è di " + memoriaProdotto + "GB? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						prodotti1[i] = new Smartphone(codice+1, nomeProdotto, marcaProdotto, prezzoProdotto, memoriaProdotto);
												
					}
					
					for(int i = 0; i < numeroSmartphone; i++) {
						
						System.out.println(prodotti1[i].toString());
						
					}
					
					break;
					
				case 2:
					
					int numeroTelevisori;
					
					do {
						
						System.out.print("Inserisci il numero di televisori che vuoi acquistare: ");
						numeroTelevisori = Integer.parseInt(scan.nextLine());
						
						if(numeroTelevisori <= 0)
							System.out.println("ERRORE. Inserisci un valore valido.");
						
					}while(numeroTelevisori <= 0);
					
					Televisore[] prodotti2 = new Televisore[numeroTelevisori];
					
					
					
					for(int i = 0; i < numeroTelevisori; i++) {
						
						String nomeProdotto;
						
						do {
							
							System.out.print("Inserisci il nome del " + (i + 1) + "° televisore che vuoi acquistare: ");
							nomeProdotto = scan.nextLine();
							
							do {
							
								System.out.print("Confermi che il nome del televisore che vuoi acquistare è " + nomeProdotto + "? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						String marcaProdotto;
						
						do {
							
							System.out.print("Inserisci la marca del " + (i + 1) + "° televisore che vuoi acquistare: ");
							marcaProdotto = scan.nextLine();
							
							do {
							
								System.out.print("Confermi che la marca del televisore che vuoi acquistare è " + marcaProdotto + "? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						Double prezzoProdotto;
						
						do {
						
							do {
								
								do {
									
									System.out.print("Inserisci il prezzo del " + (i + 1) + "° televisore che vuoi acquistare: ");
									prezzoProdotto = Double.parseDouble(scan.nextLine());
									
									if(prezzoProdotto <= 0)
										System.out.println("ERRORE. Inserisci un valore valido.");
									
								}while(prezzoProdotto <= 0);
							
								System.out.print("Confermi che il prezzo del televisore che vuoi acquistare è " + prezzoProdotto + "€? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						int dimensioneProdotto;
						
						do {
							
							do {
								
								do {
									
									System.out.print("Inserisci la dimensione(pollici) del " + (i + 1) + "° televisore che vuoi acquistare: ");
									dimensioneProdotto = Integer.parseInt(scan.nextLine());
									
									if(dimensioneProdotto <= 0)
										System.out.println("ERRORE. Inserisci un valore valido.");
									
								}while(dimensioneProdotto <= 0);
							
								System.out.print("Confermi che la dimensione del televisore che vuoi acquistare è di " + dimensioneProdotto + " pollici? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						Boolean opzione;
			
							do {
										
									System.out.print("Il " + (i + 1) + "° televisore che vuoi acquistare ha l'opzione smart tv? ");
									conferma = scan.nextLine();
										
									if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
										System.out.println("ERRORE. Inserisci solo Si o No.");
										
							}while(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"));
									
							if(conferma.equalsIgnoreCase("si")) 
								opzione = true;
							else 
								opzione = false;
							
						prodotti2[i] = new Televisore(codice+1, nomeProdotto, marcaProdotto, prezzoProdotto, dimensioneProdotto, opzione);
						
					}
					
					for(int i = 0; i < numeroTelevisori; i++) {
						
						System.out.println(prodotti2[i].toString());
						
					}
					
					break;
					
				case 3:
					
					int numeroCuffie;
					
					do {
						
						System.out.print("Inserisci il numero di cuffie che vuoi acquistare: ");
						numeroCuffie = Integer.parseInt(scan.nextLine());
						
						if(numeroCuffie <= 0)
							System.out.println("ERRORE. Inserisci un valore valido.");
						
					}while(numeroCuffie <= 0);
					
					Cuffie[] prodotti3 = new Cuffie[numeroCuffie];
					
					
					
					for(int i = 0; i < numeroCuffie; i++) {
						
						String nomeProdotto;
						
						do {
							
							System.out.print("Inserisci il nome delle " + (i + 1) + "° cuffie che vuoi acquistare: ");
							nomeProdotto = scan.nextLine();
							
							do {
							
								System.out.print("Confermi che il nome delle cuffie di cuffie che vuoi acquistare è " + nomeProdotto + "? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						String marcaProdotto;
						
						do {
							
							System.out.print("Inserisci la marca del " + (i + 1) + "° paio di cuffie che vuoi acquistare: ");
							marcaProdotto = scan.nextLine();
							
							do {
							
								System.out.print("Confermi che la marca delle cuffie che vuoi acquistare è " + marcaProdotto + "? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						Double prezzoProdotto;
						
						do {
						
							do {
								
								do {
									
									System.out.print("Inserisci il prezzo delle " + (i + 1) + "° cuffie che vuoi acquistare: ");
									prezzoProdotto = Double.parseDouble(scan.nextLine());
									
									if(prezzoProdotto <= 0)
										System.out.println("ERRORE. Inserisci un valore valido.");
									
								}while(prezzoProdotto <= 0);
							
								System.out.print("Confermi che il prezzo delle cuffie che vuoi acquistare è " + prezzoProdotto + "€? ");
								conferma = scan.nextLine();
							
								if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
								System.out.println("Rispondi solo Si o No.");
							
							}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
						
						}while(conferma.equalsIgnoreCase("no"));
						
						String coloreProdotto;
						
								System.out.print("Inserisci il colore delle " + (i + 1) + "° cuffie che vuoi acquistare: ");
								coloreProdotto = scan.nextLine();
						
						Boolean opzione;
			
							do {
										
									System.out.print("Le " + (i + 1) + "° cuffie che vuoi acquistare sono wireless? ");
									conferma = scan.nextLine();
										
									if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
										System.out.println("ERRORE. Inserisci solo Si o No.");
										
							}while(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"));
									
							if(conferma.equalsIgnoreCase("si")) 
								opzione = true;
							else 
								opzione = false;
							
						prodotti3[i] = new Cuffie(codice+1, nomeProdotto, marcaProdotto, prezzoProdotto, coloreProdotto, opzione);
						
					}
					
					for(int i = 0; i < numeroCuffie; i++) {
						
						System.out.println(prodotti3[i].toString());
						
					}
					
					break;
					
				case 4:
					
					chiudiProgramma = true;
					
			}
			
			scan.close();
			
		}
		
	}

}
