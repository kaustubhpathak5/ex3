package hasademo;

public class B extends A {

public void m3() {
	m1();
	m4();
System.out.println("m3===B");

}
public void m4() {
System.out.println("m4===B");
}
public static void main(String[] args) {
	B b =new B();
	b.m1();
	b.m2();
	b.m3();
	b.m4();

}
}
