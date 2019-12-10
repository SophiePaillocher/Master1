public class P2 extends Thread {

    private JobController AE, EC, EK, KG, BD, FM;

    public P2(JobController AE, JobController EC, JobController EK, JobController KG, JobController BD, JobController FM) {
        this.AE = AE;
        this.EC = EC;
        this.EK = EK;
        this.KG = KG;
        this.BD = BD;
        this.FM = FM;
    }

    public void run(){
        AE.isJobeDone();
        System.out.println("E");
        EK.jobDone();
        EC.jobDone();
        KG.isJobeDone();
        System.out.println("G");
        BD.isJobeDone();
        System.out.println("D");
        FM.isJobeDone();
        System.out.println("M");
    }
}
