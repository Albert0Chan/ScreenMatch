package br.com.alura.agora.models;

import br.com.alura.agora.excessao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;

    private boolean incluedPlan;
    double sumEvaluations;
    int totalEvaliations;

    private int durationMinutes;

    public Title(String name, int releaseYear){
        this.setName(name);
        this.setReleaseYear(releaseYear);
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        if(myTitleOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não foi possível converter o ano, pois tem"+
                                                    " mais de quatro caracteres");

        }
        this.releaseYear = Integer.parseInt(myTitleOmdb.year());
        this.durationMinutes = Integer.parseInt(myTitleOmdb.runtime().substring(0, 2));
    }

    public void setName(String name){
         this.name = name;
     }

     public boolean getIncluedPlan(){
        return incluedPlan;
     }
 
     public String getName(){
         return name;
     }
 
     public void setReleaseYear(int releaseYear){
         this.releaseYear = releaseYear;
     }
 
     public int getRealeaseYear(){
         return releaseYear;
     }
 
     public void setDurationMinutes(int durationMinutes){
         this.durationMinutes = durationMinutes;
     }
     
     public int getDurationMinutes(){
         return durationMinutes;
     }
 
     public double getSumEvaluations(){
         return sumEvaluations;
     }
     public int getTotalEvaliations(){
         return totalEvaliations;
     }
     
    public void showTechnicalData(){
        System.out.println("Movie name: " + name);
        System.out.println("Film realease Year: " + releaseYear);
    }

    public void evaluates(double note){
        sumEvaluations += note;
        totalEvaliations++;
    }

    public double catchMedia(){
        return sumEvaluations/totalEvaliations;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }

    @Override
    public String toString() {
        return  "(name = " + name +
                ", releaseYear = " + releaseYear +
                ", duration = " + durationMinutes +
                ')';
    }
}