import java.util.Scanner;

public class AB1 {
    public static void main(String[] args) {
        class MyStack {
            int size;
            int[] content;
            MyStack(int size) {
                this.size = size;
                this.content = new int[size];
            }
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (in.hasNext()) {
            System.out.println(in.nextLine());
        }
    }
}