package it.lessons.spring.best_of_the_year.models;

public class Song {
    private int id;
    private String titolo;

    public Song(int id, String titolo){
        this.titolo = titolo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
