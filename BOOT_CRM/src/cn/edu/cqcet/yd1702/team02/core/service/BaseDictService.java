package cn.edu.cqcet.yd1702.team02.core.service;
import java.util.List;
import cn.edu.cqcet.yd1702.team02.core.po.BaseDict;
/**  
* ����ʱ�䣺2019��6��3�� ����10:34:48  
* ��Ŀ���ƣ�BOOT_CRM  
* @author ��ʥ��
* @version 1.0   
* @since JDK 1.8.0_191
* �ļ����ƣ�BaseDictService.java  
* ��˵����  �����ֵ�Service�ӿ�
*/
public interface BaseDictService {
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
