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
		// TODO 自動生成されたメソッド・スタブ
        TestUserDAO dao = new TestUserDAO();
        dao.select("taro","123");
        dao.selectAll();
        dao.selectByName("taro");
        dao.selectByPassword("123");
        dao.updateUserNameByUserName("taro","saburo");
        dao.updateUserNameByUserName("saburo","taro");
        dao.insert(4, "shiro", "012");
        dao.delete("shiro");

	}

}
