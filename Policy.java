/**
This program gets the policy information and displays it.
*/


public class Policy
{
   private String policyNumber = "";
   private String fullN = "";
   private String firstName = "";
   private String lastName = "";
   private int age = "";
   
   
   
   public void setPolicyNumber(long pNumber)
    {
        policyNumber = pNumber;  //Assigning policy number
    }


    public long getPolicyNumber()
    {
        return policyNumber;    //return 
    }


    public void setFullName(String fullN)
    {
        fullName = fullN;
    }


    public String getFullName()
    {
        return fullName;
    }


    public void setFirstName(String firstN)
    {
        firstName = firstN;
    }


    public String getFirstName()
    {
        return firstName;
    }


    public void setLastName(String lastN)
    {
        lastName = lastN;
    }


    public String getLastName()
    {
        return lastName;
    }


    public void setAge(int yearsLived)
    {
        age = yearsLived;
    }


    public int getAge()
    {
        return age;
    }


    public void setSmokingStatus(String smoker)
    {
        smokingStatus = smoker;
    }


    public String getSmokingStatus()
    {
        return smokingStatus;
    }


    public void setHeight(double heightOfHolder)
    {
        height = heightOfHolder;
    }


    public double getHeight()
    {
        return height;
    }

    public void setWeight(double weightOfHolder)
    {
        weight = weightOfHolder;
    }

    public double getWeight()
    {
        return weight;
    }
}