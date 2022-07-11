package lab_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BookManager {
    private static String relativeFilePath = "/src/lab_13/Book.txt";
    private static String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Book> getBookListFromFile = readBookToFile();

        boolean isContinuing = true;
        while (isContinuing) {
            printSimpleMenu();
            int option = generateOptipon();
            switch (option) {
                case 1:
                    addNewBook(bookList);
                    break;
                case 2:
                    findWithIdBook();
                    break;
                case 3:
                    updateWithIdBook();
                    break;
                case 4:
                    deleteWithIdBook();
                    break;
                case 5:
                    printBookList();
                    break;
                default:
                    isContinuing = false;
            }
        }
    }

    private static void printSimpleMenu() {

        System.out.println("======= Book Management Program (CRUD)============");
        System.out.println("1. New book");
        System.out.println("2. Find a book(ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("0. Exit");

    }

    private static int generateOptipon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select opton: ");
        return scanner.nextInt();
    }

    private static void addNewBook(List<Book> bookList) {
        List<Book> getBookListFromFile = readBookToFile();
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        int id;
        do{
            System.out.println("Please enter ISBN: ");
            id = scanner.nextInt();
        }while (getIDBook(id, getBookListFromFile) != -1);
        book.setIdBook(id);
        scanner.nextLine();

        System.out.println("Please enter title: ");
        book.setNameBook(scanner.nextLine());

        System.out.println("Please enter author: ");
        book.setAuthor(scanner.nextLine());

        System.out.println("Please enter year: ");
        book.setYear(scanner.nextInt());

        bookList.add(book);

        boolean status = (getBookListFromFile.size() == 0) ? false : true;
        saveBookToFile(bookList, status);
        System.out.println("The book is saved into DB wit info: Book {" + book + "}");
    }

    private static int getIDBook(int idBook, List<Book> getBookListFromFile) {
        return IntStream.range(0, getBookListFromFile.size())
                .filter(i -> getBookListFromFile.get(i).getIdBook() == idBook)
                .findFirst().orElse(-1);
    }

    private static void findWithIdBook() {
        List<Book> getBookListFromFile = readBookToFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ISBN: ");
        int idBook = scanner.nextInt();

        if (getIDBook(idBook, getBookListFromFile) != -1)
            System.out.println(getBookListFromFile.get(getIDBook(idBook, getBookListFromFile)));
        else
            System.out.printf("Book with ISBN %d is not found \n\n", idBook);
    }

    private static void updateWithIdBook() {
        List<Book> getBookListFromFile = readBookToFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ISBN: ");
        int idBook = scanner.nextInt();
        scanner.nextLine();

        int index = getIDBook(idBook, getBookListFromFile);
        if (index != -1) {
            System.out.println("Please enter title: ");
            getBookListFromFile.get(index).setNameBook(scanner.nextLine());
            System.out.println("Please enter author: ");
            getBookListFromFile.get(index).setAuthor(scanner.nextLine());
            System.out.println("Please enter year: ");
            getBookListFromFile.get(index).setYear(scanner.nextInt());

            saveBookToFile(getBookListFromFile, false);
            System.out.println("Update success!!!");
        } else
            System.out.printf("Book with ISBN %d is not found \n\n", idBook);
    }

    private static void deleteWithIdBook() {
        List<Book> getBookListFromFile = readBookToFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ISBN: ");
        int idBook = scanner.nextInt();

        int index = getIDBook(idBook, getBookListFromFile);
        if (index != -1) {
            getBookListFromFile.remove(index);
            saveBookToFile(getBookListFromFile, false);
            System.out.println("Delete success!!!");
        } else
            System.out.printf("Book with ISBN %d is not found \n\n", idBook);
    }

    private static void printBookList() {
        List<Book> getBookListFromFile = readBookToFile();
        int index = 0;
        for (Book book : getBookListFromFile) {
            index++;
            book.toString(index, book.getNameBook(), book.getIdBook(), book.getAuthor(), book.getYear());
        }
    }

    private static void saveBookToFile(List<Book> bookList, boolean status) {
        File file = new File(absoluteFilePath);
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file, status);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        ) {
            for (Book book : bookList) {
                String dataLine = book.toString();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static List<Book> readBookToFile() {
        List<Book> bookList = new ArrayList<>();
        try (
                FileInputStream fileInputStream = new FileInputStream(absoluteFilePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(";");
                String title = bookData[0];
                int idBook = Integer.parseInt(bookData[1]);
                String author = bookData[2];
                int year = Integer.parseInt(bookData[3]);
                Book book = new Book(title, idBook, author, year);
                bookList.add(book);

                dataLine = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }


}
