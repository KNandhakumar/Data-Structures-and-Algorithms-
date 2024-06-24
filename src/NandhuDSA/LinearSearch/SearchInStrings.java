package NandhuDSA.LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Vishnu";
        char target = 'v';
        System.out.println(search2(name,target));
    }

    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i <str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }

        // forEach loop
        for (char ch : str.toCharArray()){
            if (target == ch){
                return true;
            }
        }
        return false;
    }
}
