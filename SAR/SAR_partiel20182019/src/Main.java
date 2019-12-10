public class Main {

    public static void main(String[] args) {

        JobController AE, ECK, KG, BD, FM;

        AE = new JobController();
        ECK= new JobController();
        KG = new JobController();
        BD = new JobController();
        FM = new JobController();

        P1 p1 = new P1(AE, ECK, FM);
        P2 p2 = new P2(AE, ECK, KG, BD, FM);
        P3 p3 = new P3(ECK, KG, BD);

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
