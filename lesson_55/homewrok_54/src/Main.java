import java.io.*;
import java.util.Arrays;

public class Main {

    private static byte[] arr1 = new byte[601];
    private static byte[] arr2 = new byte[57053];
    private static byte[] arr3 = new byte[22494];

    static byte[][] arr = new byte[3][4];

//        arr[0] = arr1;
//        arr[1] = arr2;
//        arr[2] = arr3;

    public static void main(String[] args) {

        try {
            read();
            getFileType(arr1);
        }catch (IOException e){
            System.out.println("Reading files error");
            throw new RuntimeException();
        }

        /*
        1. читаем 3 массива заданного размера из файла
        2. анализ сигнатур
        3. запись файлов

         */



    }

    public static void write (byte[] arr) throws FileNotFoundException {
        FileType fileType = getFileType(arr);
        String name="pic";
        if(fileType == FileType.CLAS){
            name = "Main";
        }
        name = name+fileType.getExtension();
       try (BufferedOutputStream is = new BufferedOutputStream(new FileOutputStream(name))){

       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }

    public static void read() throws IOException {
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream("file.dat"))) {
            is.read(arr1);
            is.read(arr2);
            is.read(arr3);
        }


    }
    public static FileType getFileType(byte[] arr){
        byte [] gif = new byte[]{(byte) 0x47, (byte)0x49, (byte)0x46, (byte)0x38, (byte)0x39, (byte)0x61 };
        byte [] jpeg = new byte[]{(byte) 0xff,(byte)0xd8 };
        byte [] klas = new byte[]{(byte) 0xca, (byte) 0xfe, (byte) 0xba, (byte) 0xbe};

        boolean flag = true;
        for (int i = 0; i < gif.length; i++) {
            if(arr[i]!= gif[i]){
                flag = false;
                break;
            }
        }
        if(flag) return FileType.GIF;

        flag = true;
        for (int i = 0; i < jpeg.length; i++) {
            if(arr[i]!= jpeg[i]){
                flag = false;
                break;
            }
        }
        if(flag) return FileType.JPG;

        flag = true;
        for (int i = 0; i < klas.length; i++) {
            if(arr[i]!= klas[i]){
                flag = false;
                break;
            }
        }
        if(flag) return FileType.CLAS;
        return null;
    }

}
