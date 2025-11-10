package seriea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Campionato {
    
    private Squadra[] squadre;

    public Campionato(String nomeFile) throws FileNotFoundException {
        squadre = new Squadra[20];
        File fileInput = new File(nomeFile);
        Scanner leggi = new Scanner(fileInput);
        
        int i = 0;
        
        while(leggi.hasNextLine()) {
            String s = leggi.nextLine();
            String[] ss = s.split(",");
            squadre[i] = new Squadra(ss[0], Integer.parseInt(ss[1]), Integer.parseInt(ss[2]), Integer.parseInt(ss[3]), Integer.parseInt(ss[4]) );
            i++;
        }
        
    }
    
    public void stampaClassifica() {
        for (int i = 0; i < squadre.length; i++) {
            Squadra s = squadre[i];
            System.out.println((i + 1) + ". " + s.getNome() + " " + s.getGiocate() + " " + s.getVinte() + " " +
                    s.getPareggiate() + " " + s.getPerse() + " " + s.getPunti());
        }
    }
    
    public void stampaSquadra(String nomeSquadra) {
        for (int i = 0; i < squadre.length; i++) {
            if (squadre[i].getNome().equalsIgnoreCase(nomeSquadra)) {
                System.out.println(squadre[i]);
            }
        }
    }
    
    int puntiVinte = 3;   
    int puntiPareggi = 1; 
    int puntiPerse = 0;   

    public void calcoloVinte(int vinte) {
        for (int i = 1; i <= vinte; i++) {
            int totale = puntiVinte * i;
            System.out.println("Dopo " + i + " vittorie: " + totale + " punti");
        }
    }

    public void calcoloPareggi(int pareggi) {
        for (int i = 1; i <= pareggi; i++) {
            int totale = puntiPareggi * i;
            System.out.println("Dopo " + i + " pareggi: " + totale + " punti");
        }
    }

    public void calcoloPerse(int perse) {
        for (int i = 1; i <= perse; i++) {
            int totale = puntiPerse * i;
            System.out.println("Dopo " + i + " sconfitte: " + totale + " punti");
        }
    }

    public Squadra getSquadra(int i){
        return squadre[i];
    }
    
    public void ordinaClassifica() {
    for (int i = 0; i < squadre.length - 1; i++) {
        for (int j = i + 1; j < squadre.length; j++) {
            if (squadre[j].getPunti() > squadre[i].getPunti()) {
                Squadra temp = squadre[i];
                squadre[i] = squadre[j];
                squadre[j] = temp;
            }
        }
    }
}   
}


