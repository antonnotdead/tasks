package labaratory_tasks_pt4.task6;
class Deaf extends Thread {
    final int id;
    final Fork leftFork;
    final Fork rightFork;

    Deaf(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void pickUpForks() throws InterruptedException {
        if (id % 2 == 0) {
            leftFork.pickUp();
            rightFork.pickUp();
        } else {
            rightFork.pickUp();
            leftFork.pickUp();
        }
        System.out.println("Deaf-mute " + id + " picks up forks");
    }

    private void putDownForks() {
        leftFork.putDown();
        rightFork.putDown();
        System.out.println("Deaf-mute " + id + " puts down forks");
    }

    private void eat() throws InterruptedException {
        System.out.println("Deaf-mute " + id + " is eating");
        Thread.sleep(2000);
    }

    private void think() throws InterruptedException {
        System.out.println("Deaf-mute " + id + " is talking");
        Thread.sleep(2000);
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();
                pickUpForks();
                eat();
                putDownForks();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}