import java.io.FileNotFoundException;
import java.util.Scanner;


public class MusicLibrary {
    private int numberOfSongs;

    private String Song[];

    MusicLibrary(){



    }

//gets file address and reads it

    public void readMusicLibrary(String fileName)

            throws FileNotFoundException {

//gets file address

        File inputFile = new File("fileName.txt");

        Scanner file = new Scanner(inputFile);

        int numberOfSongs = 0;

        while(file.hasNextLine()){


            String line = file.nextLine();

            String s = line;

            String[] arry = s.split(",");

            Song = arry.clone();

            numberOfSongs++;

        }


    }


    public Song getSong(String songName){

        Song s1 = new Song();

        for (int i = 0; i < Song.length; i++) {


            if (songName.equalsIgnoreCase(Song[i])) {


                s1.setName(Song[i]);

                s1.setArtist(Song[i+1]);

                s1.setAlbum(Song[i+2]);

                s1.setDuration(Song[i+3]);

                s1.setGenre(Song[i+4]);

                return s1;


            }
            System.out.println("hello0");



        }




        return null;

    }

}
