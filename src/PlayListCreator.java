import java.util.ArrayList;

public class PlayListCreator {

    public PlayList createPlaylist(Object obj, String name, ArrayList<Music> list){
        if (obj instanceof Artist){
            PlayList newPlayList = new FilteredArtistList((Artist) obj, name, list);
            return newPlayList;
        }
        else if (obj.equals("Release Date")){
            PlayList newPlayList = new ReleaseDateOrderedList(name, list);
            return newPlayList;
        }
        else if (obj instanceof String){
            PlayList newPlayList = new FilteredGenreList((String) obj, name, list);
            return newPlayList;
        }
        return null;
    }
}
