
import java.text.DecimalFormat;

import br.com.alura.agora.calculus.CalculatorTime;
import br.com.alura.agora.calculus.RecommendedFilter;
import br.com.alura.agora.models.Anime;
import br.com.alura.agora.models.Episode;
import br.com.alura.agora.models.Movie;
import br.com.alura.agora.models.Serie;

public class Main {
    public static void main(String[] args){
        String sep = "------------------------";
        Movie myMovie = new Movie();
        myMovie.setName("Fast and Furious");
        myMovie.setReleaseYear(2001);
        myMovie.setDurationMinutes(106);
        myMovie.showTechnicalData();


        myMovie.evaluates(5.7);
        myMovie.evaluates(6.9);
        myMovie.evaluates(9.2);

        //way to rounde numbers in java
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(myMovie.catchMedia()));
        
        System.out.println(sep);

        Serie lost = new Serie();
        lost.setName("lost");
        lost.setSeasons(6);
        lost.setReleaseYear(2004);
        lost.setEpPerSeasons(23);
        lost.setMinPerEp(300);
        lost.showTechnicalData();
        System.out.println("Duration in minutes Serie : " + lost.getDurationMinutes() + " minutes" );
        
        System.out.println(sep);

        Movie avatar = new Movie();
        avatar.setName("Avatar");
        avatar.setReleaseYear(2009);
        avatar.setDurationMinutes(240);

        Anime OnePiece = new Anime();
        OnePiece.setName("OnePiece");
        OnePiece.setMinPerEp(24);
        OnePiece.setEpPerSeasons(100);
        OnePiece.setSeasons(15);
        OnePiece.setReleaseYear(2001);
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
    }
}
