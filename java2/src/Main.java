import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        List<Runtime> list = new ArrayList<>();

        list.add(new Runtime("Kate", 17.45, "20/10/01"));
        list.add(new Runtime("Jones", 16.32, "21/5/12"));
        list.add(new Runtime("Anthony", 20.01, "19/12/24"));
        list.add(new Runtime("worker", 16.24, "22/01/30"));

        System.out.println("name; time; date");
        for (Runtime runtime : list) {
            System.out.println(runtime);
        }

        System.out.println("---------------");
        System.out.println("time順に並び替え");

        Collections.sort(list, new MyComp());

        for (Runtime c : list) {
            System.out.println(c.getRunnerName() + "; " + c.getRunTime() + "; " + c.getDate());
        }
    }
}
