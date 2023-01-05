package CodeWars;

public class VowelCount {

    /*
    Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, u as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces.
    */
    public static void main(String[] args) {
        String str1 = "Hello my friend";
        System.out.println(getCount(str1));

    }


    public static int getCount(String str) {
        char[] arr = str.toCharArray();
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}
