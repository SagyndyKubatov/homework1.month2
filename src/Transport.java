public class Transport {

    private String kindOfTransport,typeOfMovement;
    private int speed;

    public Transport(String kindOfTransport, String typeOfMovement, int speed) {
        this.kindOfTransport = kindOfTransport;
        this.typeOfMovement = typeOfMovement;
        this.speed = speed;
    }

    public String getKindOfTransport() {
        return kindOfTransport;
    }

    public int getSpeed() {
        return speed;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }
    public String toString(){
        return "Тип транспорта: "+kindOfTransport+
                "\nТип движения: "+typeOfMovement+
                "\nСкорость: "+speed;
    }
}
