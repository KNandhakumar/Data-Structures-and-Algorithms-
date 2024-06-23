package NandhuDSA.Arrays;

public class dimension {
    public static void main(String[] args) {
        /*
            1 2 3    ^
            4 5 6    ^ --> {Row}    > > > > {Column}
            7 8 9    ^
         */

//        int[][] arr = new int[3][3];
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
