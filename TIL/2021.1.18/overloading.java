public class overloading {

    static int sum(int x,int y){
        return x+y;
    }
    static double sum(double x,double y){
        return x+y;
    }

    public static void main(String args[]){
        System.out.println(sum(3,4));
        System.out.println(sum(3.3,4.4));
    }
}
