import java.util.ArrayList;

public class OrderByArtist implements OrderStrategy {
    private Artist artist;

    public OrderByArtist(Artist artist){
        this.artist = artist;
    }

    public void orderBy(ArrayList<Music> songs) {
        songs.removeIf(m -> !m.getArtist().equals(this.artist));
    }
}