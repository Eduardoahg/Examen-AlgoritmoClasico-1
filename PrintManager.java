import java.util.Scanner;

public class PrintManager {
    private PrintService service;
    private Scanner scanner;

    public PrintManager() {
        this.service = new PrintService();
        this.scanner = new Scanner(System.in);
    }

    public PrintService getService() {
        return service;
    }
    public void setService(PrintService service) {
        this.service = service;
    }

    public void runSimulation() {
        System.out.println(" GESTIONADOR DE IMPRESIONES (IMPRESORA BLUTU) \n");

        System.out.println("CARGANDO.");
        System.out.println("CARGANDO..");
        System.out.println("CARGANDO...");
        System.out.println("CARGANDO....");

        service.submitJob(new PrintJob("Eduardo", 5, 'L'));
        service.submitJob(new PrintJob("Freddy", 2, 'H'));
        service.submitJob(new PrintJob("Damarys", 3, 'M'));
        service.submitJob(new PrintJob("Alonso", 4, 'M'));
        service.submitJob(new PrintJob("Alejandro", 10, 'H'));

        System.out.println("\nEstado de la lista: \n");

        service.processAll();

        System.out.println("\n Terminado ");
    }

    public static void main(String[] args) {
        PrintManager manager = new PrintManager();
        manager.runSimulation();
    }
}