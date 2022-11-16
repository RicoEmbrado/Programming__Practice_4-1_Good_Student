public class GoodStudentDriver
{
    public static void main(String[] args)
    {
        //instantiating student information
        GoodStudent alanTuring = new GoodStudent("Alan", "Turing", 191254, 3.56, true);
        GoodStudent florenceNightingale = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
        GoodStudent graceHopper = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);

        //Calling to setters to change an input
        florenceNightingale.setDigitalID(95366);
        florenceNightingale.setDigitalGPA(3.92);

        //Regular Outputting
        System.out.println("\n" + alanTuring.toString());
        System.out.println("\nFlorence's ID is now " + florenceNightingale.getDigitalID() + " and Florence's GPA is now " + florenceNightingale.getDigitalGPA());
        System.out.println("\nGrace's first name is " + graceHopper.getFirstName() + " and her CS status is " + graceHopper.getStudentInCS());

        //Create ID
        System.out.println("\nAlan Turing's ID is " + alanTuring.CreateID());
        System.out.println("Florence Nightingale's ID is " + florenceNightingale.CreateID());
        System.out.println("Grace Hopper's ID is " + graceHopper.CreateID());

        //CSGPA
        System.out.println("\nAlan Turing's GPA is " + alanTuring.CSGPA() + " because he is in CS");
        System.out.println("Florence Nightingale's GPA is " + florenceNightingale.CSGPA() + ", it did not change because she is not in CS.");
        System.out.println("Grace Hopper's GPA is " + graceHopper.CSGPA() + " because she is in CS");
    }
}