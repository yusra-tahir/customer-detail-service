package com.yusra.share.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yusra.share.entity.Share;

@Repository
public interface ShareDao extends JpaRepository<Share, Integer> {

}
