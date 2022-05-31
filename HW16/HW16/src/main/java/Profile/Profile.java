package Profile;

public class Profile {
    private String name;
    private String lastname;
    private String email;
    private String password;
//   public Profile {(name, lastname, email, password)}{
//    this.name = name;
//    this.lastname = lastname;
//    this.email = email;
//    this.password = password;
}

   public Profile(){
    this.email = email;
    this.password = password;
            char[] emailArray = email.toCharArray();
            for(int i = 0; i < email.length; i++) {
                if(emailArray[i] == '@') {
                    System.out.println("found");
                }
            }
            this.email = email;
            this.password = password;
        }

    }
}



