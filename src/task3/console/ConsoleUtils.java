package task3.console;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

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
        commands.add("zip [source] [destination directory]");
        commands.add("unzip [source] [destination directory]");
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

    static void zip(String source, String destination) {
        File fileToZip = new File(source);
        File destinationDirectory = new File(destination);
        if (!destinationDirectory.exists()) {
            if (!destinationDirectory.mkdirs()) {
                System.out.println("Couldn't create destination directory.");
                return;
            }
        }
        String zipFileName = (fileToZip.isDirectory() ? fileToZip.getName() : fileWithoutExtension(fileToZip.getName())) + ".zip";
        try (FileOutputStream fos = new FileOutputStream(destination + File.separator + zipFileName);
             ZipOutputStream zipOut = new ZipOutputStream(fos)) {
            zipFile(fileToZip, fileToZip.getName(), zipOut);
            System.out.println("Zip successful.");
        } catch (IOException e) {
            System.out.println("Zip unsuccessful.");
            e.printStackTrace();
        }
    }

    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        if (fileToZip.isDirectory()) {
            File[] children = fileToZip.listFiles();
            if (children != null) {
                for (File childFile : children) {
                    zipFile(childFile, fileName + File.separator + childFile.getName(), zipOut);
                }
            }
            return;
        }
        try (FileInputStream fis = new FileInputStream(fileToZip)) {
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOut.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
        }
    }

    private static String fileWithoutExtension(String filename) {
        int pos = filename.lastIndexOf(".");
        if (pos == -1) {
            return filename;
        }
        return filename.substring(0, pos);
    }

    static void unzip(String source, String destination) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(source))) {
            ZipEntry zipEntry;
            byte[] buffer = new byte[1024];
            while ((zipEntry = zis.getNextEntry()) != null) {
                String fileName = zipEntry.getName();
                if (zipEntry.isDirectory()) {
                    new File(destination, fileName).mkdirs();
                    continue;
                }
                File newFile = new File(destination + File.separator + fileName);
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
            }
            System.out.println("Unzip successful.");
        } catch (IOException e) {
            System.out.println("Unzip unsuccessful.");
            e.printStackTrace();
        }
    }
}
