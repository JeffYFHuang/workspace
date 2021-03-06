package com.liteon.icgwearable.hibernate.entity;

// Generated Mar 1, 2017 11:14:17 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RewardsStudents generated by hbm2java
 */
@Entity
@Table(name ="rewards_students")
public class RewardsStudents implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8553809490952020066L;
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reward_id", nullable = false)
	private Rewards rewards;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id", nullable = false)
	private Students students;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher_id", nullable = false)
	private Users users;
	@Column(name = "received_count")
	private Integer receivedCount;
	//@Column(name = "comments")
	//private String comments;
	@Column(name = "created_date", columnDefinition="DATETIME")
	private Date createdDate;
	@Column(name = "updated_date", columnDefinition="DATETIME")
	private Date updatedDate;

	public RewardsStudents() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Rewards getRewards() {
		return this.rewards;
	}

	public void setRewards(Rewards rewards) {
		this.rewards = rewards;
	}

	public Students getStudents() {
		return this.students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	/*public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}*/

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Integer getReceivedCount() {
		return receivedCount;
	}

	public void setReceivedCount(Integer receivedCount) {
		this.receivedCount = receivedCount;
	}
	
}
