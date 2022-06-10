// 파일복사 예제
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class chap22_02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:"+File.separator+"tmp"+File.separator+"file.in");
            fos = new FileOutputStream("C:"+File.separator+"tmp"+File.separator+"file.out");

            byte[] data = new byte[1024];
            while(fis.read(data)!=-1) {
                fos.write(data);
            }

        }catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{fis.close();} catch(Exception e) {}
            try{fos.close();} catch(Exception e) {}

        }
    }
}
