package lk.ijse;

public class Boy {

    Agreement agreement;

    public Boy(Agreement a){
        this.agreement = a;
    }

    public Boy(){

    }

    public void chatWithGirl(){
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy=new Boy(new Girl());
        boy.chatWithGirl();
    }
}
