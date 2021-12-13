package com.Jurnal.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

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
		 @Lob
		  private Blob bookImage;
		

		public Jurnal() {
			super();
		}



		


		public Jurnal(Long id, String data, String title, String goalToday, String moodToday, String currentlyReading,
				Blob bookImage) {
			super();
			this.id = id;
			this.data = data;
			this.title = title;
			this.goalToday = goalToday;
			this.moodToday = moodToday;
			this.currentlyReading = currentlyReading;
			this.bookImage = bookImage;
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






		public Blob getBookImage() {
			return bookImage;
		}






		public void setBookImage(Blob bookImage) {
			this.bookImage = bookImage;
		}






		@Override
		public String toString() {
			return "Jurnal [id=" + id + ", data=" + data + ", title=" + title + ", goalToday=" + goalToday
					+ ", moodToday=" + moodToday + ", currentlyReading=" + currentlyReading + ", bookImage=" + bookImage
					+ "]";
		}








				
		
		
		
		
		
		
		
		
}
