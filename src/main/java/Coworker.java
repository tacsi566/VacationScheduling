import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;


public class Coworker{
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private String team;
    private int replacementFor;
    private int numberOfDaysOff;
    private Set<Interval> daysOff= new HashSet<>();


    public Coworker(String name, String team, int replacementFor, int numberOfDaysOff){
        this.name = name;
        this.team = team;
        this.replacementFor = replacementFor;
        this.numberOfDaysOff = numberOfDaysOff;
        id = count.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public String getTeam(){
        return this.team;
    }

    public int getReplacementFor(){
        return replacementFor;
    }

    public int getNumberOfDaysOff(){
        return numberOfDaysOff;
    }

    public int reduceDaysOff(int reduceBy){
        if (numberOfDaysOff-reduceBy <= 0){
            return 0;
        }else{
            this.numberOfDaysOff-=reduceBy;
            return numberOfDaysOff;
        }

    }

    public void resetNumberOfDaysOff(){
        this.numberOfDaysOff = 40;
    }

    public void addIntervalToDaysOff(Interval interval){
        int lengthOfInterval = interval.getNumberOfWorkdays();
        if ((this.numberOfDaysOff > 0) && this.getNumberOfDaysOff()-lengthOfInterval>0){
            if (daysOff.contains(interval)){
                System.out.println("Interval adding failed. Interval already existing.");
            }else{
                int daysOffRemaining = this.reduceDaysOff(lengthOfInterval);
                daysOff.add(interval);
                System.out.println("Interval added successfully. Number of days off remaining: " + daysOffRemaining);
            }
        }else {
            System.out.println("Worker " + this.name + " doesn't have enough days off.");
        }
    }

    public void printDaysOff(){
        for (Interval i : daysOff){
            System.out.println("Start date: " + i.startDate);
            System.out.println("End date: " + i.endDate);
        }
    }



    public int getId(){
        return  id;
    }
}