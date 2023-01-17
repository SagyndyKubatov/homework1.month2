final public class SportCar extends Car{

    private int horsPower;

    public SportCar(String kindOfTransport, String typeOfMovement, int speed,
                    String model, Engine engine, Color color, int horsPower) {
        super(kindOfTransport, typeOfMovement, speed, model, engine, color);
        this.horsPower = horsPower;
    }

    public int getHorsPower() {
        return horsPower;
    }

    @Override
    public void method() {
        super.method();
    }

    @Override
    public void method(int passengers, String text) {
        super.method(passengers, text);
        System.out.println("это измененнный метод");
    }

    @Override
    public String toString(){
        return super.toString()+"\nЛошадиных сил: "+horsPower;
    }
}
