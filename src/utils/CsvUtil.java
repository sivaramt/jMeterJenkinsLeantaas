package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvUtil {


	File file;

	public void updateFile(String fileLoc, String str) {

		try {
			file= new File(fileLoc);

			if(!file.exists())
				file.createNewFile();

			FileWriter fileWriter = new FileWriter(fileLoc);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.newLine();
			bufferWriter.append(str);

			bufferWriter.close();
			fileWriter.close();
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e1){
			e1.printStackTrace();
		}
	}
}
