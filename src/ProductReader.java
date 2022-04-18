import java.io.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;


public class ProductReader {

    public static void main(String[] args)throws FileNotFoundException {

        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String rec = "";

        ArrayList<String> lines = new ArrayList<>();

        try
        {

            File workingDirectory = new File(System.getProperty("user.dir"));


            chooser.setCurrentDirectory(workingDirectory);


            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();

                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));


                int line = 0;

                System.out.println(String.format("%-6s", "ID#")
                        + String.format("%-10s", "Name")
                        + String.format("%-10s", "Desc")
                        + String.format("%-6s", "Cost"));
                System.out.println("==================================");

                while(reader.ready())
                {
                    rec = reader.readLine();
                    String[] inputData = rec.split(",");
                    System.out.println(String.format("%-6s", inputData[0])
                            + String.format("%-10s", inputData[1])
                            + String.format("%-10s", inputData[2])
                            + String.format("%-6s", inputData[3]));
                }
                reader.close(); // must close the file to seal it and flush buffer
                System.out.println("\n\nData file read!");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!!!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
