public class largest_num {
    public static void main(String[] args) {
        for (int num = 9999; num >= 1000; num--) {
            if (num % 10 == 0 && num % 13 == 0) {
                System.out.println("The largest 4-digit number divisible by 10 and 13 is: " + num);
                break;
            }
        }
    }
}
