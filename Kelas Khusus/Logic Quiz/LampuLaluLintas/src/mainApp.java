public class mainApp {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red",5);
        light.changeColor();
        System.out.println(light.getColor());
        System.out.println(light.getDuration());
    }
}
