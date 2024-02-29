package strukdat;

class Box<T>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();

        integerBox.setValue(42);
        int intvalue = integerBox.getValue();
        System.out.println("Integer value : " +intvalue);

        Box<String> stringBox = new Box<>();

        stringBox.setValue("Hello Generics!");
        String strvalue = stringBox.getValue();
        System.out.println("String value: " +strvalue);
    }
}