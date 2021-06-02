package mbeans;

import java.util.ArrayList;
import java.util.List;

public class Interval implements IntervalMBean {
    //double passPercentage = 0;
    //int totalPoints = 0;
    //int passesPoints = 0;
    //@Override
    //public void updateCounters(long passes, long counts){
       // passPercentage = (double) passes/counts * 100;
    //}

    //@Override
    //public double getPassesPercentage() {
        //return passPercentage;
    //}

    //@Override
    //public void addResult(boolean result) {
        //totalPoints++;
        //if(result){
           // passesPoints++;
        //}
        //updateCounters(passesPoints,totalPoints);
    //}
    long lastTime;
    List<Long> timeIntervals;

    public Interval(){
        lastTime = System.currentTimeMillis();
        timeIntervals = new ArrayList<>();
    }

    @Override
    public String getAvgInterval(){
        long avgInterval = 0;
        for(long shotInterval : timeIntervals){
            avgInterval += shotInterval;
        }
        return avgInterval/(timeIntervals.size()) + " ms";
    }

    @Override
    public void addPoint(){
        long currenShotTime = System.currentTimeMillis();
        timeIntervals.add(currenShotTime - lastTime);
        lastTime = currenShotTime;
    }
}
