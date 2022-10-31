
package com.miPortfolioWeb.Springboot.repository;

import com.miPortfolioWeb.Springboot.model.HardSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHardSkillsRepository extends JpaRepository <HardSkills, Long>{
    
}
