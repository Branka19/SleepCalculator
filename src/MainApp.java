import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        //choosing a local time:
        CurrentTime time = new CurrentTime();
        LocalTime currentTime = time.getCurrentTime(); //SERBIA: 14:52

        HoursSlept hoursSlept = new HoursSlept();
        LocalTime waky = hoursSlept.wentToBed();
        LocalTime asleep = hoursSlept.wokeUp();
        hoursSlept.hoursSlept(waky, asleep);

        NeededSleep neededSleep = new NeededSleep();
        LocalTime bedTime = neededSleep.getWentToBed();
        int sleep = neededSleep.getHoursToSleep();
        neededSleep.whenToWakeUp(bedTime, sleep);
    }

}