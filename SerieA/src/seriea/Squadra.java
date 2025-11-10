package seriea;

public class Squadra {
    private String nome;
    private int giocate;
    private int vinte;
    private int pareggiate;
    private int perse;
    private int punti;

    public Squadra(String nome, int giocate, int vinte, int pareggiate, int perse) {
        this.nome = nome;
        this.giocate = giocate;
        this.vinte = vinte;
        this.pareggiate = pareggiate;
        this.perse = perse;
        this.punti = vinte*3 + pareggiate; 
    }

    public String getNome() {
        return nome;
    }

    public int getGiocate() {
        return giocate;
    }

    public int getVinte() {
        return vinte;
    }

    public int getPareggiate() {
        return pareggiate;
    }

    public int getPerse() {
        return perse;
    }

    public int getPunti() {
        return punti;
    }
    
    @Override
    public String toString() {
        return nome + " - Giocate: " + giocate + ", Vinte: " + vinte + ", Pareggiate: " + pareggiate + ", Perse: " + perse + ", Punti: " + punti;
    }
        
}
