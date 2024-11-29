public class seven {
    public static void main(String[] args) {
    int num = 123;
    int acomulado = 0;
        while(num!=0){
            acomulado += num % 10;
            num /= 10;
        }
        System.out.println(acomulado);
    }
}
