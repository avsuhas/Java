package com.samson;

public class Triangle {
	
	public Triangle(String type){
		this.type = type;
		
	}
	
		private String type;
		
		public String getType() {
			return type;
		}

		/*public void setType(String type) {
			this.type = type;
		}
*/
		public void draw() {
			System.out.println(getType()+" Triangle Draw");
		}

	}


