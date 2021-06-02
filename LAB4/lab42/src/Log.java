import mbeans.Info;
import mbeans.Interval;

import java.util.ArrayList;
import java.util.List;

public class Log {
    List<CheckPoint> history;
    Info info;
    Interval interval;

    public Log(){
        history = new ArrayList<>();
        info = new Info();
        interval = new Interval();
    }

    public void update(CheckPoint p){
        history.add(p);
        info.addResult(p.check);
        interval.addPoint();
    }

    public void setInfo(Info i){
        info = i;
    }

    public void setInterval(Interval i){
        interval = i;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(CheckPoint p: history){
            sb.append(p.toString()).append('\n');
        }
        return sb.toString();
    }
}
