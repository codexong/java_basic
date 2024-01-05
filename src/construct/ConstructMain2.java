package construct;

public class ConstructMain2 {

    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);

        //성적 기본 -> 50점
        MemberConstruct member2 = new MemberConstruct("user1", 16);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {

            System.out.println("이름 : " + member.name +
                    " 나이 : " + member.age +
                    " 성정 : " + member.grade);

        }

    }
}
