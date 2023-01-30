package JavaFX.JavaFX_Book06.JavaFX_Chapter03.stageClass;

public class StageClass_page604 {
    /*
    A stage, which is represented by the Stage class, is the topmost container in
    which a JavaFX user interface appears.

    In WINDOWS, on a MAC, or in LINUX, a stage is usually a window.

    On other types of devices, such as a smartphone or tablet, the
    stage may be the full screen or a tiled region of the screen.

    When a JavaFX application is launched, a stage known as the primary stage is automatically created.
    */

       /*
       !! - NOTE:

       A reference to this stage is passed to the application’s start
       method via the primaryStage parameter:

       @Override public void start(Stage primaryStage)
        {
            // primaryStage refers to the
            // application's primary stage.
        };
       */
	/*
    You can then use the primary stage to create the application’s user interface
    by adding a scene, which contains one or more controls or other user-interface nodes.

    In many cases, you will need to access the primary stage outside the scope of
    the start method.
    You can easily make this possible by defining a class field and
    using it to reference the primary stage.

    You see an example of how to do that later in this chapter, in the section “Switching Scenes.”

    The primary stage initially takes on the default characteristics of a normal windowed application,
    which depends on the operating system within which the program will run.

    You can, if you choose, change these defaults to suit the needs of your application.

    At the minimum, you should always set the window title.
    You may also want to change such details as whether the stage is resizable and various
	aspects of the stage’s appearance.
    */

	public static void main(String[] args) {
		/*
		The Stage class comes equipped with many methods that let you manipulate the
		appearance and behavior of a stage. Table 3-1 lists the ones you’re most likely
		to use:

		>> Commonly Used Methods of the Stage Class:
		    Method                                      Description
		 1.  void close()                                Closes the stage.

		 2.  void initModality(Modality modality)        Sets the modality of the stage. This method must be
		                                                called before the show method is called. The modality
		                                                can be one of the following:
		                                                Modality.NONE
		                                                Modality.APPLICATION_MODAL
		                                                Modality.WINDOW_MODAL

		 3.  void initStyle(StageStyle style)            Sets the style for the stage. This method must be called
		                                                before the show method is called. The style can be one
		                                                of the following:
		                                                StageStyle.DECORATED
		                                                StageStyle.UNDECORATED
		                                                StageStyle.TRANSPARENT
		                                                StageStyle.UNIFIED
		                                                StageStyle.UTILITY

		 4.  void getMaxHeight(double maxheight)         Gets the maximum height for the stage.

		 5.  void getMaxWidth(double maxwidth)           Gets the maximum width for the stage.

		 6.  void getMinHeight(double maxheight)         Gets the minimum height for the stage.

		 7.  void getMinWidth(double maxwidth)           Gets the minimum width for the stage.

		 8.  void setFullScreen(boolean fullscreen)      Sets the fullscreen status of the stage.

		 9.  void setIconified(boolean iconified)        Sets the iconified status of the stage.

		 10. void setMaximized(boolean maximized)       Sets the maximized status of the stage.

		 11. void setMaxHeight(double maxheight)        Sets the maximum height for the stage.

		 12. void setMaxWidth(double maxwidth)          Sets the maximum width for the stage.

		 13. void setMinHeight(double maxheight)        Sets the minimum height for the stage.

		 14. void setMinWidth(double maxwidth)          Sets the minimum width for the stage.

		 15. void setResizable(boolean resizable)       Sets the fullscreen status of the stage.

		 16. void setScene(Scene scene)                 Sets the scene to be displayed on the stage.

		 17. void setTitle(String title)                Sets the title to be displayed in the stage’s title bar,
		                                                if a title bar is visible.

		 18. void show()                                Makes the stage visible.

		 19. void showAndWait()                         Makes the stage visible and then waits until the stage
		                                                is closed before continuing.

		 20. void showAndWait()                         Makes the stage visible and then waits until the stage
		                                                is closed before continuing.

		 21. void toFront()                             Forces the stage to the foreground.

		 22. void toBack()                              Forces the stage to the background.
		 */

		String setScene = "Three methods:";

		String s1 = "1. Every stage must have a scene.";
		String s2 = "2. Every stage should have a title.";
		String s3 = "3. There’s NO point in creating a STAGE if you don’t intend ON SHOWING IT to the user.";

		System.out.println(setScene + "\n\n" + s1 + "\n\n\t" + s2 + "\n\n\t\t\t" + s3 + "\n\n\n\t\t\t\t");
	}
}
