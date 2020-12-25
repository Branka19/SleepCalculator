import java.time.LocalTime;
import java.util.Scanner;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CurrentTime
{

    public LocalTime getCurrentTime()
    {
        System.out.println("Choose your country (SERBIA, GERMANY, NETHERLANDS):");

        Scanner scanner = new Scanner(System.in);
        Country country = Country.valueOf(scanner.next().toUpperCase());

        LocalTime localTime = null;
        DateTimeFormatter pattern;
        String s = null;

        switch (country)
        {
            case SERBIA:
                ZonedDateTime nowInSerbia = ZonedDateTime.now(ZoneId.of("Europe/Belgrade"));
                //System.out.println("Time now in Belgrade: " + nowInSerbia);

                localTime = nowInSerbia.toLocalTime();
                s = localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.forLanguageTag("rs")));

                break;

            case GERMANY:
                ZonedDateTime nowInGermany = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
                //System.out.println("Time now in Berlin: " + nowInGermany);

                localTime = nowInGermany.toLocalTime();
                s = localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.forLanguageTag("de")));

                break;

            case NETHERLANDS:
                ZonedDateTime nowInHolland = ZonedDateTime.now(ZoneId.of("Europe/Amsterdam"));
                //System.out.println("Time now in Amsterdam: " + nowInHolland);

                localTime = nowInHolland.toLocalTime();
                s = localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.forLanguageTag("nl")));

                break;
        }

        System.out.println("Current time in " + country + " is:\n" + s);
        System.out.println();
        return localTime;
    }
}

