import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class EnumerateFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fileInputStream = new FileInputStream("/Users/jayoung/dev/cs1302/assignment4/textfile.txt");
        Scanner scanner = new Scanner(fileInputStream);

        String outputPath = "/Users/jayoung/dev/cs1302/assignment4/outputfile.txt";
        File outputFile = new File(outputPath);
        FileWriter fileWriter = new FileWriter(outputFile, true);
        BufferedWriter bufferFileWriter = new BufferedWriter(fileWriter);

        int currentLineNumber = 1;
        while (scanner.hasNextLine()) {
            fileWriter.append(currentLineNumber + " " + scanner.nextLine() + "\n");
            currentLineNumber++;
        }

        scanner.close();
        bufferFileWriter.close();
    }
}
