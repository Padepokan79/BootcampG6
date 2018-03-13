class Cars {
		double startMiles;
		double endMiles;
		double gallon;
		
		Cars (double first){
			startMiles = first;
		}
		
		void fillUp (double miles, double gallons) {
			endMiles = miles;
			gallon = gallons;
		}
		
		double calculateMPG() 
		{
			return (endMiles - startMiles)/gallon;
		}
		
		boolean gasHog() {
			if (calculateMPG() < 15.0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		boolean economyCar() {
			if (calculateMPG() > 30.0) {
				return true;
				
			}
			else {
				return false;
			}
		}
		
		
	}

