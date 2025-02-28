class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}

public class p2 {
    public static void main(String[] args) {
        EagerSingleton obj = EagerSingleton.getInstance();
        System.out.println("Eager Singleton Instance Created!");
    }
}
