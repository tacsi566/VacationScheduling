import java.util.concurrent.atomic.AtomicInteger;

public class Coworker{
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private String team;
    private String replacementFor;
    private int daysOff;

    public Coworker(String name, String team, String replacementFor, int daysOff){
        this.name = name;
        this.team = team;
        this.replacementFor = replacementFor;
        this.daysOff = daysOff;
        id = count.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public int getId(){
        return  id;
    }
}