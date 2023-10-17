package br.com.alura.agora.calculus;
import br.com.alura.agora.models.Title;

public class CalculatorTime {
    //In java initial atributes are always given zero, but is possible implemets zero
    private int totalTime;

    public int getTtotalTime(){
        return totalTime;
    }

    /* public void inclued(Movie v){
        this.totalTime += v.getDurationMinutes();
    } */
    //Method overload  
    /* public void inclued(Serie s){
        this.totalTime += s.getDurationMinutes();
    } */

    public void inclued(Title t){
    System.out.println("Adding duration in minutes of the: " + t);
        this.totalTime += t.getDurationMinutes();
    }
}