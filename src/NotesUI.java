package src;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NotesUI {

	public static void main(String[] args) {
		
		//Initializing the window
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(640,480);
	    
	    //Creating the menu
	    JMenu fileBtn = new JMenu("File");
	    JMenuItem importBtn = new JMenuItem("importBtn");
	    importBtn.addActionListener(
	    		new ActionListener() {
	    				public void actionPerformed(ActionEvent e) {
	    					ImportFile();
	    				}
	    			}
	    		);
	    
	    JMenuItem saveBtn = new JMenuItem("saveBtn");
	    saveBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		SaveFile();
	    	}
	    });
	    
	    JMenuItem saveAsBtn = new JMenuItem("saveAsBtn");
	    saveAsBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		SaveAsFile();
	    	}
	    });
	    
	    fileBtn.add(importBtn);
	    fileBtn.add(saveBtn);
	    fileBtn.add(saveAsBtn);

	    //Creating the menu bar and attaching the menu
	    JMenuBar menuBar = new JMenuBar();
	    menuBar.add(fileBtn);
	    
	    //Creating the main application panel
	    JPanel panel = new JPanel();

	    //Adding the menu to the window
	    frame.getContentPane().add(BorderLayout.NORTH,menuBar);
	    frame.getContentPane().add(BorderLayout.SOUTH,panel);
	    frame.setVisible(true);	
	}
	
	//Backend functionality here
	static void ImportFile() {
		
	}
	
	static void SaveFile() {
		String path = System.getProperty("user.dir")+"File.txt";
		//get opened file path
		File file = new File(path);
		
		try {
			if(file.createNewFile()) {
				FileWriter writer = new FileWriter(file.getPath());
				writer.write("This is an auto generated file\nReee");
				writer.close();
			}
			else System.out.println("Cannot create file");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void SaveAsFile() {
		String path = System.getProperty("user.dir")+"\\saves\\File.txt";
		File file = new File(path);
		
		try {
			if(file.createNewFile()) {
				FileWriter writer = new FileWriter(file.getPath());
				writer.write("This is an auto generated file\nReee");
				writer.close();
			}
			else System.out.println("Cannot create file");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
