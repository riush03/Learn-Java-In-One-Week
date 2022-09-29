import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class AllAboutTime {

    public  static void main(String[] args)
    {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for(String zoneId: zoneIds)
        {
            System.out.println("Dispalying all time zones id:");
            System.out.println(zoneId);
        }
        System.out.println("The time at my lcal place is:"+LocalTime.now()+"date: "+LocalDateTime.now());
    }

}
