package lk.ijse;

public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.inject(new Girl());
        boy.chatWithGirl();
    }
}
