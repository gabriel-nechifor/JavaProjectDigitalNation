package com.Jurnal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jurnal {
	
	@Id	
	@GeneratedValue(strategy= GenerationType.IDENTITY)

		private Long id;
		private String data;
		private String title;
		private String goalToday;
		private String moodToday;
		private String currentlyReading;
		

		public Jurnal() {
			super();
		}



		public Jurnal(Long id, String data, String title, String goalToday, String moodToday, String currentlyReading) {
			super();
			this.id = id;
			this.data = data;
			this.title = title;
			this.goalToday = goalToday;
			this.moodToday = moodToday;
			this.currentlyReading = currentlyReading;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getData() {
			return data;
		}


		public void setData(String data) {
			this.data = data;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getGoalToday() {
			return goalToday;
		}


		public void setGoalToday(String goalToday) {
			this.goalToday = goalToday;
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
