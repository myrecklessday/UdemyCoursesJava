package section_8_arrays_and_lists.arrays.linkedList_Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String albumName;
    private String artist;
//    private LinkedList<Song> songsList;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist){
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String title){
//        for (int i = 0; i < songs.size(); i++){
//            Song checkedSong = songs.get(i);
//            if (checkedSong.getTitle().equals(title)){
//                return checkedSong;
//            }
//        }
        for (Song checkedSong: this.songs){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if ((index >= 0)  && (index < songs.size())){
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song foundSong = findSong(title);
        if (foundSong != null){
            playlist.add(foundSong);
            return true;
        }
        System.out.println("This album does not have a song with title " + title);
        return false;
    }

//    public Album findAlbumByName(String albumName){
//        for (int i = 0; i < albumArrayList.size(); i++){
//            if (albumArrayList.get(i).getAlbumName().equals(albumName)){
//                return albumArrayList.get(i);
//            }
//        }
//        return null;
//    }
//
//    public void addSongToAlbum(String song, String albumName){
//        Album foundAlbum = findAlbumByName(albumName);
//        if (foundAlbum != null){
//            albumArrayList.add()
//        }
//
//    }


    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

}
