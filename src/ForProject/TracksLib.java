package ForProject;

import java.io.Serializable;
import java.util.ArrayList;


public class TracksLib implements Serializable {
    private String name;
    private ArrayList<Track> tracksList = new ArrayList<Track>();

    public TracksLib(String name, ArrayList<Track> tracksList) {
        this.name=name;
        this.tracksList = tracksList;
    }
    public String getName(){return name;}
    public void setName(){this.name=name;}
    public Track[] getTracks(){
        Track[] array = new Track[tracksList.size()];
        for(int i=0;i<array.length; i++){
            array[i] = tracksList.get(i);
        }
        return array;
    }

    public ArrayList<Track> getTracksList() {
        return tracksList;
    }
    //создание
    public void createTrack(Track track) {
        tracksList.add(track);
    }
    //удаление
    public void deleteTrack(int num) {
        tracksList.remove(num);
    }
    //изменение
    public void setTrack(int index, Track tracks_list) {
        tracksList.set(index, tracks_list);
    }

    public Track getTrack(int index) {
        return tracksList.get(index);
    }
    //представление чеез массив
    public Track[] getTrackLib() {
        Track[] array = new Track[tracksList.size()];
        for(int i=0;i<array.length; i++){
            array[i] = tracksList.get(i);
        }
        return array;
    }
    //просмотр
    public String toString() {
        StringBuilder str = new StringBuilder();
        int i = 0;
        if (tracksList != null) {
            for (Track element : tracksList) {
                str.append(i + ".\t")
                        .append(element.toString() + "\n");
                i++;
            }
        }
        return str.toString();
    }


}