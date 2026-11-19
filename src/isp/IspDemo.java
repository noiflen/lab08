package isp;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class SimplePrinter implements Printer {
    public void print() { System.out.println("Простой принтер печатает документ."); }
}

class MultiFunctionDevice implements Printer, Scanner {
    public void print() { System.out.println("МФУ печатает документ."); }
    public void scan() { System.out.println("МФУ сканирует документ."); }
}

public class IspDemo {
    public static void run() {
        System.out.println("Демонстрация ISP");
        Printer myPrinter = new SimplePrinter();
        myPrinter.print();

        MultiFunctionDevice mfu = new MultiFunctionDevice();
        mfu.print();
        mfu.scan();

    }
}
