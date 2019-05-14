public class LazySingleton {
    private static LazySingleton instance;

    // Always keep constructor private to declare this class is a singleton
    private LazySingleton(){}

    // Only create new instance once called
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
