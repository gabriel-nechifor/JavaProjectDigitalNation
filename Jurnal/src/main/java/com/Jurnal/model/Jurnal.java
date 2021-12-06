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
		private String date;
		private String title;
		
		
		public Jurnal() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Jurnal(Long id, String date, String title) {
			super();
			this.id = id;
			this.date = date;
			this.title = title;
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
