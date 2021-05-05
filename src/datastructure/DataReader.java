package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use MySql Database to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

        String tempContainer;
        String finalContainer="";

        try {
            FileReader fileReader = new FileReader("src/data/self-driving-car");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((tempContainer=bufferedReader.readLine())!=null){
                finalContainer=finalContainer+"\n"+tempContainer;

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(finalContainer);
    }

}
