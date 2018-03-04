package behavior.CommandPattern;

//命令接收者Receiver
public class Tv {
    public int currentChannel = 0;


    public void turnOn() {
        System.out.println("The televisino is on.");
    }


    public void turnOff() {
        System.out.println("The television is off.");
    }

    public void changeChannel(int channel) {
        this.currentChannel = channel;
        System.out.println("Now Tv channel is " + channel);
    }
}