package SongManagement;

public class ConsMusicItem implements IMusicItem{
    private MusicItem first;
    private IMusicItem rest;

    public ConsMusicItem(MusicItem first, IMusicItem rest) {
        this.first = first;
        this.rest = rest;
    }

    public MusicItem getFirst() {
        return first;
    }

    public void setFirst(MusicItem first) {
        this.first = first;
    }

    public IMusicItem getRest() {
        return rest;
    }

    public void setRest(IMusicItem rest) {
        this.rest = rest;
    }



    @Override
    public void favouriteRate() {
        if(this.first.getHitCounts() >= 40000){
            System.out.println("Mức độ ưa thích: Hot");
        }else if( this.first.getHitCounts() >= 20000 && this.first.getHitCounts() < 40000){
            System.out.println("Mức độ ưa thích: Phổ biến");
        }else{
            System.out.println("Empty");
        }
        this.rest.favouriteRate();
    }

    @Override
    public int laySoLuongBaiHat() {
        return 1 + this.rest.laySoLuongBaiHat();
    }

    @Override
    public int totalTime() {
        int min = this.first.getFile().getDuration().getMinute() + this.rest.totalTime();
        int sec = this.first.getFile().getDuration().getSecond() + this.rest.totalTime();
        return min*60 + sec;
    }

    @Override
    public String thisActor(String actor) {
        if(this.first.getSong().getActor().equals(actor)){
            return this.first.getSong().getTitle() + " ; " + this.rest.thisActor(actor);
        }else {
            return this.rest.thisActor(actor);
        }
    }




}
