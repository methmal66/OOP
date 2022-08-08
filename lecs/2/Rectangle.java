import java.util.*;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter width : ");
        int width = scan.nextInt();
        System.out.print("Enter height : ");
        int height = scan.nextInt();
        int perimeter = 2 * (width + height);
        System.out.println("Perimeter : " + perimeter);
        scan.close();
    }
}