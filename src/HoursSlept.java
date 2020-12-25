//Ideas:
//how to insert a specific time format?
//how to add a time format?
//maybe also add the functionality to say if it was enough.

//how to make multiple windows? or tabs for 2 app aspects?
//handle wrong input
//handle white space between inputs:

import java.time.Duration;
import java.time.LocalTime;
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
        System.out.println("I woke up at (hh:mm):");
        LocalTime wakeUp = LocalTime.parse(scanner.nextLine());
        //System.out.println(wakeUp);
        return wakeUp;
    }

    //accept minutes as well:
    public void hoursSlept(LocalTime wentToBed, LocalTime wokeUp)
    {
        Duration duration = Duration.between(wentToBed, wokeUp);
        //long hours = duration.toHours();
        //if(hours < 0) hours += 24;
        long minutes = duration.toMinutes();
        if(minutes < 0) minutes += 1440;

        long hours = minutes / 60;
        long min = minutes - hours * 60;
        if(min == 0)
            System.out.println("I slept for " + minutes / 60 + " hours.");
        else
        System.out.println("I slept for " + minutes / 60 + " hours " + min + " minutes.");
        System.out.println("");
    }

}