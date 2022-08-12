package default_package;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quizz implements ActionListener {
	
	
	String[] questions = {
			              "Quem é que conseguiu ganhar meu coração só por conversa?",
			              "Que ano que meu amor nasceu?",
			              "O que mais quero com você?",
			              "Vamos ficar juntos?"
	                     };
	String[][] options = {
			              {"Gabriela","Yasmin","Julia","Ana"},
			              {"1996","1998","2000","2003"},
			              {"Tudo","Carinho","Amor","Sexo"},
			              {"Sim", "Não","Com certeza","Talvez"}
	                     };
	char[] answers =     {
			              'B',
			              'D',
			              'A',
			              'C'
	                     };
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = questions.length;
	int result;
	int seconds = 10;
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer();
			}
		}
	});
	
	public Quizz() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,700);
		frame.getContentPane().setBackground(new Color(100,0,0));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,0,900,50);
		textfield.setBackground(new Color(0,0,0));
		textfield.setForeground(new Color(255,255,255));
		textfield.setFont(new Font("Coiny Regular",Font.BOLD,35));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		textarea.setBounds(0,50,900,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(0,50,150));
		textarea.setFont(new Font("MV Boli",Font.ITALIC,25));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		buttonA.setBounds(0,100,100,100);
		buttonA.setFont(new Font("Alfa Slab",Font.BOLD,35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,200,100,100);
		buttonB.setFont(new Font("Alfa Slab",Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,300,100,100);
		buttonC.setFont(new Font("Alfa Slab",Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,400,100,100);
		buttonD.setFont(new Font("Alfa Slab",Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		answer_labelA.setBounds(125,100,500,100);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(0,0,255));
		answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,35));
		answer_labelA.setText("Teste 1");
		
		answer_labelB.setBounds(125,200,500,100);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(new Color(0,0,255));
		answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,35));
		answer_labelB.setText("Teste 2");
		
		answer_labelC.setBounds(125,300,500,100);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(new Color(0,0,255));
		answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,35));
		answer_labelC.setText("Teste 3");
		
		answer_labelD.setBounds(125,400,500,100);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(new Color(0,0,255));
		answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,35));
		answer_labelD.setText("Teste 4");
		
		seconds_left.setBounds(775,550,100,100);
		seconds_left.setBackground(new Color(25,25,25));
		seconds_left.setForeground(new Color(255,0,0));
		seconds_left.setFont(new Font("Ink Free", Font.BOLD,60));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		time_label.setBounds(775,525,100,25);
		time_label.setBackground(new Color(50,50,50));
		time_label.setForeground(new Color(0,0,0));
		time_label.setFont(new Font("Arial Black", Font.PLAIN,20));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("Relogin");
		
		number_right.setBounds(225,225,450,100);
		number_right.setBackground(new Color(50,50,50));
		number_right.setForeground(new Color(0,0,0));
		number_right.setFont(new Font("Arial Black", Font.PLAIN,20));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(225,325,450,100);
		percentage.setBackground(new Color(0,0,0));
		percentage.setForeground(new Color(25,175,0));
		percentage.setFont(new Font("Arial Black",Font.PLAIN,20));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		
		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(textfield);
		frame.setVisible(true);
		
		nextQuestion();
	}
	
	public void nextQuestion() {
		
		if(index >= total_questions) {
			results();
		}else {
			textfield.setText("Question " + (index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			timer.start();
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(e.getSource()==buttonA) {
			answer = 'A';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		if(e.getSource()==buttonB) {
			answer = 'B';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		if(e.getSource()==buttonC) {
			answer = 'C';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		if(e.getSource()==buttonD) {
			answer = 'D';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		displayAnswer();
	}
	
	public void displayAnswer() {
		
		timer.stop();
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(answers[index] != 'A') {
			answer_labelA.setForeground(new Color(255,0,0));
		}
		if(answers[index] != 'B') {
			answer_labelB.setForeground(new Color(255,0,0));
		}
		if(answers[index] != 'C') {
			answer_labelC.setForeground(new Color(255,0,0));
		}
		if(answers[index] != 'D') {
			answer_labelD.setForeground(new Color(255,0,0));
		}
		
		Timer pause = new Timer(1500, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(new Color(0,0,255));
				answer_labelB.setForeground(new Color(0,0,255));
				answer_labelC.setForeground(new Color(0,0,255));
				answer_labelD.setForeground(new Color(0,0,255));
				
				answer = ' ';
				seconds = 10;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		
		pause.setRepeats(false);
		pause.start();
	}
	
	public void results() {
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		result = (int)((correct_guesses/(double)total_questions)*100);
		
		textfield.setText("RESULTADO!");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText("(" + correct_guesses + "/" + total_questions + ")");
		percentage.setText(result + "%");
		
		frame.add(percentage);
		frame.add(number_right);
		
	}
}
