import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {{"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "A", "1"},
                {"1", "1", "1", "1"},
        };
        try {
          int res = checkArray(arr);
            System.out.println(res);
        } catch (MySizeArrayException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int checkArray(String[][] arr) throws MySizeArrayException,MyArrayDataException{
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MySizeArrayException("Wrong array size");
            }

            for (int j = 0; j < arr.length; j++) {

            }
        }
        if (arr.length != 4) {
            throw new MySizeArrayException("Wrong array size");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               try{sum+=Integer.parseInt(arr[i][j]);}
               catch(NumberFormatException e){ throw new MyArrayDataException(
                   "Wrong element in cell "+i +","+j);}

            }

        }
        return sum;
    }

}


