package Chapter7;

public class Tv {
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;
    private static int numberOfChannelIncreases;

    public void turnOn(){
        on = true;
        System.out.println("Television is on.");
    }
    public boolean turnOff(){
        System.out.println("Television is off");
        return on;
    }
    public void setChannel(int newChannel) {
        if(on && newChannel >= 1 && newChannel <= 100) {
            channel = newChannel;
        }
        System.out.println("Channel is " + channel);
    }
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 50) {
            volumeLevel = newVolumeLevel;
        }
        System.out.println("Volume is " + volumeLevel);
    }
    public void channelUp() {
        if (on && channel>=1){ channel++; }
        numberOfChannelIncreases++;
        System.out.println("New channel is " + channel);
             }
    public void channelDown(){
        if (on && channel<=120) {channel--; }
        System.out.println("New channel is " + channel);
            }
    public void volumeUp() {
        if (on && volumeLevel >= 1) {volumeLevel++; }
        System.out.println("New volume is " + volumeLevel);
            }
    public void volumeDown(){
        if ( on && volumeLevel <= 120 ) {volumeLevel--; }
        System.out.println("New volume is " + volumeLevel);
            }

    public int getNumberOfChannelIncreases(){
        return numberOfChannelIncreases;
    }
}
