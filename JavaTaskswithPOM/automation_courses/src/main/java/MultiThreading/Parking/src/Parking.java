import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class Parking implements Runnable {
    Thread thrd;

    static ParkingController security = new ParkingController();
    String names[];

    Parking(String name, String names[]) {
        thrd = new Thread(this, name);
        this.names = names;
        thrd.start();


    }


    @Override
    public void run() throws IllegalThreadStateException {
        try {

            System.out.println(thrd.getName() + " подьезжает к парковке");
            MILLISECONDS.sleep(800);
            security.ControlPlaces(names);
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



