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

	// ����id��ѯ
	public MyInterface selectById(String id) {
		return interfaceDao.selectById(id);
	}

	// �������Ʋ�ѯ
	public MyInterface selectByName(String name) {
		return interfaceDao.selectByName(name);
	}

	// ��ѯ����
	public ArrayList<MyInterface> selectAll() {
		return interfaceDao.selectAll();
	}

	// ɾ��
	public void delete(String id) {
		interfaceDao.delete(id);
	}

	// ����
	public void updateById(MyInterface my) {
		interfaceDao.updateById(my);
	}
	
	// ����
	public void insert(MyInterface my) {
		interfaceDao.insert(my);
	}
}
