package nokia;
import java.util.Scanner;

public class Nokia3310 {
    static int menu;
    static int phoneBook;
    static int options;
    static int messages;
    static int set1;
    static int common;
    static int chat;
    static int callRegister;
    static int callDuration;
    static int showCallCost;
    static int callCostSetting;
    static int tones;
    static int Settings;
    static int CallSettings;
    static int PhoneSettings;
    static int SecuritySettings;
    static int RestoreFactorySettings;
    static int CallDivert;
    static int Games;
    static int Calculator;
    static int Reminders;
    static int Clock;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n", "Enter number 1 to go to main menu", "Enter 0 to go back");
        switch (menu) {
            case 1:
                switch (phoneBook) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos. 1");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b’card");
                        break;
                    case 8:
                        switch (options) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory status");
                                break;
                        }
                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                }
            case 2:
                System.out.println("Messages");
                switch (messages) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println(" Outbox");
                        break;
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Message setting");
                        switch (set1) {
                            case 1:
                                System.out.println("Message centre number");
                                break;
                            case 2:
                                System.out.println("Messages sent as");
                                break;
                            case 3:
                                System.out.println("Message validity");
                                break;
                        }
                        switch (common) {
                            case 1:
                                System.out.println("deliveryReports");
                                break;
                            case 2:
                                System.out.println("reply via same centre");
                                break;
                            case 3:
                                System.out.println("Character support");
                                break;
                        }
                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                }
            case 3:
                System.out.println("Service command editor");
                break;
            case 4:
                switch (callRegister) {
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        switch (callDuration) {
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls’ duration");
                                break;
                            case 3:
                                System.out.println("Received calls’ duration");
                                break;
                            case 4:
                                System.out.println("Dialled calls’ duration");
                                break;
                            case 5:
                                System.out.println("Clear timers");
                                break;
                        }
                    case 6:
                        switch (showCallCost) {
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls’ duration");
                                break;
                            case 3:
                                System.out.println("Received calls’ duration");
                                break;
                            case 4:
                                System.out.println("Dialled calls’ duration");
                                break;
                            case 5:
                                System.out.println("Clear timers");
                                break;
                        }
                    case 7:
                        switch (callCostSetting) {
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show costs in");
                                break;
                        }
                    case 8:
                        System.out.println("Show costs in");
                        break;
                }
            case 5:
                switch (tones) {
                    case 1:
                        System.out.println("Ringing tone");
                        break;
                    case 2:
                        System.out.println("Ringing volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("Warning and game tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                }
            case 6:
                switch (Settings) {
                    case 1:
                        switch (CallSettings) {
                            case 1:
                                System.out.println("Automatic redial");
                                break;
                            case 2:
                                System.out.println("Speed dialling");
                                break;
                            case 3:
                                System.out.println("Call waiting options");
                                break;
                            case 4:
                                System.out.println("Own number sending");
                                break;
                            case 5:
                                System.out.println("Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answ");
                                break;
                        }
                    case 2:
                        switch (PhoneSettings) {
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell info display");
                                break;
                            case 3:
                                System.out.println("Welcome note");
                                break;
                            case 4:
                                System.out.println(" Network Selection");
                                break;
                            case 5:
                                System.out.println("Lights 2");
                                break;
                            case 6:
                                System.out.println("Confirm SIM service actions");
                                break;
                        }
                    case 3:
                        switch (SecuritySettings) {
                            case 1:
                                System.out.println("PIN code request");
                                break;
                            case 2:
                                System.out.println("Call barring service");
                                break;
                            case 3:
                                System.out.println(" Fixed dialling");
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                break;
                            case 5:
                                System.out.println("Phone security");
                                break;
                            case 6:
                                System.out.println("Change access codes");
                                break;
                        }
                        switch (RestoreFactorySettings) {
                            case 1:
                        }
                }
                switch (CallDivert) {
                    case 1:
                }

                switch (Games) {
                    case 1:
                }

                switch (Calculator) {
                    case 1:
                }

                switch (Reminders) {
                    case 1:
                }

                switch (Clock) {
                    case 1:
                        System.out.println("Alarm clock");
                        break;
                    case 2:
                        System.out.println("Clock settings");
                        break;
                    case 3:
                        System.out.println("Date setting");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown timer");
                        break;
                    case 6:
                        System.out.println("Auto update of date and tim");
                        break;

                }
        }

    }
}



