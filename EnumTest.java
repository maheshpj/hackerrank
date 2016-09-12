package test;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(SomeStatus.CONTINUE);
        System.out.println(SomeStatus.CONTINUE.toString());
        System.out.println(SomeStatus.CONTINUE.name());
        System.out.println(SomeStatus.CONTINUE.value());
    }
}
