package cn.edu.cqcet.yd1702.team02.core.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @title: MD5.java
 * @className: MD5
 * @description: //TODO
 * @author: ����
 * @studentId: 2017180243
 * @Date: 2019��6��4�� ����12:12:30
 */
public class MD5 {
	    //��̬������������Ϊ������
	        public static String getMd5(String string){
	            try {
	                //������ϢժҪ����ʵ��
	                MessageDigest md = MessageDigest.getInstance("MD5");
	                //��ȡ�ı�����Ϊ�ֽ�
	                md.update(string.getBytes());
	                //�����ֽ�ժҪ����
	                byte b[] = md.digest();
	                //���� int ���ͱ���i
	                int i;
	                //����StringBuffer����
	                StringBuffer buf = new StringBuffer("");
	                for (int j = 0; j < b.length; j++) {    
	                    i = b[j];
	                    if (i < 0)                  
	                        i += 256;   //md5�����32λ�ַ�.һ���ַ�ռ8���ֽ�.���������256���ֽڵ��ַ���
	                    if (i < 16)     //һ���ַ�=8���ֽ� 0-15�����ַ����ַ���0ƴ��  
	                    buf.append("0"); 
	                    buf.append(Integer.toHexString(i));//int����10����ת16����                     
	                }
	                //32λ����
	                return buf.toString();
	                // 16λ�ļ���  
	                //return buf.toString().substring(8, 24);   
	            } catch (NoSuchAlgorithmException e) {
	                e.printStackTrace();
	                return null;
	            }

	        }
}
