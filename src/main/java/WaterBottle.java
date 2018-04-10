public class WaterBottle {

    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public void drinkWater(){
        this.volume -= 10;
    }

    public void emptyBottle(){
        this.volume = 0;
    }

    public void refillBottle(){
        this.volume = 100;
    }
}