package Com.OOP.Programs;
///
public class Tv{
 private String name;
  int channel = 1;
  int volumeLevel = 1;
 private boolean on;


    public Tv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    public void setVolumeLevel(int newVolume){
        if(on && newVolume >= 1 && newVolume <+120){
            volumeLevel = newVolume;
        }
    }

    public void channelUp(){
        if(on && channel < 120)
            channel++;
    }

    public void channelDown(){
        if(on && channel > 1)
            channel--;
    }
    public void volumelUp(){
        if(on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeldown(){
        if(on && volumeLevel > 1)
            volumeLevel--;
    }
}
//
//
//
//
//
//
//channel: int
//        volumeLevel: int
//        The + sign indicates
//public modifier
//        The current channel (1 to 120) of this TV.
//       on: boolean The current volume level (1 to 7) of this TV.
//        Indicates whether this TV is on/off.
//        +TV()
//        +turnOn(): void
//        +turnOff(): void Constructs a default TV object.
//        Turns on this TV.
//        Turns off this TV.
//        +setChannel(newChannel: int): void
//        +setVolume(newVolumeLevel: int): void
//        +channelUp(): void Sets a new channel for this TV.
//        Sets a new volume level for this TV.
//        Increases the channel number by 1.
//        Decreases the channel number by 1.
//        +channelDown(): void
//        +volumeUp(): void
//        +volumeDown(): void