class VegMenu {

    public void getVegMenu() {
        System.out.println("Veg Menu");
    }

    public void vegItems(String item) {
        System.out.println("Veg Items");
        if (item=="Paneer"){
		  System.out.println("Available");
		}
        else if (item=="Dal"){
      		System.out.println("Available");
		}
        else if (item=="Chapati"){
		  System.out.println("Available");
		}
        else if (item=="Veg Biryani"){
		  System.out.println("Available");
		}
        else if (item=="Fried Rice"){
		  System.out.println("Available");
		}
        else if (item=="Noodles"){
		  System.out.println("Available");
		} 
        else if (item=="Burger"){
		  System.out.println("Available");
		}
        else if (item=="Pizza"){ 
		  System.out.println("Available");
		}
        else if (item=="Sandwich"){
		  System.out.println("Available");
		}
        else if (item=="Soup"){ 
		   System.out.println("Available");
		}
        else {
		   System.out.println("Not Available");
		}
    }
}