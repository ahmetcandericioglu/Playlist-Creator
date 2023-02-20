import java.util.ArrayList;

public class FilteredGenreList extends PlayList{
    public FilteredGenreList(String genre, String name, ArrayList<Music> list){
        super(name);
        Strategy = new OrderByGenre(genre);
        SortByStrategy(list);
    }
}
