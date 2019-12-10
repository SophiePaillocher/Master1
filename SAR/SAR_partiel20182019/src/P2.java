public class P2 extends Thread {

    private JobController AE, ECK, KG, BD, FM;

    public P2(JobController AE, JobController ECK, JobController KG, JobController BD, JobController FM) {
        this.AE = AE;
        this.ECK = ECK;
        this.KG = KG;
        this.BD = BD;
        this.FM = FM;
    }

    public void run(){
        AE.isJobDone();
        System.out.println("E");
        ECK.jobDone();
        KG.isJobDone();
        if (KG.isAllow()){
            System.out.println("G");
        }
        BD.isJobDone();
        if (BD.isAllow()){
            System.out.println("D");
        }
        FM.isJobDone(); //pas besoin de se préoccuper du droit car l'un des deux workflows l'a forcément
        System.out.println("M");
    }
}
