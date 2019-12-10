public class P3 extends Thread {

    JobController ECK, KG, BD;

    public P3(JobController EK, JobController KG, JobController BD) {
        this.ECK = EK;
        this.KG = KG;
        this.BD = BD;
    }

    public void run(){
        ECK.isJobDone();
        if (ECK.isAllow()){
            ECK.setAllow(false);    //on retire le droit aux sous workflows en concurrence
            System.out.println("K");
            KG.jobDone();
            System.out.println("B");
            BD.jobDone();
        }
        else {
            KG.setAllow(false);
            KG.jobDone();
            BD.setAllow(false);
            BD.jobDone();
        }
    }
}
