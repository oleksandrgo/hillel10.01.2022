
//������� ����������
public class Porshe extends Auto {
    public Double speed;

    public Porshe(String brand, String model, Double mileage, Double speed) {
        super(brand, model, mileage);
        //���� �������� ���� 300 ������� "����"
        if(speed>300){
            throw new IllegalCallerException("STOP");
        }
        this.speed = speed;
    }
    //������� "����", ���� �������� ��������� 300
    public void sayStop() {
        if (speed > 300){
            System.out.println("����");
        }
    }
}
