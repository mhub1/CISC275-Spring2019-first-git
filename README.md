# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
3 Dog objects and 2 Animal objects

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
The comparator constructor call is on line 16 (new Comparator<Animal>()).
The class definition is right under the constructor call.		
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}