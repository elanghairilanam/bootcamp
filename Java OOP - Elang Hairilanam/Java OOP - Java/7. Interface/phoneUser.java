import Interface.Phone;

public class phoneUser {
    Phone phone;

    public phoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone(){
        this.phone.powerOn();
    }

    public void turnOffThePhone(){
        this.phone.powerOff();
    }

    public void makePhoneLouder(){
        this.phone.volumeUp();
    }

    public void makePhoneSilent(){
        this.phone.volumeDown();
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
