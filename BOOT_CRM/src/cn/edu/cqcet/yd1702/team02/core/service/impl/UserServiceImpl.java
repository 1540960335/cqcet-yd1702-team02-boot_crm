package cn.edu.cqcet.yd1702.team02.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.cqcet.yd1702.team02.core.dao.UserDao;
import cn.edu.cqcet.yd1702.team02.core.po.User;
import cn.edu.cqcet.yd1702.team02.core.service.UserService;

/**
 * @title: UserServiceImpl.java
 * @className: UserServiceImpl
 * @description: �û�Service�ӿ�ʵ����
 * @author: ����
 * @studentId: 2017180243
 * @Date: 2019��5��28�� ����10:13:33
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	// ע��UserDao
	@Autowired
	private UserDao userDao;
	// ͨ���˺ź������ѯ�û�
	@Override
	public User findUser(String usercode, String password) {
		User user = this.userDao.findUser(usercode, password);
		return user;
	}

}
