package JavaFX.JavaFX_Book06_Theory.JavaFX_Chapter03.creatingAnAleretBox;

public class creatingAnAlertBox_page613 {
	/*
	JavaFX provides a simple means of displaying a basic message box by using
	the Alert class, which is similar to the JOptionPane class you learned back
	in Chapter 2 of Book 2. Table 3-3 shows the commonly used constructors and
	methods for this class.

	Commonly Used Constructors and Methods of the Alert class:

	Constructor                                              Description
	Alert(Alert.AlertType)                                   Creates a new alert of the specified type
	Alert(Alert.AlertType,String text)                       Creates a new alert of the specified type and sets
	                                                         the message text
	Alert(Alert.AlertType, String text, ButtonType type...)  Creates a new alert and sets the buttons to be displayed

	Method                                                   Description
	void setTitle(String text)                               Sets the title
	Optional<ButtonType>                                     Shows the alert and waits for the user's response,which is returned
	showAndWait()                                            as a ButtonType object

	The AlertType parameter lets you specify one of several types of Alert dialogs:

	AlertType.CONFIRMATION, which prompts the user to confirm an action.
	AlertType.ERROR, which display an error message.
	AlertType.INFORMATION, which displays an information dialog box.
	AlertType.WARNING, which displays a warning message.
	AlertType.NONE, which display a generic alert dialog.

	You can control what buttons appear on the Alert box by using the optional
	ButtonType parameter. You can choose from among the following types of buttons:

	ButtonType.APPLY
	ButtonType.CANCEL
	ButtonType.CLOSE
	ButtonType.FINISH
	ButtonType.NEXT
	ButtonType.NO
	ButtonType.OK
	ButtonType.PREVIOUS
	ButtonType.YES
	 */

	public static void main(String[] args) {

		String alertBoxConstructors = "Commonly Used Constructors and Methods of the Alert class:";
		String Constructors = "\n\n\tConstructors: ";
		String constructor1 = "\n\ta) Alert(Alert.AlertType)";
		String constructor2 = "\n\tb) Alert(Alert.AlertType,String text)";
		String constructor3 = "\n\tc) Alert(Alert.AlertType, String text, ButtonType type...)";

		String Description = "\n\tDescription: ";
		String constructorDescription1 = "\n\ta) Creates a new alert of the specified type";
		String constructorDescription2 = "\n\tb) Creates a new alert of the specified type and sets the message text";
		String constructorDescription3 = "\n\tc) Creates a new alert and sets the buttons to be displayed";


		System.out.println(alertBoxConstructors + " " + Constructors + " " + constructor1 + " " + constructor2 +
							" " + constructor3);
		System.out.println(Description + " " + constructorDescription1 + " " + constructorDescription2 +
							" " + constructorDescription3);

		String Method = "\n\tMethod:";
		String method1 = "\n\ta) void setTitle(String text)";
		String method2 = "\n\tb) Optional<ButtonType> showAndWait()";

		System.out.println(Method + " " + method1 + " " + method2);

		String descriptionMethod = "\n\tDescription: ";
		String methodDescription1 = "\n\ta) Sets the title";
		String methodDescription2 = "\n\tb) Shows the alert and waits for the user’s response, which is returned as a ButtonType object";

		System.out.println(descriptionMethod + " " + methodDescription1 + " " + methodDescription2);

		String alertType = "\n\n\tThe AlertType parameter lets you specify one of several types of Alert dialogs:";

		String alertTypes = "\n\n\tAlertType.1-CONFIRMATION, which prompts the user to confirm an action.\n" +
				"\tAlertType.2-ERROR, which display an error message.\n" +
				"\tAlertType.3-INFORMATION, which displays an information dialog box.\n" +
				"\tAlertType.4-WARNING, which displays a warning message.\n" +
				"\tAlertType.5-NONE, which display a generic alert dialog.";

		System.out.println(alertType + " "+ alertTypes);
	}
}
