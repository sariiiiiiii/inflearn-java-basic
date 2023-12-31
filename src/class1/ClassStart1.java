package class1;

public class ClassStart1 {

    public static void main(String[] args) {

        /**
         * 학생이 추가 될 때마다 코드가 다 추가가 되야 한다
         * 하지만 루프문을 돌리면 쉽게 할 수 있을 거 같지만 변수명이 다 다르기 때문에 힘들 것 같다
         * 하지만 이름, 나이, 성적이 타입이 같기 때문에 배열을 사용하면 뭔가 편할 것 같다
         */

        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        String student3Name = "학생3";
        int student3Age = 17;
        int student3Grade = 70;

        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
        System.out.println("이름:" + student3Name + " 나이:" + student3Age + " 성적:" + student3Grade);
    }

}
