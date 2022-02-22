package com.marondal.test.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marondal.test.lesson01.model.BoardContent;

@RestController //@Controller + @ResponseBody
@RequestMapping("/lesson01/test01")
public class Test01RestController {
	
	@RequestMapping("/3")
	public List<Map<String, Object>> printMap(){
		
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object>	map1 = new HashMap<>();
		map1.put("rate", 15);
		map1.put("director", "����ȣ");
		map1.put("time", 131);
		map1.put("title", "�����");
		list.add(map1);
		
		Map<String, Object>	map2 = new HashMap<>();
		map2.put("rate", 0);
		map2.put("director", "�κ���Ʈ ���ϴ�");
		map2.put("time", 116);
		map2.put("title", "�λ��� �Ƹ��ٿ�");
		
		list.add(map2);

		return list;	
	}
	
@RequestMapping("/4")	
	public List<BoardContent> printListObject() {
	
		List<BoardContent> list = new ArrayList<>();
	
		BoardContent boardContent1  = new BoardContent();
		boardContent1.setTitle("�ȳ��ϼ���. �����λ� �帳�ϴ�.");
		boardContent1.setContent("�ȳ��ϼ��� �����߾��. �����");
		boardContent1.setContent("���α�");
		list.add(boardContent1);
		
		BoardContent boardContent2  = new BoardContent();
		boardContent2.setTitle("�� ���.");
		boardContent2.setContent("�� �ƴϾ�~");
		boardContent2.setContent("�ٴ�");
		list.add(boardContent2);
		
		
		BoardContent boardContent3  = new BoardContent();
		boardContent3.setTitle("���� ��ģ ���� �� Ǭ��.");
		boardContent3.setContent(".............");
		boardContent3.setContent("dulumary");
		list.add(boardContent3);
		
		return list;
		
	}
@RequestMapping("/5")	
	public ResponseEntity<BoardContent> entity() {
		BoardContent boardContent1  = new BoardContent();
		boardContent1.setTitle("�ȳ��ϼ���. �����λ� �帳�ϴ�.");
		boardContent1.setContent("�ȳ��ϼ��� �����߾��. �����");
		boardContent1.setContent("���α�");
		
		ResponseEntity<BoardContent> entity = new ResponseEntity<>(boardContent1, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
		
		
	}

}
