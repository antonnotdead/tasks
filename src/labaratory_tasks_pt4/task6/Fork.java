package labaratory_tasks_pt4.task6;
class Fork {
    private boolean taken = false;

    synchronized void pickUp() throws InterruptedException {
        while (taken) {
            wait();
        }
        taken = true;
    }

    synchronized void putDown() {
        taken = false;
        notifyAll();
    }
}
