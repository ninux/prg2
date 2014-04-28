/*
 * Copyright (C) 2014 ninux
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package solidworks;

public class Cube implements Comparable {
	private int number = -1;
	private int s1 = -1;
	private int s2 = -1;
	private int s3 = -1;

	public Cube(int no, int a, int b, int c) {
		number = no;
		s1 = a;
		s2 = b;
		s3 = c;
	}

	public int getVolume() {
		return s1 * s2 * s3;
	}
	
	public int getSurface(){
		return 2*(s1*s2 + s1*s3 + s2*s3);
	}
	
	public int getMaxDimension(){
		return Math.max(Math.max(s1, s2), s3);
	}
	
	public String toString(){
		String result = "";
		result = result + getLine(20);
		result = result + getStatus();
		// result = result + getLine(20);
		return result;
	}
	
	public boolean equals(Object other){
		if(other == this) return true;
		if(other == null) return false;
		if(other.getClass() == this.getClass()){
			Cube a = (Cube)other;
			if(a.getVolume() == this.getVolume()) return true;
		}
		return false;
	}
	
	// source: http://stackoverflow.com/questions/16629893
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime*result + (int) (s1 ^ (s1 >>> 32));
		result = prime*result + (int) (s2 ^ (s2 >>> 32));
		result = prime*result + (int) (s3 ^ (s3 >>> 32));
		return result;
	}
	
	@Override
	public int compareTo(Object other){
		Cube a = (Cube)other;
		int diff = a.getVolume() - this.getVolume();
		if(diff == 0) return 0;
		if(diff > 0) return 1;
		return -1;
	}
	
	private String getLine(int length){
		String result = "";
		for(int i = 0; i < length; i++){
			result = result + "-";
		}
		result = result + "\n";
		return result;
	}
	
	private String getStatus(){
		String result = "Sides: " + s1 + " " + s2 + " " + s3 + "\n";
		result = result + "Volume: " + getVolume() + "\n";
		result = result + "Surface: " + getSurface() + "\n";
		return result;
	}

	
	
}
