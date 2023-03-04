package Chapter7;

public class TvMain {
    public static void main(String[] args) {
        Tv sharp = new Tv();

        sharp.turnOn();
        System.out.println("Channel increased " +sharp.getNumberOfChannelIncreases()+ " times.");
        sharp.setChannel(3);
        sharp.setVolume(6);
        sharp.channelUp();
        sharp.channelUp();
        sharp.setChannel(65);
        System.out.println("Channel increased " +sharp.getNumberOfChannelIncreases()+ " times.");
        sharp.channelDown();
        sharp.volumeDown();
//        sharp.turnOff();
//        sharp.setVolume(10);
    }
}
