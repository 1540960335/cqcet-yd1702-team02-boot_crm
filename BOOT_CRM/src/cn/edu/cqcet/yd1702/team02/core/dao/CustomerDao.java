package cn.edu.cqcet.yd1702.team02.core.dao;
import java.util.List;
import cn.edu.cqcet.yd1702.team02.core.po.Customer;
/**  
* ����ʱ�䣺2019��6��3�� ����9:30:53  
* ��Ŀ���ƣ�BOOT_CRM  
* @author ��ʥ��
* @version 1.0   
* @since JDK 1.8.0_191
* �ļ����ƣ�CustomerDao.java  
* ��˵����  CustomerDao�ӿ�
*/
public interface CustomerDao {
	//�ͻ��б�
	public List<Customer> selectCustomerList(Customer customer);
	//�ͻ���
	public Integer selectCustomerListCount(Customer customer);
	
	/**
	 *  * @author ����
	 * 2017180208
	 * @time 2019��6��4��
	 * 
	 */
	//�����ͻ�
	public int createCustomer (Customer customer);
	//ͨ��id��ѯ�ͻ�
	public Customer getCustomerById(Integer id);
	//���¿ͻ�
	public int updateCustomer(Customer customer);
	//ɾ���ͻ�
	int deleteCustomer (Integer id);
}
