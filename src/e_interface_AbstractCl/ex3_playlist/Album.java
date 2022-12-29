package e_interface_AbstractCl.ex3_playlist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new e_interface_AbstractCl.ex3_playlist.Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<e_interface_AbstractCl.ex3_playlist.Song> playList) {
        e_interface_AbstractCl.ex3_playlist.Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<e_interface_AbstractCl.ex3_playlist.Song> playList) {
        e_interface_AbstractCl.ex3_playlist.Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<e_interface_AbstractCl.ex3_playlist.Song> songs;

        public SongList() {
            this.songs = new ArrayList<e_interface_AbstractCl.ex3_playlist.Song>();
        }

        public boolean add(e_interface_AbstractCl.ex3_playlist.Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private e_interface_AbstractCl.ex3_playlist.Song findSong(String title) {
            for(e_interface_AbstractCl.ex3_playlist.Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public e_interface_AbstractCl.ex3_playlist.Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index > 0) && (index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
