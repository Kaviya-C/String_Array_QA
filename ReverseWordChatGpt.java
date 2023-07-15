package practise;

public class ReverseWordChatGpt {

    public static void main(String[] args) {
        String input = "Hello world";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            
        	reversed.append(words[i]+" ");
        }

        return reversed.toString();
    }
}

