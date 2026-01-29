// insert an element at a specific position in an array
import java.util.Scanner;
public class insert_element_at_specific_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {1, 2, 3, 4, 0};

        System.out.print("Enter element: ");
        int element = sc.nextInt();

        System.out.print("Enter position (index+1): ");
        int position = sc.nextInt();

        for (int i = a.length - 1; i >= position; i--) {
            a[i] = a[i - 1];
        }

        a[position - 1] = element;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        sc.close();
    }
}

