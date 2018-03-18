package task4.library;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";
    static final String USER = "sa";
    static final String PASS = "";
    static final String DATABASE_NAME = "LIBRARY";

    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        Scanner scan = new Scanner(System.in);
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = conn.createStatement();

            LibraryUtils.createIfNotExistAndFillLibrary(statement);

            String line;
            String isbn;
            String author;
            String title;
            String amountInput;
            int amount;
            boolean isWorking = true;
            while (isWorking) {
                System.out.println("To add book by ISBN print \"add\"\n" +
                        "to view list of books print \"list\"\n" +
                        "to view information by ISBN print \"info\"\n" +
                        "to change remained amount by ISBN print \"amount\"\n" +
                        "to exit print \"exit\"");
                line = scan.nextLine();
                switch (line) {
                    case "add":
                        do {
                            System.out.println("Print ISBN:");
                            isbn = scan.nextLine();
                        } while (!isIsbn(isbn));
                        if (LibraryUtils.containsInDatabase(statement, isbn)) {
                            System.out.println("This book is already in database");
                            break;
                        }
                        System.out.println("Print author:");
                        author = scan.nextLine();
                        System.out.println("Print title:");
                        title = scan.nextLine();
                        do {
                            System.out.println("Print amount:");
                            amountInput = scan.nextLine();
                        } while (isNotAmount(amountInput));
                        amount = Integer.parseInt(amountInput);
                        LibraryUtils.add(statement, isbn, author, title, amount);
                        System.out.println("Book added");
                        LibraryUtils.add(statement, isbn, author, title, amount);
                        break;
                    case "info":
                        System.out.println("Print ISBN:");
                        isbn = scan.nextLine();
                        LibraryUtils.viewInfoByIsbn(statement, isbn);
                        break;
                    case "amount":
                        System.out.println("Print ISBN:");
                        isbn = scan.nextLine();
                        if (!LibraryUtils.containsInDatabase(statement, isbn)) {
                            System.out.println("No such book in database");
                            break;
                        }
                        do {
                            System.out.println("Print new amount:");
                            amountInput = scan.nextLine();
                        } while (isNotAmount(amountInput));
                        amount = Integer.parseInt(amountInput);
                        LibraryUtils.changeRemainedAmount(statement, isbn, amount);
                        break;
                    case "list":
                        String row;
                        System.out.println("To sort by ISBN print \"1\"\n" +
                                "to sort by added date print\"2\"\n" +
                                "to sort by author print\"3\"\n" +
                                "to sort by title print\"4\"\n" +
                                "to sort by remained amount print \"5\"\n" +
                                "default sort - by remained amount");
                        line = scan.nextLine();
                        switch (line) {
                            case "1":
                                row = "isbn";
                                break;
                            case "2":
                                row = "added_date";
                                break;
                            case "3":
                                row = "author";
                                break;
                            case "4":
                                row = "title";
                                break;
                            case "5":
                            default:
                                row = "remained_amount";
                                break;
                        }
                        LibraryUtils.viewListOfBooks(statement, row);
                        break;
                    case "exit":
                        isWorking = false;
                        break;
                    default:
                        break;
                }
            }

            statement.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            scan.close();
        }
    }

    private static boolean isIsbn (String isbn) {
        Pattern p = Pattern.compile("[\\d]{13}");
        Matcher m = p.matcher(isbn);
        return m.matches();
    }

    private static boolean isNotAmount (String amountInput) {
        int amount;
        try {
            amount = Integer.parseInt(amountInput);
        } catch (NumberFormatException e) {
            return true;
        }
        return amount < 0;
    }
}

