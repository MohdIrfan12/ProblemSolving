package scalar.recursion;

import java.util.List;

public class SearchForAfile {

    /**
     * search a file in directory, directory may have subdirectories inside it
     */


    public static void main(String[] args) {

    }

    private static String getFile(String dirName, String fileName){
        List<String> files = getAllFiles(dirName);
        for (String name:files){
            if (name.equals(fileName)){
                return name;
            }
        }
        List<String> directories = getAllDirectories(dirName);
        for (String name:directories){
            if (getFile(name,fileName).equals(fileName)){
                return name;
            }
        }
        return null;
    }

    private static List<String> getAllDirectories(String dirName) {
        return null;
    }

    private static List<String> getAllFiles(String dirName) {
        return null;
    }

}
