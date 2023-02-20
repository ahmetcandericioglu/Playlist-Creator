import java.util.ArrayList;

public class OrderByGenre implements OrderStrategy {
    private String genre;

    public OrderByGenre(String genre){
        this.genre = genre;
    }

    public void orderBy(ArrayList<Music> songs) {
        songs.removeIf(m -> !m.getGenre().equals(this.genre));
    }
}
