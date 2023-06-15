public class Prime {
    public static void main(String[] args) {

        int num = 29; // this is the number to test
        boolean isPrime = true;

        for(int i=2; i <= num / 2; i++){
            if(num % 2 == 0){
                isPrime = false;
            }
        }

        if(isPrime) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }
    }
}