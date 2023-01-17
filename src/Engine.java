public class Engine {
    private double engine;

    public Engine(double engine) {
        this.engine = engine;
    }

    public double getEngine() {
        return engine;
    }
    public String printEngine(){
        return "Двигатель: "+engine;
    }
}
