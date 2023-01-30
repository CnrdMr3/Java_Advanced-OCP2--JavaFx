package JavaFX.JavaFX_Book06_Theory.JavaFX_Chapter03.setResisizable;

public class setResizable_page606 {
	// If you want to prevent the user from resizing the stage, use the 'setResizable' method like this:

	public static void main(String[] args) {
		String preventStageResizing = "If you want to prevent the user from resizing the stage," +
				                      " use the 'setResizable' method like this:";
		String preventResizing = " > primaryStage.setResizable(false);";

		System.out.println(preventStageResizing + "\n\n\t" + preventResizing);
		/*
		Then, the user can’t change the size of the window.
		(By default, the stage is resizable.)
		Thus, you don’t need to call the setResizable method unless you want to make the stage non-resizable.
		*/
	}
}
