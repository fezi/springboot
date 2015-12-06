package fz.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		MyBeanBuilder b = MyBeanBuilder.myBean().withAnotherName("haha").withName("qwer");
		b.withAnotherBean().endAnotherBean().withF(1.0).withWrapperType(33);
		b.withIs(true).withAddedBool(true).withAddedBool(false);

		return b.build().toString();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
}
