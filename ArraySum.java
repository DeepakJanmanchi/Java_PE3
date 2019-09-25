import java.util.*;

class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of Columns");
        int columns = sc.nextInt();
        int n = rows*columns;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter the elements of first array");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of second array");
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        int test = 0;
        for(int i=0; i<rows; i++){

            for(int j=0; j<columns;j++){
                System.out.print(arr1[test]+arr2[test]+" ");
                test++;
            }
            System.out.println();
        }
    }
}

   /* Write a program to compute the addition of two matrix, Read the number of rows and
        columns as input, also the values of each matrix
        Output:
        Input number of rows of matrix: 3
        Input number of columns of matrix: 2
        Input elements of first matrix: 1 2 3 4 5 6
        Input the elements of second matrix: 9 8 7 6 5 4
        Sum of the matrices:-
        10 10
        10 10
        10 10
        */
