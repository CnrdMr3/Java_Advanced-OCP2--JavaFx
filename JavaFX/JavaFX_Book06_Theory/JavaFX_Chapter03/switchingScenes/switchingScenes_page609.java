package JavaFX.JavaFX_Book06_Theory.JavaFX_Chapter03.switchingScenes;

public class switchingScenes_page609 {
	/*
	The primary stage of a JavaFX program (or any other stage, for that matter) can
	have only one scene displayed within it at any given time. However, that doesn’t
	mean that your program can’t create several scenes and then swap them as
	needed. For example, suppose you’re developing a word-processing program and
	you want to let the user switch between an editing view and a page preview view.
	You could do that by creating two distinct scenes, one for each view. Then, to
	switch the user between views, you simply call the stage’s setScene method to
	switch the scene.
	 */

	public static void main(String[] args) {
		/*
		A program named SceneSwitcher that combines the scenes from
		the ClickCounter and AddSubtract programs into a single program.
		*/

		String a = "When the SceneSwitcher program is first run, it displays the ClickCounter\n" +
				   "scene as shown on the left side of the figure.";
		String b = "\n\n\tWhen the user clicks the Switch Scene button, the scene switches to the\n\t" +
				   "AddSubtract scene, as shown in the right side of the figure.";

		System.out.println(a + " " + b);
	}
}
