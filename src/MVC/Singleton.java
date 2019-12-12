package MVC;

public class Singleton {
    private static Model instance;

    private Singleton() {
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

}
