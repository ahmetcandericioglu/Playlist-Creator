import java.util.ArrayList;

public class ReleaseDateOrderedList extends PlayList {
    public ReleaseDateOrderedList(String name, ArrayList<Music> list){
        super(name);
        Strategy = new OrderByReleaseDate();
        SortByStrategy(list);
    }
}
