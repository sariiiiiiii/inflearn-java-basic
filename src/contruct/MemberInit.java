package contruct;

public class MemberInit {

    String name;
    int age;
    int grade;

    /**
     * 인자로 받은 파라미터명이랑 멤버변수의 이름이 똑같다면 현재 내 객체에 값을 초기화 시켜주고 싶은 것이기 때문에 this(나 자신)을 입력
     */
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = grade;
        this.grade = grade;
    }

}
