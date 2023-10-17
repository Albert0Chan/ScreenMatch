package br.com.alura.agora.models;

public class Serie extends Title {
    private int seasons;
    private int epPerSeasons;
    private boolean on;
    private int minPerEp;

    
    @Override
    public int getDurationMinutes(){
        return seasons * minPerEp * epPerSeasons;    
    }
    
    @Override 
    public void showTechnicalData(){
        System.out.println(super.getName());
        System.out.println("Serie realease year: " + super.getRealeaseYear());
        System.out.println("Seasons: " + seasons);
       
    }
    /**
     * @return int return the seasons
     */
    public int getSeasons() {
        return seasons;
    }

    /**
     * @param seasons the seasons to set
     */
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    /**
     * @return int return the epPerSeasons
     */
    public int getEpPerSeasons() {
        return epPerSeasons;
    }

    /**
     * @param epPerSeasons the epPerSeasons to set
     */
    public void setEpPerSeasons(int epPerSeasons) {
        this.epPerSeasons = epPerSeasons;
    }

    /**
     * @return boolean return the on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on the on to set
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * @return double return the minPerEp
     */
    public double getMinPerEp() {
        return minPerEp;
    }

    /**
     * @param minPerEp the minPerEp to set
     */
    public void setMinPerEp(int minPerEp) {
        this.minPerEp = minPerEp;
    }

}