public class app {
    public static void main(String args[]){
        System.out.println("it works");
        calc c = new calc();
        System.out.println(c.sum(2,3));
        System.out.println(c.minus(2,3));
        System.out.println(c.multiply(2,3));
        System.out.println(c.divide(2,3));
    }
}
