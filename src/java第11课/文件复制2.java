package java��11��;
import java.io.*;

public class �ļ�����2 {
	public static void main(String[] args) throws Exception {
        InputStream dd = new FileInputStream("src/text2/input.txt");
        OutputStream ddd = new FileOutputStream("src/text2/output.txt");
        int i;
        while((i = dd.read()) != -1){
            System.out.print((char)i);
            ddd.write(i);
        }
    }
}
