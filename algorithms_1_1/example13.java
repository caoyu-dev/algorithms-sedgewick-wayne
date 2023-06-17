package algorithms_1_1;

public class example13 {
    // 1 4
    // 2 5
    // 3 6
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] rotateArray = rotate(array);

        for (int i = 0; i < rotateArray.length; i++) {
            for (int j = 0; j < rotateArray[i].length; j++) {
                System.out.print(rotateArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotate(int[][] array) {
        int rowCount = array.length;
        int colCount = array[0].length;
        int[][] rotateArray = new int[colCount][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {

                rotateArray[j][i] = array[i][j];
            }
        }
        return rotateArray;
    }
}
