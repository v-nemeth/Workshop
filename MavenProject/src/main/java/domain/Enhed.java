package domain;

import java.util.UUID;

public class Enhed {
    UUID id;
    String navn;

    public Enhed(String navn){
        this.navn = navn;
        id = UUID.randomUUID();
    }

    @Override
    public String toString(){return "Navn: "+navn;}

    public UUID getID(){return id;}

    public String getNavn(){return navn;}

    public void setNavn(String navn){
        this.navn = navn;
    }



}
