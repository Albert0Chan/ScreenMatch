package br.com.alura.agora.calculus;

public class RecommendedFilter {
 
 public void filters(Sortable s){
    if(s.getClassification() >= 4){
        System.out.println("Top rated");
    }
    else if(s.getClassification() >= 2){
        System.out.println("Maybe you liked");
    }
    else{
        System.out.println("Save for later");
    }
 }
}