import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    String genre;
    double rating;

    Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
}

class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}

public class Main {
    //завдання 1
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("The Shawshank Redemption", "Drama", 9.3),
                new Movie("The Godfather", "Crime", 9.2),
                new Movie("The Godfather 2", "Crime", 9.0),
                new Movie("Pulp Fiction", "Crime", 8.9),
                new Movie("Forrest Gump", "Drama", 8.8),
                new Movie("Twilight", "Romance", 5.2)
        );

        //фільтрація фільмів з рейтингом більше 8.0
        List<Movie> highRatedMovies = movies.stream()
                .filter(movie -> movie.getRating() > 8.0)
                .collect(Collectors.toList());

        System.out.println("фільми з рейтингом більше 8.0:");
        highRatedMovies.forEach(movie -> System.out.println(movie.getTitle()));

        //сортування фільми за рейтингом у порядку спадання
        List<Movie> sortedMovies = highRatedMovies.stream()
                .sorted((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()))
                .collect(Collectors.toList());

        System.out.println("\nфільми за рейтингом спадання:");
        sortedMovies.forEach(movie -> System.out.println(movie.getTitle() + " - рейтинг: " + movie.getRating()));

        //список назв фільмів
        List<String> movieTitles = sortedMovies.stream()
                .map(Movie::getTitle)
                .collect(Collectors.toList());

        System.out.println("\nсписок назв фільмів:");
        movieTitles.forEach(System.out::println);

        //середній рейтинг всіх фільмів
        double averageRating = movies.stream()
                .mapToDouble(Movie::getRating)
                .average()
                .orElse(0.0);

        System.out.println("\nсередній рейтинг всіх фільмів: " + averageRating);

        //книги
        List<Book> books = Arrays.asList(
                new Book("1984", "George Orwell", 1949),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new Book("Brave New World", "Aldous Huxley", 1932),
                new Book("The Road", "Cormac McCarthy", 2006)
        );

        //фільтрування книг після 2000 року
        List<Book> modernBooks = books.stream()
                .filter(book -> book.getYear() > 2000)
                .collect(Collectors.toList());

        System.out.println("книги після 2000 року:");
        modernBooks.forEach(book -> System.out.println(book.getTitle()));

        //книги за роком видання
        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparingInt(Book::getYear))
                .collect(Collectors.toList());

        System.out.println("\nкниги за роком видання:");
        sortedBooks.forEach(book -> System.out.println(book.getTitle() + " - рік видання: " + book.getYear()));

        //список лише книг
        List<String> bookTitles = books.stream()
                .map(Book::getTitle)
                .collect(Collectors.toList());

        System.out.println("\nсписок назв книг:");
        bookTitles.forEach(System.out::println);

        //книги з найстарішим роком видання
        Book oldestBook = books.stream()
                .min(Comparator.comparingInt(Book::getYear))
                .orElseThrow(() -> new IllegalArgumentException("список книг порожній"));

        System.out.println("\nнайстаріша книга: " + oldestBook.getTitle() + " - рік видання: " + oldestBook.getYear());
    }
}