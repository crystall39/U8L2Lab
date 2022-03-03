import java.util.Arrays;

public class WarmUp
{
    public static void main(String[] args)
    {
        String[][] asciiArt ={
                {" ", " ", "_", "_", "_", " ", " "},
                {" ", "(", "o", " ", "o", ")", " "},
                {"(", " ", " ", "V", " ", " ", ")"},
                {" ", "-", "m", "-", "m", "-", " "},};

        // MODIFY the loop below to properly
        // print the ASCII picture like this:
        // (a nested for loop might be helpful...!)
        //     ___
        //    (o o)
        //   (  V  )
        //    -m-m-
        //
        for (String[] row : asciiArt)
        {
            System.out.println(Arrays.toString(row));
        }
        for(String[] rows : asciiArt)
        {
            for (String col : rows)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}