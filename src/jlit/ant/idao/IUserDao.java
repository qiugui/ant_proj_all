package jlit.ant.idao;

import java.util.List;

import jlit.ant.vo.User;

/**
 * 操作用户数据库的接口
 * @author Gui
 * @version SNAPSHOT-1.0.1
 */
public interface IUserDao {

	/**
	 * 添加用户对象，如果用户名存在则抛出UserException
	 * @param user 要添加的用户
	 */
	public void add(User user);
	
	/**
	 * 通过id删除用户对象，如果用户不存在则抛出UserException
	 * @param id 要删除的用户id
	 */
	public void deleteById(int id);
	
	/**
	 * 通过用户名删除用户对象，如果用户不存在则抛出UserException
	 * @param username 要删除的用户用户名
	 */
	public void deleteByUsername(String username);
	
	/**
	 * 修改用户，如果用户不存在则抛出UserException
	 * @param user 要修改的用户
	 */
	public void update(User user);
	
	/**
	 * 通过id加载用户对象，如果不存在则返回null
	 * @param id 用户对象id
	 * @return 用户对象，不存在返回null
	 */
	public User load(int id);
	
	/**
	 * 用户登录
	 * @param username 登录用户的用户名
	 * @param password 登录用户的密码
	 * @return 如果登录成功返回登录对象，否则抛出异常
	 */
	public User login(String username, String password);
	
	/**
	 * 列出所有用户
	 * @return 所有存在的用户
	 */
	public List<User> list();
}
