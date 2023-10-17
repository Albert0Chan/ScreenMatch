package br.com.alura.agora.models;

import br.com.alura.agora.calculus.Sortable;

public class Episode implements Sortable {
    private int number;
    private String nome;
    private Serie serie;
    private int totalViews;
    
    
    public int getClassification(){
        if(totalViews > 100){
            return 4;
        }else{

        return 2;
        }
    }

    public int getTotalViews(){
        return totalViews;
    }

    public void setTotalViews(int totalViews){
        this.totalViews = totalViews;
    }

    /**
     * @return int return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Serie return the serie
     */
    public Serie getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

}