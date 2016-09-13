import javax.swing.*;
import java.io.*;                 
public class FILEREAD
{

    private  FileReader fReader; 

    
    public  String[] readCSVtable() throws IOException {

        
        File currentDir = new File("").getAbsoluteFile();
        final JFileChooser fc = new JFileChooser(currentDir);
        
        // ask user to choose file to read
        int returnVal = fc.showOpenDialog(null);
        
        File csvFile = fc.getSelectedFile();

        // prepare a temporary store for file data    
        char[] inBuffer = new char[5000];

        
        fReader = new FileReader(csvFile);
       
        // read in the data from backing storage file
        int size = fReader.read(inBuffer); 
        
        // close the file
        fReader.close();

      
        // trim the empty characters and convert the text to a string
        String fileContent = String.valueOf(inBuffer).substring(0,size);

        // convert the string to a string array by splitting into a list of rows
        return fileContent.split("\n");
    }
}