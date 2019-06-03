package cn.edu.cqcet.yd1702.team02.core.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.cqcet.yd1702.team02.core.dao.BaseDictDao;
import cn.edu.cqcet.yd1702.team02.core.po.BaseDict;
import cn.edu.cqcet.yd1702.team02.core.service.BaseDictService;
/**  
* ����ʱ�䣺2019��6��3�� ����10:56:42  
* ��Ŀ���ƣ�BOOT_CRM  
* @author ��ʥ��
* @version 1.0   
* @since JDK 1.8.0_191
* �ļ����ƣ�BaseDictServiceImpl.java  
* ��˵����  �����ֵ�Service�ӿ�ʵ����
*/
@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService{
	@Autowired
	private BaseDictDao baseDictDao;
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode){
		return baseDictDao.selectBaseDictByTypeCode(typecode);
	}
}