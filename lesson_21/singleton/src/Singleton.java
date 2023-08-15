public class Singleton {
    public static final String MESSAGE = "this is singleton pattern";
    private static Singleton INSTANCE = null;
    public int temp;

    private Singleton(){

    }

    public static Singleton getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void print(){
        System.out.println(MESSAGE);
        System.out.println(temp);
    }
}
