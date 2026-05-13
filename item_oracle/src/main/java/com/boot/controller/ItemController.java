package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.dto.ItemDTO;
import com.boot.service.ItemContentService;
import com.boot.service.ItemWriteService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	@Autowired
	private ItemWriteService writeService;
	
	@Autowired
	private ItemContentService contentService;

	// 상품 조회
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		log.info("@# content_view()");
		
		ArrayList<ItemDTO> list = contentService.list();
		model.addAttribute("list", list);
		
		return "content_view";
	}

	// 등록 페이지
	@RequestMapping("/write_view")
	public String write_view() {
		log.info("@# write_view()");

		return "item_write";
	}

	// 상품 등록
	@RequestMapping("/write_result")
	public String write_result(@RequestParam HashMap<String, String> param) {
		log.info("@# write_result()");
		writeService.write(param);

		return "write_result";
	}
}