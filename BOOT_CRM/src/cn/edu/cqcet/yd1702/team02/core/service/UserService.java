package cn.edu.cqcet.yd1702.team02.core.service;

import cn.edu.cqcet.yd1702.team02.core.po.User;

/**
 * @title: UserService.java
 * @className: UserService
 * @description: �û�Service��ӿ�
 * @author: ����
 * @studentId: 2017180243
 * @Date: 2019��5��28�� ����10:12:30
 */
public interface UserService {
	// ͨ���˺ź������ѯ�û�
	public User findUser(String usercode,String password);
}
