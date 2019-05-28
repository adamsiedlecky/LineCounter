package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class FileLineCounter {

    private int amountOfLines=0;

    public int count(List<File> fileList){
        for (File file:fileList) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while(bufferedReader.readLine()!=null){
                    amountOfLines++;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return amountOfLines;
    }

}
