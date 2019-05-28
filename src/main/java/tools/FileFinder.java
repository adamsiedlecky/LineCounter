package tools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileFinder {

    private List<File> fileList = new ArrayList<File>();

    public List<File> getFileList(List<String> extensions){



        File file = new File(".");
        String path = file.getAbsolutePath();
        System.out.println("Curent path: "+path);

        getAll(path,extensions);
        return fileList;
    }

    private void getAll(String path,List<String> extensions){
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                for (String extension: extensions) {
                    if(listOfFiles[i].getAbsolutePath().contains(extension)) {
                        fileList.add(listOfFiles[i]);
                    }
                }
                //System.out.println("file :"+listOfFiles[i]);
            } else if (listOfFiles[i].isDirectory()) {
                getAll(listOfFiles[i].getAbsolutePath(),extensions);
            }
        }
    }
}
