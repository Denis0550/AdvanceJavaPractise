package SDA_Java_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        MovieRepository movieRepository = new MovieRepository();
        movieRepository.add(new Movie("Star Wars Force Awakens", "Action",
                "J.J Ambrams",2015));
        movieRepository.add(new Movie("Star Wars Last Jedi", "Action",
                "J.J Ambrams",2017));

        System.out.println("Results: " + movieRepository.getAll());

    }
}

class MovieRepository {
    private final MovieParser movieParser = new MovieParser();
    private final static Path PATH = Paths.get("C:\\Users\\dsoro\\OneDrive\\Desktop\\test6.txt");

    public void add(Movie movie) throws IOException {
        Files.writeString(PATH, movieParser.toCSV(movie), StandardOpenOption.APPEND);
    }
    public List<Movie> getAll() throws IOException {
        List<String> movieLines = Files.readAllLines(PATH);
        List<Movie> movies = new ArrayList<>();
        for (String line : movieLines) {
            Movie movie = movieParser.fromSCV(line);
            movies.add(movie);
        }
        return movies;
    }

}

class MovieParser {
    private static final String SEPARATOR = ",";
    public Movie fromSCV(String line) {
        String[] data = line.split(SEPARATOR);
        return new Movie(data[0], data[1], data[2], Integer.parseInt(data[3]));
    }
    public String toCSV(Movie movie) {
        return new StringBuilder().append(movie.getTitle())
                .append(SEPARATOR)
                .append(movie.getGenre())
                .append(SEPARATOR)
                .append(movie.getDirector())
                .append(SEPARATOR)
                .append(movie.getYearOfRelease())
                .append("\n")
                .toString();
    }
}

class Movie {
    private String title;
    private String genre;
    private String director;
    private int yearOfRelease;

    public Movie(String title, String genre, String director, int yearOfRelease) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}