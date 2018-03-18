package task4.library;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static task4.library.Library.DATABASE_NAME;

public class LibraryUtils {

    static void add(Statement statement, String isbn, String author, String title, Integer remainedAmount) throws SQLException {
        String sql = "INSERT INTO "
                + DATABASE_NAME
                + String.format(" VALUES ('%s', NOW(), '%s', '%s', %d)", isbn, author, title, remainedAmount);
        statement.executeUpdate(sql);
    }

    static void viewInfoByIsbn(Statement statement, String isbn) throws SQLException {
        String sql = " SELECT * FROM "
                + DATABASE_NAME
                + " WHERE isbn = "
                + isbn;
        ResultSet resultSet = statement.executeQuery(sql);
        if (!resultSet.isBeforeFirst()) {
            System.out.println("No such book");
        } else {
            printBooksSet(resultSet);
        }
    }

    static void changeRemainedAmount(Statement statement, String isbn, Integer remainedAmount) throws SQLException {
        String sql = " UPDATE " + DATABASE_NAME
                + " SET remained_amount = " + remainedAmount
                + " WHERE isbn IS " + isbn;
        statement.executeUpdate(sql);
    }

    static void viewListOfBooks(Statement statement, String row) throws SQLException {
        String sql = " SELECT * FROM "
                + DATABASE_NAME
                + " ORDER BY " + row;
        ResultSet resultSet = statement.executeQuery(sql);
        printBooksSet(resultSet);
    }

    static void createIfNotExistAndFillLibrary(Statement statement) throws SQLException {
        String sql = " CREATE TABLE IF NOT EXISTS LIBRARY " +
                " (isbn CHAR(13) NOT NULL, " +
                " added_date TIMESTAMP, " +
                " author VARCHAR(255), " +
                " title VARCHAR(255), " +
                " remained_amount INTEGER, " +
                " PRIMARY KEY ( isbn ))";
        statement.executeUpdate(sql);
        sql = " SELECT * FROM " + DATABASE_NAME;
        ResultSet resultSet = statement.executeQuery(sql);
        if (!resultSet.isBeforeFirst()) {
            fillLibrary(statement);
        }
    }

    static boolean containsInDatabase (Statement statement, String isbn) throws SQLException {
        String sql = " SELECT * FROM "
                + DATABASE_NAME
                + " WHERE isbn = "
                + isbn;
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet.isBeforeFirst();
    }

    private static void fillLibrary(Statement statement) throws SQLException {
        add(statement, "1234567890123", "Miguel de Cervantes", "Don Quixote", 1);
        add(statement, "2345678901234", "Marcel Proust", "In Search of Lost Time", 10);
        add(statement, "3456789012345", "James Joyce", "Ulysses", 5);
        add(statement, "4567890123456", "Homer", "The Odyssey", 3);
        add(statement, "5678901234567", "Leo Tolstoy", "War and Peace", 6);
    }

    private static void printBooksSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String isbn = resultSet.getString("isbn");
            Date date = resultSet.getDate("added_date");
            String author = resultSet.getString("author");
            String title = resultSet.getString("title");
            int remainedAmount = resultSet.getInt("remained_amount");

            System.out.print("ISBN: " + isbn);
            System.out.print(", added date: " + date);
            System.out.print(", author: " + author);
            System.out.print(", title: " + title);
            System.out.println(", remained Amount: " + remainedAmount);
        }
    }
}
