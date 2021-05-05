package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         * Write java solution to find the lowest number from this array.
         * Use MySql Database to store and to retrieve.
         */
        int array[] = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        int highest = array[0];
        int lowest = array[0];


        for(int i=1;i<array.length;i++){
            if(array[i]>highest){
                highest=array[i];
            }
            else if(array[i]<lowest){
                lowest=array[i];
            }


        }
        System.out.println("The lowest number is: "+lowest);

        //find lowest number from the array

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> lowestValue = new ArrayList<String>();
        try {
            connectToSqlDB.insertDataFromArrayToSqlTable(array, "", "");
            lowestValue = connectToSqlDB.readDataBase("array", "lowestnumber");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
        for (String st : lowestValue) {
            System.out.println(st);
        }
    }

}
