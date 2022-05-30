package MyUser;



//1.Создать класс пользователя. У пользователя должны быть все поля как в Hillel auto
public class newUser {
    public String name;
    public String LastName;
    public String Email;
    public String password;
    public String ReenterPassword;
    //3.Сделать проверку на емайл, убедится что там есть сабака(Не используем регулярные выржения, contains, indexOf и тд.)
    // У вас должен быть ваш метод. Проверка должна выполнятся на момент создания обьекта.
 public void Email(){
     String Email = "inpresident@33gmail.com";
     // получить длину строки
     int length = Email.length();
     //  символ '@' в ""inpresident33@gmail.com""
     char searchChar = '@';
     boolean IsValidEmail= false;
     for (int i = 0; i < length; ++i) {
         if (Email.charAt(i) == searchChar) {
             IsValidEmail = true;
             break; // первое вхождение
         }
     }
     System.out.println((IsValidEmail));

 }

    public newUser(String name, String LastName, String Email, String password, String ReenterPassword){
        this.name = name;
        this.LastName = LastName;
        this.Email =Email;
        this.password = password;
        this.ReenterPassword = ReenterPassword;

    }
    //2.Пользоватля можно создавать двумя способами
  // a. Все поля обязательны
    public boolean validate() {
        if (this.name == null) {
            return false;
        }
        if (this.LastName == null) {
            return false;
        }
        if (this.Email==null){
            return false;
        }
        if (this.password==null){
            return  false;
        }
        if (this.ReenterPassword==null){
            return false;
        }
        else
            return true;
    }


    }







