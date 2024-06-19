package NandhuDSA;

public class conditionals {
    public static void main(String[] args) {
         /*
    syntax of if statements :
    if(boolean expression true false) {
        // do this
    }
    else {
        //otherwise do this
    }
     */

          int salary = 10000;
//        if (salary>1000){
//            salary = salary + 2000;
//        }
//        else {
//            salary = salary + 1000;
//        }

        // multiple if-else

        if (salary>1000){
            salary += 2000; // salary = salary + 2000; this is a shortcut
        } else if (salary<2000) {
            salary += 3000;
        }
        else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
