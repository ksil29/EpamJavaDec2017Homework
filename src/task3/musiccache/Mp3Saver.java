package task3.musiccache;

import java.util.Scanner;

public class Mp3Saver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mp3SaverUtils.chooseAndCreateFolder(scan);
        Mp3SaverUtils.chooseBrowser(scan);
        scan.close();
    }
}
