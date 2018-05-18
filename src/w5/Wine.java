package w5;

import java.util.Calendar;

public class Wine {

    private String name;
    private String country;
    private int yearOfBottling;
    private int wineExtract;

    Calendar now = Calendar.getInstance();
    int currentYear = now.get(Calendar.YEAR);

    public String setName(String name1) { 
        name = name1;
        return name;
    }

    public String setCountry(String country1) {
        country = country1;
        return country;
    }

    public int setYearOfBottling(int yearOfBottling1) {
        if (yearOfBottling1 < 0)
            System.out.println("Wrong data");
        else
            yearOfBottling = yearOfBottling1;
        return yearOfBottling;
    }

    public int getWineExtract() {
        int extract;
        extract = currentYear - yearOfBottling;
        return extract;  // return currentYear - yearOfBottling; не проще так?
    }
}
