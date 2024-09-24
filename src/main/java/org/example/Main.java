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

/**
 * La classe Main est dans tous les projets Java. C'est le point d'entrée.
 */
public class Main {

    /**
     * La méthode statique main de la classe main est le point d'entrée réel de notre programme.
     * @param args
     */
    public static void main(String[] args) {
        // on récupère la liste des films via la méthode createRecentMovies() que vous trouverez plus bas.
        ArrayList<Movie> recentMovies = createRecentMovies();

        // on récupère les films qui ont la chaîne de caractères "the" dans leur titre.
        List<Movie> foundedMovies = filterByTitle(recentMovies, "the");

        // on boucle sur les éléments de la list
        for(Movie movie: foundedMovies) {
            // on affiche leur title dans la console.
            System.out.println(movie.getTitle());
        }
        //on saute une ligne dans la console
        System.out.println();

        //on boucle sur les films filtrés par titre sans searchTitle
        for(Movie movie: filterByTitle(recentMovies)) {
            // on affiche leur title dans la console.
            System.out.println(movie.getTitle());
        }
    }

    /**
     * permet de filtrer la liste movies, mais sons paramètres. Est équivalement à la méthode
     * filterByTitle(movies, searchedTitle) où searchedTitle est null ou équivalent à une chaîne de caractère vide
     * @param movies
     * @return la liste filtrée
     */
    private static List<Movie> filterByTitle(ArrayList<Movie> movies) {
        return movies;
    }

    /**
     *
     * @param movies la liste à filtrer
     * @param searchedTitle la chaîne de caractères recherchée
     * @return la liste filtrée
     */
    private static List<Movie> filterByTitle(ArrayList<Movie> movies, String searchedTitle) {
        return movies.stream().filter(movie -> movie.getTitle().toLowerCase().contains(searchedTitle.toLowerCase())).toList();
    }

    /**
     * crée le tableau de films
     * @return le tableau de films
     */
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