// 03オブジェクト指向 カプセル化

public class Capsule {

	public static void main(String[] args) {
		Person taro = new Person("山田太郎", 20);

		System.out.println(taro.getName());
		//getNameによりprivate化されている情報を読み取る
		taro.setName("花子");
		//setNameにより値を書き換える
		System.out.println(taro.getName());
		//setNameは書き換え処理をするだけなので
		//表示をしたければもう一度getNameで値を読み取らなければならない

		System.out.println(taro.getAge());

		taro.setAge(30);
		System.out.println(taro.getAge());


	}

}
