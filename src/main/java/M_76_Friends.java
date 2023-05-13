
public class M_76_Friends {

	private static int counter = 0;
	
	private int friendID;
	private String friendName;
	private String emailAddr;
	private int age;
	private String favoriteColor;
	
	public M_76_Friends() {
		counter++;
		this.friendID = counter;
	}
	
	public int getFriendID() {
		return friendID;
	}

	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavoriteColor() {
		return favoriteColor;
	}
	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}
	
	
	
}
