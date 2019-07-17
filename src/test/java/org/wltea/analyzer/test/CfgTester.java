/**
 * 
 */
package org.wltea.analyzer.test;

import org.wltea.analyzer.IKSegmentation;
import org.wltea.analyzer.Lexeme;
import junit.framework.TestCase;
import org.wltea.analyzer.cfg.Configuration;

import java.io.StringReader;

/**
 * @author Administrator
 *
 */
public class CfgTester extends TestCase{
	
	public void testCfgLoading(){
		try {
			System.out.println(Configuration.getExtDictionarys().size());
//		System.out.println(Configuration.getExtStopWordDictionarys().size());
			String address1 = "西藏自治区日喀则地区日喀则市";
			String address = "安徽省安庆市怀宁县江镇镇日新村河西组037号";
			String address3 = "上海市闵行区都市路3000号";
//		List<Map<String,String>> list = getCardDetail(address);
//		log.info(JSON.toJSONString(list));
			StringReader sr=new StringReader(address);
			IKSegmentation ik=new IKSegmentation(sr,true);
			Lexeme lex=null;
			while((lex=ik.next())!=null){
				System.out.print(lex.getLexemeText()+"|");
			}
		}catch (Exception e){

		}
//

	}

}
