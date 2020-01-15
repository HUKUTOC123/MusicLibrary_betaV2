package MVC;

public class View {

    public static void printMain() {
        System.out.println("\t\tГлавное меню:\n" +
                "-------------------------------------------------\n" +
                "1.Добавить трек;\n" +
                "2.Удалить трек;\n" +
                "3.Изменить трек;\n" +
                "4.Просмотр треков;\n" +
                "5.Поиск треков по имени;\n" +
                "6.Выход.\n");
    }

    public static void printAdd() {
        System.out.println(
                "1.Начать добавление трека;\n" +
                        "2.Назад;\n");
    }

    public static void printDelete() {
        System.out.println(
                "1.Удалить трек;\n" +
                        "2.Назад;\n");
    }

    public static void printExit() {
        System.out.println("\n" +
                "Чтобы выйти в главное меню нажмите 1");
    }

    public static void printSet() {
        System.out.println(
                "1.Изменить трек;\n" +
                        "2.Назад;\n");
    }

    public static void setEdit() {
        System.out.println("\n 1.Изменить название трека\n " +
                "\n 2.Изменить имя исполнителя\n " +
                "\n 3.Изменить название жанра\n" +
                "\n 4.Изменить название альбома\n") ;
    }


}



