import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SuperFastCopy {
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		FileChannel inChannel  = null;
		FileChannel outChannel = null;
		try {
			inFile = new FileInputStream("C:\\\\Users\\\\punit.jagani\\\\Desktop\\\\AcroRd32.dll");
			outFile = new FileOutputStream("C:\\\\Users\\\\punit.jagani\\\\Desktop\\\\Acroaaa2Rd32.dll");
			inChannel = inFile.getChannel();
			outChannel = outFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024*16); // only one buffer is created and used by both in and out channel and buffer is at jvm level
			long ms1 = System.currentTimeMillis();
			while(true) {
				int count = inChannel.read(buffer);
				if(count == -1) break;
				buffer.flip();
				outChannel.write(buffer);
				buffer.clear();
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in "+(ms2-ms1)+" ms");			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				inChannel.close();
				outChannel.close();			
				inFile.close();
				outFile.close();
			} catch(Exception e) { }
		}
	}
}
