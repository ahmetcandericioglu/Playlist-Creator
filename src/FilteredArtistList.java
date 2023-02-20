import java.util.ArrayList;

public class FilteredArtistList extends PlayList{
    public FilteredArtistList(Artist artist, String name, ArrayList<Music> list){
        super(name);
        Strategy = new OrderByArtist(artist);
        SortByStrategy(list);
    }
}
