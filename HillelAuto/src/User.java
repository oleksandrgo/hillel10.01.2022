public class User {
   public String name;
   public String lastName;
   public String email;
   public String password;

   //1.������ ���� ����� � ������ �������������
  /* public User(String email, String password){
      this.email = email;
      this.password = password;*/

   //2.������ ��� ���� �������������
   public User(String name, String lastName, String email, String password) {
      this.name = name;
      this.lastName = lastName;
      //�������� ������ �� ���������� "@"
      for (int i = 0; i <= email.length(); ++i) {
         if (email.charAt(i) == '@') {
            this.email = email;
            break;
         }
      }
      this.password = password;
   }



}
