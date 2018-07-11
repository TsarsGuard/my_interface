package Service;

import Dao.InterfaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.MyInterface;
import java.util.ArrayList;
import java.util.List;

@Service
public class InterfaceService implements InterfaceDao {
	@Autowired
	private InterfaceDao interfaceDao;

	// 根据id查询
	public MyInterface selectById(String id) {
		return interfaceDao.selectById(id);
	}

	// 根据名称查询
	public MyInterface selectByName(String name) {
		return interfaceDao.selectByName(name);
	}

	// 查询所有
	public ArrayList<MyInterface> selectAll() {
		return interfaceDao.selectAll();
	}

	// 删除
	public void delete(String id) {
		interfaceDao.delete(id);
	}

	// 更新
	public void updateById(MyInterface my) {
		interfaceDao.updateById(my);
	}
	
	// 插入
	public void insert(MyInterface my) {
		interfaceDao.insert(my);
	}
}
