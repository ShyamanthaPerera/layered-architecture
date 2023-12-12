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
}
