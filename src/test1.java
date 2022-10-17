

import 主程序_子程序.demo1;
import 事件系统.Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class test1 extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    test1 frame = new test1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public test1() {
        setTitle("经典软件体系结构教学软件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 680);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("选择不同风格");
        lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        JTextArea txtrFanJiaSi = new JTextArea();
        txtrFanJiaSi.setRows(26);
        txtrFanJiaSi.setColumns(60);
        txtrFanJiaSi.setLineWrap(true);
        txtrFanJiaSi.setText("");
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
                                                .addGap(52)
                                                .addComponent(txtrFanJiaSi, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                                        .addComponent(lblNewLabel))
                                .addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(69)
                                                .addComponent(txtrFanJiaSi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblNewLabel)
                                                .addGap(18)
                                                .addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel panel = new JPanel();
        tabbedPane.addTab("主程序-子程序", null, panel, null);
        tabbedPane.setEnabledAt(0, true);

        JTextArea textArea_4 = new JTextArea();
        textArea_4.setWrapStyleWord(true);
        textArea_4.setText("主程序-子程序软件体系结构在设计上使用层次化划分方法，该体系结构中使用由编程语言直接支持的单一的控制线程。\n其组件是主程序和子程序，连接件是调用返回机制，子程序的结构是明确的，子程序通常组成程序模块，子程序的调用呈现层次状。\n能够较好地支持系统的可变性和可伸缩性等性能。");
        textArea_4.setRows(5);
        textArea_4.setLineWrap(true);
        textArea_4.setColumns(50);
        panel.add(textArea_4);

        JTextArea txtrPublicStaticVoid = new JTextArea();
        txtrPublicStaticVoid.setLineWrap(true);
        txtrPublicStaticVoid.setColumns(50);
        txtrPublicStaticVoid.setRows(5);
        txtrPublicStaticVoid.setWrapStyleWord(true);
        txtrPublicStaticVoid.setText("关键代码：    \r\n public static void main(String[] args) {\r\n\r\n                demo1 kwic = new demo1();\r\n                kwic.input(\"D:\\\\西柚\\\\软件体系结构\\\\input.txt\");\r\n                kwic.shift();\r\n                kwic.alphabetizer();\r\n                kwic.output(\"D:\\\\西柚\\\\软件体系结构\\\\output.txt\");\r\n        }");
        panel.add(txtrPublicStaticVoid);

        JButton btnNewButton = create(txtrFanJiaSi,0);
        panel.add(btnNewButton);

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("面向对象", null, panel_1, null);

        JTextArea textArea_1_1 = new JTextArea();
        textArea_1_1.setWrapStyleWord(true);
        textArea_1_1.setText("面向对象软件体系结构，系统看作由一些对象的集合组成，消息从一个对象发送到另外一个对象。\n其组件是类和对象，连接件是对象之间通过功能与函数调用实现交互。\n对象是通过函数和过程的调用-返回机制来交互的，而类是通过定义对象，再采用调用-返回机制进行交互。");
        textArea_1_1.setRows(5);
        textArea_1_1.setLineWrap(true);
        textArea_1_1.setColumns(50);
        panel_1.add(textArea_1_1);

        JTextArea txtrPublicStatic = new JTextArea();
        txtrPublicStatic.setWrapStyleWord(true);
        txtrPublicStatic.setLineWrap(true);
        txtrPublicStatic.setRows(5);
        txtrPublicStatic.setColumns(50);
        txtrPublicStatic.setText("关键代码：\r\n    public static void main(String[] args) {\r\n        Input input = new Input();\r\n        input.input(\"D:\\\\西柚\\\\软件体系结构\\\\input.txt\");\r\n        Shift shift = new Shift(input.getLineTxt());\r\n        shift.shift();\r\n        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());\r\n        alphabetizer.sort();\r\n        Output output = new Output(alphabetizer.getKwicList());\r\n        output.output(\"D:\\\\西柚\\\\软件体系结构\\\\output.txt\");\r\n\r\n    }");
        panel_1.add(txtrPublicStatic);

        JButton button = create(txtrFanJiaSi,3);

        panel_1.add(button);

        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("事件系统", null, panel_2, null);

        JTextArea textArea_2_1 = new JTextArea();
        textArea_2_1.setLineWrap(true);
        textArea_2_1.setText("事件源负责广播一些事件，系统中的其他处理器在事件管理器中注册自己感兴趣的事件，并将自己的过程与某个事件相关联，事件管理器通过注册调用相关的处理器。");
        textArea_2_1.setRows(5);
        textArea_2_1.setColumns(50);
        panel_2.add(textArea_2_1);

        JTextArea txtrPublicClass = new JTextArea();
        txtrPublicClass.setWrapStyleWord(true);
        txtrPublicClass.setText("关键代码：\r\npublic class Subject {\r\n    private List<Observer> vector = new LinkedList<>();\r\n    public void addObserver(Observer observer) {\r\n        vector.add(observer);\r\n    }\r\n    public void deleteObserver(Observer observer) {\r\n        vector.remove(observer);\r\n    }\r\n    public void notifyAllObserver() {\r\n        for(Observer observer : vector) {\r\n            observer.toDo();\r\n        }\r\n    }\r\n    public void notifyOneObserver(int i) {\r\n        vector.get(i).toDo();\r\n    }\r\n}");
        txtrPublicClass.setLineWrap(true);
        txtrPublicClass.setRows(15);
        txtrPublicClass.setColumns(50);
        panel_2.add(txtrPublicClass);

        JButton button_1 = create(txtrFanJiaSi,1);
        panel_2.add(button_1);

        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("管道-过滤器", null, panel_3, null);
        tabbedPane.setEnabledAt(3, true);

        JTextArea textArea_3_1 = new JTextArea();
        textArea_3_1.setText("管道-过滤器模式的体系结构是面向数据流的软件体系结构。主要思路是将软件系统看成各种功能模块的组合，功能模块从输入集合读入数据流，并在输出集合产生输出数据流，它最典型的应用是在编译系统。在管道过滤器风格中，功能模块称作过滤器(Filter)；功能模块间的链接可以看作输入、输出流之间的通路，所以称作管道(Pipe)。\n");
        textArea_3_1.setRows(5);
        textArea_3_1.setLineWrap(true);
        textArea_3_1.setColumns(50);
        panel_3.add(textArea_3_1);

        JTextArea txtrPublicAbstract = new JTextArea();
        txtrPublicAbstract.setLineWrap(true);
        txtrPublicAbstract.setRows(10);
        txtrPublicAbstract.setColumns(50);
        txtrPublicAbstract.setText("关键代码：\r\npublic abstract class Filter {\r\n    protected Pipe input;\r\n    protected Pipe output;\r\n\r\n    public Filter(Pipe input, Pipe output) {\r\n        this.input = input;\r\n        this.output = output;\r\n    }\r\n    protected abstract void transform() throws IOException;\r\n}\r\n");
        panel_3.add(txtrPublicAbstract);

        JButton btnNewButton_1 = create(txtrFanJiaSi,2);
        panel_3.add(btnNewButton_1);
        contentPane.setLayout(gl_contentPane);
    }


    public static String getFileContent(){
        File file = new File("D:\\西柚\\软件体系结构\\output.txt");
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
            String res = null;
            while((res = bufferedreader.readLine())!=null){
                result.append(System.lineSeparator()+res);
            }
            bufferedreader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }


    public static void clearFile(){
        File file = new File("D:\\西柚\\软件体系结构\\output.txt");
        FileWriter filewriter;
        try {
            filewriter = new FileWriter (file);
            filewriter.write("");
            filewriter.flush();
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public JButton create(JTextArea jTextArea,int index) {
        JButton button = new JButton("运行");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("运行结果：");
                clearFile();
                if (index == 0){
                    demo1.main(null);
                }else if (index == 1){
                    Main.main(null);
                }else if (index == 2) {
                    try {
                        管道_过滤.Main.main(null);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }else {
                    面向对象.Main.main(null);
                }
                String content = getFileContent();
                jTextArea.append(content);
            }
        });
        return button;
    }
}
