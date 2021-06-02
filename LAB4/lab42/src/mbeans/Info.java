package mbeans;

import javax.management.*;

public class Info extends NotificationBroadcasterSupport implements InfoMBean {
    int totalPoints;
    int hitPoints;
    int missedPoints;
    int sequenceNumber;

    public Info(){
        totalPoints = 0;
        hitPoints = 0;
        missedPoints = 0;
        sequenceNumber = 1;
    }

    @Override
    public int getTotalPointsCount() {
        return totalPoints;
    }

    @Override
    public int getHitPointsCount() {
        return hitPoints;
    }

    @Override
    public int getMissedPoints(){return totalPoints - hitPoints;}

    @Override
    public void addResult(boolean result){
        totalPoints++;

        if(result){
            ++hitPoints;
        } else{
            ++missedPoints;
        }

        System.out.println(totalPoints);
        if(missedPoints == 2){
            Notification n = new Notification("missedPoints222", this,
                    sequenceNumber++, System.currentTimeMillis(), "Oh no, you have lost this game 2 times");
            missedPoints = 0;
            this.sendNotification(n);
        }
    }

}
