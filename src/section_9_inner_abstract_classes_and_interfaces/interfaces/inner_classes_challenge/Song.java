package section_9_inner_abstract_classes_and_interfaces.interfaces.inner_classes_challenge;

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
