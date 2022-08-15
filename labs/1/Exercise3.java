public class Exercise3 {
    public static void main(String[] args) {
        int age = 20;
        String status;
        if (age > 18) {
            status = "adult";
            return;
        }
        status = "child";
        System.out.println(status);
    }
}