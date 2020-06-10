import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExampleMovingFilesJava {

	public static void main(String[] args) throws IOException {

		// The first method utilizes Files package for moving
		moveFile();

	}

	private static void moveFile() {
		try {
			Path tempPath = Files.move(Paths.get("/Users/julioamorim/Downloads/demoo.zip"),
					Paths.get("/Users/julioamorim/demo.zip"));

			if (tempPath != null) {
				System.out.println("File renamed and moved successfully");
			} else {
				System.out.println("Failed to move the file");
			}

		} catch (FileAlreadyExistsException e) {
			System.out.println("File already exists");
		} catch (NoSuchFileException e) {
			System.out.println("No shuch file exception");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Done");
		}
	}
}