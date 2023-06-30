package Player;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		MultimediaElement[] items = new MultimediaElement[5];

		for (int i = 0; i < items.length; i++) {
			System.out.println("What media element do you want? (1 for Image, 2 for Video, 3 for Audio):");
			int type = input.nextInt();
			input.nextLine();
	
			System.out.println("Enter the media item title:");
			String title = input.nextLine();
			switch (type) {
			case 1:
				System.out.println("Enter the image brightness:");
				int brightness = input.nextInt();
				input.nextLine();
				
				items[i] = new Image(title, brightness);
				break;

			case 2:
				System.out.println("Enter the video volume:");
				int volume = input.nextInt();
				input.nextLine();

				System.out.println("Enter the video duration:");
				int videoDuration = input.nextInt();
				input.nextLine();

				System.out.println("Enter the video brightness:");
				brightness = input.nextInt();
				input.nextLine();

				items[i] = new Video(title, videoDuration, volume, brightness);
				break;

			 case 3:
		          System.out.println("Enter the audio volume:");
		          volume = input.nextInt();
		          input.nextLine();

		          System.out.println("Enter the audio duration:");
		          int audioDuration = input.nextInt();
		          input.nextLine();
		          
		          items[i] = new Audio(title, audioDuration, volume);
		          break;

		        default:
					System.out.println("Invalid type!");
		          i--;
		          break;
		      }
		    }
			input.close();
		}
}