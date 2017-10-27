package lesson4.tv;

public class TVTest {

    public static void main(String[] args) {
        TV tv = new TV(32, "LG-34464", 3);
        TVRemoteControl tvRemoteControl = new TVRemoteControl(tv);
        tvRemoteControl.switchChannelUp();
        tvRemoteControl.disconnect();
        tvRemoteControl.switchChannelUp();
    }

}
