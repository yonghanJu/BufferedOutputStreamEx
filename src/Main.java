import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			//BufferedOutputStream의 크기를 5로 정한다
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			//1부터9까지 출력
			for(int i = '1'; i < '9'; i++) {
				bos.write(i);
			}
			
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
