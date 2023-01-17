public class Main {
    public static void main(String[] args) {

        Car car = new Car("Автомабиль","Наземный"
                ,190,"СтепВагон",new Engine(1.6),Color.WHITE);

        SportCar sportCar1 = new SportCar("Спортивная машина","Наземный",
                250,"BMW i8",new Engine(1.5),Color.BLACK,362);

        SportCar sportCar2 = new SportCar("Спортиваня машина","Наземный",
                355,"lamborghini Countach LPI 800-4",new Engine(2.8),Color.REED,819);

        Transport[] transports = {car,sportCar1,sportCar2};

        for (Transport transport:transports){
            System.out.println(transport.toString());
            System.out.println();
        }
        car.method();
        car.method(7);
        car.method(7,"Текст, пример");
        System.out.println();
        sportCar1.method();
        sportCar2.method(1,"Пример текст");
    }
}