// 버퍼링을 사용한 파일 복사
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class chap22_03 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            bis = new BufferedInputStream(new FileInputStream("C:"+File.separator+"tmp"+File.separator+"file.in"));
            bos = new BufferedOutputStream(new FileOutputStream("C:"+File.separator+"tmp"+File.separator+"file.out"));
            byte[] data = new byte[1024];
            while(bis.read(data)!=-1) {
                bos.write(data);
            }
        }catch (IOException e) {
            throw new RuntimeException(e); 
        }finally {
            try{ bis.close();} catch(Exception e){}
            try{ bos.close();} catch(Exception e){}

        }

        long duration = System.currentTimeMillis() - start;
        System.out.println(duration);
    }
    
}
