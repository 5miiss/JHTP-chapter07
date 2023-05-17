package com.chapter07.test;

public class Distance {
    
    public static void main(String[] args) {
        double lat1 = 30.0508027; // Latitude of point 1
        double lon1 = 31.4745416; // Longitude of point 1
        double lat2 = 30.0779333; // Latitude of point 2
        double lon2 = 31.4720912; // Longitude of point 2
        
        double distance = calculateDistance(lat1, lon1, lat2, lon2);
        System.out.println("Distance: " + distance + " kilometers");

        double distance1 = distance(lat1, lon1, lat2, lon2);
        System.out.println("Distance: " + distance1 + " kilometers");
    }
    
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double radius = 6371; // Earth's radius in kilometers
        
        // Convert latitude and longitude to radians
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        
        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;
        
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                   Math.cos(lat1) * Math.cos(lat2) *
                   Math.sin(dLon/2) * Math.sin(dLon/2);
        
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        
        double distance = radius * c;
        
        return distance;
    }

    public static double distance(Double lat1, Double lon1, Double lat2, Double lon2) {
        if ((lat1 == 0 || lon1 == 0 || lat2 == 0 || lon2 == 0))
        {
            return 0;
        }
        lon1 = lon1 * Math.PI / 180;

        lon2 = lon2 * Math.PI / 180;

        lat1 = lat1 * Math.PI / 180;

        lat2 = lat2 * Math.PI / 180;

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2), 2);

        double c = 2 * Math.asin(Math.sqrt(a));

        return c * 6371;
    }

}