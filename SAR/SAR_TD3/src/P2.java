public class P2 extends Thread{
    private O1I o1;
    private O2I o2;
    private O3I o3;

    public P2(O1I o1, O2I o2, O3I o3) {
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }

    public void run(){
        o1.A();
        o1.isDoneB();
        o3.E();
        o2.isDoneG();
        o1.isDoneC();
        o3.F();
    }
}