package spring;

public class UserDaoImpl implements IUserDao {

	public UserDaoImpl()
	{
		System.out.println("new UserDaoImpl() 实例化");
	}
	
	@Override
	public void selectUser() {
		System.out.println("UserDaoImpl.selectUser..........杰成11111");
	}
}
