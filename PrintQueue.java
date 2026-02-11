
public class PrintQueue {
    private Nodo cabeza;

    public PrintQueue() {
        this.cabeza = null;
    }

    public void enqueue(PrintJob job) {
        Nodo unoNuevo = new Nodo(job);

        if (cabeza == null || job.getPriorityValue() > cabeza.getJob().getPriorityValue()) {
            unoNuevo.setNext(cabeza);
            cabeza = unoNuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getNext() != null &&
                    actual.getNext().getJob().getPriorityValue() >= job.getPriorityValue()) {
                actual = actual.getNext();
            }
            unoNuevo.setNext(actual.getNext());
            actual.setNext(unoNuevo);
        }
    }

    public PrintJob dequeue() {
        if (isEmpty())
            return null;

        PrintJob job = cabeza.getJob();
        cabeza = cabeza.getNext();

        return job;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }
}