package chapter17.arraylist_stack_queue;

public class Person {

	
	//한 사람의 정보 정의
	private String name;
	private int age;
	private String tel;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("이름 : ");
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void people(String name, int age, String tel) {
		
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	
}
