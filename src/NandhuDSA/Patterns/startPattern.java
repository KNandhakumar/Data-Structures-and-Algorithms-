package NandhuDSA.Patterns;

public class startPattern {
    public static void main(String[] args) {
//        starPattern1();
//        System.out.println("---------");
//        starPattern2_1(5);
//        System.out.println("---------");
//        starPattern3(5);
//        System.out.println("---------");
//        starPattern4(5);
//        System.out.println("---------");
//        starPattern5(5);
//        System.out.println("---------");
        starPattern6(5);
    }
    // --------------------------------------------------------------------------------------

    /*

     *
     *  *
     *  *  *
     *  *  *  *
     *  *  *  *  *

     */

    // pattern 1
    static void starPattern1(){
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern1_2(int num){
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    // --------------------------------------------------------------------------------------

    /*

     * * * *
     * * * *
     * * * *
     * * * *


     */

    // pattern 2
    static void starPattern2(int num){
        for (int i = 1; i <=num; i++) {
            for (int j = i; j <=i; j++) {
                System.out.print(" **** ");
            }
            System.out.println();
        }
    }

    static void starPattern2_1(int num){
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // --------------------------------------------------------------------------------------

    /*

     * * * * *
     * * * *
     * * *
     * *
     *


     */

    // pattern 3
    static void starPattern3(int num){
        for (int i = 1; i <=num; i++) {
            for (int j = num; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // --------------------------------------------------------------------------------------

    /*

     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5

     */


    // pattern 4
    static void starPattern4(int num){
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    // --------------------------------------------------------------------------------------

    /*

     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *


     */


    // pattern 5
    static void starPattern5(int num){
        for (int i = 1; i < 2*num; i++) {
            int totalColInRow = i>num ? 2*num - i : i;
            for (int j = 0; j <totalColInRow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // --------------------------------------------------------------------------------------

    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *


     */


    // pattern 6
    static void starPattern6(int num){
        for (int i = 1; i < 2*num; i++) {
            int totalColInRow = i>num ? 2*num - i : i;

            // spaces
            int spaces = num - totalColInRow;
            for (int s = 0; s <spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <totalColInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // --------------------------------------------------------------------------------------
}
