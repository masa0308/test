import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author Masafumi
 *
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力してください");
		String t = null;
		try {
			t = br.readLine();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(t);
	}

}
