public class Largest {
    public static void main(String[] args) {
        int nums[] = new int[3];
        nums[0] = Integer.parseInt(args[0]);
        nums[1] = Integer.parseInt(args[1]);
        nums[2] = Integer.parseInt(args[2]);

        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        int min = nums[0];
        for (int num : nums) {
            if (num < max) {
                min = num;
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}