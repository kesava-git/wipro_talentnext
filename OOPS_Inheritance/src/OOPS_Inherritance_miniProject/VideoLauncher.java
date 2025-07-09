package OOPS_Inherritance_miniProject;

import java.util.Scanner;

public class VideoLauncher {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VideoStore videostore=new VideoStore();
//		Video video=new Video();
		System.out.println("MAIN MENU");
		System.out.println("=========");
		System.out.print("1.Add Videos : \n2.Check Out Video : \n3.Return Video : \n4.Receive Rating : \n5.List Inventory : \n6.Exit : \nEnter your choice (1..6): ");
		int choice=sc.nextInt();
		int rating;
		while(choice!=6) {
	
			switch(choice) {
				case 1:
					
					System.out.print("Enter the name of the video you want to add: ");
					String v_name=sc.nextLine();
					videostore.addVideo(v_name);
					System.out.println("Video "+"\""+v_name+"\""+" added successfully");
					break;
				case 2:
					System.out.print("Enter the name of the video you want to check out: ");
					String check_name=sc.nextLine();
					videostore.doCheckout(true);
					System.out.println("Video "+"\""+check_name+ "\""+"checked out successfully");
					break;
				case 3:
					System.out.print("Enter the name of the video you want to Return: ");
					String return_name=sc.nextLine();
					videostore.doCheckout(false);
					System.out.println("Video "+"\""+return_name+ "\""+"returned successfully");
					break;
				case 4:
					System.out.println("Enter the name of the video you want to Rate: ");
					String rate_name=sc.nextLine();
					System.out.println("Enter the rating for this video: ");
					rating=sc.nextInt();
					videostore.receiveRating(rate_name, rating);
					System.out.println("Rating "+"\""+rating+"\""+" has been mapped to the Video "+"\""+rate_name+"\"");
					break;
				case 5:
					System.out.println("---------------------------------------------------------");
					System.out.println();
					break;
				case 6:
					System.out.println("Exiting...!! Thanks for using the application.");
					break;
			}
		}
		
	}
}
class Video{
	String video_name;
	boolean checkout;
	int rating;
	Video(String name){
		this.video_name=name;
	}
}
class VideoStore{
	Video store;
	void addVideo(String name) {
		store=new Video(name);
	}
	void doCheckout(boolean name) {
		store.checkout=true;
	}
	void doReturn(boolean name) {
		store.checkout=false;
	}
	void receiveRating(String name,int rating) {
		store=new Video(name);
		store.rating=rating;
	}
	void listInventory() {
		
	}
}
