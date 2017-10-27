package lesson4.tv;

public class TVRemoteControl {

    private TV tv;

    public TVRemoteControl(TV tv){
        connect(tv);
    }

    public TVRemoteControl(){}

    public void disconnect(){
        this.tv = null;
    }

    public void connect(TV tv){
        if (tv != null) {
            this.tv = tv;
        }
    }

    public void switchChannelUp(){
        if (tv != null) {
            tv.switchChannelUp();
        }
    }

    public void switchChannelDown(){
        if (tv != null){
            tv.turnVolumeDown();
        }
    }

    public void turnVolumeUp(){
        if (tv != null){
            tv.turnVolumeUp();
        }
    }

    public void turnVolumeDown(){
        if (tv != null){
            tv.turnVolumeDown();
        }
    }

    public void setChannel(int channel){
        if (tv != null){
            tv.setChannel(channel);
        }
    }
}
