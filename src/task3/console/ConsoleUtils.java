package task3.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class ConsoleUtils {

    private static List<String> commands;

    static {
        commands = new ArrayList<>();
        commands.add("help");
        commands.add("-h");
        commands.add("copy [source file] [destination directory]");
        commands.add("mkdir [destination]");
        commands.add("mp3saver");
    }

    static void help() {
        System.out.println("Available commands:");
        for (String s : commands) {
            System.out.println(s);
        }
    }

    static void copy(String source, String destination) {
        File sourceFile = new File(source);
        Path sourcePath = sourceFile.toPath();

        File destFile = new File(destination);
        if (!destFile.exists()) {
            if (!destFile.mkdirs()) {
                System.out.println("Couldn't create destination directory.");
                return;
            }
        }
        Path destPath = Paths.get(destination, sourceFile.getName());
        try {
            Files.copy(sourcePath, destPath, REPLACE_EXISTING);
            System.out.println("Copy was successful.");
        } catch (IOException e) {
            System.out.println("Copy wasn't successful.");
            e.printStackTrace();
        }
    }

    static void makeDirectory(String directory) {
        File newDirectory = new File(directory);
        if (newDirectory.exists()) {
            System.out.println("Directory already exists.");
            return;
        }
        if (!newDirectory.mkdirs()) {
            System.out.println("Couldn't create directory.");
            return;
        }
        System.out.println("Directory has been created.");
    }
}
