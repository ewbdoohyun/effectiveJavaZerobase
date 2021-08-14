package example.chapter2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.expression.spel.ast.Elvis;
//
//public class Speaker {
//    private static Speaker instance;
//    private Speaker(){ }
//
//    public static synchronized Speaker getInstance(){
//        // 기타 다른 사항 체크
//        if(instance == null){
//            instance = new Speaker();
//        }
//        return instance;
//    }
//}


public enum Speaker{
    INSTANCE;
    private String message;
    public Speaker getInstance(){
        return INSTANCE;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
//
//public class Singleton {
//
//    private static Singleton singleton;
//
//    private Singleton(){ }
//
//    public static synchronized Singleton getInstance( ) {
//        if (singleton == null)
//            singleton=new Singleton();
//        return singleton;
//    }
//
//}