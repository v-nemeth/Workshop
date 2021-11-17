package domain;

public class Sensor extends Enhed{
    private double målVærdi = 0;
    private String type = null;
    private String placering = null;

public Sensor(String navn, String placering, String type){
super(navn);
}

    public double getMålVærdi() {
        return målVærdi;
    }

    public void setMålVærdi(double amount) {
        this.målVærdi = amount;
    }

    public String getPlacering() {
        return placering;
    }

    public void setPlacering(String placering){
    this.placering = placering;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
    this.type = type;
    }


}
