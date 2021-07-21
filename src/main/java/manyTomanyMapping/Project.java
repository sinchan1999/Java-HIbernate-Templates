package manyTomanyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project 
{
	@Id
	private int projId;
	private String projectName;
	
	@ManyToMany(mappedBy="projects")
	private List<Emp> emps;

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Project(int projId, String projectName, List<Emp> emps) {
		super();
		this.projId = projId;
		this.projectName = projectName;
		this.emps = emps;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
