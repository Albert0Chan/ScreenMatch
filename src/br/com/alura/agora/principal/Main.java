package br.com.alura.agora.principal;

import java.text.DecimalFormat;
import java.util.ArrayList;

import br.com.alura.agora.calculus.CalculatorTime;
import br.com.alura.agora.calculus.RecommendedFilter;
import br.com.alura.agora.models.Anime;
import br.com.alura.agora.models.Episode;
import br.com.alura.agora.models.Movie;
import br.com.alura.agora.models.Serie;

public class Main {
    public static void main(String[] args){
        String sep = "------------------------";
        Movie myMovie = new Movie("Fast and Furious", 2001);
        myMovie.setDurationMinutes(106);
        myMovie.showTechnicalData();


        myMovie.evaluates(5.7);
        myMovie.evaluates(6.9);
        myMovie.evaluates(9.2);

        //way to rounde numbers in java
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(myMovie.catchMedia()));
        
        System.out.println(sep);

        Serie lost = new Serie("lost", 2004);
        lost.setSeasons(6);
        lost.setEpPerSeasons(23);
        lost.setMinPerEp(300);
        lost.showTechnicalData();
        System.out.println("Duration in minutes Serie : " + lost.getDurationMinutes() + " minutes" );
        
        System.out.println(sep);

        Movie avatar = new Movie("Avatar", 2009);
        avatar.setReleaseYear(2009);
        avatar.setDurationMinutes(240);

        Anime OnePiece = new Anime("One Piece", 2001);
        OnePiece.setMinPerEp(24);
        OnePiece.setEpPerSeasons(100);
        OnePiece.setSeasons(15);
        OnePiece.showTechnicalData();
        System.out.println("Duration in Minutes " + OnePiece.getName() + ": " + OnePiece.getDurationMinutes() + " minutes");

        System.out.println(sep);


        CalculatorTime smartGuy = new CalculatorTime();
        smartGuy.inclued(myMovie);
        smartGuy.inclued(avatar);
        smartGuy.inclued(lost);
        smartGuy.inclued(OnePiece);
        System.out.println("A duração do do cronograma  e férias é: " + smartGuy.getTtotalTime() + " minutes");

        System.out.println(sep);
        
        //maybe late implements sortable in Serie
        RecommendedFilter skinny = new RecommendedFilter();
        skinny.filters(myMovie);

        Episode ep = new Episode();
        ep.setNumber(1);
        ep.setSerie(lost);
        ep.setTotalViews(500);

        System.out.println(sep);
        
        skinny.filters(ep);

        var pauloMovie = new Movie("DogVille", 2016);
        pauloMovie.setDurationMinutes(200);
        pauloMovie.setName("DogVille");
        pauloMovie.setReleaseYear(2016);
        pauloMovie.evaluates(10);

        System.out.println(sep);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(pauloMovie);
        movieList.add(myMovie);
        movieList.add(avatar);
        System.out.println("List size: " + movieList.size());
        System.out.println("First movie: " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println("toString of First movie: " + movieList.get(0).toString());

    }
}