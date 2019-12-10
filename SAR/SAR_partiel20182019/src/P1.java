public class P1 extends Thread{
    private JobController AE, ECK, FM;

    public P1(JobController AE, JobController ECK, JobController FM) {
        this.AE = AE;
        this.ECK = ECK;
        this.FM = FM;
    }

    public void run(){
        System.out.println("A");
        AE.jobDone();
        ECK.isJobDone();
        if (ECK.isAllow()) {
            ECK.setAllow(false);    //on retire le droit aux sous workflows en concurrence
            System.out.println("C");
            System.out.println("F");
        }
        else
            FM.setAllow(false);     //on transmet l'information comme quoi on ne dispose pas du droit
        FM.jobDone();
    }
}
