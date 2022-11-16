import java.text.DecimalFormat;

public class GoodStudent
{
    private String firstName;
    private String lastName;
    private int digitalID;
    private double digitalGPA;
    private boolean studentInCS;

    //constructors
    public GoodStudent(String firstName, String lastName, int digitalID, double GPA, boolean studentInCS)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.digitalID = digitalID;
        this.digitalGPA = GPA;
        this.studentInCS = studentInCS;
    }

    public GoodStudent(int myDigitalID, String myLastName, String myFirstName, double GPA, boolean myStudentInCS)
    {
        firstName = myFirstName;
        lastName = myLastName;
        digitalID = myDigitalID;
        digitalGPA = GPA;
        studentInCS = myStudentInCS;
    }

    //getters
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getDigitalID()
    {
        return digitalID;
    }

    public double getDigitalGPA()
    {
        return digitalGPA;
    }

    public boolean getStudentInCS()
    {
        return studentInCS;
    }

    //setters
    public void setDigitalID(int myDigitalID)
    {
        digitalID = myDigitalID;
    }

    public void setDigitalGPA(double GPA)
    {
        digitalGPA = GPA;
    }

    //Brain Methods
    public String CreateID()
    {
        String ID;
        String firstLetter = firstName.substring(0, 1);
        String lowerLastName = lastName.toLowerCase();
        int shortenedDigitalID = digitalID % 1000;

        firstLetter = firstLetter.toLowerCase();

        ID = firstLetter + lowerLastName + shortenedDigitalID;
        return ID;
    }

    public double CSGPA()
    {
        DecimalFormat fmt = new DecimalFormat("0.##");
        double increasedGPA = 0;

        if (studentInCS == true)
        {
            increasedGPA = ((15.0 / 100.0) * digitalGPA) + digitalGPA;
            increasedGPA = Double.parseDouble(fmt.format(increasedGPA));
        }
        else
        {
            increasedGPA = digitalGPA;
        }
        return increasedGPA;
    }

    //ToString
    public String toString()
    {
        String output = firstName + " " + lastName +
                        "\nDigital ID: " + digitalID +
                        "\nDigital GPA: " + digitalGPA +
                        "\nIs a CS Student: " + studentInCS;
        return output;
    }
}