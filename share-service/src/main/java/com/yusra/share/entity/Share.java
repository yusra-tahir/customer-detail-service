package com.yusra.share.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Share {
	
	@Id
	private int shareId;
	private String shareName;
	private double sharePrice;

}
