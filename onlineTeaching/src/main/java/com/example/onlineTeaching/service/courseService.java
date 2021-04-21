package com.example.onlineTeaching.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineTeaching.DAO.courseDAO;
import com.example.onlineTeaching.models.course;

@Service
@Transactional
public class courseService {
	@Autowired
	courseDAO cDao;
	
	public void addCourse(course c )
	{
		cDao.save(c);
	}
	public ArrayList<course> findAllCourses()
	{
		return (ArrayList<course>) cDao.findAll();
	}
	public Optional<course> findCourseById(int id )
	{
		return cDao.findById(id);
	}

}
