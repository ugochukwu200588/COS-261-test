public class DRY {
    private static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        //without DRY
        int sum1 = 1 + 2;
        int sum2 = 3 + 4;

        //with DRY
        int sum3 = sum(1, 2);
        int sum4 = sum(3, 4);
    }
}
