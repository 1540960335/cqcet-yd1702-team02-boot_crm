package cn.edu.cqcet.yd1702.team02.core.dao;
import java.util.List;
import cn.edu.cqcet.yd1702.team02.core.po.BaseDict;
/**  
* ����ʱ�䣺2019��6��3�� ����10:12:07  
* ��Ŀ���ƣ�BOOT_CRM  
* @author ��ʥ��
* @version 1.0   
* @since JDK 1.8.0_191
* �ļ����ƣ�BaseDictDao.java  
* ��˵����  �����ֵ�
*/
public interface BaseDictDao {
	// �����������ѯ�����ֵ�
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}