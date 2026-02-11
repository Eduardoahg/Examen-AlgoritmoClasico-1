public class PrintJob {
    private String user;
    private int pages;
    private char priority;

    public PrintJob(String user, int pages, char priority) {
        this.user = user;
        this.pages = pages;
        this.priority = priority;
    }

    public String getUser() {
        return user;
    }
    public int getPages() {
        return pages;
    }
    public char getPriority() {
        return priority;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setPriority(char priority) {
        this.priority = priority;
    }

    public int getPriorityValue() {
        if (this.priority == 'H')
            return 3;
        else if (this.priority == 'L')
            return 1;
        else
            return 2;
    }

    @Override
    public String toString() {
        return "Usuario: " + user + "   | Páginas: " + pages + "  |  Prioridad: " + priority;
    }
}