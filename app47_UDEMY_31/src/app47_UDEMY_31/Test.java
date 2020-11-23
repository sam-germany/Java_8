package app47_UDEMY_31;

import java.io.File;
import java.io.IOException;

public class Test {
	
	
	public static void main(String[] args) throws IOException {
        deleteFiles(new File("D:\\Extra_Space_For_FOS\\delete"), ".pdf");
    }
 
    public static void deleteFiles(File dir, String extension) throws IOException {
        File[] list = dir.listFiles();
        if (list != null && list.length > 0) {
            for (File file : list) {
                if (file.isDirectory()) {
                    deleteFiles(file, extension);
                } else if (file.getName().endsWith(extension)) {
                    file.delete();
                }
            }
        }
    }
}