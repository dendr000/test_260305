package com.boot.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.ItemDAO;

@Service
public class ItemWriteService {

	@Autowired
	private SqlSession sqlSession;
	public void write(HashMap<String, String> param) {
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		dao.write(param);
	}
}