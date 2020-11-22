//Here I want to calculate how many hours I slept based on when I went to bed and when I woke up:
//Went to bed at 23:00h.
//Woke up at: 07:00h.
//You slept: 8 hours.

//Ideas:
//how to insert time to calculate the next day?
//how to insert a specific time format?
//how to add a time format?
//maybe also add the functionality to say if it was enough.

//how to make multiple windows? or tabs for 2 app aspects?
//handle wrong input
//handles white space between inputs:

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HoursSlept {

    public final Scanner scanner = new Scanner(System.in);

    public LocalTime wentToBed()
    {
        System.out.println("I went to bed at (hh:mm):");
        LocalTime wentToBed = LocalTime.parse(scanner.nextLine());
        //System.out.println(wentToBed);
        return wentToBed;
    }

    public LocalTime wokeUp()
    {
        System.out.println("I woke up at:");
        LocalTime wakeUp = LocalTime.parse(scanner.nextLine());
        //System.out.println(wakeUp);
        return wakeUp;
    }

    public long hoursSlept(LocalTime wentToBed, LocalTime wokeUp)
    {
        long difference = wentToBed.until(wokeUp, ChronoUnit.HOURS) + 24;
        System.out.println("I slept for: " + difference + " hours.");
        return difference;
    }

}