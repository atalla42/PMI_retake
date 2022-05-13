public class Assistant extends Dentist
    {
        public void refreshAppointment(String patientN, String timestamp)
        {
            for (int i = 0; i < Appoints.size(); i++) //for loop for finding specific appointment and changing time
            {
                if(Appoints.get(i).getN().equals(patientN))
                {
                    Appoints.get(i).setAppoint(timestamp);
                }
            }
        }
    }