public class CoffeeShop {
    
    public static void main(String[] args) {
        // 1.) Creating three Customer objects
        Customer joseph = new Customer("Joseph", 200);
        
        Customer peter = new Customer("Peter");
        
        Customer unknown = new Customer();

        // 2.) Peter now earns points from transactions
        peter.addPoints(200); 
        System.out.println("Peter earned 200 points. Total Points: " + peter.getPoints());
        
        peter.addPoints(20);  
        System.out.println("Peter earned 20 points. Total Points: " + peter.getPoints());
        
        System.out.println();

        // 3.) redeeming rewards for all customers
        joseph.redeemReward();
        
        peter.redeemReward();
        
        unknown.redeemReward();
        
        System.out.println();

        // 4.) Displaying customer's info along with total number of customers
        joseph.displayCustomerInfo();
        
        peter.displayCustomerInfo();
        
        unknown.displayCustomerInfo();
        
        Customer.displayTotalCustomers();
        
        System.out.println();

        // 5.) fourth customer Diane
        Customer diane = new Customer("Diane");
        
        diane.addPoints(50);
        
        System.out.println("Diane earned 50 points. Total Points: " + diane.getPoints());
        
        Customer.displayTotalCustomers();
        
        System.out.println();

        // 6.) Showing the rewards that each customer can redeem
        Customer.getAllowedRewardsRedemption(joseph);
        
        Customer.getAllowedRewardsRedemption(peter);
        
        Customer.getAllowedRewardsRedemption(diane);
        
        Customer.getAllowedRewardsRedemption(unknown);
    }
}


// Cherry R. Montabon 
// AI THAT USE ChatGPT-5 
// Conversation of AI 
// https://chatgpt.com/share/68f4ad01-f3d0-8005-b1e7-7799dd423efe

