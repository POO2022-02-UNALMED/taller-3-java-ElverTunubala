package taller3.televisores;
class TV {

    int channel = 1; // Default channel is 1
    int price;
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // By default TV is off
    static int num_tv = 0;
    Brand marca;

    TV() {
        
    }
    
    int getChannel(){
    	return channel;
    }
        
    TV(int cha, int vol) {
            this(cha, vol, true);
    }
    
    TV(int cha, int vol, boolean on) {
        channel=cha;
        volumeLevel=vol;
        this.on=on;
    }
    
    TV(Brand marca, int cha){
        //this.price=23;
        this(cha, 1, false);
        this.marca=marca;
    }
    
    int getPrice() {
        return price;
    }
    
    void setPrice(int price) {
        this.price = price;
    }
        
    void turnOn() {
        on = true;
    }
    
    void turnOff() {
        on = false;
    }
    
    void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }
    
    void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel < 7){
            volumeLevel = newVolumeLevel;
        }
    }
    
    void channelUp() {
        if (on && channel < 120){
            channel++;
        }
    }
    
    void channelDown() {
        if (on && channel > 1){
            channel--;
        }
    }
    
    void volumeUp() {
        if (on && volumeLevel < 7){
            volumeLevel++;
            }
    }
    
    void volumeDown() {
        if (on && volumeLevel > 1){
            volumeLevel--;
        }
    }

}