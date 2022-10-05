public class Math {
    int a;
    int b;
    int sum;
    int sub;

    public void getSum(int a, int b) {
        System.out.println(sum);
    }
    public void getsub(int a, int b) {
        System.out.println(sub);
    }

    public static void main(String[] args) {
        Math m1=new Math();
        m1.getSum(10,20);
        m1.getsub(30,10);
        m1.getsub(30,100);
    }


}
