package practical_tasks_pt4.task5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyToFile {
        public static void copyFile(String sourcePath, String destinationPath) {
            try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while copying file : " + e.getMessage());
            }
        }
    }
