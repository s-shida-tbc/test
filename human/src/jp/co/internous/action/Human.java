package jp.co.internous.action;

public class Human {
	public static void main(String[]args){

		HumanName abc=new HumanName();
		System.out.println(abc.getName()+"さん");

		HumanAge efg=new HumanAge();
		System.out.println(efg.getAge()+"歳");

		HumanAddress hij=new HumanAddress();
		System.out.println(hij.getAddress()+"在住");
	}
}
