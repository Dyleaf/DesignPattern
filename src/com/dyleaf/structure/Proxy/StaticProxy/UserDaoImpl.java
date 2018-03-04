package structure.Proxy.StaticProxy;


/**
 * 接口实现
 * 目标对象
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("已经保存数据");
    }
}
