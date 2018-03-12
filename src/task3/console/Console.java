package task3.console;

import task3.musiccache.Mp3Saver;

public class Console {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("No command.");
            return;
        }
        switch (args[0]) {
            case "help":
            case "-h":
                if (args.length == 1) {
                    ConsoleUtils.help();
                }
                break;
            case "cp":
                if (args.length != 3) {
                    System.out.println("Wrong number of arguments");
                } else {
                    ConsoleUtils.copy(args[1], args[2]);
                }
                break;
            case "mkdir":
                if (args.length != 2) {
                    System.out.println("Wrong number of arguments");
                } else {
                    ConsoleUtils.makeDirectory(args[1]);
                }
                break;
            case "mp3saver":
                Mp3Saver.main(new String[0]);
                break;
            default:
                System.out.println("Wrong command, use -h to see help");
                break;
        }
    }
}
