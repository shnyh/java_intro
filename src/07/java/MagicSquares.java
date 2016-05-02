import java.io.*;
import java.util.ArrayList;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;

        // For each line in the file ...
        String line;
        ArrayList<Integer> rowSum = new ArrayList<Integer>();
        int idxCol = 0;
        int sumDiagonal = 0;
        while ((line = reader.readLine()) != null) {
            // ... sum each row of numbers
            if ( line.length() == 0 ) {continue;}
            String[] parts = line.split("\t");
            int sum = 0;
            int idxRow = 0;
            for (String part : parts) {
                sum += Integer.parseInt(part);
                if (lastSum == -1) {
                    rowSum.add(Integer.parseInt(part));
                }
                else{
                    rowSum.set(idxRow, rowSum.get(idxRow) + Integer.parseInt(part));
                }
                if ( idxCol == idxRow ){
                    sumDiagonal += Integer.parseInt(part);
                }
                idxRow++;
            }


            if (lastSum == -1) {
                // If this is the first row, remember the sum
                lastSum = sum;
            } else if (lastSum != sum) {
                // if the sums don't match, it isn't magic, so stop reading
                isMagic = false;
                break;
            }
            idxCol++;
        }

        Integer baserow = rowSum.get(0);
        for ( Integer row: rowSum ){
            if ( !baserow.equals(row)  ){
                isMagic = false;
                break;
            }
        }
        if ( sumDiagonal != lastSum ){
            isMagic = false;
        }

        reader.close();
        return isMagic;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}