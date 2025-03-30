package it.lessons.spring.best_of_the_year.models;

public class Movie {
    private int id;
    private String titolo;
    private String regista;

    public Movie(int id, String titolo, String regista){
        this.titolo = titolo;
        this.id = id;
        this.regista = regista;
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

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    
}
