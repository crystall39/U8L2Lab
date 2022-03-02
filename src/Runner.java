import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        String[][] array = {{"Abby", "Don", "George", "Kim"},
                            {"Brian", "Elenor", "Harry", "Lenny"},
                            {"Cathy","Fred", "Jill", "Matt"}};

        for (String[] row : array)
        {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        array[1][2] = "Paul";
        for (String[] row : array)
        {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        String temp1 = array[0][0];
        array[0][0] = array[2][3];
        array[2][3] = temp1;
        for (String[] row : array)
        {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        String[] temp2 = array[0]; // first line
        array[0] = array[1];
        array[1] = temp2;
        for (String[] row : array)
        {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        System.out.println(array[0][2] + array[2][0]);

        System.out.println();

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        for (int[] row : arr1)
        {
            System.out.println(Arrays.toString(row));
        }
        for (int[] row : arr2)
        {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        for (int[] row : arr1)
        {
            System.out.println(Arrays.toString(row));
        }

        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;
        for (int[] row : arr2)
        {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        System.out.println(arr1[0][2] + arr2[2][0]);

        System.out.println();

        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(testArr1));
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(FunWith2DArrays.totalElements(testArr2));
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.totalElements(testArr3));
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.totalElements(testArr4));
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(FunWith2DArrays.totalElements(testArr5));
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(FunWith2DArrays.totalElements(testArr6));
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.totalElements(testArr7));
        int[][] testArr8 = {{4}};
        System.out.println(FunWith2DArrays.totalElements(testArr8));
        int[][] testArr9 = {{}};
        System.out.println(FunWith2DArrays.totalElements(testArr9));

        System.out.println();

        String[][] words1 = {{"hi", "bye", "stuff", "go"},
                             {"time", "up", "you", "good"},
                             {"map", "low", "bow", "mom"}};
        FunWith2DArrays.fourCorners(words1);

        System.out.println();

        String[][] words2 = {{"time", "up", "bye"},
                             {"hi", "hit", "up"},
                             {"map", "bam", "low"},
                             {"bow", "mom", "joy"}};
        FunWith2DArrays.fourCorners(words2);

        System.out.println();

        String[][] words3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(words3);

        System.out.println();

        String[][] words4 = {{"cat"},
                             {"dog"},
                             {"hamster"},
                             {"bird"}};
        FunWith2DArrays.fourCorners(words4);

        System.out.println();

        String[][] words5 = {{"time"}};
        FunWith2DArrays.fourCorners(words5);

    }
}
