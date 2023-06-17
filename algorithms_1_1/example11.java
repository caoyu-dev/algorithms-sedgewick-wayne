package algorithms_1_1;

public class example11 {
    public static void main(String[] args) {
        Boolean[][] array = {
                {true, false, true},
                {false, true, true}
        };
        isBoolean(array);
    }

    private static void isBoolean(Boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {

                if (array[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
