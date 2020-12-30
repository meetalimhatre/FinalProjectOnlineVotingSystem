package edu.npu.votingsystem.domain;

public class Vote {
	private String username,votes;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	int javaCount,dotnetCount,pythonCount,cCount,c1Count;

	public int getJavaCount() {
		return javaCount;
	}

	public void setJavaCount(int javaCount) {
		this.javaCount = javaCount;
	}

	public int getDotnetCount() {
		return dotnetCount;
	}

	public void setDotnetCount(int dotnetCount) {
		this.dotnetCount = dotnetCount;
	}

	public int getPythonCount() {
		return pythonCount;
	}

	public void setPythonCount(int pythonCount) {
		this.pythonCount = pythonCount;
	}
	
	public int getCCount() {
		return cCount;
	}

	public void setCCount(int cCount) {
		this.cCount = cCount;
	}
	
	public int getC1Count() {
		return c1Count;
	}

	public void setC1Count(int c1Count) {
		this.c1Count = c1Count;
	}

	public Vote() {
		// TODO Auto-generated constructor stub
	}

	public String getVotes() {
		return votes;
	}

	public void setVotes(String votes) {
		this.votes = votes;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
