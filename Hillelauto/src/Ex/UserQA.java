package Ex;
public class UserQA {
    public String name;
    public String lastName;
    public String email;
    public String password;
    public String ReenterPassword;


  /* public UserQA (String email, String password){
       this.email = email;
       this.password = password;*/


    public UserQA (String name, String lastName, String email, String password, String ReenterPassword) {
        this.name = name;
        this.lastName = lastName;
        this.ReenterPassword = ReenterPassword;


        // Сделать проверку на емайл, убедится что там есть "@"
        for (int a = 0; a < email.length(); ++a) {
            if (email.charAt(a) == '@') {
                this.email = email;
                break;
            }
        this.password = password;
            break;
    }

    }}
