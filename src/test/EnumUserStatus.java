package test;

enum UserStatus {
	PENDING,
	ACTIVE,
	INACTIVE,
	DELETED;
}

public class EnumUserStatus {
	public static void main(String[] args) {

		//ACTIVE
		System.out.println(UserStatus.ACTIVE);
		System.out.println(UserStatus.INACTIVE);
	}
}
