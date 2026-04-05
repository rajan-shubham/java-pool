package inCampusHSDIquest;

import java.util.HashMap;
import java.util.Map;

public class GymMembershipWeek {
    /*
    A gym membership card allows entry for a one-week period that always begins on a Monday and ends on the following Sunday. Ellis attends the gym on a day at most. You are given a list visits of length N, which represents the days Ellis visits the gym, in chronological order. What is the minimum number of gym membership cards that Ellis has to purchase?

    Write a function:

    class Solution { public int solution(String[] visits); }
    that, given a list visits of length N, returns the minimum number of gym membership cards that Ellis must purchase based on the order of visits specified. Days of the week in visits are represented as three-letter strings ('Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun').

    Examples
    For visits = ["Tue", "Sat", "Mon", "Fri"], the function should return 2. In the first week, Ellis visits the gym on Tuesday and Saturday. In the second week, Ellis visits the gym on Monday and Friday.

    For visits = ["Mon", "Mon", "Mon"], the function should return 3. Ellis visits the gym only on Monday each week.

    For visits = ["Sun", "Sat", "Fri", "Thu", "Wed", "Tue", "Mon"], the function should return 7.

    Assumptions
    N is an integer within the range [1..100].

    The only strings in visits are: "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", and "Sun".

    In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
     */
    public int solution(String[] visits) {
        if (visits == null || visits.length == 0) return 0;

        // Map days to numbers to easily compare "chronological" order within a week
        Map<String, Integer> dayMap = new HashMap<>();
        dayMap.put("Mon", 1);
        dayMap.put("Tue", 2);
        dayMap.put("Wed", 3);
        dayMap.put("Thu", 4);
        dayMap.put("Fri", 5);
        dayMap.put("Sat", 6);
        dayMap.put("Sun", 7);

        int cards = 1; // Start with the first card
        int lastDayValue = dayMap.get(visits[0]);

        for (int i = 1; i < visits.length; i++) {
            int currentDayValue = dayMap.get(visits[i]);

            // If current day is same or earlier than last day, a new week started
            if (currentDayValue <= lastDayValue) {
                cards++;
            }

            // Update lastDayValue for the next iteration
            lastDayValue = currentDayValue;
        }

        return cards;
    }

    public static void main(String[] args) {
        GymMembershipWeek sol = new GymMembershipWeek();

        // Test Case 1: Expected 2
        System.out.println(sol.solution(new String[]{"Tue", "Sat", "Mon", "Fri"}));

        // Test Case 2: Expected 3
        System.out.println(sol.solution(new String[]{"Mon", "Mon", "Mon"}));

        // Test Case 3: Expected 7
        System.out.println(sol.solution(new String[]{"Sun", "Sat", "Fri", "Thu", "Wed", "Tue", "Mon"}));
    }
}
