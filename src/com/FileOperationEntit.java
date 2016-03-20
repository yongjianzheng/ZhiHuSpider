import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.File;

public class FileOperationEntit{
	public static void writeIntoFile(String content, String filePath) {
		FileWriter fw = null;
		try {
			File f=new File(filePath);
			fw = new FileWriter(f, true);
			} catch (IOException e) {
				e.printStackTrace();
			}
		PrintWriter pw = new PrintWriter(fw);
		pw.println(content);
		pw.flush();
		try {
		fw.flush();
		pw.close();
		fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}