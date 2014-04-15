package HSLU;

import java.util.Objects;

public class Mountain implements Comparable<Mountain>{
    private String name;
    private int height;
    private double latitude, longitude;

    public Mountain(String name, int height){

        this.name = name;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    public int getHeight()
    {
        return height;
    }

    public String toString() {
        return name + " " + height;
    }

	@Override
    public boolean equals(Object other) {
        if(this == other)
            return true;
        if(other == null)
            return false;
        if(this.getClass() != other.getClass()){
			return false;
		}
		else{
			Mountain m = (Mountain)other;
			if(this.getName() == m.getName())
				return (this.getHeight() == m.getHeight());
		}
		return false;
    }

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 43 * hash + Objects.hashCode(this.name);
		hash = 43 * hash + this.height;
		return hash;
	}

    public int compareTo(Mountain other) {
        if(this.equals(other))
			return 0;
		return (this.getHeight() - other.getHeight());
    }
}