package seriea;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        
        Campionato c = new Campionato("data/SerieA.csv");
        
        Scanner menu = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1= stampa classifica");
        System.out.println("2= calcola punteggi");
        System.out.println("3= ordina squadre");
        System.out.println("4= trova squadra");
        System.out.println("5= esci");
        System.out.print("Scegli cosa vuoi fare: ");
        int numMenu = menu.nextInt();
        
        switch (numMenu) {
            case 1:
                c.stampaClassifica();
                break;
            case 2:
                System.out.println("\nCalcolo dei punteggi per ogni squadra:");
                for (int i = 0; i < 20; i++) {
                    Squadra s = c.getSquadra(i);
                    int puntiCalcolati = s.getVinte() * 3 + s.getPareggiate();
                    System.out.println(s.getNome() + ":" + puntiCalcolati + " punti");
                }   break;
            case 3:
                c.ordinaClassifica();
                System.out.println("Classifica ordinata per punti:");
                c.stampaClassifica();
                break;
            case 4:
                Scanner input = new Scanner(System.in);
                System.out.print("\n" + "inserisci il nome della squadra che vuoi cercare: ");
                String nomeSquadra = input.nextLine();
                c.stampaSquadra(nomeSquadra);
                break;
            case 5:
                System.out.println("Uscita dal programma...");
                break;
            default:
                break;
        }
    }   
}     