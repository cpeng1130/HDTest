package main.java.com.test.service.impl;

import javax.annotation.Resource;

import main.java.com.test.dao.CountDao;
import main.java.com.test.pojo.Count;
import main.java.com.test.service.CountService;


public class CountServiceImpl implements CountService{
	@Resource
	CountDao countDao;

	public void save(Count count) {
		countDao.save(count);
	}

	public void update(Count count) {
		countDao.update(count);
	}
}
