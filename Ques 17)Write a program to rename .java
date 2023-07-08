//Ques 17)Write a program to rename a file using rename() function.
import java.io.File;

public class FileRename {
    public static void main(String[] args) {
        String oldFilePath = "C:/path/to/oldfile.txt";  // Specify the old file path here
        String newFilePath = "C:/path/to/newfile.txt";  // Specify the new file path here

        File oldFile = new File(oldFilePath);
        File newFile = new File(newFilePath);

        // Check if the old file exists
        if (oldFile.exists()) {
            // Rename the file
            boolean renamed = oldFile.renameTo(newFile);

            if (renamed) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename the file.");
            }
        } else {
            System.out.println("Old file does not exist.");
        }
    }
}