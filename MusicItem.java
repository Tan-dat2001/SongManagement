package SongManagement;

public class MusicItem {
    private Song song;
    private SourceFile file;
    private double hitCounts;
    private String singer;
    public MusicItem(Song song, SourceFile file, double hitCounts, String singer) {
        this.song = song;
        this.file = file;
        this.hitCounts = hitCounts;
        this.singer = singer;
    }


    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public SourceFile getFile() {
        return file;
    }

    public void setFile(SourceFile file) {
        this.file = file;
    }

    public double getHitCounts() {
        return hitCounts;
    }

    public void setHitCounts(double hitCounts) {
        this.hitCounts = hitCounts;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public boolean moreFavouriteThan(MusicItem musicItem){
        System.out.print("Kiểm tra " + this.getSong().getTitle() + " nhiều lượt truy cập hơn " + musicItem.getSong().getTitle() + " hay không: " );
        return this.getHitCounts() > musicItem.getHitCounts();
    }

    public boolean longerThan(ClockTime clockTime){
        if(this.getFile().getDuration().getMinute() > clockTime.getMinute()){
            return true;
        }else if(this.getFile().getDuration().getMinute() == clockTime.getMinute()){
            return this.getFile().getDuration().getSecond() > clockTime.getSecond();
        }else{
            return false;
        }
    }
}
