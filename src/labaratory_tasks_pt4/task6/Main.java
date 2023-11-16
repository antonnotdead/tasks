package labaratory_tasks_pt4.task6;
public class Main {
    public static void main(String[] args) {
            Fork[] forks = new Fork[5];

            for (int i = 0; i < 5; i++) {
                forks[i] = new Fork();
            }

            Deaf[] deaf = new Deaf[5];

            for (int i = 0; i < 5; i++) {
                Fork leftFork = forks[i];
                Fork rightFork = forks[(i + 1) % 5];
                deaf[i] = new Deaf(i, leftFork, rightFork);
                deaf[i].start();
            }

            try {
                Thread.sleep(10000);
                for (Deaf Deaf : deaf) {
                    Deaf.interrupt();
                }
                for (Deaf Deaf : deaf) {
                    Deaf.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
