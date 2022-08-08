import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers : ");
        Scanner scan = new Scanner(System.in);

        int nums[] = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = scan.nextInt();
        }

        int oddCount = 0, evenCount = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;

        }

        System.out.println("Odd count : " + oddCount + "\nEven count : " + evenCount);
        scan.close();
    }
}