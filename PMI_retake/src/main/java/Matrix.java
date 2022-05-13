import java.util.ArrayList;

public class Matrix { //Matrix class


    public int min(int[][] matrix) //public function to determine minimum
    {
        int lowest = matrix[0][0]; //assigning array to a variable
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int col = 0; col < matrix[row].length; col++) 
            {
                if (matrix[row][col] < lowest) //if statement to check and assign lowest number
                {
                    lowest = matrix[row][col];
                }
            }
        }

        return lowest;
    }

    public ArrayList<Integer> DivBy3(int[][] matrix) { //finding and appending numbers divisible by 3
        ArrayList<Integer> digits = new ArrayList<>(); 
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int col = 0; col < matrix[row].length; col++) //looping to through numbers
            {
                if (matrix[row][col] % 3 == 0) //check if number is divisble by 3
                {
                    if (!digits.contains(matrix[row][col])) 
                    {
                        digits.add(matrix[row][col]);
                    }
                }
            }
        }
        return digits;
    }
}