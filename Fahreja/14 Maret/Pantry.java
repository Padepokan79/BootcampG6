class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this.jar1 = jar1 ;
    this.jar2 = jar2 ;
    this.jar3 = jar3 ;
    selected = null ;
  }
  Pantry (Jam jar1,Jam jar2){
	  this.jar1 = jar1;
	  this.jar2 = jar2;
	  this.jar3 = null ;
	  selected = null;
  }

  // Methods
  public void print()
  {
    System.out.print("1: "); jar1 . print() ;
    if (jar2 != null) {
		System.out.print("2: "); jar2 . print() ;
	}
    	if (jar3 != null) {
    		System.out.print("3: "); jar3 . print() ;
    	}
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if ( jarNumber == 1 ) {
      selected =  jar1 ;
    	return true;
    }else if ( jarNumber == 2 ) {
      selected = jar2 ;
    	return true;
    }else if (jarNumber == 3) {
      if (jar3 == null) {
		return false;
      }else {
    	 selected = jar3 ;
    	return true;
      }
    }else {
    	return  true;
    }
  }

  // spread the selected jam
  public void spread( int oz ){
    selected.spread(oz) ;
  }
  public void replace(Jam j, int slot) {
		  if (slot == 1) {
			this.jar1 = j;
		}else if (slot == 2) {
			this.jar2 = j;
		}else if (slot ==3) {
			this.jar3 = j;
		}else {
			
		}
  }
	  public void mixedFruit(){
		  if (jar1.capacity <= 2 && jar2.capacity <= 2 && jar3.capacity <= 2) {
			  jar1.capacity = jar1.capacity + jar2.capacity+jar3.capacity;
			  jar1.contents = "Mixed Fruit";
			  this.jar2 = null;
			  this.jar3 = null;
		  }
	 
	  }
}
