package com.railworld.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.railworld.entity.Hr1;

@Repository
public interface HrRepository extends JpaRepository<Hr1,Long> {

}
