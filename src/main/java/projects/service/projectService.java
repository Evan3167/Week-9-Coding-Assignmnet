package projects.service;

import projects.dao.projectDao;
import projects.entity.Project;

public class projectService {
	private static projectDao projectDao = new projectDao();

//	public static Project addProject(Project project) {
//		
//		return null;
//	}
//	
	public static Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

}
