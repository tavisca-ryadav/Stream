import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args){
        writeFileContent();
        readFileContent();

    }

    private static void readFileContent(){
        FileReader myFileReader = new FileReader();
        try {
            String contents  = myFileReader.readFile("DataFile.txt");
            System.out.println("-----------------\n"+contents+"\n---------------");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeFileContent() {
        FileWriter myFileWriter = new FileWriter();
        String data = "Hello! How are you today";
        try {
            myFileWriter.writeFile("DataFile.txt",data);
        } catch (FileNotFoundException e) {
            System.out.println("Please use a valid name");
            e.printStackTrace();
        }
    }
}
