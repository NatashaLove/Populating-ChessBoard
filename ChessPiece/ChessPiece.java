package ChessPiece;

public class ChessPiece {
	
	
	String c;
	String n;
	private int column; 
	private int row;
	
	//in order to return multiple values - use array:
    public String[] getPosition(){
		
		//locating memory for 2 new vars - position 2D
		String position[] = new String [2];
		
		//convert int to string
		String columnAsString = Integer.toString(column);
		String rowAsString = Integer.toString(row);
		position[0]=columnAsString;
		position[1]=rowAsString;
	
	// returns MEMORY LOCATIONS of array elements! ([Ljava.lang.String;@15db9742)
		return position;
	}
	
    public void setPosition(int x, int y){	
		column=x;
		row=y;
	}
	
	public String getColor(){
	   return c;
    }
	
	public void setColor(String color){
		c=color;
	}
	
    public String getPieceType(){
		return n;
	}
	
    public void setPieceType(String name){
	   n=name;
    }
	
	//to print 2 returned values of array (not memory location) use additional: var []= getPosition();
	//and type every element of array in text + position [0]+...;
	
	public String printInfo(){
		String position[]= getPosition();

		return "\nYour chess piece is a " + getColor() + getPieceType() + 
		" \nChess position is x/column:" + position[0] + " and y/row: " + position[1]+ "\n"; // = getPosition() - but this returns MEMORY LOCATION!!!
		// 	INSTEAD OF:  return "Your chess piece is " + getColor() + getPieceType() + 
		//!!! GETPOSITION(); !!!

	}

}