package br.com.alura.agora.models;

public class Title {

    private String name;
    private int releaseYear;
    private boolean incluedPlan;
    double sumEvaluations;
    int totalEvaliations;
    private int durationMinutes;

    public Title(String name, int releaseYear){
        this.setName(name);
        this.setReleaseYear(releaseYear);
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

}