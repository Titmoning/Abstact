package Abstract_Int;

public class Main {

    public static void main(String[] args) {
        Library l = new Library("������", "������", 1289, "�����", true, 100000,"�������� ������!");
        System.out.println(l);
        House h = new House("��","Moscw" , 2022, "Pupkin", false, true, 6);
        System.out.println(h);
        h.guard();
        h.jkh();
    }
}