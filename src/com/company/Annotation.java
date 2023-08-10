package com.company;
class KeyPadPhone{
    @Deprecated
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
}

//@FunctionalInterface
//interface myFunctionalInterface {
//    void method1();
//    void methodd2();
//}
//// Error aayega because ek interface me ek se jyada abstract members h
public class Annotation{
    public static void main(String args[]){
        @SuppressWarnings("deprecation")
        AndroidPhone Samsung = new AndroidPhone();
        Samsung.sendMessage();
    }
}
