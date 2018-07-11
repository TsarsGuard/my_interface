package Dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import entity.MyInterface;


@Repository
public interface InterfaceDao {
	MyInterface selectById(String id);
	
	MyInterface selectByName(String name);
	
	ArrayList<MyInterface> selectAll();
	
	void delete(String id);
	
	void updateById(MyInterface my);
	
	void insert(MyInterface my);
}