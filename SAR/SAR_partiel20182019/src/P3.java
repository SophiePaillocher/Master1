public class P3 extends Thread {

    JobController EK, KG, BD;

    public P3(JobController EK, JobController KG, JobController BD) {
        this.EK = EK;
        this.KG = KG;
        this.BD = BD;
    }

    public void run(){
        EK.isJobeDone();
        System.out.println("K");
        KG.jobDone();
        System.out.println("B");
        BD.jobDone();
    }
}
