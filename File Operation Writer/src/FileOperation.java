import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) {
        File file = new File ("D://File.txt");
        FileOutputStream fos = null;
        try {
            if(file.createNewFile()) {
                System.out.println("File has been created succesfully!!");
            } else {
                System.out.println("File aready exists or could not e created.");
            }
            String data = "This is the filling class...";
            fos = new FileOutputStream(file);
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data has been written to file.");
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}