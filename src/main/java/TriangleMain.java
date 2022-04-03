import java.util.Scanner;

public class TriangleMain extends Triangle {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("input side a");
    int a = in.nextInt();

    System.out.println("input side b");
    int b = in.nextInt();

    System.out.println("input side c");
    int c = in.nextInt();

    String result = new Triangle(a, b, c).triangleType();
        System.out.println(result);

    }
}