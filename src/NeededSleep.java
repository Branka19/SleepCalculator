//This class should calculate when to wake up based on when I went to sleep.

//Ideas:
//Ask if it's enough if less than 7 hours.
//see how to regulate input for time.

import java.time.LocalTime;
import java.util.Scanner;

public class NeededSleep {

    public final Scanner scanner = new Scanner(System.in);

    //when I want to go to bed:
    public LocalTime getWentToBed()
    {
        System.out.println("I want to go to bed at (hh:mm):");
        LocalTime wentToBed = LocalTime.parse(scanner.nextLine());
        return wentToBed;
    }

    //how many hours of sleep I want:
    public String[] getHoursToSleep()
    {
        System.out.println("Hours I want to sleep (hh.00):");
        String hoursToSleep = scanner.nextLine();
        String[] nums = hoursToSleep.split("\\.");
        return nums;
    }

    //calculate when to wake up:
    public LocalTime whenToWakeUp(LocalTime wentToBed, String[] hoursOfSleep)
    {
        LocalTime wakeUpTime = wentToBed.plusHours(Long.parseLong(hoursOfSleep[0])).plusMinutes(Long.parseLong(hoursOfSleep[1]));
        System.out.println("I need to wake up at " + wakeUpTime + ".");
        return wakeUpTime;
    }
}
