import java.io.FileNotFoundException;
import java.util.Scanner;



public class Homework3 {

    public static void main(String[] args) throws FileNotFoundException {






//Create Music Library Object

        MusicLibrary Music = new MusicLibrary();

        Scanner scnr = new Scanner(System.in);

        System.out.println("Input a file name: ");

        String fileName = scnr.nextLine();

        Music.readMusicLibrary(fileName);

        Scanner scnrr = new Scanner(System.in);

        boolean x = true;

        while (x){

            System.out.println("Enter a song to search: ");

            String songName = scnrr.nextLine();

            Song S = Music.getSong(songName);

            S.print();

        }


    }




}
