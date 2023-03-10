package JavaFX.JavaFX_Book06_Theory.JavaFX_Chapter02;

public class JavaFX_handleEvent_585 {
    /*
    Here are three steps you must take to handle a JavaFX event:

1. Create an event source.

   An event source is simply a control, such as a button, that can generate
   events. Usually, you declare the variable that refers to the event source
   as a private class field, outside the start method or any other class
   methods:

   >> private Button btn;

   Then, in the start method, you can create the button like this:

   >> btn = new Button();
      btn.setText("Click me please!");

2. Create an event handler.

   To create an event handler, you must create an object that implements an
   interface appropriately named 'EventHandler'. This object must provide an
   implementation of the handle method.

   Here are four ways to create an event handler:

   a. Add 'implements EventHandler' to the program’s Application class and
      provide an implementation of the handle method.
      (You figure out how to use this technique in the section “Implementing the
      EventHandler Interface.”)

   b. Create an inner class that implements EventHandler within the
      Application class.
      (You figure out how to use this technique in the section “Handling Events
      with Inner Classes.”)

   c. Create an anonymous class that implements EventHandler.
      (I show you how to use this technique in the section “Handling Events with
      Anonymous Inner Classes.”)

   d. Use a lambda expression to implement the handle method.
      (You read about how to use this technique in the section “Using Lambda
      Expressions to Handle Events.”)

3. Register the event handler with the event source.

   The final step is to register the event handler with the event source so that the
   handle method is called whenever the event occurs.

   Every component that serves as an event source provides a method that lets
   you register event handlers to listen for the event.

   For example, a Button control provides a setOnAction method that lets you register an event
   handler for the action event.

   In the setOnAction method, you specify the event handler object as a parameter.

   The exact way you do that depends on which of the various techniques you used to
   create the event handler.
     */

    public static void main(String[] args) {
        // Steps to handle JavaFX events:

        String a = "1. Create an event source.";
        String b = "2. Create an event handler.";
        String c = "3. Register the event handler with the event source.";

        System.out.println(a + "\n\t" + b + "\n\t\t" + c);

    }
}
