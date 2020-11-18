public class DesignPatterns {
    private static DesignPatterns instance =new DesignPatterns();

    private DesignPatterns(){}

    public static DesignPatterns getInstance() {
        return instance;
    }

    public void message(){
        System.out.println("SingleObject Example");
    }

    public static void main(String[] args){
        DesignPatterns object=DesignPatterns.getInstance();
        object.message();
    }
}
