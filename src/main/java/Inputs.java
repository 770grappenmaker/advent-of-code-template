import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Inputs {
    private static Path dayToPath(int day) {
        return Paths.get("inputs", String.format("%02d.txt", day));
    }

    public static String readInput(int day) {
        final Path path = dayToPath(day);

        try {
            return Files.readString(path);
        } catch (IOException e) {
            System.out.println("Input for day " + day + " could not be read: " + e);
            System.exit(1);
            throw new RuntimeException();
        }
    }

    public static List<String> readInputLines(int day) {
        final Path path = dayToPath(day);

        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Input for day " + day + " could not be read: " + e);
            System.exit(1);
            throw new RuntimeException();
        }
    }
}
