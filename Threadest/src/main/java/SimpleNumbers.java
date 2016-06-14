import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SimpleNumbers {
    private JButton calculateButton;
    private JList resultArea;
    private JPanel mainPanel;
    private JSpinner numbersFrom;
    private JSpinner numbersTo;
    private JScrollPane scrollPane;
    DefaultListModel<String> numbers;
    private SpinnerNumberModel fromModel;
    private SpinnerNumberModel toModel;

    public static void main(String[] args) {
        JFrame main = new JFrame("Вывод простых чисел");
        main.setContentPane(new SimpleNumbers().mainPanel);
        main.pack();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }

    boolean isNumberSimple(int num) {
        boolean isSimple = true;
        if (num ==1 ) {return isSimple = false;}

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isSimple = false;
            }

        }

    return isSimple;
}

    public SimpleNumbers() {
        fromModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        numbersFrom.setModel(fromModel);

        toModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        numbersTo.setModel(toModel);

        numbers = new DefaultListModel<>();
        resultArea.setModel(numbers);
        calculateButton.addActionListener(action);

    }


    void addSimpleNumber(int num) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                numbers.addElement(Integer.toString(num));
            }
        });
    }

    ActionListener action = new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            new Thread(new Runnable() {
                public void run() {
                    numbers.clear();
                    int from = fromModel.getNumber().intValue();
                    int to = toModel.getNumber().intValue();
                    for (int n = from; n <= to; n++) {
                        if (isNumberSimple(n)) {
                            addSimpleNumber(n);
                        }
                    }
                }
            }).start();
        }
    };


}
