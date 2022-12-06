package com.yusra.share.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yusra.share.entity.Share;
import com.yusra.share.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {
	
	@Autowired
	private ShareDao shareDao;

	@Override
	public Share searchShareById(int id) {
		return shareDao.findById(id).orElse(null);
	}

}
