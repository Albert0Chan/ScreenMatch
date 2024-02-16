package br.com.alura.agora.models;

import br.com.alura.agora.calculus.Sortable;

public class Movie extends Title implements Sortable{
    private String Director;
     
    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    @Override
    public int getClassification(){
        return (int) catchMedia()/2 ;
    }

    /**
     * @return String return the Director
     */
    public String getDirector() {
        return Director;
    }

    /**
     * @param Director the Director to set
     */
    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + "(" + this.getRealeaseYear() + ")";
    }


}
 