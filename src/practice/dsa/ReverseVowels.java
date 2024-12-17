package practice.dsa;

public class ReverseVowels {

    public static void main(String[] args) {

        String inputString = "acedeafou";
        String outPutString = reverseString(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String after reversing vowels: " + outPutString);

    }


    static String reverseString(String s) {
        char[] cs = s.toCharArray();
        int start = 0;
        int end = cs.length - 1;

        while (start < end) {
            if (!isVowels(cs[start])) {
                start++;
                continue;
            }

            if (!isVowels(cs[end])) {
                end--;
                continue;
            }

            swap(cs, start, end);
            start++;
            end--;
        }
        return new String(cs);
    }


    public static void swap(char[] array, int i, int j) {
        array[i] = (char) (array[i] + array[j]);
        array[j] = (char) (array[i] - array[j]);
        array[i] = (char) (array[i] - array[j]);
    }

    static boolean isVowels(char c) {

        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    private static boolean isVowel(char c) {
        // Check both uppercase and lowercase vowels
        return "AEIOUaeiou".indexOf(c) != -1;
    }

}
