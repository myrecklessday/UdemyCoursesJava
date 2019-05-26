package section_7_oop_part2.composition_1.composition_2;

public class Lamp {

    private String style;
    private boolean battery;
    private int globRationg;

    public Lamp(String style, boolean battery, int globRationg) {
        this.style = style;
        this.battery = battery;
        this.globRationg = globRationg;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRationg() {
        return globRationg;
    }
}
