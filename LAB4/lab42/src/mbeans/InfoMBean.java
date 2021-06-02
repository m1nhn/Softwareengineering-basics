package mbeans;

import javax.management.NotificationBroadcaster;

public interface InfoMBean extends NotificationBroadcaster {
    int getTotalPointsCount();
    int getHitPointsCount();
    int getMissedPoints();
    void addResult(boolean result);
}
