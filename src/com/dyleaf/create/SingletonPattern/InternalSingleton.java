package create.SingletonPattern;

class InternalSingleton {
    private static class SingletonHolder {
        private final static InternalSingleton INSTANCE = new InternalSingleton();
    }

    private InternalSingleton() {
    }

    public static InternalSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
