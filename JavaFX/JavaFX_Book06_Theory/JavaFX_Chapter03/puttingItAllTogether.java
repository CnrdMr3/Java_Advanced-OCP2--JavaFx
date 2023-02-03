package JavaFX.JavaFX_Book06_Theory.JavaFX_Chapter03;

public class puttingItAllTogether {
	/*
	Now that you know how to add a Close button to a scene and how to handle the
	CloseRequest event, I look at a program that puts together these two elements to
	demonstrate the correct way to exit a JavaFX program.

	This section presents a variation of the ClickCounter program that includes a Close
	button in addition to the Click Me! button. When the user clicks the Click Me!
	button, a message box displays to indicate how many times the button has been
	clicked.

	But when the user attempts to exit the program, whether by clicking the
	Close button or by simply closing the window, the -ConfirmationBox- class that
	was shown in Listing 3-3 is used to ask the user whether she really wants to exit
	the program. Then, the stage is closed only if the user clicks the Yes button in the
	confirmation box.
	 */

	public static void main(String[] args) {
		System.out.println("JavaFX putting together - start to finish.");
	}

}
