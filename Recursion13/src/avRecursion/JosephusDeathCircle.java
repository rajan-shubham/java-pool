package avRecursion;

import java.util.ArrayList;

public class JosephusDeathCircle {
    public static void main(String[] args) {
        int n = 40;
        ArrayList<Integer> persons = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            persons.add(i);
        }
        int k = 7; // kth person is going to kill
        k = k - 1; // for zero-based indexing in an array
        lastStandingPerson(persons, k, 0);
    }

    public static void lastStandingPerson(ArrayList<Integer> persons, int k, int killIndex){
        if (persons.size() == 1){
            System.out.println(persons.getFirst());
            return;
        }
        killIndex = (killIndex + k) % persons.size();
        persons.remove(killIndex);
        lastStandingPerson(persons, k, killIndex);
    }
}
