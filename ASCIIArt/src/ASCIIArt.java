/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
		flashcaption();
		flashHead();
		flashBody();
		flashLeg(); 
		
	}
	
	public static void flashHead () {
		System.out.println("                      /^^^^^^^^\\");
		System.out.println("                    ~(| [*][*] |)~");
		System.out.println("                      |>\\_^^_/<|");
		System.out.println("                      |__\\__/__|");
		System.out.println("                         [  ]");
	
	}
	public static void flashBody () {
		System.out.println("                     _,..|  |..,");
		System.out.println("              (^^)  /|       /'\\\\");
		System.out.println("               \\ \\,[/|     _// |\\\\");
		System.out.println("                \\_[/ |    /_/  |/ \\");
		System.out.println("                     |   //    |/ /");
		System.out.println("		     |	/'     |(.)");
		System.out.println("                     \\_________/_");
	}
	public static void flashLeg () {
		System.out.println("                     (  )   (  )\\ \\");
		System.out.println("                    (  )   (  ) _\\_\\");
		System.out.println("                   (  )    (  )` \\ \\");
		System.out.println("                   (  )     (  ) _\\_\\");
		System.out.println("                  /  |      /  /  \\\\");
		System.out.println("                 [:__|     [:__/   \\\\");
		System.out.println("                                    \\");
	}public static void flashcaption () {
		System.out.println("                                   _____________________________________________________");
		System.out.println("                                  (My name is Barry Allen and I am the fastest man alive!)");
		System.out.println("                                 /(______________________________________________________)");
		System.out.println("                               /_/");
		System.out.println("                              \\/");
	}
	
		
	}
