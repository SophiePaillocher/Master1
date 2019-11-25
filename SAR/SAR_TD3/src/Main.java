public class Main {

    public static void main(String[] args) {
        O1I o1;
        O2I o2;
        O3I o3;

        o1 = new O1impl();
        o2 = new O2impl();
        o3 = new O3impl();

        P1 p1 = new P1(o1,o2,o3);

        p1.go();        

    }
}
