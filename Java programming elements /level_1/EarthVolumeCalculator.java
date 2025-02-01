public class EarthVolumeCalculator {
    public static void main(String[] args){
        double radiusInKilometer = 6378;

        double conversionFactor = 0.621371;

        double radiusInMiles = radiusInKilometer * conversionFactor;

        double volumeInKilometer = (4.0 / 3.0) * Math.PI * Math.pow(radiusInKilometer, 3);

        double volumeInMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeInKilometer + " and cubic miles is " + volumeInMiles);

    }
}
