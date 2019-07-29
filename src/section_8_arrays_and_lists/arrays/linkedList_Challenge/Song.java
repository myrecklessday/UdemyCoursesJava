package section_8_arrays_and_lists.arrays.linkedList_Challenge;

import java.util.List;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration){

        this.title = title;
        this.duration = duration;
    }

//    public Song createSong(){
//        return new Song()
//    }

    public String getTitle(){
        return title;
    }

    public double getDuration(){
        return duration;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDuration(double duration){
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
