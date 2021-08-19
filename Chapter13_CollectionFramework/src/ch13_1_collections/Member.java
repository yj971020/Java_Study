package ch13_1_collections;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;
			return member.name.equals(name)&&(member.age==age);
			
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return name.hashCode()	+ age; // 이름이 같으면 같은 해시코드 부여받음 + 나이 ->이름이 같아도 나이가 다르면 다른 객체로 저장되도록 할 수 있음
	}
}
