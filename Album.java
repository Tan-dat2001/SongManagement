package SongManagement;

public class Album {
    private String title;
    private int publishedYear;
    private IMusicItem musicItems;

    public Album(String title, int publishedYear, IMusicItem musicItems) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.musicItems = musicItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public IMusicItem getMusicItems() {
        return musicItems;
    }

    public void setMusicItems(IMusicItem musicItems) {
        this.musicItems = musicItems;
    }

    public int howMany(){
        return this.musicItems.laySoLuongBaiHat();
    }

    public String thisActorAfter(String actor){
        return this.musicItems.thisActor(actor);
    }
}
