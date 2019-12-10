import ForProject.Track;
import ForProject.TracksLib;

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Model implements Serializable {
    ArrayList<Track> TrackLib = new ArrayList<Track>();
    TracksLib library = new TracksLib("Музыкальная библиотека", TrackLib);

    public static Track inputTrack(Scanner in) {

        System.out.println("Введите номер трека");
        String Track_number = in.nextLine();
        System.out.println("Введите название трека");
        String Track_Name = in.nextLine();
        System.out.println("Введите название жанра:");
        String Genre_Name = in.nextLine();
        System.out.println("Введите имя исполнителя:");
        String Performer_Name = in.nextLine();
        System.out.println("Введите название альбома:");
        String Album_title = in.nextLine();
        System.out.println("Введите длительность трека");
        System.out.print("Минут: ");
        int minute = in.nextInt();
        System.out.print("Секунд: ");
        int second = in.nextInt();
        LocalTime Record_length = LocalTime.of(0, minute, second);
        Track track = new Track(Track_Name, Genre_Name, Track_number, Record_length, Album_title, Performer_Name);
        return track;
    }

    public static String inputPerformerName(Scanner in) {

        System.out.println("Введите  новое имя исполнителя:");
        String PerformerName = in.nextLine();
        return PerformerName;
    }

    public static String inputTrackName(Scanner in) {

        System.out.println("Введите  новое имя исполнителя:");
        String TrackName = in.nextLine();
        return TrackName;
    }

    public static String inputGenreName(Scanner in) {

        System.out.println("Введите  новое имя исполнителя:");
        String GenreName = in.nextLine();
        return GenreName;
    }

    public static String inputAlbumTitle(Scanner in) {

        System.out.println("Введите  новое название альбома:");
        String titleAlbum = in.nextLine();
        return titleAlbum;
    }

    public static int numberDeleteTrack(Scanner in) {
        System.out.println("Введите  новое название альбома:");
        int number = in.nextInt();
        return number;
    }

    public static void inputObjectToFile(ArrayList<Track> TracksList) {

        try {
            FileWriter writer = new FileWriter("output.txt");
            for (Track tracks : TracksList) {
                String nameTrack = tracks.getNameTrack();
                String nameGenre = tracks.getNameGenre();
                String numberTrack = tracks.getNumberTrack();
                int minute = tracks.getRecordLength().getMinute();
                String minute1 = String.valueOf(minute);
                int second = tracks.getRecordLength().getMinute();
                String second1 = String.valueOf(second);
                String titleAlbum = tracks.getTitleAlbum();
                String performerName = tracks.getPerformerName();
                /* String result = ("Номер: " + numberTrack + "|" + "Название :" + nameTrack + "|" + "Жанр:" + nameGenre + "|" + "Исполнитель:" + performerName + "|" + "Альбом:" + titleAlbum + "|" + "Длительность :" + hour1 + "часов ");*/
                String result = (numberTrack + "|" + nameTrack + "|" + nameGenre + "|" + performerName + "|" + titleAlbum + "|" + minute1 + "|" + second1 + System.getProperty("line.separator"));
                writer.write(result);
            }
            writer.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public static String readFromFile() {
        String s = "";
        StringBuilder str = null;
        try {
            Scanner in = new Scanner(new File("output.txt"));
            while (in.hasNext())
                s += in.nextLine();
            String[] data = s.split("|");
            String numberTrack = data[0];
            String nameTrack = data[1];
            String nameGenre = data[2];
            String performerName = data[3];
            String titleAlbum = data[4];
            String minute = data[5];
            String second = data[6];

            str = new StringBuilder();
            str.append("Номер трека:\t")
                    .append(numberTrack + "\n")
                    .append("Имя трека:\t")
                    .append(nameTrack + "\n")
                    .append("Жанр:\t")
                    .append(nameGenre + "\n")
                    .append("Имя исполнителя:\t")
                    .append(performerName + "\n")
                    .append("Название альбома:\t")
                    .append(titleAlbum + "\n")
                    .append("Длина записи:\t")
                    .append(minute + "   минут   " + second + "    секунд" + "\n");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public void addNewTrack() {
        Scanner in = new Scanner(System.in);
        library.createTrack(inputTrack(in));
        System.out.println("-----Трек успешно добавлен-----");
    }

    public void changePerformerName(int numTrack) {
        Scanner in1 = new Scanner(System.in);
        Track track1 = library.getTrack(numTrack);
        track1.setPerformerName(inputPerformerName(in1));
        System.out.println("Элемент успешно изменен \n" +
                "------------------------------------------");
    }

    public void changeTrackName(int numTrack) {
        Scanner in1 = new Scanner(System.in);
        Track track1 = library.getTrack(numTrack);
        track1.setNameTrack(inputTrackName(in1));
        System.out.println("Элемент успешно изменен \n" +
                "------------------------------------------");
    }

    public void changeGenreName(int numTrack) {
        Scanner in1 = new Scanner(System.in);
        Track track1 = library.getTrack(numTrack);
        track1.setNameGenre(inputGenreName(in1));
        System.out.println("Элемент успешно изменен \n" +
                "------------------------------------------");
    }

    public void changeAlbumName(int numTrack) {
        Scanner in1 = new Scanner(System.in);
        Track track1 = library.getTrack(numTrack);
        track1.setAlbumTitle(inputAlbumTitle(in1));
    }

    public void deleteTrack() {
        Scanner in = new Scanner(System.in);
        int number = numberDeleteTrack(in);
        library.deleteTrack(number);
        System.out.println("-----Трек был удален-----");
    }

}

    /*public  void serialisationTrackLib( ArrayList<Track> TracksList)  {
        try{
            FileOutputStream fos= new FileOutputStream("file.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(TracksList);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }*/

    /*public  void deserialisationTrackLib() {
        ArrayList<Track> newTrackList= new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            newTrackList = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        for(Track tmp: newTrackList){
            System.out.println(tmp);
        }
    }*/
   /* public static boolean hasDuplicates(ArrayList<Track> TracksList) {
        for (Track track : TracksList)
        for (int i=0; i<TracksList.size(); i++) {
            Track firstPlaceCell = TracksList.get(i);
            for (int j=i+1; j<TracksList.size(); j++) {
                Track secondPlaceCell = TracksList.get(j);
                if (firstPlaceCell.getNameTrack() == secondPlaceCell.getNameTrack()
                        && firstPlaceCell.getNameGenre() == secondPlaceCell.getNameGenre()) {
                    return true;
                }
            }
        }
        return false;
    }
*/
