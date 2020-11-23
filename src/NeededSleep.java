//This class should calculate when to wake up based on when I went to sleep.

//Ideas:
//Ask if it's enough if less than 7 hours.
//see how to regulate input for time.
//Add minutes to wished sleep? not only hours like sleep 8.30min (doubles - minutes?)


import java.time.LocalTime;
import java.util.Scanner;
import java.util.*;
import java.time.*;
import java.text.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class NeededSleep {

    public final Scanner scanner = new Scanner(System.in);

    //when I want to go to bed:
    public LocalTime getWentToBed()
    {
       System.out.println("");
        System.out.println("I will go to bed at (hh:mm):");
        LocalTime wentToBed = LocalTime.parse(scanner.nextLine());
        //System.out.println(wentToBed);
        return wentToBed;
    }

    //how many hours of sleep I want:
    public String[] getHoursToSleep()
    {
      System.out.println("");
        System.out.println("Hours I want to sleep (hh:00):");
        String hoursToSleep = scanner.nextLine();
        String[] nums = hoursToSleep.split("\\.");
        //System.out.println(nums[0] + " + " + nums[1]);
        return nums;
    }

    //calculate when to wake up:
    public LocalTime whenToWakeUp(LocalTime wentToBed, String[] hoursOfSleep)
    {
        System.out.println("");
        LocalTime wakeUpTime = wentToBed.plusHours(new Long(hoursOfSleep[0])).plusMinutes(new Long(hoursOfSleep[1]));
        System.out.println("I need to wake up at: " + wakeUpTime);
        return wakeUpTime;
    }
}
