package lesson4.tv;

public class TV {

    private int diagonal;
    private String model;
    private int channelCount;
    private int currentChannel;
    private int currentVolume;

    public TV(int diagonal, String model, int channelCount){
        this.diagonal = diagonal;
        this.model = model;
        this.channelCount = channelCount;
        this.currentChannel = 1;
    }

    public void switchChannelUp(){
        if (currentChannel < channelCount){
            currentChannel++;
        } else {
            currentChannel = 1;
        }
        System.out.println("Channel = " + currentChannel);
    }

    public void switchChannelDown(){
        if (currentChannel > 1){
            currentChannel--;
        } else {
            currentChannel = channelCount;
        }
        System.out.println("Channel = " + currentChannel);
    }

    public void turnVolumeUp(){
        if (currentVolume < 100){
            currentVolume++;
        }
        System.out.println("Volume = " + currentVolume);
    }

    public void turnVolumeDown(){
        if (currentVolume > 0){
            currentVolume--;
        }
        System.out.println("Volume = " + currentVolume);
    }

    public void setChannel(int channel){
        if (channel > 1 && channel <= channelCount){
            currentChannel = channel;
        }
        System.out.println("Channel = " + currentChannel);
    }

    public String toString(){
        return "TV model = " + model
                + " diagonal = " + diagonal
                + " channel count = " + channelCount;
    }

}
