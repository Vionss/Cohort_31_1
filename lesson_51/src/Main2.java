import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
read();


    }
    public static void  read(){
        try (FileReader fileReader =new FileReader("4.txt");){
            int data;
            while((data = fileReader.read()) != -1){
                System.out.println((char)data);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");;
        } catch (IOException e) {
            System.out.println("read file error!");;
        }
    }
}
