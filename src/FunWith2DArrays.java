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

    static double average(int[][] array)
    {
        double sum = 0;
        int items = 0;
        for(int[] rows : array)
        {
            for(int columns : rows)
            {
                sum+= columns;
                items++;
            }
        }
        return sum / items;
    }

    static int[] indexFound(String[][] array, String target)
    {
        int[] returned = new int[2];
        for(int rows = 0; rows < array.length; rows++)
        {
            for(int columns = 0; columns < array[0].length; columns++)
            {
                if (array[rows][columns].equals(target))
                {
                    returned[0] = rows;
                    returned[1] = columns;
                    return returned;
                }
            }
        }
        returned[0] = -1;
        returned[1] = 1;
        return returned;
    }
}