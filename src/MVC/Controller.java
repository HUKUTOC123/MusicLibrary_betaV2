package MVC;

import ForProject.Track;
import ForProject.TracksLib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements Serializable {

    public void mainMenu() {
        ArrayList<Track> TrackLib = new ArrayList<Track>();
        TracksLib library = new TracksLib("Музыкальня библиотека", TrackLib);
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            View.printMain();
            switch (in.nextLine()) {
                case "1":
                    createMenu(library);
                    Model.inputObjectToFile(TrackLib);
                    break;
                case "2":
                    deleteMenu(library);
                    break;
                case "3":
                    setMenu();
                    exitMainMenu(in);
                    break;
                case "4":


                    exitMainMenu(in);
                    break;
                case "5":
                    System.out.println("Введите имя для поиска");
                    String nameCheck = in.nextLine();
                    Model.checkName(nameCheck);
                    exitMainMenu(in);
                    break;
                case "6":

                    exit = true;
                    break;
                default:
                    System.out.println("Неверно веденный символ\n" +
                            "-----------------------------------------");
                    break;
            }
        }
    }


    private void createMenu(TracksLib library) {
        Scanner in = new Scanner(System.in);
        boolean exitCreateMenu = false;
        View.printAdd();
        String str = in.nextLine();
        switch (str) {
            case "1":

                while (!exitCreateMenu) {
                    try {

                        library.createTrack(Model.inputTrack(in));

                        exitCreateMenu = true;
                    } catch (Exception e) {

                        System.err.println("Неверно введенный символ " + e.getMessage());
                    }
                }


                break;
            case "2":
                break;
            default:
                System.out.println("Неверно введенный символ\n" +
                        "----------------------------------------");
                break;
        }
    }

    private void deleteMenu(TracksLib manager) {
        Scanner in = new Scanner(System.in);
        boolean exitCreateMenu = false;
        View.printDelete();
        String str = in.nextLine();
        switch (str) {
            case "1":
                while (!exitCreateMenu) {
                    try {
                        Model.readFromFile();
                        System.out.println("Введите номер удаляемого трека");
                        String number = in.nextLine();
                        Model.deleteTrack(number);
                        exitCreateMenu = true;
                    } catch (Exception e) {

                        System.err.println("Неверно введенный символ " + e.getMessage());
                        in.nextLine();
                    }
                }
                break;
            case "2":
                break;
            default:
                System.out.println("Неверно введенный символ\n" +
                        "--------------------------------------------");
                break;
        }
    }

    private void exitMainMenu(Scanner in) {
        View.printExit();
        String q = in.nextLine();
        switch (q) {
            case "1":
                break;
            default:
                System.out.println("Неверно введенный символ");
                break;
        }
    }

    private void setMenu() {
        Scanner in = new Scanner(System.in);
        boolean exitCreateMenu = false;
        View.printSet();
        String str = in.nextLine();
        switch (str) {
            case "1":

                while (!exitCreateMenu) {
                    try {
                        Model.readFromFile();
                        System.out.println("Введите номер трека, который хотите изменить:");
                        String num = in.nextLine();
                        View.setEdit();
                        Scanner inn = new Scanner(System.in);
                        String str2 = inn.nextLine();
                        switch (str2) {
                            case "1":
                                Singleton.getInstance().changeTrackName(num);
                                break;
                            case "2":

                                break;
                            case "3":

                                break;
                        }


                        System.out.println("Элемент успешно изменен \n" +
                                "------------------------------------------");
                        exitCreateMenu = true;
                    } catch (Exception e) {

                        System.err.println("Невверно введенный символ " + e.getMessage());
                        in.nextLine();
                    }
                }
                break;
            case "2":
                break;
            default:
                System.out.println("Неверно введенный символ\n" +
                        "--------------------------------------------");
                break;
        }
    }


}

