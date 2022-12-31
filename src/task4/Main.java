package task4;

public class Main {
    public static void main(String[] args) {
        //створили 3 об'єкти класу Daemon
        Demon daemon = new Demon();
        Demon daemon1 = new Demon();
        Demon daemon2 = new Demon() ;
        //повідомляємо об'єкту Demon те, що він буде потоком-демоном
        daemon.setDaemon(true);
        // запускаємо усі 3 потоки
        daemon.start();
        daemon1 .start();
        daemon2.start() ;
    }
}
class Demon extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("початок роботи потоку-демону");
                sleep(1000);
            } else {
                System.out.println("початок роботи  user-потоку");
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace() ;
        } finally {
            //Після завершення роботи останнього user-потоку,  усі потоки-демони вже DIED
            if (!isDaemon())
                System.out.println("завершення роботи user-потоку.");
            else
                System.out.println("завершення роботи потоку-демону");
        }

    }


}
