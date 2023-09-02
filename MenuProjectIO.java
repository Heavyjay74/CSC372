import java.io.*;

public class MenuProjectIO {

    public static void writeToFile(String s) throws IOException {

        FileWriter fw = new FileWriter("log.txt");
        PrintWriter writer = new PrintWriter(fw);

        writer.write(s);
        writer.println();

        //writer.flush();
        writer.close();

    }
    public static void readFromFile() throws IOException {

    FileReader fr = new FileReader("log.txt");

        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)

            // Print all the content of a file
            System.out.print((char)i);

    }




}
