package iki;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.text.Highlighter;
import javax.swing.text.StyledEditorKit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.data.general.DefaultPieDataset;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.property.Property;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPage;
import com.itextpdf.text.pdf.PdfWriter;
import com.lowagie.text.Element;

import net.proteanit.sql.DbUtils;

public class Primary extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel p,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,pana,pana1,panel,panel1,panel2,panel3,panel4,panel5,panel6,pe,pc,pw,pan1,pan2,pan3,pan4,pan5,pa1,pa2,pa3,pa4,pa5;
	private JTextField field;
	private JPanel pa6,pa7,pa8,pa9,pa10,pa11,pa12,pa13,pa14,pa15,pa16,pa17,pa18,pa19,pa20,pa21,pa22,pa23; 
	private JLabel label,l0,l1,l2,l3,l4,l5,l6,l7,label7,l10,l11,l12,l13,l14,l15,l16,label17,l20,l21,l22,l23,l24,l25,l26,l27,l28,la,lc,le,label3,label16,ll,l29; 
	private JLabel ll0,ll1,ll2,ll3,l69,l70,label2,l30,l31,l32,l33,l34,l35,l36,l37,l39,l40,l38;
	private JTextField t0,t1,t2,t10,t11,t12,t20,t21,t22,t23,t24,t25,t26,t27,t28,tt29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,tan;
	private JComboBox<String> box5,t3,t4,t5,t6,t13,t14,t15,t16,box15,et,ct,ac,sch,box16,jj,box69,box70,box71,box72,box73,box74,box75,box76,box2,boxn,boxn1,t7;
	private String[]name1={"ME","KE"};
	private String[]name2={"DARASA LA I","DARASA LA II","DARASA LA III","DARASA LA IV","DARASA LA V","DARASA LA VI"};
	private String[]name3={"ENGLISH","KISWAHILI","ARABIC","DINI","S/JAMII","SAYANSI","HISABATI","GEOGRAPHY","URAIA","HISTORIA","SCIENCE","ICT"}; //,"ARTS","ALL"
	private String[]name7={"MUHULA WA I","MUHULA WA II"};
	private String[]name6={"ALI KHAMIS CAMP","KWALE"}; //
	private String[]name4={"JARIBIO","MTIHANI"};
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,ban,ban1,ba1,ba2,ba3,ba4,ba5,ba6,ba7,ba8,ba9,ba10,ba11,ba12,ba13,ba14,ba15,ba16,ba17,ba18;
	private JLabel lab1,lab3,lab4,lab5,lab7,lab9,lab10,lab11,lab13,lab15,lab16,lab17,lab19,lab21,lab22,lab23,lab25,lab27,lab28,lab29,lab30,lab31,lab32,lab33,lan1,lan2,lan3;
	private JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12;
	private static JLabel date;
	private static JLabel empty;
	private static JLabel time;  
	private static JLabel kappa;
	private static JLabel hash;
	private Double grade1,grade2,grade3,grade4,grade5,grade6,grade7,grade8,grade9,grade10,grade11,grade12;
	private String grad1,grad2,grad3,grad4,grad5,grad6,grad7,grad8,grad9,grad10,grad11,grad12;
	private Double grd1,grd2,grd3,grd4,grd5,grd6,grd7,grd8,grd9,grd10,grd11,grd12;
	private JTextArea area,area1;
	private JTable table,table2,table3,table4,table5,table6,table7;
	private JScrollPane pane,pane1,pane2,pane3,pane4,pane5,pane6,pane7;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private String dd;
	private JTabbedPane tab;
	private String school="ALI KHAMIS CAMP";
	

	public Primary() {
		
		super("Result System Standard I-VI");
		
		try {
			Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection("jdbc:sqlite:credit.sqlite");
			//OptionPane.showMessageDialog(null,"Connected !");
		} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		p=new JPanel();
		p1=new JPanel()	;
		p2=new JPanel()	;
		p3=new JPanel()	;
		p4=new JPanel()	;
		p5=new JPanel()	;
		p6=new JPanel()	;
		p7=new JPanel()	;
		p8=new JPanel()	;
		p9=new JPanel()	;
		p10=new JPanel();
		pana=new JPanel();
		pana1=new JPanel();
		panel=new JPanel();
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		panel4=new JPanel();
		panel6=new JPanel();
		panel5=new JPanel();
		pe=new JPanel();
		pc=new JPanel();
		pw=new JPanel();
		pan1=new JPanel();
		pan2=new JPanel();
		pan3=new JPanel();
		pan4=new JPanel();
		pan5=new JPanel();
		pa1=new JPanel();
		pa2=new JPanel();
		pa3=new JPanel();
		pa4=new JPanel();
		pa5=new JPanel();
		pa6=new JPanel();
		pa7=new JPanel();
		pa8=new JPanel();
		pa9=new JPanel();
		pa10=new JPanel();
		pa11=new JPanel();
		pa12=new JPanel();
		pa13=new JPanel();
		pa14=new JPanel();
		pa15=new JPanel();
		pa16=new JPanel();
		pa17=new JPanel();
		pa18=new JPanel();
		pa19=new JPanel();
		pa20=new JPanel();
		pa21=new JPanel();
		pa22=new JPanel();
		pa23=new JPanel();
		
		
		
		tab=new JTabbedPane();add(tab);
		tab.addTab("Student Information",null, p,"Student Information");
		//tab.addTab("Update Marks",null, pa1,"Update Marks");
		tab.addTab("Darasa la I",null, pa6,"Update Marks");
		tab.addTab("Darasa la II",null, pa9,"Update Marks");
		tab.addTab("Darasa la III",null, pa12,"Update Marks");
		tab.addTab("Darasa la IV",null, pa15,"Update Marks");
		tab.addTab("Darasa la V",null, pa18,"Update Marks");
		tab.addTab("Darasa la VI",null, pa21,"Update Marks");
	
		
		Border in=BorderFactory.createEmptyBorder(2,5,2,5);//p6.setBackground(Color.BLACK);
		Border ou=BorderFactory.createTitledBorder("");
		p10.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pan3.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pan4.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p5.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p6.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p7.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p8.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p9.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pw.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pc.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa3.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa4.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa5.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pan2.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa7.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa8.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa10.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa11.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa13.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa14.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa16.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa17.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa19.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa20.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa22.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa23.setBorder(BorderFactory.createCompoundBorder(in, ou));
		
		
		pa6.setLayout(new BorderLayout());
		pa6.add(pa7,BorderLayout.NORTH);
		pa6.add(pa8,BorderLayout.CENTER);
		
		pa9.setLayout(new BorderLayout());
		pa9.add(pa10,BorderLayout.NORTH);
		pa9.add(pa11,BorderLayout.CENTER);
		
		pa12.setLayout(new BorderLayout());
		pa12.add(pa13,BorderLayout.NORTH);
		pa12.add(pa14,BorderLayout.CENTER);
		
		pa15.setLayout(new BorderLayout());
		pa15.add(pa16,BorderLayout.NORTH);
		pa15.add(pa17,BorderLayout.CENTER);
		
		pa18.setLayout(new BorderLayout());
		pa18.add(pa19,BorderLayout.NORTH);
		pa18.add(pa20,BorderLayout.CENTER);
		
		pa21.setLayout(new BorderLayout());
		pa21.add(pa22,BorderLayout.NORTH);
		pa21.add(pa23,BorderLayout.CENTER);
		
		
		
		pa1.setLayout(new BorderLayout());
		pa1.add(pa2,BorderLayout.NORTH);
		pa1.add(pa3,BorderLayout.CENTER);
		
		pa2.setLayout(new BorderLayout());
		//pa2.add(pa4,BorderLayout.NORTH);
		pa2.add(pa5,BorderLayout.SOUTH);
		
	//	add(p,BorderLayout.CENTER);
		p.setLayout(new BorderLayout());
		p.add(p1,BorderLayout.WEST);
		p.add(p2,BorderLayout.CENTER);
		
		p1.setLayout(new BorderLayout());
		p1.add(p3,BorderLayout.CENTER);
		p1.add(p4,BorderLayout.SOUTH);
		
		p3.setLayout(new BorderLayout());
		p3.add(p5,BorderLayout.NORTH);
		p3.add(p6,BorderLayout.CENTER);
		
		p4.setLayout(new BorderLayout());
		p4.add(p7,BorderLayout.NORTH);
		p4.add(p8,BorderLayout.CENTER);
		
		p2.setLayout(new BorderLayout());//p9
		p2.add(pan1,BorderLayout.NORTH);
		p2.add(p10,BorderLayout.CENTER);
		
		pan1.setLayout(new BorderLayout());
		pan1.add(p9,BorderLayout.NORTH);
	    pan1.add(pan2,BorderLayout.SOUTH);
		
		//pan2.setLayout(new BorderLayout());
		//pan2.add(pan3,BorderLayout.WEST);
		//pan2.add(pan4,BorderLayout.EAST);
		
	
		JLabel n=new JLabel("STUDENT'S  RESULT  MANAGEMENT  SYSTEM");//n.setFont(new Font("Poor Richard",Font.TRUETYPE_FONT+Font.PLAIN+Font.BOLD,45));
		n.setFont(new Font("Segoe UI",Font.BOLD,48));
		n.setForeground(new Color(128,128,0));
	    p9.add(n);//p9.setBackground(new Color(253,245,230));
	    
	    
	    lan1=new JLabel("Select Class");lan1.setFont(new Font("georgia",Font.BOLD,13));lan1.setForeground(new Color(46,139,87));
		boxn=new JComboBox<String>(name2);boxn.setToolTipText("Select Class");
		boxn.setMaximumRowCount(10);
		
		lan2=new JLabel("Select Subject");lan2.setFont(new Font("georgia",Font.BOLD,13));lan2.setForeground(new Color(46,139,87));
		boxn1=new JComboBox<String>(name3);boxn1.setToolTipText("Select Subject");
		boxn1.setSelectedItem(null);boxn1.setMaximumRowCount(15);
		

		ban=new JButton("Save Marks");ban.setFont(new Font("verdana",Font.BOLD,12));ban.setBackground(Color.PINK);ban.setForeground(Color.BLUE);
		ban1=new JButton("Refresh");ban1.setFont(new Font("verdana",Font.BOLD,12));ban1.setBackground(Color.BLACK);ban1.setForeground(Color.WHITE);
		ba7=new JButton("Save Marks");ba7.setFont(new Font("verdana",Font.BOLD,12));ba7.setBackground(Color.PINK);ba7.setForeground(Color.BLUE);
		ba8=new JButton("Refresh");ba8.setFont(new Font("verdana",Font.BOLD,12));ba8.setBackground(Color.BLACK);ba8.setForeground(Color.WHITE);
		ba9=new JButton("Save Marks");ba9.setFont(new Font("verdana",Font.BOLD,12));ba9.setBackground(Color.PINK);ba9.setForeground(Color.BLUE);
		ba10=new JButton("Refresh");ba10.setFont(new Font("verdana",Font.BOLD,12));ba10.setBackground(Color.BLACK);ba10.setForeground(Color.WHITE);
		ba11=new JButton("Save Marks");ba11.setFont(new Font("verdana",Font.BOLD,12));ba11.setBackground(Color.PINK);ba11.setForeground(Color.BLUE);
		ba12=new JButton("Refresh");ba12.setFont(new Font("verdana",Font.BOLD,12));ba12.setBackground(Color.BLACK);ba12.setForeground(Color.WHITE);
		ba13=new JButton("Save Marks");ba13.setFont(new Font("verdana",Font.BOLD,12));ba13.setBackground(Color.PINK);ba13.setForeground(Color.BLUE);
		ba14=new JButton("Refresh");ba14.setFont(new Font("verdana",Font.BOLD,12));ba14.setBackground(Color.BLACK);ba14.setForeground(Color.WHITE);
		ba15=new JButton("Save Marks");ba15.setFont(new Font("verdana",Font.BOLD,12));ba15.setBackground(Color.PINK);ba15.setForeground(Color.BLUE);
		ba16=new JButton("Refresh");ba16.setFont(new Font("verdana",Font.BOLD,12));ba16.setBackground(Color.BLACK);ba16.setForeground(Color.WHITE);
		ba17=new JButton("Save Marks");ba17.setFont(new Font("verdana",Font.BOLD,12));ba17.setBackground(Color.PINK);ba17.setForeground(Color.BLUE);
		ba18=new JButton("Refresh");ba18.setFont(new Font("verdana",Font.BOLD,12));ba18.setBackground(Color.BLACK);ba18.setForeground(Color.WHITE);
		
		
		
		ba1=new JButton("Darasa la I");ba1.setFont(new Font("verdana",Font.BOLD,12));ba1.setBackground(Color.pink);ba1.setForeground(Color.blue);
		ba2=new JButton("Darasa la II");ba2.setFont(new Font("verdana",Font.BOLD,12));ba2.setBackground(Color.pink);ba2.setForeground(Color.blue);
		ba3=new JButton("Darasa la III");ba3.setFont(new Font("verdana",Font.BOLD,12));ba3.setBackground(Color.pink);ba3.setForeground(Color.blue);
		ba4=new JButton("Darasa la IV");ba4.setFont(new Font("verdana",Font.BOLD,12));ba4.setBackground(Color.pink);ba4.setForeground(Color.blue);
		ba5=new JButton("Darasa la V");ba5.setFont(new Font("verdana",Font.BOLD,12));ba5.setBackground(Color.pink);ba5.setForeground(Color.blue);
		ba6=new JButton("Darasa la VI");ba6.setFont(new Font("verdana",Font.BOLD,12));ba6.setBackground(Color.pink);ba6.setForeground(Color.blue);
		

	    pa7.setLayout(new GridBagLayout());
		GridBagConstraints c44=new GridBagConstraints();
		c44.insets=new Insets(0,5,0,5);
		c44.gridx=1;c44.gridy=1;
		pa7.add(ba7, c44);
		c44.gridx=2;c44.gridy=1;
		pa7.add(ba8, c44);//pa4.setBackground(Color.red);
		

	    pa13.setLayout(new GridBagLayout());
		c44.insets=new Insets(0,5,0,5);
		c44.gridx=1;c44.gridy=1;
		pa13.add(ba11, c44);
		c44.gridx=2;c44.gridy=1;
		pa13.add(ba12, c44);//pa4.setBackground(Color.red);
		
		pa22.setLayout(new GridBagLayout());
		c44.insets=new Insets(0,5,0,5);
		c44.gridx=1;c44.gridy=1;
		pa22.add(ba17, c44);
		c44.gridx=2;c44.gridy=1;
		pa22.add(ba18, c44);//pa4.setBackground(Color.red);
		
		
		pa19.setLayout(new GridBagLayout());
		c44.insets=new Insets(0,5,0,5);
		c44.gridx=1;c44.gridy=1;
		pa19.add(ba15, c44);
		c44.gridx=2;c44.gridy=1;
		pa19.add(ba16, c44);//pa4.setBackground(Color.red);
		
		pa16.setLayout(new GridBagLayout());
		c44.insets=new Insets(0,5,0,5);
		c44.gridx=1;c44.gridy=1;
		pa16.add(ba13, c44);
		c44.gridx=2;c44.gridy=1;
		pa16.add(ba14, c44);//pa4.setBackground(Color.red);
		
		
		  pa10.setLayout(new GridBagLayout());
			c44.insets=new Insets(0,5,0,5);
			c44.gridx=1;c44.gridy=1;
			pa10.add(ba9, c44);
			c44.gridx=2;c44.gridy=1;
			pa10.add(ba10, c44);//pa4.setBackground(Color.red);
			
		
		
	    pa5.setLayout(new GridBagLayout());
		c44.insets=new Insets(0,5,0,5);
		c44.gridx=1;c44.gridy=1;
		pa5.add(lan1, c44);
		c44.gridx=2;c44.gridy=1;
		pa5.add(boxn, c44);//pa4.setBackground(Color.red);
		
		c44.gridx=5;c44.gridy=1;
	    pa5.add(ban1, c44);

		c44.gridx=4;c44.gridy=1;
		pa5.add(ban, c44);
		
		
	    	 pan2.setLayout(new GridBagLayout());
			c44.insets=new Insets(0,5,0,5);
			c44.gridx=0;c44.gridy=1;
			pan2.add(ba1, c44);
			
			c44.gridx=1;c44.gridy=1;
			pan2.add(ba2, c44);
			
			c44.gridx=2;c44.gridy=1;
			pan2.add(ba3, c44);
			
			c44.gridx=3;c44.gridy=1;
			pan2.add(ba4, c44);
			
			c44.gridx=4;c44.gridy=1;
			pan2.add(ba5, c44);
			
			c44.gridx=5;c44.gridy=1;
			pan2.add(ba6, c44);
			
			
			
		
	    Icon save=new ImageIcon(this.getClass().getResource("/save.png"));
		Icon search=new ImageIcon(this.getClass().getResource("/search.png"));
		Icon edit=new ImageIcon(this.getClass().getResource("/edit.png"));
		Icon delete=new ImageIcon(this.getClass().getResource("/delete.png"));
		Icon show=new ImageIcon(this.getClass().getResource("/show.png"));
		Icon print=new ImageIcon(this.getClass().getResource("/print.png"));
		Icon refresh=new ImageIcon(this.getClass().getResource("/refresh.png"));
		
		
		b1=new JButton("Save");b1.setIcon(save);
		b2=new JButton("Show");b2.setIcon(show);
		b3=new JButton("Update");b3.setIcon(edit);
		b4=new JButton("Delete");b4.setIcon(delete);
		b5=new JButton("Refresh");b5.setIcon(refresh);
		b6=new JButton("Print Report");b6.setIcon(null);b6.setFont(new Font("serif",Font.BOLD,12));b6.setForeground(Color.BLUE);
		b7=new JButton("Update Marks");b7.setFont(new Font("serif",Font.BOLD,12));b7.setForeground(Color.BLUE);
		b8=new JButton(new StyledEditorKit.BoldAction() );
		b8.setBackground(Color.PINK);
		
		
		
		field=new JTextField("",16);   
		field.setToolTipText("Enter First Name or Last Name");
		label=new JLabel();label.setIcon(search);
		area=new JTextArea(9,22);//area.setBackground(Color.pink);
		area.setEditable(false);
		area.setFont(new Font("aerial",Font.PLAIN+Font.BOLD,12));
		
		table=new JTable();
		pane=new JScrollPane(table);
		
		table2=new JTable();
		pane2=new JScrollPane(table2);
		
		table3=new JTable();
		pane3=new JScrollPane(table3);
		
		table4=new JTable();
		pane4=new JScrollPane(table4);
		
		table5=new JTable();
		pane5=new JScrollPane(table5);
		
		table6=new JTable();
		pane6=new JScrollPane(table6);
		
		table7=new JTable();
		pane7=new JScrollPane(table7);
		
		
		pa8.setLayout(new BorderLayout());
		pa8.add(pane2);
		
		pa11.setLayout(new BorderLayout());
		pa11.add(pane3);
		
		pa14.setLayout(new BorderLayout());
		pa14.add(pane4);
		
		pa17.setLayout(new BorderLayout());
		pa17.add(pane5);
		
		pa20.setLayout(new BorderLayout());
		pa20.add(pane6);
		
		pa23.setLayout(new BorderLayout());
		pa23.add(pane7);
		
		
		area1=new JTextArea(20,57);
		area1.setEditable(true);
		area1.setFont(new Font("verdana",Font.PLAIN,11));
		area1.setLineWrap(true);
		area1.setWrapStyleWord(true);
		
		pane1=new JScrollPane(area1);
		panel4.add(pane1);
		
		
		
		p5.setLayout(new GridBagLayout());
		GridBagConstraints c3=new GridBagConstraints();
		c3.insets=new Insets(0,1,0,1);
		c3.gridx=1;c3.gridy=1;
		p5.add(field, c3);
		c3.gridx=2;c3.gridy=1;
		p5.add(label, c3);
		
		tan=new JTextField(5); 
		lan3=new JLabel("Mark        ");lan3.setFont(new Font("georgia",Font.BOLD,13));lan3.setForeground(new Color(46,139,87));
		pan5.setLayout(new GridBagLayout());
		c3.insets=new Insets(0,1,0,1);
		c3.gridx=1;c3.gridy=1;
		pan5.add(lan3, c3);
		c3.gridx=2;c3.gridy=1;
		pan5.add(tan, c3);
		
		
		

		lab1=new JLabel("A");lab1.setFont(new Font("georgia",Font.BOLD,13));lab1.setForeground(Color.BLUE);
		text1=new JTextField(3);text1.setFont(new Font("georgia",Font.BOLD,13));
		lab3=new JLabel("≤");lab3.setFont(new Font("georgia",Font.BOLD,13));lab3.setForeground(new Color(46,139,87));
		lab4=new JLabel("mark");lab4.setFont(new Font("verdana",Font.BOLD,13));lab4.setForeground(new Color(46,139,87));
		lab5=new JLabel("≤");lab5.setFont(new Font("georgia",Font.BOLD,13));lab5.setForeground(new Color(46,139,87));
		text2=new JTextField(3);text2.setFont(new Font("georgia",Font.BOLD,13));
		
		lab7=new JLabel("B+");lab7.setFont(new Font("georgia",Font.BOLD,13));lab7.setForeground(Color.BLUE);
		text3=new JTextField(3);text3.setFont(new Font("georgia",Font.BOLD,13));
		lab9=new JLabel("≤");lab9.setFont(new Font("georgia",Font.BOLD,13));lab9.setForeground(new Color(46,139,87));
		lab10=new JLabel("mark");lab10.setFont(new Font("verdana",Font.BOLD,13));lab10.setForeground(new Color(46,139,87));
		lab11=new JLabel("<");lab11.setFont(new Font("georgia",Font.BOLD,13));lab11.setForeground(new Color(46,139,87));
		text4=new JTextField(3);text4.setFont(new Font("georgia",Font.BOLD,13));
		
		lab13=new JLabel("B");lab13.setFont(new Font("georgia",Font.BOLD,13));lab13.setForeground(Color.BLUE);
		text5=new JTextField(3);text5.setFont(new Font("georgia",Font.BOLD,13));
		lab15=new JLabel("≤");lab15.setFont(new Font("georgia",Font.BOLD,13));lab15.setForeground(new Color(46,139,87));
		lab16=new JLabel("mark");lab16.setFont(new Font("verdana",Font.BOLD,13));lab16.setForeground(new Color(46,139,87));
		lab17=new JLabel("<");lab17.setFont(new Font("georgia",Font.BOLD,13));lab17.setForeground(new Color(46,139,87));
		text6=new JTextField(3);text6.setFont(new Font("georgia",Font.BOLD,13));
		
		lab19=new JLabel("C");lab19.setFont(new Font("georgia",Font.BOLD,13));lab19.setForeground(Color.BLUE);
		text7=new JTextField(3);text7.setFont(new Font("georgia",Font.BOLD,13));
		lab21=new JLabel("≤");lab21.setFont(new Font("georgia",Font.BOLD,13));lab21.setForeground(new Color(46,139,87));
		lab22=new JLabel("mark");lab22.setFont(new Font("verdana",Font.BOLD,13));lab22.setForeground(new Color(46,139,87));
		lab23=new JLabel("<");lab23.setFont(new Font("georgia",Font.BOLD,13));lab23.setForeground(new Color(46,139,87));
		text8=new JTextField(3);text8.setFont(new Font("georgia",Font.BOLD,13));
		
		lab25=new JLabel("D");lab25.setFont(new Font("georgia",Font.BOLD,13));lab25.setForeground(Color.BLUE);
		text9=new JTextField(3);text9.setFont(new Font("georgia",Font.BOLD,13));
		lab27=new JLabel("≤");lab27.setFont(new Font("georgia",Font.BOLD,13));lab27.setForeground(new Color(46,139,87));
		lab28=new JLabel("mark");lab28.setFont(new Font("verdana",Font.BOLD,13));lab28.setForeground(new Color(46,139,87));
		lab29=new JLabel("<");lab29.setFont(new Font("georgia",Font.BOLD,13));lab29.setForeground(new Color(46,139,87));
		text10=new JTextField(3);text10.setFont(new Font("georgia",Font.BOLD,13));
		
		
		lab30=new JLabel("F");lab30.setFont(new Font("georgia",Font.BOLD,13));lab30.setForeground(Color.BLUE);
		text11=new JTextField(3);text11.setFont(new Font("georgia",Font.BOLD,13));
		lab31=new JLabel("≤");lab31.setFont(new Font("georgia",Font.BOLD,13));lab31.setForeground(new Color(46,139,87));
		lab32=new JLabel("mark");lab32.setFont(new Font("verdana",Font.BOLD,13));lab32.setForeground(new Color(46,139,87));
		lab33=new JLabel("<");lab33.setFont(new Font("georgia",Font.BOLD,13));lab33.setForeground(new Color(46,139,87));
		text12=new JTextField(3);text12.setFont(new Font("georgia",Font.BOLD,13));
		
		
		
		panel3.setLayout(new GridBagLayout());
		GridBagConstraints cc3=new GridBagConstraints();
		cc3.insets=new Insets(2,10,1,10);
		
		cc3.gridx=1;cc3.gridy=1;
		panel3.add(lab1, cc3);
		cc3.gridx=2;cc3.gridy=1;
		panel3.add(text1, cc3);
		cc3.gridx=3;cc3.gridy=1;
		panel3.add(lab3, cc3);
		cc3.gridx=4;cc3.gridy=1;
		panel3.add(lab4, cc3);
		cc3.gridx=5;cc3.gridy=1;
		panel3.add(lab5, cc3);
		cc3.gridx=6;cc3.gridy=1;
		panel3.add(text2, cc3);
		
		cc3.gridx=1;cc3.gridy=2;
		panel3.add(lab7, cc3);
		cc3.gridx=2;cc3.gridy=2;
		panel3.add(text3, cc3);
		cc3.gridx=3;cc3.gridy=2;
		panel3.add(lab9, cc3);
		cc3.gridx=4;cc3.gridy=2;
		panel3.add(lab10, cc3);
		cc3.gridx=5;cc3.gridy=2;
		panel3.add(lab11, cc3);
		cc3.gridx=6;cc3.gridy=2;
		panel3.add(text4, cc3);
		
		cc3.gridx=1;cc3.gridy=3;
		panel3.add(lab13, cc3);
		cc3.gridx=2;cc3.gridy=3;
		panel3.add(text5, cc3);
		cc3.gridx=3;cc3.gridy=3;
		panel3.add(lab15, cc3);
		cc3.gridx=4;cc3.gridy=3;
		panel3.add(lab16, cc3);
		cc3.gridx=5;cc3.gridy=3;
		panel3.add(lab17, cc3);
		cc3.gridx=6;cc3.gridy=3;
		panel3.add(text6, cc3);
		
		cc3.gridx=1;cc3.gridy=4;
		panel3.add(lab19, cc3);
		cc3.gridx=2;cc3.gridy=4;
		panel3.add(text7, cc3);
		cc3.gridx=3;cc3.gridy=4;
		panel3.add(lab21, cc3);
		cc3.gridx=4;cc3.gridy=4;
		panel3.add(lab22, cc3);
		cc3.gridx=5;cc3.gridy=4;
		panel3.add(lab23, cc3);
		cc3.gridx=6;cc3.gridy=4;
		panel3.add(text8, cc3);
		
		cc3.gridx=1;cc3.gridy=5;
		panel3.add(lab25, cc3);
		cc3.gridx=2;cc3.gridy=5;
		panel3.add(text9, cc3);
		cc3.gridx=3;cc3.gridy=5;
		panel3.add(lab27, cc3);
		cc3.gridx=4;cc3.gridy=5;
		panel3.add(lab28, cc3);
		cc3.gridx=5;cc3.gridy=5;
		panel3.add(lab29, cc3);
		cc3.gridx=6;cc3.gridy=5;
		panel3.add(text10, cc3);
		
		cc3.gridx=1;cc3.gridy=6;
		panel3.add(lab30, cc3);
		cc3.gridx=2;cc3.gridy=6;
		panel3.add(text11, cc3);
		cc3.gridx=3;cc3.gridy=6;
		panel3.add(lab31, cc3);
		cc3.gridx=4;cc3.gridy=6;
		panel3.add(lab32, cc3);
		cc3.gridx=5;cc3.gridy=6;
		panel3.add(lab33, cc3);
		cc3.gridx=6;cc3.gridy=6;
		panel3.add(text12, cc3);
		
		
		cc3.gridx=4;cc3.gridy=6;
		//panel3.add(b9, cc3);

		
		l0=new JLabel("User_ID");l0.setFont(new Font("georgia",Font.BOLD,13));l0.setForeground(new Color(46,139,87));
		t0=new JTextField(12);t0.setToolTipText("Enter User ID");
		l1=new JLabel("F & M Name");l1.setFont(new Font("georgia",Font.BOLD,13));l1.setForeground(new Color(46,139,87));
		t1=new JTextField(10);t1.setToolTipText("Enter First Name");
		l2=new JLabel("Last Name");l2.setFont(new Font("georgia",Font.BOLD,13));l2.setForeground(new Color(46,139,87));
		t2=new JTextField(10);t2.setToolTipText("Enter Last Name");
		l3=new JLabel("Gender");l3.setFont(new Font("georgia",Font.BOLD,13));l3.setForeground(new Color(46,139,87));
		t3=new JComboBox<String>(name1);t3.setToolTipText("Select Gender");t3.setSelectedItem(null);
		l4=new JLabel("Class Level");l4.setFont(new Font("georgia",Font.BOLD,13));l4.setForeground(new Color(46,139,87));
		t4=new JComboBox<String>(name2);t4.setToolTipText("Select Class Level");
		t4.setSelectedItem(null);t4.setMaximumRowCount(6);
		l5=new JLabel("Class Type");l5.setFont(new Font("georgia",Font.BOLD,13));l5.setForeground(new Color(46,139,87));
		t5=new JComboBox<String>(name3);t5.setMaximumRowCount(4);t5.setToolTipText("Select Class ");
		t5.setSelectedItem(null);t5.setMaximumRowCount(5);
		l6=new JLabel("Exam Type");l6.setFont(new Font("georgia",Font.BOLD,13));l6.setForeground(new Color(46,139,87));
		t6=new JComboBox<String>(name4);t6.setToolTipText("Select Exam Type");
		t6.setSelectedItem(null);t6.setMaximumRowCount(10);
		l7=new JLabel("Term");l7.setFont(new Font("georgia",Font.BOLD,13));l7.setForeground(new Color(46,139,87));
		t7=new JComboBox<String>(name7);t7.setToolTipText("Select Term");
		t7.setSelectedItem(null);t7.setMaximumRowCount(10);
		
		
		l20=new JLabel("ENGLISH");l20.setFont(new Font("georgia",Font.BOLD,13));l20.setForeground(new Color(46,139,87));
		t20=new JTextField(5);t20.setToolTipText("Enter English Marks");
		l21=new JLabel("KISWAHILI");l21.setFont(new Font("georgia",Font.BOLD,13));l21.setForeground(new Color(46,139,87));
		t21=new JTextField(5);t21.setToolTipText("Enter Kiswahili Marks");
		l22=new JLabel("DINI");l22.setFont(new Font("georgia",Font.BOLD,13));l22.setForeground(new Color(46,139,87));
		t22=new JTextField(5);t22.setToolTipText("Enter Dini Marks");
		l23=new JLabel("ARABIC");l23.setFont(new Font("georgia",Font.BOLD,13));l23.setForeground(new Color(46,139,87));
		t23=new JTextField(5);t23.setToolTipText("Enter Arabic Marks");
		l24=new JLabel("GEOGRAPHY");l24.setFont(new Font("georgia",Font.BOLD,13));l24.setForeground(new Color(46,139,87));
		t24=new JTextField(5);t24.setToolTipText("Enter Geography Marks");
		l25=new JLabel("URAIA");l25.setFont(new Font("georgia",Font.BOLD,13));l25.setForeground(new Color(46,139,87));
		t25=new JTextField(5);t25.setToolTipText("Enter Uraia Marks");
		l26=new JLabel("HISTORIA");l26.setFont(new Font("georgia",Font.BOLD,13));l26.setForeground(new Color(46,139,87));
		t26=new JTextField(5);t26.setToolTipText("Enter Historia Marks");
		l27=new JLabel("SCIENCE");l27.setFont(new Font("georgia",Font.BOLD,13));l27.setForeground(new Color(46,139,87));
		t27=new JTextField(5);t27.setToolTipText("Enter Science Marks");
		l28=new JLabel("MATH");l28.setFont(new Font("georgia",Font.BOLD,13));l28.setForeground(new Color(46,139,87));
		t28=new JTextField(5);t28.setToolTipText("Enter Hisabati Marks");
		l29=new JLabel("ICT");l29.setFont(new Font("georgia",Font.BOLD,13));l29.setForeground(new Color(46,139,87));
		tt29=new JTextField(5);tt29.setToolTipText("Enter Ict Marks");
		
		l30=new JLabel("ENGLISH");l30.setFont(new Font("georgia",Font.BOLD,13));l30.setForeground(new Color(46,139,87));
		t30=new JTextField(5);t30.setToolTipText("Enter English Marks");
		l31=new JLabel("KISWAHILI");l31.setFont(new Font("georgia",Font.BOLD,13));l31.setForeground(new Color(46,139,87));
		t31=new JTextField(5);t31.setToolTipText("Enter Kiswahili Marks");
		l32=new JLabel("DINI");l32.setFont(new Font("georgia",Font.BOLD,13));l32.setForeground(new Color(46,139,87));
		t32=new JTextField(5);t32.setToolTipText("Enter Dini Marks");
		l33=new JLabel("ARABIC");l33.setFont(new Font("georgia",Font.BOLD,13));l33.setForeground(new Color(46,139,87));
		t33=new JTextField(5);t33.setToolTipText("Enter Arabic Marks");
		l34=new JLabel("S/JAMII");l34.setFont(new Font("georgia",Font.BOLD,13));l34.setForeground(new Color(46,139,87));
		t34=new JTextField(5);t34.setToolTipText("Enter S/Jamii Marks");
		l35=new JLabel("SAYANSI");l35.setFont(new Font("georgia",Font.BOLD,13));l35.setForeground(new Color(46,139,87));
		t35=new JTextField(5);t35.setToolTipText("Enter Science Marks");
		l36=new JLabel("HISABATI");l36.setFont(new Font("georgia",Font.BOLD,13));l36.setForeground(new Color(46,139,87));
		t36=new JTextField(5);t36.setToolTipText("Enter Hisabati Marks");
		
	
		l37=new JLabel("ENGLISH");l37.setFont(new Font("georgia",Font.BOLD,13));l37.setForeground(new Color(46,139,87));
		t37=new JTextField(5);t37.setToolTipText("Enter English Marks");
		l38=new JLabel("KISWAHILI");l38.setFont(new Font("georgia",Font.BOLD,13));l38.setForeground(new Color(46,139,87));
		t38=new JTextField(5);t38.setToolTipText("Enter Kiswahili Marks");
		l39=new JLabel("ARABIC");l39.setFont(new Font("georgia",Font.BOLD,13));l39.setForeground(new Color(46,139,87));
		t39=new JTextField(5);t39.setToolTipText("Enter Arabic Marks");
		l40=new JLabel("HISABATI");l40.setFont(new Font("georgia",Font.BOLD,13));l40.setForeground(new Color(46,139,87));
		t40=new JTextField(5);t40.setToolTipText("Enter Hisabati Marks");
		
		
		Calendar timer=Calendar.getInstance();
		 timer.getTime();
		 SimpleDateFormat dt=new SimpleDateFormat("MMMM");
		 SimpleDateFormat yy=new SimpleDateFormat("yyyy");
		
		 Integer year=Integer.parseInt(yy.format(timer.getTime()));
		 int y1=year-4;  // String yy1=;
	     int y2=year-3;
		 int y3=year-2;
		 int y4=year-1;
		 int y5=year;
		 
		 String  s1=Integer.toString(y1);
		 String  s2=Integer.toString(y2);
		 String  s3=Integer.toString(y3);
		 String  s4=Integer.toString(y4);
		 String  s5=Integer.toString(y5);
		 
		 
		 String ss1=s1;String ss2=s2;String ss3=s3;String ss4=s4;String ss5=s5;
		
		 
		label7=new JLabel("Acad..Year");label7.setFont(new Font("georgia",Font.BOLD,13));label7.setForeground(new Color(46,139,87));
		String name5[]= {ss1,ss2,ss3,ss4,ss5};
	    box5=new JComboBox<String>(name5);box5.setMaximumRowCount(10);box5.setToolTipText("Select Year");box5.setSelectedItem(null);
		 
	    
	    et=new JComboBox<String>(name4);et.setMaximumRowCount(10);et.setToolTipText("Select Exam Type");et.setSelectedItem(null);
		ct=new JComboBox<String>(name2);ct.setMaximumRowCount(10);ct.setToolTipText("Select Class Level");ct.setSelectedItem(null);
		ac=new JComboBox<String>(name5);ac.setToolTipText("Select Academic Year");ac.setSelectedItem(null);
		le=new JLabel(" Exam Type");le.setFont(new Font("georgia",Font.BOLD,13));le.setForeground(new Color(46,139,87));
		lc=new JLabel("  Class");lc.setFont(new Font("georgia",Font.BOLD,13));lc.setForeground(new Color(46,139,87));
		la=new JLabel("Academic Year");la.setFont(new Font("georgia",Font.BOLD,13));la.setForeground(new Color(46,139,87));
		label3=new JLabel("School");label3.setFont(new Font("georgia",Font.BOLD,13));label3.setForeground(new Color(46,139,87));
		sch=new JComboBox<String>(name6);sch.setMaximumRowCount(20);sch.setToolTipText("Select School");sch.setSelectedItem(null);
		ll=new JLabel("Term");ll.setFont(new Font("georgia",Font.BOLD,13));ll.setForeground(new Color(46,139,87));
		jj=new JComboBox<String>(name7);jj.setMaximumRowCount(20);jj.setToolTipText("Select Term");jj.setSelectedItem(null);
         
		

   	    box69=new JComboBox<String>(name2);box69.setToolTipText("Select Class");box69.setSelectedItem(null);box69.setMaximumRowCount(10);
		box70=new JComboBox<String>(name2);box70.setToolTipText("Select Class ");box70.setSelectedItem(null);box70.setMaximumRowCount(10);
		l69=new JLabel("Replace");l69.setFont(new Font("georgia",Font.BOLD,13));l69.setForeground(new Color(46,139,87));
		l70=new JLabel("With");l70.setFont(new Font("georgia",Font.BOLD,13));l70.setForeground(new Color(46,139,87));
		ll0=new JLabel("Class");ll0.setFont(new Font("georgia",Font.BOLD,13));ll0.setForeground(new Color(46,139,87));
		
		
		ll1=new JLabel("Acd.. Year");ll1.setFont(new Font("georgia",Font.BOLD,13));ll1.setForeground(new Color(46,139,87));
		box71=new JComboBox<String>(name5);box71.setMaximumRowCount(4);box71.setToolTipText("Select Year ");box71.setSelectedItem(null);box71.setMaximumRowCount(5);
		box72=new JComboBox<String>(name5);box72.setMaximumRowCount(4);box72.setToolTipText("Select Year ");box72.setSelectedItem(null);box72.setMaximumRowCount(5);
		
		ll2=new JLabel("Exam Type");ll2.setFont(new Font("georgia",Font.BOLD,13));ll2.setForeground(new Color(46,139,87));
		box73=new JComboBox<String>(name4);box73.setMaximumRowCount(9);box73.setToolTipText("Select Year ");box73.setSelectedItem(null);
		box74=new JComboBox<String>(name4);box74.setMaximumRowCount(9);box74.setToolTipText("Select Year ");box74.setSelectedItem(null);
		
		ll3=new JLabel("Term");ll3.setFont(new Font("georgia",Font.BOLD,13));ll3.setForeground(new Color(46,139,87));
		box75=new JComboBox<String>(name7);box75.setMaximumRowCount(20);box75.setToolTipText("Select School ");box75.setSelectedItem(null);
		box76=new JComboBox<String>(name7);box76.setMaximumRowCount(20);box76.setToolTipText("Select School ");box76.setSelectedItem(null);
		
		box2=new JComboBox<String>(name2);box2.setMaximumRowCount(10);box2.setToolTipText("Select Class ");box2.setSelectedItem(null);
		label2=new JLabel("Select Class To Resert Marks");label2.setFont(new Font("georgia",Font.BOLD,13));label2.setForeground(new Color(46,139,87));
		
		panel2.setLayout(new GridBagLayout());
		c3.insets=new Insets(0,1,0,1);
		c3.gridx=1;c3.gridy=1;
		panel2.add(label2, c3);
		c3.gridx=2;c3.gridy=1;
		panel2.add(box2, c3);
		
		
		panel1.setLayout(new GridBagLayout());
		GridBagConstraints ccna1=new GridBagConstraints();
		ccna1.fill=GridBagConstraints.HORIZONTAL;
		ccna1.weightx=1;ccna1.weighty=1;
		ccna1.insets=new Insets(2,2,2,3);

		
		ccna1.gridx=2;ccna1.gridy=1;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(l69,ccna1);
		ccna1.gridx=1;ccna1.gridy=2;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(ll0,ccna1);
		ccna1.gridx=2;ccna1.gridy=2;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box69,ccna1);
		
		ccna1.gridx=3;ccna1.gridy=1;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(l70,ccna1);
		ccna1.gridx=3;ccna1.gridy=2;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box70,ccna1);
	
		ccna1.gridx=1;ccna1.gridy=3;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(ll2,ccna1);
		ccna1.gridx=2;ccna1.gridy=3;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(box73,ccna1);
		ccna1.gridx=3;ccna1.gridy=3;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box74,ccna1);
		
		ccna1.gridx=1;ccna1.gridy=4;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(ll1,ccna1);
		ccna1.gridx=2;ccna1.gridy=4;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(box71,ccna1);
		ccna1.gridx=3;ccna1.gridy=4;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box72,ccna1);
		
		ccna1.gridx=1;ccna1.gridy=5;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(ll3,ccna1);
		ccna1.gridx=2;ccna1.gridy=5;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(box75,ccna1);
		ccna1.gridx=3;ccna1.gridy=5;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box76,ccna1);
			
		
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints ccna=new GridBagConstraints();
		ccna.fill=GridBagConstraints.HORIZONTAL;
		ccna.weightx=1;ccna.weighty=1;
		ccna.insets=new Insets(2,2,2,3);
		
		
		
		ccna.gridx=1;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel.add(le,ccna);
		ccna.gridx=1;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel.add(et,ccna);
		
		ccna.gridx=2;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel.add(lc,ccna);
		ccna.gridx=2;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel.add(ct,ccna);
		
		ccna.gridx=3;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel.add(la,ccna);
		ccna.gridx=3;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel.add(ac,ccna);
		
		ccna.gridx=4;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel.add(ll,ccna);
		ccna.gridx=4;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel.add(jj,ccna);
		
		ccna.gridx=1;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_END;
	//	panel.add(b8,ccna);
		
		/*ccna.gridy=3;
		ccna.weightx=100;
		ccna.gridx=GridBagConstraints.RELATIVE;
		ccna.gridwidth=GridBagConstraints.CENTER;
	    panel.add(pane1,ccna);
		*/
	    l10=new JLabel("User_ID");l10.setFont(new Font("georgia",Font.BOLD,13));l10.setForeground(new Color(46,139,87));
		t10=new JTextField(12);t10.setToolTipText("Enter User ID");
		l11=new JLabel("F & M Name");l11.setFont(new Font("georgia",Font.BOLD,13));l11.setForeground(new Color(46,139,87));
		t11=new JTextField(10);t11.setToolTipText("Enter First Name");
		l12=new JLabel("Last Name");l12.setFont(new Font("georgia",Font.BOLD,13));l12.setForeground(new Color(46,139,87));
		t12=new JTextField(10);t12.setToolTipText("Enter Last Name");
		l13=new JLabel("Gender");l13.setFont(new Font("georgia",Font.BOLD,13));l13.setForeground(new Color(46,139,87));
		t13=new JComboBox<String>(name1);t13.setToolTipText("Select Gender");t13.setSelectedItem(null);
		l14=new JLabel("Class Level");l14.setFont(new Font("georgia",Font.BOLD,13));l14.setForeground(new Color(46,139,87));
		t14=new JComboBox<String>(name2);t14.setMaximumRowCount(10);t14.setToolTipText("Select Class Level");
		t14.setSelectedItem(null);
		l15=new JLabel("Combi");l15.setFont(new Font("georgia",Font.BOLD,13));l15.setForeground(new Color(46,139,87));
		t15=new JComboBox<String>(name3);t15.setMaximumRowCount(4);t15.setToolTipText("Select Combination");
		t15.setSelectedItem(null);t15.setMaximumRowCount(5);
		l16=new JLabel("Exam Type");l16.setFont(new Font("georgia",Font.BOLD,13));l16.setForeground(new Color(46,139,87));
		t16=new JComboBox<String>(name4);t16.setMaximumRowCount(10);t16.setToolTipText("Select Exam Type");
		t16.setSelectedItem(null);
		 
		label17=new JLabel("Acad..Year");label17.setFont(new Font("georgia",Font.BOLD,13));label17.setForeground(new Color(46,139,87));
		box15=new JComboBox<String>(name5);box5.setMaximumRowCount(10);box15.setToolTipText("Select Year");box15.setSelectedItem(null);
			 
		label16=new JLabel("Term");label16.setFont(new Font("georgia",Font.BOLD,13));label16.setForeground(new Color(46,139,87));
		box16=new JComboBox<String>(name7);box16.setMaximumRowCount(20);box16.setToolTipText("Select Term");box16.setSelectedItem(null);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	 
		panel5.setLayout(new GridBagLayout());
		ccna.fill=GridBagConstraints.HORIZONTAL;
		ccna.weightx=1;ccna.weighty=1;
		ccna.insets=new Insets(2,2,2,3);

		ccna.gridx=1;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel5.add(l30,ccna);
		ccna.gridx=2;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel5.add(t30,ccna);
		
		ccna.gridx=1;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel5.add(l31,ccna);
		ccna.gridx=2;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel5.add(t31,ccna);
		
		ccna.gridx=1;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel5.add(l32,ccna);
		ccna.gridx=2;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel5.add(t32,ccna);
		
		ccna.gridx=1;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel5.add(l33,ccna);
		ccna.gridx=2;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel5.add(t33,ccna);
		
		ccna.gridx=1;ccna.gridy=5;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel5.add(l34,ccna);
		ccna.gridx=2;ccna.gridy=5;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel5.add(t34,ccna);
		
		ccna.gridx=1;ccna.gridy=6;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel5.add(l35,ccna);
		ccna.gridx=2;ccna.gridy=6;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel5.add(t35,ccna);
		
		ccna.gridx=1;ccna.gridy=7;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel5.add(l36,ccna);
		ccna.gridx=2;ccna.gridy=7;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel5.add(t36,ccna);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		panel6.setLayout(new GridBagLayout());
		ccna.fill=GridBagConstraints.HORIZONTAL;
		ccna.weightx=1;ccna.weighty=1;
		ccna.insets=new Insets(2,2,2,3);

		ccna.gridx=1;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel6.add(l37,ccna);
		ccna.gridx=2;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel6.add(t37,ccna);
		
		ccna.gridx=1;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel6.add(l38,ccna);
		ccna.gridx=2;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel6.add(t38,ccna);
		
		ccna.gridx=1;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel6.add(l39,ccna);
		ccna.gridx=2;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel6.add(t39,ccna);
		
		ccna.gridx=1;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_END;
		panel6.add(l40,ccna);
		ccna.gridx=2;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_START;
		panel6.add(t40,ccna);
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		pana1.setLayout(new GridBagLayout());
		ccna.fill=GridBagConstraints.HORIZONTAL;
		ccna.weightx=1;ccna.weighty=1;
		ccna.insets=new Insets(2,2,2,3);

		
		ccna.gridx=1;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l20,ccna);
		ccna.gridx=2;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t20,ccna);
		
		ccna.gridx=1;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l21,ccna);
		ccna.gridx=2;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t21,ccna);
		
		ccna.gridx=1;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l22,ccna);
		ccna.gridx=2;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t22,ccna);
		
		ccna.gridx=1;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l23,ccna);
		ccna.gridx=2;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t23,ccna);
		
		ccna.gridx=1;ccna.gridy=5;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l24,ccna);
		ccna.gridx=2;ccna.gridy=5;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t24,ccna);
		
		ccna.gridx=1;ccna.gridy=6;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l25,ccna);
		ccna.gridx=2;ccna.gridy=6;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t25,ccna);
		
		ccna.gridx=1;ccna.gridy=7;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l26,ccna);
		ccna.gridx=2;ccna.gridy=7;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t26,ccna);
		
		ccna.gridx=1;ccna.gridy=8;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l27,ccna);
		ccna.gridx=2;ccna.gridy=8;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t27,ccna);
		
		ccna.gridx=1;ccna.gridy=9;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l28,ccna);
		ccna.gridx=2;ccna.gridy=9;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t28,ccna);
		
		ccna.gridx=1;ccna.gridy=10;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l29,ccna);
		ccna.gridx=2;ccna.gridy=10;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(tt29,ccna);
		
		
		
	    p6.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		c.fill=GridBagConstraints.HORIZONTAL;
		c.weightx=1;c.weighty=0.2;
		c.insets=new Insets(5,5,5,5);

		c.gridx=1;c.gridy=1;
		c.anchor=GridBagConstraints.LINE_END;
		p6.add(l0,c);
		c.gridx=2;c.gridy=1;
		c.anchor=GridBagConstraints.LINE_START;
		p6.add(t0,c);

		c.gridx=1;c.gridy=2;
		c.anchor=GridBagConstraints.LINE_END;
		p6.add(l1,c);
		c.gridx=2;c.gridy=2;
		c.anchor=GridBagConstraints.LINE_START;
		p6.add(t1,c);

		c.gridx=1;c.gridy=3;
		c.anchor=GridBagConstraints.LINE_END;
		p6.add(l2,c);
		c.gridx=2;c.gridy=3;
		c.anchor=GridBagConstraints.LINE_START;
		p6.add(t2,c);

		c.gridx=1;c.gridy=4;
		c.anchor=GridBagConstraints.LINE_END;
		p6.add(l3,c);
		c.gridx=2;c.gridy=4;
		c.anchor=GridBagConstraints.LINE_START;
		p6.add(t3,c);

		c.gridx=1;c.gridy=5;
		c.anchor=GridBagConstraints.LINE_END;
		p6.add(l4,c);
		c.gridx=2;c.gridy=5;
		c.anchor=GridBagConstraints.LINE_START;
		p6.add(t4,c);

		c.gridx=1;c.gridy=6;
		c.anchor=GridBagConstraints.LINE_END;
		//p6.add(l5,c);
		c.gridx=2;c.gridy=6;
		c.anchor=GridBagConstraints.LINE_START;
	//	p6.add(t5,c);

		c.gridx=1;c.gridy=7;
		c.anchor=GridBagConstraints.LINE_END;
		p6.add(l6,c);
		c.gridx=2;c.gridy=7;
		c.anchor=GridBagConstraints.LINE_START;
		p6.add(t6,c);
		
		c.gridx=1;c.gridy=8;
		c.anchor=GridBagConstraints.LINE_END;
		p6.add(label7,c);
		c.gridx=2;c.gridy=8;
		c.anchor=GridBagConstraints.LINE_START;
		p6.add(box5,c);
	    
		c.gridx=1;c.gridy=9;
		c.anchor=GridBagConstraints.LINE_END;
		p6.add(l7,c);
		c.gridx=2;c.gridy=9;
		c.anchor=GridBagConstraints.LINE_START;
		p6.add(t7,c);
		
		p7.setLayout(new GridBagLayout());
		GridBagConstraints c8=new GridBagConstraints();
		c8.fill=GridBagConstraints.HORIZONTAL;
		c8.weightx=1;c8.weighty=1;
		c8.insets=new Insets(5,5,5,5);
		c8.gridwidth=GridBagConstraints.RELATIVE;
		c8.fill=GridBagConstraints.HORIZONTAL;
		c8.gridwidth=GridBagConstraints.BOTH;
		
		c8.gridx=1;c8.gridy=2;
		p7.add(b1, c8);
		c8.gridx=2;c8.gridy=2;
		p7.add(b3, c8);
		c8.gridx=1;c8.gridy=3;
		p7.add(b5, c8);
		c8.gridx=2;c8.gridy=3;
		p7.add(b4, c8);
		c8.gridx=1;c8.gridy=4;
		p7.add(b7, c8);
		c8.gridx=2;c8.gridy=4;
	//	p7.add(b6, c8);
		
		p8.setLayout(new GridBagLayout());
		c3.insets=new Insets(0,1,0,1);
		c3.gridx=1;c3.gridy=1;
		p8.add(area, c3);
		
		p10.setLayout(new BorderLayout());
		p10.add(pane);
		
		pana.setLayout(new GridBagLayout());
		c.fill=GridBagConstraints.HORIZONTAL;
		c.weightx=1;c.weighty=0.2;
		c.insets=new Insets(5,5,5,5);

		c.gridx=1;c.gridy=1;
		c.anchor=GridBagConstraints.LINE_END;
		pana.add(l10,c);
		c.gridx=2;c.gridy=1;
		c.anchor=GridBagConstraints.LINE_START;
		pana.add(t10,c);

		c.gridx=1;c.gridy=2;
		c.anchor=GridBagConstraints.LINE_END;
		pana.add(l11,c);
		c.gridx=2;c.gridy=2;
		c.anchor=GridBagConstraints.LINE_START;
		pana.add(t11,c);

		c.gridx=1;c.gridy=3;
		c.anchor=GridBagConstraints.LINE_END;
		pana.add(l12,c);
		c.gridx=2;c.gridy=3;
		c.anchor=GridBagConstraints.LINE_START;
		pana.add(t12,c);

		c.gridx=1;c.gridy=4;
		c.anchor=GridBagConstraints.LINE_END;
		pana.add(l13,c);
		c.gridx=2;c.gridy=4;
		c.anchor=GridBagConstraints.LINE_START;
		pana.add(t13,c);

		c.gridx=1;c.gridy=5;
		c.anchor=GridBagConstraints.LINE_END;
		pana.add(l14,c);
		c.gridx=2;c.gridy=5;
		c.anchor=GridBagConstraints.LINE_START;
		pana.add(t14,c);

		
		c.gridx=1;c.gridy=7;
		c.anchor=GridBagConstraints.LINE_END;
		pana.add(l16,c);
		c.gridx=2;c.gridy=7;
		c.anchor=GridBagConstraints.LINE_START;
		pana.add(t16,c);
		
		c.gridx=1;c.gridy=8;
		c.anchor=GridBagConstraints.LINE_END;
		pana.add(label17,c);
		c.gridx=2;c.gridy=8;
		c.anchor=GridBagConstraints.LINE_START;
		pana.add(box15,c);
		
		c.gridx=1;c.gridy=9;
		c.anchor=GridBagConstraints.LINE_END;
		pana.add(label16,c);
		c.gridx=2;c.gridy=9;
		c.anchor=GridBagConstraints.LINE_START;
		pana.add(box16,c);

		
		//JOptionPane.showMessageDialog(null, grad6);
		
		table();
		bar();
		button();
		resert();
		//update();
	    //area();
		field();
		validatey();
		text();
		grade();

		table2();
		//table3();0
		
		
	}
	
	



	private void table3() {
		try {
			   String da1="DARASA LA I";
			
			String sql="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI' from mark2 where class='"+da1+"'  ";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			table2.setModel(DbUtils.resultSetToTableModel(rs));
			table2.setFont(new Font("serif",Font.PLAIN,11));
			table2.setForeground(new Color(0,0,139));
			
			
			 String da2="DARASA LA II";
                 String sql2="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'S/JAMII',sc as 'SAYANSI',dini as 'DINI' from mark2 where class='"+da2+"'  ";
				ps=con.prepareStatement(sql2);
				rs=ps.executeQuery();
				table3.setModel(DbUtils.resultSetToTableModel(rs));
				table3.setFont(new Font("serif",Font.PLAIN,11));
				table3.setForeground(new Color(0,0,139));
				
				 String da3="DARASA LA III";
                 String sql3="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'S/JAMII',sc as 'SAYANSI',dini as 'DINI' from mark2 where class='"+da3+"'  ";
				ps=con.prepareStatement(sql3);
				rs=ps.executeQuery();
				table4.setModel(DbUtils.resultSetToTableModel(rs));
				table4.setFont(new Font("serif",Font.PLAIN,11));
				table4.setForeground(new Color(0,0,139));

				
				String da4="DARASA LA IV";
                String sql4="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'S/JAMII',sc as 'SAYANSI',dini as 'DINI' from mark2 where class='"+da4+"'  ";
				ps=con.prepareStatement(sql4);
				rs=ps.executeQuery();
				table5.setModel(DbUtils.resultSetToTableModel(rs));
				table5.setFont(new Font("serif",Font.PLAIN,11));
				table5.setForeground(new Color(0,0,139));
				
			    	String da5="DARASA LA V";
	    	     	String sql6="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'GEOGRAPHY',sc as 'SAYANSI',dini as 'DINI',cv as 'URAIA',his as 'HISTORIA',it as 'ICT' from mark2 where class='"+da5+"'  ";
					ps=con.prepareStatement(sql6);
					rs=ps.executeQuery();
					table6.setModel(DbUtils.resultSetToTableModel(rs));
					table6.setFont(new Font("serif",Font.PLAIN,11));
					table6.setForeground(new Color(0,0,139));
					
					String da6="DARASA LA VI";
	    	     	String sql7="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'GEOGRAPHY',sc as 'SAYANSI',dini as 'DINI',cv as 'URAIA',his as 'HISTORIA',it as 'ICT' from mark2 where class='"+da6+"'  ";
					ps=con.prepareStatement(sql7);
					rs=ps.executeQuery();
					table7.setModel(DbUtils.resultSetToTableModel(rs));
					table7.setFont(new Font("serif",Font.PLAIN,11));
					table7.setForeground(new Color(0,0,139));
					
					


			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		
		
		
		
		
		
	}

	private void grade() {
		try {
			String sql="select * from grade where rowid ='"+1+"'  ";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			//JOptionPane.showMessageDialog(null, rs.getDouble("grade1"));\
		    grad1=rs.getString("grade1");grad2=rs.getString("grade2");grad3= rs.getString("grade3");grad4= rs.getString("grade4");grad5=rs.getString("grade5");
		    grad6=rs.getString("grade6");grad7=rs.getString("grade7");grad8=rs.getString("grade8");grad9=rs.getString("grade9");grad10=rs.getString("grade10");
		    grad11=rs.getString("grade11");grad12=rs.getString("grade12");
		    
			text1.setText( grad1);text2.setText( grad2);text3.setText( grad3);text4.setText(grad4);text5.setText(grad5 );text6.setText( grad6);text7.setText(grad7 );
			text8.setText(grad8 );text9.setText(grad9 );text10.setText( grad10);text11.setText( grad11);text12.setText( grad12);
			
			grd1=Double.parseDouble(grad1);grd2=Double.parseDouble(grad2);grd3=Double.parseDouble(grad3);grd4=Double.parseDouble(grad4);grd5=Double.parseDouble(grad5);
			grd6=Double.parseDouble(grad6);grd7=Double.parseDouble(grad7);grd8=Double.parseDouble(grad8);grd9=Double.parseDouble(grad9);grd10=Double.parseDouble(grad10);
			grd11=Double.parseDouble(grad11);grd12=Double.parseDouble(grad12);
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getStackTrace());
		}
		finally{
	             try{
	                 rs.close();
	                 ps.close();
	             }catch(Exception ex){
	                 ex.getMessage();
	             }}
		
	}

	private void text() {
		try {
			
			String ptext="select * from text  where rowid='"+1+"'  ";
			 ps=con.prepareStatement(ptext);
			 ResultSet pt=ps.executeQuery();
			 
			// dd=pt.getString("ptext");
			 
			 area1.setText(pt.getString("ptext"));
			 
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}finally{
            try{
                rs.close();
                ps.close();
            }catch(Exception ex){
                ex.getMessage();
            }}
	
	}

	private void validatey() {
		text1.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
		    }}});text2.addKeyListener(new KeyAdapter()
			{
			      public void keyTyped(KeyEvent ke)
			{
			    	  char c = ke.getKeyChar();
		                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
		                    getToolkit().beep();
		                    ke.consume();
		                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
			    }}});text3.addKeyListener(new KeyAdapter()
				{
				      public void keyTyped(KeyEvent ke)
				{
				    	  char c = ke.getKeyChar();
			                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
			                    getToolkit().beep();
			                    ke.consume();
			                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
				    }}});text4.addKeyListener(new KeyAdapter()
					{
					      public void keyTyped(KeyEvent ke)
					{
					    	  char c = ke.getKeyChar();
				                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
				                    getToolkit().beep();
				                    ke.consume();
				                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
					    }}});text5.addKeyListener(new KeyAdapter()
						{
						      public void keyTyped(KeyEvent ke)
						{
						    	  char c = ke.getKeyChar();
					                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
					                    getToolkit().beep();
					                    ke.consume();
					                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
						    }}});text6.addKeyListener(new KeyAdapter()
							{
							      public void keyTyped(KeyEvent ke)
							{
							    	  char c = ke.getKeyChar();
						                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
						                    getToolkit().beep();
						                    ke.consume();
						                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
							    }}});text7.addKeyListener(new KeyAdapter()
								{
								      public void keyTyped(KeyEvent ke)
								{
								    	  char c = ke.getKeyChar();
							                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
							                    getToolkit().beep();
							                    ke.consume();
							                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
								    }}});text8.addKeyListener(new KeyAdapter()
									{
									      public void keyTyped(KeyEvent ke)
									{
									    	  char c = ke.getKeyChar();
								                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
								                    getToolkit().beep();
								                    ke.consume();
								                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
									    }}});text9.addKeyListener(new KeyAdapter()
										{
										      public void keyTyped(KeyEvent ke)
										{
										    	  char c = ke.getKeyChar();
									                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
									                    getToolkit().beep();
									                    ke.consume();
									                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
										    }}});text10.addKeyListener(new KeyAdapter()
											{
											      public void keyTyped(KeyEvent ke)
											{
											    	  char c = ke.getKeyChar();
										                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
										                    getToolkit().beep();
										                    ke.consume();
										                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
											    }}});
										    text11.addKeyListener(new KeyAdapter()
											{
											      public void keyTyped(KeyEvent ke)
											{
											    	  char c = ke.getKeyChar();
										                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
										                    getToolkit().beep();
										                    ke.consume();
										                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
											    }}});
										    text12.addKeyListener(new KeyAdapter()
											{
											      public void keyTyped(KeyEvent ke)
											{
											    	  char c = ke.getKeyChar();
										                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
										                    getToolkit().beep();
										                    ke.consume();
										                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
											    }}});
		
		t20.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});	t21.addKeyListener(new KeyAdapter()
			{
			      public void keyTyped(KeyEvent ke)
			{
			    	  char c = ke.getKeyChar();
		                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
		                    getToolkit().beep();
		                    ke.consume();
		                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    }}});	t22.addKeyListener(new KeyAdapter()
				{
				      public void keyTyped(KeyEvent ke)
				{
				    	  char c = ke.getKeyChar();
			                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
			                    getToolkit().beep();
			                    ke.consume();
			                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
				    }}});	t23.addKeyListener(new KeyAdapter()
					{
					      public void keyTyped(KeyEvent ke)
					{
					    	  char c = ke.getKeyChar();
				                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
				                    getToolkit().beep();
				                    ke.consume();
				                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
					    }}});	t24.addKeyListener(new KeyAdapter()
						{
						      public void keyTyped(KeyEvent ke)
						{
						    	  char c = ke.getKeyChar();
					                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
					                    getToolkit().beep();
					                    ke.consume();
					                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
						    }}});	t25.addKeyListener(new KeyAdapter()
							{
							      public void keyTyped(KeyEvent ke)
							{
							    	  char c = ke.getKeyChar();
						                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
						                    getToolkit().beep();
						                    ke.consume();
						                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
							    }}});	t26.addKeyListener(new KeyAdapter()
								{
								      public void keyTyped(KeyEvent ke)
								{
								    	  char c = ke.getKeyChar();
							                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
							                    getToolkit().beep();
							                    ke.consume();
							                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
								    }}});	t27.addKeyListener(new KeyAdapter()
									{
									      public void keyTyped(KeyEvent ke)
									{
									    	  char c = ke.getKeyChar();
								                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
								                    getToolkit().beep();
								                    ke.consume();
								                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
									    }}});	t28.addKeyListener(new KeyAdapter()
										{
										      public void keyTyped(KeyEvent ke)
										{
										    	  char c = ke.getKeyChar();
									                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
									                    getToolkit().beep();
									                    ke.consume();
									                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
										    }}});	tt29.addKeyListener(new KeyAdapter()
											{
											      public void keyTyped(KeyEvent ke)
											{
											    	  char c = ke.getKeyChar();
										                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
										                    getToolkit().beep();
										                    ke.consume();
										                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
											    }}});
		
	}

	private void field() {
		
		
		field.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent argo){
				
				try{	
				
				String mudi=field.getText();
				
				String s="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user2  where first LIKE ? or last LIKE ? or gender LIKE ? or class LIKE ? or sch LIKE ? or id LIKE ? or year LIKE ? or exam LIKE ? order by sch ";                                    
			try {
				
				ps=con.prepareStatement(s);
				ps.setString(1, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(2, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(3, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(4, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(5, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(6, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(7, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(8, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				
				rs=ps.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				table.setFont(new Font("Times New Roman",Font.PLAIN,11));
				table.setForeground(new Color(0,0,139));
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}  finally{
	  	             try{
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
				}catch(Exception ess){
					JOptionPane.showMessageDialog(null, ess.getMessage());
				}
			}
			
		});
		
		
	}

	private void area() {                
		          try {
		        	  String id=t0.getText();
		        	  String p="";
		        	  String darasa=t4.getSelectedItem().toString();
		      
		      		String sql1="select * from mark2 where id='"+id+"' ";
		          	ps=con.prepareStatement(sql1);
		          	rs=ps.executeQuery();
		          	
		            String sq="select * from mark2  where id='"+id+"' ";
				 	ps=con.prepareStatement(sq);
				 	ResultSet rr=ps.executeQuery();
				 	
		          	
		          	 if(rr.getString("avg").matches("Inc")) {
			    			p="Inc";
			    		}else {
			    			double mark=Double.parseDouble(rr.getString("avg"));
				    		
				    		if(mark>=grd1 && mark<=grd2) {
				    			p="A";
				    		}else if(mark>=grd3 && mark<grd4) {
				    			p="B+";
				    		}else if(mark>=grd5 && mark<grd6) {
				    			p="B";
				    		}
				    		else if(mark>=grd7 && mark<grd8) {
				    			p="C";
				    		}else if(mark>=grd9&& mark<grd10) {
				    			p="D";
			    		}else if(mark>=grd11&& mark<grd12) {
			    			p="F";
		    		}
			    		
			    		}
		          	
		          	 
		          	 
		          	 
		          	String cv=rs.getString("cv");
		          	String gcv=rs.getString("gcv");
		          	String geo=rs.getString("geo");
		          	String ggeo=rs.getString("ggeo");
		          	String dini=rs.getString("dini");
		          	String gdini=rs.getString("gdini");
		          	String kiswa=rs.getString("kisw");
		          	String gkiswa=rs.getString("gkisw");
		          	String engl=rs.getString("eng");
		          	String gengl=rs.getString("geng");
		          	String sc=rs.getString("sc");
		          	String gsc=rs.getString("gsc");
		          	String his=rs.getString("his");
		          	String ghis=rs.getString("ghis");
		          	String math=rs.getString("math");
		          	String gmath=rs.getString("gmath");
		          	String it=rs.getString("it");
		          	String git=rs.getString("git");
		          	String ara=rs.getString("ara");
		          	String gara=rs.getString("gara");
		          	String avg=rs.getString("avg");
		          	String sm=rs.getString("sum");
		        
		            
		          	 if(darasa.matches("DARASA LA V")  ||  darasa.matches("DARASA LA VI") ) {
		          		 
		          		if(rs.getString("avg").matches("Inc")) {

			            	 area.setText("\nCIVICS:      "+cv+"     "+gcv+"      GEOGRAPHY:  "+geo+"     "+ggeo+"\nDINI:           "+dini+"     "+gdini+"      KISWAHILI:      "+kiswa+"     "+gkiswa+"\nENGLISH:  "+engl+"     "+gengl+"      ICT:                  "+"  "+it+"     "+git+"\nMATH:       "+math+"     "+gmath+"      SCIENCE:          "+sc+"     "+gsc+"\nHISTORY: "+his+"     "+ghis+"      ARABIC:            "+ara+"     "+gara+"\n\nSUM:  "+sm+"     AVER:  "+avg+"      GRADE:  " +p );
				           	     
			          		
				           	   
		            	}else {
		            	 String avg1=String.format("%,.2f",Double.parseDouble(avg));
		           	    
		            	 area.setText("\nCIVICS:      "+cv+"     "+gcv+"     GEOGRAPHY:  "+geo+"     "+ggeo+"\nDINI:           "+dini+"     "+gdini+"     KISWAHILI:      "+kiswa+"     "+gkiswa+"\nENGLISH:  "+engl+"     "+gengl+"     ICT:                  "+"  "+it+"     "+git+"\nMATH:       "+math+"     "+gmath+"     SCIENCE:          "+sc+"     "+gsc+"\nHISTORY: "+his+"     "+ghis+"     ARABIC:            "+ara+"     "+gara+"\n\nSUM:  "+sm+"     AVER:  "+avg1+"      GRADE:  " +p );
		           	     
		            	}
		          	 }
		          
		          	 
		          	if(darasa.matches("DARASA LA IV")  ||  darasa.matches("DARASA LA II")  ||  darasa.matches("DARASA LA III") ) {
		          		 
		          		if(rs.getString("avg").matches("Inc")) {

			            	 area.setText("\nARABIC:    "+ara+"     "+gara+"      S / JAMII:          "+geo+"     "+ggeo+"\nDINI:           "+dini+"     "+gdini+"      KISWAHILI:      "+kiswa+"     "+gkiswa+"\nENGLISH:  "+engl+"     "+gengl+"      SCIENCE:          "+sc+"     "+gsc+"\nMATH:       "+math+"     "+gmath+"\n\nSUM:  "+sm+"     AVER:  "+avg+"      GRADE:  " +p );
				           	     
			          		
				           	   
		            	}else {
		            	 String avg1=String.format("%,.2f",Double.parseDouble(avg));
		           	    
		            	 area.setText("\nARABIC:    "+ara+"     "+gara+"      S / JAMII:          "+geo+"     "+ggeo+"\nDINI:           "+dini+"     "+gdini+"      KISWAHILI:      "+kiswa+"     "+gkiswa+"\nENGLISH:  "+engl+"     "+gengl+"      SCIENCE:          "+sc+"     "+gsc+"\nMATH:       "+math+"     "+gmath+"\n\nSUM:  "+sm+"     AVER:  "+avg1+"      GRADE:  " +p );
		           	     
		            	}
		          	 }
		          
		          	
		          	if(darasa.matches("DARASA LA I") ) {
		          		 
		          		if(rs.getString("avg").matches("Inc")) {


			            	 area.setText("\nARABIC:            "+ara+"     "+gara+"\nKISWAHILI:      "+kiswa+"     "+gkiswa+"\nENGLISH:          "+engl+"     "+gengl+"\nMATH:               "+math+"     "+gmath+"\n\nSUM:  "+sm+"     AVER:  "+avg+"      GRADE:  " +p );
			           	     
				           	   
		            	}else {
		            	 String avg1=String.format("%,.2f",Double.parseDouble(avg));
		           	    
		            	 area.setText("\nARABIC:            "+ara+"     "+gara+"\nKISWAHILI:      "+kiswa+"     "+gkiswa+"\nENGLISH:          "+engl+"     "+gengl+"\nMATH:               "+math+"     "+gmath+"\n\nSUM:  "+sm+"     AVER:  "+avg1+"      GRADE:  " +p );
		           	     
		            	}
		          	 }
		          
		          	 
		            	
		          
		          }catch(Exception ex) {
		        	  JOptionPane.showMessageDialog(null, ex.getMessage());
		          }finally{
		  	             try{
		  	                 rs.close();
		  	                 ps.close();
		  	             }catch(Exception ex){
		  	                 ex.getMessage();
		  	             }}
		
	}

	private void update() {
		grade();
		String darasa=t4.getSelectedItem().toString();
		
		try {
			
			String id=t0.getText();
			String fn=t1.getText().toUpperCase();
			String ln=t2.getText().toUpperCase();
			String gn=t3.getSelectedItem().toString();
			String cl=t4.getSelectedItem().toString();
			String exam=t6.getSelectedItem().toString();
			String year=box5.getSelectedItem().toString();
			String term=t7.getSelectedItem().toString();
			
			
		
			String sql="select count(id) from mark2 where id='"+t0.getText()+"' ";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			int namba=Integer.parseInt(rs.getString("count(id)"));
			if(namba==1) {
				try {
					
                   if(darasa.matches("DARASA LA I") ) {
                	 	
                	   	
						String g0="",m0;
						String g1="",m1;
						String g2="",m2;
						String g3="",m3;
						
						Double average=0.0;
						String avg="";
						String sam="";
						Double kisw=0.0,eng=0.0,math=0.0,ara=0.0;
						String cme="",cmk="",cma="",cmm="";
					
						
						String sql11="select * from mark2 where id='"+id+"' ";
		            	ps=con.prepareStatement(sql11);
		            	rs=ps.executeQuery();
						
		                t37.setText(rs.getString("eng"));
		                t38.setText(rs.getString("kisw"));
		                t39.setText(rs.getString("ara"));
		                t40.setText(rs.getString("math"));
		             
		               
						int result = JOptionPane.showConfirmDialog(null, panel6, "Insert Marks",
					            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
						if(result==JOptionPane.OK_OPTION ) {
							
							
							if(t37.getText().isEmpty() ||t37.getText().matches("-")) {
								g0="";m0="";cme="";
						}else {
								m0=t37.getText();
							
						
						if(!t37.getText().isEmpty() && !t37.getText().matches("-")) {
							 eng=Double.parseDouble(t37.getText());
						
						if(eng>=grd1 && eng<=grd2){
					       g0="A";cme="VIZURI SANA";
					      }else if(eng>=grd3 && eng<grd4){
					    	  g0="B+";cme="VIZURI";
					      }
					      else if(eng>=grd5 && eng<grd6){
					    	  g0="B";cme="VIZURI";
					      }
					      else if(eng>=grd7 && eng<grd8){
					    	  g0="C";cme="WASTANI";
						      }
						      else if (eng>=grd9 && eng<grd10)  {
						    	  g0= "D";cme="DHAIFU";
						      }
						      else if (eng>=grd11 && eng<grd12)  {
						    	  g0= "F";cme="MBAYA SANA";
						      }
						      
						}
						}
							
							if(t38.getText().isEmpty() ||t38.getText().matches("-")) {
								g1="";m1="";cmk="";
						}else {
								m1=t38.getText();
							
						
						if(!t38.getText().isEmpty() && !t38.getText().matches("-")) {
				           kisw=Double.parseDouble(t38.getText());
						
						if(kisw>=grd1 && kisw<=grd2){
					       g1="A";cmk="VIZURI SANA";
					      }else if(kisw>=grd3 && kisw<grd4){
					    	  g1="B+";cmk="VIZURI";
					      }
					      else if(kisw>=grd5 && kisw<grd6){
					    	  g1="B";cmk="VIZURI";
					      }
					      else if(kisw>=grd7 && kisw<grd8){
					    	  g1="C";cmk="WASTANI";
						      }
						      else if(kisw>=grd9 && kisw<grd10) {
						    	  g1= "D";cmk="DHAIFU";
						      }
						      else if(kisw>=grd11 && kisw<grd12) {
						    	  g1= "F";cmk="MBAYA SANA";
						      }
						      
						}
						}
							
							
							
							if(t39.getText().isEmpty() ||t39.getText().matches("-")) {
								g2="";m2="";cma="";
						}else {
								m2=t39.getText();
							
						
						if(!t39.getText().isEmpty() && !t39.getText().matches("-")) {
							ara=Double.parseDouble(t39.getText());
						
						if(ara>=grd1 && ara<=grd2){
					       g2="A";cma="VIZURI SANA";
					      }else if(ara>=grd3 && ara<grd4){
					    	  g2="B+";cma="VIZURI";
					      }
					      else if(ara>=grd5 && ara<grd6){
					    	  g2="B";cma="VIZURI";
					      }
					      else if(ara>=grd7 && ara<grd8){
					    	  g2="C";cma="WASTANI";
						      }
						      else  if(ara>=grd9 && ara<grd10){
						    	  g2= "D";cma="DHAIFU";
						      }else  if(ara>=grd11 && ara<grd12){
						    	  g2= "F";cma="MBAYA SANA";
						      }
						      
						}
						}
							
							
						
							
							if(t40.getText().isEmpty() ||t40.getText().matches("-")) {
								g3="";m3="";cmm="";
						}else {
								m3=t40.getText();
							
						
						if(!t40.getText().isEmpty() && !t40.getText().matches("-")) {
						 math=Double.parseDouble(t40.getText());
						
						if(math>=grd1 && math<=grd2){
					       g3="A";cmm="VIZURI SANA";
					      }else if(math>=grd3 && math<grd4){
					    	  g3="B+";cmm="VIZURI";
					      }
					      else if(math>=grd5 && math<grd6){
					    	  g3="B";cmm="VIZURI";
					      }
					      else if(math>=grd7 && math<grd8){
					    	  g3="C";cmm="WASTANI";
						      }
						      else  if(math>=grd9 && math<grd10){
						    	  g3= "D";cmm="DHAIFU";
						      } else  if(math>=grd11 && math<grd12){
						    	  g3= "F";cmm="MBAYA SANA";
						      }
						      
						}
						}
							
														
							int n0=0, n1=0,n2=0,n3=0,toto=0;
							
							double sum=0.0;


							if(t37.getText().matches("-") ||t37.getText().isEmpty()) {
							 
							}else  {

							n0=1;
							eng=Double.parseDouble(t37.getText());
							}

							if(t38.getText().matches("-") ||t38.getText().isEmpty()) {
							 
							}else  {

							n1=1;
							kisw=Double.parseDouble(t38.getText());
							}
							
							if(t39.getText().matches("-") ||t39.getText().isEmpty()) {
							 
							}else  {

							n2=1;
							ara=Double.parseDouble(t39.getText());
							}

							if(t40.getText().matches("-") ||t40.getText().isEmpty()) {
							 
							}else  {

							n3=1;
							math=Double.parseDouble(t40.getText());
							}
							
							
							toto=n0+n1+n2+n3;
							sum=kisw+eng+ara+math;
		                   
							if(toto>=4) {
								 Double ave=sum/toto;
								 avg=String.format("%,.4f", ave);
								 average=Double.parseDouble(avg);
								 sam=String.format("%,.1f", sum);
								
								}else {
									
								avg="Inc";
								sam="Inc";
									
								}

							if(  ((kisw>=0 &&kisw<=100) ||t38.getText().isEmpty()) &&  ((eng>=0 &&eng<=100) ||t37.getText().isEmpty()) &&  ((math>=0 &&math<=100) ||t40.getText().isEmpty()) && ((ara>=0 &&ara<=100) ||t39.getText().isEmpty())   ) {
								
							    String sq="update mark2 set eng='"+m0+"',geng='"+g0+"',kisw='"+m1+"',gkisw='"+g1+"',ara='"+m2+"',gara='"+g2+"',math='"+m3+"',gmath='"+g3+"',avg='"+avg+"',sum='"+sam+"',cme='"+cme+"',cmk='"+cmk+"',cma='"+cma+"',cmm='"+cmm+"'  where id='"+id+"' ";
								ps=con.prepareStatement(sq);
								ps.execute();
								
								
								JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
								t37.setText("");t38.setText("");t39.setText("");t40.setText("");
						    	area();
						    	
						

							}else {
								
								 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
							}
							
							
							
						}
						
						
						
					
				
							
							
							
						
					}
                   
                   if(darasa.matches("DARASA LA IV") ||darasa.matches("DARASA LA II") || darasa.matches("DARASA LA III")) {
                	  
                	   		
							String g0="",m0;
							String g1="",m1;
							String g2="",m2;
							String g3="",m3;
							String g4="",m4;
							String g5="",m5;
							String g6="",m6;
							
							Double average=0.0;
							String avg="";
							String sam="";
							Double geo=0.0,dini=0.0,kisw=0.0,eng=0.0,sc=0.0,math=0.0,ara=0.0;
							String cme="",cmk="",cmd="",cma="",cmg="",cms="",cmm="";
						
							
							String sql11="select * from mark2 where id='"+id+"' ";
			            	ps=con.prepareStatement(sql11);
			            	rs=ps.executeQuery();
							
			                t30.setText(rs.getString("eng"));
			                t31.setText(rs.getString("kisw"));
			                t32.setText(rs.getString("dini"));
			                t33.setText(rs.getString("ara"));
			                t34.setText(rs.getString("geo"));
			                t35.setText(rs.getString("sc"));
			                t36.setText(rs.getString("math"));
			             
			               
							int result = JOptionPane.showConfirmDialog(null, panel5, "Insert Marks",
						            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
							if(result==JOptionPane.OK_OPTION ) {
								
								
								if(t30.getText().isEmpty() ||t30.getText().matches("-")) {
									g0="";m0="";cme="";
							}else {
									m0=t30.getText();
								
							
							if(!t30.getText().isEmpty() && !t30.getText().matches("-")) {
								 eng=Double.parseDouble(t30.getText());
							
							if(eng>=grd1 && eng<=grd2){
						       g0="A";cme="VIZURI SANA";
						      }else if(eng>=grd3 && eng<grd4){
						    	  g0="B+";cme="VIZURI";
						      }
						      else if(eng>=grd5 && eng<grd6){
						    	  g0="B";cme="VIZURI";
						      }
						      else if(eng>=grd7 && eng<grd8){
						    	  g0="C";cme="WASTANI";
							      }
							      else if (eng>=grd9 && eng<grd10)  {
							    	  g0= "D";cme="DHAIFU";
							      } else if (eng>=grd11 && eng<grd12)  {
							    	  g0= "F";cme="MBAYA SANA";
							      }
							      
							}
							}
								
								if(t31.getText().isEmpty() ||t31.getText().matches("-")) {
									g1="";m1="";cmk="";
							}else {
									m1=t31.getText();
								
							
							if(!t31.getText().isEmpty() && !t31.getText().matches("-")) {
					           kisw=Double.parseDouble(t31.getText());
							
							if(kisw>=grd1 && kisw<=grd2){
						       g1="A";cmk="VIZURI SANA";
						      }else if(kisw>=grd3 && kisw<grd4){
						    	  g1="B+";cmk="VIZURI";
						      }
						      else if(kisw>=grd5 && kisw<grd6){
						    	  g1="B";cmk="VIZURI";
						      }
						      else if(kisw>=grd7 && kisw<grd8){
						    	  g1="C";cmk="WASTANI";
							      }
							      else if(kisw>=grd9 && kisw<grd10) {
							    	  g1= "D";cmk="DHAIFU";
							      } else if(kisw>=grd11 && kisw<grd12) {
							    	  g1= "F";cmk="MBAYA SANA";
							      }
							      
							}
							}
								
								if(t32.getText().isEmpty() ||t32.getText().matches("-")) {
									g2="";m2="";cmd="";
							}else {
									m2=t32.getText();
								
							
							if(!t32.getText().isEmpty() && !t32.getText().matches("-")) {
								 dini=Double.parseDouble(t32.getText());
							
							if(dini>=grd1 && dini<=grd2){
						       g2="A";cmd="VIZURI SANA";
						      }else if(dini>=grd3 && dini<grd4){
						    	  g2="B+";cmd="VIZURI";
						      }
						      else if(dini>=grd5 && dini<grd6){
						    	  g2="B";cmd="VIZURI";
						      }
						      else if(dini>=grd7 && dini<grd8){
						    	  g2="C";cmd="WASTANI";
							      }
							      else if(dini>=grd9 && dini<grd10) {
							    	  g2= "D";cmd="DHAIFU";
							      }
							      else if(dini>=grd11 && dini<grd12) {
							    	  g2= "F";cmd="MBAYA SANA";
							      }
							      
							}
							}
								
								if(t33.getText().isEmpty() ||t33.getText().matches("-")) {
									g3="";m3="";cma="";
							}else {
									m3=t33.getText();
								
							
							if(!t33.getText().isEmpty() && !t33.getText().matches("-")) {
								ara=Double.parseDouble(t33.getText());
							
							if(ara>=grd1 && ara<=grd2){
						       g3="A";cma="VIZURI SANA";
						      }else if(ara>=grd3 && ara<grd4){
						    	  g3="B+";cma="VIZURI";
						      }
						      else if(ara>=grd5 && ara<grd6){
						    	  g3="B";cma="VIZURI";
						      }
						      else if(ara>=grd7 && ara<grd8){
						    	  g3="C";cma="WASTANI";
							      }
							      else  if(ara>=grd9 && ara<grd10){
							    	  g3= "D";cma="DHAIFU";
							      } else  if(ara>=grd11 && ara<grd12){
							    	  g3= "F";cma="MBAYA SANA";
							      }
							      
							}
							}
								
								if(t34.getText().isEmpty() ||t34.getText().matches("-")) {
									g4="";m4="";cmg="";
							}else {
									m4=t34.getText();
								
							
							if(!t34.getText().isEmpty() && !t34.getText().matches("-")) {
					          geo=Double.parseDouble(t34.getText());
							
							if(geo>=grd1 && geo<=grd2){
						       g4="A";cmg="VIZURI SANA";
						      }else if(geo>=grd3 && geo<grd4){
						    	  g4="B+";cmg="VIZURI";
						      }
						      else if(geo>=grd5 && geo<grd6){
						    	  g4="B";cmg="VIZURI";
						      }
						      else if(geo>=grd7 && geo<grd8){
						    	  g4="C";cmg="WASTANI";
							      }
							      else if(geo>=grd9 && geo<grd10) {
							    	  g4= "D";cmg="DHAIFU";
							      }
							      else if(geo>=grd11 && geo<grd12) {
							    	  g4= "F";cmg="MBAYA SANA";
							      }
							      
							}
							}
								
							
								if(t35.getText().isEmpty() ||t35.getText().matches("-")) {
									g5="";m5="";cms="";
							}else {
									m5=t35.getText();
								
							
							if(!t35.getText().isEmpty() && !t35.getText().matches("-")) {
						      sc=Double.parseDouble(t35.getText());
							
							if(sc>=grd1 && sc<=grd2){
						       g5="A";cms="VIZURI SANA";
						      }else if(sc>=grd3 && sc<grd4){
						    	  g5="B+";cms="VIZURI";
						      }
						      else if(sc>=grd5 && sc<grd6){
						    	  g5="B";cms="VIZURI";
						      }
						      else if(sc>=grd7 && sc<grd8){
						    	  g5="C";cms="WASTANI";
							      }
							      else if(sc>=grd9 && sc<grd10) {
							    	  g5= "D";cms="DHAIFU";
							      } else if(sc>=grd11 && sc<grd12) {
							    	  g5= "F";cms="MBAYA SANA";
							      }
							      
							}
							}
								
								
								if(t36.getText().isEmpty() ||t36.getText().matches("-")) {
									g6="";m6="";cmm="";
							}else {
									m6=t36.getText();
								
							
							if(!t36.getText().isEmpty() && !t36.getText().matches("-")) {
							 math=Double.parseDouble(t36.getText());
							
							if(math>=grd1 && math<=grd2){
						       g6="A";cmm="VIZURI SANA";
						      }else if(math>=grd3 && math<grd4){
						    	  g6="B+";cmm="VIZURI";
						      }
						      else if(math>=grd5 && math<grd6){
						    	  g6="B";cmm="VIZURI";
						      }
						      else if(math>=grd7 && math<grd8){
						    	  g6="C";cmm="WASTANI";
							      }
							      else  if(math>=grd9 && math<grd10){
							    	  g6= "D";cmm="DHAIFU";
							      }
							      else  if(math>=grd11 && math<grd12){
							    	  g6= "F";cmm="MBAYA SANA";
							      }
							}
							}
								
															
								int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,toto=0;
								
								double sum=0.0;


								if(t30.getText().matches("-") ||t30.getText().isEmpty()) {
								 
								}else  {

								n0=1;
								eng=Double.parseDouble(t30.getText());
								}

								if(t31.getText().matches("-") ||t31.getText().isEmpty()) {
								 
								}else  {

								n1=1;
								kisw=Double.parseDouble(t31.getText());
								}
								if(t32.getText().matches("-") ||t32.getText().isEmpty()) {
								 
								}else  {

								n2=1;
								dini=Double.parseDouble(t32.getText());
								}

								if(t33.getText().matches("-") ||t33.getText().isEmpty()) {
								 
								}else  {

								n3=1;
								ara=Double.parseDouble(t33.getText());
								}

								if(t34.getText().matches("-") ||t34.getText().isEmpty()) {
								 
								}else  {

								n4=1;
								geo=Double.parseDouble(t34.getText());
								}

								if(t35.getText().matches("-") ||t35.getText().isEmpty()) {
								 
								}else  {

								n5=1;
								sc=Double.parseDouble(t35.getText());
								}

								if(t36.getText().matches("-") ||t36.getText().isEmpty()) {
								 
								}else  {

								n6=1;
								math=Double.parseDouble(t36.getText());
								}
								
								
								toto=n0+n1+n2+n3+n4+n5+n6;
								sum=geo+dini+kisw+eng+ara+sc+math;
			                   
								if(toto>=7) {
									Double ave=sum/toto;
									 avg=String.format("%,.4f", ave);
									 average=Double.parseDouble(avg);
									 sam=String.format("%,.1f", sum);
									
									}else {
										
									avg="Inc";
									sam="Inc";
										
									}

								if( ((geo>=0 &&geo<=100) ||t34.getText().isEmpty()) && ((dini>=0 &&dini<=100) ||t32.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||t31.getText().isEmpty()) &&  ((eng>=0 &&eng<=100) ||t30.getText().isEmpty()) && ((sc>=0 &&sc<=100) ||t35.getText().isEmpty()) &&  ((math>=0 &&math<=100) ||t36.getText().isEmpty()) && ((ara>=0 &&ara<=100) ||t33.getText().isEmpty())   ) {
									


								    String sq="update mark2 set eng='"+m0+"',geng='"+g0+"',kisw='"+m1+"',gkisw='"+g1+"',dini='"+m2+"',gdini='"+g2+"',ara='"+m3+"',gara='"+g3+"',geo='"+m4+"',ggeo='"+g4+"',sc='"+m5+"',gsc='"+g5+"',math='"+m6+"',gmath='"+g6+"',avg='"+avg+"',sum='"+sam+"',cme='"+cme+"',cmk='"+cmk+"',cmd='"+cmd+"',cma='"+cma+"',cmg='"+cmg+"',cms='"+cms+"',cmm='"+cmm+"'  where id='"+id+"' ";
									ps=con.prepareStatement(sq);
									ps.execute();
									
									JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
									t30.setText("");t31.setText("");t32.setText("");t33.setText("");t34.setText("");t35.setText("");t36.setText("");
							    	area();
							    	
							

								}else {
									
									 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
								}
								
								
								
							}
							
							
							
						
					}
					else if(darasa.matches("DARASA LA V") ||darasa.matches("DARASA LA VI")) {
							
						String g0="",m0;
						String g1="",m1;
						String g2="",m2;
						String g3="",m3;
						String g4="",m4;
						String g5="",m5;
						String g6="",m6;
						String g7="",m7;
						String g8="",m8;
						String g9="",m9;
						String avg="";
						Double average=0.0;
						String sam="";
						Double cv=0.0,geo=0.0,dini=0.0,kisw=0.0,eng=0.0,sc=0.0,his=0.0,math=0.0,ara=0.0,it=0.0;
						String cme="",cmk="",cmd="",cma="",cmg="",cmc="",cmh="",cms="",cmm="",cmi="";
					
						
						String sql11="select * from mark2 where id='"+id+"' ";
		            	ps=con.prepareStatement(sql11);
		            	rs=ps.executeQuery();
						
		                t20.setText(rs.getString("eng"));
		                t21.setText(rs.getString("kisw"));
		                t22.setText(rs.getString("dini"));
		                t23.setText(rs.getString("ara"));
		                t24.setText(rs.getString("geo"));
		                t25.setText(rs.getString("cv"));
		                t26.setText(rs.getString("his"));
		                t27.setText(rs.getString("sc"));
		                t28.setText(rs.getString("math"));
		                tt29.setText(rs.getString("it"));
		               
		                
		                
						int result = JOptionPane.showConfirmDialog(null, pana1, "Insert Marks",
					            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
						if(result==JOptionPane.OK_OPTION ) {
							
							
							if(t20.getText().isEmpty() ||t20.getText().matches("-")) {
								g0="";m0="";cme="";
						}else {
								m0=t20.getText();
							
						
						if(!t20.getText().isEmpty() && !t20.getText().matches("-")) {
							 eng=Double.parseDouble(t20.getText());
						
						if(eng>=grd1 && eng<=grd2){
					       g0="A";cme="VIZURI SANA";
					      }else if(eng>=grd3 && eng<grd4){
					    	  g0="B+";cme="VIZURI";
					      }
					      else if(eng>=grd5 && eng<grd6){
					    	  g0="B";cme="VIZURI";
					      }
					      else if(eng>=grd7 && eng<grd8){
					    	  g0="C";cme="WASTANI";
						      }
						      else if (eng>=grd9 && eng<grd10)  {
						    	  g0= "D";cme="DHAIFU";
						      }else if (eng>=grd11 && eng<grd12)  {
						    	  g0= "F";cme="MBAYA SANA";
						      }
						      
						}
						}
							
							if(t21.getText().isEmpty() ||t21.getText().matches("-")) {
								g1="";m1="";cmk="";
						}else {
								m1=t21.getText();
							
						
						if(!t21.getText().isEmpty() && !t21.getText().matches("-")) {
				           kisw=Double.parseDouble(t21.getText());
						
						if(kisw>=grd1 && kisw<=grd2){
					       g1="A";cmk="VIZURI SANA";
					      }else if(kisw>=grd3 && kisw<grd4){
					    	  g1="B+";cmk="VIZURI";
					      }
					      else if(kisw>=grd5 && kisw<grd6){
					    	  g1="B";cmk="VIZURI";
					      }
					      else if(kisw>=grd7 && kisw<grd8){
					    	  g1="C";cmk="WASTANI";
						      }
						      else if(kisw>=grd9 && kisw<grd10) {
						    	  g1= "D";cmk="DHAIFU";
						      } else if(kisw>=grd11 && kisw<grd12) {
						    	  g1= "F";cmk="MBAYA SANA";
						      }
						      
						}
						}
							
							if(t22.getText().isEmpty() ||t22.getText().matches("-")) {
								g2="";m2="";cmd="";
						}else {
								m2=t22.getText();
							
						
						if(!t22.getText().isEmpty() && !t22.getText().matches("-")) {
							 dini=Double.parseDouble(t22.getText());
						
						if(dini>=grd1 && dini<=grd2){
					       g2="A";cmd="VIZURI SANA";
					      }else if(dini>=grd3 && dini<grd4){
					    	  g2="B+";cmd="VIZURI";
					      }
					      else if(dini>=grd5 && dini<grd6){
					    	  g2="B";cmd="VIZURI";
					      }
					      else if(dini>=grd7 && dini<grd8){
					    	  g2="C";cmd="WASTANI";
						      }
						      else if(dini>=grd9 && dini<grd10) {
						    	  g2= "D";cmd="DHAIFU";
						      }else if(dini>=grd11 && dini<grd12) {
						    	  g2= "F";cmd="MBAYA SANA";
						      }
						      
						}
						}
							
							if(t23.getText().isEmpty() ||t23.getText().matches("-")) {
								g3="";m3="";cma="";
						}else {
								m3=t23.getText();
							
						
						if(!t23.getText().isEmpty() && !t23.getText().matches("-")) {
							ara=Double.parseDouble(t23.getText());
						
						if(ara>=grd1 && ara<=grd2){
					       g3="A";cma="VIZURI SANA";
					      }else if(ara>=grd3 && ara<grd4){
					    	  g3="B+";cma="VIZURI";
					      }
					      else if(ara>=grd5 && ara<grd6){
					    	  g3="B";cma="VIZURI";
					      }
					      else if(ara>=grd7 && ara<grd8){
					    	  g3="C";cma="WASTANI";
						      }
						      else  if(ara>=grd9 && ara<grd10){
						    	  g3= "D";cma="DHAIFU";
						      }  else  if(ara>=grd11 && ara<grd12){
						    	  g3= "F";cma="MBAYA SANA";
						      }
						      
						}
						}
							
							if(t24.getText().isEmpty() ||t24.getText().matches("-")) {
								g4="";m4="";cmg="";
						}else {
								m4=t24.getText();
							
						
						if(!t24.getText().isEmpty() && !t24.getText().matches("-")) {
				          geo=Double.parseDouble(t24.getText());
						
						if(geo>=grd1 && geo<=grd2){
					       g4="A";cmg="VIZURI SANA";
					      }else if(geo>=grd3 && geo<grd4){
					    	  g4="B+";cmg="VIZURI";
					      }
					      else if(geo>=grd5 && geo<grd6){
					    	  g4="B";cmg="VIZURI";
					      }
					      else if(geo>=grd7 && geo<grd8){
					    	  g4="C";cmg="WASTANI";
						      }
						      else if(geo>=grd9 && geo<grd10) {
						    	  g4= "D";cmg="DHAIFU";
						      } else if(geo>=grd11 && geo<grd12) {
						    	  g4= "F";cmg="MBAYA SANA";
						      }
						      
						}
						}
							
							if(t25.getText().isEmpty() ||t25.getText().matches("-")) {
								g5="";m5="";cmc="";
						}else {
								m5=t25.getText();
							
						
						if(!t25.getText().isEmpty() && !t25.getText().matches("-")) {
							cv=Double.parseDouble(t25.getText());
						
						if(cv>=grd1 && cv<=grd2){
					       g5="A";cmc="VIZURI SANA";
					      }else if(cv>=grd3 && cv<grd4){
					    	  g5="B+";cmc="VIZURI";
					      }
					      else if(cv>=grd5 && cv<grd6){
					    	  g5="B";cmc="VIZURI";
					      }
					      else if(cv>=grd7 && cv<grd8){
					    	  g5="C";cmc="WASTANI";
						      }
						      else  if(cv>=grd9 && cv<grd10){
						    	  g5= "D";cmc="DHAIFU";
						      }
						      else  if(cv>=grd11 && cv<grd12){
						    	  g5= "F";cmc="MBAYA SANA";
						      }
						      
						}
						}
							
							if(t26.getText().isEmpty() ||t26.getText().matches("-")) {
								g6="";m6="";cmh="";
						}else {
								m6=t26.getText();
							
						
						if(!t26.getText().isEmpty() && !t26.getText().matches("-")) {
							 his=Double.parseDouble(t26.getText());
						
						if(his>=grd1 && his<=grd2){
					       g6="A";cmh="VIZURI SANA";
					      }else if(his>=grd3 && his<grd4){
					    	  g6="B+";cmh="VIZURI";
					      }
					      else if(his>=grd5 && his<grd6){
					    	  g6="B";cmh="VIZURI";
					      }
					      else if(his>=grd7 && his<grd8){
					    	  g6="C";cmh="WASTANI";
						      }
						      else  if(his>=grd9 && his<grd10){
						    	  g6= "D";cmh="DHAIFU";
						      }
						      else  if(his>=grd11 && his<grd12){
						    	  g6= "F";cmh="MBAYA SANA";
						      }
						      
						}
						}
							
							if(t27.getText().isEmpty() ||t27.getText().matches("-")) {
								g7="";m7="";cms="";
						}else {
								m7=t27.getText();
							
						
						if(!t27.getText().isEmpty() && !t27.getText().matches("-")) {
					      sc=Double.parseDouble(t27.getText());
						
						if(sc>=grd1 && sc<=grd2){
					       g7="A";cms="VIZURI SANA";
					      }else if(sc>=grd3 && sc<grd4){
					    	  g7="B+";cms="VIZURI";
					      }
					      else if(sc>=grd5 && sc<grd6){
					    	  g7="B";cms="VIZURI";
					      }
					      else if(sc>=grd7 && sc<grd8){
					    	  g7="C";cms="WASTANI";
						      }
						      else if(sc>=grd9 && sc<grd10) {
						    	  g7= "D";cms="DHAIFU";
						      }
						      else if(sc>=grd11 && sc<grd12) {
						    	  g7= "F";cms="MBAYA SANA";
						      }
						      
						}
						}
							
							
							if(t28.getText().isEmpty() ||t28.getText().matches("-")) {
								g8="";m8="";cmm="";
						}else {
								m8=t28.getText();
							
						
						if(!t28.getText().isEmpty() && !t28.getText().matches("-")) {
						 math=Double.parseDouble(t28.getText());
						
						if(math>=grd1 && math<=grd2){
					       g8="A";cmm="VIZURI SANA";
					      }else if(math>=grd3 && math<grd4){
					    	  g8="B+";cmm="VIZURI";
					      }
					      else if(math>=grd5 && math<grd6){
					    	  g8="B";cmm="VIZURI";
					      }
					      else if(math>=grd7 && math<grd8){
					    	  g8="C";cmm="WASTANI";
						      }
						      else  if(math>=grd9 && math<grd10){
						    	  g8= "D";cmm="DHAIFU";
						      }
						      else  if(math>=grd11 && math<grd12){
						    	  g8= "F";cmm="MBAYA SANA";
						      }
						      
						}
						}
							
							if(tt29.getText().isEmpty() ||tt29.getText().matches("-")) {
								g9="";m9="";cmi="";
						}else {
								m9=tt29.getText();
							
						
						if(!tt29.getText().isEmpty() && !tt29.getText().matches("-")) {
						 it=Double.parseDouble(tt29.getText());
						
						if(it>=grd1 && it<=grd2){
					       g9="A";cmi="VIZURI SANA";
					      }else if(it>=grd3 && it<grd4){
					    	  g9="B+";cmi="VIZURI";
					      }
					      else if(it>=grd5 && it<grd6){
					    	  g9="B";cmi="VIZURI";
					      }
					      else if(it>=grd7 && it<grd8){
					    	  g9="C";cmi="WASTANI";
						      }
						      else  if(it>=grd9 && it<grd10){
						    	  g9= "D";cmi="DHAIFU";
						      }
						      else  if(it>=grd11 && it<grd12){
						    	  g9= "F";cmi="MBAYA SANA";
						      }
						      
						}
						}
							
							
							
							
							int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,toto=0,n9=0;
							
							double sum=0.0;


							if(t20.getText().matches("-") ||t20.getText().isEmpty()) {
							 
							}else  {

							n0=1;
							eng=Double.parseDouble(t20.getText());
							}

							if(t21.getText().matches("-") ||t21.getText().isEmpty()) {
							 
							}else  {

							n1=1;
							kisw=Double.parseDouble(t21.getText());
							}
							if(t22.getText().matches("-") ||t22.getText().isEmpty()) {
							 
							}else  {

							n2=1;
							dini=Double.parseDouble(t22.getText());
							}

							if(t23.getText().matches("-") ||t23.getText().isEmpty()) {
							 
							}else  {

							n3=1;
							ara=Double.parseDouble(t23.getText());
							}

							if(t24.getText().matches("-") ||t24.getText().isEmpty()) {
							 
							}else  {

							n4=1;
							geo=Double.parseDouble(t24.getText());
							}

							if(t25.getText().matches("-") ||t25.getText().isEmpty()) {
							 
							}else  {

							n5=1;
							cv=Double.parseDouble(t25.getText());
							}
							if(t26.getText().matches("-") ||t26.getText().isEmpty()) {
							 
							}else  {

							n6=1;
							his=Double.parseDouble(t26.getText());
							}
							if(t27.getText().matches("-") ||t27.getText().isEmpty()) {
							 
							}else  {

							n7=1;
							sc=Double.parseDouble(t27.getText());
							}

							if(t28.getText().matches("-") ||t28.getText().isEmpty()) {
							 
							}else  {

							n8=1;
							math=Double.parseDouble(t28.getText());
							}
							if(tt29.getText().matches("-") ||tt29.getText().isEmpty()) {
							 
							}else  {

							n9=1;
							it=Double.parseDouble(tt29.getText());
							}
							
							toto=n0+n1+n2+n3+n4+n5+n6+n7+n8+n9;
							sum=cv+geo+dini+kisw+eng+it+ara+sc+math+his;
		                   
							if(toto>=10) {
								Double ave=sum/toto;
								 avg=String.format("%.4f", ave);
								 average=Double.parseDouble(avg);
								 sam=String.format("%.1f", sum);
								
								}else {
									
								avg="Inc";
								sam="Inc";
									
								}

							
							                                                                                                                                                                                                                                                                                                                                                             

								

							if(((cv>=0 &&cv<=100) ||t25.getText().isEmpty()) && ((geo>=0 &&geo<=100) ||t24.getText().isEmpty()) && ((dini>=0 &&dini<=100) ||t22.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||t21.getText().isEmpty()) &&  ((eng>=0 &&eng<=100) ||t20.getText().isEmpty()) && ((sc>=0 &&sc<=100) ||t27.getText().isEmpty()) && ((his>=0 &&his<=100) ||t26.getText().isEmpty()) &&  ((math>=0 &&math<=100) ||t28.getText().isEmpty()) && ((ara>=0 &&ara<=100) ||t23.getText().isEmpty()) && ((it>=0 &&it<=100) ||tt29.getText().isEmpty())  ) {
								


							    String sq="update mark2 set eng='"+m0+"',geng='"+g0+"',kisw='"+m1+"',gkisw='"+g1+"',dini='"+m2+"',gdini='"+g2+"',ara='"+m3+"',gara='"+g3+"',geo='"+m4+"',ggeo='"+g4+"',cv='"+m5+"',gcv='"+g5+"',his='"+m6+"',ghis='"+g6+"',sc='"+m7+"',gsc='"+g7+"',math='"+m8+"',gmath='"+g8+"',it='"+m9+"',git='"+g9+"',avg='"+avg+"',sum='"+sam+"',cme='"+cme+"',cmk='"+cmk+"',cmd='"+cmd+"',cma='"+cma+"',cmg='"+cmg+"',cmc='"+cmc+"',cmh='"+cmh+"',cms='"+cms+"',cmm='"+cmm+"',cmi='"+cmi+"'  where id='"+id+"' ";
								ps=con.prepareStatement(sq);
								ps.execute();
								
								JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
								t20.setText("");t21.setText("");t22.setText("");t23.setText("");t24.setText("");t25.setText("");t26.setText("");t27.setText("");t28.setText("");tt29.setText("");
						    	area();
						    	
						

							}else {
								
								 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
							}
							
							
							
						}
						
						
					}
				
		
				
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
				
			}else {
				
				if(darasa.matches("DARASA LA V") ||darasa.matches("DARASA LA VI")) {
					

				    String sq="insert into mark2(id,eng,geng,kisw,gkisw,dini,gdini,ara,gara,geo,ggeo,cv,gcv,his,ghis,sc,gsc,math,gmath,it,git,avg,class,exam,year,first,last,gender,sch,sum,cme,cmk,cmd,cma,cmg,cmc,cmh,cms,cmm,cmi) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					 ps=con.prepareStatement(sq);
					 ps.setString(1,id.toUpperCase());
					 ps.setString(2,"");
					 ps.setString(3, "");
					 ps.setString(4,"");
					 ps.setString(5,"");
					 ps.setString(6,"");
					 ps.setString(7,"");
					 ps.setString(8,"");
					 ps.setString(9, "");
					ps.setString(10,"");
					ps.setString(11, "");
					ps.setString(12, "");
					ps.setString(13, "");				
					ps.setString(14, "");
					ps.setString(15, "");	
					ps.setString(16, "");
					ps.setString(17, "");
					 ps.setString(18, "");
					 ps.setString(19,"");
					 ps.setString(20,"");
					 ps.setString(21,"");
					 ps.setString(22,"Inc");
                     ps.setString(23,cl);
                     ps.setString(24,exam);	
                     ps.setString(25,year);
                     ps.setString(26,fn);
                     ps.setString(27,ln);	
                     ps.setString(28,gn);
                     ps.setString(29,term);
					 ps.setString(30, "Inc");
                     ps.setString(31,"");
                     ps.setString(32,"");
                     ps.setString(33,"");
                     ps.setString(34,"");
                     ps.setString(35,"");
                     ps.setString(36,"");
                     ps.setString(37,"");
                     ps.setString(38,"");
                     ps.setString(39,"");
                     ps.setString(40,"");
                     ps.execute();
					
//JOptionPane.showMessageDialog(null, "Marks Added Successful !");//t7.setText("");t8.setText("");t10.setText("");t13.setText("");
//area();
t20.setText("");t21.setText("");t22.setText("");t23.setText("");t24.setText("");t25.setText("");t26.setText("");t27.setText("");t28.setText("");tt29.setText("");
	
					
					
				}else if (darasa.matches("DARASA LA I")) {
					
					
					 String sq="insert into mark2(id,eng,geng,kisw,gkisw,dini,gdini,ara,gara,geo,ggeo,cv,gcv,his,ghis,sc,gsc,math,gmath,it,git,avg,class,exam,year,first,last,gender,sch,sum,cme,cmk,cmd,cma,cmg,cmc,cmh,cms,cmm,cmi) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					 ps=con.prepareStatement(sq);
					 ps.setString(1,id.toUpperCase());
					 ps.setString(2,"");
					 ps.setString(3, "");
					 ps.setString(4,"");
					 ps.setString(5,"");
					 ps.setString(6, null);
					 ps.setString(7,null);
					 ps.setString(8,"");
					 ps.setString(9, "");
					ps.setString(10, null);
					ps.setString(11, null);
					ps.setString(12, null);
					ps.setString(13, null);				
					ps.setString(14, null);
					ps.setString(15, null);	
					ps.setString(16, null);
					ps.setString(17, null);
					 ps.setString(18, "");
					 ps.setString(19,"");
					 ps.setString(20,null);
					 ps.setString(21,null);
					 ps.setString(22,"Inc");
                     ps.setString(23,cl);
                     ps.setString(24,exam);	
                     ps.setString(25,year);
                     ps.setString(26,fn);
                     ps.setString(27,ln);	
                     ps.setString(28,gn);
                     ps.setString(29,term);
					 ps.setString(30, "Inc");
                     ps.setString(31,"");
                     ps.setString(32,"");
                     ps.setString(33,"");
                     ps.setString(34,"");
                     ps.setString(35,"");
                     ps.setString(36,"");
                     ps.setString(37,"");
                     ps.setString(38,"");
                     ps.setString(39,"");
                     ps.setString(40,"");
                     ps.execute();

//JOptionPane.showMessageDialog(null, "Marks Added Successful !");//t7.setText("");t8.setText("");t10.setText("");t13.setText("");
//area();
t20.setText("");t21.setText("");t22.setText("");t23.setText("");t24.setText("");t25.setText("");t26.setText("");t27.setText("");t28.setText("");tt29.setText("");
	
					
					
									
					
				
					
					
					
				}else if(darasa.matches("DARASA LA II")  || darasa.matches("DARASA LA III") ||darasa.matches("DARASA LA IV") ) {
					
					

					

					 String sq="insert into mark2(id,eng,geng,kisw,gkisw,dini,gdini,ara,gara,geo,ggeo,cv,gcv,his,ghis,sc,gsc,math,gmath,it,git,avg,class,exam,year,first,last,gender,sch,sum,cme,cmk,cmd,cma,cmg,cmc,cmh,cms,cmm,cmi) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					 ps=con.prepareStatement(sq);
					 ps.setString(1,id.toUpperCase());
					 ps.setString(2,"");
					 ps.setString(3, "");
					 ps.setString(4,"");
					 ps.setString(5,"");
					 ps.setString(6,"");
					 ps.setString(7,"");
					 ps.setString(8,"");
					 ps.setString(9, "");
					ps.setString(10,"");
					ps.setString(11, "");
					ps.setString(12, null);
					ps.setString(13, null);				
					ps.setString(14, null);
					ps.setString(15, null);	
					ps.setString(16, "");
					ps.setString(17, "");
					 ps.setString(18, "");
					 ps.setString(19,"");
					 ps.setString(20,null);
					 ps.setString(21,null);
					 ps.setString(22,"Inc");
                     ps.setString(23,cl);
                     ps.setString(24,exam);	
                     ps.setString(25,year);
                     ps.setString(26,fn);
                     ps.setString(27,ln);	
                     ps.setString(28,gn);
                     ps.setString(29,term);
					 ps.setString(30, "Inc");
                     ps.setString(31,"");
                     ps.setString(32,"");
                     ps.setString(33,"");
                     ps.setString(34,"");
                     ps.setString(35,"");
                     ps.setString(36,"");
                     ps.setString(37,"");
                     ps.setString(38,"");
                     ps.setString(39,"");
                     ps.setString(40,"");
                     ps.execute();

//JOptionPane.showMessageDialog(null, "Marks Added Successful !");//t7.setText("");t8.setText("");t10.setText("");t13.setText("");
//area();
t20.setText("");t21.setText("");t22.setText("");t23.setText("");t24.setText("");t25.setText("");t26.setText("");t27.setText("");t28.setText("");tt29.setText("");
	
					
					
									
					
				}
					
				}
					
			
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getStackTrace());
		}finally{
	             try{
  	                 rs.close();
  	                 ps.close();
  	             }catch(Exception ex){
  	                 ex.getMessage();
  	             }}
		
	}

	private void resert() {
		t0.setText("");t1.setText("");t2.setText("");t3.setSelectedItem(null);t4.setSelectedItem(null);t5.setSelectedItem(null);t6.setSelectedItem(null);area.setText("");field.setText("");box5.setSelectedItem(null);
		table();sch.setSelectedItem(null);boxn1.setSelectedItem(null);boxn.setSelectedItem(null);t7.setSelectedItem(null);
		
	}
	

	private void button() {
		
		
                 try {


                	 String da1="DARASA LA I";
                     String sql="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI' from mark2 where class='"+da1+"'  ";
            			
            			ps=con.prepareStatement(sql);
            			rs=ps.executeQuery();
            			table2.setModel(DbUtils.resultSetToTableModel(rs));
            			table2.setFont(new Font("serif",Font.PLAIN,11));
            			table2.setForeground(new Color(0,0,139));
            			
            		   	int rows = table2.getRowCount();
            				
            			    				ba7.addActionListener(new ActionListener() {
            									public void actionPerformed(ActionEvent arg0) {
            									
                				    for(int row=0;row <rows; row++) {
                				 
                					try {
                						
                						String g0="",m0;
                						String g1="",m1;
                						String g2="",m2;
                						String g3="",m3;
                						
                						Double average=0.0;
                						String avg="";
                						String sam="";
                						Double kisw=0.0,eng=0.0,math=0.0,ara=0.0;
                						String cme="",cmk="",cma="",cmm="";
                						
                						 
            	    					String idn = (String) table2.getValueAt(row, 0);
            	    					String english = (String) table2.getValueAt(row, 3);
            	    					String kiswahili = (String) table2.getValueAt(row, 4);
            	    					String arabic = (String) table2.getValueAt(row, 5);
            	    					String mathe = (String) table2.getValueAt(row, 6);
            	    					

                					
                							if(english.isEmpty() ||english.matches("-")) {
                								g0="";m0="";cme="";
                						}else {
                								m0=english;
                							
                						
                						if(!english.isEmpty() && !english.matches("-")) {
                							 eng=Double.parseDouble(english);
                						
                						if(eng>=grd1 && eng<=grd2){
                					       g0="A";cme="VIZURI SANA";
                					      }else if(eng>=grd3 && eng<grd4){
                					    	  g0="B+";cme="VIZURI";
                					      }
                					      else if(eng>=grd5 && eng<grd6){
                					    	  g0="B";cme="VIZURI";
                					      }
                					      else if(eng>=grd7 && eng<grd8){
                					    	  g0="C";cme="WASTANI";
                						      }
                						      else if (eng>=grd9 && eng<grd10)  {
                						    	  g0= "D";cme="DHAIFU";
                						      }
                						      else if (eng>=grd11 && eng<grd12)  {
                						    	  g0= "F";cme="MBAYA SANA";
                						      }
                						      
                						}
                						}
                							
                							if(kiswahili.isEmpty() ||kiswahili.matches("-")) {
                								g1="";m1="";cmk="";
                						}else {
                								m1=kiswahili;
                							
                						
                						if(!kiswahili.isEmpty() && !kiswahili.matches("-")) {
                				           kisw=Double.parseDouble(kiswahili);
                						
                						if(kisw>=grd1 && kisw<=grd2){
                					       g1="A";cmk="VIZURI SANA";
                					      }else if(kisw>=grd3 && kisw<grd4){
                					    	  g1="B+";cmk="VIZURI";
                					      }
                					      else if(kisw>=grd5 && kisw<grd6){
                					    	  g1="B";cmk="VIZURI";
                					      }
                					      else if(kisw>=grd7 && kisw<grd8){
                					    	  g1="C";cmk="WASTANI";
                						      }
                						      else if(kisw>=grd9 && kisw<grd10) {
                						    	  g1= "D";cmk="DHAIFU";
                						      }
                						      else if(kisw>=grd11 && kisw<grd12) {
                						    	  g1= "F";cmk="MBAYA SANA";
                						      }
                						      
                						}
                						}
                							
                							
                							
                							if(arabic.isEmpty() ||arabic.matches("-")) {
                								g2="";m2="";cma="";
                						}else {
                								m2=arabic;
                							
                						
                						if(!arabic.isEmpty() && !arabic.matches("-")) {
                							ara=Double.parseDouble(arabic);
                						
                						if(ara>=grd1 && ara<=grd2){
                					       g2="A";cma="VIZURI SANA";
                					      }else if(ara>=grd3 && ara<grd4){
                					    	  g2="B+";cma="VIZURI";
                					      }
                					      else if(ara>=grd5 && ara<grd6){
                					    	  g2="B";cma="VIZURI";
                					      }
                					      else if(ara>=grd7 && ara<grd8){
                					    	  g2="C";cma="WASTANI";
                						      }
                						      else  if(ara>=grd9 && ara<grd10){
                						    	  g2= "D";cma="DHAIFU";
                						      }else  if(ara>=grd11 && ara<grd12){
                						    	  g2= "F";cma="MBAYA SANA";
                						      }
                						      
                						}
                						}
                							
                							
                						
                							
                							if(mathe.isEmpty() ||mathe.matches("-")) {
                								g3="";m3="";cmm="";
                						}else {
                								m3=mathe;
                							
                						
                						if(!mathe.isEmpty() && !mathe.matches("-")) {
                						 math=Double.parseDouble(mathe);
                						
                						if(math>=grd1 && math<=grd2){
                					       g3="A";cmm="VIZURI SANA";
                					      }else if(math>=grd3 && math<grd4){
                					    	  g3="B+";cmm="VIZURI";
                					      }
                					      else if(math>=grd5 && math<grd6){
                					    	  g3="B";cmm="VIZURI";
                					      }
                					      else if(math>=grd7 && math<grd8){
                					    	  g3="C";cmm="WASTANI";
                						      }
                						      else  if(math>=grd9 && math<grd10){
                						    	  g3= "D";cmm="DHAIFU";
                						      } else  if(math>=grd11 && math<grd12){
                						    	  g3= "F";cmm="MBAYA SANA";
                						      }
                						      
                						}
                						}
                							
                														
                							int n0=0, n1=0,n2=0,n3=0,toto=0;
                							
                							double sum=0.0;


                							if(english.matches("-") ||english.isEmpty()) {
                							 
                							}else  {

                							n0=1;
                							eng=Double.parseDouble(english);
                							}

                							if(kiswahili.matches("-") ||kiswahili.isEmpty()) {
                							 
                							}else  {

                							n1=1;
                							kisw=Double.parseDouble(kiswahili);
                							}
                							
                							if(arabic.matches("-") ||arabic.isEmpty()) {
                							 
                							}else  {

                							n2=1;
                							ara=Double.parseDouble(arabic);
                							}

                							if(mathe.matches("-") ||mathe.isEmpty()) {
                							 
                							}else  {

                							n3=1;
                							math=Double.parseDouble(mathe);
                							}
                							
                							
                							toto=n0+n1+n2+n3;
                							sum=kisw+eng+ara+math;
                		                   
                							if(toto>=4) {
                								 Double ave=sum/toto;
                								 avg=String.format("%,.4f", ave);
                								 average=Double.parseDouble(avg);
                								 sam=String.format("%,.1f", sum);
                								
                								}else {
                									
                								avg="Inc";
                								sam="Inc";
                									
                								}

                							if(  ((kisw>=0 &&kisw<=100) ||kiswahili.isEmpty()) &&  ((eng>=0 &&eng<=100) ||english.isEmpty()) &&  ((math>=0 &&math<=100) ||mathe.isEmpty()) && ((ara>=0 &&ara<=100) ||arabic.isEmpty())   ) {
                								
                							    String sq="update mark2 set eng='"+m0+"',geng='"+g0+"',kisw='"+m1+"',gkisw='"+g1+"',ara='"+m2+"',gara='"+g2+"',math='"+m3+"',gmath='"+g3+"',avg='"+avg+"',sum='"+sam+"',cme='"+cme+"',cmk='"+cmk+"',cma='"+cma+"',cmm='"+cmm+"'  where id='"+idn+"' ";
                								ps=con.prepareStatement(sq);
                								ps.addBatch();
                								ps.executeBatch();
                								//table3();
                								//JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");

                							}else {
                								
                								
                							}
                						
                					}catch(Exception ex) {
                						JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
                					}
                					
                				}
                				    
            									
            									}
            									
            				    				
            			    				});
            			    				
            			    				
            			    				 String da5="DARASA LA V";
            			    	    		String sql77="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'GEOGRAPHY',sc as 'SAYANSI',dini as 'DINI',cv as 'URAIA',his as 'HISTORIA',it as 'ICT' from mark2 where class='"+da5+"'  ";
            			    				ps=con.prepareStatement(sql77);
            			    				rs=ps.executeQuery();
            			    				table6.setModel(DbUtils.resultSetToTableModel(rs));
            			    				table6.setFont(new Font("serif",Font.PLAIN,11));
            			    				table6.setForeground(new Color(0,0,139));
            			    				
            			    				
            			    				
            			    				ba15.addActionListener(new ActionListener() {

            			    					public void actionPerformed(ActionEvent arg0) {
            			    	                try {
            			    	                	int rows = table6.getRowCount();
            			    	    				for(int row = 0;row <rows; row++) {
            			    	    					
            			    	    					String id = (String) table6.getValueAt(row, 0);
            			    	    					String english = (String) table6.getValueAt(row, 3);
            			    	    					String kiswahili = (String) table6.getValueAt(row, 4);
            			    	    					String arabic = (String) table6.getValueAt(row, 5);
            			    	    					String mathe = (String) table6.getValueAt(row, 6);
            			    	    					String jamii = (String) table6.getValueAt(row, 7);
            			    	    					String sayansi = (String) table6.getValueAt(row, 8);
            			    	    					String din = (String) table6.getValueAt(row, 9);
            			    	    					String uraia = (String) table6.getValueAt(row, 10);
            			    	    					String history = (String) table6.getValueAt(row, 11);
            			    	    					String ict = (String) table6.getValueAt(row, 12);
            			    	    					

            			    							
            			    							String g0="",m0;
            			    							String g1="",m1;
            			    							String g2="",m2;
            			    							String g3="",m3;
            			    							String g4="",m4;
            			    							String g5="",m5;
            			    							String g6="",m6;
            			    							String g7="",m7;
            			    							String g8="",m8;
            			    							String g9="",m9;
            			    							String avg="";
            			    							Double average=0.0;
            			    							String sam="";
            			    							Double cv=0.0,geo=0.0,dini=0.0,kisw=0.0,eng=0.0,sc=0.0,his=0.0,math=0.0,ara=0.0,it=0.0;
            			    							String cme="",cmk="",cmd="",cma="",cmg="",cmc="",cmh="",cms="",cmm="",cmi="";
            			    						
            			    			                
            			    								
            			    								if(english.isEmpty() ||english.matches("-")) {
            			    									g0="";m0="";cme="";
            			    							}else {
            			    									m0=english;
            			    								
            			    							
            			    							if(!english.isEmpty() && !english.matches("-")) {
            			    								 eng=Double.parseDouble(english);
            			    							
            			    							if(eng>=grd1 && eng<=grd2){
            			    						       g0="A";cme="VIZURI SANA";
            			    						      }else if(eng>=grd3 && eng<grd4){
            			    						    	  g0="B+";cme="VIZURI";
            			    						      }
            			    						      else if(eng>=grd5 && eng<grd6){
            			    						    	  g0="B";cme="VIZURI";
            			    						      }
            			    						      else if(eng>=grd7 && eng<grd8){
            			    						    	  g0="C";cme="WASTANI";
            			    							      }
            			    							      else if (eng>=grd9 && eng<grd10)  {
            			    							    	  g0= "D";cme="DHAIFU";
            			    							      }else if (eng>=grd11 && eng<grd12)  {
            			    							    	  g0= "F";cme="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								if(kiswahili.isEmpty() ||kiswahili.matches("-")) {
            			    									g1="";m1="";cmk="";
            			    							}else {
            			    									m1=kiswahili;
            			    								
            			    							
            			    							if(!kiswahili.isEmpty() && !kiswahili.matches("-")) {
            			    					           kisw=Double.parseDouble(kiswahili);
            			    							
            			    							if(kisw>=grd1 && kisw<=grd2){
            			    						       g1="A";cmk="VIZURI SANA";
            			    						      }else if(kisw>=grd3 && kisw<grd4){
            			    						    	  g1="B+";cmk="VIZURI";
            			    						      }
            			    						      else if(kisw>=grd5 && kisw<grd6){
            			    						    	  g1="B";cmk="VIZURI";
            			    						      }
            			    						      else if(kisw>=grd7 && kisw<grd8){
            			    						    	  g1="C";cmk="WASTANI";
            			    							      }
            			    							      else if(kisw>=grd9 && kisw<grd10) {
            			    							    	  g1= "D";cmk="DHAIFU";
            			    							      } else if(kisw>=grd11 && kisw<grd12) {
            			    							    	  g1= "F";cmk="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								if(din.isEmpty() ||din.matches("-")) {
            			    									g2="";m2="";cmd="";
            			    							}else {
            			    									m2=din;
            			    								
            			    							
            			    							if(!din.isEmpty() && !din.matches("-")) {
            			    								 dini=Double.parseDouble(din);
            			    							
            			    							if(dini>=grd1 && dini<=grd2){
            			    						       g2="A";cmd="VIZURI SANA";
            			    						      }else if(dini>=grd3 && dini<grd4){
            			    						    	  g2="B+";cmd="VIZURI";
            			    						      }
            			    						      else if(dini>=grd5 && dini<grd6){
            			    						    	  g2="B";cmd="VIZURI";
            			    						      }
            			    						      else if(dini>=grd7 && dini<grd8){
            			    						    	  g2="C";cmd="WASTANI";
            			    							      }
            			    							      else if(dini>=grd9 && dini<grd10) {
            			    							    	  g2= "D";cmd="DHAIFU";
            			    							      }else if(dini>=grd11 && dini<grd12) {
            			    							    	  g2= "F";cmd="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								if(arabic.isEmpty() ||arabic.matches("-")) {
            			    									g3="";m3="";cma="";
            			    							}else {
            			    									m3=arabic;
            			    								
            			    							
            			    							if(!arabic.isEmpty() && !arabic.matches("-")) {
            			    								ara=Double.parseDouble(arabic);
            			    							
            			    							if(ara>=grd1 && ara<=grd2){
            			    						       g3="A";cma="VIZURI SANA";
            			    						      }else if(ara>=grd3 && ara<grd4){
            			    						    	  g3="B+";cma="VIZURI";
            			    						      }
            			    						      else if(ara>=grd5 && ara<grd6){
            			    						    	  g3="B";cma="VIZURI";
            			    						      }
            			    						      else if(ara>=grd7 && ara<grd8){
            			    						    	  g3="C";cma="WASTANI";
            			    							      }
            			    							      else  if(ara>=grd9 && ara<grd10){
            			    							    	  g3= "D";cma="DHAIFU";
            			    							      }  else  if(ara>=grd11 && ara<grd12){
            			    							    	  g3= "F";cma="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								if(jamii.isEmpty() ||jamii.matches("-")) {
            			    									g4="";m4="";cmg="";
            			    							}else {
            			    									m4=jamii;
            			    								
            			    							
            			    							if(!jamii.isEmpty() && !jamii.matches("-")) {
            			    					          geo=Double.parseDouble(jamii);
            			    							
            			    							if(geo>=grd1 && geo<=grd2){
            			    						       g4="A";cmg="VIZURI SANA";
            			    						      }else if(geo>=grd3 && geo<grd4){
            			    						    	  g4="B+";cmg="VIZURI";
            			    						      }
            			    						      else if(geo>=grd5 && geo<grd6){
            			    						    	  g4="B";cmg="VIZURI";
            			    						      }
            			    						      else if(geo>=grd7 && geo<grd8){
            			    						    	  g4="C";cmg="WASTANI";
            			    							      }
            			    							      else if(geo>=grd9 && geo<grd10) {
            			    							    	  g4= "D";cmg="DHAIFU";
            			    							      } else if(geo>=grd11 && geo<grd12) {
            			    							    	  g4= "F";cmg="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								if(uraia.isEmpty() ||uraia.matches("-")) {
            			    									g5="";m5="";cmc="";
            			    							}else {
            			    									m5=uraia;
            			    								
            			    							
            			    							if(!uraia.isEmpty() && !uraia.matches("-")) {
            			    								cv=Double.parseDouble(uraia);
            			    							
            			    							if(cv>=grd1 && cv<=grd2){
            			    						       g5="A";cmc="VIZURI SANA";
            			    						      }else if(cv>=grd3 && cv<grd4){
            			    						    	  g5="B+";cmc="VIZURI";
            			    						      }
            			    						      else if(cv>=grd5 && cv<grd6){
            			    						    	  g5="B";cmc="VIZURI";
            			    						      }
            			    						      else if(cv>=grd7 && cv<grd8){
            			    						    	  g5="C";cmc="WASTANI";
            			    							      }
            			    							      else  if(cv>=grd9 && cv<grd10){
            			    							    	  g5= "D";cmc="DHAIFU";
            			    							      }
            			    							      else  if(cv>=grd11 && cv<grd12){
            			    							    	  g5= "F";cmc="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								if(history.isEmpty() ||history.matches("-")) {
            			    									g6="";m6="";cmh="";
            			    							}else {
            			    									m6=history;
            			    								
            			    							
            			    							if(!history.isEmpty() && !history.matches("-")) {
            			    								 his=Double.parseDouble(history);
            			    							
            			    							if(his>=grd1 && his<=grd2){
            			    						       g6="A";cmh="VIZURI SANA";
            			    						      }else if(his>=grd3 && his<grd4){
            			    						    	  g6="B+";cmh="VIZURI";
            			    						      }
            			    						      else if(his>=grd5 && his<grd6){
            			    						    	  g6="B";cmh="VIZURI";
            			    						      }
            			    						      else if(his>=grd7 && his<grd8){
            			    						    	  g6="C";cmh="WASTANI";
            			    							      }
            			    							      else  if(his>=grd9 && his<grd10){
            			    							    	  g6= "D";cmh="DHAIFU";
            			    							      }
            			    							      else  if(his>=grd11 && his<grd12){
            			    							    	  g6= "F";cmh="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								if(sayansi.isEmpty() ||sayansi.matches("-")) {
            			    									g7="";m7="";cms="";
            			    							}else {
            			    									m7=sayansi;
            			    								
            			    							
            			    							if(!sayansi.isEmpty() && !sayansi.matches("-")) {
            			    						      sc=Double.parseDouble(sayansi);
            			    							
            			    							if(sc>=grd1 && sc<=grd2){
            			    						       g7="A";cms="VIZURI SANA";
            			    						      }else if(sc>=grd3 && sc<grd4){
            			    						    	  g7="B+";cms="VIZURI";
            			    						      }
            			    						      else if(sc>=grd5 && sc<grd6){
            			    						    	  g7="B";cms="VIZURI";
            			    						      }
            			    						      else if(sc>=grd7 && sc<grd8){
            			    						    	  g7="C";cms="WASTANI";
            			    							      }
            			    							      else if(sc>=grd9 && sc<grd10) {
            			    							    	  g7= "D";cms="DHAIFU";
            			    							      }
            			    							      else if(sc>=grd11 && sc<grd12) {
            			    							    	  g7= "F";cms="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								
            			    								if(mathe.isEmpty() ||mathe.matches("-")) {
            			    									g8="";m8="";cmm="";
            			    							}else {
            			    									m8=mathe;
            			    								
            			    							
            			    							if(!mathe.isEmpty() && !mathe.matches("-")) {
            			    							 math=Double.parseDouble(mathe);
            			    							
            			    							if(math>=grd1 && math<=grd2){
            			    						       g8="A";cmm="VIZURI SANA";
            			    						      }else if(math>=grd3 && math<grd4){
            			    						    	  g8="B+";cmm="VIZURI";
            			    						      }
            			    						      else if(math>=grd5 && math<grd6){
            			    						    	  g8="B";cmm="VIZURI";
            			    						      }
            			    						      else if(math>=grd7 && math<grd8){
            			    						    	  g8="C";cmm="WASTANI";
            			    							      }
            			    							      else  if(math>=grd9 && math<grd10){
            			    							    	  g8= "D";cmm="DHAIFU";
            			    							      }
            			    							      else  if(math>=grd11 && math<grd12){
            			    							    	  g8= "F";cmm="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								if(ict.isEmpty() ||ict.matches("-")) {
            			    									g9="";m9="";cmi="";
            			    							}else {
            			    									m9=ict;
            			    								
            			    							
            			    							if(!ict.isEmpty() && !ict.matches("-")) {
            			    							 it=Double.parseDouble(ict);
            			    							
            			    							if(it>=grd1 && it<=grd2){
            			    						       g9="A";cmi="VIZURI SANA";
            			    						      }else if(it>=grd3 && it<grd4){
            			    						    	  g9="B+";cmi="VIZURI";
            			    						      }
            			    						      else if(it>=grd5 && it<grd6){
            			    						    	  g9="B";cmi="VIZURI";
            			    						      }
            			    						      else if(it>=grd7 && it<grd8){
            			    						    	  g9="C";cmi="WASTANI";
            			    							      }
            			    							      else  if(it>=grd9 && it<grd10){
            			    							    	  g9= "D";cmi="DHAIFU";
            			    							      }
            			    							      else  if(it>=grd11 && it<grd12){
            			    							    	  g9= "F";cmi="MBAYA SANA";
            			    							      }
            			    							      
            			    							}
            			    							}
            			    								
            			    								
            			    								
            			    								
            			    								int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,toto=0,n9=0;
            			    								
            			    								double sum=0.0;


            			    								if(english.matches("-") ||english.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n0=1;
            			    								eng=Double.parseDouble(english);
            			    								}

            			    								if(kiswahili.matches("-") ||kiswahili.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n1=1;
            			    								kisw=Double.parseDouble(kiswahili);
            			    								}
            			    								if(din.matches("-") ||din.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n2=1;
            			    								dini=Double.parseDouble(din);
            			    								}

            			    								if(arabic.matches("-") ||arabic.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n3=1;
            			    								ara=Double.parseDouble(arabic);
            			    								}

            			    								if(jamii.matches("-") ||jamii.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n4=1;
            			    								geo=Double.parseDouble(jamii);
            			    								}

            			    								if(uraia.matches("-") ||uraia.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n5=1;
            			    								cv=Double.parseDouble(uraia);
            			    								}
            			    								if(history.matches("-") ||history.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n6=1;
            			    								his=Double.parseDouble(history);
            			    								}
            			    								if(sayansi.matches("-") ||sayansi.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n7=1;
            			    								sc=Double.parseDouble(sayansi);
            			    								}

            			    								if(mathe.matches("-") ||mathe.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n8=1;
            			    								math=Double.parseDouble(mathe);
            			    								}
            			    								if(ict.matches("-") ||ict.isEmpty()) {
            			    								 
            			    								}else  {

            			    								n9=1;
            			    								it=Double.parseDouble(ict);
            			    								}
            			    								
            			    								toto=n0+n1+n2+n3+n4+n5+n6+n7+n8+n9;
            			    								sum=cv+geo+dini+kisw+eng+it+ara+sc+math+his;
            			    			                   
            			    								if(toto>=10) {
            			    									Double ave=sum/toto;
            			    									 avg=String.format("%.4f", ave);
            			    									 average=Double.parseDouble(avg);
            			    									 sam=String.format("%.1f", sum);
            			    									
            			    									}else {
            			    										
            			    									avg="Inc";
            			    									sam="Inc";
            			    										
            			    									}

            			    								
            			    								                                                                                                                                                                                                                                                                                                                                                             

            			    									

            			    								if(((cv>=0 &&cv<=100) ||uraia.isEmpty()) && ((geo>=0 &&geo<=100) ||jamii.isEmpty()) && ((dini>=0 &&dini<=100) ||din.isEmpty()) && ((kisw>=0 &&kisw<=100) ||kiswahili.isEmpty()) &&  ((eng>=0 &&eng<=100) ||english.isEmpty()) && ((sc>=0 &&sc<=100) ||sayansi.isEmpty()) && ((his>=0 &&his<=100) ||history.isEmpty()) &&  ((math>=0 &&math<=100) ||mathe.isEmpty()) && ((ara>=0 &&ara<=100) ||arabic.isEmpty()) && ((it>=0 &&it<=100) ||ict.isEmpty())  ) {
            			    									


            			    								    String sq="update mark2 set eng='"+m0+"',geng='"+g0+"',kisw='"+m1+"',gkisw='"+g1+"',dini='"+m2+"',gdini='"+g2+"',ara='"+m3+"',gara='"+g3+"',geo='"+m4+"',ggeo='"+g4+"',cv='"+m5+"',gcv='"+g5+"',his='"+m6+"',ghis='"+g6+"',sc='"+m7+"',gsc='"+g7+"',math='"+m8+"',gmath='"+g8+"',it='"+m9+"',git='"+g9+"',avg='"+avg+"',sum='"+sam+"',cme='"+cme+"',cmk='"+cmk+"',cmd='"+cmd+"',cma='"+cma+"',cmg='"+cmg+"',cmc='"+cmc+"',cmh='"+cmh+"',cms='"+cms+"',cmm='"+cmm+"',cmi='"+cmi+"'  where id='"+id+"' ";
            			    									ps=con.prepareStatement(sq);
            			    									ps.addBatch();
            			    									ps.executeBatch();
            			    									
            			    									//JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
            			    									//t20.setText("");t21.setText("");t22.setText("");t23.setText("");t24.setText("");t25.setText("");t26.setText("");t27.setText("");t28.setText("");tt29.setText("");
            			    							    //	area();
            			    							    	
            			    							

            			    								}else {
            			    									
            			    									 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
            			    								}
            			    								
            			    								
            			    								
            			    							}
            			    							
            			    						
            			    	                  }catch(Exception ex) {
            			    	                	  JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
            			    	              }

            			    						
            			    						
            			    						
            			    						
            			    					}	
            			    				});
                	
            			    				
            			    				

           			    				 String da6="DARASA LA VI";
           			    	    		String sql88="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'GEOGRAPHY',sc as 'SAYANSI',dini as 'DINI',cv as 'URAIA',his as 'HISTORIA',it as 'ICT' from mark2 where class='"+da6+"'  ";
           			    				ps=con.prepareStatement(sql88);
           			    				rs=ps.executeQuery();
           			    				table7.setModel(DbUtils.resultSetToTableModel(rs));
           			    				table7.setFont(new Font("serif",Font.PLAIN,11));
           			    				table7.setForeground(new Color(0,0,139));
           			    				
           			    				ba17.addActionListener(new ActionListener() {

           			    					public void actionPerformed(ActionEvent arg0) {
           			    	                try {
           			    	                	int rows = table7.getRowCount();
           			    	    				for(int row = 0;row <rows; row++) {
           			    	    					
           			    	    					String id = (String) table7.getValueAt(row, 0);
           			    	    					String english = (String) table7.getValueAt(row, 3);
           			    	    					String kiswahili = (String) table7.getValueAt(row, 4);
           			    	    					String arabic = (String) table7.getValueAt(row, 5);
           			    	    					String mathe = (String) table7.getValueAt(row, 6);
           			    	    					String jamii = (String) table7.getValueAt(row, 7);
           			    	    					String sayansi = (String) table7.getValueAt(row, 8);
           			    	    					String din = (String) table7.getValueAt(row, 9);
           			    	    					String uraia = (String) table7.getValueAt(row, 10);
           			    	    					String history = (String) table7.getValueAt(row, 11);
           			    	    					String ict = (String) table7.getValueAt(row, 12);
           			    	    					

           			    							
           			    							String g0="",m0;
           			    							String g1="",m1;
           			    							String g2="",m2;
           			    							String g3="",m3;
           			    							String g4="",m4;
           			    							String g5="",m5;
           			    							String g6="",m6;
           			    							String g7="",m7;
           			    							String g8="",m8;
           			    							String g9="",m9;
           			    							String avg="";
           			    							Double average=0.0;
           			    							String sam="";
           			    							Double cv=0.0,geo=0.0,dini=0.0,kisw=0.0,eng=0.0,sc=0.0,his=0.0,math=0.0,ara=0.0,it=0.0;
           			    							String cme="",cmk="",cmd="",cma="",cmg="",cmc="",cmh="",cms="",cmm="",cmi="";
           			    						
           			    			                
           			    								
           			    								if(english.isEmpty() ||english.matches("-")) {
           			    									g0="";m0="";cme="";
           			    							}else {
           			    									m0=english;
           			    								
           			    							
           			    							if(!english.isEmpty() && !english.matches("-")) {
           			    								 eng=Double.parseDouble(english);
           			    							
           			    							if(eng>=grd1 && eng<=grd2){
           			    						       g0="A";cme="VIZURI SANA";
           			    						      }else if(eng>=grd3 && eng<grd4){
           			    						    	  g0="B+";cme="VIZURI";
           			    						      }
           			    						      else if(eng>=grd5 && eng<grd6){
           			    						    	  g0="B";cme="VIZURI";
           			    						      }
           			    						      else if(eng>=grd7 && eng<grd8){
           			    						    	  g0="C";cme="WASTANI";
           			    							      }
           			    							      else if (eng>=grd9 && eng<grd10)  {
           			    							    	  g0= "D";cme="DHAIFU";
           			    							      }else if (eng>=grd11 && eng<grd12)  {
           			    							    	  g0= "F";cme="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								if(kiswahili.isEmpty() ||kiswahili.matches("-")) {
           			    									g1="";m1="";cmk="";
           			    							}else {
           			    									m1=kiswahili;
           			    								
           			    							
           			    							if(!kiswahili.isEmpty() && !kiswahili.matches("-")) {
           			    					           kisw=Double.parseDouble(kiswahili);
           			    							
           			    							if(kisw>=grd1 && kisw<=grd2){
           			    						       g1="A";cmk="VIZURI SANA";
           			    						      }else if(kisw>=grd3 && kisw<grd4){
           			    						    	  g1="B+";cmk="VIZURI";
           			    						      }
           			    						      else if(kisw>=grd5 && kisw<grd6){
           			    						    	  g1="B";cmk="VIZURI";
           			    						      }
           			    						      else if(kisw>=grd7 && kisw<grd8){
           			    						    	  g1="C";cmk="WASTANI";
           			    							      }
           			    							      else if(kisw>=grd9 && kisw<grd10) {
           			    							    	  g1= "D";cmk="DHAIFU";
           			    							      } else if(kisw>=grd11 && kisw<grd12) {
           			    							    	  g1= "F";cmk="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								if(din.isEmpty() ||din.matches("-")) {
           			    									g2="";m2="";cmd="";
           			    							}else {
           			    									m2=din;
           			    								
           			    							
           			    							if(!din.isEmpty() && !din.matches("-")) {
           			    								 dini=Double.parseDouble(din);
           			    							
           			    							if(dini>=grd1 && dini<=grd2){
           			    						       g2="A";cmd="VIZURI SANA";
           			    						      }else if(dini>=grd3 && dini<grd4){
           			    						    	  g2="B+";cmd="VIZURI";
           			    						      }
           			    						      else if(dini>=grd5 && dini<grd6){
           			    						    	  g2="B";cmd="VIZURI";
           			    						      }
           			    						      else if(dini>=grd7 && dini<grd8){
           			    						    	  g2="C";cmd="WASTANI";
           			    							      }
           			    							      else if(dini>=grd9 && dini<grd10) {
           			    							    	  g2= "D";cmd="DHAIFU";
           			    							      }else if(dini>=grd11 && dini<grd12) {
           			    							    	  g2= "F";cmd="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								if(arabic.isEmpty() ||arabic.matches("-")) {
           			    									g3="";m3="";cma="";
           			    							}else {
           			    									m3=arabic;
           			    								
           			    							
           			    							if(!arabic.isEmpty() && !arabic.matches("-")) {
           			    								ara=Double.parseDouble(arabic);
           			    							
           			    							if(ara>=grd1 && ara<=grd2){
           			    						       g3="A";cma="VIZURI SANA";
           			    						      }else if(ara>=grd3 && ara<grd4){
           			    						    	  g3="B+";cma="VIZURI";
           			    						      }
           			    						      else if(ara>=grd5 && ara<grd6){
           			    						    	  g3="B";cma="VIZURI";
           			    						      }
           			    						      else if(ara>=grd7 && ara<grd8){
           			    						    	  g3="C";cma="WASTANI";
           			    							      }
           			    							      else  if(ara>=grd9 && ara<grd10){
           			    							    	  g3= "D";cma="DHAIFU";
           			    							      }  else  if(ara>=grd11 && ara<grd12){
           			    							    	  g3= "F";cma="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								if(jamii.isEmpty() ||jamii.matches("-")) {
           			    									g4="";m4="";cmg="";
           			    							}else {
           			    									m4=jamii;
           			    								
           			    							
           			    							if(!jamii.isEmpty() && !jamii.matches("-")) {
           			    					          geo=Double.parseDouble(jamii);
           			    							
           			    							if(geo>=grd1 && geo<=grd2){
           			    						       g4="A";cmg="VIZURI SANA";
           			    						      }else if(geo>=grd3 && geo<grd4){
           			    						    	  g4="B+";cmg="VIZURI";
           			    						      }
           			    						      else if(geo>=grd5 && geo<grd6){
           			    						    	  g4="B";cmg="VIZURI";
           			    						      }
           			    						      else if(geo>=grd7 && geo<grd8){
           			    						    	  g4="C";cmg="WASTANI";
           			    							      }
           			    							      else if(geo>=grd9 && geo<grd10) {
           			    							    	  g4= "D";cmg="DHAIFU";
           			    							      } else if(geo>=grd11 && geo<grd12) {
           			    							    	  g4= "F";cmg="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								if(uraia.isEmpty() ||uraia.matches("-")) {
           			    									g5="";m5="";cmc="";
           			    							}else {
           			    									m5=uraia;
           			    								
           			    							
           			    							if(!uraia.isEmpty() && !uraia.matches("-")) {
           			    								cv=Double.parseDouble(uraia);
           			    							
           			    							if(cv>=grd1 && cv<=grd2){
           			    						       g5="A";cmc="VIZURI SANA";
           			    						      }else if(cv>=grd3 && cv<grd4){
           			    						    	  g5="B+";cmc="VIZURI";
           			    						      }
           			    						      else if(cv>=grd5 && cv<grd6){
           			    						    	  g5="B";cmc="VIZURI";
           			    						      }
           			    						      else if(cv>=grd7 && cv<grd8){
           			    						    	  g5="C";cmc="WASTANI";
           			    							      }
           			    							      else  if(cv>=grd9 && cv<grd10){
           			    							    	  g5= "D";cmc="DHAIFU";
           			    							      }
           			    							      else  if(cv>=grd11 && cv<grd12){
           			    							    	  g5= "F";cmc="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								if(history.isEmpty() ||history.matches("-")) {
           			    									g6="";m6="";cmh="";
           			    							}else {
           			    									m6=history;
           			    								
           			    							
           			    							if(!history.isEmpty() && !history.matches("-")) {
           			    								 his=Double.parseDouble(history);
           			    							
           			    							if(his>=grd1 && his<=grd2){
           			    						       g6="A";cmh="VIZURI SANA";
           			    						      }else if(his>=grd3 && his<grd4){
           			    						    	  g6="B+";cmh="VIZURI";
           			    						      }
           			    						      else if(his>=grd5 && his<grd6){
           			    						    	  g6="B";cmh="VIZURI";
           			    						      }
           			    						      else if(his>=grd7 && his<grd8){
           			    						    	  g6="C";cmh="WASTANI";
           			    							      }
           			    							      else  if(his>=grd9 && his<grd10){
           			    							    	  g6= "D";cmh="DHAIFU";
           			    							      }
           			    							      else  if(his>=grd11 && his<grd12){
           			    							    	  g6= "F";cmh="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								if(sayansi.isEmpty() ||sayansi.matches("-")) {
           			    									g7="";m7="";cms="";
           			    							}else {
           			    									m7=sayansi;
           			    								
           			    							
           			    							if(!sayansi.isEmpty() && !sayansi.matches("-")) {
           			    						      sc=Double.parseDouble(sayansi);
           			    							
           			    							if(sc>=grd1 && sc<=grd2){
           			    						       g7="A";cms="VIZURI SANA";
           			    						      }else if(sc>=grd3 && sc<grd4){
           			    						    	  g7="B+";cms="VIZURI";
           			    						      }
           			    						      else if(sc>=grd5 && sc<grd6){
           			    						    	  g7="B";cms="VIZURI";
           			    						      }
           			    						      else if(sc>=grd7 && sc<grd8){
           			    						    	  g7="C";cms="WASTANI";
           			    							      }
           			    							      else if(sc>=grd9 && sc<grd10) {
           			    							    	  g7= "D";cms="DHAIFU";
           			    							      }
           			    							      else if(sc>=grd11 && sc<grd12) {
           			    							    	  g7= "F";cms="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								
           			    								if(mathe.isEmpty() ||mathe.matches("-")) {
           			    									g8="";m8="";cmm="";
           			    							}else {
           			    									m8=mathe;
           			    								
           			    							
           			    							if(!mathe.isEmpty() && !mathe.matches("-")) {
           			    							 math=Double.parseDouble(mathe);
           			    							
           			    							if(math>=grd1 && math<=grd2){
           			    						       g8="A";cmm="VIZURI SANA";
           			    						      }else if(math>=grd3 && math<grd4){
           			    						    	  g8="B+";cmm="VIZURI";
           			    						      }
           			    						      else if(math>=grd5 && math<grd6){
           			    						    	  g8="B";cmm="VIZURI";
           			    						      }
           			    						      else if(math>=grd7 && math<grd8){
           			    						    	  g8="C";cmm="WASTANI";
           			    							      }
           			    							      else  if(math>=grd9 && math<grd10){
           			    							    	  g8= "D";cmm="DHAIFU";
           			    							      }
           			    							      else  if(math>=grd11 && math<grd12){
           			    							    	  g8= "F";cmm="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								if(ict.isEmpty() ||ict.matches("-")) {
           			    									g9="";m9="";cmi="";
           			    							}else {
           			    									m9=ict;
           			    								
           			    							
           			    							if(!ict.isEmpty() && !ict.matches("-")) {
           			    							 it=Double.parseDouble(ict);
           			    							
           			    							if(it>=grd1 && it<=grd2){
           			    						       g9="A";cmi="VIZURI SANA";
           			    						      }else if(it>=grd3 && it<grd4){
           			    						    	  g9="B+";cmi="VIZURI";
           			    						      }
           			    						      else if(it>=grd5 && it<grd6){
           			    						    	  g9="B";cmi="VIZURI";
           			    						      }
           			    						      else if(it>=grd7 && it<grd8){
           			    						    	  g9="C";cmi="WASTANI";
           			    							      }
           			    							      else  if(it>=grd9 && it<grd10){
           			    							    	  g9= "D";cmi="DHAIFU";
           			    							      }
           			    							      else  if(it>=grd11 && it<grd12){
           			    							    	  g9= "F";cmi="MBAYA SANA";
           			    							      }
           			    							      
           			    							}
           			    							}
           			    								
           			    								
           			    								
           			    								
           			    								int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,toto=0,n9=0;
           			    								
           			    								double sum=0.0;


           			    								if(english.matches("-") ||english.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n0=1;
           			    								eng=Double.parseDouble(english);
           			    								}

           			    								if(kiswahili.matches("-") ||kiswahili.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n1=1;
           			    								kisw=Double.parseDouble(kiswahili);
           			    								}
           			    								if(din.matches("-") ||din.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n2=1;
           			    								dini=Double.parseDouble(din);
           			    								}

           			    								if(arabic.matches("-") ||arabic.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n3=1;
           			    								ara=Double.parseDouble(arabic);
           			    								}

           			    								if(jamii.matches("-") ||jamii.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n4=1;
           			    								geo=Double.parseDouble(jamii);
           			    								}

           			    								if(uraia.matches("-") ||uraia.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n5=1;
           			    								cv=Double.parseDouble(uraia);
           			    								}
           			    								if(history.matches("-") ||history.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n6=1;
           			    								his=Double.parseDouble(history);
           			    								}
           			    								if(sayansi.matches("-") ||sayansi.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n7=1;
           			    								sc=Double.parseDouble(sayansi);
           			    								}

           			    								if(mathe.matches("-") ||mathe.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n8=1;
           			    								math=Double.parseDouble(mathe);
           			    								}
           			    								if(ict.matches("-") ||ict.isEmpty()) {
           			    								 
           			    								}else  {

           			    								n9=1;
           			    								it=Double.parseDouble(ict);
           			    								}
           			    								
           			    								toto=n0+n1+n2+n3+n4+n5+n6+n7+n8+n9;
           			    								sum=cv+geo+dini+kisw+eng+it+ara+sc+math+his;
           			    			                   
           			    								if(toto>=10) {
           			    									Double ave=sum/toto;
           			    									 avg=String.format("%.4f", ave);
           			    									 average=Double.parseDouble(avg);
           			    									 sam=String.format("%.1f", sum);
           			    									
           			    									}else {
           			    										
           			    									avg="Inc";
           			    									sam="Inc";
           			    										
           			    									}

           			    								
           			    								                                                                                                                                                                                                                                                                                                                                                             

           			    									

           			    								if(((cv>=0 &&cv<=100) ||uraia.isEmpty()) && ((geo>=0 &&geo<=100) ||jamii.isEmpty()) && ((dini>=0 &&dini<=100) ||din.isEmpty()) && ((kisw>=0 &&kisw<=100) ||kiswahili.isEmpty()) &&  ((eng>=0 &&eng<=100) ||english.isEmpty()) && ((sc>=0 &&sc<=100) ||sayansi.isEmpty()) && ((his>=0 &&his<=100) ||history.isEmpty()) &&  ((math>=0 &&math<=100) ||mathe.isEmpty()) && ((ara>=0 &&ara<=100) ||arabic.isEmpty()) && ((it>=0 &&it<=100) ||ict.isEmpty())  ) {
           			    									


           			    								    String sq="update mark2 set eng='"+m0+"',geng='"+g0+"',kisw='"+m1+"',gkisw='"+g1+"',dini='"+m2+"',gdini='"+g2+"',ara='"+m3+"',gara='"+g3+"',geo='"+m4+"',ggeo='"+g4+"',cv='"+m5+"',gcv='"+g5+"',his='"+m6+"',ghis='"+g6+"',sc='"+m7+"',gsc='"+g7+"',math='"+m8+"',gmath='"+g8+"',it='"+m9+"',git='"+g9+"',avg='"+avg+"',sum='"+sam+"',cme='"+cme+"',cmk='"+cmk+"',cmd='"+cmd+"',cma='"+cma+"',cmg='"+cmg+"',cmc='"+cmc+"',cmh='"+cmh+"',cms='"+cms+"',cmm='"+cmm+"',cmi='"+cmi+"'  where id='"+id+"' ";
           			    									ps=con.prepareStatement(sq);
           			    									ps.addBatch();
           			    									ps.executeBatch();
           			    									
           			    									//JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
           			    									//t20.setText("");t21.setText("");t22.setText("");t23.setText("");t24.setText("");t25.setText("");t26.setText("");t27.setText("");t28.setText("");tt29.setText("");
           			    							    //	area();
           			    							    	
           			    							

           			    								}else {
           			    									
           			    									 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
           			    								}
           			    								
           			    								
           			    								
           			    							}
           			    							
           			    						
           			    	                  }catch(Exception ex) {
           			    	                	  JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
           			    	              }

           			    						
           			    						
           			    						
           			    						
           			    					}	
           			    				});
               	
                	 
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			try {
				
				
				 String da2="DARASA LA II";
                String sql="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'S/JAMII',sc as 'SAYANSI',dini as 'DINI' from mark2 where class='"+da2+"'  ";
   				ps=con.prepareStatement(sql);
   				rs=ps.executeQuery();
   				table3.setModel(DbUtils.resultSetToTableModel(rs));
   				table3.setFont(new Font("serif",Font.PLAIN,11));
   				table3.setForeground(new Color(0,0,139));
   				
   				ba9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
	    				int rows = table3.getRowCount();
	    				for(int row = 0;row <rows; row++) {
	    					
	    					try {
	    						
	    						
	    						
	    						String id = (String) table3.getValueAt(row, 0);
    	    					String english = (String) table3.getValueAt(row, 3);
    	    					String kiswahili = (String) table3.getValueAt(row, 4);
    	    					String arabic = (String) table3.getValueAt(row, 5);
    	    					String mathe = (String) table3.getValueAt(row, 6);
    	    					String jamii = (String) table3.getValueAt(row, 7);
    	    					String sayansi = (String) table3.getValueAt(row, 8);
    	    					String din = (String) table3.getValueAt(row, 9);
    	    					
								String g0="",m0;
								String g1="",m1;
								String g2="",m2;
								String g3="",m3;
								String g4="",m4;
								String g5="",m5;
								String g6="",m6;
								
								Double average=0.0;
								String avg="";
								String sam="";
								Double geo=0.0,dini=0.0,kisw=0.0,eng=0.0,sc=0.0,math=0.0,ara=0.0;
								String cme="",cmk="",cmd="",cma="",cmg="",cms="",cmm="";
							
				               
									
									if(english.isEmpty() ||english.matches("-")) {
										g0="";m0="";cme="";
								}else {
										m0=english;
									
								
								if(!english.isEmpty() && !english.matches("-")) {
									 eng=Double.parseDouble(english);
								
								if(eng>=grd1 && eng<=grd2){
							       g0="A";cme="VIZURI SANA";
							      }else if(eng>=grd3 && eng<grd4){
							    	  g0="B+";cme="VIZURI";
							      }
							      else if(eng>=grd5 && eng<grd6){
							    	  g0="B";cme="VIZURI";
							      }
							      else if(eng>=grd7 && eng<grd8){
							    	  g0="C";cme="WASTANI";
								      }
								      else if (eng>=grd9 && eng<grd10)  {
								    	  g0= "D";cme="DHAIFU";
								      } else if (eng>=grd11 && eng<grd12)  {
								    	  g0= "F";cme="MBAYA SANA";
								      }
								      
								}
								}
									
									if(kiswahili.isEmpty() ||kiswahili.matches("-")) {
										g1="";m1="";cmk="";
								}else {
										m1=kiswahili;
									
								
								if(!kiswahili.isEmpty() && !kiswahili.matches("-")) {
						           kisw=Double.parseDouble(kiswahili);
								
								if(kisw>=grd1 && kisw<=grd2){
							       g1="A";cmk="VIZURI SANA";
							      }else if(kisw>=grd3 && kisw<grd4){
							    	  g1="B+";cmk="VIZURI";
							      }
							      else if(kisw>=grd5 && kisw<grd6){
							    	  g1="B";cmk="VIZURI";
							      }
							      else if(kisw>=grd7 && kisw<grd8){
							    	  g1="C";cmk="WASTANI";
								      }
								      else if(kisw>=grd9 && kisw<grd10) {
								    	  g1= "D";cmk="DHAIFU";
								      } else if(kisw>=grd11 && kisw<grd12) {
								    	  g1= "F";cmk="MBAYA SANA";
								      }
								      
								}
								}
									
									if(din.isEmpty() ||din.matches("-")) {
										g2="";m2="";cmd="";
								}else {
										m2=din;
									
								
								if(!din.isEmpty() && !din.matches("-")) {
									 dini=Double.parseDouble(din);
								
								if(dini>=grd1 && dini<=grd2){
							       g2="A";cmd="VIZURI SANA";
							      }else if(dini>=grd3 && dini<grd4){
							    	  g2="B+";cmd="VIZURI";
							      }
							      else if(dini>=grd5 && dini<grd6){
							    	  g2="B";cmd="VIZURI";
							      }
							      else if(dini>=grd7 && dini<grd8){
							    	  g2="C";cmd="WASTANI";
								      }
								      else if(dini>=grd9 && dini<grd10) {
								    	  g2= "D";cmd="DHAIFU";
								      }
								      else if(dini>=grd11 && dini<grd12) {
								    	  g2= "F";cmd="MBAYA SANA";
								      }
								      
								}
								}
									
									if(arabic.isEmpty() ||arabic.matches("-")) {
										g3="";m3="";cma="";
								}else {
										m3=arabic;
									
								
								if(!arabic.isEmpty() && !arabic.matches("-")) {
									ara=Double.parseDouble(arabic);
								
								if(ara>=grd1 && ara<=grd2){
							       g3="A";cma="VIZURI SANA";
							      }else if(ara>=grd3 && ara<grd4){
							    	  g3="B+";cma="VIZURI";
							      }
							      else if(ara>=grd5 && ara<grd6){
							    	  g3="B";cma="VIZURI";
							      }
							      else if(ara>=grd7 && ara<grd8){
							    	  g3="C";cma="WASTANI";
								      }
								      else  if(ara>=grd9 && ara<grd10){
								    	  g3= "D";cma="DHAIFU";
								      } else  if(ara>=grd11 && ara<grd12){
								    	  g3= "F";cma="MBAYA SANA";
								      }
								      
								}
								}
									
									if(jamii.isEmpty() ||jamii.matches("-")) {
										g4="";m4="";cmg="";
								}else {
										m4=jamii;
									
								
								if(!jamii.isEmpty() && !jamii.matches("-")) {
						          geo=Double.parseDouble(jamii);
								
								if(geo>=grd1 && geo<=grd2){
							       g4="A";cmg="VIZURI SANA";
							      }else if(geo>=grd3 && geo<grd4){
							    	  g4="B+";cmg="VIZURI";
							      }
							      else if(geo>=grd5 && geo<grd6){
							    	  g4="B";cmg="VIZURI";
							      }
							      else if(geo>=grd7 && geo<grd8){
							    	  g4="C";cmg="WASTANI";
								      }
								      else if(geo>=grd9 && geo<grd10) {
								    	  g4= "D";cmg="DHAIFU";
								      }
								      else if(geo>=grd11 && geo<grd12) {
								    	  g4= "F";cmg="MBAYA SANA";
								      }
								      
								}
								}
									
								
									if(sayansi.isEmpty() ||sayansi.matches("-")) {
										g5="";m5="";cms="";
								}else {
										m5=sayansi;
									
								
								if(!sayansi.isEmpty() && !sayansi.matches("-")) {
							      sc=Double.parseDouble(sayansi);
								
								if(sc>=grd1 && sc<=grd2){
							       g5="A";cms="VIZURI SANA";
							      }else if(sc>=grd3 && sc<grd4){
							    	  g5="B+";cms="VIZURI";
							      }
							      else if(sc>=grd5 && sc<grd6){
							    	  g5="B";cms="VIZURI";
							      }
							      else if(sc>=grd7 && sc<grd8){
							    	  g5="C";cms="WASTANI";
								      }
								      else if(sc>=grd9 && sc<grd10) {
								    	  g5= "D";cms="DHAIFU";
								      } else if(sc>=grd11 && sc<grd12) {
								    	  g5= "F";cms="MBAYA SANA";
								      }
								      
								}
								}
									
									
									if(mathe.isEmpty() ||mathe.matches("-")) {
										g6="";m6="";cmm="";
								}else {
										m6=mathe;
									
								
								if(!mathe.isEmpty() && !mathe.matches("-")) {
								 math=Double.parseDouble(mathe);
								
								if(math>=grd1 && math<=grd2){
							       g6="A";cmm="VIZURI SANA";
							      }else if(math>=grd3 && math<grd4){
							    	  g6="B+";cmm="VIZURI";
							      }
							      else if(math>=grd5 && math<grd6){
							    	  g6="B";cmm="VIZURI";
							      }
							      else if(math>=grd7 && math<grd8){
							    	  g6="C";cmm="WASTANI";
								      }
								      else  if(math>=grd9 && math<grd10){
								    	  g6= "D";cmm="DHAIFU";
								      }
								      else  if(math>=grd11 && math<grd12){
								    	  g6= "F";cmm="MBAYA SANA";
								      }
								}
								}
									
																
									int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,toto=0;
									
									double sum=0.0;


									if(english.matches("-") ||english.isEmpty()) {
									 
									}else  {

									n0=1;
									eng=Double.parseDouble(english);
									}

									if(kiswahili.matches("-") ||kiswahili.isEmpty()) {
									 
									}else  {

									n1=1;
									kisw=Double.parseDouble(kiswahili);
									}
									if(din.matches("-") ||din.isEmpty()) {
									 
									}else  {

									n2=1;
									dini=Double.parseDouble(din);
									}

									if(arabic.matches("-") ||arabic.isEmpty()) {
									 
									}else  {

									n3=1;
									ara=Double.parseDouble(arabic);
									}

									if(jamii.matches("-") ||jamii.isEmpty()) {
									 
									}else  {

									n4=1;
									geo=Double.parseDouble(jamii);
									}

									if(sayansi.matches("-") ||sayansi.isEmpty()) {
									 
									}else  {

									n5=1;
									sc=Double.parseDouble(sayansi);
									}

									if(mathe.matches("-") ||mathe.isEmpty()) {
									 
									}else  {

									n6=1;
									math=Double.parseDouble(mathe);
									}
									
									
									toto=n0+n1+n2+n3+n4+n5+n6;
									sum=geo+dini+kisw+eng+ara+sc+math;
				                   
									if(toto>=7) {
										Double ave=sum/toto;
										 avg=String.format("%,.4f", ave);
										 average=Double.parseDouble(avg);
										 sam=String.format("%,.1f", sum);
										
										}else {
											
										avg="Inc";
										sam="Inc";
											
										}

									if( ((geo>=0 &&geo<=100) ||jamii.isEmpty()) && ((dini>=0 &&dini<=100) ||din.isEmpty()) && ((kisw>=0 &&kisw<=100) ||kiswahili.isEmpty()) &&  ((eng>=0 &&eng<=100) ||english.isEmpty()) && ((sc>=0 &&sc<=100) ||sayansi.isEmpty()) &&  ((math>=0 &&math<=100) ||mathe.isEmpty()) && ((ara>=0 &&ara<=100) ||arabic.isEmpty())   ) {
										


									    String sq="update mark2 set eng='"+m0+"',geng='"+g0+"',kisw='"+m1+"',gkisw='"+g1+"',dini='"+m2+"',gdini='"+g2+"',ara='"+m3+"',gara='"+g3+"',geo='"+m4+"',ggeo='"+g4+"',sc='"+m5+"',gsc='"+g5+"',math='"+m6+"',gmath='"+g6+"',avg='"+avg+"',sum='"+sam+"',cme='"+cme+"',cmk='"+cmk+"',cmd='"+cmd+"',cma='"+cma+"',cmg='"+cmg+"',cms='"+cms+"',cmm='"+cmm+"'  where id='"+id+"' ";
										ps=con.prepareStatement(sq);
										ps.addBatch();
	    								ps.executeBatch();
	    								
										
									//	JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
										//t30.setText("");t31.setText("");t32.setText("");t33.setText("");t34.setText("");t35.setText("");t36.setText("");
								    	//area();
								    	
								

									}else {
										
										 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
									}
									
									
								
	    						
	    					}catch(Exception ex) {
	    						JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
	    					}
	    				}
					}
					});
   				
					
   				String da3="DARASA LA III";
                String sql3="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'S/JAMII',sc as 'SAYANSI',dini as 'DINI' from mark2 where class='"+da3+"'  ";
				ps=con.prepareStatement(sql3);
				rs=ps.executeQuery();
				table4.setModel(DbUtils.resultSetToTableModel(rs));
				table4.setFont(new Font("serif",Font.PLAIN,11));
				table4.setForeground(new Color(0,0,139));
			
				ba11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
	    				int rows = table4.getRowCount();
	    				for(int row = 0;row <rows; row++) {
	    					
	    					try {
	    						
	    						
	    						
	    						String id = (String) table4.getValueAt(row, 0);
    	    					String english = (String) table4.getValueAt(row, 3);
    	    					String kiswahili = (String) table4.getValueAt(row, 4);
    	    					String arabic = (String) table4.getValueAt(row, 5);
    	    					String mathe = (String) table4.getValueAt(row, 6);
    	    					String jamii = (String) table4.getValueAt(row, 7);
    	    					String sayansi = (String) table4.getValueAt(row, 8);
    	    					String din = (String) table4.getValueAt(row, 9);
    	    					
								String g0="",m0;
								String g1="",m1;
								String g2="",m2;
								String g3="",m3;
								String g4="",m4;
								String g5="",m5;
								String g6="",m6;
								
								Double average=0.0;
								String avg="";
								String sam="";
								Double geo=0.0,dini=0.0,kisw=0.0,eng=0.0,sc=0.0,math=0.0,ara=0.0;
								String cme="",cmk="",cmd="",cma="",cmg="",cms="",cmm="";
							
				               
									
									if(english.isEmpty() ||english.matches("-")) {
										g0="";m0="";cme="";
								}else {
										m0=english;
									
								
								if(!english.isEmpty() && !english.matches("-")) {
									 eng=Double.parseDouble(english);
								
								if(eng>=grd1 && eng<=grd2){
							       g0="A";cme="VIZURI SANA";
							      }else if(eng>=grd3 && eng<grd4){
							    	  g0="B+";cme="VIZURI";
							      }
							      else if(eng>=grd5 && eng<grd6){
							    	  g0="B";cme="VIZURI";
							      }
							      else if(eng>=grd7 && eng<grd8){
							    	  g0="C";cme="WASTANI";
								      }
								      else if (eng>=grd9 && eng<grd10)  {
								    	  g0= "D";cme="DHAIFU";
								      } else if (eng>=grd11 && eng<grd12)  {
								    	  g0= "F";cme="MBAYA SANA";
								      }
								      
								}
								}
									
									if(kiswahili.isEmpty() ||kiswahili.matches("-")) {
										g1="";m1="";cmk="";
								}else {
										m1=kiswahili;
									
								
								if(!kiswahili.isEmpty() && !kiswahili.matches("-")) {
						           kisw=Double.parseDouble(kiswahili);
								
								if(kisw>=grd1 && kisw<=grd2){
							       g1="A";cmk="VIZURI SANA";
							      }else if(kisw>=grd3 && kisw<grd4){
							    	  g1="B+";cmk="VIZURI";
							      }
							      else if(kisw>=grd5 && kisw<grd6){
							    	  g1="B";cmk="VIZURI";
							      }
							      else if(kisw>=grd7 && kisw<grd8){
							    	  g1="C";cmk="WASTANI";
								      }
								      else if(kisw>=grd9 && kisw<grd10) {
								    	  g1= "D";cmk="DHAIFU";
								      } else if(kisw>=grd11 && kisw<grd12) {
								    	  g1= "F";cmk="MBAYA SANA";
								      }
								      
								}
								}
									
									if(din.isEmpty() ||din.matches("-")) {
										g2="";m2="";cmd="";
								}else {
										m2=din;
									
								
								if(!din.isEmpty() && !din.matches("-")) {
									 dini=Double.parseDouble(din);
								
								if(dini>=grd1 && dini<=grd2){
							       g2="A";cmd="VIZURI SANA";
							      }else if(dini>=grd3 && dini<grd4){
							    	  g2="B+";cmd="VIZURI";
							      }
							      else if(dini>=grd5 && dini<grd6){
							    	  g2="B";cmd="VIZURI";
							      }
							      else if(dini>=grd7 && dini<grd8){
							    	  g2="C";cmd="WASTANI";
								      }
								      else if(dini>=grd9 && dini<grd10) {
								    	  g2= "D";cmd="DHAIFU";
								      }
								      else if(dini>=grd11 && dini<grd12) {
								    	  g2= "F";cmd="MBAYA SANA";
								      }
								      
								}
								}
									
									if(arabic.isEmpty() ||arabic.matches("-")) {
										g3="";m3="";cma="";
								}else {
										m3=arabic;
									
								
								if(!arabic.isEmpty() && !arabic.matches("-")) {
									ara=Double.parseDouble(arabic);
								
								if(ara>=grd1 && ara<=grd2){
							       g3="A";cma="VIZURI SANA";
							      }else if(ara>=grd3 && ara<grd4){
							    	  g3="B+";cma="VIZURI";
							      }
							      else if(ara>=grd5 && ara<grd6){
							    	  g3="B";cma="VIZURI";
							      }
							      else if(ara>=grd7 && ara<grd8){
							    	  g3="C";cma="WASTANI";
								      }
								      else  if(ara>=grd9 && ara<grd10){
								    	  g3= "D";cma="DHAIFU";
								      } else  if(ara>=grd11 && ara<grd12){
								    	  g3= "F";cma="MBAYA SANA";
								      }
								      
								}
								}
									
									if(jamii.isEmpty() ||jamii.matches("-")) {
										g4="";m4="";cmg="";
								}else {
										m4=jamii;
									
								
								if(!jamii.isEmpty() && !jamii.matches("-")) {
						          geo=Double.parseDouble(jamii);
								
								if(geo>=grd1 && geo<=grd2){
							       g4="A";cmg="VIZURI SANA";
							      }else if(geo>=grd3 && geo<grd4){
							    	  g4="B+";cmg="VIZURI";
							      }
							      else if(geo>=grd5 && geo<grd6){
							    	  g4="B";cmg="VIZURI";
							      }
							      else if(geo>=grd7 && geo<grd8){
							    	  g4="C";cmg="WASTANI";
								      }
								      else if(geo>=grd9 && geo<grd10) {
								    	  g4= "D";cmg="DHAIFU";
								      }
								      else if(geo>=grd11 && geo<grd12) {
								    	  g4= "F";cmg="MBAYA SANA";
								      }
								      
								}
								}
									
								
									if(sayansi.isEmpty() ||sayansi.matches("-")) {
										g5="";m5="";cms="";
								}else {
										m5=sayansi;
									
								
								if(!sayansi.isEmpty() && !sayansi.matches("-")) {
							      sc=Double.parseDouble(sayansi);
								
								if(sc>=grd1 && sc<=grd2){
							       g5="A";cms="VIZURI SANA";
							      }else if(sc>=grd3 && sc<grd4){
							    	  g5="B+";cms="VIZURI";
							      }
							      else if(sc>=grd5 && sc<grd6){
							    	  g5="B";cms="VIZURI";
							      }
							      else if(sc>=grd7 && sc<grd8){
							    	  g5="C";cms="WASTANI";
								      }
								      else if(sc>=grd9 && sc<grd10) {
								    	  g5= "D";cms="DHAIFU";
								      } else if(sc>=grd11 && sc<grd12) {
								    	  g5= "F";cms="MBAYA SANA";
								      }
								      
								}
								}
									
									
									if(mathe.isEmpty() ||mathe.matches("-")) {
										g6="";m6="";cmm="";
								}else {
										m6=mathe;
									
								
								if(!mathe.isEmpty() && !mathe.matches("-")) {
								 math=Double.parseDouble(mathe);
								
								if(math>=grd1 && math<=grd2){
							       g6="A";cmm="VIZURI SANA";
							      }else if(math>=grd3 && math<grd4){
							    	  g6="B+";cmm="VIZURI";
							      }
							      else if(math>=grd5 && math<grd6){
							    	  g6="B";cmm="VIZURI";
							      }
							      else if(math>=grd7 && math<grd8){
							    	  g6="C";cmm="WASTANI";
								      }
								      else  if(math>=grd9 && math<grd10){
								    	  g6= "D";cmm="DHAIFU";
								      }
								      else  if(math>=grd11 && math<grd12){
								    	  g6= "F";cmm="MBAYA SANA";
								      }
								}
								}
									
																
									int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,toto=0;
									
									double sum=0.0;


									if(english.matches("-") ||english.isEmpty()) {
									 
									}else  {

									n0=1;
									eng=Double.parseDouble(english);
									}

									if(kiswahili.matches("-") ||kiswahili.isEmpty()) {
									 
									}else  {

									n1=1;
									kisw=Double.parseDouble(kiswahili);
									}
									if(din.matches("-") ||din.isEmpty()) {
									 
									}else  {

									n2=1;
									dini=Double.parseDouble(din);
									}

									if(arabic.matches("-") ||arabic.isEmpty()) {
									 
									}else  {

									n3=1;
									ara=Double.parseDouble(arabic);
									}

									if(jamii.matches("-") ||jamii.isEmpty()) {
									 
									}else  {

									n4=1;
									geo=Double.parseDouble(jamii);
									}

									if(sayansi.matches("-") ||sayansi.isEmpty()) {
									 
									}else  {

									n5=1;
									sc=Double.parseDouble(sayansi);
									}

									if(mathe.matches("-") ||mathe.isEmpty()) {
									 
									}else  {

									n6=1;
									math=Double.parseDouble(mathe);
									}
									
									
									toto=n0+n1+n2+n3+n4+n5+n6;
									sum=geo+dini+kisw+eng+ara+sc+math;
				                   
									if(toto>=7) {
										Double ave=sum/toto;
										 avg=String.format("%,.4f", ave);
										 average=Double.parseDouble(avg);
										 sam=String.format("%,.1f", sum);
										
										}else {
											
										avg="Inc";
										sam="Inc";
											
										}

									if( ((geo>=0 &&geo<=100) ||jamii.isEmpty()) && ((dini>=0 &&dini<=100) ||din.isEmpty()) && ((kisw>=0 &&kisw<=100) ||kiswahili.isEmpty()) &&  ((eng>=0 &&eng<=100) ||english.isEmpty()) && ((sc>=0 &&sc<=100) ||sayansi.isEmpty()) &&  ((math>=0 &&math<=100) ||mathe.isEmpty()) && ((ara>=0 &&ara<=100) ||arabic.isEmpty())   ) {
										


									    String sq="update mark2 set eng='"+m0+"',geng='"+g0+"',kisw='"+m1+"',gkisw='"+g1+"',dini='"+m2+"',gdini='"+g2+"',ara='"+m3+"',gara='"+g3+"',geo='"+m4+"',ggeo='"+g4+"',sc='"+m5+"',gsc='"+g5+"',math='"+m6+"',gmath='"+g6+"',avg='"+avg+"',sum='"+sam+"',cme='"+cme+"',cmk='"+cmk+"',cmd='"+cmd+"',cma='"+cma+"',cmg='"+cmg+"',cms='"+cms+"',cmm='"+cmm+"'  where id='"+id+"' ";
										ps=con.prepareStatement(sq);
										ps.addBatch();
	    								ps.executeBatch();
	    								
										
									//	JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
										//t30.setText("");t31.setText("");t32.setText("");t33.setText("");t34.setText("");t35.setText("");t36.setText("");
								    	//area();
								    	
								

									}else {
										
										JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
									}
									
									
								
	    						
	    					}catch(Exception ex) {
	    						JOptionPane.showMessageDialog(null,ex.getStackTrace());
	    					}
	    				}
					}
					});
					

				
				
				
   				String da4="DARASA LA IV";
                String sql4="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI',geo as 'S/JAMII',sc as 'SAYANSI',dini as 'DINI' from mark2 where class='"+da4+"'  ";
				ps=con.prepareStatement(sql4);
				rs=ps.executeQuery();
				table5.setModel(DbUtils.resultSetToTableModel(rs));
				table5.setFont(new Font("serif",Font.PLAIN,11));
				table5.setForeground(new Color(0,0,139));
			
				ba13.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
	    				int rows = table5.getRowCount();
	    				for(int row = 0;row <rows; row++) {
	    					
	    					try {
	    						
	    						
	    						
	    						String id = (String) table5.getValueAt(row, 0);
    	    					String english = (String) table5.getValueAt(row, 3);
    	    					String kiswahili = (String) table5.getValueAt(row, 5);
    	    					String arabic = (String) table5.getValueAt(row, 5);
    	    					String mathe = (String) table5.getValueAt(row, 6);
    	    					String jamii = (String) table5.getValueAt(row, 7);
    	    					String sayansi = (String) table5.getValueAt(row, 8);
    	    					String din = (String) table5.getValueAt(row, 9);
    	    					
								String g0="",m0;
								String g1="",m1;
								String g2="",m2;
								String g3="",m3;
								String g4="",m4;
								String g5="",m5;
								String g6="",m6;
								
								Double average=0.0;
								String avg="";
								String sam="";
								Double geo=0.0,dini=0.0,kisw=0.0,eng=0.0,sc=0.0,math=0.0,ara=0.0;
								String cme="",cmk="",cmd="",cma="",cmg="",cms="",cmm="";
							
				               
									
									if(english.isEmpty() ||english.matches("-")) {
										g0="";m0="";cme="";
								}else {
										m0=english;
									
								
								if(!english.isEmpty() && !english.matches("-")) {
									 eng=Double.parseDouble(english);
								
								if(eng>=grd1 && eng<=grd2){
							       g0="A";cme="VIZURI SANA";
							      }else if(eng>=grd3 && eng<grd4){
							    	  g0="B+";cme="VIZURI";
							      }
							      else if(eng>=grd5 && eng<grd6){
							    	  g0="B";cme="VIZURI";
							      }
							      else if(eng>=grd7 && eng<grd8){
							    	  g0="C";cme="WASTANI";
								      }
								      else if (eng>=grd9 && eng<grd10)  {
								    	  g0= "D";cme="DHAIFU";
								      } else if (eng>=grd11 && eng<grd12)  {
								    	  g0= "F";cme="MBAYA SANA";
								      }
								      
								}
								}
									
									if(kiswahili.isEmpty() ||kiswahili.matches("-")) {
										g1="";m1="";cmk="";
								}else {
										m1=kiswahili;
									
								
								if(!kiswahili.isEmpty() && !kiswahili.matches("-")) {
						           kisw=Double.parseDouble(kiswahili);
								
								if(kisw>=grd1 && kisw<=grd2){
							       g1="A";cmk="VIZURI SANA";
							      }else if(kisw>=grd3 && kisw<grd4){
							    	  g1="B+";cmk="VIZURI";
							      }
							      else if(kisw>=grd5 && kisw<grd6){
							    	  g1="B";cmk="VIZURI";
							      }
							      else if(kisw>=grd7 && kisw<grd8){
							    	  g1="C";cmk="WASTANI";
								      }
								      else if(kisw>=grd9 && kisw<grd10) {
								    	  g1= "D";cmk="DHAIFU";
								      } else if(kisw>=grd11 && kisw<grd12) {
								    	  g1= "F";cmk="MBAYA SANA";
								      }
								      
								}
								}
									
									if(din.isEmpty() ||din.matches("-")) {
										g2="";m2="";cmd="";
								}else {
										m2=din;
									
								
								if(!din.isEmpty() && !din.matches("-")) {
									 dini=Double.parseDouble(din);
								
								if(dini>=grd1 && dini<=grd2){
							       g2="A";cmd="VIZURI SANA";
							      }else if(dini>=grd3 && dini<grd4){
							    	  g2="B+";cmd="VIZURI";
							      }
							      else if(dini>=grd5 && dini<grd6){
							    	  g2="B";cmd="VIZURI";
							      }
							      else if(dini>=grd7 && dini<grd8){
							    	  g2="C";cmd="WASTANI";
								      }
								      else if(dini>=grd9 && dini<grd10) {
								    	  g2= "D";cmd="DHAIFU";
								      }
								      else if(dini>=grd11 && dini<grd12) {
								    	  g2= "F";cmd="MBAYA SANA";
								      }
								      
								}
								}
									
									if(arabic.isEmpty() ||arabic.matches("-")) {
										g3="";m3="";cma="";
								}else {
										m3=arabic;
									
								
								if(!arabic.isEmpty() && !arabic.matches("-")) {
									ara=Double.parseDouble(arabic);
								
								if(ara>=grd1 && ara<=grd2){
							       g3="A";cma="VIZURI SANA";
							      }else if(ara>=grd3 && ara<grd4){
							    	  g3="B+";cma="VIZURI";
							      }
							      else if(ara>=grd5 && ara<grd6){
							    	  g3="B";cma="VIZURI";
							      }
							      else if(ara>=grd7 && ara<grd8){
							    	  g3="C";cma="WASTANI";
								      }
								      else  if(ara>=grd9 && ara<grd10){
								    	  g3= "D";cma="DHAIFU";
								      } else  if(ara>=grd11 && ara<grd12){
								    	  g3= "F";cma="MBAYA SANA";
								      }
								      
								}
								}
									
									if(jamii.isEmpty() ||jamii.matches("-")) {
										g4="";m4="";cmg="";
								}else {
										m4=jamii;
									
								
								if(!jamii.isEmpty() && !jamii.matches("-")) {
						          geo=Double.parseDouble(jamii);
								
								if(geo>=grd1 && geo<=grd2){
							       g4="A";cmg="VIZURI SANA";
							      }else if(geo>=grd3 && geo<grd4){
							    	  g4="B+";cmg="VIZURI";
							      }
							      else if(geo>=grd5 && geo<grd6){
							    	  g4="B";cmg="VIZURI";
							      }
							      else if(geo>=grd7 && geo<grd8){
							    	  g4="C";cmg="WASTANI";
								      }
								      else if(geo>=grd9 && geo<grd10) {
								    	  g4= "D";cmg="DHAIFU";
								      }
								      else if(geo>=grd11 && geo<grd12) {
								    	  g4= "F";cmg="MBAYA SANA";
								      }
								      
								}
								}
									
								
									if(sayansi.isEmpty() ||sayansi.matches("-")) {
										g5="";m5="";cms="";
								}else {
										m5=sayansi;
									
								
								if(!sayansi.isEmpty() && !sayansi.matches("-")) {
							      sc=Double.parseDouble(sayansi);
								
								if(sc>=grd1 && sc<=grd2){
							       g5="A";cms="VIZURI SANA";
							      }else if(sc>=grd3 && sc<grd4){
							    	  g5="B+";cms="VIZURI";
							      }
							      else if(sc>=grd5 && sc<grd6){
							    	  g5="B";cms="VIZURI";
							      }
							      else if(sc>=grd7 && sc<grd8){
							    	  g5="C";cms="WASTANI";
								      }
								      else if(sc>=grd9 && sc<grd10) {
								    	  g5= "D";cms="DHAIFU";
								      } else if(sc>=grd11 && sc<grd12) {
								    	  g5= "F";cms="MBAYA SANA";
								      }
								      
								}
								}
									
									
									if(mathe.isEmpty() ||mathe.matches("-")) {
										g6="";m6="";cmm="";
								}else {
										m6=mathe;
									
								
								if(!mathe.isEmpty() && !mathe.matches("-")) {
								 math=Double.parseDouble(mathe);
								
								if(math>=grd1 && math<=grd2){
							       g6="A";cmm="VIZURI SANA";
							      }else if(math>=grd3 && math<grd4){
							    	  g6="B+";cmm="VIZURI";
							      }
							      else if(math>=grd5 && math<grd6){
							    	  g6="B";cmm="VIZURI";
							      }
							      else if(math>=grd7 && math<grd8){
							    	  g6="C";cmm="WASTANI";
								      }
								      else  if(math>=grd9 && math<grd10){
								    	  g6= "D";cmm="DHAIFU";
								      }
								      else  if(math>=grd11 && math<grd12){
								    	  g6= "F";cmm="MBAYA SANA";
								      }
								}
								}
									
																
									int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,toto=0;
									
									double sum=0.0;


									if(english.matches("-") ||english.isEmpty()) {
									 
									}else  {

									n0=1;
									eng=Double.parseDouble(english);
									}

									if(kiswahili.matches("-") ||kiswahili.isEmpty()) {
									 
									}else  {

									n1=1;
									kisw=Double.parseDouble(kiswahili);
									}
									if(din.matches("-") ||din.isEmpty()) {
									 
									}else  {

									n2=1;
									dini=Double.parseDouble(din);
									}

									if(arabic.matches("-") ||arabic.isEmpty()) {
									 
									}else  {

									n3=1;
									ara=Double.parseDouble(arabic);
									}

									if(jamii.matches("-") ||jamii.isEmpty()) {
									 
									}else  {

									n4=1;
									geo=Double.parseDouble(jamii);
									}

									if(sayansi.matches("-") ||sayansi.isEmpty()) {
									 
									}else  {

									n5=1;
									sc=Double.parseDouble(sayansi);
									}

									if(mathe.matches("-") ||mathe.isEmpty()) {
									 
									}else  {

									n6=1;
									math=Double.parseDouble(mathe);
									}
									
									
									toto=n0+n1+n2+n3+n4+n5+n6;
									sum=geo+dini+kisw+eng+ara+sc+math;
				                   
									if(toto>=7) {
										Double ave=sum/toto;
										 avg=String.format("%,.4f", ave);
										 average=Double.parseDouble(avg);
										 sam=String.format("%,.1f", sum);
										
										}else {
											
										avg="Inc";
										sam="Inc";
											
										}

									if( ((geo>=0 &&geo<=100) ||jamii.isEmpty()) && ((dini>=0 &&dini<=100) ||din.isEmpty()) && ((kisw>=0 &&kisw<=100) ||kiswahili.isEmpty()) &&  ((eng>=0 &&eng<=100) ||english.isEmpty()) && ((sc>=0 &&sc<=100) ||sayansi.isEmpty()) &&  ((math>=0 &&math<=100) ||mathe.isEmpty()) && ((ara>=0 &&ara<=100) ||arabic.isEmpty())   ) {
										


									    String sq="update mark2 set eng='"+m0+"',geng='"+g0+"',kisw='"+m1+"',gkisw='"+g1+"',dini='"+m2+"',gdini='"+g2+"',ara='"+m3+"',gara='"+g3+"',geo='"+m4+"',ggeo='"+g4+"',sc='"+m5+"',gsc='"+g5+"',math='"+m6+"',gmath='"+g6+"',avg='"+avg+"',sum='"+sam+"',cme='"+cme+"',cmk='"+cmk+"',cmd='"+cmd+"',cma='"+cma+"',cmg='"+cmg+"',cms='"+cms+"',cmm='"+cmm+"'  where id='"+id+"' ";
										ps=con.prepareStatement(sq);
										ps.addBatch();
	    								ps.executeBatch();
	    								
	    								
										
									//	JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
										//t30.setText("");t31.setText("");t32.setText("");t33.setText("");t34.setText("");t35.setText("");t36.setText("");
								    	//area();
								    	
								

									}else {
										
										JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
									}
									
									
								
	    						
	    					}catch(Exception ex) {
	    						JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
	    					}
	    				}
					}
					});
					



				
			}catch(Exception ex) {
				
			}
	ba10.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			table3();
		}
		
	});
	
	ba12.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			table3();
		}
		
	});
	ba14.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			table3();
		}
		
	});
		
	
	ba16.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			table3();
		}
		
	});
	ba18.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			table3();
		}
		
	});
		
		ba8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                	 String da1="DARASA LA I";
      			     String sql="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI' from mark2 where class='"+da1+"'  ";
      				ps=con.prepareStatement(sql);
      				rs=ps.executeQuery();
      				table2.setModel(DbUtils.resultSetToTableModel(rs));
      				table2.setFont(new Font("serif",Font.PLAIN,11));
      				table2.setForeground(new Color(0,0,139));
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			}
		});
		
		ba1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="DARASA LA I";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user2 where class= '"+da1+"' ";
             			ps=con.prepareStatement(sql);
             			rs=ps.executeQuery();
             			table.setModel(DbUtils.resultSetToTableModel(rs));
             			table.setFont(new Font("serif",Font.PLAIN,11));
             			table.setForeground(new Color(0,0,139));
             			
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			}
		});
		
		ba2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="DARASA LA II";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user2 where class= '"+da1+"' ";
             			ps=con.prepareStatement(sql);
             			rs=ps.executeQuery();
             			table.setModel(DbUtils.resultSetToTableModel(rs));
             			table.setFont(new Font("serif",Font.PLAIN,11));
             			table.setForeground(new Color(0,0,139));
             			
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			}
		});
		
		ba3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="DARASA LA III";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user2 where class= '"+da1+"' ";
             			ps=con.prepareStatement(sql);
             			rs=ps.executeQuery();
             			table.setModel(DbUtils.resultSetToTableModel(rs));
             			table.setFont(new Font("serif",Font.PLAIN,11));
             			table.setForeground(new Color(0,0,139));
             			
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			}
		});
		
		ba4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="DARASA LA IV";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user2 where class= '"+da1+"' ";
             			ps=con.prepareStatement(sql);
             			rs=ps.executeQuery();
             			table.setModel(DbUtils.resultSetToTableModel(rs));
             			table.setFont(new Font("serif",Font.PLAIN,11));
             			table.setForeground(new Color(0,0,139));
             			
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			}
		});
		
		ba5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="DARASA LA V";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user2 where class= '"+da1+"' ";
             			ps=con.prepareStatement(sql);
             			rs=ps.executeQuery();
             			table.setModel(DbUtils.resultSetToTableModel(rs));
             			table.setFont(new Font("serif",Font.PLAIN,11));
             			table.setForeground(new Color(0,0,139));
             			
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			}
		});
		
		ba6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="DARASA LA VI";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user2 where class= '"+da1+"' ";
             			ps=con.prepareStatement(sql);
             			rs=ps.executeQuery();
             			table.setModel(DbUtils.resultSetToTableModel(rs));
             			table.setFont(new Font("serif",Font.PLAIN,11));
             			table.setForeground(new Color(0,0,139));
             			
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			}
		});
		
		
		ban1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(boxn.getSelectedItem() != null &&!((String) boxn.getSelectedItem()).trim().isEmpty()) {
					
					table3();
				}else {
					
					JOptionPane.showMessageDialog(null, "Select Class Please !");
				}
				
				
			}
			});
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			     
				
						 if (area1.getSelectedText() != null) { // See if they selected something 
						        String s = area1.getSelectedText();
						        JTextPane textpane=new JTextPane();
						        textpane.setText(s + ".");
						      
						        final javax.swing.text.Style style = textpane.addStyle("Bold", null);
						      // JOptionPane.showMessageDialog(null,textpane);
						        
						 }
						
				    
				
				
			}});
		
		b6.addActionListener(new ActionListener() {
			/**
			 *
			 */
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					
					Document document=new Document(PageSize.A4);
				    PdfWriter.getInstance(document, new FileOutputStream("mudi.pdf"));
				    document.open();
				    PdfPTable table = new PdfPTable(36);
				    
				    Image im=Image.getInstance("primary.png");
				    table.setWidths(new int[]{ 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
				    table.setWidthPercentage(112);
				    PdfPCell cell;
				    cell = new PdfPCell(im,false);
				    cell.setColspan(36);
				   // cell.setBorder(4);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    
				    cell = new PdfPCell(new Phrase("\n\n"));
				    cell.setBorder(0);
				    cell.setColspan(36);
				    table.addCell(cell);
				    
				    cell = new PdfPCell(new Phrase("FULL NAME",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(6);
				    cell.setRowspan(3);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("JINSIA",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(3);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("URAIA",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("S / JAMII",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("SAYANSI",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("HISTORIA",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("DINI",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("KISWAHILI",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("ENGLISH",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("KIARABU",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("HISABU",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("ICT",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(2);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("JUMLA",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(3);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("WASTANI",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(3);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("DARAJA",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(3);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("NAFASI",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(2);
				    cell.setRowspan(3);
				    cell.setHorizontalAlignment(1);
				    table.addCell(cell);
				   
				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);

				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 14, Font.PLAIN, BaseColor.BLACK)));
				    cell.setColspan(1);
				    table.addCell(cell);
				   
				   
				   
				    document.add(table);
				    document.close();
				
					document.close();
					JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"mudi.pdf");


					
				}
				
				catch(Exception ex) {
					ex.getMessage();
				}
				
				
			}	}
		);
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(t0.getText() != null &&!t0.getText().trim().isEmpty()&&
						t1.getText() != null &&!t1.getText().trim().isEmpty() && t2.getText() != null &&!t2.getText().trim().isEmpty() && 
						t3.getSelectedItem() != null &&!((String) t3.getSelectedItem()).trim().isEmpty() && 	t4.getSelectedItem() != null
						&&!((String) t4.getSelectedItem()).trim().isEmpty() 
								 && 	t6.getSelectedItem() != null &&!((String) t6.getSelectedItem()).trim().isEmpty()
										 && 	box5.getSelectedItem() != null &&!((String) box5.getSelectedItem()).trim().isEmpty()
								){
					
					update();
					
				}else {
					JOptionPane.showMessageDialog(null, "Select User from the table !");
				}
				
				
				
			}
			
			
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				if(t0.getText() != null &&!t0.getText().trim().isEmpty()&&
						t1.getText() != null &&!t1.getText().trim().isEmpty() && t2.getText() != null &&!t2.getText().trim().isEmpty() && 
						t3.getSelectedItem() != null &&!((String) t3.getSelectedItem()).trim().isEmpty() && 	t4.getSelectedItem() != null
						&&!((String) t4.getSelectedItem()).trim().isEmpty() 
								 && 	t6.getSelectedItem() != null &&!((String) t6.getSelectedItem()).trim().isEmpty()
										 && 	box5.getSelectedItem() != null &&!((String) box5.getSelectedItem()).trim().isEmpty()
												 && 	t7.getSelectedItem() != null &&!((String) t7.getSelectedItem()).trim().isEmpty()
								){
					
					String id=t0.getText().toUpperCase();t10.setText(id);t10.setEditable(false);
					String fn=t1.getText().toUpperCase();t11.setText(fn);
					String ln=t2.getText().toUpperCase();t12.setText(ln);
					String gn=t3.getSelectedItem().toString();t13.setSelectedItem(gn);
					String cl=t4.getSelectedItem().toString();t14.setSelectedItem(cl);
					String exam=t6.getSelectedItem().toString();t16.setSelectedItem(exam);
					String year=box5.getSelectedItem().toString();box15.setSelectedItem(year);
					String scho=t7.getSelectedItem().toString();box16.setSelectedItem(scho);
					//String school="ALI KHAMIS CAMP";
					
				int result = JOptionPane.showConfirmDialog(null, pana, "Update Details",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if(t10.getText() != null &&!t10.getText().trim().isEmpty()&&
						t11.getText() != null &&!t11.getText().trim().isEmpty() && t12.getText() != null &&!t12.getText().trim().isEmpty() &&
						t13.getSelectedItem() != null &&!((String) t13.getSelectedItem()).trim().isEmpty() && 	t14.getSelectedItem() != null
						&&!((String) t14.getSelectedItem()).trim().isEmpty()
							//&&	sch.getSelectedItem() != null &&!((String) sch.getSelectedItem()).trim().isEmpty()
						&& 	t16.getSelectedItem() != null &&!((String) t16.getSelectedItem()).trim().isEmpty() && box15.getSelectedItem() != null &&!((String) box15.getSelectedItem()).trim().isEmpty()
							){
					if(t11.getText().matches("^[\\p{L} .'-]+$") && t12.getText().matches("^[\\p{L} .'-]+$")) {
						
					
				if( result==JOptionPane.OK_OPTION) {
					
					try {
						String mud= t11.getText();
						 mud=mud.replaceAll("'", "''");
						
						     String mk="";
				        	String mk2="Inc";
				        	
						String sql="update  user2 set id='"+(t10.getText().toUpperCase()).replaceAll("'", "''")+"',  first='"+mud.toUpperCase()+"' ,last='"+(t12.getText().toUpperCase()).replaceAll("'", "''")+"',gender='"+t13.getSelectedItem().toString()+"',class='"+t14.getSelectedItem().toString()+"',exam='"+t16.getSelectedItem().toString()+"' ,year='"+box15.getSelectedItem().toString()+"',sch='"+box16.getSelectedItem().toString()+"' where  id='"+t0.getText()+"' ";
						ps=con.prepareStatement(sql);
						ps.execute();
						
					    String sq="update mark2 set id='"+(t10.getText().toUpperCase()).replaceAll("'", "''")+"', class='"+t14.getSelectedItem().toString()+"',exam='"+t16.getSelectedItem().toString()+"',year='"+box15.getSelectedItem().toString()+"',first='"+mud.toUpperCase()+"' ,last='"+(t12.getText().toUpperCase()).replaceAll("'", "''")+"',gender='"+t13.getSelectedItem().toString()+"',sch='"+box16.getSelectedItem().toString()+"' where id='"+t0.getText()+"' ";
						ps=con.prepareStatement(sq);
						ps.execute();
							
					if(!cl.matches(t14.getSelectedItem().toString())) {   
						
                       String sqq="update mark2 set ara='"+mk+"',gara='"+mk+"',his='"+mk+"',ghis='"+mk+"',math='"+mk+"',gmath='"+mk+"',sc='"+mk+"',gsc='"+mk+"',geo='"+mk+"',ggeo='"+mk+"',dini='"+mk+"',gdini='"+mk+"',cv='"+mk+"',gcv='"+mk+"',eng='"+mk+"',geng='"+mk+"',kisw='"+mk+"',gkisw='"+mk+"' ,it='"+mk+"' ,git='"+mk+"', avg='"+mk2+"',sum='"+mk2+"',cme='"+mk+"',cmk='"+mk+"',cmd='"+mk+"',cma='"+mk+"',cmg='"+mk+"',cmc='"+mk+"',cmh='"+mk+"',cms='"+mk+"',cmm='"+mk+"',cmi='"+mk+"' where  id='"+t0.getText()+"' ";
                       ps=con.prepareStatement(sqq);
                       ps.execute();
                       
						}
						
						
						
						String s=String.format("%s   %s",fn ,"Updated Successfully !");
						JOptionPane.showMessageDialog(b1, s);
						
						table();
						resert();

					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}finally{
		  	             try{
		  	                 rs.close();
		  	                 ps.close();
		  	             }catch(Exception ex){
		  	                 ex.getMessage();
		  	             }}
					
				}else {}
					}else {
						JOptionPane.showMessageDialog(null, "Enter Valid Names !");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Fills all Fields Correctly  !");
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Select User from the table !");
			}
			}	
			}
			);
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			resert();
				
			}
			
		});
		b4.addActionListener(new ActionListener() {
			
		     String fn=t1.getText();
			
			public void actionPerformed(ActionEvent e) {

				if(t0.getText() != null &&!t0.getText().trim().isEmpty())
				{
		try {
			
			String s1=String.format("%s   %s","Are you sure you want to Delete,",t1.getText());
			

			int mudi=JOptionPane.showConfirmDialog(b4, s1,"Delete", JOptionPane.YES_NO_OPTION);
			if(mudi==JOptionPane.YES_OPTION)
			{
			String sq1="delete  from user2 where id='"+t0.getText()+"' ";
			ps=con.prepareStatement(sq1);
			ps.execute();
			ps.close();
			
			String sq="delete  from mark2 where id='"+t0.getText()+"' ";
			ps=con.prepareStatement(sq);
			ps.execute();
			ps.close();
			

		     
		     JOptionPane.showMessageDialog(null,t1.getText() +"   "+"Deleted Successfully !");
		     table();resert();
			}
			
			
		}catch(Exception ex) {
			
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}finally{
	             try{
  	                 rs.close();
  	                 ps.close();
  	             }catch(Exception ex){
  	                 ex.getMessage();
  	             }}
			}else {
				                              JOptionPane.showMessageDialog(b1, "Select User from the Table !");
			}
			}
			
			
			
		});
			
		
		b1.addActionListener(new ActionListener() {

			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id=t0.getText().toUpperCase();
				
				
				if(t0.getText() != null &&!t0.getText().trim().isEmpty()&&
						t1.getText() != null &&!t1.getText().trim().isEmpty() && t2.getText() != null &&!t2.getText().trim().isEmpty() &&
						t3.getSelectedItem() != null &&!((String) t3.getSelectedItem()).trim().isEmpty() && 	t4.getSelectedItem() != null
						&&!((String) t4.getSelectedItem()).trim().isEmpty()
								 && 	t6.getSelectedItem() != null &&!((String) t6.getSelectedItem()).trim().isEmpty()&&box5.getSelectedItem() != null &&!((String) box5.getSelectedItem()).trim().isEmpty()
								 && 	t7.getSelectedItem() != null &&!((String) t7.getSelectedItem()).trim().isEmpty()	
								 ){
					String fn=t1.getText().toUpperCase();
					String ln=t2.getText().toUpperCase();
					String gn=t3.getSelectedItem().toString();
					String cl=t4.getSelectedItem().toString();
					String exam=t6.getSelectedItem().toString();
					String year=box5.getSelectedItem().toString();
					String term=t7.getSelectedItem().toString();
					
				try {
					
				
					
					if(fn.matches("^[\\p{L} .'-]+$") && ln.matches("^[\\p{L} .'-]+$") )
		             {
						
						
					String sq="insert into user2(id,first,last,gender,class,exam,year,sch) values (?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sq);
					ps.setString(1,id);
					ps.setString(2, fn);
				    ps.setString(3,ln);
					ps.setString(4,gn);
					ps.setString(5,cl);
					ps.setString(6,exam);
					ps.setString(7,year);
					ps.setString(8,term);
					ps.execute();
					String s=String.format("%s   %s",fn ,"Added Successfully !");
					JOptionPane.showMessageDialog(b1, s);
					
					update();
					table();
						
		             }
					else {
						
						JOptionPane.showMessageDialog(null, "Enter Valid Names  !");
					}
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"User of that ID Already Registered !");
				}finally{
	  	             try{
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
				
				
			} else {
				JOptionPane.showMessageDialog(null, "Fills All fields Correctly  !");
			}
				
			}

			
			});
		
		
	}

	protected void table() {
		 
		
		String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'TERM' from user2 order by class ";
		
		try {

			
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			table.setFont(new Font("serif",Font.PLAIN,11));
			table.setForeground(new Color(0,0,139));
			
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally{
  	             try{
  	                 rs.close();
  	                 ps.close();
  	             }catch(Exception ex){
  	                 ex.getMessage();
  	             }}
		
		table.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent argo)	{
		    int row=table.getSelectedRow();

		    t0.setText(table.getModel().getValueAt(row,0).toString());
		    t1.setText(table.getModel().getValueAt(row,1).toString());
		    t2.setText(table.getModel().getValueAt(row,2).toString());
		    t3.setSelectedItem(table.getModel().getValueAt(row,3).toString());
		    t4.setSelectedItem(table.getModel().getValueAt(row,4).toString());
		    t6.setSelectedItem(table.getModel().getValueAt(row, 5).toString());
		    box5.setSelectedItem(table.getModel().getValueAt(row, 6).toString());
		    t7.setSelectedItem(table.getModel().getValueAt(row, 7).toString());
			table.setForeground(new Color(0,0,139));
		area();
			
			
		    }});
		table.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e)	{

				try{
				int row=table.getSelectedRow();

				     t0.setText(table.getModel().getValueAt(row,0).toString());
				    t1.setText(table.getModel().getValueAt(row,1).toString());
				    t2.setText(table.getModel().getValueAt(row,2).toString());
				    t3.setSelectedItem(table.getModel().getValueAt(row,3).toString());
				    t4.setSelectedItem(table.getModel().getValueAt(row,4).toString());
				    t6.setSelectedItem(table.getModel().getValueAt(row, 5).toString());
				    box5.setSelectedItem(table.getModel().getValueAt(row, 6).toString());
				    t7.setSelectedItem(table.getModel().getValueAt(row, 7).toString());
					table.setForeground(new Color(0,0,139));
				area();
                 if(e.getKeyCode()==KeyEvent.VK_ENTER);
				
				
				}catch(Exception esss){
				//JOptionPane.showMessageDialog(null, esss.getMessage());
				}
				finally{
	  	             try{
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
			}
				
			});
			
		
	}
	private void table2() {

		try {
			
			   String da1="DARASA LA I";
			   String sql="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',eng as 'ENGLISH',kisw as 'KISWAHILI',ara as 'KIARABU',math as 'HISABATI' from mark2 where class='"+da1+"'  ";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				table2.setModel(DbUtils.resultSetToTableModel(rs));
				table2.setFont(new Font("serif",Font.PLAIN,11));
				table2.setForeground(new Color(0,0,139));
              			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		
		  

	}
	
	

	private void bar() {
		
		Icon alarm=new ImageIcon(this.getClass().getResource("/alarm.png"));
		Icon cale=new ImageIcon(this.getClass().getResource("/cale.png"));
		Icon ex=new ImageIcon(this.getClass().getResource("/exit.png"));
		Icon log=new ImageIcon(this.getClass().getResource("/log.png"));
		Icon r=new ImageIcon(this.getClass().getResource("/r.png"));
		Icon u=new ImageIcon(this.getClass().getResource("/us.png"));
		Icon ab=new ImageIcon(this.getClass().getResource("/ab.png"));
		Icon cc=new ImageIcon(this.getClass().getResource("/cc.png"));
		Icon cpp=new ImageIcon(this.getClass().getResource("/pa.png"));
		Icon dell=new ImageIcon(this.getClass().getResource("/dell.png"));
		Icon show=new ImageIcon(this.getClass().getResource("/show.png"));
		Icon pdf=new ImageIcon(this.getClass().getResource("/pdf.png"));
		Icon excel=new ImageIcon(this.getClass().getResource("/excel.png"));
		Icon lev=new ImageIcon(this.getClass().getResource("/level.png"));
		Icon ad=new ImageIcon(this.getClass().getResource("/advance.png"));
		Icon clear=new ImageIcon(this.getClass().getResource("/clear.png"));
		Icon pr=new ImageIcon(this.getClass().getResource("/pri.png"));
		Icon arc=new ImageIcon(this.getClass().getResource("/arc.png"));
		
		
	JMenuBar bar=new JMenuBar();
	setJMenuBar(bar);
	
	JMenu file=new JMenu("File");
	bar.add(file);
	JMenu rep=new JMenu("Report");
	bar.add(rep);
	JMenu set=new JMenu("Setting");
	bar.add(set);
	JMenu other=new JMenu("Others");
	bar.add(other);
	JMenuItem form=new JMenuItem("Attendance Form");
	other.add(form);
	JMenu help=new JMenu("Help");
	bar.add(help);
	JMenuItem about=new JMenuItem("About System");
	help.add(about);about.setIcon(ab);
	JMenuItem grade=new JMenuItem("Update Grade");
	set.add(grade);

	JMenuItem resu=new JMenuItem("Create Archieve");
	set.add(resu);
	
	
	JMenuItem olevel=new JMenuItem("Form I-IV");
	file.add(olevel);olevel.setIcon(lev);
	JMenuItem level=new JMenuItem("Form 5&6");
	file.add(level);level.setIcon(ad);

	JMenu clas=new JMenu("Class Report(New)");
	JMenu dar=new JMenu("Class Report(Old)");
	JMenuItem cla=new JMenuItem("Pdf");

	JMenuItem exp=new JMenuItem("Excel");
	JMenuItem clao=new JMenuItem("Pdf");
	JMenuItem expo=new JMenuItem("Excel");

	JMenu stu=new JMenu("Student's Report");
	rep.add(stu);stu.setIcon(show);
	JMenuItem nrep=new JMenuItem("New");
	JMenuItem orep=new JMenuItem("Old");
	stu.add(nrep);stu.add(orep);
	
	rep.add(clas);
	rep.add(dar);
	clas.add(cla);cla.setIcon(pdf);
	clas.add(exp);exp.setIcon(excel);
	
	dar.add(clao);clao.setIcon(pdf);
	dar.add(expo);expo.setIcon(excel);
	
	JMenuItem del=new JMenuItem("Delete Class");
	file.add(del);del.setIcon(dell);
	JMenuItem up=new JMenuItem("Update Class");
	file.add(up);up.setIcon(show);
	JMenuItem res=new JMenuItem("Resert Marks");
	file.add(res);res.setIcon(clear);
	JMenuItem cp=new JMenuItem("Change Password");
	file.add(cp);
	cp.setIcon(cpp);

	JMenuItem delete=new JMenuItem("Delete Archive");
	file.add(delete);delete.setIcon(arc);
	
	
	JMenuItem logout=new JMenuItem("Logout");
	file.add(logout);logout.setIcon(log);
	
	

	delete.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
		     
		    
					
					try {
						 String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
				    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
				    	 
				    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
					    	 PreparedStatement pss=con.prepareStatement(sql2);
					    	 ResultSet rss=pss.executeQuery();
					    	 int count=Integer.parseInt(rss.getString("count(username)"));
					    	 rss.close();
					    	 pss.close();
					    	 
							if(count>0 )
							{
								
								
								
								int result = JOptionPane.showConfirmDialog(null, panel, "Select",
								        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
								if(result==JOptionPane.OK_OPTION) {
									
									if(jj.getSelectedItem() != null &&!((String) jj.getSelectedItem()).trim().isEmpty()&&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
										
										
										
										String sq1="delete  from mark22 where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ";
										ps=con.prepareStatement(sq1);
										ps.execute();
										ps.close();
										
										
										JOptionPane.showMessageDialog(null, "Records ,Deleted Successfully !");
										
									}else {
										JOptionPane.showMessageDialog(null, "Cant't Accept Empty Value !");
										
									}
									
								}
								
								
							}
							else{
								JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
								
							
							
							}
				    	  
		      } catch(Exception exxx){
		    	  JOptionPane.showMessageDialog(null, exxx.getMessage());
		      }  finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
	           
				
		     }
		      
	});
	
	
	
	
	resu.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {

try {
	int result = JOptionPane.showConfirmDialog(null, panel, "Select",
	        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	if(result==JOptionPane.OK_OPTION) {
	//	JOptionPane.showMessageDialog(null, et.getSelectedItem().toString());
		
		if(jj.getSelectedItem() != null &&!((String) jj.getSelectedItem()).trim().isEmpty()&&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
			
			
			try {
				
				 String sqq ="select count(id) from mark2 where exam = '"+et.getSelectedItem().toString()+"' and class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ";
		    	  ps=con.prepareStatement(sqq);
		    	 rs=ps.executeQuery();
		    	 int cou=Integer.parseInt(rs.getString("count(id)"));
		    	 
				if(cou>0) {
					

				    String sql2 ="select count(id) from mark22 where exam = '"+et.getSelectedItem().toString()+"' and class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ";
			    	  ps=con.prepareStatement(sql2);
			    	 rs=ps.executeQuery();
			    	 int count=Integer.parseInt(rs.getString("count(id)"));
			    	 
			    	 
					if(count>0 )
					{
						JOptionPane.showMessageDialog(null, "Data Already Present !");
					}
					else{
						 String sq="INSERT into mark22(id,eng,geng,kisw,gkisw,dini,gdini,ara,gara,geo,ggeo,cv,gcv,his,ghis,sc,gsc,math,gmath,it,git,avg,class,exam,year,first,last,gender,sch,sum,cme,cmk,cmd,cma,cmg,cmc,cmh,cms,cmm,cmi) SELECT id,eng,geng,kisw,gkisw,dini,gdini,ara,gara,geo,ggeo,cv,gcv,his,ghis,sc,gsc,math,gmath,it,git,avg,class,exam,year,first,last,gender,sch,sum,cme,cmk,cmd,cma,cmg,cmc,cmh,cms,cmm,cmi FROM mark2 WHERE exam='"+et.getSelectedItem().toString()+"' AND class='"+ct.getSelectedItem().toString()+"'  AND  year='"+ac.getSelectedItem().toString()+"'     ";
						 ps=con.prepareStatement(sq);
						 ps.execute();
						 JOptionPane.showMessageDialog(null, "Data Added Successfuly !");
					}
				}else {
					
					JOptionPane.showMessageDialog(null, "Data are not Available !");
				}
				

				
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			
			

			
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
		}
			
		
		
				
	}
	
}catch(Exception ex) {
	JOptionPane.showMessageDialog(null, ex.getMessage());
}
			
			
			
		}	
	});
	
	
	
	form.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			try {
				
				

				int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
				        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if(result==JOptionPane.OK_OPTION){
					if(jj.getSelectedItem() != null &&!((String) jj.getSelectedItem()).trim().isEmpty()&&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
						
						String sqqq="select * from user2  where   class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ";
				    	ps=con.prepareStatement(sqqq);
				    	rs=ps.executeQuery();
				    	
						
						PdfPTable mudi23 = new PdfPTable(1);
					     PdfPCell cell23=new PdfPCell(new Phrase(""));
					    
					     mudi23.setWidthPercentage(105);
					     Image im=Image.getInstance("primary.png");
		  		    	 mudi23.addCell(cell23);
		 		    	 mudi23.addCell(im);
		 		    	 
		 		    	 PdfPTable mudi = new PdfPTable(36);
					     PdfPCell cell=new PdfPCell(new Phrase(""));
					     cell.setColspan(10);
					     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					     cell.setBackgroundColor(new BaseColor(240,230,140));
					     mudi.addCell(cell);
					     mudi.setWidths(new int[]{ 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
						    mudi.setWidthPercentage(100);					    
						    cell.setColspan(36);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
						    cell = new PdfPCell(new Phrase("S/No",FontFactory.getFont("verdana", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setColspan(4);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
						    
						    cell = new PdfPCell(new Phrase("FULL NAME",FontFactory.getFont("verdana", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setColspan(18);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    

						    cell = new PdfPCell(new Phrase("MARKS",FontFactory.getFont("verdana", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setColspan(7);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    

						    cell = new PdfPCell(new Phrase("SIGN",FontFactory.getFont("verdana", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setColspan(7);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
						    int a = 0;
						    while(rs.next()) {
						    	
						    	a++;

				    			String fn=rs.getString("first");
					    		String ln=rs.getString("last");
					    		
					    		  cell = new PdfPCell(new Phrase(""+a,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(4);
								   cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
								    cell.setColspan(18);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("",FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
								    cell.setColspan(7);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("",FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
								    cell.setColspan(7);
								    mudi.addCell(cell);
								    
								    
								    
								    
								    
						    }
						    
						    
						
						    Document document=new Document(PageSize.A4);
				            PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream("Form.pdf"));
							document.open();
							Image img=Image.getInstance("barcode.png");
							document.add(mudi23);
							document.add(new Paragraph("            "+school+"   PRIMARY SCHOOL",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("                                             ATTENDANCE FORM",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("                                              "+ct.getSelectedItem()+"  -  "+ac.getSelectedItem(),FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("\n"));
							document.add(new Paragraph("EXAM : ................................... "+"                            "+"DATE :        ................................. "+" ",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("SUBJECT : .................................. ",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("\n"));
							document.add(mudi);
							document.add(new Paragraph("\n"));
							document.close();
							
							// JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
						      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Form.pdf");
						      
						
					}else {
						
						JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
					}
				}

				
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
		
   }});
	
	grade.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			grade();
			int result = JOptionPane.showConfirmDialog(null, panel3, "Update Grades",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			if(result==JOptionPane.OK_OPTION) {
				
				if(text12.getText() != null &&!text12.getText().trim().isEmpty() &&text11.getText() != null &&!text11.getText().trim().isEmpty() &&text1.getText() != null &&!text1.getText().trim().isEmpty() && text2.getText() != null &&!text2.getText().trim().isEmpty() &&text3.getText() != null &&!text3.getText().trim().isEmpty() && text4.getText() != null &&!text4.getText().trim().isEmpty() && text5.getText() != null &&!text5.getText().trim().isEmpty() && text6.getText() != null &&!text6.getText().trim().isEmpty() && text7.getText() != null &&!text7.getText().trim().isEmpty() && text8.getText() != null &&!text8.getText().trim().isEmpty() && text9.getText() != null &&!text9.getText().trim().isEmpty() && text10.getText() != null &&!text10.getText().trim().isEmpty() ) {
					
					grade1=Double.parseDouble(text1.getText());grade2=Double.parseDouble(text2.getText());grade3=Double.parseDouble(text3.getText());
					grade4=Double.parseDouble(text4.getText());grade5=Double.parseDouble(text5.getText());grade6=Double.parseDouble(text6.getText());
					grade7=Double.parseDouble(text7.getText());grade8=Double.parseDouble(text8.getText());
					grade9=Double.parseDouble(text9.getText());
					grade10=Double.parseDouble(text10.getText());grade11=Double.parseDouble(text11.getText());grade12=Double.parseDouble(text12.getText());
					
					
					if((grade11>=0 && grade11<=100)&&(grade12>=0 && grade12<=100)&& (grade1>=0 && grade1<=100)&&(grade2>=0 && grade2<=100)&&(grade3>=0 && grade3<=100)&&(grade4>=0 && grade4<=100)&&(grade5>=0 && grade5<=100)&&(grade6>=0 && grade6<=100)&&(grade7>=0 && grade7<=100)&&(grade8>=0 && grade8<=100)&&(grade9>=0 && grade9<=100)&&(grade10>=0 && grade10<=100) ) {
						
						try {
							String sql="update grade set grade11='"+grade11+"',grade12='"+grade12+"', grade1='"+grade1+"',grade2='"+grade2+"',grade3='"+grade3+"',grade4='"+grade4+"',grade5='"+grade5+"',grade6='"+grade6+"',grade7='"+grade7+"',grade8='"+grade8+"',grade9='"+grade9+"',grade10='"+grade10+"' where rowid='"+1+"'  ";
							ps=con.prepareStatement(sql);
							ps.execute();
							JOptionPane.showMessageDialog(null,"Grades Updared Successful !");
							
						}catch(Exception ex) {
							JOptionPane.showMessageDialog(null, ex.getMessage());
						}
						finally{
			  	             try{
			  	                 rs.close();
			  	                 ps.close();
			  	             }catch(Exception ex){
			  	                 ex.getMessage();
			  	             }}
						
					}else {
						  JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
					}
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
				}
				
			}}});
	
	cp.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
		      try{
		    	  String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
		    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
		    	 
		    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
			    	 PreparedStatement pss=con.prepareStatement(sql2);
			    	 ResultSet rss=pss.executeQuery();
			    	 int count=Integer.parseInt(rss.getString("count(username)"));
			    	 rss.close();
			    	 pss.close();
			    	 
					if(count>0 )
					{
						
				    	  String p3=JOptionPane.showInputDialog(null, "Enter New Password !", "Password", 1);
				    	
						/*if(p2.equals(p3))
				    	{*/
				  				
								String sql="update  account set  password='"+p3+"' where username= '"+p1+"'  ";
								ps=con.prepareStatement(sql);
								ps.execute();	
								JOptionPane.showMessageDialog(bar, "Password Changed Successfully !");
				    	/*}else{
				    		JOptionPane.showMessageDialog(bar, "Your Passwords do not match !.Try Again..");
				    	}*/
				    	  
				    	
				    	
						
					}
					else{
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
						
					
					
					}
		    	  
		    	
		    	
	                     }catch(Exception e){	
			             e.getMessage();
			             
		    
		      }  finally{
	  	             try{
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
		     }
		      
	});
	
	
	 logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				  {
						
						try {
							rs.close();
							ps.close();
							con.close();
							
						}catch(Exception e) {
							
						}
						
					}
		           
			dispose();
			Login l=new Login();
			l.setSize(810,330);
		    l.setVisible(true);
			l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			l.setResizable(false);
			l.setLocation(350,200);
		    l.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("/lo.png")));
		   
			}});
	res.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
		     
		    	
					
					try {
						 String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
				    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
				    	 
				    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
					    	 PreparedStatement pss=con.prepareStatement(sql2);
					    	 ResultSet rss=pss.executeQuery();
					    	 int count=Integer.parseInt(rss.getString("count(username)"));
					    	 rss.close();
					    	 pss.close();
					    	 
							if(count>0 )
							{
								
								
								
								int result = JOptionPane.showConfirmDialog(null, panel2, "Resert Marks",
								        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
								if((box2.getSelectedItem() != null &&!((String) box2.getSelectedItem()).trim().isEmpty())  )    {
								
							        if(result==JOptionPane.OK_OPTION) {
							        	
							        	String mk="";
							        	String mk2="Inc";
							        	
							        	String s1=String.format("%s   %s  %s","Are you sure you want to Resert,",box2.getSelectedItem(),"Class");
							        	int mudi=JOptionPane.showConfirmDialog(b4, s1,"RESERT ALL Class", JOptionPane.YES_NO_OPTION);
										if(mudi==JOptionPane.YES_OPTION)
										{
								
										                                          	                                                                       
							            String sqq="update mark2 set ara='"+mk+"',gara='"+mk+"',his='"+mk+"',ghis='"+mk+"',math='"+mk+"',gmath='"+mk+"',sc='"+mk+"',gsc='"+mk+"',geo='"+mk+"',ggeo='"+mk+"',dini='"+mk+"',gdini='"+mk+"',cv='"+mk+"',gcv='"+mk+"',eng='"+mk+"',geng='"+mk+"',kisw='"+mk+"',gkisw='"+mk+"' ,it='"+mk+"' ,git='"+mk+"', avg='"+mk2+"',sum='"+mk2+"',cme='"+mk+"',cmk='"+mk+"',cmd='"+mk+"',cma='"+mk+"',cmg='"+mk+"',cmc='"+mk+"',cmh='"+mk+"',cms='"+mk+"',cmm='"+mk+"',cmi='"+mk+"' where  class='"+box2.getSelectedItem().toString()+"' ";
										ps=con.prepareStatement(sqq);
										ps.execute();
										
										JOptionPane.showMessageDialog(null,"Marks Reserted Successfully !");
										table();
										resert();
										box2.setSelectedItem(null);
										
										}
							        	
							        	
							        }
								}
								else {
									JOptionPane.showMessageDialog(null, "Fill All Fields!   Try Again.....");
								}
								
							}
							else{
								JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
								
							
							
							}
				    	  
		      } catch(Exception exxx){
		    	  JOptionPane.showMessageDialog(null, exxx.getMessage());
		      }  finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
	           
				
		     }
		      
	});

	
	up.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
		     
		    	
					
					try {
						 String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
				    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
				    	 
				    	 
				    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
					    	 PreparedStatement pss=con.prepareStatement(sql2);
					    	 ResultSet rss=pss.executeQuery();
					    	 int count=Integer.parseInt(rss.getString("count(username)"));
					    	 rss.close();
					    	 pss.close();
					    	 
							if(count>0 )
							{
								
								
								
								int result = JOptionPane.showConfirmDialog(null, panel1, "Select ",
								        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
								 
					         if(((box69.getSelectedItem() != null &&!((String) box69.getSelectedItem()).trim().isEmpty()) &&(box70.getSelectedItem() != null &&!((String) box70.getSelectedItem()).trim().isEmpty())) && ((box73.getSelectedItem() != null &&!((String) box73.getSelectedItem()).trim().isEmpty()) &&(box74.getSelectedItem() != null &&!((String) box74.getSelectedItem()).trim().isEmpty())) || ((box71.getSelectedItem() != null &&!((String) box71.getSelectedItem()).trim().isEmpty()) &&(box72.getSelectedItem() != null &&!((String) box72.getSelectedItem()).trim().isEmpty()))  )    {
								
							        if(result==JOptionPane.OK_OPTION) {
							        	
							        
							        	
							        	
							        		
							        		String sql1="update  user2 set  class='"+box70.getSelectedItem().toString()+"',exam='"+box74.getSelectedItem().toString()+"' ,year='"+box72.getSelectedItem().toString()+"',sch='"+box76.getSelectedItem().toString()+"'  where  class='"+box69.getSelectedItem().toString()+"' ";
											ps=con.prepareStatement(sql1);
											ps.execute();
											String sql11="update  mark2 set  class='"+box70.getSelectedItem().toString()+"',exam='"+box74.getSelectedItem().toString()+"',year='"+box72.getSelectedItem().toString()+"',sch='"+box76.getSelectedItem().toString()+"'where  class='"+box69.getSelectedItem().toString()+"' ";
											ps=con.prepareStatement(sql11);
											ps.execute();
								        	
							        
										JOptionPane.showMessageDialog(null,"Updated Successfully !");
										box69.setSelectedItem(null);box70.setSelectedItem(null);box71.setSelectedItem(null);box72.setSelectedItem(null);
										box73.setSelectedItem(null);box74.setSelectedItem(null);box75.setSelectedItem(null);box76.setSelectedItem(null);
										table();
							        	
							        }
							        
								}
								else {				JOptionPane.showMessageDialog(null, "Fill All Fields!   Try Again.....");
								}
								
					
							}
							else{
								JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
								
							
							
							}
				    	  
		      } catch(Exception exxx){
		    	  JOptionPane.showMessageDialog(null, exxx.getMessage());
		      }  finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
	           
				
		     }
		      
	});
	
	
	del.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
		     
		    
					
					try {
						 String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
				    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
				    	 
				    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
					    	 PreparedStatement pss=con.prepareStatement(sql2);
					    	 ResultSet rss=pss.executeQuery();
					    	 int count=Integer.parseInt(rss.getString("count(username)"));
					    	 rss.close();
					    	 pss.close();
					    	 
							if(count>0 )
							{
								
								 String[] choices =  {"DARASA LA I","DARASA LA II","DARASA LA III","DARASA LA IV","DARASA LA V","DARASA LA VI"};
								    String input1 = (String) JOptionPane.showInputDialog(null, "Select Class to DELETE","Select ", JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
								     
								 
								String s1=String.format("%s   %s  %s","Are you sure you want to Delete,",input1,"Class");
								String s2=String.format("%s   %s  %s",input1,"Class","Deleted Successfully !");
								
								int mudi=JOptionPane.showConfirmDialog(b4, s1,"Delete ALL Class", JOptionPane.YES_NO_OPTION);
								if(mudi==JOptionPane.YES_OPTION)
								{
							
							String sq1="delete  from user2 where Class='"+input1+"' ";
							ps=con.prepareStatement(sq1);
							ps.execute();
							ps.close();
							
							String sq2="delete  from mark2 where Class='"+input1+"' ";
							ps=con.prepareStatement(sq2);
							ps.execute();
							ps.close();
							
							
							
							
							JOptionPane.showMessageDialog(b1,s2);
							resert();
							table();
							
								}

							}
							else{
								JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
								
							
							
							}
				    	  
		      } catch(Exception exxx){
		    	  JOptionPane.showMessageDialog(null, exxx.getMessage());
		      }  finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
	           
				
		     }
		      
	});
	
	
	
	olevel.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			  {
					
					try {
						rs.close();
						ps.close();
						con.close();
						
					}catch(Exception e) {
						
					}
					
				}
	           
		dispose();
		Level level=new Level();
		level.setVisible(true);
		level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		level.setSize(1365,765);
		level.setResizable(false);
		level.setIconImage(Toolkit.getDefaultToolkit().getImage(level.getClass().getResource("/lo.png")));

		}});
	
	cla.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
			
			int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			
			if(result==JOptionPane.OK_OPTION){
				
				if(jj.getSelectedItem() != null &&!((String) jj.getSelectedItem()).trim().isEmpty()&&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
					
				

				   	Document document=new Document(PageSize.A4.rotate());
					 Calendar timer=Calendar.getInstance();
					 timer.getTime();
					 SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
					 SimpleDateFormat dt=new SimpleDateFormat("MMM dd,  yyyy");
					 
				
				 
				try {

					

     				int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0,count6=0;
			    	int ppa=0,ppb=0,ppbp=0,ppc=0,ppd=0,ppf=0;
					int ggga=0,gggb=0,gggbp=0,gggc=0,gggd=0,gggf=0;
					int cca=0,ccb=0,ccbp=0,ccc=0,ccd=0,ccf=0;
					int bba=0,bbb=0,bbbp=0,bbc=0,bbd=0,bbf=0;
					int mma=0,mmb=0,mmbp=0,mmc=0,mmd=0,mmf=0;
					int dda=0,ddb=0,ddbp=0,ddc=0,ddd=0,ddf=0;
					int kka=0,kkb=0,kkbp=0,kkc=0,kkd=0,kkf=0;
					int nna=0,nnb=0,nnbp=0,nnc=0,nnd=0,nnf=0;
					int zza=0,zzb=0,zzbp=0,zzc=0,zzd=0,zzf=0;
					int za=0,zb=0,zbp=0,zc=0,zd=0,zf=0;
					
					
			    
			    	String count="select count(id) from mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"'  ";
	     			ps=con.prepareStatement(count);
	     			ResultSet rss=ps.executeQuery();
	     			
	     		
			    	    String sq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' ";
					 	ps=con.prepareStatement(sq);
					 	ResultSet rr=ps.executeQuery();
					 	
					 	String sq1="select * from mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' order by case when avg = 'Inc' then 1 else 0 end, avg DESC, cv DESC";
					 	ps=con.prepareStatement(sq1);
					 	ResultSet rrr=ps.executeQuery();
					 	
					 	String sq11="select * from mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' order by case when avg = 'Inc' then 1 else 0 end, avg DESC, cv DESC";
					 	ps=con.prepareStatement(sq11);
					 	ResultSet rrrr=ps.executeQuery();
					 	
					 	
					 	
					 	 String sg="select * from mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem().toString()+"'";
					    ps=con.prepareStatement(sg);
					   ResultSet grs=ps.executeQuery();
					    	
					 	
					 	String p="";
					 
	     			int nam=Integer.parseInt(rss.getString("count(id)"));
	     			if(nam !=0) {
	     				
	     				 
						 PdfPTable mudi = new PdfPTable(36);
					     PdfPCell cell=new PdfPCell(new Phrase(""));
					     cell.setColspan(10);
					     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					     cell.setBackgroundColor(new BaseColor(240,230,140));
					     mudi.addCell(cell);
					     mudi.setWidths(new int[]{ 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
						    mudi.setWidthPercentage(100);					    
						    cell.setColspan(36);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
					     
					    
	      		    	 
	      		    	PdfPTable mudi23 = new PdfPTable(1);
					     PdfPCell cell23=new PdfPCell(new Phrase(""));
					     cell23.setColspan(4);
					     
					     mudi23.addCell(cell23);
					     mudi23.setWidthPercentage(105);
					     Image im=Image.getInstance("primary.png");
	      		    	 cell.setBorder(0);
	       		    	 mudi23.addCell(cell23);
	      		    	 mudi23.addCell(im);
	      		    	 
	      		    	 cell = new PdfPCell(new Phrase("\n", FontFactory.getFont("COURIER_BOLD", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						    mudi23.addCell(cell);
					     
	      		    	   cell = new PdfPCell(new Phrase(school+" PRIMARY SCHOOL", FontFactory.getFont("Arial", 25, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						   // cell.setColspan(4);
						    mudi23.addCell(cell);
						    
						    cell = new PdfPCell(new Phrase("MATOKEO YA  "+et.getSelectedItem().toString()+"\n"+jj.getSelectedItem().toString(), FontFactory.getFont("Arial", 20, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						   // cell.setColspan(4);
						    mudi23.addCell(cell);
						    
						    cell = new PdfPCell(new Phrase(ct.getSelectedItem().toString()+" - "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 20, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						   // cell.setColspan(4);
						    mudi23.addCell(cell);
						    
						   if(ct.getSelectedItem().equals("DARASA LA V") || ct.getSelectedItem().equals("DARASA LA VI")) {
							   
							   cell = new PdfPCell(new Phrase("JINA KAMILI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(8);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JINSIA",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("URAIA",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("GEO",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DINI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("KISWAHILI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ENGLISH",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("SAYANSI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HISABATI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("KIARABU",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HISTORIA",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ICT",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JUMLA",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("WAST",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DAR",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("NAF",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9,Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    

							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							   
							 
						   }else if(ct.getSelectedItem().equals("DARASA LA II") || ct.getSelectedItem().equals("DARASA LA III") || ct.getSelectedItem().equals("DARASA LA IV")) {
							   
							   cell = new PdfPCell(new Phrase("JINA KAMILI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(12);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JINSIA",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("S/JAMII",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DINI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("KISW",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ENG",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("SAY",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HES",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ARABIC",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							
							    cell = new PdfPCell(new Phrase("JUMLA",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("WAST",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DAR",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("NAFASI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							 
							   
							   
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9,Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							   
							 
						   }else if(ct.getSelectedItem().equals("DARASA LA I") ) {
							 
							   
							   
							   cell = new PdfPCell(new Phrase("JINA KAMILI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(10);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JINSIA",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							    
							   
							    cell = new PdfPCell(new Phrase("KISWAHILI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(4);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ENGLISH",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(4);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HISABATI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(4);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("KIARABU",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(4);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							
							    cell = new PdfPCell(new Phrase("JUMLA",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("WAST",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DAR",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("NAFASI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							 
							   
							   
							 
							    cell = new PdfPCell(new Phrase("ALAMA",FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DARAJA",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("ALAMA",FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DARAJA",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("ALAMA",FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DARAJA",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ALAMA",FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DARAJA",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							   
							 
						   }
						    
						   
						    
						     PdfPTable mudi1 = new PdfPTable(1);
						     PdfPCell cell1=new PdfPCell(new Phrase("."));
						     cell1.setColspan(4);
						     cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
						     cell1.setBackgroundColor(new BaseColor(255,250,205));
						     mudi1.addCell(cell1);
						     
						     
						     PdfPTable mudi2 = new PdfPTable(1);
						     PdfPCell cell2=new PdfPCell(new Phrase("."));
						     cell2.setColspan(4);
						     cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
						     cell2.setBackgroundColor(new BaseColor(240,230,140));
						     mudi2.addCell(cell2);
						     mudi2.setHorizontalAlignment(1);
						 
					 
						     String a="";
						     
						    	try {
						    		
						    		while(rr.next()) {
						    			 a=rr.getString("rank");
						    				
						    	
						    			String fn=rr.getString("first");
							    		String ln=rr.getString("last");
						                String gn=rr.getString("gender");
						               
									    
							            if(rr.getString("class").matches("DARASA LA V")  ||  rr.getString("class").matches("DARASA LA VI")) {

							                cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(8);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 8, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    

						                	String cv=rr.getString("cv");
								          	String gcv=rr.getString("gcv");
								          	String geo=rr.getString("geo");
								          	String ggeo=rr.getString("ggeo");
								          	String dini=rr.getString("dini");
								          	String gdini=rr.getString("gdini");
								          	String kiswa=rr.getString("kisw");
								          	String gkiswa=rr.getString("gkisw");
								          	String engl=rr.getString("eng");
								          	String gengl=rr.getString("geng");
							           	    String sc=rr.getString("sc");
							           	    String gsc=rr.getString("gsc");
							           	    String math=rr.getString("math");
							           	    String gmath=rr.getString("gmath");
							           	    String ara=rr.getString("ara");
							           	    String gara=rr.getString("gara");
							             	String his=rr.getString("his");
							           	    String ghis=rr.getString("ghis");
							            	String it=rr.getString("it");
							           	    String git=rr.getString("git");
							            
							            	 cell = new PdfPCell(new Phrase(cv,FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gcv,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(geo,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggeo,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(dini,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gdini,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(kiswa,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gkiswa,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(engl,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gengl,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(sc,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gsc,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ara,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gara,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(his,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ghis,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(it,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(git,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    
										    
										   
										    String sum=rr.getString("sum");
									     	 String sm;
									     	 if(sum.matches("Inc")) {
									     		 sm="Inc";
									     	 }else {
									     		 sm=String.format("%.2f",Double.parseDouble(sum));
									     	 }
									     	 
									     	 cell = new PdfPCell(new Phrase(sm,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(2);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
							                
							   					  
							                      String ave=rr.getString("avg");
											     	 String av;
											     	 if(ave.matches("Inc")) {
											     		 av="Inc";
											     	 }else {
											     		 av=String.format("%.2f",Double.parseDouble(ave));
											     	 }
											     	 
											     	 cell = new PdfPCell(new Phrase(av,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
													    cell.setColspan(2);
													   cell.setHorizontalAlignment(1);
													    mudi.addCell(cell);
									                
							                      if(rr.getString("avg").matches("Inc")) {
										    			p="Inc";
										    		}else {
										    			double mark=Double.parseDouble(rr.getString("avg"));
											    		
											    		if(mark>=grd1 && mark<=grd2) {
											    			p="A";
											    		}else if(mark>=grd3 && mark< grd4) {
											    			p="B+";
											    		}else if(mark>=grd5 && mark< grd6) {
											    			p="B";
											    		}
											    		else if(mark>= grd7 && mark< grd8) {
											    			p="C";
											    		}else if(mark>= grd9 && mark< grd10) {
											    			p="D";
										    		}else if(mark>= grd11 && mark< grd12) {
										    			p="F";
									    		}
									    		
										    		
										    		}
							                      
							                      cell = new PdfPCell(new Phrase(p,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(1);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
							                      
												    cell = new PdfPCell(new Phrase(a+"",FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(1);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
										    
							            
							            }
							            
							            if(rr.getString("class").matches("DARASA LA II")  ||  rr.getString("class").matches("DARASA LA III") ||  rr.getString("class").matches("DARASA LA IV")) {
							            
								          	String geo=rr.getString("geo");
								          	String ggeo=rr.getString("ggeo");
								          	String dini=rr.getString("dini");
								          	String gdini=rr.getString("gdini");
								          	String kiswa=rr.getString("kisw");
								          	String gkiswa=rr.getString("gkisw");
								          	String engl=rr.getString("eng");
								          	String gengl=rr.getString("geng");
							           	    String sc=rr.getString("sc");
							           	    String gsc=rr.getString("gsc");
							           	    String math=rr.getString("math");
							           	    String gmath=rr.getString("gmath");
							           	    String ara=rr.getString("ara");
							           	    String gara=rr.getString("gara");
							           	    

							                cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(12);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    
							           
										    cell = new PdfPCell(new Phrase(geo,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggeo,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(dini,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gdini,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(kiswa,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gkiswa,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(engl,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gengl,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(sc,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gsc,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ara,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gara,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										   
										   
										    
										    String sum=rr.getString("sum");
									     	 String sm;
									     	 if(sum.matches("Inc")) {
									     		 sm="Inc";
									     	 }else {
									     		 sm=String.format("%.2f",Double.parseDouble(sum));
									     	 }
									     	 
									     	 cell = new PdfPCell(new Phrase(sm,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(2);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
							                
							   					  
							                      String ave=rr.getString("avg");
											     	 String av;
											     	 if(ave.matches("Inc")) {
											     		 av="Inc";
											     	 }else {
											     		 av=String.format("%.2f",Double.parseDouble(ave));
											     	 }
											     	 
											     	 cell = new PdfPCell(new Phrase(av,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
													    cell.setColspan(2);
													   cell.setHorizontalAlignment(1);
													    mudi.addCell(cell);
									                
							                      if(rr.getString("avg").matches("Inc")) {
										    			p="Inc";
										    		}else {
										    			double mark=Double.parseDouble(rr.getString("avg"));
											    		
											    		if(mark>=grd1 && mark<=grd2) {
											    			p="A";
											    		}else if(mark>=grd3 && mark< grd4) {
											    			p="B+";
											    		}else if(mark>=grd5 && mark< grd6) {
											    			p="B";
											    		}
											    		else if(mark>= grd7 && mark< grd8) {
											    			p="C";
											    		}else if(mark>= grd9 && mark< grd10) {
											    			p="D";
										    		}else if(mark>= grd11 && mark< grd12) {
										    			p="F";
									    		}
									    		
										    		
										    		}
							                      
							                      cell = new PdfPCell(new Phrase(p,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(2);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
							                      
												    cell = new PdfPCell(new Phrase(a+"",FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(2);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
										    
							            	
							            }
							            
							            if( rr.getString("class").matches("DARASA LA I")) {
								            
								          	
								          	String kiswa=rr.getString("kisw");
								          	String gkiswa=rr.getString("gkisw");
								          	String engl=rr.getString("eng");
								          	String gengl=rr.getString("geng");
							           	    String math=rr.getString("math");
							           	    String gmath=rr.getString("gmath");
							           	    String ara=rr.getString("ara");
							           	    String gara=rr.getString("gara");
							             	
							           	 cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(10);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										   
										    cell = new PdfPCell(new Phrase(kiswa,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gkiswa,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(engl,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gengl,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										   
										    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ara,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gara,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										   
										   
										    String sum=rr.getString("sum");
									     	 String sm;
									     	 if(sum.matches("Inc")) {
									     		 sm="Inc";
									     	 }else {
									     		 sm=String.format("%.2f",Double.parseDouble(sum));
									     	 }
									     	 
									     	 cell = new PdfPCell(new Phrase(sm,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(2);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
							                
							   					  
							                      String ave=rr.getString("avg");
											     	 String av;
											     	 if(ave.matches("Inc")) {
											     		 av="Inc";
											     	 }else {
											     		 av=String.format("%.2f",Double.parseDouble(ave));
											     	 }
											     	 
											     	 cell = new PdfPCell(new Phrase(av,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
													    cell.setColspan(2);
													   cell.setHorizontalAlignment(1);
													    mudi.addCell(cell);
									                
							                      if(rr.getString("avg").matches("Inc")) {
										    			p="Inc";
										    		}else {
										    			double mark=Double.parseDouble(rr.getString("avg"));
											    		
											    		if(mark>=grd1 && mark<=grd2) {
											    			p="A";
											    		}else if(mark>=grd3 && mark< grd4) {
											    			p="B+";
											    		}else if(mark>=grd5 && mark< grd6) {
											    			p="B";
											    		}
											    		else if(mark>= grd7 && mark< grd8) {
											    			p="C";
											    		}else if(mark>= grd9 && mark< grd10) {
											    			p="D";
										    		}else if(mark>= grd11 && mark< grd12) {
										    			p="F";
									    		}
									    		
										    		
										    		}
							                      
							                      cell = new PdfPCell(new Phrase(p,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(2);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
							                      
												    cell = new PdfPCell(new Phrase(a+"",FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(2);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
										    
							            	
							            }
							           
						                   
						    			
						    		}
						    		
						    		
						    		
						    	
						    	while(rrr.next()) {
						    		
						    		if(rrr.getString("avg").matches("Inc")) {
						    			count5++;
						    			
						    		}else {
						    			double mark=Double.parseDouble(rrr.getString("avg"));
							    		
							    		if(mark>=grd1 && mark<=grd2) {
							    			count1++;
							    		}else if(mark>=grd3 && mark<grd4) {
							    			count2=count2+1;
							    		}else if(mark>=grd5 && mark<grd6) {
							    			count3++;
							    		}
							    		else if(mark>=grd7 && mark<grd8) {
							    			count4++;
							    		}else if(mark>=grd9 && mark<grd10) {
							    			count0++;
							    			
							    		}
							    		else if(mark>=grd11 && mark<grd12) {
							    			count6++;
							    			
							    		
							    		}
						    
							    		
						    		}
						    		}
						    	
						    	
						    	try {
						    		
						    		
						    		while(grs.next()) {
						    			
						    			 if(grs.getString("gcv") != null) {
								    			
							                 String mg=grs.getString("gcv");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         ggga++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   gggbp++;
							   			   	}else if(mg.equals("B")) {
									   	    	   gggb++;
									   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   gggc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   gggd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   gggf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("ggeo") != null) {
								    			
							                 String mg=grs.getString("ggeo");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         bba++;
							   	    		}
							   	    		else if(mg.equals("B+")) {
							   			    	   bbbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   bbb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   bbc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   bbd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   bbf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("gdini") != null) {
								    			
							                 String mg=grs.getString("gdini");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         dda++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   ddbp++;
							   			    }else if(mg.equals("B")) {
									   			   ddb++;
									   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   ddc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   ddd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   ddf++;
							   			    		}
								    		
							    		 }
						    			 
						    			 if(grs.getString("gkisw") != null) {
								    			
							                 String mg=grs.getString("gkisw");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         kka++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   kkbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   kkb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   kkc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   kkd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   kkf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("geng") != null) {
								    			
							                 String mg=grs.getString("geng");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         nna++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   nnbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   nnb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   nnc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   nnd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   nnf++;
							   			    		}
						    			 }
						    			 if(grs.getString("gara") != null) {
								    			
							                 String mg=grs.getString("gara");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         ppa++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   ppbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   ppb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   ppc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   ppd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   ppf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("ghis") != null) {
								    			
							                 String mg=grs.getString("ghis");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         cca++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   ccbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   ccb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   ccc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   ccd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   ccf++;
							   			    		}
						    			 }
						    			
						    			 
						    			 if(grs.getString("gsc") != null) {
								    			
							                 String mg=grs.getString("gsc");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         zza++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   zzbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   zzb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   zzc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   zzd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   zzf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("git") != null) {
								    			
							                 String mg=grs.getString("git");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         za++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   zbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   zb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   zc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   zd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   zf++;
							   			    		}
						    			 }
						    			
						    			 if(grs.getString("gmath") != null) {
								    			
							                 String mg=grs.getString("gmath");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         mma++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   mmbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   mmb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   mmc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   mmd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   mmf++;
							   			    		}
						    			 }
						    			
						    		}
						    		
						    
						    			
						    			 if(rrrr.getString("class").matches("DARASA LA V")  ||  rrrr.getString("class").matches("DARASA LA VI")) {
						    				 
						    				 
						    				    String sm=String.format("MCHANGANUO WA MASOMO");
												cell2=new PdfPCell(new Phrase(sm));
												cell2.setHorizontalAlignment(1);
												mudi2.setWidthPercentage(70);
									            mudi2.addCell(cell2);
									            
									            String s0=String.format("*****");
												cell2=new PdfPCell(new Phrase(s0));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
									            mudi2.addCell(cell2);
									            
									    	 
									        	 String s=String.format(" %s","URAIA:  A="+ggga+"   B+="+gggbp+"   B="+gggb+"   C="+gggc+"   D="+gggd+"      F="+gggf);
												cell2=new PdfPCell(new Phrase(s));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((ggga+gggb+gggc+gggd+gggf+gggbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									          
									           
									            
									            String s1=String.format(" %s","GEOGRAPHY:  A="+bba+"   B+="+bbbp+"   B="+bbb+"   C="+bbc+"   D="+bbd+"   F="+bbf);
												cell2=new PdfPCell(new Phrase(s1));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((bba+bbb+bbc+bbd+bbf+bbbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s2=String.format(" %s","DINI:  A="+dda+"   B+="+ddbp+"   B="+ddb+"     C="+ddc+"   D="+ddd+"   F="+ddf);
												cell2=new PdfPCell(new Phrase(s2));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((dda+ddb+ddc+ddd+ddf+ddbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									            
									            String s3=String.format(" %s","KISWAHILI:  A="+kka+"   B+="+kkbp+"   B="+kkb+"    C="+kkc+"   D="+kkd+"   F="+kkf);
												cell2=new PdfPCell(new Phrase(s3));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((kka+kkb+kkc+kkd+kkf+kkbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s4=String.format(" %s","ENGLISH:  A="+nna+"   B+="+nnbp+"   B="+nnb+"   C="+nnc+"   D="+nnd+"   F="+nnf);
												cell2=new PdfPCell(new Phrase(s4));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((nna+nnb+nnc+nnd+nnf+nnbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s5=String.format(" %s","ARABIC:  A="+ppa+"   B+="+ppbp+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   F="+ppf);
												cell2=new PdfPCell(new Phrase(s5));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((ppa+ppb+ppc+ppd+ppf+ppbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									            String s6=String.format(" %s","HISTORY:  A="+cca+"   B+="+ccbp+"   B="+ccb+"   C="+ccc+"   D="+ccd+"   F="+ccf);
												cell2=new PdfPCell(new Phrase(s6));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((cca+ccb+ccc+ccd+ccf+ccbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s7=String.format(" %s","SCIENCE:  A="+zza+"   B+="+zzbp+"   B="+zzb+"   C="+zzc+"   D="+zzd+"   F="+zzf);
												cell2=new PdfPCell(new Phrase(s7));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((zza+zzb+zzc+zzd+zzf+zzbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s8=String.format(" %s","B/MATH:  A="+mma+"   B+="+mmbp+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   F="+mmf);
												cell2=new PdfPCell(new Phrase(s8));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((mma+mmb+mmc+mmd+mmf+mmbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
												String s9=String.format(" %s","ICT:  A="+za+"   B+="+zbp+"   B="+zb+"   C="+zc+"   D="+zd+"   F="+zf);
												cell2=new PdfPCell(new Phrase(s9));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((za+zb+zc+zd+zf+zbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
						    				 
						    			 }else if (rrrr.getString("class").matches("DARASA LA II")  ||  rrrr.getString("class").matches("DARASA LA III") ||  rrrr.getString("class").matches("DARASA LA IV")){
						    				 
						    				 
						    				 
						    				 
						    				 String sm=String.format("MCHANGANUO WA MASOMO");
												cell2=new PdfPCell(new Phrase(sm));
												cell2.setHorizontalAlignment(1);
												mudi2.setWidthPercentage(70);
									            mudi2.addCell(cell2);
									            
									            String s0=String.format("*****");
												cell2=new PdfPCell(new Phrase(s0));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
									            mudi2.addCell(cell2);
									            
									    	 
									        	
									            
									            String s1=String.format(" %s","S / JAMII:  A="+bba+"   B+="+bbbp+"   B="+bbb+"   C="+bbc+"   D="+bbd+"   F="+bbf);
												cell2=new PdfPCell(new Phrase(s1));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((bba+bbb+bbc+bbd+bbf+bbbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s2=String.format(" %s","DINI:  A="+dda+"   B+="+ddbp+"   B="+ddb+"     C="+ddc+"   D="+ddd+"   F="+ddf);
												cell2=new PdfPCell(new Phrase(s2));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((dda+ddb+ddc+ddd+ddf+ddbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									            
									            String s3=String.format(" %s","KISWAHILI:  A="+kka+"   B+="+kkbp+"   B="+kkb+"    C="+kkc+"   D="+kkd+"   F="+kkf);
												cell2=new PdfPCell(new Phrase(s3));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((kka+kkb+kkc+kkd+kkf+kkbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s4=String.format(" %s","ENGLISH:  A="+nna+"   B+="+nnbp+"   B="+nnb+"   C="+nnc+"   D="+nnd+"   F="+nnf);
												cell2=new PdfPCell(new Phrase(s4));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((nna+nnb+nnc+nnd+nnf+nnbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s5=String.format(" %s","KIARABU:  A="+ppa+"   B+="+ppbp+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   F="+ppf);
												cell2=new PdfPCell(new Phrase(s5));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((ppa+ppb+ppc+ppd+ppf+ppbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									          
									            
									            String s7=String.format(" %s","SAYANSI:  A="+zza+"   B+="+zzbp+"   B="+zzb+"   C="+zzc+"   D="+zzd+"   F="+zzf);
												cell2=new PdfPCell(new Phrase(s7));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((zza+zzb+zzc+zzd+zzf+zzbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s8=String.format(" %s","HISABATI:  A="+mma+"   B+="+mmbp+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   F="+mmf);
												cell2=new PdfPCell(new Phrase(s8));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((mma+mmb+mmc+mmd+mmf+mmbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
												
						    				 
						    				 
						    				 
						    				 
						    			 }else if (rrrr.getString("class").matches("DARASA LA I") ){
						    				 
						    				 
						    				 String sm=String.format("MCHANGANUO WA MASOMO");
												cell2=new PdfPCell(new Phrase(sm));
												cell2.setHorizontalAlignment(1);
									            mudi2.addCell(cell2);
									            
									            String s0=String.format("*****");
												cell2=new PdfPCell(new Phrase(s0));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
									            mudi2.addCell(cell2);
									            
									           
									            
									            String s3=String.format(" %s","KISWAHILI:  A="+kka+"   B+="+kkbp+"   B="+kkb+"    C="+kkc+"   D="+kkd+"   F="+kkf);
												cell2=new PdfPCell(new Phrase(s3));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((kka+kkb+kkc+kkd+kkf+kkbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s4=String.format(" %s","ENGLISH:  A="+nna+"   B+="+nnbp+"   B="+nnb+"   C="+nnc+"   D="+nnd+"   F="+nnf);
												cell2=new PdfPCell(new Phrase(s4));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((nna+nnb+nnc+nnd+nnf+nnbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s5=String.format(" %s","KIARABU:  A="+ppa+"   B+="+ppbp+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   F="+ppf);
												cell2=new PdfPCell(new Phrase(s5));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((ppa+ppb+ppc+ppd+ppf+ppbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									          
									            String s8=String.format(" %s","HISABATI:  A="+mma+"   B+="+mmbp+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   F="+mmf);
												cell2=new PdfPCell(new Phrase(s8));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((mma+mmb+mmc+mmd+mmf+mmbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
												
						    				 
						    				 
						    				 
						    				 
						    			 }
						    			
						    		
						    		
						    		
						            
						    		
						    		
						    	}catch(Exception ex) {
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	}catch(Exception ex){
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	
						    	 try {
						     			String sqq="select count(id) from mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem()+"'";
						     			ps=con.prepareStatement(sqq);
						     			rs=ps.executeQuery();
						     			
						     			
						     			
						     			String sum=rs.getString("count(id)");
						     			String s=String.format(" %s","JUMLA YA WANAFUNZI="+sum+":  VIZURI SANA="+count1+":  VIZURI="+(count2+count3)+":  WASTANI="+count4+":  DHAIFU="+count0+":  MBAYA SANA="+count6+":  WASIOKAMILISHA="+count5);
						     			cell1=new PdfPCell(new Phrase(s));
						     			cell1.setHorizontalAlignment(1);
						     			mudi.setWidthPercentage(105);mudi1.setWidthPercentage(105);
						                 mudi1.addCell(cell1);
						     			
						     		}catch(Exception ex) {
						     			JOptionPane.showMessageDialog(null, ex.getMessage());
						     		}

						    	
						    	 
						    	 
						    	 
                       
						    try {
						    	
						    	
						    	 DefaultPieDataset pie=new DefaultPieDataset();
					   			 pie.setValue("VIZURI SANA", new Double(count1));
					   			 pie.setValue("VIZURI", new Double(count2+count3));
					   			 pie.setValue("WASTANI", new Double(count4));
					   			 pie.setValue("DHAIFU", new Double(count0));
					   			 pie.setValue("MBAYA SANA", new Double(count6));
						
				   			         JFreeChart chart=ChartFactory.createPieChart("Graph Report", pie, true, true,true);
									ChartFrame frame=new ChartFrame("Pie Chart",chart);
									//chart.setBackgroundPaint(new Color(250,250,210));
									chart.getTitle().setPaint(Color.blue);
									chart.getTitle().setPaint(new Color(50,205,50));
									chart.getPlot().setBackgroundPaint(Color.WHITE);
									frame.setSize(750,350);
									chart.setBackgroundPaint(Color.white);
					
									
									
									 try {
											final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
							                final File file1=new File("chartt.png");
							              
							                ChartUtilities.saveChartAsPNG(file1, chart, 740, 300,info);
											} catch (IOException e) {
												e.printStackTrace();
											}
						    
						    	
						    	
						    
						    	
						    }catch(Exception ex) {
						    	JOptionPane.showMessageDialog(null, ex.getMessage());
						    }

						    PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf"));
							document.open();
							
						/*if( (jj.getSelectedItem().toString()).matches("FIDEL CASTRO") ) {
							Image im=Image.getInstance("fide.png");
							document .add(im);
						}else {}*/
						Image image=Image.getInstance("Chartt.png");
						Image img=Image.getInstance("barcode.png");
						document.add(mudi23);
						
						//document.add(new Paragraph("DATE:              \t\t"+dt.format(timer.getTime())));
						//document.add(new Paragraph("TIME:               \t\t"+df.format(timer.getTime())));
						
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(mudi);
						document.add(new Paragraph("\n"));
						document.add(mudi2);
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						//document.add(new Paragraph("\n"));
						document.add(image);
						document.add(new Paragraph("\n"));
				    //	document.add(img);
						//document.add(new Paragraph("                                                                                                                                                                         "+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						//document.add(new Paragraph("FIDEL CASTRO SECONDARY SCHOOL                "+et.getSelectedItem().toString()+"  EXAM RESULT                "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString() +"\n"+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )  ) );
						document.close();

						 JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
					      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf");
					      
						
	     				
	     				
	     			}else {
	     				JOptionPane.showMessageDialog(null, "No user with that Record !");
	     			}
	     			
			
			 
				} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				} 
				finally{
	  	             try{
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
				
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
			}
				
			}

	
		}});
	
	//////////////////////////////////////////////////////////////////
	
	clao.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
			
			int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			
			if(result==JOptionPane.OK_OPTION){
				
				if(jj.getSelectedItem() != null &&!((String) jj.getSelectedItem()).trim().isEmpty()&&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
					
				

				   	Document document=new Document(PageSize.A4.rotate());
					 Calendar timer=Calendar.getInstance();
					 timer.getTime();
					 SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
					 SimpleDateFormat dt=new SimpleDateFormat("MMM dd,  yyyy");
					 
				
				 
				try {

					

     				int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0,count6=0;
			    	int ppa=0,ppb=0,ppbp=0,ppc=0,ppd=0,ppf=0;
					int ggga=0,gggb=0,gggbp=0,gggc=0,gggd=0,gggf=0;
					int cca=0,ccb=0,ccbp=0,ccc=0,ccd=0,ccf=0;
					int bba=0,bbb=0,bbbp=0,bbc=0,bbd=0,bbf=0;
					int mma=0,mmb=0,mmbp=0,mmc=0,mmd=0,mmf=0;
					int dda=0,ddb=0,ddbp=0,ddc=0,ddd=0,ddf=0;
					int kka=0,kkb=0,kkbp=0,kkc=0,kkd=0,kkf=0;
					int nna=0,nnb=0,nnbp=0,nnc=0,nnd=0,nnf=0;
					int zza=0,zzb=0,zzbp=0,zzc=0,zzd=0,zzf=0;
					int za=0,zb=0,zbp=0,zc=0,zd=0,zf=0;
					
					
			    
			    	String count="select count(id) from mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"'  ";
	     			ps=con.prepareStatement(count);
	     			ResultSet rss=ps.executeQuery();
	     			
	     		
			    	    String sq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' ";
					 	ps=con.prepareStatement(sq);
					 	ResultSet rr=ps.executeQuery();
					 	
					 	String sq1="select * from mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' order by case when avg = 'Inc' then 1 else 0 end, avg DESC, cv DESC";
					 	ps=con.prepareStatement(sq1);
					 	ResultSet rrr=ps.executeQuery();
					 	
					 	String sq11="select * from mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' order by case when avg = 'Inc' then 1 else 0 end, avg DESC, cv DESC";
					 	ps=con.prepareStatement(sq11);
					 	ResultSet rrrr=ps.executeQuery();
					 	
					 	
					 	
					 	 String sg="select * from mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem()+"'";
					    ps=con.prepareStatement(sg);
					   ResultSet grs=ps.executeQuery();
					    	
					 	
					 	String p="";
					 
	     			int nam=Integer.parseInt(rss.getString("count(id)"));
	     			if(nam !=0) {
	     				
	     				 
						 PdfPTable mudi = new PdfPTable(36);
					     PdfPCell cell=new PdfPCell(new Phrase(""));
					     cell.setColspan(10);
					     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					     cell.setBackgroundColor(new BaseColor(240,230,140));
					     mudi.addCell(cell);
					     mudi.setWidths(new int[]{ 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
						    mudi.setWidthPercentage(100);					    
						    cell.setColspan(36);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
					     
					    
	      		    	 
	      		    	PdfPTable mudi23 = new PdfPTable(1);
					     PdfPCell cell23=new PdfPCell(new Phrase(""));
					     cell23.setColspan(4);
					     
					     mudi23.addCell(cell23);
					     mudi23.setWidthPercentage(105);
					     Image im=Image.getInstance("primary.png");
	      		    	 cell.setBorder(0);
	       		    	 mudi23.addCell(cell23);
	      		    	 mudi23.addCell(im);
	      		    	 
	      		    	 cell = new PdfPCell(new Phrase("\n", FontFactory.getFont("COURIER_BOLD", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						    mudi23.addCell(cell);
					     
	      		    	   cell = new PdfPCell(new Phrase(school+" PRIMARY SCHOOL", FontFactory.getFont("Arial", 25, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						   // cell.setColspan(4);
						    mudi23.addCell(cell);
						    
						    cell = new PdfPCell(new Phrase("MATOKEO YA  "+et.getSelectedItem().toString()+"\n"+jj.getSelectedItem().toString(), FontFactory.getFont("Arial", 20, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						   // cell.setColspan(4);
						    mudi23.addCell(cell);
						    
						    cell = new PdfPCell(new Phrase(ct.getSelectedItem().toString()+" - "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 20, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						   // cell.setColspan(4);
						    mudi23.addCell(cell);
						    
						   if(ct.getSelectedItem().equals("DARASA LA V") || ct.getSelectedItem().equals("DARASA LA VI")) {
							   
							   cell = new PdfPCell(new Phrase("JINA KAMILI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(8);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JINSIA",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("URAIA",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("GEO",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DINI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("KISWAHILI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ENGLISH",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("SAYANSI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HISABATI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("KIARABU",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HISTORIA",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ICT",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JUMLA",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("WAST",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DAR",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("NAF",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9,Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    

							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							   
							 
						   }else if(ct.getSelectedItem().equals("DARASA LA II") || ct.getSelectedItem().equals("DARASA LA III") || ct.getSelectedItem().equals("DARASA LA IV")) {
							   
							   cell = new PdfPCell(new Phrase("JINA KAMILI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(12);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JINSIA",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("S/JAMII",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DINI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("KISW",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ENG",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("SAY",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HES",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ARABIC",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							
							    cell = new PdfPCell(new Phrase("JUMLA",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("WAST",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DAR",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("NAFASI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							 
							   
							   
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9,Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							   
							 
						   }else if(ct.getSelectedItem().equals("DARASA LA I") ) {
							 
							   
							   
							   cell = new PdfPCell(new Phrase("JINA KAMILI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(10);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JINSIA",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							    
							   
							    cell = new PdfPCell(new Phrase("KISWAHILI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(4);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ENGLISH",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(4);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HISABATI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(4);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("KIARABU",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(4);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							
							    cell = new PdfPCell(new Phrase("JUMLA",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("WAST",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DAR",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("NAFASI",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							 
							   
							   
							 
							    cell = new PdfPCell(new Phrase("ALAMA",FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DARAJA",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("ALAMA",FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DARAJA",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							   
							    cell = new PdfPCell(new Phrase("ALAMA",FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DARAJA",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ALAMA",FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DARAJA",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							   
							 
						   }
						    
						   
						    
						     PdfPTable mudi1 = new PdfPTable(1);
						     PdfPCell cell1=new PdfPCell(new Phrase("."));
						     cell1.setColspan(4);
						     cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
						     cell1.setBackgroundColor(new BaseColor(255,250,205));
						     mudi1.addCell(cell1);
						     
						     
						     PdfPTable mudi2 = new PdfPTable(1);
						     PdfPCell cell2=new PdfPCell(new Phrase("."));
						     cell2.setColspan(4);
						     cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
						     cell2.setBackgroundColor(new BaseColor(240,230,140));
						     mudi2.addCell(cell2);
						     mudi2.setHorizontalAlignment(1);
						 
					 
						     String a="";
						     
						    	try {
						    		
						    		while(rr.next()) {
						    			 a=rr.getString("rank");
						    				
						    	
						    			String fn=rr.getString("first");
							    		String ln=rr.getString("last");
						                String gn=rr.getString("gender");
						               
									    
							            if(rr.getString("class").matches("DARASA LA V")  ||  rr.getString("class").matches("DARASA LA VI")) {

							                cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(8);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 8, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    

						                	String cv=rr.getString("cv");
								          	String gcv=rr.getString("gcv");
								          	String geo=rr.getString("geo");
								          	String ggeo=rr.getString("ggeo");
								          	String dini=rr.getString("dini");
								          	String gdini=rr.getString("gdini");
								          	String kiswa=rr.getString("kisw");
								          	String gkiswa=rr.getString("gkisw");
								          	String engl=rr.getString("eng");
								          	String gengl=rr.getString("geng");
							           	    String sc=rr.getString("sc");
							           	    String gsc=rr.getString("gsc");
							           	    String math=rr.getString("math");
							           	    String gmath=rr.getString("gmath");
							           	    String ara=rr.getString("ara");
							           	    String gara=rr.getString("gara");
							             	String his=rr.getString("his");
							           	    String ghis=rr.getString("ghis");
							            	String it=rr.getString("it");
							           	    String git=rr.getString("git");
							            
							            	 cell = new PdfPCell(new Phrase(cv,FontFactory.getFont("serif", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gcv,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(geo,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggeo,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(dini,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gdini,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(kiswa,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gkiswa,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(engl,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gengl,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(sc,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gsc,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ara,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gara,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(his,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ghis,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(it,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(git,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    
										    
										   
										    String sum=rr.getString("sum");
									     	 String sm;
									     	 if(sum.matches("Inc")) {
									     		 sm="Inc";
									     	 }else {
									     		 sm=String.format("%.2f",Double.parseDouble(sum));
									     	 }
									     	 
									     	 cell = new PdfPCell(new Phrase(sm,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(2);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
							                
							   					  
							                      String ave=rr.getString("avg");
											     	 String av;
											     	 if(ave.matches("Inc")) {
											     		 av="Inc";
											     	 }else {
											     		 av=String.format("%.2f",Double.parseDouble(ave));
											     	 }
											     	 
											     	 cell = new PdfPCell(new Phrase(av,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
													    cell.setColspan(2);
													   cell.setHorizontalAlignment(1);
													    mudi.addCell(cell);
									                
							                      if(rr.getString("avg").matches("Inc")) {
										    			p="Inc";
										    		}else {
										    			double mark=Double.parseDouble(rr.getString("avg"));
											    		
											    		if(mark>=grd1 && mark<=grd2) {
											    			p="A";
											    		}else if(mark>=grd3 && mark< grd4) {
											    			p="B+";
											    		}else if(mark>=grd5 && mark< grd6) {
											    			p="B";
											    		}
											    		else if(mark>= grd7 && mark< grd8) {
											    			p="C";
											    		}else if(mark>= grd9 && mark< grd10) {
											    			p="D";
										    		}else if(mark>= grd11 && mark< grd12) {
										    			p="F";
									    		}
									    		
										    		
										    		}
							                      
							                      cell = new PdfPCell(new Phrase(p,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(1);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
							                      
												    cell = new PdfPCell(new Phrase(a+"",FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(1);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
										    
							            
							            }
							            
							            if(rr.getString("class").matches("DARASA LA II")  ||  rr.getString("class").matches("DARASA LA III") ||  rr.getString("class").matches("DARASA LA IV")) {
							            
								          	String geo=rr.getString("geo");
								          	String ggeo=rr.getString("ggeo");
								          	String dini=rr.getString("dini");
								          	String gdini=rr.getString("gdini");
								          	String kiswa=rr.getString("kisw");
								          	String gkiswa=rr.getString("gkisw");
								          	String engl=rr.getString("eng");
								          	String gengl=rr.getString("geng");
							           	    String sc=rr.getString("sc");
							           	    String gsc=rr.getString("gsc");
							           	    String math=rr.getString("math");
							           	    String gmath=rr.getString("gmath");
							           	    String ara=rr.getString("ara");
							           	    String gara=rr.getString("gara");
							           	    

							                cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(12);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    
							           
										    cell = new PdfPCell(new Phrase(geo,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggeo,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(dini,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gdini,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(kiswa,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gkiswa,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(engl,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gengl,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(sc,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gsc,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ara,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gara,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(1);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										   
										   
										    
										    String sum=rr.getString("sum");
									     	 String sm;
									     	 if(sum.matches("Inc")) {
									     		 sm="Inc";
									     	 }else {
									     		 sm=String.format("%.2f",Double.parseDouble(sum));
									     	 }
									     	 
									     	 cell = new PdfPCell(new Phrase(sm,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(2);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
							                
							   					  
							                      String ave=rr.getString("avg");
											     	 String av;
											     	 if(ave.matches("Inc")) {
											     		 av="Inc";
											     	 }else {
											     		 av=String.format("%.2f",Double.parseDouble(ave));
											     	 }
											     	 
											     	 cell = new PdfPCell(new Phrase(av,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
													    cell.setColspan(2);
													   cell.setHorizontalAlignment(1);
													    mudi.addCell(cell);
									                
							                      if(rr.getString("avg").matches("Inc")) {
										    			p="Inc";
										    		}else {
										    			double mark=Double.parseDouble(rr.getString("avg"));
											    		
											    		if(mark>=grd1 && mark<=grd2) {
											    			p="A";
											    		}else if(mark>=grd3 && mark< grd4) {
											    			p="B+";
											    		}else if(mark>=grd5 && mark< grd6) {
											    			p="B";
											    		}
											    		else if(mark>= grd7 && mark< grd8) {
											    			p="C";
											    		}else if(mark>= grd9 && mark< grd10) {
											    			p="D";
										    		}else if(mark>= grd11 && mark< grd12) {
										    			p="F";
									    		}
									    		
										    		
										    		}
							                      
							                      cell = new PdfPCell(new Phrase(p,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(2);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
							                      
												    cell = new PdfPCell(new Phrase(a+"",FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(2);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
										    
							            	
							            }
							            
							            if( rr.getString("class").matches("DARASA LA I")) {
								            
								          	
								          	String kiswa=rr.getString("kisw");
								          	String gkiswa=rr.getString("gkisw");
								          	String engl=rr.getString("eng");
								          	String gengl=rr.getString("geng");
							           	    String math=rr.getString("math");
							           	    String gmath=rr.getString("gmath");
							           	    String ara=rr.getString("ara");
							           	    String gara=rr.getString("gara");
							             	
							           	 cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(10);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										   
										    cell = new PdfPCell(new Phrase(kiswa,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gkiswa,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(engl,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gengl,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										   
										    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ara,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gara,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
										    cell.setColspan(2);
										   cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										   
										   
										    String sum=rr.getString("sum");
									     	 String sm;
									     	 if(sum.matches("Inc")) {
									     		 sm="Inc";
									     	 }else {
									     		 sm=String.format("%.2f",Double.parseDouble(sum));
									     	 }
									     	 
									     	 cell = new PdfPCell(new Phrase(sm,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(2);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
							                
							   					  
							                      String ave=rr.getString("avg");
											     	 String av;
											     	 if(ave.matches("Inc")) {
											     		 av="Inc";
											     	 }else {
											     		 av=String.format("%.2f",Double.parseDouble(ave));
											     	 }
											     	 
											     	 cell = new PdfPCell(new Phrase(av,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
													    cell.setColspan(2);
													   cell.setHorizontalAlignment(1);
													    mudi.addCell(cell);
									                
							                      if(rr.getString("avg").matches("Inc")) {
										    			p="Inc";
										    		}else {
										    			double mark=Double.parseDouble(rr.getString("avg"));
											    		
											    		if(mark>=grd1 && mark<=grd2) {
											    			p="A";
											    		}else if(mark>=grd3 && mark< grd4) {
											    			p="B+";
											    		}else if(mark>=grd5 && mark< grd6) {
											    			p="B";
											    		}
											    		else if(mark>= grd7 && mark< grd8) {
											    			p="C";
											    		}else if(mark>= grd9 && mark< grd10) {
											    			p="D";
										    		}else if(mark>= grd11 && mark< grd12) {
										    			p="F";
									    		}
									    		
										    		
										    		}
							                      
							                      cell = new PdfPCell(new Phrase(p,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(2);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
							                      
												    cell = new PdfPCell(new Phrase(a+"",FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
												    cell.setColspan(2);
												   cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
							                      
										    
							            	
							            }
							           
						                   
						    			
						    		}
						    		
						    		
						    		
						    	
						    	while(rrr.next()) {
						    		
						    		if(rrr.getString("avg").matches("Inc")) {
						    			count5++;
						    			
						    		}else {
						    			double mark=Double.parseDouble(rrr.getString("avg"));
							    		
							    		if(mark>=grd1 && mark<=grd2) {
							    			count1++;
							    		}else if(mark>=grd3 && mark<grd4) {
							    			count2=count2+1;
							    		}else if(mark>=grd5 && mark<grd6) {
							    			count3++;
							    		}
							    		else if(mark>=grd7 && mark<grd8) {
							    			count4++;
							    		}else if(mark>=grd9 && mark<grd10) {
							    			count0++;
							    			
							    		}
							    		else if(mark>=grd11 && mark<grd12) {
							    			count6++;
							    			
							    		
							    		}
						    
							    		
						    		}
						    		}
						    	
						    	
						    	try {
						    		
						    		
						    		while(grs.next()) {
						    			
						    			 if(grs.getString("gcv") != null) {
								    			
							                 String mg=grs.getString("gcv");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         ggga++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   gggbp++;
							   			   	}else if(mg.equals("B")) {
									   	    	   gggb++;
									   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   gggc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   gggd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   gggf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("ggeo") != null) {
								    			
							                 String mg=grs.getString("ggeo");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         bba++;
							   	    		}
							   	    		else if(mg.equals("B+")) {
							   			    	   bbbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   bbb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   bbc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   bbd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   bbf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("gdini") != null) {
								    			
							                 String mg=grs.getString("gdini");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         dda++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   ddbp++;
							   			    }else if(mg.equals("B")) {
									   			   ddb++;
									   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   ddc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   ddd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   ddf++;
							   			    		}
								    		
							    		 }
						    			 
						    			 if(grs.getString("gkisw") != null) {
								    			
							                 String mg=grs.getString("gkisw");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         kka++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   kkbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   kkb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   kkc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   kkd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   kkf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("geng") != null) {
								    			
							                 String mg=grs.getString("geng");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         nna++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   nnbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   nnb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   nnc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   nnd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   nnf++;
							   			    		}
						    			 }
						    			 if(grs.getString("gara") != null) {
								    			
							                 String mg=grs.getString("gara");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         ppa++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   ppbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   ppb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   ppc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   ppd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   ppf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("ghis") != null) {
								    			
							                 String mg=grs.getString("ghis");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         cca++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   ccbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   ccb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   ccc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   ccd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   ccf++;
							   			    		}
						    			 }
						    			
						    			 
						    			 if(grs.getString("gsc") != null) {
								    			
							                 String mg=grs.getString("gsc");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         zza++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   zzbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   zzb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   zzc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   zzd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   zzf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("git") != null) {
								    			
							                 String mg=grs.getString("git");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         za++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   zbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   zb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   zc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   zd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   zf++;
							   			    		}
						    			 }
						    			
						    			 if(grs.getString("gmath") != null) {
								    			
							                 String mg=grs.getString("gmath");
							   	    		
							   	    		if(mg.equals("A")) {
							   	    	         mma++;
							   	    		}else if(mg.equals("B+")) {
							   			    	   mmbp++;
							   			    		}
							   	    		else if(mg.equals("B")) {
							   			    	   mmb++;
							   			    		}
							   	    		else if(mg.equals("C")) {
							   			    	   mmc++;
							   			    		}
							   	    		else if(mg.equals("D")) {
							   			    	   mmd++;
							   			    		}
							   	    		else if(mg.equals("F")) {
							   			    	   mmf++;
							   			    		}
						    			 }
						    			
						    		}
						    		
						    
						    			
						    			 if(rrrr.getString("class").matches("DARASA LA V")  ||  rrrr.getString("class").matches("DARASA LA VI")) {
						    				 
						    				 
						    				    String sm=String.format("MCHANGANUO WA MASOMO");
												cell2=new PdfPCell(new Phrase(sm));
												cell2.setHorizontalAlignment(1);
												mudi2.setWidthPercentage(70);
									            mudi2.addCell(cell2);
									            
									            String s0=String.format("*****");
												cell2=new PdfPCell(new Phrase(s0));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
									            mudi2.addCell(cell2);
									            
									    	 
									        	 String s=String.format(" %s","URAIA:  A="+ggga+"   B+="+gggbp+"   B="+gggb+"   C="+gggc+"   D="+gggd+"      F="+gggf);
												cell2=new PdfPCell(new Phrase(s));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((ggga+gggb+gggc+gggd+gggf+gggbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									          
									           
									            
									            String s1=String.format(" %s","GEOGRAPHY:  A="+bba+"   B+="+bbbp+"   B="+bbb+"   C="+bbc+"   D="+bbd+"   F="+bbf);
												cell2=new PdfPCell(new Phrase(s1));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((bba+bbb+bbc+bbd+bbf+bbbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s2=String.format(" %s","DINI:  A="+dda+"   B+="+ddbp+"   B="+ddb+"     C="+ddc+"   D="+ddd+"   F="+ddf);
												cell2=new PdfPCell(new Phrase(s2));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((dda+ddb+ddc+ddd+ddf+ddbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									            
									            String s3=String.format(" %s","KISWAHILI:  A="+kka+"   B+="+kkbp+"   B="+kkb+"    C="+kkc+"   D="+kkd+"   F="+kkf);
												cell2=new PdfPCell(new Phrase(s3));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((kka+kkb+kkc+kkd+kkf+kkbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s4=String.format(" %s","ENGLISH:  A="+nna+"   B+="+nnbp+"   B="+nnb+"   C="+nnc+"   D="+nnd+"   F="+nnf);
												cell2=new PdfPCell(new Phrase(s4));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((nna+nnb+nnc+nnd+nnf+nnbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s5=String.format(" %s","ARABIC:  A="+ppa+"   B+="+ppbp+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   F="+ppf);
												cell2=new PdfPCell(new Phrase(s5));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((ppa+ppb+ppc+ppd+ppf+ppbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									            String s6=String.format(" %s","HISTORY:  A="+cca+"   B+="+ccbp+"   B="+ccb+"   C="+ccc+"   D="+ccd+"   F="+ccf);
												cell2=new PdfPCell(new Phrase(s6));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((cca+ccb+ccc+ccd+ccf+ccbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s7=String.format(" %s","SCIENCE:  A="+zza+"   B+="+zzbp+"   B="+zzb+"   C="+zzc+"   D="+zzd+"   F="+zzf);
												cell2=new PdfPCell(new Phrase(s7));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((zza+zzb+zzc+zzd+zzf+zzbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s8=String.format(" %s","B/MATH:  A="+mma+"   B+="+mmbp+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   F="+mmf);
												cell2=new PdfPCell(new Phrase(s8));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((mma+mmb+mmc+mmd+mmf+mmbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
												String s9=String.format(" %s","ICT:  A="+za+"   B+="+zbp+"   B="+zb+"   C="+zc+"   D="+zd+"   F="+zf);
												cell2=new PdfPCell(new Phrase(s9));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((za+zb+zc+zd+zf+zbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
						    				 
						    			 }else if (rrrr.getString("class").matches("DARASA LA II")  ||  rrrr.getString("class").matches("DARASA LA III") ||  rrrr.getString("class").matches("DARASA LA IV")){
						    				 
						    				 
						    				 
						    				 
						    				 String sm=String.format("MCHANGANUO WA MASOMO");
												cell2=new PdfPCell(new Phrase(sm));
												cell2.setHorizontalAlignment(1);
												mudi2.setWidthPercentage(70);
									            mudi2.addCell(cell2);
									            
									            String s0=String.format("*****");
												cell2=new PdfPCell(new Phrase(s0));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
									            mudi2.addCell(cell2);
									            
									    	 
									        	
									            
									            String s1=String.format(" %s","S / JAMII:  A="+bba+"   B+="+bbbp+"   B="+bbb+"   C="+bbc+"   D="+bbd+"   F="+bbf);
												cell2=new PdfPCell(new Phrase(s1));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((bba+bbb+bbc+bbd+bbf+bbbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s2=String.format(" %s","DINI:  A="+dda+"   B+="+ddbp+"   B="+ddb+"     C="+ddc+"   D="+ddd+"   F="+ddf);
												cell2=new PdfPCell(new Phrase(s2));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((dda+ddb+ddc+ddd+ddf+ddbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									            
									            String s3=String.format(" %s","KISWAHILI:  A="+kka+"   B+="+kkbp+"   B="+kkb+"    C="+kkc+"   D="+kkd+"   F="+kkf);
												cell2=new PdfPCell(new Phrase(s3));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((kka+kkb+kkc+kkd+kkf+kkbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s4=String.format(" %s","ENGLISH:  A="+nna+"   B+="+nnbp+"   B="+nnb+"   C="+nnc+"   D="+nnd+"   F="+nnf);
												cell2=new PdfPCell(new Phrase(s4));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((nna+nnb+nnc+nnd+nnf+nnbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s5=String.format(" %s","KIARABU:  A="+ppa+"   B+="+ppbp+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   F="+ppf);
												cell2=new PdfPCell(new Phrase(s5));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((ppa+ppb+ppc+ppd+ppf+ppbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									          
									            
									            String s7=String.format(" %s","SAYANSI:  A="+zza+"   B+="+zzbp+"   B="+zzb+"   C="+zzc+"   D="+zzd+"   F="+zzf);
												cell2=new PdfPCell(new Phrase(s7));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((zza+zzb+zzc+zzd+zzf+zzbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s8=String.format(" %s","HISABATI:  A="+mma+"   B+="+mmbp+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   F="+mmf);
												cell2=new PdfPCell(new Phrase(s8));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((mma+mmb+mmc+mmd+mmf+mmbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
												
						    				 
						    				 
						    				 
						    				 
						    			 }else if (rrrr.getString("class").matches("DARASA LA I") ){
						    				 
						    				 
						    				 String sm=String.format("MCHANGANUO WA MASOMO");
												cell2=new PdfPCell(new Phrase(sm));
												cell2.setHorizontalAlignment(1);
									            mudi2.addCell(cell2);
									            
									            String s0=String.format("*****");
												cell2=new PdfPCell(new Phrase(s0));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
									            mudi2.addCell(cell2);
									            
									           
									            
									            String s3=String.format(" %s","KISWAHILI:  A="+kka+"   B+="+kkbp+"   B="+kkb+"    C="+kkc+"   D="+kkd+"   F="+kkf);
												cell2=new PdfPCell(new Phrase(s3));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((kka+kkb+kkc+kkd+kkf+kkbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s4=String.format(" %s","ENGLISH:  A="+nna+"   B+="+nnbp+"   B="+nnb+"   C="+nnc+"   D="+nnd+"   F="+nnf);
												cell2=new PdfPCell(new Phrase(s4));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((nna+nnb+nnc+nnd+nnf+nnbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									            
									            String s5=String.format(" %s","KIARABU:  A="+ppa+"   B+="+ppbp+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   F="+ppf);
												cell2=new PdfPCell(new Phrase(s5));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((ppa+ppb+ppc+ppd+ppf+ppbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
									    		
									          
									            String s8=String.format(" %s","HISABATI:  A="+mma+"   B+="+mmbp+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   F="+mmf);
												cell2=new PdfPCell(new Phrase(s8));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(70);
												if((mma+mmb+mmc+mmd+mmf+mmbp)>0) {
													 mudi2.addCell(cell2); 
									    		}
												
						    				 
						    				 
						    				 
						    				 
						    			 }
						    			
						    		
						    		
						    		
						            
						    		
						    		
						    	}catch(Exception ex) {
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	}catch(Exception ex){
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	
						    	 try {
						     			String sqq="select count(id) from mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem()+"'";
						     			ps=con.prepareStatement(sqq);
						     			rs=ps.executeQuery();
						     			
						     			
						     			
						     			String sum=rs.getString("count(id)");
						     			String s=String.format(" %s","JUMLA YA WANAFUNZI="+sum+":  VIZURI SANA="+count1+":  VIZURI="+(count2+count3)+":  WASTANI="+count4+":  DHAIFU="+count0+":  MBAYA SANA="+count6+":  WASIOKAMILISHA="+count5);
						     			cell1=new PdfPCell(new Phrase(s));
						     			cell1.setHorizontalAlignment(1);
						     			mudi.setWidthPercentage(105);mudi1.setWidthPercentage(105);
						                 mudi1.addCell(cell1);
						     			
						     		}catch(Exception ex) {
						     			JOptionPane.showMessageDialog(null, ex.getMessage());
						     		}

						    	
						    	 
						    	 
						    	 
                       
						    try {
						    	
						    	
						    	 DefaultPieDataset pie=new DefaultPieDataset();
					   			 pie.setValue("VIZURI SANA", new Double(count1));
					   			 pie.setValue("VIZURI", new Double(count2+count3));
					   			 pie.setValue("WASTANI", new Double(count4));
					   			 pie.setValue("DHAIFU", new Double(count0));
					   			 pie.setValue("MBAYA SANA", new Double(count6));
						
				   			         JFreeChart chart=ChartFactory.createPieChart("Graph Report", pie, true, true,true);
									ChartFrame frame=new ChartFrame("Pie Chart",chart);
									//chart.setBackgroundPaint(new Color(250,250,210));
									chart.getTitle().setPaint(Color.blue);
									chart.getTitle().setPaint(new Color(50,205,50));
									chart.getPlot().setBackgroundPaint(Color.WHITE);
									frame.setSize(750,350);
									chart.setBackgroundPaint(Color.white);
					
									
									
									 try {
											final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
							                final File file1=new File("chartt.png");
							              
							                ChartUtilities.saveChartAsPNG(file1, chart, 740, 300,info);
											} catch (IOException e) {
												e.printStackTrace();
											}
						    
						    	
						    	
						    
						    	
						    }catch(Exception ex) {
						    	JOptionPane.showMessageDialog(null, ex.getMessage());
						    }

						    PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf"));
							document.open();
							
						/*if( (jj.getSelectedItem().toString()).matches("FIDEL CASTRO") ) {
							Image im=Image.getInstance("fide.png");
							document .add(im);
						}else {}*/
						Image image=Image.getInstance("Chartt.png");
						Image img=Image.getInstance("barcode.png");
						document.add(mudi23);
						
						//document.add(new Paragraph("DATE:              \t\t"+dt.format(timer.getTime())));
						//document.add(new Paragraph("TIME:               \t\t"+df.format(timer.getTime())));
						
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(mudi);
						document.add(new Paragraph("\n"));
						document.add(mudi2);
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						//document.add(new Paragraph("\n"));
						document.add(image);
						document.add(new Paragraph("\n"));
				    //	document.add(img);
						//document.add(new Paragraph("                                                                                                                                                                         "+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						//document.add(new Paragraph("FIDEL CASTRO SECONDARY SCHOOL                "+et.getSelectedItem().toString()+"  EXAM RESULT                "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString() +"\n"+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )  ) );
						document.close();

						 JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
					      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf");
					      
						
	     				
	     				
	     			}else {
	     				JOptionPane.showMessageDialog(null, "No user with that Record !");
	     			}
	     			
			
			 
				} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				} 
				finally{
	  	             try{
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
				
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
			}
				
			}

	
		}});
	
	
	
	exp.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
				        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
					
				if(result==JOptionPane.OK_OPTION ){
					
					if(jj.getSelectedItem() != null &&!((String) jj.getSelectedItem()).trim().isEmpty()&&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
						
						    String a="";String p="";
						    String count="select count(id) from mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' ";
							ps=con.prepareStatement(count);
							ResultSet rss=ps.executeQuery();
							
							String sqqq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' ";
					    	ps=con.prepareStatement(sqqq);
					    	rs=ps.executeQuery();
			
					    	String sq1="select * from mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' order by case when avg = 'Inc' then 1 else 0 end, avg DESC, cv DESC";
						 	ps=con.prepareStatement(sq1);
						 	ResultSet rrr=ps.executeQuery();
						 	
					    	
					    	 int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0,count6=0;
					    	 
					    	 int nam=Integer.parseInt(rss.getString("count(id)"));
					    	 
								if(nam !=0) {
									
									while(rrr.next()) {
										
							    		
							    		if(rrr.getString("avg").matches("Inc")) {
							    			count5++;
							    			
							    		}else {
							    			double mark=Double.parseDouble(rrr.getString("avg"));
								    		
								    		if(mark>=grd1 && mark<=grd2) {
								    			count1++;
								    		}else if(mark>=grd3 && mark<grd4) {
								    			count2=count2+1;
								    		}else if(mark>=grd5 && mark<grd6) {
								    			count3++;
								    		}
								    		else if(mark>=grd7 && mark<grd8) {
								    			count4++;
								    		}else if(mark>=grd9 && mark<grd10) {
								    			count0++;
								    		}
								    		else if(mark>=grd11 && mark<grd12) {
								    			count6++;
								    		}
							    
								    		
							    		}
							    		}
									
									 XSSFWorkbook workbook = new XSSFWorkbook(); 
								      XSSFSheet spreadsheet = workbook.createSheet("STUDENT'S REPORT");
									 XSSFRow row = spreadsheet.createRow(1);
								     XSSFCell cell = (XSSFCell) row.createCell((short) 1);
								     
								     String sum=rss.getString("count(id)");
						     		 String s=String.format(" %s"," JUMLA YA WANAFUNZI="+sum+":  VIZURI SANA="+count1+":  VIZURI="+(count2+count3)+":  WASTANI="+count4+":  DHAIFU="+count0+":  MBAYA SANA="+count6+":  WASIOKAMILISHA="+count5);
						     			
									
						     			
								      XSSFCellStyle style3 = workbook.createCellStyle();
								      XSSFFont font = workbook.createFont();
								      font.setFontHeightInPoints((short) 20);
								      font.setFontName("VERDANA");
								      font.setBold(true);
								      XSSFCellStyle style = workbook.createCellStyle();
								      style.setFont(font);
								  
								      cell.setCellStyle(style3);
								      row = spreadsheet.createRow(2);
								      cell = (XSSFCell) row.createCell(1);
								      cell.setCellValue("                              "+school+" PRIMARY SCHOOL");
								      cell.setCellStyle(style);
								      
								      XSSFFont font1 = workbook.createFont();
								      font1.setFontHeightInPoints((short) 12);
								      font1.setFontName("VERDANA");
								     // font1.setBold(true);
								      XSSFCellStyle style1 = workbook.createCellStyle();
								      style1.setFont(font1);
								  
								  
								     // cell.setCellStyle(style3);
								      row = spreadsheet.createRow(4);
								      cell = (XSSFCell) row.createCell(1);
								      cell.setCellValue(" MATOKEO YA "+et.getSelectedItem().toString()+""+"         "+ct.getSelectedItem().toString()+"                        "+jj.getSelectedItem().toString()+" - "+ac.getSelectedItem().toString());
								      cell.setCellStyle(style1);
								      
								      XSSFFont font2 = workbook.createFont();
								      font2.setFontHeightInPoints((short) 10);
								      font2.setFontName("VERDANA");
								     // font1.setBold(true);
								      XSSFCellStyle style2 = workbook.createCellStyle();
								      style2.setFont(font2);
								      row = spreadsheet.createRow(5);
								      cell = (XSSFCell) row.createCell(1);
								      cell.setCellValue(s);
								      cell.setCellStyle(style2);
								      
								      row = spreadsheet.createRow(8);
								      cell = row.createCell(0);
								      cell.setCellValue("STU ID");
								      cell = row.createCell(1);
								      cell.setCellValue("JINA KAMILI");
								      cell = row.createCell(2);
								      cell.setCellValue("JINSIA");
								      cell = row.createCell(3);
								      cell.setCellValue("MCHANGANUO WA MASOMO");
								      cell = row.createCell(4);
								      cell.setCellValue("JUMLA");
								      cell = row.createCell(5);
								      cell.setCellValue("WASTANI");
								      cell = row.createCell(6);
								      cell.setCellValue("ALAMA");
								      cell = row.createCell(7);
								      cell.setCellValue("NAFASI");
								    
								      int i = 9;
							
								    while(rs.next()) {
								    	
								    	a=rs.getString("rank");
									 //String m=rs.getString("id");
									 row = spreadsheet.createRow(i);
							         cell = row.createCell(0);
							         cell.setCellValue(rs.getString("id"));
							         cell = row.createCell(1);
							         cell.setCellValue(rs.getString("first")+ "  " +rs.getString("last"));
							         cell = row.createCell(2);
							         cell.setCellValue(rs.getString("gender"));
							         
							         if(rs.getString("class").matches("DARASA LA V")  ||  rs.getString("class").matches("DARASA LA VI")) {
							        	 

								            String cv=rs.getString("cv");
								          	String gcv=rs.getString("gcv");
								          	String geo=rs.getString("geo");
								          	String ggeo=rs.getString("ggeo");
								          	String dini=rs.getString("dini");
								          	String gdini=rs.getString("gdini");
								          	String kiswa=rs.getString("kisw");
								          	String gkiswa=rs.getString("gkisw");
								          	String engl=rs.getString("eng");
								          	String gengl=rs.getString("geng");
							           	    String sc=rs.getString("sc");
							           	    String gsc=rs.getString("gsc");
							           	    String math=rs.getString("math");
							           	    String gmath=rs.getString("gmath");
							           	    String ara=rs.getString("ara");
							           	    String gara=rs.getString("gara");
							             	String his=rs.getString("his");
							           	    String ghis=rs.getString("ghis");
							            	 String it=rs.getString("it");
							           	    String git=rs.getString("git");
								            
								              cell = row.createCell(3);
									          cell.setCellValue("CIV:"+cv+" "+gcv+" GEO:"+geo+" "+ggeo+" DINI:"+dini+" "+gdini+" KISWA:"+kiswa+" "+gkiswa+" ENGL:"+engl+" "+gengl+" SCI:"+sc+" "+gsc+" ARA:"+ara+" "+gara+" HIS:"+his+" "+ghis+" MATH:"+math+" "+gmath+" ICT:"+it+" "+git);
									          
							        	 
							         }
							         else  if(rs.getString("class").matches("DARASA LA II")  ||  rs.getString("class").matches("DARASA LA II") ||  rs.getString("class").matches("DARASA LA III")  ) {
							        	
								          	String geo=rs.getString("geo");
								          	String ggeo=rs.getString("ggeo");
								          	String dini=rs.getString("dini");
								          	String gdini=rs.getString("gdini");
								          	String kiswa=rs.getString("kisw");
								          	String gkiswa=rs.getString("gkisw");
								          	String engl=rs.getString("eng");
								          	String gengl=rs.getString("geng");
							           	    String sc=rs.getString("sc");
							           	    String gsc=rs.getString("gsc");
							           	    String math=rs.getString("math");
							           	    String gmath=rs.getString("gmath");
							           	    String ara=rs.getString("ara");
							           	    String gara=rs.getString("gara");
							             	
								              cell = row.createCell(3);
									          cell.setCellValue("S/JAMII:"+geo+" "+ggeo+" DINI:"+dini+" "+gdini+" KISWA:"+kiswa+" "+gkiswa+" ENGL:"+engl+" "+gengl+" SAY:"+sc+" "+gsc+" ARA:"+ara+" "+gara+" HIS:"+math+" "+gmath);
									          
							        	 
							         }
							         else  if(rs.getString("class").matches("DARASA LA I")   ) {
								        	
								          	
								          	String kiswa=rs.getString("kisw");
								          	String gkiswa=rs.getString("gkisw");
								          	String engl=rs.getString("eng");
								          	String gengl=rs.getString("geng");
							           	    String math=rs.getString("math");
							           	    String gmath=rs.getString("gmath");
							           	    String ara=rs.getString("ara");
							           	    String gara=rs.getString("gara");
							             	
								              cell = row.createCell(3);
									          cell.setCellValue("KISWAHILI:"+kiswa+" "+gkiswa+"  ENGLISH:"+engl+" "+gengl+"  HISABATI:"+math+" "+gmath+"  KIARABU:"+ara+" "+gara);
									          
							        	 
							         }
							         
							         String sam=rs.getString("sum");
							     	 String sm;
							     	 if(sam.matches("Inc")) {
							     		 sm="Inc";
							     	 }else {
							     		 sm=String.format("%.2f",Double.parseDouble(sam));
							     	 }
							     	 
							     	cell = row.createCell(4);
							          cell.setCellValue(sm);
							         
							         
								     	 String ave=rs.getString("avg");
								     	 String av;
								     	 if(ave.matches("Inc")) {
								     		 av="Inc";
								     	 }else {
								     		 av=String.format("%.2f",Double.parseDouble(ave));
								     	 }
								     	
								     	 cell = row.createCell(5);
								          cell.setCellValue(av);
								          
								          if(rs.getString("avg").matches("Inc")) {
								    			p="Inc";
								    		}else {
								    			double mark=Double.parseDouble(rs.getString("avg"));
									    		
									    		if(mark>=grd1 && mark<=grd2) {
									    			p="A";
									    		}else if(mark>=grd3 && mark<grd4) {
									    			p="B+";
									    		}
									    		else if(mark>=grd5 && mark<grd6) {
									    			p="B";
									    		}else if(mark>=grd7 && mark< grd8) {
									    			p="C";
									    		}
									    		else if(mark>=grd9 && mark<grd10) {
									    			p="D";
									    		}else if(mark>=grd11 && mark< grd12) {
									    			p="F";
								    		}
								    		
								    		}
								          
								          cell = row.createCell(6);
								          cell.setCellValue(p);
								          
								          
								     	 cell = row.createCell(7);
								          cell.setCellValue(a);
							         
							         i++;
							         
							         
						          
						      
						}
								
								 JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
							      FileOutputStream out = new FileOutputStream(new File(""+ct.getSelectedItem().toString().replaceAll("'", "''")+".xlsx"));
							      workbook.write(out);
							      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".xlsx");
							      out.close();
								
									
								}else {
									
									JOptionPane.showMessageDialog(null, "No user with that Record !");
								}
									
					    	 
					    	 
							
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
					}
					
						
					
				}
					   
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}finally{
 	             try{
  	                 rs.close();
  	                 ps.close();
  	             }catch(Exception ex){
  	                 ex.getMessage();
  	             }}
		}});
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	

	expo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
				        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
					
				if(result==JOptionPane.OK_OPTION ){
					
					if(jj.getSelectedItem() != null &&!((String) jj.getSelectedItem()).trim().isEmpty()&&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
						
						    String a="";String p="";
						    String count="select count(id) from mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' ";
							ps=con.prepareStatement(count);
							ResultSet rss=ps.executeQuery();
							
							String sqqq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' ";
					    	ps=con.prepareStatement(sqqq);
					    	rs=ps.executeQuery();
			
					    	String sq1="select * from mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' order by case when avg = 'Inc' then 1 else 0 end, avg DESC, cv DESC";
						 	ps=con.prepareStatement(sq1);
						 	ResultSet rrr=ps.executeQuery();
						 	
					    	
					    	 int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0,count6=0;
					    	 
					    	 int nam=Integer.parseInt(rss.getString("count(id)"));
					    	 
								if(nam !=0) {
									
									while(rrr.next()) {
										
							    		
							    		if(rrr.getString("avg").matches("Inc")) {
							    			count5++;
							    			
							    		}else {
							    			double mark=Double.parseDouble(rrr.getString("avg"));
								    		
								    		if(mark>=grd1 && mark<=grd2) {
								    			count1++;
								    		}else if(mark>=grd3 && mark<grd4) {
								    			count2=count2+1;
								    		}else if(mark>=grd5 && mark<grd6) {
								    			count3++;
								    		}
								    		else if(mark>=grd7 && mark<grd8) {
								    			count4++;
								    		}else if(mark>=grd9 && mark<grd10) {
								    			count0++;
								    		}
								    		else if(mark>=grd11 && mark<grd12) {
								    			count6++;
								    		}
							    
								    		
							    		}
							    		}
									
									 XSSFWorkbook workbook = new XSSFWorkbook(); 
								      XSSFSheet spreadsheet = workbook.createSheet("STUDENT'S REPORT");
									 XSSFRow row = spreadsheet.createRow(1);
								     XSSFCell cell = (XSSFCell) row.createCell((short) 1);
								     
								     String sum=rss.getString("count(id)");
						     		 String s=String.format(" %s"," JUMLA YA WANAFUNZI="+sum+":  VIZURI SANA="+count1+":  VIZURI="+(count2+count3)+":  WASTANI="+count4+":  DHAIFU="+count0+":  MBAYA SANA="+count6+":  WASIOKAMILISHA="+count5);
						     			
									
						     			
								      XSSFCellStyle style3 = workbook.createCellStyle();
								      XSSFFont font = workbook.createFont();
								      font.setFontHeightInPoints((short) 20);
								      font.setFontName("VERDANA");
								      font.setBold(true);
								      XSSFCellStyle style = workbook.createCellStyle();
								      style.setFont(font);
								  
								      cell.setCellStyle(style3);
								      row = spreadsheet.createRow(2);
								      cell = (XSSFCell) row.createCell(1);
								      cell.setCellValue("                              "+school+" PRIMARY SCHOOL");
								      cell.setCellStyle(style);
								      
								      XSSFFont font1 = workbook.createFont();
								      font1.setFontHeightInPoints((short) 12);
								      font1.setFontName("VERDANA");
								     // font1.setBold(true);
								      XSSFCellStyle style1 = workbook.createCellStyle();
								      style1.setFont(font1);
								  
								  
								     // cell.setCellStyle(style3);
								      row = spreadsheet.createRow(4);
								      cell = (XSSFCell) row.createCell(1);
								      cell.setCellValue(" MATOKEO YA "+et.getSelectedItem().toString()+""+"                               "+ct.getSelectedItem().toString()+" - "+ac.getSelectedItem().toString());
								      cell.setCellStyle(style1);
								      
								      XSSFFont font2 = workbook.createFont();
								      font2.setFontHeightInPoints((short) 10);
								      font2.setFontName("VERDANA");
								     // font1.setBold(true);
								      XSSFCellStyle style2 = workbook.createCellStyle();
								      style2.setFont(font2);
								      row = spreadsheet.createRow(5);
								      cell = (XSSFCell) row.createCell(1);
								      cell.setCellValue(s);
								      cell.setCellStyle(style2);
								      
								      row = spreadsheet.createRow(8);
								      cell = row.createCell(0);
								      cell.setCellValue("STU ID");
								      cell = row.createCell(1);
								      cell.setCellValue("JINA KAMILI");
								      cell = row.createCell(2);
								      cell.setCellValue("JINSIA");
								      cell = row.createCell(3);
								      cell.setCellValue("MCHANGANUO WA MASOMO");
								      cell = row.createCell(4);
								      cell.setCellValue("JUMLA");
								      cell = row.createCell(5);
								      cell.setCellValue("WASTANI");
								      cell = row.createCell(6);
								      cell.setCellValue("ALAMA");
								      cell = row.createCell(7);
								      cell.setCellValue("NAFASI");
								    
								      int i = 9;
							
								    while(rs.next()) {
								    	
								    	a=rs.getString("rank");
									 //String m=rs.getString("id");
									 row = spreadsheet.createRow(i);
							         cell = row.createCell(0);
							         cell.setCellValue(rs.getString("id"));
							         cell = row.createCell(1);
							         cell.setCellValue(rs.getString("first")+ "  " +rs.getString("last"));
							         cell = row.createCell(2);
							         cell.setCellValue(rs.getString("gender"));
							         
							         if(rs.getString("class").matches("DARASA LA V")  ||  rs.getString("class").matches("DARASA LA VI")) {
							        	 

								            String cv=rs.getString("cv");
								          	String gcv=rs.getString("gcv");
								          	String geo=rs.getString("geo");
								          	String ggeo=rs.getString("ggeo");
								          	String dini=rs.getString("dini");
								          	String gdini=rs.getString("gdini");
								          	String kiswa=rs.getString("kisw");
								          	String gkiswa=rs.getString("gkisw");
								          	String engl=rs.getString("eng");
								          	String gengl=rs.getString("geng");
							           	    String sc=rs.getString("sc");
							           	    String gsc=rs.getString("gsc");
							           	    String math=rs.getString("math");
							           	    String gmath=rs.getString("gmath");
							           	    String ara=rs.getString("ara");
							           	    String gara=rs.getString("gara");
							             	String his=rs.getString("his");
							           	    String ghis=rs.getString("ghis");
							            	 String it=rs.getString("it");
							           	    String git=rs.getString("git");
								            
								              cell = row.createCell(3);
									          cell.setCellValue("CIV:"+cv+" "+gcv+" GEO:"+geo+" "+ggeo+" DINI:"+dini+" "+gdini+" KISWA:"+kiswa+" "+gkiswa+" ENGL:"+engl+" "+gengl+" SCI:"+sc+" "+gsc+" ARA:"+ara+" "+gara+" HIS:"+his+" "+ghis+" MATH:"+math+" "+gmath+" ICT:"+it+" "+git);
									          
							        	 
							         }
							         else  if(rs.getString("class").matches("DARASA LA II")  ||  rs.getString("class").matches("DARASA LA II") ||  rs.getString("class").matches("DARASA LA III")  ) {
							        	
								          	String geo=rs.getString("geo");
								          	String ggeo=rs.getString("ggeo");
								          	String dini=rs.getString("dini");
								          	String gdini=rs.getString("gdini");
								          	String kiswa=rs.getString("kisw");
								          	String gkiswa=rs.getString("gkisw");
								          	String engl=rs.getString("eng");
								          	String gengl=rs.getString("geng");
							           	    String sc=rs.getString("sc");
							           	    String gsc=rs.getString("gsc");
							           	    String math=rs.getString("math");
							           	    String gmath=rs.getString("gmath");
							           	    String ara=rs.getString("ara");
							           	    String gara=rs.getString("gara");
							             	
								              cell = row.createCell(3);
									          cell.setCellValue("S/JAMII:"+geo+" "+ggeo+" DINI:"+dini+" "+gdini+" KISWA:"+kiswa+" "+gkiswa+" ENGL:"+engl+" "+gengl+" SAY:"+sc+" "+gsc+" ARA:"+ara+" "+gara+" HIS:"+math+" "+gmath);
									          
							        	 
							         }
							         else  if(rs.getString("class").matches("DARASA LA I")   ) {
								        	
								          	
								          	String kiswa=rs.getString("kisw");
								          	String gkiswa=rs.getString("gkisw");
								          	String engl=rs.getString("eng");
								          	String gengl=rs.getString("geng");
							           	    String math=rs.getString("math");
							           	    String gmath=rs.getString("gmath");
							           	    String ara=rs.getString("ara");
							           	    String gara=rs.getString("gara");
							             	
								              cell = row.createCell(3);
									          cell.setCellValue("KISWAHILI:"+kiswa+" "+gkiswa+"  ENGLISH:"+engl+" "+gengl+"  HISABATI:"+math+" "+gmath+"  KIARABU:"+ara+" "+gara);
									          
							        	 
							         }
							         
							         String sam=rs.getString("sum");
							     	 String sm;
							     	 if(sam.matches("Inc")) {
							     		 sm="Inc";
							     	 }else {
							     		 sm=String.format("%.2f",Double.parseDouble(sam));
							     	 }
							     	 
							     	cell = row.createCell(4);
							          cell.setCellValue(sm);
							         
							         
								     	 String ave=rs.getString("avg");
								     	 String av;
								     	 if(ave.matches("Inc")) {
								     		 av="Inc";
								     	 }else {
								     		 av=String.format("%.2f",Double.parseDouble(ave));
								     	 }
								     	
								     	 cell = row.createCell(5);
								          cell.setCellValue(av);
								          
								          if(rs.getString("avg").matches("Inc")) {
								    			p="Inc";
								    		}else {
								    			double mark=Double.parseDouble(rs.getString("avg"));
									    		
									    		if(mark>=grd1 && mark<=grd2) {
									    			p="A";
									    		}else if(mark>=grd3 && mark<grd4) {
									    			p="B+";
									    		}
									    		else if(mark>=grd5 && mark<grd6) {
									    			p="B";
									    		}else if(mark>=grd7 && mark< grd8) {
									    			p="C";
									    		}
									    		else if(mark>=grd9 && mark<grd10) {
									    			p="D";
									    		}else if(mark>=grd11 && mark< grd12) {
									    			p="F";
								    		}
								    		
								    		}
								          
								          cell = row.createCell(6);
								          cell.setCellValue(p);
								          
								          
								     	 cell = row.createCell(7);
								          cell.setCellValue(a);
							         
							         i++;
							         
							         
						          
						      
						}
								
								 JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
							      FileOutputStream out = new FileOutputStream(new File(""+ct.getSelectedItem().toString().replaceAll("'", "''")+".xlsx"));
							      workbook.write(out);
							      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".xlsx");
							      out.close();
								
									
								}else {
									
									JOptionPane.showMessageDialog(null, "No user with that Record !");
								}
									
					    	 
					    	 
							
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
					}
					
						
					
				}
					   
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}finally{
 	             try{
  	                 rs.close();
  	                 ps.close();
  	             }catch(Exception ex){
  	                 ex.getMessage();
  	             }}
		}});
	
	
	nrep.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				
				

int result = JOptionPane.showConfirmDialog(null, panel4, "Edit ",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);


if(result==JOptionPane.OK_OPTION) {

	int result1 = JOptionPane.showConfirmDialog(null, panel, "Select ",
	        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

	if(result1==JOptionPane.OK_OPTION) {
		
		
		if(jj.getSelectedItem()!= null &&!((String) jj.getSelectedItem()).trim().isEmpty() &&
				et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
			
			String sql="update  text set  ptext='"+area1.getText()+"' where rowid= '"+1+"'  ";
			ps=con.prepareStatement(sql);
			ps.execute();	
			//JOptionPane.showMessageDialog(b1,"Success !");
			
			     String count="select count(id) from mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' "; //jj.getSelectedItem().toString()gg
				 ps=con.prepareStatement(count);
				 ResultSet rss=ps.executeQuery();
				 
				 String sq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark2  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' ";
				 	ps=con.prepareStatement(sq);
				 	ResultSet rs=ps.executeQuery();
				 
				
				int nam=Integer.parseInt(rss.getString("count(id)"));
				if(nam !=0) {
				 String a="";
					
					try {
						
						   Document document=new Document(PageSize.A4);
						    PdfWriter.getInstance(document, new FileOutputStream("ReportForm.pdf"));
						    document.open();
						    PdfPTable table = new PdfPTable(4);
						    
						
						while(rs.next()) {
							
							 String ave=rs.getString("avg");
						 	 String av;
						 	 String sam=rs.getString("sum");
						 	 String sm;
						 	 String com="";
						 	 String p = "";
						    
								
							 if( (rs.getString("class").matches("DARASA LA V")) ||  (rs.getString("class").matches("DARASA LA VI"))    ) {
								 a=rs.getString("rank");
								 

								 String  cv=rs.getString("cv"); String gcv=rs.getString("gcv"); String cmc=rs.getString("cmc");
								 String  his=rs.getString("his"); String ghis=rs.getString("ghis"); String cmh=rs.getString("cmh");
								 String  eng=rs.getString("eng"); String geng=rs.getString("geng"); String cme=rs.getString("cme");
								 String  kisw=rs.getString("kisw"); String gkisw=rs.getString("gkisw"); String cmk=rs.getString("cmk");
								 String  geo=rs.getString("geo"); String ggeo=rs.getString("ggeo"); String cmg=rs.getString("cmg");
								 String  sc=rs.getString("sc"); String gsc=rs.getString("gsc"); String cms=rs.getString("cms");
								 String  dini=rs.getString("dini"); String gdini=rs.getString("gdini"); String cmd=rs.getString("cmd");
								 String  math=rs.getString("math"); String gmath=rs.getString("gmath"); String cmm=rs.getString("cmm");
								 String  it=rs.getString("it"); String git=rs.getString("git"); String cmi=rs.getString("cmi");
								 String  ara=rs.getString("ara"); String gara=rs.getString("gara"); String cma=rs.getString("cma");
								 
							 	 if(ave.matches("Inc")) {
							 		 av="--";
							 	 }else {
							 		 av=String.format("%.2f",Double.parseDouble(ave)); 	
									  
							 	 }
							 	 
							 	 if(sam.matches("Inc")) {
							 		 sm="--";com="Haijakamilika";p="Haijakamilika";
							 	 }else {
							 		 sm=String.format("%.1f",Double.parseDouble(sam)); 	
									  
							 	 }
							 	
							 	 if(rs.getString("avg").matches("Inc")) {
						    			p="Inc";
						    		}else {
						    			double mark=Double.parseDouble(rs.getString("avg"));
							    		
							    		if(mark>=grd1 && mark<=grd2) {
							    			p="A";com="VIZURI SANA";
							    		}else if(mark>=grd3 && mark<grd4) {
							    			p="B+";com="VIZURI";
							    		}else if(mark>=grd5 && mark<grd6) {
							    			p="B";com="VIZURI";
							    		}
							    		else if(mark>=grd7 && mark<grd8) {
							    			p="C";com="WASTANI";
							    		}else if(mark>= grd9 && mark< grd10) {
							    			p="D";com="DHAIFU";
						    		}else if(mark>= grd11 && mark< grd12) {
						    			p="F";com="MBAYA SANA";
					    		}
						    		
						    		}
								 
								  Image im=Image.getInstance("primary.png");
								    table.setWidths(new int[]{ 1, 1, 1,1});
								    table.setWidthPercentage(105);
								    PdfPCell cell;
								    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								   // cell.setBorder(4);
								    cell.setHorizontalAlignment(1);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA MSINGI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+"       "+jj.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("JINA: "+rs.getString("first")+" "+rs.getString("last")+"        JINSIA: "+rs.getString("gender")+"      "+rs.getString("class"),FontFactory.getFont("serif", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    

								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("MAONI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								
								        cell = new PdfPCell(new Phrase("URAIA", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    table.addCell(cell);
									    cell = new PdfPCell(new Phrase(cv));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    table.addCell(cell);
									    cell = new PdfPCell(new Phrase(gcv));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    table.addCell(cell);
									    cell = new PdfPCell(new Phrase(cmc));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    table.addCell(cell);
									    
									       cell = new PdfPCell(new Phrase("HISTORIA", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    table.addCell(cell);
										    cell = new PdfPCell(new Phrase(his));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    table.addCell(cell);
										    cell = new PdfPCell(new Phrase(ghis));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    table.addCell(cell);
										    cell = new PdfPCell(new Phrase(cmh));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    table.addCell(cell);
										    
										    
										        cell = new PdfPCell(new Phrase("ENGLISH", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(eng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(geng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(cme));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
									
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(kisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(cmk));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
										
												    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(geo));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(ggeo));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(cmg));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("SAYANSI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(sc));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(gsc));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(cms));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    
														    cell = new PdfPCell(new Phrase("DINI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(dini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(gdini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmd));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
													
															    cell = new PdfPCell(new Phrase("HISABATI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																   // cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(math));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(gmath));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(cmm));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    
																    cell = new PdfPCell(new Phrase("KIARABU", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																	   // cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(ara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(gara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(cma));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    
																	    cell = new PdfPCell(new Phrase("ICT", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																		   // cell.setHorizontalAlignment(1);
																		    cell.setColspan(1);
																		    table.addCell(cell);
																		    cell = new PdfPCell(new Phrase(it));							
																		    cell.setHorizontalAlignment(1);
																		    cell.setColspan(1);
																		    table.addCell(cell);
																		    cell = new PdfPCell(new Phrase(git));							
																		    cell.setHorizontalAlignment(1);
																		    cell.setColspan(1);
																		    table.addCell(cell);
																		    cell = new PdfPCell(new Phrase(cmi));							
																		    cell.setHorizontalAlignment(1);
																		    cell.setColspan(1);
																		    table.addCell(cell);
																		    
																		    cell=new PdfPCell(new Phrase("JUMLA:  "+sm+"   WASTANI: "+"  "+av+"   DARAJA: "+"   "+p+"  "+com+"    \n"+"NAFASI YAKE NI"+"   "+a+"   KATI YA WANAFUNZI   "+nam+"   KATIKA DARASA\n",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															      		       cell.setHorizontalAlignment(1);
															      		     cell.setColspan(4);
															                   table.addCell(cell);
															                   
															                   cell = new PdfPCell(new Phrase("\n"));
																			    cell.setBorder(0);
																			    cell.setColspan(4);
																			  table.addCell(cell);
																			    
																			    cell=new PdfPCell(new Phrase(area1.getText()));
																      		       cell.setBorder(0);
																      		     cell.setColspan(4);
																      		       table.addCell(cell);
																			    
															
														
											
									    
									  
									    
							 }else if( (rs.getString("class").matches("DARASA LA II")) ||  (rs.getString("class").matches("DARASA LA III"))  ||  (rs.getString("class").matches("DARASA LA IV"))) {
								 

								 a=rs.getString("rank");
								 

								 String  cv=rs.getString("cv"); String gcv=rs.getString("gcv"); String cmc=rs.getString("cmc");
								 String  his=rs.getString("his"); String ghis=rs.getString("ghis"); String cmh=rs.getString("cmh");
								 String  eng=rs.getString("eng"); String geng=rs.getString("geng"); String cme=rs.getString("cme");
								 String  kisw=rs.getString("kisw"); String gkisw=rs.getString("gkisw"); String cmk=rs.getString("cmk");
								 String  geo=rs.getString("geo"); String ggeo=rs.getString("ggeo"); String cmg=rs.getString("cmg");
								 String  sc=rs.getString("sc"); String gsc=rs.getString("gsc"); String cms=rs.getString("cms");
								 String  dini=rs.getString("dini"); String gdini=rs.getString("gdini"); String cmd=rs.getString("cmd");
								 String  math=rs.getString("math"); String gmath=rs.getString("gmath"); String cmm=rs.getString("cmm");
								 String  it=rs.getString("it"); String git=rs.getString("git"); String cmi=rs.getString("cmi");
								 String  ara=rs.getString("ara"); String gara=rs.getString("gara"); String cma=rs.getString("cma");
								 
							 	 if(ave.matches("Inc")) {
							 		 av="--";
							 	 }else {
							 		 av=String.format("%.2f",Double.parseDouble(ave)); 	
									  
							 	 }
							 	 
							 	 if(sam.matches("Inc")) {
							 		 sm="--";com="Haijakamilika";p="Haijakamilika";
							 	 }else {
							 		 sm=String.format("%.1f",Double.parseDouble(sam)); 	
									  
							 	 }
							 	
							 	 if(rs.getString("avg").matches("Inc")) {
						    			p="Inc";
						    		}else {
						    			double mark=Double.parseDouble(rs.getString("avg"));
							    		
							    		if(mark>=grd1 && mark<=grd2) {
							    			p="A";com="VIZURI SANA";
							    		}else if(mark>=grd3 && mark<grd4) {
							    			p="B+";com="VIZURI";
							    		}else if(mark>=grd5 && mark<grd6) {
							    			p="B";com="VIZURI";
							    		}
							    		else if(mark>=grd7 && mark<grd8) {
							    			p="C";com="WASTANI";
							    		}else if(mark>= grd9 && mark< grd10) {
							    			p="D";com="DHAIFU";
						    		}else if(mark>= grd11 && mark< grd12) {
						    			p="F";com="MBAYA SANA";
					    		}
						    		
						    		}
								 
								  Image im=Image.getInstance("primary.png");
								    table.setWidths(new int[]{ 1, 1, 1,1});
								    table.setWidthPercentage(105);
								    PdfPCell cell;
								    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								   // cell.setBorder(4);
								    cell.setHorizontalAlignment(1);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA MSINGI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+"       "+jj.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("JINA: "+rs.getString("first")+" "+rs.getString("last")+"        JINSIA: "+rs.getString("gender")+"      "+rs.getString("class"),FontFactory.getFont("serif", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    

								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("MAONI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								
								      
									    
										        cell = new PdfPCell(new Phrase("ENGLISH", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(eng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(geng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(cme));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
									
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(kisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(cmk));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
										
												    cell = new PdfPCell(new Phrase("SAYANSI JAMII", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(geo));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(ggeo));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(cmg));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("SAYANSI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(sc));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(gsc));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(cms));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    
														    cell = new PdfPCell(new Phrase("DINI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(dini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(gdini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmd));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
													
															    cell = new PdfPCell(new Phrase("HISABATI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																   // cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(math));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(gmath));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(cmm));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    
																    cell = new PdfPCell(new Phrase("KIARABU", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																	   // cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(ara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(gara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(cma));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    
																	 
																		    
																		    cell=new PdfPCell(new Phrase("JUMLA:  "+sm+"   WASTANI: "+"  "+av+"   DARAJA: "+"   "+p+"  "+com+"    \n"+"NAFASI YAKE NI"+"   "+a+"   KATI YA WANAFUNZI   "+nam+"   KATIKA DARASA\n",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															      		       cell.setHorizontalAlignment(1);
															      		     cell.setColspan(4);
															                   table.addCell(cell);
															                   
															                   cell = new PdfPCell(new Phrase("\n"));
																			    cell.setBorder(0);
																			    cell.setColspan(4);
																			  table.addCell(cell);
																			    
																			    cell=new PdfPCell(new Phrase(area1.getText()));
																      		       cell.setBorder(0);
																      		     cell.setColspan(4);
																      		       table.addCell(cell);
																		
								 
							 }    else if( (rs.getString("class").matches("DARASA LA I"))  ) {

								 
								 a=rs.getString("rank");					 

								 String  cv=rs.getString("cv"); String gcv=rs.getString("gcv"); String cmc=rs.getString("cmc");
								 String  his=rs.getString("his"); String ghis=rs.getString("ghis"); String cmh=rs.getString("cmh");
								 String  eng=rs.getString("eng"); String geng=rs.getString("geng"); String cme=rs.getString("cme");
								 String  kisw=rs.getString("kisw"); String gkisw=rs.getString("gkisw"); String cmk=rs.getString("cmk");
								 String  geo=rs.getString("geo"); String ggeo=rs.getString("ggeo"); String cmg=rs.getString("cmg");
								 String  sc=rs.getString("sc"); String gsc=rs.getString("gsc"); String cms=rs.getString("cms");
								 String  dini=rs.getString("dini"); String gdini=rs.getString("gdini"); String cmd=rs.getString("cmd");
								 String  math=rs.getString("math"); String gmath=rs.getString("gmath"); String cmm=rs.getString("cmm");
								 String  it=rs.getString("it"); String git=rs.getString("git"); String cmi=rs.getString("cmi");
								 String  ara=rs.getString("ara"); String gara=rs.getString("gara"); String cma=rs.getString("cma");
								 
							 	 if(ave.matches("Inc")) {
							 		 av="--";
							 	 }else {
							 		 av=String.format("%.2f",Double.parseDouble(ave)); 	
									  
							 	 }
							 	 
							 	 if(sam.matches("Inc")) {
							 		 sm="--";com="Haijakamilika";p="Haijakamilika";
							 	 }else {
							 		 sm=String.format("%.1f",Double.parseDouble(sam)); 	
									  
							 	 }
							 	
							 	 if(rs.getString("avg").matches("Inc")) {
						    			p="Inc";
						    		}else {
						    			double mark=Double.parseDouble(rs.getString("avg"));
							    		
							    		if(mark>=grd1 && mark<=grd2) {
							    			p="A";com="VIZURI SANA";
							    		}else if(mark>=grd3 && mark<grd4) {
							    			p="B+";com="VIZURI";
							    		}else if(mark>=grd5 && mark<grd6) {
							    			p="B";com="VIZURI";
							    		}
							    		else if(mark>=grd7 && mark<grd8) {
							    			p="C";com="WASTANI";
							    		}else if(mark>= grd9 && mark< grd10) {
							    			p="D";com="DHAIFU";
						    		}else if(mark>= grd11 && mark< grd12) {
						    			p="F";com="MBAYA SANA";
					    		}
						    		
						    		}
								 
								  Image im=Image.getInstance("primary.png");
								    table.setWidths(new int[]{ 1, 1, 1,1});
								    table.setWidthPercentage(105);
								    PdfPCell cell;
								    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setBorder(4);
								    cell.setHorizontalAlignment(1);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA MSINGI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+"       "+jj.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n\n\n\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("JINA: "+rs.getString("first")+" "+rs.getString("last")+"        JINSIA: "+rs.getString("gender")+"      "+rs.getString("class"),FontFactory.getFont("serif", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    

								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("MAONI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								
								      
									    
										        cell = new PdfPCell(new Phrase("ENGLISH", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(eng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(geng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(cme));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
									
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(kisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(cmk));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
										
												 
													
															    cell = new PdfPCell(new Phrase("HISABATI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																   // cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(math));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(gmath));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(cmm));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    
																    cell = new PdfPCell(new Phrase("KIARABU", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																	   // cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(ara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(gara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(cma));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    
																	 
																		    
																		    cell=new PdfPCell(new Phrase("JUMLA:  "+sm+"   WASTANI: "+"  "+av+"   DARAJA: "+"   "+p+"  "+com+"    \n"+"NAFASI YAKE NI"+"   "+a+"   KATI YA WANAFUNZI   "+nam+"   KATIKA DARASA\n",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															      		       cell.setHorizontalAlignment(1);
															      		     cell.setColspan(4);
															                   table.addCell(cell);
															                   
															                   cell = new PdfPCell(new Phrase("\n\n"));
																			    cell.setBorder(0);
																			    cell.setColspan(4);
																			  table.addCell(cell);
																			    
																			    cell=new PdfPCell(new Phrase(area1.getText()));
																      		       cell.setBorder(0);
																      		     cell.setColspan(4);
																      		       table.addCell(cell);
																		
								 
							 
								 
								 
								 
							 }
								 
							
						}
						 
						    
						    document.add(table);
						    document.close();
						
							document.close();
							JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
							Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"ReportForm.pdf");
							
						
						
						
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getStackTrace());
					}
					
					
	}
				else {
					
					JOptionPane.showMessageDialog(null, "No user with that Record !");
				}
					
	
				
			} else {
				JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
			}
			
		      
	}
		      
}
		      
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}finally{
 	             try{
  	                 rs.close();
  	                 ps.close();
  	             }catch(Exception ex){
  	                 ex.getMessage();
  	             }}
		      

		}
		});
	
	
	/////////////////////////////////////////////////////////////////////////
	
	
	orep.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				
				

int result = JOptionPane.showConfirmDialog(null, panel4, "Edit ",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);


if(result==JOptionPane.OK_OPTION) {

	int result1 = JOptionPane.showConfirmDialog(null, panel, "Select ",
	        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

	if(result1==JOptionPane.OK_OPTION) {
		
		
		if(jj.getSelectedItem()!= null &&!((String) jj.getSelectedItem()).trim().isEmpty() &&
				et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
			
			String sql="update  text set  ptext='"+area1.getText()+"' where rowid= '"+1+"'  ";
			ps=con.prepareStatement(sql);
			ps.execute();	
			//JOptionPane.showMessageDialog(b1,"Success !");
			
			     String count="select count(id) from mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' "; //jj.getSelectedItem().toString()gg
				 ps=con.prepareStatement(count);
				 ResultSet rss=ps.executeQuery();
				 
			    	 String sq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark22  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem()+"' ";
				 	ps=con.prepareStatement(sq);
				 	ResultSet rs=ps.executeQuery();
				 
				
				int nam=Integer.parseInt(rss.getString("count(id)"));
				if(nam !=0) {
				 String a="";
					
					try {
						
						   Document document=new Document(PageSize.A4);
						    PdfWriter.getInstance(document, new FileOutputStream("ReportForm.pdf"));
						    document.open();
						    PdfPTable table = new PdfPTable(4);
						    
						
						while(rs.next()) {
							
							 String ave=rs.getString("avg");
						 	 String av;
						 	 String sam=rs.getString("sum");
						 	 String sm;
						 	 String com="";
						 	 String p = "";
						    
								
							 if( (rs.getString("class").matches("DARASA LA V")) ||  (rs.getString("class").matches("DARASA LA VI"))    ) {
								 a=rs.getString("rank");
								 

								 String  cv=rs.getString("cv"); String gcv=rs.getString("gcv"); String cmc=rs.getString("cmc");
								 String  his=rs.getString("his"); String ghis=rs.getString("ghis"); String cmh=rs.getString("cmh");
								 String  eng=rs.getString("eng"); String geng=rs.getString("geng"); String cme=rs.getString("cme");
								 String  kisw=rs.getString("kisw"); String gkisw=rs.getString("gkisw"); String cmk=rs.getString("cmk");
								 String  geo=rs.getString("geo"); String ggeo=rs.getString("ggeo"); String cmg=rs.getString("cmg");
								 String  sc=rs.getString("sc"); String gsc=rs.getString("gsc"); String cms=rs.getString("cms");
								 String  dini=rs.getString("dini"); String gdini=rs.getString("gdini"); String cmd=rs.getString("cmd");
								 String  math=rs.getString("math"); String gmath=rs.getString("gmath"); String cmm=rs.getString("cmm");
								 String  it=rs.getString("it"); String git=rs.getString("git"); String cmi=rs.getString("cmi");
								 String  ara=rs.getString("ara"); String gara=rs.getString("gara"); String cma=rs.getString("cma");
								 
							 	 if(ave.matches("Inc")) {
							 		 av="--";
							 	 }else {
							 		 av=String.format("%.2f",Double.parseDouble(ave)); 	
									  
							 	 }
							 	 
							 	 if(sam.matches("Inc")) {
							 		 sm="--";com="Haijakamilika";p="Haijakamilika";
							 	 }else {
							 		 sm=String.format("%.1f",Double.parseDouble(sam)); 	
									  
							 	 }
							 	
							 	 if(rs.getString("avg").matches("Inc")) {
						    			p="Inc";
						    		}else {
						    			double mark=Double.parseDouble(rs.getString("avg"));
							    		
							    		if(mark>=grd1 && mark<=grd2) {
							    			p="A";com="VIZURI SANA";
							    		}else if(mark>=grd3 && mark<grd4) {
							    			p="B+";com="VIZURI";
							    		}else if(mark>=grd5 && mark<grd6) {
							    			p="B";com="VIZURI";
							    		}
							    		else if(mark>=grd7 && mark<grd8) {
							    			p="C";com="WASTANI";
							    		}else if(mark>= grd9 && mark< grd10) {
							    			p="D";com="DHAIFU";
						    		}else if(mark>= grd11 && mark< grd12) {
						    			p="F";com="MBAYA SANA";
					    		}
						    		
						    		}
								 
								  Image im=Image.getInstance("primary.png");
								    table.setWidths(new int[]{ 1, 1, 1,1});
								    table.setWidthPercentage(105);
								    PdfPCell cell;
								    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								   // cell.setBorder(4);
								    cell.setHorizontalAlignment(1);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA MSINGI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("JINA: "+rs.getString("first")+" "+rs.getString("last")+"        JINSIA: "+rs.getString("gender")+"      "+rs.getString("class"),FontFactory.getFont("serif", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    

								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("MAONI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								
								        cell = new PdfPCell(new Phrase("URAIA", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    table.addCell(cell);
									    cell = new PdfPCell(new Phrase(cv));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    table.addCell(cell);
									    cell = new PdfPCell(new Phrase(gcv));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    table.addCell(cell);
									    cell = new PdfPCell(new Phrase(cmc));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    table.addCell(cell);
									    
									       cell = new PdfPCell(new Phrase("HISTORIA", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    table.addCell(cell);
										    cell = new PdfPCell(new Phrase(his));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    table.addCell(cell);
										    cell = new PdfPCell(new Phrase(ghis));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    table.addCell(cell);
										    cell = new PdfPCell(new Phrase(cmh));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    table.addCell(cell);
										    
										    
										        cell = new PdfPCell(new Phrase("ENGLISH", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(eng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(geng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(cme));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
									
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(kisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(cmk));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
										
												    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(geo));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(ggeo));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(cmg));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("SAYANSI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(sc));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(gsc));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(cms));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    
														    cell = new PdfPCell(new Phrase("DINI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(dini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(gdini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmd));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
													
															    cell = new PdfPCell(new Phrase("HISABATI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																   // cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(math));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(gmath));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(cmm));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    
																    cell = new PdfPCell(new Phrase("KIARABU", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																	   // cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(ara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(gara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(cma));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    
																	    cell = new PdfPCell(new Phrase("ICT", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																		   // cell.setHorizontalAlignment(1);
																		    cell.setColspan(1);
																		    table.addCell(cell);
																		    cell = new PdfPCell(new Phrase(it));							
																		    cell.setHorizontalAlignment(1);
																		    cell.setColspan(1);
																		    table.addCell(cell);
																		    cell = new PdfPCell(new Phrase(git));							
																		    cell.setHorizontalAlignment(1);
																		    cell.setColspan(1);
																		    table.addCell(cell);
																		    cell = new PdfPCell(new Phrase(cmi));							
																		    cell.setHorizontalAlignment(1);
																		    cell.setColspan(1);
																		    table.addCell(cell);
																		    
																		    cell=new PdfPCell(new Phrase("JUMLA:  "+sm+"   WASTANI: "+"  "+av+"   DARAJA: "+"   "+p+"  "+com+"    \n"+"NAFASI YAKE NI"+"   "+a+"   KATI YA WANAFUNZI   "+nam+"   KATIKA DARASA\n",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															      		       cell.setHorizontalAlignment(1);
															      		     cell.setColspan(4);
															                   table.addCell(cell);
															                   
															                   cell = new PdfPCell(new Phrase("\n"));
																			    cell.setBorder(0);
																			    cell.setColspan(4);
																			  table.addCell(cell);
																			    
																			    cell=new PdfPCell(new Phrase(area1.getText()));
																      		       cell.setBorder(0);
																      		     cell.setColspan(4);
																      		       table.addCell(cell);
																			    
															
														
											
									    
									  
									    
							 }else if( (rs.getString("class").matches("DARASA LA II")) ||  (rs.getString("class").matches("DARASA LA III"))  ||  (rs.getString("class").matches("DARASA LA IV"))) {
								 

								 a=rs.getString("rank");
								 

								 String  cv=rs.getString("cv"); String gcv=rs.getString("gcv"); String cmc=rs.getString("cmc");
								 String  his=rs.getString("his"); String ghis=rs.getString("ghis"); String cmh=rs.getString("cmh");
								 String  eng=rs.getString("eng"); String geng=rs.getString("geng"); String cme=rs.getString("cme");
								 String  kisw=rs.getString("kisw"); String gkisw=rs.getString("gkisw"); String cmk=rs.getString("cmk");
								 String  geo=rs.getString("geo"); String ggeo=rs.getString("ggeo"); String cmg=rs.getString("cmg");
								 String  sc=rs.getString("sc"); String gsc=rs.getString("gsc"); String cms=rs.getString("cms");
								 String  dini=rs.getString("dini"); String gdini=rs.getString("gdini"); String cmd=rs.getString("cmd");
								 String  math=rs.getString("math"); String gmath=rs.getString("gmath"); String cmm=rs.getString("cmm");
								 String  it=rs.getString("it"); String git=rs.getString("git"); String cmi=rs.getString("cmi");
								 String  ara=rs.getString("ara"); String gara=rs.getString("gara"); String cma=rs.getString("cma");
								 
							 	 if(ave.matches("Inc")) {
							 		 av="--";
							 	 }else {
							 		 av=String.format("%.2f",Double.parseDouble(ave)); 	
									  
							 	 }
							 	 
							 	 if(sam.matches("Inc")) {
							 		 sm="--";com="Haijakamilika";p="Haijakamilika";
							 	 }else {
							 		 sm=String.format("%.1f",Double.parseDouble(sam)); 	
									  
							 	 }
							 	
							 	 if(rs.getString("avg").matches("Inc")) {
						    			p="Inc";
						    		}else {
						    			double mark=Double.parseDouble(rs.getString("avg"));
							    		
							    		if(mark>=grd1 && mark<=grd2) {
							    			p="A";com="VIZURI SANA";
							    		}else if(mark>=grd3 && mark<grd4) {
							    			p="B+";com="VIZURI";
							    		}else if(mark>=grd5 && mark<grd6) {
							    			p="B";com="VIZURI";
							    		}
							    		else if(mark>=grd7 && mark<grd8) {
							    			p="C";com="WASTANI";
							    		}else if(mark>= grd9 && mark< grd10) {
							    			p="D";com="DHAIFU";
						    		}else if(mark>= grd11 && mark< grd12) {
						    			p="F";com="MBAYA SANA";
					    		}
						    		
						    		}
								 
								  Image im=Image.getInstance("primary.png");
								    table.setWidths(new int[]{ 1, 1, 1,1});
								    table.setWidthPercentage(105);
								    PdfPCell cell;
								    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								   // cell.setBorder(4);
								    cell.setHorizontalAlignment(1);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA MSINGI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("JINA: "+rs.getString("first")+" "+rs.getString("last")+"        JINSIA: "+rs.getString("gender")+"      "+rs.getString("class"),FontFactory.getFont("serif", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    

								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("MAONI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								
								      
									    
										        cell = new PdfPCell(new Phrase("ENGLISH", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(eng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(geng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(cme));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
									
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(kisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(cmk));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
										
												    cell = new PdfPCell(new Phrase("SAYANSI JAMII", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(geo));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(ggeo));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    cell = new PdfPCell(new Phrase(cmg));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    table.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("SAYANSI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(sc));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(gsc));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    cell = new PdfPCell(new Phrase(cms));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    table.addCell(cell);
														    
														    cell = new PdfPCell(new Phrase("DINI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(dini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(gdini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmd));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    table.addCell(cell);
													
															    cell = new PdfPCell(new Phrase("HISABATI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																   // cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(math));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(gmath));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(cmm));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    
																    cell = new PdfPCell(new Phrase("KIARABU", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																	   // cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(ara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(gara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(cma));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    
																	 
																		    
																		    cell=new PdfPCell(new Phrase("JUMLA:  "+sm+"   WASTANI: "+"  "+av+"   DARAJA: "+"   "+p+"  "+com+"    \n"+"NAFASI YAKE NI"+"   "+a+"   KATI YA WANAFUNZI   "+nam+"   KATIKA DARASA\n",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															      		       cell.setHorizontalAlignment(1);
															      		     cell.setColspan(4);
															                   table.addCell(cell);
															                   
															                   cell = new PdfPCell(new Phrase("\n"));
																			    cell.setBorder(0);
																			    cell.setColspan(4);
																			  table.addCell(cell);
																			    
																			    cell=new PdfPCell(new Phrase(area1.getText()));
																      		       cell.setBorder(0);
																      		     cell.setColspan(4);
																      		       table.addCell(cell);
																		
								 
							 }    else if( (rs.getString("class").matches("DARASA LA I"))  ) {

								 
								 a=rs.getString("rank");					 

								 String  cv=rs.getString("cv"); String gcv=rs.getString("gcv"); String cmc=rs.getString("cmc");
								 String  his=rs.getString("his"); String ghis=rs.getString("ghis"); String cmh=rs.getString("cmh");
								 String  eng=rs.getString("eng"); String geng=rs.getString("geng"); String cme=rs.getString("cme");
								 String  kisw=rs.getString("kisw"); String gkisw=rs.getString("gkisw"); String cmk=rs.getString("cmk");
								 String  geo=rs.getString("geo"); String ggeo=rs.getString("ggeo"); String cmg=rs.getString("cmg");
								 String  sc=rs.getString("sc"); String gsc=rs.getString("gsc"); String cms=rs.getString("cms");
								 String  dini=rs.getString("dini"); String gdini=rs.getString("gdini"); String cmd=rs.getString("cmd");
								 String  math=rs.getString("math"); String gmath=rs.getString("gmath"); String cmm=rs.getString("cmm");
								 String  it=rs.getString("it"); String git=rs.getString("git"); String cmi=rs.getString("cmi");
								 String  ara=rs.getString("ara"); String gara=rs.getString("gara"); String cma=rs.getString("cma");
								 
							 	 if(ave.matches("Inc")) {
							 		 av="--";
							 	 }else {
							 		 av=String.format("%.2f",Double.parseDouble(ave)); 	
									  
							 	 }
							 	 
							 	 if(sam.matches("Inc")) {
							 		 sm="--";com="Haijakamilika";p="Haijakamilika";
							 	 }else {
							 		 sm=String.format("%.1f",Double.parseDouble(sam)); 	
									  
							 	 }
							 	
							 	 if(rs.getString("avg").matches("Inc")) {
						    			p="Inc";
						    		}else {
						    			double mark=Double.parseDouble(rs.getString("avg"));
							    		
							    		if(mark>=grd1 && mark<=grd2) {
							    			p="A";com="VIZURI SANA";
							    		}else if(mark>=grd3 && mark<grd4) {
							    			p="B+";com="VIZURI";
							    		}else if(mark>=grd5 && mark<grd6) {
							    			p="B";com="VIZURI";
							    		}
							    		else if(mark>=grd7 && mark<grd8) {
							    			p="C";com="WASTANI";
							    		}else if(mark>= grd9 && mark< grd10) {
							    			p="D";com="DHAIFU";
						    		}else if(mark>= grd11 && mark< grd12) {
						    			p="F";com="MBAYA SANA";
					    		}
						    		
						    		}
								 
								  Image im=Image.getInstance("primary.png");
								    table.setWidths(new int[]{ 1, 1, 1,1});
								    table.setWidthPercentage(105);
								    PdfPCell cell;
								    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setBorder(4);
								    cell.setHorizontalAlignment(1);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA MSINGI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n\n\n\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("JINA: "+rs.getString("first")+" "+rs.getString("last")+"        JINSIA: "+rs.getString("gender")+"      "+rs.getString("class"),FontFactory.getFont("serif", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    table.addCell(cell);
								    

								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    table.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								    cell = new PdfPCell(new Phrase("MAONI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    table.addCell(cell);
								
								      
									    
										        cell = new PdfPCell(new Phrase("ENGLISH", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(eng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(geng));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
											    cell = new PdfPCell(new Phrase(cme));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    table.addCell(cell);
									
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(kisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkisw));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
												    cell = new PdfPCell(new Phrase(cmk));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    table.addCell(cell);
										
												 
													
															    cell = new PdfPCell(new Phrase("HISABATI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																   // cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(math));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(gmath));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    cell = new PdfPCell(new Phrase(cmm));							
																    cell.setHorizontalAlignment(1);
																    cell.setColspan(1);
																    table.addCell(cell);
																    
																    cell = new PdfPCell(new Phrase("KIARABU", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
																	   // cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(ara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(gara));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    cell = new PdfPCell(new Phrase(cma));							
																	    cell.setHorizontalAlignment(1);
																	    cell.setColspan(1);
																	    table.addCell(cell);
																	    
																	 
																		    
																		    cell=new PdfPCell(new Phrase("JUMLA:  "+sm+"   WASTANI: "+"  "+av+"   DARAJA: "+"   "+p+"  "+com+"    \n"+"NAFASI YAKE NI"+"   "+a+"   KATI YA WANAFUNZI   "+nam+"   KATIKA DARASA\n",FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															      		       cell.setHorizontalAlignment(1);
															      		     cell.setColspan(4);
															                   table.addCell(cell);
															                   
															                   cell = new PdfPCell(new Phrase("\n\n"));
																			    cell.setBorder(0);
																			    cell.setColspan(4);
																			  table.addCell(cell);
																			    
																			    cell=new PdfPCell(new Phrase(area1.getText()));
																      		       cell.setBorder(0);
																      		     cell.setColspan(4);
																      		       table.addCell(cell);
																		
								 
							 
								 
								 
								 
							 }
								 
							
						}
						 
						    
						    document.add(table);
						    document.close();
						
							document.close();
							JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
							Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"ReportForm.pdf");
							
						
						
						
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getStackTrace());
					}
					
					
	}
				else {
					
					JOptionPane.showMessageDialog(null, "No user with that Record !");
				}
					
	
				
			} else {
				JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
			}
			
		      
	}
		      
}
		      
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}finally{
 	             try{
  	                 rs.close();
  	                 ps.close();
  	             }catch(Exception ex){
  	                 ex.getMessage();
  	             }}
		      

		}
		});
	
	
	
	about.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			
			Icon at=new ImageIcon(this.getClass().getResource("/z.png"));
		   JOptionPane.showMessageDialog(null, "\tSTUDENT’S RESULT MANAGEMENT SYSTEM\n**************************************************\nThis Software was Designed and Created by\n MOHAMED YUSUPH.This is not a free Software \nand you are not allowed to re-distribute it without\n the prior permission of the developer\n  \nDeveloper’s Contacts:\n************************\nPhone +255 778 939 544 / +255 675 785 592\nEmail: myusuph2@gmail.com\n \nCOPYRIGHT RESERVED ©2018-2019", "About Software", 0, at);
		
			
			
		}});
	
	
	
	level.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
		dispose();
		Mudi m=new Mudi();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setSize(1365,765);
		m.setResizable(false);
		m.setIconImage(Toolkit.getDefaultToolkit().getImage(m.getClass().getResource("/lo.png")));   

		}});
	

	hash=new JLabel("                                                                                          " );
	bar.add(hash);
	//bar.add(sign);
	empty=new JLabel("                                                                                        ");
	kappa=new JLabel("DARASA   LA   I-VI                                                                ");
	bar.add(empty);
	kappa.setForeground(Color.BLUE);kappa.setFont(new Font("Segoe Script",Font.BOLD+Font.HANGING_BASELINE,11));
	
	time=new JLabel();time.setForeground(Color.BLACK);time.setFont(new Font("serif",Font.BOLD+Font.PLAIN,12));
	date=new JLabel();date.setForeground(Color.BLACK);date.setFont(new Font("serif",Font.BOLD+Font.PLAIN,12));
	bar.add(kappa);
	bar.add(date);
	bar.add(empty);
	bar.add(time);

      Thread th=new Thread(){
      public void run(){
    	  for(;;){
    		  Calendar timer=Calendar.getInstance();
    		  timer.getTime();
    		  SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
    		  time.setText(df.format(timer.getTime()));time.setIcon(alarm);
    		  SimpleDateFormat dt=new SimpleDateFormat("E dd MMM ,  yyyy");
    		  date.setText(dt.format(timer.getTime()));date.setIcon(cale);


    		try {
				sleep(1000);
			} catch (InterruptedException e) {

			}
    	  }
      }};

      th.start();
		
	}
	
	

}
