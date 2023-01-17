public class Car extends Transport{

    private String model;
    private Engine engine;
    private Color color;

    public Car(String kindOfTransport, String typeOfMovement,
               int speed,String model, Engine engine, Color color) {
        super(kindOfTransport, typeOfMovement, speed);
        this.model = model;
        this.engine = engine;
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
    public void method(){
        System.out.println("Method");
    }
    final public void method(int passengers){
        System.out.println("Пасажиров: "+passengers);
    }
    public void method(int passengers,String text){
        System.out.println("Пасажиров: "+passengers+" текст: "+text);
    }

    @Override
    public String toString(){
        return super.toString()+"\nМодель: "+model+
                "\nДвигатель: "+engine.getEngine()+
                "\nЦвет: "+color;
    }
}
