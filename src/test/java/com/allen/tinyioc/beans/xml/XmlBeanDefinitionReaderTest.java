package com.allen.tinyioc.beans.xml;

import com.allen.tinyioc.beans.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;
import com.allen.tinyioc.beans.BeanDefinition;

import java.util.Map;

/**
 * @author yihua.huang@dianping.com
 */
public class XmlBeanDefinitionReaderTest {

	@Test
	public void test() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
		Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
		Assert.assertTrue(registry.size() > 0);
	}
}
