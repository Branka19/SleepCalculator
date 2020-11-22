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
        System.out.println("I will go to bed at (hh:mm):");
        System.out.println("");
        LocalTime wentToBed = LocalTime.parse(scanner.nextLine());
        //System.out.println(wentToBed);
        return wentToBed;
    }

    //how many hours of sleep I want:
    public int getHoursToSleep()
    {
        System.out.println("Hours I want to sleep (hh):");
        System.out.println("");
        int hoursToSleep = scanner.nextInt();
        return hoursToSleep;
    }

    //calculate when to wake up:
    public LocalTime whenToWakeUp(LocalTime wentToBed, int hoursOfSleep)
    {
        LocalTime wakeUpTime = wentToBed.plus(hoursOfSleep, ChronoUnit.HOURS);
        System.out.println("I need to wake up at: " + wakeUpTime);
        System.out.println("");
        return wakeUpTime;
    }


}