public class Nodo {
    private PrintJob job;
    private Nodo next;

    public Nodo(PrintJob job) {
        this.job = job;
        this.next = null;
    }

    public PrintJob getJob() {
        return job;
    }
    public void setJob(PrintJob job) {
        this.job = job;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }
}