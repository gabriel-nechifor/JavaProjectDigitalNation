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
		
		
		public Jurnal() {
			super();
		}


		public Jurnal(Long id, String data, String title) {
			super();
			this.id = id;
			this.data = data;
			this.title = title;
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
