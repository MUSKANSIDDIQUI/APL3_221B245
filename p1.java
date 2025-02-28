class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

public class p1 {
    public static void main(String[] args) {
        LazySingleton obj = LazySingleton.getInstance();
        System.out.println("Lazy Singleton Instance Created!");
    }
}
