package domain;


public class Aktuator extends Enhed {
    private double aktuatorVærdi = 0;
    private String placering = null;

public Aktuator(String navn, String placering) {
    super(navn);
    }

        public double getAktuatorVærdi(){
        return aktuatorVærdi;
    }

        public void setAktuatorVærdi(double amount){
        this.aktuatorVærdi = amount;
    }

        public String getPlacering(){
        return placering;
    }
        public void setPlacering(String placering){
        this.placering = placering;
    }
}
