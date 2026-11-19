import srp.SrpDemo;
import ocp.OcpDemo;
import lsp.LspDemo;
import isp.IspDemo;
import dip.DipDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск демонстрации принципов SOLID ");

        SrpDemo.run();
        OcpDemo.run();
        LspDemo.run();
        IspDemo.run();
        DipDemo.run();

        System.out.println("Все продемонстрировано!");
    }
}