import java.util.Scanner;
public class lowerDigonalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int row = sc.nextInt();
        System.out.println("Enter coloumn size: ");
        int coloumn = sc.nextInt();

        int[][] matrix = new int[row][coloumn];
        System.out.println("Enter elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j < coloumn;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j < coloumn;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j < coloumn;j++){
                if(i > j){
                    sum = sum+matrix[i][j];
                }
            }
        }
        System.out.println("Sum of lower digonal Elements: "+sum);
    }
}
