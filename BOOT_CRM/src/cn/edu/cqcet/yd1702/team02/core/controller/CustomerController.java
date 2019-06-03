package cn.edu.cqcet.yd1702.team02.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.cqcet.yd1702.team02.common.utils.Page;
import cn.edu.cqcet.yd1702.team02.core.po.BaseDict;
import cn.edu.cqcet.yd1702.team02.core.po.Customer;
import cn.edu.cqcet.yd1702.team02.core.service.BaseDictService;
import cn.edu.cqcet.yd1702.team02.core.service.CustomerService;

/**  
* ����ʱ�䣺2019��6��3�� ����11:30:31  
* ��Ŀ���ƣ�BOOT_CRM  
* @author ��ʥ��
* @version 1.0   
* @since JDK 1.8.0_191
* �ļ����ƣ�CustomerController.java  
* ��˵����  �ͻ����������
*/
@Controller
public class CustomerController {
	//����ע��
	@Autowired
	private CustomerService customerService;
	@Autowired
	private BaseDictService baseDictService;
	//�ͻ���Դ
	@Value("${customer.from.type}")
	private String FROM_TYPE;
	//�ͻ�������ҵ
	@Value("${customer.industry.type}")
	private String INDUSTRY_TYPE;
	//�ͻ�
	@Value("${customer.level.type}")
	private String LEVEL_TYPE;
	/*
	 * �ͻ��б�
	 */
	@RequestMapping(value = "/customer/list.action")
	public String list(@RequestParam(defaultValue = "1")Integer page,
					   @RequestParam(defaultValue = "10")Integer rows,
					   String custName, String custSource, String custIndustry,String custLevel, Model model) {
		//������ѯ���пͻ�
		Page<Customer> customers = customerService.findCustomerList(page, rows, custName, custSource, custIndustry, custLevel);
		model.addAttribute("page", customers);
		//�ͻ���Դ
		List<BaseDict> fromType = baseDictService.findBaseDictByTypeCode(FROM_TYPE);
		//�ͻ�������ҵ
		List<BaseDict> industryType = baseDictService.findBaseDictByTypeCode(INDUSTRY_TYPE);
		//�ͻ�����
		List<BaseDict> levelType = baseDictService.findBaseDictByTypeCode(LEVEL_TYPE);
		//��Ӳ���
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		model.addAttribute("custName", custName);
		model.addAttribute("custSource", custSource);
		model.addAttribute("custIndustry", custIndustry);
		model.addAttribute("custLevel", custLevel);
		return "customer";
	}
}
