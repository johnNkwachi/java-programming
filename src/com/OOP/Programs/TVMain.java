package Com.OOP.Programs;

public class TVMain {
    public static void  main(String[] args) {

        Tv tv1 = new Tv("Wazobia");
        tv1.turnOn();
        tv1.setChannel(111);
        tv1.setVolumeLevel(5);


        Tv tv2 = new Tv("African magic");
        tv2.turnOn();
        tv2.setChannel(5);
        tv1.setVolumeLevel(7);

        System.out.println("tv1 channel is " + tv1.channel + "  and volumelevel is " + tv1.volumeLevel);
        System.out.println("tv2 channel is " + tv2.channel + "  and volumelevel is " + tv2.volumeLevel);
    }





}



