import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    // array of PUPIL objects
    private PUPIL pupilList[]; 
    private int maxDataPosition ;
    
    // number of pupils to be called
    int noOfPupils;
    FILEREADCSV pupilmark;
    

    public SCHOOL()
    { pupilmark = new FILEREADCSV(); 

    }

    // top level algorithm
    public void processpupils() throws IOException
    { 
        setupPupilList();
        countpupilmark();
        

    }

    public void setupPupilList() throws IOException 

    { // placeholder
        System.out.println("School : pupilmark update");
        System.out.println("** Preparing to read data file.");
        String [] dataRows = pupilmark.readCSVtable ();
        noOfPupils = dataRows.length -1;
        System.out.println("** " + noOfPupils + " rows read.\n\n");
        pupilList = new PUPIL [noOfPupils];

        for (int i = 0; i < noOfPupils; i++) {
            pupilList[i]= new PUPIL ();
            pupilList[i].readPupilDetails(dataRows[i+1]);

        }
    }
    public void findmaxDataPosition ()
    {
        int maxDataPosition = 0;
    } 
    

    public void countpupilmark() throws IOException
    {
        //placeholder
        for (int i = 0; i < noOfPupils; i ++)
        {
            if (pupilList[i].getpupilmark() < pupilList [maxDataPosition].getpupilmark())  {
                maxDataPosition = 1; 
            }

        } 
        System.out.print("Topmark is:" + maxDataPosition );
            pupilList[maxDataPosition].displayDetails();
            System.out.println(); 
        }
    }

    