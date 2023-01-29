module com.example.javafx_book06_examples {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;


	opens com.example.javafx_book06_examples to javafx.fxml;
}