package it.lessons.spring.best_of_the_year.models;

public class Song {
    private int id;
    private String titolo;
    private String cantante;

    public Song(int id, String titolo, String cantante){
        this.titolo = titolo;
        this.id = id;
        this.cantante = cantante;
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

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    
}
