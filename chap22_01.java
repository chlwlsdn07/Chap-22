//파일 입력 예제
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class chap22_01{

    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C: "+File.separator+"tmp"+File.separator+"file.in");
            int size=0;
            byte[] data = new byte[100];
            while((size=fis.read(data))!=-1) {
                for(int i=0; i<size; i++) {
                    System.out.println(String.format("0x%02X", data[i]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{ fis.close();}catch(Exception e) {}
        }
    }
}