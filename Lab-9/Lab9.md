# Лабораторна робота №12
## Варіант 4 — Сила Архімеда

### Формула

F = ρ * g * V

де:
- ρ — густина рідини (кг/м³)
- g = 9.81 м/с²
- V — об’єм тіла (м³)

---

# Код програми Java Swing

```java
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {

    private JTextField densityField;
    private JTextField volumeField;
    private JTextField resultField;

    public Main() {

        setTitle("Варіант 4 — Сила Архімеда");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 380, 230);
        setLayout(null);

        JLabel label1 = new JLabel("Густина рідини ρ, кг/м³:");
        label1.setBounds(30, 30, 180, 25);
        add(label1);

        densityField = new JTextField();
        densityField.setBounds(210, 30, 120, 25);
        add(densityField);

        JLabel label2 = new JLabel("Об'єм тіла V, м³:");
        label2.setBounds(30, 70, 180, 25);
        add(label2);

        volumeField = new JTextField();
        volumeField.setBounds(210, 70, 120, 25);
        add(volumeField);

        JLabel label3 = new JLabel("Сила Архімеда F, Н:");
        label3.setBounds(30, 110, 180, 25);
        add(label3);

        resultField = new JTextField();
        resultField.setBounds(210, 110, 120, 25);
        resultField.setEditable(false);
        add(resultField);

        JButton btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(120, 150, 130, 30);
        add(btnCalculate);

        btnCalculate.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    double rho = Double.parseDouble(densityField.getText());
                    double V = Double.parseDouble(volumeField.getText());

                    double g = 9.81;

                    double F = rho * g * V;

                    resultField.setText(Double.toString(F));

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null,
                            "Введіть коректні числа!");

                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new Main();

    }
}
```

---

## Опис роботи програми

Програма створена за допомогою бібліотеки Java Swing.

Користувач вводить:
- густину рідини
- об’єм тіла

Після натискання кнопки «Обчислити» програма визначає силу Архімеда за формулою:

F = ρ * g * V

Результат виводиться у текстове поле.
