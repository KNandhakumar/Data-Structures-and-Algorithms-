package NandhuDSA;

public class countDublicateNumbers {
    public static void main(String[] args) {
//        Question : Count Numbers
        int number = 13839;
        int count = 0;
        while (number>0){
            int rem = number%10;
            if (rem == 3){
                count++;
            }
            number = number/10;
        }
        System.out.println(count);
    }
}
