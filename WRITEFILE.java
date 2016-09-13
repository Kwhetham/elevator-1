import javax.swing.*;
// link file handling libraries
import java.io.*;
public class WRITEFILE
{
    // file writer object
    private FileWriter fWriter;
    // outbuffer will have the text to store
    public void writeCSVtable(String outBuffer) throws IOException
    {
        // local variables
        String csvFile;
        File currentDir = new File("").getAbsoluteFile();
        final JFileChooser fc = new JFileChooser(currentDir);
        // allow user to enter the new filename
        int returnVal = fc.showSaveDialog(null);
        File file = fc.getSelectedFile();
        csvFile = file.getName();
        // open the new file
        fWriter = new FileWriter(csvFile);
        // write the data to the file
        fWriter.write(outBuffer);
        // close the file
        fWriter.close();
    }
}