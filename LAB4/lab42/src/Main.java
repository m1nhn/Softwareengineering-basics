import mbeans.*;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.Scanner;

public class Main {

    static boolean parsePoint(String[] command, Log logger) throws Exception{
        if(!command[0].equals("check")){
            throw new Exception("Unknown command!");
        }
        try{
            double x = Double.parseDouble(command[1]);
            double y = Double.parseDouble(command[2]);
            double r = Double.parseDouble(command[3]);

            CheckPoint p = new CheckPoint(x,y,r);

            logger.update(p);

            return p.check;
        } catch(Exception e){
            throw new IllegalAccessException("Hey what are you doing bro? Check your numbers please");
        }
    }

    public static void main(String[] args){
        Log logger = new Log();
        try{
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            ObjectName name = new ObjectName("lab42.beans:type=Info");
            Info infoBean = new Info();
            //StandardMBean mbean = new StandardMBean(infoBean, InfoMbeans.class);
            server.registerMBean(infoBean, name);
            logger.setInfo(infoBean);

        } catch(Exception e){
            System.err.println(e.getMessage());
            System.exit(1);
        }

        try{
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            ObjectName name = new ObjectName("lab42.beans:type=Interval");
            Interval intervalBean = new Interval();
            //StandardMBean mbean = new StandardMBean(intervalBean, IntervalMBean.class);
            server.registerMBean(intervalBean,name);
            logger.setInterval(intervalBean);
        }catch (Exception e){
            System.err.println(e.getMessage());
            System.exit(1);
        }

        Scanner scan = new Scanner(System.in);
        while(true){
            String command = scan.nextLine();
            String[] parsedCommands = command.split(" ");

            switch (parsedCommands.length){
                case 1:
                    switch(parsedCommands[0]){
                        case "history":
                            System.out.println(logger);
                            break;
                        case "exit":
                            return;
                        default:
                            System.out.println("Unknown command!");
                    }
                    break;
                case 4:
                    try{
                        if(parsePoint(parsedCommands, logger)){
                            System.out.println("Passed. You won this game");
                        } else{
                            System.out.println("Missed. Oh you lost this game :(");
                        }
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("What're you doing, bros ? ");
            }
        }
    }
}
