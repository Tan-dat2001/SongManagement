package SongManagement;

public  class Song {
    private String title;
    private String genre;
    private String actor;

    MusicItem musicItem;

    public Song(String title, String genre, String actor) {
        this.title = title;
        this.genre = genre;
        this.actor = actor;
    }

//    public Song(String title, String genre, String actor, MusicItem musicItem) {
//        this.title = title;
//        this.genre = genre;
//        this.actor = actor;
//        this.musicItem = musicItem;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

//    public boolean moreFavouriteThan(Song song){
//        return this.musicItem.getHitCounts() > song.musicItem.getHitCounts();
//    }

}
