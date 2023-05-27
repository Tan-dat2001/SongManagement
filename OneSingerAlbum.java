package SongManagement;

public class OneSingerAlbum extends Album{
    private String singer;


    public OneSingerAlbum(String title, int publishedYear, IMusicItem musicItems, String singer) {
        super(title, publishedYear, musicItems);
        this.singer = singer;
    }
}
