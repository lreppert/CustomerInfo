/**
 * Created by Mike on 2/19/2015.
 */
public class Info {

    /**
     *
     */

       private  String firstName;
       private  String surName;
       private  String number;
//       public Info( String firstName, String surName, String number)
//            {
//
//                this.firstName = firstName;
//                this.surName = surName;
//                this.number = number;
//           }
        public  void setFirstName(String firstName)
            {
                this.firstName = firstName;
            }
        public void setSurName(String surName)
            {
                this.surName = surName;
            }
        public void setTheNumber(String number)
            {
                this.number = number;
            }

        public  String getFirstName()
            {
            return firstName;
            }
    public  String getTheName()
    {
        return firstName + surName;
    }
        public String getSurName()
            {
                return surName;
            }
        public String getNumber()
            {
            return number;
            }
        public String toString()
            {
            return (getTheName()  + getNumber() );
            }


}
