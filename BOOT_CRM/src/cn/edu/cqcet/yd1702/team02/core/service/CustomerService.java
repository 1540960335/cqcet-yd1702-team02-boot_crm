package cn.edu.cqcet.yd1702.team02.core.service;
import cn.edu.cqcet.yd1702.team02.common.utils.Page;
import cn.edu.cqcet.yd1702.team02.core.po.Customer;
/**  
* ����ʱ�䣺2019��6��3�� ����10:38:43  
* ��Ŀ���ƣ�BOOT_CRM  
* @author ��ʥ��
* @version 1.0   
* @since JDK 1.8.0_191
* �ļ����ƣ�CustomerService.java  
* ��˵����  
*/
public interface CustomerService {
	//��ѯ�ͻ��б�
	public Page<Customer> findCustomerList(Integer page,Integer rows,String custName,String custSource,String custIndustry,String custLevle);
}
