import java.io.*;

public class FilesIntroV2
{
    /**
     * A Simple introduction to reading and writing text files
     *5
     * In IntelliJ, the default location for files is the project folder including your code
     * (not the src folder)
     *
     * @throws FileNotFoundException
     * @author WLHonig
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        easyFileAdder("ASimpleFile.txt");
        easyFileReader("ASimpleFile.txt");
    }

    public static boolean easyFileReader(String fileName) throws FileNotFoundException {
        File inputFile;
        Scanner170 inputScanner;
        inputFile = new File (fileName);
        inputScanner = new Scanner170(inputFile);

        int linesRead = 0;
        while( inputScanner.hasNextLine() ) {
            System.out.println( inputScanner.nextLine() );
            linesRead++;
        }
        System.out.println( "File finished with " + linesRead + " lines read back!");
        inputScanner.close();
        return true;
    }

    public static boolean easyFileAdder(String fileName) throws FileNotFoundException {
        FileOutputStream outputFile;
        outputFile = new FileOutputStream( fileName, true );  //true appends to current file
        PrintWriter outputWriter;
        outputWriter = new PrintWriter( outputFile );

        outputWriter.println("Next Line for The File");
        outputWriter.println("THE END");

        //important to ensure recent lines actually added; closes outputFile as well
        outputWriter.close();
        return true;
    }
}
