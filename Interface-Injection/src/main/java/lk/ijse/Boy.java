package lk.ijse;

public class Boy implements II{

    Agreement agreement;

    public void chatWithGirl(){
        agreement.chat();
    }

    public void inject(Agreement a){
        this.agreement = a;
    }
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.inject(new Girl());
        boy.chatWithGirl();
    }
}
