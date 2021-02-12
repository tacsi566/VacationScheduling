import java.time.LocalDate;

public class testing {

    public static void main(String[]args){
        Coworker worker = new Coworker("Test", "TX-Edge", 0, 40);
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(4);
        Interval interval = new Interval(start, end);
        System.out.println(interval.getNumberOfWorkdays());
        LocalDate start1 = LocalDate.now().minusDays(6);
        LocalDate end1 = start.plusDays(2);
        Interval interval1 = new Interval(start1, end1);
        System.out.println(interval1.getNumberOfWorkdays());
        worker.addIntervalToDaysOff(interval);
        System.out.println(worker.getNumberOfDaysOff());
        worker.addIntervalToDaysOff(interval1);
        System.out.println(worker.getNumberOfDaysOff());
        //worker.printDaysOff();
    }
}


