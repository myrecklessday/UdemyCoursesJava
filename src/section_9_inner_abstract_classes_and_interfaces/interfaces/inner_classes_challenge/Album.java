package section_9_inner_abstract_classes_and_interfaces.interfaces.inner_classes_challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String albumName;
    private String artist;
    private SongList songList;
//    private ArrayList<Song> songs;

    public Album(String albumName, String artist){
        this.albumName = albumName;
        this.artist = artist;
        this.songList = new SongList();
//        this.songs = new ArrayList<Song>();
    }


    public boolean addSong(String title, double duration){
        return this.songList.add(new Song(title, duration));

//        if (findSong(title) == null){
//            songs.add(new Song(title, duration));
//            return true;
//        }
//        return false;
    }


    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
//        int index = trackNumber - 1;
//        if ((index >= 0)  && (index < songList.songs.size())){
//            playlist.add(songList.songs.get(index));
//            return true;
//        }
        Song foundSong = this.songList.findSong(trackNumber);
        if (foundSong != null) {
            playlist.add(foundSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song foundSong = this.songList.findSong(title);
        if (foundSong != null){
            playlist.add(foundSong);
            return true;
        }

        System.out.println("This album does not have a song with title " + title);
        return false;
    }


    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }


    private class SongList {

        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<Song>();
        }

        private Song findSong(String title){
            for (Song checkedSong: this.songs){
                if (checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < this.songs.size()){
                return songs.get(index);
            }
            return null;
        }

        public boolean add(Song song){
            if (songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

//        public boolean addSong(String title, double duration){
//            if (findSong(title) == null){
//                songs.add(new Song(title, duration));
//                return true;
//            }
//            return false;
//        }

    }


}
