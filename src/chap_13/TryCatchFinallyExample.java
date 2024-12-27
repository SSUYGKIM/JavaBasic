package chap_13;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try{
            Class clazz = Class.forName("String");
        } catch (ClassNotFoundException e) {                   // Class라는 클래스가 존재하지 않는 오류

            System.out.println("클래스가존재하지 않습니다.");
        } finally {
            System.out.println("프로그램이 종료됩니다.");
        }
    }

    // 클래스가존재하지 않습니다.
    // 프로그램이 종료됩니다.

}
