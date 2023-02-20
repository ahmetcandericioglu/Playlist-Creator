public class Music {
    private Artist artist;
    private String genre;
    private String name;
    private int releaseYear;

    public Music(Artist artist, String genre, String name, int releaseYear){
        this.artist = artist;
        this.genre = genre;
        this.name = name;
        this.releaseYear = releaseYear;
    }
    public String getName() {
        return this.name;
    }
    public String toString(){
        return "Music name: " + this.name + "\nArtist: " + this.artist +
                "\nGenre: " + this.genre + "\nReleased: " + this.releaseYear;
    }
    public Artist getArtist() {
        return artist;
    }
    public String getGenre() {
        return genre;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
