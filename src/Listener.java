import java.util.ArrayList;

public class Listener implements Observer{
    private String nickName;
    private ArrayList<Artist> artists;
    private ArrayList<Music> allSongs;
    private ArrayList<PlayList> library;
    private PlayListCreator playListCreator;

    public Listener(String nickName) {
        this.nickName = nickName;
        artists = new ArrayList<Artist>();
        allSongs = new ArrayList<Music>();
        library = new ArrayList<PlayList>();
        playListCreator = new PlayListCreator();
    }
    @Override
    public void update(Subject sub) {
        Artist artist = (Artist) sub;
        ArrayList<Music> songsOfArtist = artist.getSongs();
        System.out.println(artist.getName() + " just released a new song name: " +
                songsOfArtist.get(songsOfArtist.size()-1).getName());
        allSongs.add(songsOfArtist.get(songsOfArtist.size()-1));
    }
    @Override
    public void follow(Subject sub) {
        artists.add((Artist) sub);
        ((Artist) sub).getFans().add(this);
    }
    @Override
    public void unfollow(Subject sub) {
        Artist artist = (Artist) sub;
        artists.remove(artist);
        ((Artist) sub).getFans().remove(this);
    }
    public void createPlaylist(Object obj, String name){
        library.add(playListCreator.createPlaylist(obj, name, this.getAllSongs()));
    }
    public void getAllPlaylists(){
        for (PlayList list : library){
            System.out.println(list.getName());
        }
    }
    public ArrayList<PlayList> getLibrary(){
        return this.library;
    }
    public void addAllSongs(Subject sub){
        this.follow(sub);
        allSongs.addAll(((Artist) sub).getSongs());
    }
    public void addSong(Music music){
        if (this.getAllSongs().contains(music))
            System.out.println("Song \"" + music.getName() + "\" is already in your list");
        else
            this.getAllSongs().add(music);
    }
    public void deleteSong(Music music){
        if (!this.getAllSongs().contains(music))
            System.out.println("Song \"" + music.getName() + "\" is not exist in your list");
        else this.getAllSongs().remove(music);
    }
    public PlayList getPlaylist(String listName){
        for (PlayList list : this.getLibrary()){
            if (list.getName().equals(listName))
                return list;

        }
        System.out.println("You do not have any playlist");
        return null;
    }
    public ArrayList<Artist> getArtists() {
        return artists;
    }
    public ArrayList<Music> getAllSongs() {
        return allSongs;
    }
    public void getAllSongsName() {
        for (Music m :this.getAllSongs()){
            System.out.println(m.getName());
        }
    }
}
