package SongManagement;

import java.time.Duration;


public class SourceFile {
    private String fileName;
    private double size;
    private ClockTime duration;

    public SourceFile(String fileName, double size, ClockTime duration) {
        this.fileName = fileName;
        this.size = size;
        this.duration = duration;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public ClockTime getDuration() {
        return duration;
    }

    public void setDuration(ClockTime duration) {
        this.duration = duration;
    }

//    public boolean longerThan(SourceFile sourceFile){
//        int result = this.getDuration().compareTo(sourceFile.getDuration());
//        if(result<=0){
//
//            return false;
//        }else{
//            return true;
//        }
//    }

    public boolean longerThan(ClockTime clockTime){
        if(this.getDuration().getMinute() > clockTime.getMinute()){
            return true;
        }else if(this.getDuration().getMinute() == clockTime.getMinute()){
            if(this.getDuration().getSecond() > clockTime.getSecond()){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean longerThan1(SourceFile sourceFile){

        if(this.getDuration().getMinute() > sourceFile.getDuration().getMinute()){
            return true;
        }else if(this.getDuration().getMinute() == sourceFile.getDuration().getMinute()){
            if(this.getDuration().getSecond() > sourceFile.getDuration().getSecond()){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }
}
