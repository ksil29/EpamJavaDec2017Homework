package task3.musiccache;

import com.beaglebuddy.mp3.MP3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Mp3SaverUtils {

    private final static String MP3_DIRECTORY_BY_DEFAULT;
    private static Path googleChromeMusicCache;
    private static Path mozillaMusicCache;
    private static File directoryForMp3;

    static {
        MP3_DIRECTORY_BY_DEFAULT = Paths.get(System.getProperty("user.home"), "Downloads", "Mp3 from cache").toString();
        googleChromeMusicCache = Paths.get(System.getProperty("user.home"), "AppData", "Local", "Google", "Chrome", "User Data", "Default", "Media Cache");
        mozillaMusicCache = Paths.get(System.getProperty("user.home"), "AppData", "Local", "Mozilla", "Firefox", "Profiles");
        File[] mozillaTemp = new File(mozillaMusicCache.toString()).listFiles();
        if (mozillaTemp != null && mozillaTemp.length > 0) {
            mozillaMusicCache = Paths.get(mozillaTemp[0].toString(), "cache2", "entries");
        }
    }

    static void chooseAndCreateFolder(Scanner scan) {
        System.out.println("Choose destination directory for mp3 files:");
        String inputDirectoryForMp3;
        inputDirectoryForMp3 = scan.nextLine();
        if (inputDirectoryForMp3 == null || inputDirectoryForMp3.isEmpty()) {
            inputDirectoryForMp3 = MP3_DIRECTORY_BY_DEFAULT;
        }
        directoryForMp3 = new File(inputDirectoryForMp3);
        if (directoryForMp3.exists()) {
            System.out.println("Directory already exists.");
            return;
        }
        if (!directoryForMp3.mkdir()) {
            System.out.println("Can't create directory.");
            chooseAndCreateFolder(scan);
        }
    }

    static void chooseBrowser(Scanner scan) {
        String inputString;
        while (true) {
            System.out.println("For Google Chrome press \"g\", for Mozilla press \"m\":");
            inputString = scan.nextLine();
            if (inputString.equals("g")) {
                saveMusicFromGoogleCache();
                break;
            }
            if (inputString.equals("m")) {
                saveMusicFromMozillaCache();
                break;
            }
        }
    }

    private static void saveMusicFromGoogleCache() {
        int copiedFilesCount = 0;
        File[] cacheFiles = googleChromeMusicCache.toFile().listFiles();
        if (cacheFiles != null && cacheFiles.length > 0) {
            for (File file : cacheFiles) {
                if (file.getName().startsWith("f_") && isMp3(file)) {
                    try {
                        Files.copy(Paths.get(file.toString()), Paths.get(directoryForMp3.toString(), file.getName() + ".mp3"), REPLACE_EXISTING);
                        copiedFilesCount++;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(copiedFilesCount + " file(s) has been copied.");
    }

    private static void saveMusicFromMozillaCache() {
        int copiedFilesCount = 0;
        File[] cacheFiles = mozillaMusicCache.toFile().listFiles();
        if (cacheFiles != null && cacheFiles.length > 0) {
            for (File file : cacheFiles) {
                if (isMp3(file)) {
                    try {
                        MP3 mp3 = new MP3(file);
                        String artist = mp3.getBand();
                        String song = mp3.getTitle();
                        String fileName = file.getName();
                        if (artist != null && !artist.isEmpty() && song != null && !song.isEmpty()) {
                            fileName = artist + " - " + song;
                        }
                        Files.copy(Paths.get(file.toString()), Paths.get(directoryForMp3.toString(), fileName + ".mp3"), REPLACE_EXISTING);
                        copiedFilesCount++;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(copiedFilesCount + " file(s) has been copied.");
    }

    private static boolean isMp3(File file) {
        try {
            MP3 mp3 = new MP3(file);
            mp3.getCodec();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
