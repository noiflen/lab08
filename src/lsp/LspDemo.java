package lsp;

interface EngineVehicle {
    void startEngine();
}

class Car implements EngineVehicle {
    public void startEngine() {
        System.out.println("Двигатель автомобиля запущен.");
    }
}

class Bicycle {
    public void pedal() {
        System.out.println("Велосипедист крутит педали.");
    }
}

public class LspDemo {
    public static void run() {
        System.out.println("Демонстрация LSP ");
        EngineVehicle car = new Car();
        car.startEngine();

        Bicycle bicycle = new Bicycle();
        bicycle.pedal();
    }
}