package MyUser;



//1.Создать класс пользователя. У пользователя должны быть все поля как в Hillel auto
public class newUser {
    public String name;
    public String LastName;
    public String Email;
    public String password;

    //3.Сделать проверку на емайл, убедится что там есть сабака(Не используем регулярные выржения, contains, indexOf и тд.)
    // У вас должен быть ваш метод. Проверка должна выполнятся на момент создания обьекта.
    //2.Пользоватля можно создавать двумя способами
    // a. Все поля обязательны
    // b. email и пароль обязательны
   /* public newUser(String Email,String password){
        this.Email =Email;
        this.password = password;*/
 public newUser(String name,String LastName,String Email,String password) {
     this.name = name;
     this.LastName = LastName;
     for (int i = 0; i <=Email.length(); ++i) {
         if (Email.charAt(i) == '@') {
             this.Email = Email;
             break;
         }
     }
     this.password = password;
 }
}










