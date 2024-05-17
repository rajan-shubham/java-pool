import java.util.Arrays;
public class Triangle {
    public static void main(String[] args) {
        triangle2(4, 0);
        System.out.println();

        int[] arr = {4,3,2,1};

//        bubble(arr, arr.length - 1,0);
//        System.out.println(Arrays.toString(arr));

        selection(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    // bubble sort(by recursion)
    static void bubble(int[] arr, int row, int column){
        if (row == 0) {
            return;
        }
        if (column < row) {
            if (arr[column] > arr[column + 1]) {
                // swap
                int temp = arr[column];
                arr[column] = arr[column + 1];
                arr[column + 1] = temp;
            }

            bubble(arr, row, column + 1);
        } else {
            bubble(arr, row - 1, 0);
        }
    }

    static void selection(int[] arr, int row, int col, int maxIndex) {
        if (row == 0){
            return;
        }
        if (col < row) {
            if (arr[col] > arr[maxIndex]) {
                selection(arr, row, col+1, col);
            } else {
                selection(arr, row, col+1, maxIndex);
            }
        } else {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[row-1];
            arr[row-1] = temp;
            selection(arr, row-1, 0, 0);
        }
    }

    static void triangle2(int row, int column){
        if (row == 0) {
            return;
        }
        if(column < row) {
            triangle2(row, column+1);
            System.out.print("*");
        } else {
            triangle2(row-1, 0);
            System.out.println();
        }
    }

    static void triangle(int row, int column){
        if (row == 0) {
            return;
        }
        if(column < row) {
            System.out.print(" * ");
            triangle(row, column+1);
        } else {
            System.out.println();
            triangle(row-1, 0);
        }
    }
}
