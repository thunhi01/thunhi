import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  

public class Giaodien {  
    public static void main(String[] args) {  
        // Tạo frame  
        JFrame frame = new JFrame("Máy Tính Đơn Giản");  
        frame.setSize(300, 250);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLayout(new GridLayout(4, 2, 10, 10));  
        
        // Tạo các thành phần giao diện  
        JLabel labelA = new JLabel("A:");  
        JTextField textA = new JTextField();  
        JLabel labelB = new JLabel("B:");  
        JTextField textB = new JTextField();  
        JLabel resultLabel = new JLabel("Kết quả:");  
        JTextField resultField = new JTextField();  
        resultField.setEditable(false);  
        JButton btnAdd = new JButton("Cộng");  
        JButton btnSub = new JButton("Trừ");  
        JButton btnMul = new JButton("Nhân");  
        JButton btnDiv = new JButton("Chia");  
        
        // Thêm hành động cho nút "Cộng"  
        btnAdd.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                try {  
                    // Lấy giá trị từ input  
                    double a = Double.parseDouble(textA.getText());  
                    double b = Double.parseDouble(textB.getText());  
                    // Thực hiện phép cộng  
                    double result = a + b;  
                    // Hiển thị kết quả  
                    resultField.setText(String.valueOf(result));  
                } catch (NumberFormatException ex) {  
                    resultField.setText("Vui lòng nhập số hợp lệ");  
                }  
            }  
        });  
        
        // Thêm thành phần vào frame  
        frame.add(labelA);  
        frame.add(textA);  
        frame.add(labelB);  
        frame.add(textB);  
        frame.add(resultLabel);  
        frame.add(resultField);  
        frame.add(btnAdd);  
        frame.add(btnSub);  
        frame.add(btnMul);  
        frame.add(btnDiv);  
        
        // Hiển thị giao diện  
        frame.setVisible(true);  
    }  
}  