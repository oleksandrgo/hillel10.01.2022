public class User {
   public String name;
   public String lastName;
   public String email;
   public String password;

   //1.делаем поля Емейл и Пароль Обязательными
  /* public User(String email, String password){
      this.email = email;
      this.password = password;*/

   //2.делаем все поля обязательными
   public User(String name, String lastName, String email, String password) {
      this.name = name;
      this.lastName = lastName;
      //проверка емейла на седоржание "@"
      for (int i = 0; i <= email.length(); ++i) {
         if (email.charAt(i) == '@') {
            this.email = email;
            break;
         }
      }
      this.password = password;
   }



}
