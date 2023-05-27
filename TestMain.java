package SongManagement;

import com.sun.security.jgss.GSSUtil;

import java.time.Duration;

public class TestMain {
    public static void main(String[] args) {
        ClockTime clockTime1 = new ClockTime(4,30);
        ClockTime clockTime2 = new ClockTime(5,20);
        ClockTime clockTime3 = new ClockTime(7,10);
        ClockTime clockTime4 = new ClockTime(2,50);
        ClockTime clockTime5 = new ClockTime(2,40);


//        Duration duration1 = Duration.parse("PT4M40S");
//        Duration duration2 = Duration.parse("PT5M10S");
//        Duration duration3 = Duration.parse("PT6M50S");
//        Duration duration4 = Duration.parse("PT2M30S");

        Song song1 = new Song("Bai hat 1","ballad","Dat2");
        Song song2 = new Song("Bai hat 2","rock","Dat2");
        Song song3 = new Song("Bai hat 3","jazz","Dat3");
        Song song4 = new Song("Bai hat 4","jazz","Dat4");

        SourceFile sourceFile1 = new SourceFile("mp1",2343,clockTime1);
        SourceFile sourceFile2 = new SourceFile("mp2",2343,clockTime2);
        SourceFile sourceFile3 = new SourceFile("mp3",2343,clockTime3);
        SourceFile sourceFile4 = new SourceFile("mp4",2343,clockTime4);

        MusicItem musicItem1 = new MusicItem(song1, sourceFile1, 32000, "Tuan1");
        MusicItem musicItem2 = new MusicItem(song2, sourceFile2, 433300, "Tuan2");
        MusicItem musicItem3 = new MusicItem(song3, sourceFile3, 33300, "Tuan3");
        MusicItem musicItem4 = new MusicItem(song4, sourceFile4, 2200, "Tuan4");

        MTMusicItem mtMusicItem = new MTMusicItem();
        ConsMusicItem consMusicItem1 = new ConsMusicItem(musicItem1, mtMusicItem);
        ConsMusicItem consMusicItem2 = new ConsMusicItem(musicItem2, consMusicItem1);
        ConsMusicItem consMusicItem3 = new ConsMusicItem(musicItem3, consMusicItem2);
        ConsMusicItem consMusicItem4 = new ConsMusicItem(musicItem4, consMusicItem3);

        Album album1 = new Album("Love",2000, consMusicItem3);

        CompilationAlbum compilationAlbum1 = new CompilationAlbum("Love", 2000, consMusicItem3);

        OneSingerAlbum oneSingerAlbum1 = new OneSingerAlbum("History", 1000, consMusicItem2, "Dat");

        // B
        System.out.println(musicItem4.moreFavouriteThan(musicItem2));
        // C
        System.out.println(musicItem4.longerThan(clockTime5));
        // D
        consMusicItem4.favouriteRate();

        // E
        System.out.println("Số lượng bản nhạc trong danh sach: " + consMusicItem4.laySoLuongBaiHat());

        System.out.println("Số lượng bản nhạc trong album tổng hợp: " + compilationAlbum1.howMany());
        System.out.println("Số lượng bản nhạc trong album một ca sỹ: " + oneSingerAlbum1.howMany());
        // H

        System.out.println("tổng thời gian các bài hát: " + consMusicItem2.totalTime());
        // G
        System.out.println(compilationAlbum1.thisActorAfter("Dat2"));
    }

}
