package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/***
 * Écris une fonction JavaScript filterByTitle qui prend en paramètre un tableau d'objets movies et une chaîne de
 * caractères searchedTitle . Cette fonction doit retourner un nouveau tableau contenant uniquement les objets dont
 * la propriété title contient la chaîne de caractères searchedTitle spécifiée en paramètre et doit être insensible
 * à la casse.
 */
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Movie> recentMovies = createRecentMovies();

        List<Movie> foundedMovies = filterByTitle(recentMovies, "the");

        for(Movie movie: foundedMovies) {
            System.out.println(movie.getTitle());
        }
        System.out.println();

        for(Movie movie: filterByTitle(recentMovies)) {
            System.out.println(movie.getTitle());
        }
    }

    private static List<Movie> filterByTitle(ArrayList<Movie> palMovies) {
        return palMovies;
    }

    private static List<Movie> filterByTitle(ArrayList<Movie> palMovies, String psSearchedTitle) {
        return palMovies.stream().filter(movie -> movie.getTitle().toLowerCase().contains(psSearchedTitle.toLowerCase())).toList();
    }

    private static ArrayList<Movie> createRecentMovies() {
        ArrayList<Movie> recentMovies = new ArrayList<>();
        Movie movie1 = new Movie();
        movie1.setTitle("The Great Adventure");
        movie1.setReleaseDate("2023-07-15");
        movie1.setActors(new ArrayList<String>(Arrays.asList("Alex Johnson", "Samantha Bloom", "Michael Cane")));
        recentMovies.add(movie1);

        Movie movie2 = new Movie();
        movie2.setTitle("Lost in Time");
        movie2.setReleaseDate("2023-05-22");
        movie2.setActors(new ArrayList<String>(Arrays.asList("Clara Hughes", "Robert Smith", "Emily Stone")));
        recentMovies.add(movie2);

        Movie movie3 = new Movie();
        movie3.setTitle("Mystery of the Blue Ocean");
        movie3.setReleaseDate("2023-08-30");
        movie3.setActors(new ArrayList<String>(Arrays.asList("Henry Gold", "Natalie Port", "Bruce Wayne")));
        recentMovies.add(movie3);

        Movie movie4 = new Movie();
        movie4.setTitle("Cybernetic");
        movie4.setReleaseDate("2023-09-12");
        movie4.setActors(new ArrayList<String>(Arrays.asList("Aaron Stark", "Lisa Ray", "Jeremy Irons")));
        recentMovies.add(movie4);

        Movie movie5 = new Movie();
        movie5.setTitle("The Hidden World");
        movie5.setReleaseDate("2023-10-05");
        movie5.setActors(new ArrayList<String>(Arrays.asList("Sophia Loren", "Daniel Craig", "Emma Watson")));
        recentMovies.add(movie5);

        return recentMovies;
    }
}