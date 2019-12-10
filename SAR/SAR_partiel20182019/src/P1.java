public class P1 extends Thread{
    private JobController AE, EC, FM;

    public P1(JobController AE, JobController EC, JobController FM) {
        this.AE = AE;
        this.EC = EC;
        this.FM = FM;
    }

    public void run(){
        System.out.println("A");
        AE.jobDone();
        EC.isJobeDone();
        System.out.println("C");
        System.out.println("F");
        FM.jobDone();
    }
}
