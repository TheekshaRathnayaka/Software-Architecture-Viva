public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        // print logic
        System.out.println("Hello World from Singleton!");
    }


    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        
        singleton.showMessage();
    }
}

