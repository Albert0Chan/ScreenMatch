package br.com.alura.agora.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.agora.models.Anime;
import br.com.alura.agora.models.Movie;
import br.com.alura.agora.models.Serie;
import br.com.alura.agora.models.Title;

public class MainWLIsts {
    public static void main(String[] args){
        Movie myMovie = new Movie("Fast and Furious", 2001);
        myMovie.evaluates(9);
        Serie lost = new Serie("lost", 2004);
        Movie avatar = new Movie("Avatar", 2009);
        avatar.evaluates(7);
        Anime OnePiece = new Anime("One Piece", 2001);
        var pauloMovie = new Movie("DogVille", 2016);
        pauloMovie.evaluates(10);

        Movie m1 = pauloMovie;
        
        List<Title> titleList = new LinkedList<>();
        titleList.add(pauloMovie);
        titleList.add(myMovie);
        titleList.add(avatar);
        titleList.add(lost);
        titleList.add(OnePiece);

        for (Title item : titleList) {
            System.out.println(item.getName());
            // item = movie : If is true
            if(item instanceof Movie movie && movie.getClassification() > 2){
                System.out.println("Classification: " + movie.getClassification());
                System.out.println();
            }
        }

        ArrayList<String> artistList = new ArrayList<>();
        artistList.add("Adam Sundler");
        artistList.add("Lady Gaga");
        artistList.add("Toguroo");
        artistList.add("Popo Freitas");  

        System.out.println(artistList);
        Collections.sort(artistList);
        System.out.println("After ordenation");
        System.out.println(artistList);
        System.out.println("Lista Ordenada");
        Collections.sort(titleList);
        System.out.println(titleList);
        titleList.sort(Comparator.comparing(Title::getRealeaseYear));
        System.out.println("Ordenando por ano de lançamento:");
        System.out.println(titleList);
    }
}