
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener {
   String name;
   JButton start;
   JButton back;

   Rules(String name) {
      this.name = name;
      this.getContentPane().setBackground(Color.WHITE);
      this.setLayout((LayoutManager)null);
      JLabel heading = new JLabel("Welcome " + name + " to Divy Minds");
      heading.setBounds(50, 20, 700, 30);
      heading.setFont(new Font("Algerian", 1, 28));
      heading.setForeground(new Color(30, 144, 254));
      this.add(heading);
      JLabel rules = new JLabel();
      rules.setBounds(20, 90, 700, 350);
      rules.setFont(new Font("Tahoma", 0, 16));
      rules.setText("<html>1. Question Types: 1. The quiz will include multiple-choice, true/false, and/or short-answer questions.<br><br>2. Number of Questions: The quiz consists of 10 questions.<br><br>3. The remaining time will be displayed on your screen during the quiz.<br><br>4. Once you submit your answers, the quiz will be considered complete. You cannot modify your answers after submission.<br><br>5.Quiz results will be shared with students after all participants have completed the quiz.<br><br> ................................................................Good Luck.........................................................<br><br><html>");
      this.add(rules);
      this.back = new JButton("Back");
      this.back.setBounds(250, 500, 100, 30);
      this.back.setBackground(new Color(30, 144, 254));
      this.back.setForeground(Color.WHITE);
      this.back.addActionListener(this);
      this.add(this.back);
      this.start = new JButton("Start");
      this.start.setBounds(400, 500, 100, 30);
      this.start.setBackground(new Color(30, 144, 254));
      this.start.setForeground(Color.WHITE);
      this.start.addActionListener(this);
      this.add(this.start);
      this.setSize(800, 650);
      this.setLocation(350, 100);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == this.start) {
         this.setVisible(false);
         new Quiz(this.name);
      } else {
         this.setVisible(false);
         new Login();
      }

   }

   public static void main(String[] args) {
      new Rules("User");
   }
}
