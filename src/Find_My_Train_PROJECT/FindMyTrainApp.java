package Find_My_Train_PROJECT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem system=new TrainSystem();

        //adding new stations
        Station station1=new Station("S00333","Agra");
        Station station2=new Station("S00444","Lucknow");

        //adding new trains
        Train train1=new Train("12408","Duranto Exp","Express");
        Train train2=new Train("12608","Intercity pas","Passenger");

        //adding new platforms
        Platform platform1=new Platform(1);
        Platform platform2=new Platform(2);

        //setting trains on different platforms
        platform1.setTrain(train1);
        platform2.setTrain(train2);

        //creating list for adding platforms in platformlist
        List<Platform> platformList=new ArrayList<>();
        platformList.add(platform1);
        platformList.add(platform2);

        //setting platformlist on station1 by setPlatFormList method
        station1.setPlatformList(platformList);

        //creating schedules for train
        Schedule s1=new Schedule(train1,station1,"9AM","9:05AM",platform1);
        Schedule s2=new Schedule(train2,station2,"10AM","10:02AM",platform2);

        //adding station,trains,schedules in system
        system.addStations(station1);
        system.addStations(station2);
        system.addTrain(train1);
        system.addTrain(train2);
        system.addSchedule(s1);
        system.addSchedule(s2);

        //Let's find out train between stations
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source: ");
        String source = sc.nextLine();
        System.out.println("Enter the destination:");
        String des = sc.nextLine();

        List<Schedule> myTrains = system.findMyTrains(source,des);
        System.out.println("Your train between "+source+" and "+des);
        System.out.println(myTrains.get(0));

    }
}
