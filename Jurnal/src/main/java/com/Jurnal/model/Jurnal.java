package com.Jurnal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jurnal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String ziua;
	private String thought;
	private String title;
	private String goal;
	private String mood;
	private String reading;

	public Jurnal() {
		super();
	}

	public Jurnal(Long id, String ziua, String thought, String title, String goal, String mood, String reading) {
		super();
		this.id = id;
		this.ziua = ziua;
		this.thought = thought;
		this.title = title;
		this.goal = goal;
		this.mood = mood;
		this.reading = reading;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZiua() {
		return ziua;
	}

	public void setZiua(String ziua) {
		this.ziua = ziua;
	}

	public String getThought() {
		return thought;
	}

	public void setThought(String thought) {
		this.thought = thought;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public String getReading() {
		return reading;
	}

	public void setReading(String reading) {
		this.reading = reading;
	}

	@Override
	public String toString() {
		return "Jurnal [id=" + id + ", ziua=" + ziua + ", thought=" + thought + ", title=" + title + ", goal=" + goal
				+ ", mood=" + mood + ", reading=" + reading + "]";
	}

}
