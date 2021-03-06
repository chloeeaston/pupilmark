public class PUPIL
{
    // list of prperties
    private String fname;
    private String sname;
    private int pupilmark;
    private int topmark;
    private int maxDataPosition;
    
 
    
  
    public PUPIL()
    {
        //constuctor 

        fname = "";
        sname = "";
        pupilmark = 0;
        maxDataPosition = 0;
    }
    // file handling store details from file 
    public void readPupilDetails (String dataItems)
    { // unpack string of row data into fields 
        String [] rowItems = dataItems.split(",");
        // store each data items as instance property 
        fname = rowItems [0]; 
        sname = rowItems [1];
        pupilmark = Integer.parseInt(rowItems[2]);
    }

    public String writeDetails ()
    {
        // Join up data into a string to output as a row
        // use "," to seperate csv colums 
        String pupilData = "";
        pupilData = pupilData.concat(fname);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(sname);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(Integer.toString(pupilmark));
        return pupilData;
    }

    public int getpupilmark ()
    {
        return pupilmark; 
    }

    public void displayDetails ()
    {
        // output basic details
        System.out.print("Pupil: " + fname + " " + sname);
        System.out.print(",  pupilmark is " + pupilmark);
        System.out.println();
    } } 