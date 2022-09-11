package org.sujitmaity.ExceptionHandling.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sujitmaity.ExceptionHandling.Entity.StudentEntity;

@Repository
public interface StudentDAO extends JpaRepository<StudentEntity, Integer>{
	
	public void deleteBystdDept(String std1);
	
	public void deleteBystdName(String std2);
	
	public void deleteByStdDeptOrStdName(String std1, String std2);
	
	public List<StudentEntity> findByStdDeptAndStdName(String std1, String std2);

}
