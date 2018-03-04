package create.SingletonPattern;

public class Test {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.doSomeThing();
    }
}
