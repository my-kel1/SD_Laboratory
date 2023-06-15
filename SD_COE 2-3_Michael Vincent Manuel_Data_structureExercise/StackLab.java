import java.util.Stack;
import java.util.Scanner;

class StackLab {
    public static boolean balance(String bracket) {
            Stack<Character> a = new Stack<Character>();
            for (char bra : bracket.toCharArray()) {
                if (bra == '(' || bra == '[' || bra == '{') {
                    a.push(bra);
                }
                else {
                    if (a.isEmpty()){
                        return false;
                    } 
                    char ch = a.pop(); 
                    if ((bra == ')' && ch == '(') ||  
                    (bra == ']' && ch == '[') || 
                    (bra == '}' && ch == '{')) {
                        continue;
                    }
                    else {
                        return false;
                    } 
                }
            }
            return a.isEmpty();
        }

    public static void main (String[] args) {
            
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter: ");  
            String bracket= sc.nextLine();

            if (balance(bracket) == true){
                System.out.println("The expression " + bracket + " is balanced");
            }
            else {
                System.out.println("The expression " + bracket + " is not balanced");
            }
	}
}