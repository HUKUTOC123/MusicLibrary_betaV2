package ForProject;

import ForProject.Recordlen;

public class Track {

String Track_name;
String Genre_Name;
int Track_number;
Recordlen Record_length;
String Album_title;
String Performer_Name;



public  Track(String Track_name,String Genre_Name, int Track_number, Recordlen Record_length,String Album_title,String Performer_Name ){
    this.Track_name=Track_name;
    this.Genre_Name=Genre_Name;
    this.Record_length=Record_length;
    this.Album_title=Album_title;
    this.Performer_Name=Performer_Name;
}

public String getTrack_name(){return  Track_name;}
public  void setTrack_name(String Track_name){this.Track_name=Track_name;}
public String getGenre_Name(){return Genre_Name;}
public  void setGenre_Name(String Genre_Name){this.Genre_Name=Genre_Name;}
public Recordlen getRecord_length(){return  Record_length;}
public  void setRecord_length(Recordlen Record_length){this.Record_length=Record_length;}
public String getAlbum_title(){return  Album_title;}
public void setAlbum_title(){this.Album_title=Album_title;}
public String getPerformer_Name(){return  Performer_Name;}
public void  setPerformer_Name(String Performer_Name){this.Performer_Name=Performer_Name;}

    public String toString(){
        StringBuffer str=new StringBuffer();
        str.append("Номер трека:\t")
                .append(Track_number+"\n")
                .append("Имя трека:\t")
                .append(Track_name+"\n")
                .append("Жанр:\t")
                .append(Genre_Name+"\n")
                .append("Имя исполнителя:\t")
                .append(Performer_Name+"\n")
                .append("Название альбома:\t")
                .append(Album_title+"\n")
                .append("Длина записи:\t")
                .append(Record_length.hour +"ч    "+Record_length.minute+"минут   "+Record_length.second+"    секунд"+"\n");

        return str.toString();
    }


    public static class Controller {
    }
}
