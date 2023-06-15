public class Palindrome {
    public static void main(String[] args) {

        String original = "racecar";
        String reversed = "";

        for(int i = original.length() - 1; i >= 0; i--){
            reversed += (original.charAt(i));
        }
        if(reversed.equals(original)){
            System.out.print(original + " is a palindrome");
        }
        else {
            System.out.print(original + " is not a palindrome");
        }
    }
}