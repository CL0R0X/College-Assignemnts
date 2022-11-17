package simpleInterFace;

public class city extends Place implements Local, Statistical, Transportation {

    /**
     * Basic constructor. Instantiates an object place with the given name and
     * sets its geographic parameters to 0.
     *
     *
     */

    private String airportName;

    private String harborName;

    private String trainStationName;

    private int numberOfBuses;

    private  int numberOfSubways;

    private int populationSize;

    private String weather;

     public boolean hasAirport(){
         return airportName != null;
     }
     public String nameOfAirport(){
         return airportName;
     }


     public  boolean hasHarbor(){
         return harborName != null;
     }
     public  String nameOfHarbor(){
         return harborName;
     }


     public  boolean hasTrainStation() {
         return trainStationName != null;
     }
     public  String nameOfTrainStation() {
         return trainStationName;
     }

     public boolean hasBusService(){
         return numberOfBuses > 0;
     }


     public boolean hasSubwayNetwork(){
         return numberOfSubways > 0;
     }



/*
     public  String formOfGovernment(){
         return "";
     }
     public String currentName(){
         return "";
     }
     public  String describeCapital(){
         return  "";
     }

 */

     public  int population() {
         return populationSize;
     }



     public String describeClimate(){
         return weather;
     }


}  // class City