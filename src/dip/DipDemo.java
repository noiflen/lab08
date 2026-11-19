package dip;

interface Storage {
    void saveData();
}

class HardDrive implements Storage {
    public void saveData()
    { System.out.println("Данные сохранены на жёсткий диск."); }
}

class CloudStorage implements Storage {
    public void saveData()
    { System.out.println("Данные сохранены в облако."); }
}

class Computer {
    private final Storage storage;

    public Computer(Storage storage) {
        this.storage = storage;
    }

    public void saveToStorage() {
        storage.saveData();
    }
}

public class DipDemo {
    public static void run() {
        System.out.println("Демонстрация DIP ");
        Computer pcWithHdd = new Computer(new HardDrive());
        pcWithHdd.saveToStorage();

        Computer pcWithCloud = new Computer(new CloudStorage());
        pcWithCloud.saveToStorage();
    }
}
