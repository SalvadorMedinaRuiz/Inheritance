package defualt;

public class override extends Triangle{
	
	@Override
	public boolean equals(Object otherObject) {
		if(otherObject instanceof Triangle)
	        return false;
	      else if(getClass() != otherObject.getClass()) // if this class is not the same as otherObject, returns false
	        return false;
	      else
	    	  return false;
	}
}
