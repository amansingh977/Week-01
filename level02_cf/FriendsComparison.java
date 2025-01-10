import java.util.Scanner;

class FriendsComparison {
    public static void main(String[] args) {
		
		// Creating object of scanner class
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        int amarHeight = sc.nextInt();

        // Taking user input
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = sc.nextInt();

        // Taking user input
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = sc.nextInt();

        // Determining the youngest friend
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Determining the tallest friend
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display results
        System.out.println("The youngest friend is: " + youngestFriend + " and Age is: " + youngestAge + " cm ");
        System.out.println("Largest among 3 heights is: " + tallestFriend + " and Height is: " + tallestHeight + "cm");

        // Scanner class closed
        sc.close();
    }
}
