package main.java.com.test.dao;

import main.java.com.test.base.BaseDao;
import main.java.com.test.pojo.Count;

public interface CountDao extends BaseDao<Count> {
	int findCount();
	void updateCount();
}
