public class Bicycle extends Vehicle{

    private int gearCount;

    public Bicycle(String n, int w, int g){
        super(n, w);
        gearCount = g;
    }

    public void ringBell(){
        System.out.println("DING!");
    }

    public int getGearCount() {
        return gearCount;
    }
}
