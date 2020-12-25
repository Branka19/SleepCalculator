import java.time.LocalTime;


public class MainApp {

    public static void main(String[] args) {

        //choosing a local time:
        CurrentTime time = new CurrentTime();
        time.getCurrentTime(); //SERBIA: 14:52

        //Calculating hours slept:
        HoursSlept hoursSlept = new HoursSlept();
        LocalTime waky = hoursSlept.wentToBed();
        LocalTime asleep = hoursSlept.wokeUp();
        hoursSlept.hoursSlept(waky, asleep);

        //Calculating needed sleep:
        NeededSleep neededSleep = new NeededSleep();
        LocalTime bedTime = neededSleep.getWentToBed();
        String[] sleep = neededSleep.getHoursToSleep();
        neededSleep.whenToWakeUp(bedTime, sleep);
    }

}