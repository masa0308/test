/**
 *
 */

/**
 * @author testuser
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ]
	   Person taro = new Person();
	   taro.name="山田太郎";
	   taro.age=20;
	   taro.phoneNumber="012-3456-789";
	   taro.address="東京都多摩市和田";
	   System.out.println(taro.name);
	   System.out.println(taro.age);
	   System.out.println(taro.phoneNumber);
	   System.out.println(taro.address);
	   taro.talk();
	   taro.walk();
	   taro.run();

	   Person jiro = new Person();
	   jiro.name="木村次郎";
	   jiro.age=18;
	   System.out.println(jiro.name);
	   System.out.println(jiro.age);

	   Person hanako = new Person();
	   hanako.name="鈴木花子";
	   hanako.age=16;
	   System.out.println(hanako.name);
	   System.out.println(hanako.age);

	   Person masafumi = new Person();
	   masafumi.name="池上理史";
	   masafumi.age=28;
	   System.out.println(masafumi.name);
	   System.out.println(masafumi.age);

	}

}
