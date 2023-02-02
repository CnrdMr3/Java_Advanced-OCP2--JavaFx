package JavaFX.JavaFX_Book06_Theory.JavaFX_Chapter03.closeMethod;

public class creatingCloseCutton {
	/*
	To add a button or other user-interface element that allows the user to close the
	button, all you have to do is provide an action event handler that calls the stage’s
	close method.

	For example, suppose you create a Close button using the following code:

	>>> Button btnClose = new Button();
		btnClose.setText("Close");
		btnClose.setOnAction( e -> primaryStage.close() );

	In this case, the action event handler simply calls primaryStage.close() to close
	the application.

	If you want to do more than simply call the close method in the action event
	handler, you may want to isolate the event handler in a separate method, as in
	this example:

	>>> btnClose.setOnAction( e -> btnClose_Clicked());

	Because the btnClose_Clicked method will need to access the primary stage to
	close it, you need to define a class field of type Stage and use it to reference the
	primary stage. Then, your btnClose_Clicked method can easily perform additional tasks. For example:

	>>> private void btnClose_Click()
		{
		 boolean reallyQuit = false;
		 reallyQuit = ConfirmationBox.show(
		 "Are you sure you want to quit?",
		 "Confirmation",
		 "Yes", "No");
		 if (reallyQuit)
		 {
		 // Perform cleanup tasks here
		 // such as saving files or freeing resources
		 stage.close();
		 }
		}
	 */

	public static void main(String[] args) {
		System.out.println("Close button has various functions.");
	}
}
