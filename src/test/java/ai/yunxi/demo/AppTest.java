package ai.yunxi.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ai.yunxi.demo.controller.Payment;
import ai.yunxi.demo.controller.PaymentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class AppTest {
	@Autowired
	private PaymentService service;

	@Test
	public void test() {
		Payment p = service.getById();
		System.out.println(p.getBrandId() + ", " + p.getProductId() + ", " + p.getPayPrice());
	}
}
