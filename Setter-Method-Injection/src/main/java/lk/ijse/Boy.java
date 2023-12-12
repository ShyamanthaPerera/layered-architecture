package lk.ijse;

public class Boy {

    Agreement agreement;

    public void setter(Agreement a){
        this.agreement = a;
    }

    public void chatWithGirl(){
        agreement.chat();
    }
}
