package D_com.reflection.newInstanceMethod;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class obj  = Class.forName("D_com.reflection.newInstanceMethod.User");
		User user = (User) obj.newInstance();
		user.setUserId(1);
		user.setUserFName("Samarth");
		user.setUserLName("Narula");
		user.setUserPhone("444444444443");
		System.out.println(user);
	}

}
