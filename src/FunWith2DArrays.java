public class FunWith2DArrays
{
    static int totalElements(int[][] array)
    {
        int rows = array.length;
        int columns = array[0].length;

        return rows * columns;
    }

    static void fourCorners(String[][] array)
    {
        String str = "";
        int maxRow = array.length - 1;
        int maxColumn = array[0].length - 1;
        System.out.println(array[0][0] + "\n" + array[0][maxColumn] + "\n" + array[maxRow][0] + "\n" + array[maxRow][maxColumn]);
    }
}