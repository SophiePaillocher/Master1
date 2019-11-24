public class Main {

    public static void main(String[] args) {
        O1I o1;
        O2I o2;
        O3I o3;

        o1 = new O1impl();
        o2 = new O2impl();
        o3 = new O3impl();

        P1 p1 = new P1(o1,o2,o3);
        P2 p2 = new P2(o1,o2,o3);
        P3 p3 = new P3(o1,o2,o3);

        p1.start();
        p2.start();
        p3.start();

        try {
            p1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            p2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            p3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
