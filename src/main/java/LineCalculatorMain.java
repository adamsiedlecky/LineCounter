import tools.FileFinder;
import tools.FileLineCounter;
import tools.UserCommunicator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LineCalculatorMain {

    public static void main(String[] args){

        List<String> extensionList;
        List<File> fileList;

        UserCommunicator userCommunicator = new UserCommunicator();
        extensionList = userCommunicator.getStarted();

        FileFinder fileFinder = new FileFinder();
        fileList = fileFinder.getFileList(extensionList);

        FileLineCounter fileLineCounter = new FileLineCounter();
        int amount = fileLineCounter.count(fileList);

        System.out.println("Amount of lines in your files: "+amount);
    }

}
