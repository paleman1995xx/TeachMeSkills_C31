package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField textField;
    private JPanel body;

    public Calculator(){
        super("Calculator Swing");

        setLayout(new BorderLayout());

        add(setTop(), BorderLayout.NORTH);
        add(setBody(), BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 500);
        setResizable(false);
        setVisible(true);
    }

    private JPanel setTop(){
        JPanel top = new JPanel();
        textField = new JTextField("0");
        textField.setEditable(false);

        top.setLayout(new BorderLayout());
        top.add(textField, BorderLayout.CENTER);

        return top;
    }

    private JPanel setBody(){
        body = new JPanel();
        body.setLayout(new GridLayout(5, 4));

        //первая линия кнопок
        addButton(String.valueOf(Operation.MOD.getOperChar()), this::addOperation);
        addButton("Backs", e -> {
            textField.setText(Operations.backsOperation(new StringBuilder(textField.getText())));
        });
        addButton("C", e -> {
            textField.setText(Operations.clearOperation());
        });
        addButton(String.valueOf(Operation.DIVISION.getOperChar()), this::addOperation);

        //вторая линия кнопок
        addNumButtons(7, 9, this::addOperation);
        addButton(String.valueOf(Operation.MULTIPLY.getOperChar()), this::addOperation);

        //третья линия кнопок
        addNumButtons(4, 6, this::addOperation);
        addButton(String.valueOf(Operation.MINUS.getOperChar()), this::addOperation);

        //четвёртая линия кнопок
        addNumButtons(1, 3, this::addOperation);
        addButton(String.valueOf(Operation.PLUS.getOperChar()), this::addOperation);

        //пятая линия кнопок
        addButton("^2", e -> {
            textField.setText(String.valueOf(Math.pow(Double.parseDouble(textField.getText()),2)));
        });
        addNumButtons(0, 0, this::addOperation);
        addButton(".", this::addOperation);
        addButton("=",e -> {
            textField.setText(Operations.calculation(new StringBuilder(textField.getText())));
        });

        return body;
    }

    private void addOperation(ActionEvent e){
        textField.setText(Operations.addTextOperation(new StringBuilder(textField.getText()),((JButton) e.getSource()).getText()));
    }

    private void addButton(String title, ActionListener actionListener) {
        JButton button = new JButton(title);
        button.addActionListener(actionListener);
        body.add(button);
    }

    private void addNumButtons(int min, int max, ActionListener actionListener) {
        for (int i = min; i <= max; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(actionListener);
            body.add(btn);
        }
    }
}