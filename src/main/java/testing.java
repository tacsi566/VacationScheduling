import java.time.LocalDate;

public class testing {

    public static void main(String[]args){
        Coworker worker = new Coworker("Test", "TX-Edge", 0, 6);
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(4);
        Interval interval = new Interval(start, end);
        System.out.println(interval.getNumberOfWorkdays());
        LocalDate start1 = LocalDate.now().minusDays(6);
        LocalDate end1 = start.plusDays(2);
        Interval interval1 = new Interval(start1, end1);

        worker.addIntervalToDaysOff(interval);
        worker.addIntervalToDaysOff(interval1);
        //worker.printDaysOff();
    }
}


