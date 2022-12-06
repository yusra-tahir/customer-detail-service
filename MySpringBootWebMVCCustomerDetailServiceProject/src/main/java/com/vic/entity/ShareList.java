package com.vic.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vic
 * date: 06/12/2022
 * purpose: The ENTITY Class for A SHARE LIST
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShareList {

	//declare and instantiate a List of the 'Share' object:
	List<Share> shares;
}
