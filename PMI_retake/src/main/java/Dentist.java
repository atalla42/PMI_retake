import java.util.ArrayList;

public class Dentist
    {
        ArrayList<Appointments> Appoints = new ArrayList<>(); //creating new array list for appointments

        public void newAppointment(String patientN, String timestamp) //function for adding appointments and checking if they exist
        {
            boolean flag = false;
            for (int i = 0; i < Appoints.size(); i++) 
            {
                if (Appoints.get(i).getN().equals(patientN)) 
                {
                    flag = true;
                }
            }
            if (!flag) 
            {
                Appoints.add(new Appointments(patientN, timestamp));
            }

        }
    

    public String getAppointments() //function to print out appointments
    {
        String Appoint = "";
        for (int i = 0; i < Appoints.size(); i++) //formating and appending to string
        {
            if (i < Appoints.size() - 1) 
            {
                Appoint = Appoint + Appoints.get(i).getN() + " " + Appoints.get(i).getApp() + "\r\n"; 
            } else 
            {
                Appoint = Appoint + Appoints.get(i).getN() + " " + Appoints.get(i).getApp();
            }
        }
        return Appoint;
    }

    public void resign(String patientN) 
    {
        for (int i = 0; i < Appoints.size(); i++) 
        {
            if (Appoints.get(i).getN().equals(patientN)) 
            {
                Appoints.remove(i);
                break;
            }
        }
    }
}