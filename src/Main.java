import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    File inputFile = new File("input.txt");
    File outputFile = new File("output.txt");

    try {
      Scanner inpScanner = new Scanner(inputFile);
      Writer outWriter = new FileWriter(outputFile);

      int cntOfInts = 0;
      while (inpScanner.hasNextInt()) {
        inpScanner.nextInt();
        cntOfInts++;
      }

      inpScanner.close();
      inpScanner = new Scanner(inputFile);

      int middlePos = cntOfInts / 2;
      for (int i = 0; i < middlePos; i++) {
        inpScanner.nextInt();
      }

      while (inpScanner.hasNextInt()) {
        outWriter.write(inpScanner.nextInt() + " ");
      }

      inpScanner.close();
      inpScanner = new Scanner(inputFile);

      for (int i = 0; i < middlePos; i++) {
        outWriter.write(inpScanner.nextInt() + " ");
      }

      inpScanner.close();
      outWriter.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
