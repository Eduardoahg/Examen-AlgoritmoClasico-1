public class PrintService {

    private PrintQueue queue;

    public PrintService() {
        this.queue = new PrintQueue();
    }

    public PrintQueue getQueue() {
        return queue;
    }

    public void setQueue(PrintQueue queue) {
        this.queue = queue;
    }

    public void submitJob(PrintJob job) {
        if (job != null) {
            queue.enqueue(job);
        }
    }

    public void processNext() {
        if (!queue.isEmpty()) {
            PrintJob job = queue.dequeue();
            System.out.println("imprimiend.., " + job.toString());
        } else {
            System.out.println("No hay na pendiente. Menos hojas que gastar :)");
        }
    }
    public void processAll() {
        System.out.println("Iniciando");
        while (!queue.isEmpty()) {
            processNext();
        }
        System.out.println(" Todos ha sido procesado. \n Puede llevar esos documentos.  :)");
    }
}