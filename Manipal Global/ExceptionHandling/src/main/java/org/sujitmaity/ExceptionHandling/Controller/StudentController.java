package org.sujitmaity.ExceptionHandling.Controller;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sujitmaity.ExceptionHandling.DAO.StudentDAO;
import org.sujitmaity.ExceptionHandling.Entity.StudentEntity;


@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentDAO stdDAO;

	@GetMapping("/getstd/{stdId}")
	public StudentEntity getStd(@PathVariable("stdId") Integer stdId) {
		Optional<StudentEntity> stdRecord = stdDAO.findById(stdId);
		return stdRecord.get();
	}

	@PostMapping("/savestd")
	public String createStudentEntity(@RequestBody StudentEntity std) {
		StudentEntity student = stdDAO.save(std);
		return "ISave Successfully" +std.getStdId();
	}

	@PutMapping("/putstd/save")
	public String updateStudent(@RequestBody StudentEntity std) {
		stdDAO.save(std);
		return std.getStdName()+ " Save Successfully";
	}

	@DeleteMapping("/deletestd")
	public String DeleteStudentEntity(@RequestBody StudentEntity std) {
		stdDAO.delete(std); 
		return "Delete Successfully";
	}

	@DeleteMapping("/deletestd/{stdDept}/{stdName}")
	@Transactional
	public String deleteStudent(@PathVariable("stdDept") String stdDept, @PathVariable("stdName") String stdName) {
//		stdDAO.deleteBystdDept(stdDept);
		stdDAO.deleteByStdDeptOrStdName(stdDept, stdName);
		return "Student Depertment Deleted Successfully";
	}

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@PutMapping("/putstd/std")
//	public String updateStudentEntity(@RequestBody StudentEntity std) {
//		stdDAO.save(std);
//		return std.getStdName()+ " Save Successfully";
//	}
//
//	@PatchMapping("/patchstd/std")
//	public String updateStudents(@RequestBody StudentEntity std) {
//		Optional<StudentEntity> std2 = stdDAO.findById(std.getStdId());
//		StudentEntity std1 = std2.get();
//		std1.setStdName(std.getStdName());
//		stdDAO.save(std1);
//		return std.getStdId() + " Updated Successfully"; 
//	}
}
