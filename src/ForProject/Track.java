package ForProject;

import java.io.Serializable;
import java.time.LocalTime;

public class Track implements Serializable {

    String nameTrack;
    String nameGenre;
    String numberTrack;
    LocalTime recordLength;
    String titleAlbum;
    String performerName;


    public Track(String nameTrack, String nameGenre, String numberTrack, LocalTime recordLength, String titleAlbum, String performerName) {
        this.numberTrack = numberTrack;
        this.nameTrack = nameTrack;
        this.nameGenre = nameGenre;
        this.recordLength = recordLength;
        this.titleAlbum = titleAlbum;
        this.performerName = performerName;
    }

    public String getNameTrack() {
        return nameTrack;
    }

    public void setNameTrack(String Track_name) {
        this.nameTrack = Track_name;
    }

    public String getNameGenre() {
        return nameGenre;
    }

    public void setNameGenre(String Genre_Name) {
        this.nameGenre = Genre_Name;
    }

    public LocalTime getRecordLength() {
        return recordLength;
    }

    public void setRecordLength(LocalTime Record_length) {
        this.recordLength = Record_length;
    }

    public String getTitleAlbum() {
        return titleAlbum;
    }

    public void setAlbumTitle(String s) {
        this.titleAlbum = titleAlbum;
    }

    public String getPerformerName() {
        return performerName;
    }

    public void setPerformerName(String Performer_Name) {
        this.performerName = Performer_Name;
    }

    public String getNumberTrack() {
        return numberTrack;
    }

    public void setNumberTrack() {
        this.numberTrack = numberTrack;
    }

    /*public String toString(){*/
       /* StringBuilder str = new StringBuilder();
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
                .append(recordLength.getMinute() + "   минут   " + recordLength.getSecond() + "    секунд" + "\n");*/

    /*return str.toString();*/
    }



