package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
       double sum=0;
        double avg = 0;

        try{
            //Write the logic
            for (int i = 0; i < ageRawData.length; i++) {
                sum= sum+Double.parseDouble(ageRawData[i]);
            }

            //Handle specific exception
        }catch (NumberFormatException exception) {
            System.out.println(exception);
            return exception.toString();
        }
        avg=sum/ageRawData.length;
        return String.valueOf(avg);
    }



}
