package JavaFX.JavaFX_Book06.JavaFX_Chapter03.sceneClass;

public class sceneClass_page607 {
	/*
 Like the Stage class, the Scene class is fundamental to JavaFX programs. In
 every JavaFX program, you use at least one instance of the Scene class to hold
 the user-interface controls that your users will interact with as they use your
 program.

 Table 3-2 lists the more commonly used constructors and methods of the Scene
 class:

 >>> Commonly Used Constructors and Methods of the Scene class:
     Constructor                                           Description

   > Scene(Parent root)                                 -- Creates a new scene with the specified root node
   > Scene(Parent root, double width, double height)    -- Creates a new scene with the specified root node,
                                                           width, and height

    Method                                                 Description

   > double getHeight()                                -- Gets the height of the scene
   > double getWidth()                                 -- Gets the width of the scene
   > double getX()                                     -- Gets the horizontal position of the scene
   > double getY()                                     -- Gets the vertical position of the screen
   > void setRoot(Parent root)                         -- Sets the root node
*/

	public static void main(String[] args) {
		/*
		The following paragraphs explain some of the more interesting details of the
		constructors and methods of the Scene class:
		 */

		String a = "All the Scene class constructors require that you specify the root node.";

		String b = "\n\tYou might be wondering why the root node is an instance of the Parent " +
				   "class rather than an instance of the Node class";

		String c = "\n\t\tYou can set the scene’s initial size when you create it by specifying the " +
				   "Width and Height parameters.";

		String d = "\n\t\t\tYou can retrieve the size of the scene via the getHeight and getWidth " +
				   "methods";

		String e = "\n\t\t\t\tIn general, the size of the scene determines the size of the stage.";

		String f = "\n\t\t\t\t\tIn general, the size of the scene determines the size of the stage,";

		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
	}
}
