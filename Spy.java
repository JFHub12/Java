public class Spy{
    public static void main(String[] args){

        int num = 123;
        //String len = String.valueOf(num);


        int sum = 0;
        int product = 1;
        for(int i = 0; i < num.length; i++){
            sum = sum + i;
            product = product * i;
            System.out.println(sum);
            System.out.println(product);
        }

        // int[] num = {1, 2, 3};
        // int sum = 0;

        // for(int i= 0; i< num.length; i++){
        //     sum = sum + num[i];
        // }

        // System.out.println(sum);

        
    }
}