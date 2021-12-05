package com.jurnal.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jurnal {


@Id	
@GeneratedValue(strategy= GenerationType.AUTO)

	private Long id;
	private String date;
	private String title;
	private String text;
	private String goalToday;
	private int progressMadeToday;
	private String moodToday;
	private String currentlyReading;
	private Blob coverBook;
	private String websiteToday;
	
	
	// constructor gol
	public Jurnal() {
		super();
		

	}

	// constructor cu parametri
	public Jurnal(Long id, String date, String title, String text, String goalToday, int progressMadeToday,
			String moodToday, String currentlyReading, Blob coverBook, String websiteToday) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.text = text;
		this.goalToday = goalToday;
		this.progressMadeToday = progressMadeToday;
		this.moodToday = moodToday;
		this.currentlyReading = currentlyReading;
		this.coverBook = coverBook;
		this.websiteToday = websiteToday;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getGoalToday() {
		return goalToday;
	}

	public void setGoalToday(String goalToday) {
		this.goalToday = goalToday;
	}

	public int getProgressMadeToday() {
		return progressMadeToday;
	}

	public void setProgressMadeToday(int progressMadeToday) {
		this.progressMadeToday = progressMadeToday;
	}

	public String getMoodToday() {
		return moodToday;
	}

	public void setMoodToday(String moodToday) {
		this.moodToday = moodToday;
	}

	public String getCurrentlyReading() {
		return currentlyReading;
	}

	public void setCurrentlyReading(String currentlyReading) {
		this.currentlyReading = currentlyReading;
	}

	public Blob getCoverBook() {
		return coverBook;
	}

	public void setCoverBook(Blob coverBook) {
		this.coverBook = coverBook;
	}

	public String getWebsiteToday() {
		return websiteToday;
	}

	public void setWebsiteToday(String websiteToday) {
		this.websiteToday = websiteToday;
	}

	@Override
	public String toString() {
		return "Jurnal [id=" + id + ", date=" + date + ", title=" + title + ", text=" + text + ", goalToday="
				+ goalToday + ", progressMadeToday=" + progressMadeToday + ", moodToday=" + moodToday
				+ ", currentlyReading=" + currentlyReading + ", coverBook=" + coverBook + ", websiteToday="
				+ websiteToday + "]";
	}
	
	
	
}
