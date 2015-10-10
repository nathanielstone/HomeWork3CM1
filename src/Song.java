
public class Song {
    private String name;

    private String artist;

    private String album;

    private int duration;

    private String genre;

    Song(){


        numberOfSongs++;


    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getArtist() {

        return artist;

    }

    public void setArtist(String artist) {

        this.artist = artist;

    }

    public String getAlbum() {

        return album;

    }

    public void setAlbum(String album) {

        this.album = album;

    }

    public int getDuration() {

        return duration;

    }

    public void setDuration(String songTime) {

        duration = Integer.parseInt(songTime);

    }

    public String getGenre() {

        return genre;

    }

    public void setGenre(String genre) {

        this.genre = genre;

    }	private static int numberOfSongs;

    public static int getnumberOfSongs() {

        return numberOfSongs;

    }

    public void print(){


        System.out.println("Song Name:" + name);

        System.out.println("Artist Name:" + artist);

        System.out.println("Album Name:" + album);

        System.out.println("Song length:" + duration);

        System.out.println("Genre:" + genre);

    }
}
