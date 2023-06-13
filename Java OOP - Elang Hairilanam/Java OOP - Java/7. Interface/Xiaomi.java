import Interface.Phone;

public class Xiaomi implements Phone {

    private int volume;
    private boolean isPowerOn;


    public Xiaomi() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {

        isPowerOn = true;
        System.out.println("\nHp menyala....");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android versi 10");

    }

    @Override
    public void powerOff() {

        isPowerOn = false;
        System.out.println("\nHp dinonaktifkan");

    }

    @Override
    public void volumeUp() {
        if (isPowerOn){
            if (this.volume == MAX_VOLUME){
                System.out.println("Volume sudah maksimal!!!");
                System.out.println("Volume = "+this.volume+"%");
            }else {
                this.volume += 10;
                System.out.println("\nVolume sekarang "+this.volume);
            }
        }else {
            System.out.println("\nTolong aktifkan hp");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn){
            if (this.volume == MIN_VOLUME){
                System.out.println("Volume sudah tidak bisa di kurangi");
                System.out.println("Volume = "+this.volume+"%");
            }else {
                this.volume -= 10;
                System.out.println("\nVolume sekarang "+this.volume);
            }
        }else {
            System.out.println("\nTolong aktifkan hp");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }
}
