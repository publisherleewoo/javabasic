package ch32;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		 Random random = new Random();
		 System.out.println(random.nextInt(10)); //0부터 9사이의 수가 랜덤
		 Path path = Paths.get("test.txt");
		 
		 try {
			 BufferedReader br = Files.newBufferedReader(path); //테스트파일 읽어줌
			 System.out.println("시도중");
		 } catch(IOException e) {
			 System.out.println("오류발생");
			 e.printStackTrace();	
		 }
		 
		 System.out.println("End");
	}
}
