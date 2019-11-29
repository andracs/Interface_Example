/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 29/11/2019
 */

public class Pokemon {

    protected String navn, gender, udviklesFra, udviklesTil;
    private int nummerPokedex;
    private short skade;

    public Pokemon() {}

    public boolean angreb() {
        // Logik implementeres
        return false;
    }

    /** Tostring vil normalt vise Pokemon@6b71769e
     * Vi viser "Pokemon Pikachu nr. 25 er en han."*/
     @Override
    public String toString() {
        String beskrivelse =
                "Pokemon " +
                        navn + " nr. " +
                        nummerPokedex + " er en " +
                        gender + ".";
        return beskrivelse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUdviklesFra() {
        return udviklesFra;
    }

    public void setUdviklesFra(String udviklesFra) {
        this.udviklesFra = udviklesFra;
    }

    public String getUdviklesTil() {
        return udviklesTil;
    }

    public void setUdviklesTil(String udviklesTil) {
        this.udviklesTil = udviklesTil;
    }

    public int getNummerPokedex() {
        return nummerPokedex;
    }

    public void setNummerPokedex(int nummerPokedex) {
        this.nummerPokedex = nummerPokedex;
    }

    public short getSkade() {
        return skade;
    }

    public void setSkade(short skade) {
        this.skade = skade;
    }
}
