class NonVegMenu {

    public void getNonVegMenu() {
        System.out.println("Non-Veg Menu");
    }

    public void nonVegItems(String item) {
        System.out.println("Non-Veg Items");
        if (item=="Chicken"){
		   System.out.println("Available");
		}
        else if (item=="Mutton"){
		  System.out.println("Available");
		}
        else if (item=="Fish"){
		   System.out.println("Available");
		}
        else if (item=="Prawns"){
		   System.out.println("Available");
		}
        else if (item=="Egg Curry"){
		  System.out.println("Available");
		}
        else if (item=="Crab"){
      		System.out.println("Available");
	    }
        else if (item=="Duck"){
		  System.out.println("Available");
		}
        else if (item=="Beef"){
		  System.out.println("Available");
		}
        else if (item=="Turkey"){ 
		  System.out.println("Available");
		}
        else if (item=="Lobster"){
		  System.out.println("Available");
		}
        else{
		  System.out.println("Not Available");
		}
    }
}