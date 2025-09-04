public class main <T> {
    T value;

    public  T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
    public static void main(String[] args) {
       main<String> print = new main<>();
       print.setValue("Hello");
        System.out.println(print.getValue());

    }
}
