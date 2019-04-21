package com.fosu.service.grade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fosu.dao.grade.GradeMapper;
import com.fosu.enums.TeacherResultEnum;
import com.fosu.exception.TeacherException;
import com.fosu.pojo.Grade;
import com.fosu.serviceInf.grade.GradeInf;



@Service
public class GradeService implements GradeInf{

	@Autowired
	private GradeMapper gradeMapper;
	
	//测试增加年级用户 -不重复
	@Override
	@Transactional
	public void insertGrade(Grade grade) {
		// TODO Auto-generated method stub
		
		gradeMapper.insertGrade(grade);
		
	}
	//查询年级单位返回id
	@Override
	@Transactional
	public Integer findGrade_base(Grade grade) throws Exception{
		// TODO Auto-generated method stub
		
		List<Integer> list = gradeMapper.findGrade_base(grade);
		
		//查找为空时，抛出查找为空异常
		if(list.isEmpty() ) {
			System.out.println("查询空");
			throw new TeacherException(TeacherResultEnum.GRADE_findNULL);
		}
		//取到grade_id
		Integer grade_id = list.get(0);
		return grade_id;
	}
	//查询年级单位返回id(没有就增加)      
	//--> 该api仅仅由老师管理  学生一般
	//格式可能会出错
	//学生添加可能会出错
	//用选项框规范好一点
		public Integer findGradeAdd(Grade grade) throws Exception{
			
			
			//输入有一项为空
			if(grade.getClass()== null || grade.getGrade_period() == null || grade.getGrade_specialty()==null )
			{
				System.out.println("输入有一项为空");
				throw new TeacherException(TeacherResultEnum.Grade_writeNULL);
			}
			
			List<Integer> grade_list = gradeMapper.findGrade_base(grade);
			
			//如果数据库无该年级单位  增加
			if(grade_list.size() == 0) {
				
				//需增加log 
				gradeMapper.insertGrade(grade);
			}
			//有
			Integer grade_id = grade.getGrade_id();
			
			if(grade_id != null)
			return grade_id;
			
			else
			{
				
				System.out.println("增加年级失败");
				throw new TeacherException(TeacherResultEnum.Grade_writeNULL);
			}

			
		}
	
}
