package ArrayPractice;



public class DVD {
    private String name;
    private String director;
    private int releaseYear;

    public DVD() {
    }

    public DVD(String name, String director, int releaseYear) {
        this.name = name;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String toString(){
        return this.name + " is directed by " + this.director + " and released in " + this.releaseYear;
    }

}
