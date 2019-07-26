package br.com.example.howto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class ReadFile {

	public static void main(String[] args) {
		try {
			readStreamOfLinesUsingFiles();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("howtodoinjava");
				
			}
		}).start();
		
		new Thread(
				() ->  {
					System.out.println("howtodoinjava");
				}).start();;
	}
	
	private static void readStreamOfLinesUsingFiles() throws IOException {
		
		Stream<String> lines = Files.lines(Paths.get("c:/Aubay", "data.txt"));
		
		Optional<String> hasPassword = lines.filter(s -> s.contains("password")).findFirst();
		
		if(hasPassword.isPresent()) {
			System.out.println(hasPassword.get());
		}
		
		lines.close();
	}
}
