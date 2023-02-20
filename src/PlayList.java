import java.util.ArrayList;
import java.util.Collections;

public abstract class PlayList {
    private String name;
    OrderStrategy Strategy;
    ArrayList<Music> playlist;

    public PlayList(String name){
        this.name = name;
    }
    public ArrayList<Music> SortByStrategy(ArrayList<Music> list){
        playlist = new ArrayList<Music>();
        playlist.addAll(list);
        Strategy.orderBy(playlist);
        return playlist;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Music> getListInstance() {
        return this.playlist;
    }
    public void getMusicsInList(){
        for(Music m : this.playlist){
            System.out.println(m.getName());
        }
    }
    public void addSong(Music music){
        this.getListInstance().add(music);
    }
    public void removeSong(Music music){
        this.getListInstance().remove(music);
    }
    public void reverse(){
        for (int i = 0; i < this.getListInstance().size()/2 ; i++)
            Collections.swap(this.getListInstance(),i,this.getListInstance().size()-i-1);
    }
}
