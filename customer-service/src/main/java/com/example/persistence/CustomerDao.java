package com.example.persistence;

import com.example.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Detail, Integer> {

    public List<Detail> searchDetailByCustomerId(int customerId);
}
