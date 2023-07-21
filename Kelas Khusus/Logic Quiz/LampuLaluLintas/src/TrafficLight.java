public class TrafficLight {
    private String color;
    private double duration;

    public TrafficLight(String color, double duration) {
        this.color = color;
        this.duration = duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public double getDuration() {
        return duration;
    }

    public void changeColor(){
        switch (this.color.toLowerCase()){
            case "red":
                setColor("Green");
                setDuration(10);
                break;
            case "green":
                setColor("Yellow");
                setDuration(3);
            default:
                setColor("Red");
                setDuration(5);
                break;
        }
    }
}
