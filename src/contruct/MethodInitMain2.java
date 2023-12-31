package contruct;

public class MethodInitMain2 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        memberInit(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        memberInit(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름:" + member.name);
        }

    }

    static void memberInit(MemberInit memberInit, String name, int age, int grade) {
        memberInit.name = name;
        memberInit.age = age;
        memberInit.grade = grade;
    }

}
