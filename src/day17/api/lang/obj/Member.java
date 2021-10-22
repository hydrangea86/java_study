package day17.api.lang.obj;

public class Member {

    String name;
    int age;
    String address;

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //final쓰면 메서드 생성 선택
    @Override
    protected void finalize() throws Throwable {

        System.out.println(name + "객체 소멸됨!");
    }

    // toString() 단축키 to 입력하면 toString()메서드 생성
    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
