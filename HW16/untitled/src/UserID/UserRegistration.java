package UserID;

public class UserRegistration {
    public String Name;
    public String LastName;
    public String Email;
    public String Password;
    public String ConfirmPassword;

    public boolean Email() {
        char[] email = this.Email.toCharArray();
        for (int i = 0; i < email.length; i++) {
            if (email[i] == '@') {
                return true;
            }
        }
        return false;
    }

    public UserRegistration(String Name, String LastName, String Email, String Password, String ConfirmPassword)
    {
        this.Name = Name;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.ConfirmPassword = ConfirmPassword;

    }
    public boolean validate() {
        if (this.Name == null) {
            return false;
        }
        if (this.LastName == null) {
            return false;
        }
        if (this.Email==null || !this.Email()){
            return false;
        }
        if (this.Password==null){
            return  false;
        }
        if (this.ConfirmPassword==null){
            return false;
        }
        else
            return true;
    }


}
