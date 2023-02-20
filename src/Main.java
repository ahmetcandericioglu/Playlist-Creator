public class Main {

    public static void main(String[] args) {

        Artist MüslümGürses = new Artist("Müslüm Gürses", 1953);
        Artist Eminem = new Artist("Eminem", 1972);

        Music withoutMe = new Music(Eminem, "Hip-Hop/Rap","Without Me",2002);
        Music badGuy = new Music(Eminem, "Hip-Hop/Rap", "Bad Guy", 2013 );
        Music ringer = new Music(Eminem, "Hip-Hop/Rap", "Ringer", 2018 );
        Music loseYourself = new Music(Eminem, "Hip-Hop/Rap", "Lose Yourself", 2002 );

        Music affet = new Music(MüslümGürses, "Arabesk", "Affet", 2006);
        Music itirazimVar = new Music(MüslümGürses, "Arabesk", "Itirazım Var", 1981);
        Music unutamadım = new Music(MüslümGürses, "Arabesk", "Unutamadım", 1986);
        Music hangimizSevmedik = new Music(MüslümGürses, "Arabesk", "Hangimiz Sevmedik", 1994);

        Listener ahmet = new Listener("Ahmet");
        Listener emre = new Listener("emre");

        ahmet.follow(MüslümGürses);
        ahmet.follow(Eminem);
        //ahmet.unfollow(Eminem);

        Eminem.newSong(withoutMe);
        Eminem.newSong(badGuy);
        Eminem.newSong(ringer);
        Eminem.newSong(loseYourself);

        System.out.println();

        MüslümGürses.newSong(affet);
        MüslümGürses.newSong(itirazimVar);
        MüslümGürses.newSong(unutamadım);
        MüslümGürses.newSong(hangimizSevmedik);

        System.out.println("\nAll songs in the list:");
        ahmet.getAllSongsName();

        ahmet.createPlaylist(Eminem,"EminemList");
        ahmet.createPlaylist("Arabesk","ArabeskList");
        System.out.println("\nSongs in playlist " + ahmet.getPlaylist("EminemList").getName() + ":");
        ahmet.getPlaylist("EminemList").getMusicsInList();
        System.out.println("\nSongs in playlist " + ahmet.getPlaylist("ArabeskList").getName() + ":");
        ahmet.getPlaylist("ArabeskList").getMusicsInList();
    }
}
