
package com.miPortfolioWeb.Springboot.repository;

import com.miPortfolioWeb.Springboot.model.SoftSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISoftSkillsRepository extends JpaRepository <SoftSkills, Long> {
    
}
