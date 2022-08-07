import java.util.Comparator;
public class Runtime {
    private String runnerName;
    private double runTime;
    private String date;

    public Runtime(String runnerName, double runTime, String date) {
        this.runnerName = runnerName;
        this.runTime = runTime;
        this.date = date;
    }

    @Override
    public String toString() {
        return this.runnerName + "; " + this.runTime + "; " +this.date;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public double getRunTime() {
        return runTime;
    }

    public String getDate() {
        return date;
    }
}

class MyComp implements Comparator<Runtime> {
    public int compare(Runtime c1, Runtime c2) {
        if (c1.getRunTime() < c2.getRunTime()) {
            return -1;
        } else if(c1.getRunTime() > c2.getRunTime()) {
            return 1;
        } else {
            return c1.getRunnerName().compareTo(c2.getRunnerName());
        }
    }
}


