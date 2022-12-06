package com.yusra.share.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yusra.share.entity.Share;
import com.yusra.share.service.ShareService;

@RestController
public class ShareResource {

	@Autowired
	private ShareService shareService;
	
	@GetMapping(path = "/shares/{shareId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Share searchShareById(@PathVariable("shareId") int id) {
		return shareService.searchShareById(id);
	}
}
