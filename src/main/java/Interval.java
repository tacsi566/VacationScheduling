
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;

public class Interval {
    LocalDate startDate;
    LocalDate endDate;

    public Interval(LocalDate startDate, LocalDate endDate){
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //Delete later, no need of 2 constructors
    public Interval(){

    }


    public int getNumberOfWorkdays(){
        LocalDate date= this.startDate;
        ArrayList<LocalDate> days = new ArrayList<>();

        Set<DayOfWeek> weekend = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);

        while (date.isBefore(this.endDate)){
            if (!weekend.contains(date.getDayOfWeek())){
                days.add(date);
            }

            date = date.plusDays(1);
        }

        return days.size();
    }




}