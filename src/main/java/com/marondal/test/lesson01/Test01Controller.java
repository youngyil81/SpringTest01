package com.marondal.test.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/test01")
public class Test01Controller {
	@RequestMapping("/1")
	@ResponseBody
	public String welcome() {
		return "<h2>�׽�Ʈ ������Ʈ �ϼ�</h2> �ش� ������Ʈ�� ���ؼ� ���� Ǯ�̸� �����մϴ�";
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Integer> printMap ()	 {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 90);
		map.put("����", 95);
		map.put("����", 85);
		
		return map;
	}

}
