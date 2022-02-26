public class Pippo {
    
    public Pippo(){
        //#ifdef Directed
        System.out.println("Directed");
        //#endif

        //#ifdef Undirected
        System.out.println("Undirected");
        //#endif

        //#ifdef Number
        System.out.println("Number");
        //#endif

        //#ifdef Cycle
        System.out.println("Cycle");
        //#endif
    }

    public static void main(String[] args) {
        Pippo p = new Pippo();
    }
}