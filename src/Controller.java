import ForProject.Recordlen;
import ForProject.Track;
import ForProject.TracksLib;

import java.io.*;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {

    public static Track inputTrack(Scanner in) {

        System.out.println("Введите название трека");
        String Track_Name = in.nextLine();
        System.out.println("Введите название жанра:");
        String Genre_Name = in.nextLine();
        System.out.println("Введите имя исполнителя:");
        String Performer_Name = in.nextLine();
        System.out.println("Введите название альбома:");
        String Album_title = in.nextLine();
        System.out.print("Введите номер трека");
        int Track_number = in.nextInt();
        System.out.println("Введите длительность трека");
        System.out.print("Часов: ");
        int hour = in.nextInt();
        System.out.print("Минут: ");
        int minute = in.nextInt();
        System.out.print("Секунд: ");
        int second = in.nextInt();
        Recordlen Record_length = new Recordlen(hour, minute, second);
        Track track = new Track(Track_Name, Genre_Name, Track_number, Record_length, Album_title, Performer_Name);
        return track;
    }

    public static void serialisationTrackLib(OutputStream out, LinkedList<Track> linkedListTask) throws IOException {
        ObjectOutputStream objectOut = new ObjectOutputStream(out);
        objectOut.writeObject(linkedListTask);
    }

    public static LinkedList<Track> deserialisationTrackLib(InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream objectIn = new ObjectInputStream(in);
        return (LinkedList<Track>) objectIn.readObject();
    }
}