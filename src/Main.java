import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			//BufferedOutputStream�� ũ�⸦ 5�� ���Ѵ�
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			//1����9���� ���
			for(int i = '1'; i < '9'; i++) {
				bos.write(i);
			}
			
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
