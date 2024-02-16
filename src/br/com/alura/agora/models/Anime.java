package br.com.alura.agora.models;

public class Anime extends Serie{ 
   public Anime(String name, int releaseYear) {
      super(name, releaseYear);
   }

   private int fillers;

   public int getFillers(){
    return fillers;
   }

   public void setFillers(int fillers){
    this.fillers = fillers;
   }

   public int totalEps(){
    return (super.getEpPerSeasons() * super.getSeasons()) + fillers;
   }

   @Override
   public void showTechnicalData(){
    System.out.println(super.getName());
    System.out.println("Release Year: " + super.getRealeaseYear());
    System.out.println("Seasons: " + super.getSeasons());
   }

   @Override
   public String toString(){
       return "Anime: " +  this.getName() + "(" + getRealeaseYear() + ")";
   }
}