package org.example;

import java.util.ArrayList;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job(1,6,34));
        jobList.add(new Job(2,1,60));
        jobList.add(new Job(3,1,36));

        jobList.sort((a, b) -> {
            if (a.deadline != b.deadline) {
                return a.deadline - b.deadline;
            } else {
                return a.profit - b.profit;
            }
        });
        for(Job job : jobList){
            System.out.println(job.id);
        }
    }



}

class Job{
    int id;
    int deadline;
    int profit;

    Job(int id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}