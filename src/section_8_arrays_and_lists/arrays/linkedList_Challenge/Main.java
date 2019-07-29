package section_8_arrays_and_lists.arrays.linkedList_Challenge;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Greatest hits", "Green Day");
        album.addSong("American idiot", 3.05);
        album.addSong("Boulevard of broken dreams", 3.5);
        album.addSong("Holiday", 2.95);
        album.addSong("Jesus of Suburbia", 8.9);
        album.addSong("Know your enemy", 3.12);
        album.addSong("21 guns", 3.23);
        album.addSong("Time of your life", 2.89);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("Let's go", 3.45);
        album.addSong("Snowballed", 4.51);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Evil walks", 3.45);
        album.addSong("Breaking the rules", 5.32);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("21 guns", playlist);
        albums.get(0).addToPlaylist("Holiday", playlist);
        albums.get(0).addToPlaylist("Oh love", playlist);
        albums.get(0).addToPlaylist(7, playlist);


    }


}
