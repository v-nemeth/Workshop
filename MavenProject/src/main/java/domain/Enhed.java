package domain;

import java.util.UUID;

public class Enhed {
    UUID id = UUID.randomUUID();
    String navn;
    
    public Enhed(){}

    @Override
    public String toString(){return "Navn: "+navn;}

    public UUID getID(){return id;}

    public String getNavn(){return navn;}

    public void setNavn(String navn){
        this.navn = navn;
    }



}
