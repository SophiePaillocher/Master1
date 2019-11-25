public class P3 extends Thread{
    private OD1I o1;
    private OD2I o2;
    private OD3I o3;

    public P3(OD1I o1, OD2I o2, OD3I o3) {
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }

    public void go(){
        o1.isDoneA();
        o1.B();
        o3.isDoneE();
        o2.isDoneG();
        o1.C();
        o3.isDoneF();
    }
}
