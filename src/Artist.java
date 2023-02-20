import java.util.ArrayList;

public class Artist implements Subject {
    private String name;
    private int birthYear;
    private ArrayList<Music> songs;
    private ArrayList<Observer> fans;

    public Artist(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
        songs = new ArrayList<Music>();
        fans = new ArrayList<Observer>();
    }
    public ArrayList<Music> getSongs() {
        return songs;
    }
    @Override
    public void newSong(Music song) {
        if (this.getSongs().contains(song))
            System.out.println("Song \"" + song.getName() + "\" is already released");
        else {
            this.getSongs().add(song);
            notifyObservers();
        }
    }
    public void deleteSong(Music music){
        if (!this.getSongs().contains(music))
            System.out.println("Song \"" + music.getName() + "\" is not exist in your Songs");
        else this.getSongs().remove(music);
    }
    @Override
    public void notifyObservers() {
        for (Observer obj : fans) {
            obj.update(this);
        }
    }
    public ArrayList<Observer> getFans() {
        return fans;
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
}
