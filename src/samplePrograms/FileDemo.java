package samplePrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.IntStream;

public class FileDemo {

	public static void main(String[] args) {
//		Path path = Paths.get("filenew.txt");
//		
//		try {
//			Path createdFilePath = Files.createFile(path);
//			System.out.println("createdFile" + createdFilePath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Path scrFile = Paths.get("file.txt");
//		Path tgrFile = Paths.get("copyFile.txt");
//		
//		try {
//			Files.copy(scrFile, tgrFile, StandardCopyOption.REPLACE_EXISTING);
//			System.out.println("Done");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Path wiki_path = Paths.get("file.txt");
//		
//		try {
//			List<String> lines = Files.readAllLines(wiki_path);
//			
//			for (String string : lines) {
//				System.out.println(string);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		IntStream.of(new int[] {4,5,7,9,8,3,2,7,5,8}).filter((int i) -> i > 5).distinct().forEach(System.out::println);
	}
}
