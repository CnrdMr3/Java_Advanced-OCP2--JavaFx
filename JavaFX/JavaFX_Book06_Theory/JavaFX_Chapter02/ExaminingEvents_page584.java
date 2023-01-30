package JavaFX.JavaFX_Book06_Theory.JavaFX_Chapter02;

public class ExaminingEvents_page584 {
    /*
    An event is an object that’s generated when the user does something noteworthy
    with one of your user-interface components.

    Then this event object is passed to a
    special method you create, called an event handler.

    The event handler can examine
    the event object, determine exactly what type of event occurred, and respond
    accordingly. If the user clicks a button, the event handler might write any data
    entered by the user via text fields to a file. If the user passes the mouse cursor
    over a label, the event handler might change the text displayed by the label.

    And if the user selects an item from a combo box, the event handler might use the
    value that was selected to look up information in a database. The possibilities are
    endless!?????

    An event is represented by an instance of the class 'javafx.event.Event' or one of
    its many subclasses. Table 2-1 lists the most commonly used event classes.
     */

    /*
    Commonly Used Event Classes:

    Event Class   Package               Description
    ActionEvent   javafx.event          Created when the user performs an action with a
                                        button or other component. Usually this means that
                                        the user clicked the button, but the user can also
                                        invoke a button action by tabbing to the button and
                                        pressing the Enter key. This is the most commonly used
                                        event class, as it represents the most common types of
                                        user-interface events.

   InputEvent   javafx.scene.input      Created when an event that results from user input,
                                        such as a mouse or key click, occurs.

   KeyEvent     javafx.scene.input      Created when the user presses a key on the keyboard.
                                        This event can be used to watch for specific keystrokes
                                        entered by the user. (KeyEvent is a subclass of
                                        InputEvent.)

  MouseEvent   javafx.scene.input       Created when the user does something interesting
                                        with the mouse, such as clicking one of the buttons,
                                        dragging the mouse, or simply moving the mouse
                                        cursor over another object. (MouseEvent is a subclass
                                        of InputEvent.)

 TouchEvent   javafx.scene.input        Created when a user initiates a touch event on a device
                                        that allows touch input.

 WindowEvent javafx.stage               Created when the status of the window (stage)
                                        changes.
     */

     /*
     » Event handler:  The object that listens for events and handles them when
                       they occur.
                       The event-listener object must implement the EventHandler interface, which
                       defines a single method named handle (see Table 2-2). The EventHandler
                       interface is defined in the package javafx.event.
     */

    public static void main(String[] args) {
        String important_1 = "1. Event: An object that’s created when the user does something noteworthy\n\t" +
                            "with a component, such as clicking it.";

        String important_2 = "2. Event source: The object on which the event initially occurred.";

        String important_3 = "3. Event target: The node that the event is directed at.\n\t\t\t" +
                "This is usually the button or other control that the user clicked or otherwise\n\t\t\t" +
                "manipulated. (In most cases, the event source and the event target are the\n\t\t\t" +
                "same.)";

        String important_4 = "4. Event handler: The object that listens for events and handles them when they occur.\n";

        System.out.println(important_1 + "\n\t" + important_2 + "\n\t\t" + important_3 + "\n\t\t\t " + important_4);
    }
}
