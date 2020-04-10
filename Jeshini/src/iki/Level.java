package iki;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
import java.io.FileOutputStream;
import java.io.IOException;
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
import javax.swing.border.Border;

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
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.lowagie.text.Element;
import com.lowagie.text.pdf.PdfCell;

import net.proteanit.sql.DbUtils;

public class Level extends JFrame {
	private JPanel p,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,pana,pana1,panel,panel1,panel2,panel3,panel4,pa5,pa1,pa2,pa3,pa4,pa,pa6,pa7,pa8;
	private JTextField field;
	private JLabel label,l0,l1,l2,l3,l4,l5,l6,label7,l10,l11,l12,l13,l14,l15,l16,label17,l20,l21,l22,l23,l24,l25,l26,l27,l28,la,lc,le,label3,label16,ll,l29,l30,lan1; 
	private JLabel ll0,ll1,ll2,ll3,l69,l70,label2,l7,l17,l40,l41,l42,l31,labe1,labe2;
	private JTextField t0,t1,t2,t10,t11,t12,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31;
	private JComboBox<String> box5,t3,t4,t5,t6,t13,t14,t15,t16,box15,et,ct,ac,sch,box16,jj,box69,box70,box71,box72,box73,box74,box75,box76,box2,boxn,t7,t17,t40,t41,t42,txt2;
	private String[]name1={"ME","KE"};
	private String[]name2={"KIDATO CHA I","KIDATO CHA II","KIDATO CHA III","KIDATO CHA IV"};
	private String[]name3={"SCIENCE"}; //,"ARTS","ALL"
	private String[]name7={"MUHULA WA I","MUHULA WA II"};
	//private String[]name4={"JARIBIO","MTIHANI"};//"WEEKLY","MONTHLY","MID-TERM","TERMINAL","ANNUAL ","MOCK","PRE-NECTA"
	private String[]name6={"FIDEL CASTRO","MADUNGU","SHAMIANI","MOH'D PINDUA","UTAANI","CHASASA","UWELENI","CCK","MCH. /MDOGO"}; //
	private JButton b1,b2,b3,b4,b5,b6,b7,ban1,ban,ba1,ba2,ba3,ba4,ba5;
	private JLabel lab1,lab3,lab4,lab5,lab7,lab9,lab10,lab11,lab13,lab15,lab16,lab17,lab19,lab21,lab22,lab23,lab25,lab27,lab28,lab29;
	private JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,txt1;
	private static JLabel date;
	private static JLabel empty;
	private static JLabel time;  
	private static JLabel kappa;
	private static JLabel hash;
	private Double grade1,grade2,grade3,grade4,grade5,grade6,grade7,grade8,grade9,grade10;
	private String grad1,grad2,grad3,grad4,grad5,grad6,grad7,grad8,grad9,grad10;
	private Double grd1,grd2,grd3,grd4,grd5,grd6,grd7,grd8,grd9,grd10;
	private JTextArea area,area1;
	private JTable table,table2;
	private JScrollPane pane,pane1,pane2;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private JTabbedPane tab;
	private String school="ALI KHAMIS CAMP";
	

	public Level() {
		
		super("Result System FORM I-IV");
		
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
		pa=new JPanel();
		pa1=new JPanel();
		pa2=new JPanel();
		pa3=new JPanel();
		pa4=new JPanel();
		pa5=new JPanel();
		pa6=new JPanel();
		pa7=new JPanel();
		pa8=new JPanel();
		
		
		tab=new JTabbedPane();add(tab);
		tab.addTab("Student Information",null, p,"Student Information");
		tab.addTab("Update Marks",null, pa,"Update Marks");
		
		
	
		Border in=BorderFactory.createEmptyBorder(2,5,2,5);//p6.setBackground(Color.BLACK);
		Border ou=BorderFactory.createTitledBorder("");
		p10.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa1.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa2.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p5.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p6.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p7.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p8.setBorder(BorderFactory.createCompoundBorder(in, ou));
		p9.setBorder(BorderFactory.createCompoundBorder(in, ou));
		pa4.setBorder(BorderFactory.createCompoundBorder(in, ou));
		

		pa.setLayout(new BorderLayout());
		pa.add(pa1,BorderLayout.NORTH);
		pa.add(pa2,BorderLayout.CENTER);
		
		 
	    lan1=new JLabel("Select Class");lan1.setFont(new Font("georgia",Font.BOLD,13));lan1.setForeground(new Color(46,139,87));
		boxn=new JComboBox<String>(name2);boxn.setToolTipText("Select Class");
		boxn.setMaximumRowCount(10);boxn.setSelectedItem(null);
		

		ban=new JButton("Save Marks");ban.setFont(new Font("verdana",Font.BOLD,12));ban.setBackground(Color.PINK);ban.setForeground(Color.BLUE);
		ban1=new JButton("Refresh");ban1.setFont(new Font("verdana",Font.BOLD,12));ban1.setBackground(Color.BLACK);ban1.setForeground(Color.WHITE);
		
		ba1=new JButton("Kidato cha I");ba1.setFont(new Font("verdana",Font.BOLD,12));ba1.setBackground(Color.pink);ba1.setForeground(Color.blue);
		ba2=new JButton("Kidato cha II");ba2.setFont(new Font("verdana",Font.BOLD,12));ba2.setBackground(Color.pink);ba2.setForeground(Color.blue);
		ba3=new JButton("Kidato cha III");ba3.setFont(new Font("verdana",Font.BOLD,12));ba3.setBackground(Color.pink);ba3.setForeground(Color.blue);
		ba4=new JButton("Kidato cha IV");ba4.setFont(new Font("verdana",Font.BOLD,12));ba4.setBackground(Color.pink);ba4.setForeground(Color.blue);
		
		
	    pa1.setLayout(new GridBagLayout());
		GridBagConstraints c44=new GridBagConstraints();
		c44.insets=new Insets(0,5,0,5);
		c44.gridx=1;c44.gridy=1;
		pa1.add(lan1, c44);
		c44.gridx=2;c44.gridy=1;
		pa1.add(boxn, c44);//pa4.setBackground(Color.red);
		
		c44.gridx=5;c44.gridy=1;
	    pa1.add(ban1, c44);

		c44.gridx=4;c44.gridy=1;
		pa1.add(ban, c44);
		
		
		pa4.setLayout(new GridBagLayout());
		c44.insets=new Insets(0,5,0,5);
		c44.gridx=1;c44.gridy=1;
		pa4.add(ba1, c44);
		c44.gridx=2;c44.gridy=1;
		pa4.add(ba2, c44);
		c44.gridx=3;c44.gridy=1;
		pa4.add(ba3, c44);
		c44.gridx=4;c44.gridy=1;
		pa4.add(ba4, c44);
		
		
		
		//add(p,BorderLayout.CENTER);
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
		
		p2.setLayout(new BorderLayout());
		//p2.add(p9,BorderLayout.NORTH);
		p2.add(pa3,BorderLayout.NORTH);
		p2.add(p10,BorderLayout.CENTER);
		
		pa3.setLayout(new BorderLayout());
		pa3.add(p9,BorderLayout.NORTH);
		pa3.add(pa4,BorderLayout.SOUTH);
		
		
		labe1=new JLabel("Add Series");labe1.setFont(new Font("georgia",Font.BOLD,13));labe1.setForeground(new Color(46,139,87));
		txt1=new JTextField(12);txt1.setToolTipText("Enter Series");
		
		labe2=new JLabel("Remove Series");labe2.setFont(new Font("georgia",Font.BOLD,13));labe2.setForeground(new Color(46,139,87));
		txt2=new JComboBox();txt2.setToolTipText("Remove Series");
		
		
		JLabel n=new JLabel("STUDENT'S  RESULT  MANAGEMENT  SYSTEM");//n.setFont(new Font("Poor Richard",Font.TRUETYPE_FONT+Font.PLAIN+Font.BOLD,45));
		n.setFont(new Font("Segoe UI",+Font.BOLD,48));
		n.setForeground(new Color(128,128,0));
	    p9.add(n);
	    
	    pa7.setLayout(new GridBagLayout());
		GridBagConstraints c3=new GridBagConstraints();
		c3.insets=new Insets(0,1,0,1);
		c3.gridx=1;c3.gridy=1;
		pa7.add(labe1, c3);
		c3.gridx=2;c3.gridy=1;
		pa7.add(txt1, c3);
		
		pa8.setLayout(new GridBagLayout());
		c3.insets=new Insets(0,1,0,1);
		c3.gridx=1;c3.gridy=1;
		pa8.add(labe2, c3);
		c3.gridx=2;c3.gridy=1;
		pa8.add(txt2, c3);
		
	   
	    Icon save=new ImageIcon(this.getClass().getResource("/save.png"));
		Icon search=new ImageIcon(this.getClass().getResource("/search.png"));
		Icon edit=new ImageIcon(this.getClass().getResource("/edit.png"));
		Icon delete=new ImageIcon(this.getClass().getResource("/delete.png"));
		Icon show=new ImageIcon(this.getClass().getResource("/show.png"));
		Icon print=new ImageIcon(this.getClass().getResource("/print.png"));
		Icon refresh=new ImageIcon(this.getClass().getResource("/refresh.png"));
		Icon z=new ImageIcon(this.getClass().getResource("/z.png"));
		
		
		b1=new JButton("Save");b1.setIcon(save);
		b2=new JButton("Show");b2.setIcon(show);
		b3=new JButton("Update");b3.setIcon(edit);
		b4=new JButton("Delete");b4.setIcon(delete);
		b5=new JButton("Refresh");b5.setIcon(refresh);
		b6=new JButton("Print Report");b6.setIcon(null);b6.setFont(new Font("serif",Font.BOLD,12));b6.setForeground(Color.BLUE);
		b7=new JButton("Update Marks");b7.setFont(new Font("serif",Font.BOLD,12));b7.setForeground(Color.BLUE);
		
		
		
		field=new JTextField("",14);   
		field.setToolTipText("Enter First Name or Last Name");
		label=new JLabel();label.setIcon(search);
		
		area=new JTextArea(9,21);//area.setBackground(Color.pink);
		area.setEditable(false);
		area.setFont(new Font("aerial",Font.PLAIN+Font.BOLD,12));
		
		table=new JTable();
		pane=new JScrollPane(table);
	    table.getTableHeader().setReorderingAllowed(false);
		
		table2=new JTable(); table2.getTableHeader().setReorderingAllowed(false);
		pane2=new JScrollPane(table2);
		pa2.setLayout(new BorderLayout());
		pa2.add(pane2);
		
		area1=new JTextArea(20,56);
		area1.setEditable(true);
		area1.setFont(new Font("verdana",Font.PLAIN,12));
		area1.setLineWrap(true);
		area1.setWrapStyleWord(true);
		
		pane1=new JScrollPane(area1);
		panel4.add(pane1);
		
		
		p5.setLayout(new GridBagLayout());
		c3.insets=new Insets(0,1,0,1);
		c3.gridx=1;c3.gridy=1;
		p5.add(field, c3);
		c3.gridx=2;c3.gridy=1;
		p5.add(label, c3);

		l0=new JLabel("User_ID");l0.setFont(new Font("georgia",Font.BOLD,13));l0.setForeground(new Color(46,139,87));
		t0=new JTextField(12);t0.setToolTipText("Enter User ID");
		l1=new JLabel("F & M Name");l1.setFont(new Font("georgia",Font.BOLD,13));l1.setForeground(new Color(46,139,87));
		t1=new JTextField(10);t1.setToolTipText("Enter First Name");
		l2=new JLabel("Last Name");l2.setFont(new Font("georgia",Font.BOLD,13));l2.setForeground(new Color(46,139,87));
		t2=new JTextField(10);t2.setToolTipText("Enter Last Name");
		l3=new JLabel("Gender");l3.setFont(new Font("georgia",Font.BOLD,13));l3.setForeground(new Color(46,139,87));
		t3=new JComboBox<String>(name1);t3.setToolTipText("Select Gender");t3.setSelectedItem(null);
		l4=new JLabel("Class Level");l4.setFont(new Font("georgia",Font.BOLD,13));l4.setForeground(new Color(46,139,87));
		t4=new JComboBox<String>(name2);t4.setMaximumRowCount(4);t4.setToolTipText("Select Class Level");
		t4.setSelectedItem(null);t4.setMaximumRowCount(5);
		l5=new JLabel("Class Type");l5.setFont(new Font("georgia",Font.BOLD,13));l5.setForeground(new Color(46,139,87));
		t5=new JComboBox<String>(name3);t5.setMaximumRowCount(4);t5.setToolTipText("Select Class ");
		t5.setSelectedItem(null);t5.setMaximumRowCount(5);
		l6=new JLabel("Exam Type");l6.setFont(new Font("georgia",Font.BOLD,13));l6.setForeground(new Color(46,139,87));
		t6=new JComboBox<String>();t6.setToolTipText("Select Exam Type");
		t6.setSelectedItem(null);t6.setMaximumRowCount(10);
		l7=new JLabel("Term");l7.setFont(new Font("georgia",Font.BOLD,13));l7.setForeground(new Color(46,139,87));
		t7=new JComboBox<String>(name7);t7.setToolTipText("Select Term Type");
		t7.setSelectedItem(null);t7.setMaximumRowCount(10);
		
		
		
		l20=new JLabel("CIVICS");l20.setFont(new Font("georgia",Font.BOLD,13));l20.setForeground(new Color(46,139,87));
		t20=new JTextField(5);t20.setToolTipText("Enter Civics Marks");
		l21=new JLabel("GEOGRAPHY");l21.setFont(new Font("georgia",Font.BOLD,13));l21.setForeground(new Color(46,139,87));
		t21=new JTextField(5);t21.setToolTipText("Enter Geography Marks");
		l22=new JLabel("DINI");l22.setFont(new Font("georgia",Font.BOLD,13));l22.setForeground(new Color(46,139,87));
		t22=new JTextField(5);t22.setToolTipText("Enter Dini Marks");
		l23=new JLabel("KISWAHILI");l23.setFont(new Font("georgia",Font.BOLD,13));l23.setForeground(new Color(46,139,87));
		t23=new JTextField(5);t23.setToolTipText("Enter Kiswahili Marks");
		l24=new JLabel("ENGLISH");l24.setFont(new Font("georgia",Font.BOLD,13));l24.setForeground(new Color(46,139,87));
		t24=new JTextField(5);t24.setToolTipText("Enter English Marks");
		l25=new JLabel("PHYSICS");l25.setFont(new Font("georgia",Font.BOLD,13));l25.setForeground(new Color(46,139,87));
		t25=new JTextField(5);t25.setToolTipText("Enter Physics Marks");
		l26=new JLabel("CHEMISTRY");l26.setFont(new Font("georgia",Font.BOLD,13));l26.setForeground(new Color(46,139,87));
		t26=new JTextField(5);t26.setToolTipText("Enter Chemistry Marks");
		l27=new JLabel("BIOLOGY");l27.setFont(new Font("georgia",Font.BOLD,13));l27.setForeground(new Color(46,139,87));
		t27=new JTextField(5);t27.setToolTipText("Enter Biology Marks");
		l28=new JLabel("MATH");l28.setFont(new Font("georgia",Font.BOLD,13));l28.setForeground(new Color(46,139,87));
		t28=new JTextField(5);t28.setToolTipText("Enter Math Marks");
		l29=new JLabel("HISTORY");l29.setFont(new Font("georgia",Font.BOLD,13));l29.setForeground(new Color(46,139,87));
		t29=new JTextField(5);t29.setToolTipText("Enter History Marks");
		l30=new JLabel("ARABIC");l30.setFont(new Font("georgia",Font.BOLD,13));l30.setForeground(new Color(46,139,87));
		t30=new JTextField(5);t30.setToolTipText("Enter Arabic Marks");
		l31=new JLabel("LITERATURE");l31.setFont(new Font("georgia",Font.BOLD,13));l31.setForeground(new Color(46,139,87));
		t31=new JTextField(5);t31.setToolTipText("Enter Arabic Marks");
		
		
		
		
		
	   	Calendar timer=Calendar.getInstance();
		 timer.getTime();
		 SimpleDateFormat dt=new SimpleDateFormat("MMMM");
		 SimpleDateFormat yy=new SimpleDateFormat("yyyy");
		 
		 SimpleDateFormat df=new SimpleDateFormat("MMM dd,  yyyy");
		 
		
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
		 
		 ArrayList<String> years_tmp = new ArrayList<String>();
			for(int years=2020; years<=Calendar.getInstance().get(Calendar.YEAR); years++) {
			    years_tmp.add(years+"");
			}
		 
		label7=new JLabel("Acad..Year");label7.setFont(new Font("georgia",Font.BOLD,13));label7.setForeground(new Color(46,139,87));
		String name5[]= {ss1,ss2,ss3,ss4,ss5};
	    box5=new JComboBox(years_tmp.toArray());box5.setToolTipText("Select Year");box5.setSelectedItem(null);
		 
	    
	    et=new JComboBox<String>();et.setMaximumRowCount(10);et.setToolTipText("Select Exam Type");et.setSelectedItem(null);
		ct=new JComboBox<String>(name2);ct.setMaximumRowCount(10);ct.setToolTipText("Select Class Level");ct.setSelectedItem(null);
		ac=new JComboBox(years_tmp.toArray());box5.setMaximumRowCount(10);ac.setToolTipText("Select Academic Year");ac.setSelectedItem(null);
		
		le=new JLabel("Exam Type");le.setFont(new Font("georgia",Font.BOLD,13));le.setForeground(new Color(46,139,87));
		lc=new JLabel("Class");lc.setFont(new Font("georgia",Font.BOLD,13));lc.setForeground(new Color(46,139,87));
		la=new JLabel("Academic Year");la.setFont(new Font("georgia",Font.BOLD,13));la.setForeground(new Color(46,139,87));
		label3=new JLabel("School");label3.setFont(new Font("georgia",Font.BOLD,13));label3.setForeground(new Color(46,139,87));
		sch=new JComboBox<String>(name6);sch.setMaximumRowCount(20);sch.setToolTipText("Select School");sch.setSelectedItem(null);
		ll=new JLabel("Term");ll.setFont(new Font("georgia",Font.BOLD,13));ll.setForeground(new Color(46,139,87));
		jj=new JComboBox<String>(name7);jj.setMaximumRowCount(20);jj.setToolTipText("Select School");jj.setSelectedItem(null);
		
		l40=new JLabel("Academic Year");l40.setFont(new Font("georgia",Font.BOLD,13));l40.setForeground(new Color(46,139,87));
		l41=new JLabel("Term");l41.setFont(new Font("georgia",Font.BOLD,13));l41.setForeground(new Color(46,139,87));
		l42=new JLabel("Class");l42.setFont(new Font("georgia",Font.BOLD,13));l42.setForeground(new Color(46,139,87));
		t40=new JComboBox(years_tmp.toArray());t40.setMaximumRowCount(10);t40.setToolTipText("Select Academic Year");t40.setSelectedItem(null);
		t41=new JComboBox<String>(name7);t41.setMaximumRowCount(20);t41.setToolTipText("Select School");t41.setSelectedItem(null);
		t42=new JComboBox<String>(name2);t42.setMaximumRowCount(20);t42.setToolTipText("Select Class");t42.setSelectedItem(null);
		
		
	    	 box69=new JComboBox<String>(name2);box69.setToolTipText("Select Class");box69.setSelectedItem(null);box69.setMaximumRowCount(5);
			box70=new JComboBox<String>(name2);box70.setToolTipText("Select Class ");box70.setSelectedItem(null);box70.setMaximumRowCount(5);
			l69=new JLabel("Replace");l69.setFont(new Font("georgia",Font.BOLD,13));l69.setForeground(new Color(46,139,87));
			l70=new JLabel("With");l70.setFont(new Font("georgia",Font.BOLD,13));l70.setForeground(new Color(46,139,87));
			ll0=new JLabel("Class");ll0.setFont(new Font("georgia",Font.BOLD,13));ll0.setForeground(new Color(46,139,87));
			
			
			ll1=new JLabel("Acd.. Year");ll1.setFont(new Font("georgia",Font.BOLD,13));ll1.setForeground(new Color(46,139,87));
			box71=new JComboBox(years_tmp.toArray());box71.setMaximumRowCount(4);box71.setToolTipText("Select Year ");box71.setSelectedItem(null);box71.setMaximumRowCount(5);
			box72=new JComboBox(years_tmp.toArray());box72.setMaximumRowCount(4);box72.setToolTipText("Select Year ");box72.setSelectedItem(null);box72.setMaximumRowCount(5);
			
			ll2=new JLabel("Exam Type");ll2.setFont(new Font("georgia",Font.BOLD,13));ll2.setForeground(new Color(46,139,87));
			box73=new JComboBox<String>();box73.setMaximumRowCount(9);box73.setToolTipText("Select Year ");box73.setSelectedItem(null);
			box74=new JComboBox<String>();box74.setMaximumRowCount(9);box74.setToolTipText("Select Year ");box74.setSelectedItem(null);
			
			ll3=new JLabel("Term");ll3.setFont(new Font("georgia",Font.BOLD,13));ll3.setForeground(new Color(46,139,87));
			box75=new JComboBox<String>(name7);box75.setMaximumRowCount(20);box75.setToolTipText("Select School ");box75.setSelectedItem(null);
			box76=new JComboBox<String>(name7);box76.setMaximumRowCount(20);box76.setToolTipText("Select School ");box76.setSelectedItem(null);
			
			
			
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
				
		

			box2=new JComboBox<String>(name2);box2.setMaximumRowCount(4);box2.setToolTipText("Select Class ");box2.setSelectedItem(null);
			label2=new JLabel("Select Class To Resert Marks");label2.setFont(new Font("georgia",Font.BOLD,13));label2.setForeground(new Color(46,139,87));
			
			panel2.setLayout(new GridBagLayout());
			c3.insets=new Insets(0,1,0,1);
			c3.gridx=1;c3.gridy=1;
			panel2.add(label2, c3);
			c3.gridx=2;c3.gridy=1;
			panel2.add(box2, c3);
			
			panel.setLayout(new GridBagLayout());
			
			
			pa6.setLayout(new GridBagLayout());
			GridBagConstraints ccna=new GridBagConstraints();
			ccna.fill=GridBagConstraints.HORIZONTAL;
			ccna.weightx=1;ccna.weighty=1;
			ccna.insets=new Insets(2,2,2,3);

			ccna.gridx=1;ccna.gridy=1;
			ccna.anchor=GridBagConstraints.LINE_END;
			pa6.add(l40,ccna);
			ccna.gridx=1;ccna.gridy=2;
			ccna.anchor=GridBagConstraints.LINE_START;
			pa6.add(t40,ccna);
			
			ccna.gridx=2;ccna.gridy=1;
			ccna.anchor=GridBagConstraints.LINE_END;
			pa6.add(l41,ccna);
			ccna.gridx=2;ccna.gridy=2;
			ccna.anchor=GridBagConstraints.LINE_START;
			pa6.add(t41,ccna);
			
			ccna.gridx=3;ccna.gridy=1;
			ccna.anchor=GridBagConstraints.LINE_END;
			pa6.add(l42,ccna);
			ccna.gridx=3;ccna.gridy=2;
			ccna.anchor=GridBagConstraints.LINE_START;
			pa6.add(t42,ccna);
			
			
		panel.setLayout(new GridBagLayout());
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
		
		
		
	    l10=new JLabel("User_ID");l10.setFont(new Font("georgia",Font.BOLD,13));l10.setForeground(new Color(46,139,87));
		t10=new JTextField(12);t10.setToolTipText("Enter User ID");
		l11=new JLabel("F & M Name");l11.setFont(new Font("georgia",Font.BOLD,13));l11.setForeground(new Color(46,139,87));
		t11=new JTextField(10);t11.setToolTipText("Enter First Name");
		l12=new JLabel("Last Name");l12.setFont(new Font("georgia",Font.BOLD,13));l12.setForeground(new Color(46,139,87));
		t12=new JTextField(10);t12.setToolTipText("Enter Last Name");
		l13=new JLabel("Gender");l13.setFont(new Font("georgia",Font.BOLD,13));l13.setForeground(new Color(46,139,87));
		t13=new JComboBox<String>(name1);t13.setToolTipText("Select Gender");t13.setSelectedItem(null);
		l14=new JLabel("Class Level");l14.setFont(new Font("georgia",Font.BOLD,13));l14.setForeground(new Color(46,139,87));
		t14=new JComboBox<String>(name2);t14.setMaximumRowCount(4);t14.setToolTipText("Select Class Level");
		t14.setSelectedItem(null);t14.setMaximumRowCount(5);
		l15=new JLabel("Combi");l15.setFont(new Font("georgia",Font.BOLD,13));l15.setForeground(new Color(46,139,87));
		t15=new JComboBox<String>(name3);t15.setMaximumRowCount(4);t15.setToolTipText("Select Combination");
		t15.setSelectedItem(null);t15.setMaximumRowCount(5);
		l16=new JLabel("Exam Type");l16.setFont(new Font("georgia",Font.BOLD,13));l16.setForeground(new Color(46,139,87));
		t16=new JComboBox<String>();t16.setMaximumRowCount(10);t16.setToolTipText("Select Exam Type");
		t16.setSelectedItem(null);
		l17=new JLabel("Term");l17.setFont(new Font("georgia",Font.BOLD,13));l17.setForeground(new Color(46,139,87));
		t17=new JComboBox<String>(name7);t17.setToolTipText("Select Term Type");
		t17.setSelectedItem(null);t17.setMaximumRowCount(10);
		
		
		label17=new JLabel("Acad..Year");label17.setFont(new Font("georgia",Font.BOLD,13));label17.setForeground(new Color(46,139,87));
		box15=new JComboBox(years_tmp.toArray());box5.setMaximumRowCount(10);box15.setToolTipText("Select Year");box15.setSelectedItem(null);
			 
		label16=new JLabel("School");label16.setFont(new Font("georgia",Font.BOLD,13));label16.setForeground(new Color(46,139,87));
		box16=new JComboBox<String>(name6);box16.setMaximumRowCount(20);box16.setToolTipText("Select School");box16.setSelectedItem(null);
			 
	    
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
		pana1.add(t29,ccna);
		
		ccna.gridx=1;ccna.gridy=11;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l30,ccna);
		ccna.gridx=2;ccna.gridy=11;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t30,ccna);
		
		ccna.gridx=1;ccna.gridy=12;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l31,ccna);
		ccna.gridx=2;ccna.gridy=12;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t31,ccna);
		
		
		
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
		//p6.add(t5,c);

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
		//p7.add(b6, c8);
		
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

		c.gridx=1;c.gridy=6;
		c.anchor=GridBagConstraints.LINE_END;
		//pana.add(l15,c);
		c.gridx=2;c.gridy=6;
		c.anchor=GridBagConstraints.LINE_START;
		//pana.add(t15,c);

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
		pana.add(l17,c);
		c.gridx=2;c.gridy=9;
		c.anchor=GridBagConstraints.LINE_START;
		pana.add(t17,c);
		
		lab1=new JLabel("A");lab1.setFont(new Font("georgia",Font.BOLD,13));lab1.setForeground(Color.BLUE);
		text1=new JTextField(3);text1.setFont(new Font("georgia",Font.BOLD,13));
		lab3=new JLabel("≤");lab3.setFont(new Font("georgia",Font.BOLD,13));lab3.setForeground(new Color(46,139,87));
		lab4=new JLabel("mark");lab4.setFont(new Font("verdana",Font.BOLD,13));lab4.setForeground(new Color(46,139,87));
		lab5=new JLabel("≤");lab5.setFont(new Font("georgia",Font.BOLD,13));lab5.setForeground(new Color(46,139,87));
		text2=new JTextField(3);text2.setFont(new Font("georgia",Font.BOLD,13));
		
		lab7=new JLabel("B");lab7.setFont(new Font("georgia",Font.BOLD,13));lab7.setForeground(Color.BLUE);
		text3=new JTextField(3);text3.setFont(new Font("georgia",Font.BOLD,13));
		lab9=new JLabel("≤");lab9.setFont(new Font("georgia",Font.BOLD,13));lab9.setForeground(new Color(46,139,87));
		lab10=new JLabel("mark");lab10.setFont(new Font("verdana",Font.BOLD,13));lab10.setForeground(new Color(46,139,87));
		lab11=new JLabel("<");lab11.setFont(new Font("georgia",Font.BOLD,13));lab11.setForeground(new Color(46,139,87));
		text4=new JTextField(3);text4.setFont(new Font("georgia",Font.BOLD,13));
		
		lab13=new JLabel("C");lab13.setFont(new Font("georgia",Font.BOLD,13));lab13.setForeground(Color.BLUE);
		text5=new JTextField(3);text5.setFont(new Font("georgia",Font.BOLD,13));
		lab15=new JLabel("≤");lab15.setFont(new Font("georgia",Font.BOLD,13));lab15.setForeground(new Color(46,139,87));
		lab16=new JLabel("mark");lab16.setFont(new Font("verdana",Font.BOLD,13));lab16.setForeground(new Color(46,139,87));
		lab17=new JLabel("<");lab17.setFont(new Font("georgia",Font.BOLD,13));lab17.setForeground(new Color(46,139,87));
		text6=new JTextField(3);text6.setFont(new Font("georgia",Font.BOLD,13));
		
		lab19=new JLabel("D");lab19.setFont(new Font("georgia",Font.BOLD,13));lab19.setForeground(Color.BLUE);
		text7=new JTextField(3);text7.setFont(new Font("georgia",Font.BOLD,13));
		lab21=new JLabel("≤");lab21.setFont(new Font("georgia",Font.BOLD,13));lab21.setForeground(new Color(46,139,87));
		lab22=new JLabel("mark");lab22.setFont(new Font("verdana",Font.BOLD,13));lab22.setForeground(new Color(46,139,87));
		lab23=new JLabel("<");lab23.setFont(new Font("georgia",Font.BOLD,13));lab23.setForeground(new Color(46,139,87));
		text8=new JTextField(3);text8.setFont(new Font("georgia",Font.BOLD,13));
		
		lab25=new JLabel("F");lab25.setFont(new Font("georgia",Font.BOLD,13));lab25.setForeground(Color.BLUE);
		text9=new JTextField(3);text9.setFont(new Font("georgia",Font.BOLD,13));
		lab27=new JLabel("≤");lab27.setFont(new Font("georgia",Font.BOLD,13));lab27.setForeground(new Color(46,139,87));
		lab28=new JLabel("mark");lab28.setFont(new Font("verdana",Font.BOLD,13));lab28.setForeground(new Color(46,139,87));
		lab29=new JLabel("<");lab29.setFont(new Font("georgia",Font.BOLD,13));lab29.setForeground(new Color(46,139,87));
		text10=new JTextField(3);text10.setFont(new Font("georgia",Font.BOLD,13));
		
		//b9=new JButton("Edit");b9.setFont(new Font("verdana",Font.CENTER_BASELINE,12));b9.setBackground(Color.pink);
		
		
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
		
		cc3.gridx=4;cc3.gridy=6;
		//panel3.add(b9, cc3);

	    
		
		table();
		bar();
		button();
		resert();
		//update();
	//	area();
		field();
		validatey();
		grade();
		text();
	//table3();
    	table2();
    	//term();
    	combi();
    	
	
	}
	
	private void combi() {


	    try {
				
				String sql="select name from category";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				
				while(rs.next()) {
				
					t6.addItem(rs.getString("name"));
					box73.addItem(rs.getString("name"));
					box74.addItem(rs.getString("name"));
					t16.addItem(rs.getString("name"));
					et.addItem(rs.getString("name"));
					txt2.addItem(rs.getString("name"));
					
					t6.setSelectedItem(null);
					box73.setSelectedItem(null);
					box74.setSelectedItem(null);
					et.setSelectedItem(null);
					txt2.setSelectedItem(null);
					
				}
				
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			
			
		
		
	}

	private void term() {
		
	

	

	try {
		
		 String sqq ="select count(id) from term1 where year='"+t40.getSelectedItem().toString()+"' and  term='"+t41.getSelectedItem().toString()+"' and  class='"+t42.getSelectedItem().toString()+"'  ";
    	  ps=con.prepareStatement(sqq);
    	 rs=ps.executeQuery();
    	 int cou=Integer.parseInt(rs.getString("count(id)"));
    	 
		if(cou==0) {
			
			String count="select count(id) from mark11  where year='"+t40.getSelectedItem().toString()+"' and  sch='"+t41.getSelectedItem().toString()+"' and  class='"+t42.getSelectedItem().toString()+"'  ";
 			ps=con.prepareStatement(count);
 			ResultSet rss=ps.executeQuery();
 			
 			
 			String sql="select  id,"
 					+ "max( case when exam = 'JARIBIO' then cv end) as cvj,max(case when exam = 'MTIHANI' then cv end ) as cvm,sum([cv]) as cvt ,"
 					+ "max( case when exam = 'JARIBIO' then geo end) as geoj,max(case when exam = 'MTIHANI' then geo end ) as geom,sum([geo]) as geot ,"
 					+ "max( case when exam = 'JARIBIO' then dini end) as dinij,max(case when exam = 'MTIHANI' then dini end ) as dinim,sum([dini]) as dinit, "
 					+ "max( case when exam = 'JARIBIO' then kiswa end) as kiswaj,max(case when exam = 'MTIHANI' then kiswa end ) as kiswam,sum([kiswa]) as kiswat, "
 					+ "max( case when exam = 'JARIBIO' then engl end) as englj,max(case when exam = 'MTIHANI' then engl end ) as englm,sum([engl]) as englt, "
 					+ "max( case when exam = 'JARIBIO' then phy end) as phyj,max(case when exam = 'MTIHANI' then phy end ) as phym,sum([phy]) as phyt, "
 					+ "max( case when exam = 'JARIBIO' then che end) as chej,max(case when exam = 'MTIHANI' then che end ) as chem,sum([che]) as chet, "
 					+ "max( case when exam = 'JARIBIO' then bio end) as bioj,max(case when exam = 'MTIHANI' then bio end ) as biom,sum([bio]) as biot ,"
 					+ "max( case when exam = 'JARIBIO' then math end) as mathj,max(case when exam = 'MTIHANI' then math end ) as mathm,sum([math]) as matht, "
 					+ "max( case when exam = 'JARIBIO' then his end) as hisj,max(case when exam = 'MTIHANI' then his end ) as hism,sum([his]) as hist ,"
 					+ "max( case when exam = 'JARIBIO' then ara end) as araj,max(case when exam = 'MTIHANI' then ara end ) as aram,sum([ara]) as arat,"
 					+ "max( case when exam = 'JARIBIO' then lit end) as litj,max(case when exam = 'MTIHANI' then lit end ) as litm,sum([lit]) as litt,"
 					+ "class,year,first,last,gender,sch "
 					+ "from mark11 group by id";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			
			
			int nam=Integer.parseInt(rss.getString("count(id)"));
 			if(nam !=0) {
 				

				while(rs.next() ) {
				
				String id=rs.getString("id");
				String cvj=rs.getString("cvj");String cvm=rs.getString("cvm");String cvt=rs.getString("cvt");
				String geoj=rs.getString("geoj");String geom=rs.getString("geom");String geot=rs.getString("geot");
				String dinij=rs.getString("dinij");String dinim=rs.getString("dinim");String dinit=rs.getString("dinit");
				String kiswaj=rs.getString("kiswaj");String kiswam=rs.getString("kiswam");String kiswat=rs.getString("kiswat");
				String englj=rs.getString("englj");String englm=rs.getString("englm");String englt=rs.getString("englt");
				String phyj=rs.getString("phyj");String phym=rs.getString("phym");String phyt=rs.getString("phyt");
				String chej=rs.getString("chej");String chem=rs.getString("chem");String chet=rs.getString("chet");
				String bioj=rs.getString("bioj");String biom=rs.getString("biom");String biot=rs.getString("biot");
				String araj=rs.getString("araj");String aram=rs.getString("aram");String arat=rs.getString("arat");
				String hisj=rs.getString("hisj");String hism=rs.getString("hism");String hist=rs.getString("hist");
				String mathj=rs.getString("mathj");String mathm=rs.getString("mathm");String matht=rs.getString("matht");
				String litj=rs.getString("litj");String litm=rs.getString("litm");String litt=rs.getString("litt");
				
				Double sum=Double.parseDouble(cvt)+Double.parseDouble(geot)+Double.parseDouble(dinit)+Double.parseDouble(phyt)+Double.parseDouble(chet)+Double.parseDouble(matht)+Double.parseDouble(arat)+Double.parseDouble(hist)+Double.parseDouble(kiswat)+Double.parseDouble(englt)+Double.parseDouble(biot)+Double.parseDouble(litt);
				
				Double cvjd=0.0,cvmd=0.0,cva=0.0;
				Double geojd=0.0,geomd=0.0,geoa=0.0;
				Double dinijd=0.0,dinimd=0.0,dinia=0.0;
				Double kiswajd=0.0,kiswamd=0.0,kiswaa=0.0;
				Double engljd=0.0,englmd=0.0,engla=0.0;
				Double phyjd=0.0,phymd=0.0,phya=0.0;
				Double chejd=0.0,chemd=0.0,chea=0.0;
				Double biojd=0.0,biomd=0.0,bioa=0.0;
				Double mathjd=0.0,mathmd=0.0,matha=0.0;
				Double hisjd=0.0,hismd=0.0,hisa=0.0;
				Double arajd=0.0,aramd=0.0,araa=0.0;
				Double litjd=0.0,litmd=0.0,lita=0.0;
				
				
			
				String cmc="";String cmg="";String cmk="";String cme="";String cmch="";String cmm="";String cmb="";String cmp="";
				String cmar="";String cmh="";String cmd="";String cml="";
				double cv=0.0,geo=0.0,dini=0.0,kiswa=0.0,engl=0.0,phy=0.0,che=0.0,bio=0.0,math=0.0,his=0.0,ara=0.0,lit=0.0;
				int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n10=0,n11=0,toto;
			    // System.out.println(id+" "+cvj+" "+cvm+" "+geoj+" "+geom+" "+dinij+" "+dinim+" "+kiswaj+" "+kiswam+" "+englj+" "+englm+" "+phyj+" "+phym+" "+chej+" "+chem+" "+bioj+" "+biom+" "+mathj+" "+mathm+" "+araj+" "+aram+" "+hisj+" "+hism+" "+sum);
				
				
				
				String sqll="insert into term1(id,cvj,cvm,cva,gcv,geoj,geom,geoa,ggeo,dinij,dinim,dinia,gdini,kiswaj,kiswam,kiswaa,gkiswa,englj,englm,engla,gengl,phyj,phym,phya,gphy,chej,chem,chea,gche,bioj,biom,bioa,gbio,mathj,mathm,matha,gmath,hisj,hism,hisa,ghis,araj,aram,araa,gara,litj,litm,lita,glit,ave,point,class,year,first,last,gender,term,cmc,cmg,cmk,cme,cmch,cmm,cmb,cmp,cmar,cmh,cmd,cml) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				ps=con.prepareStatement(sqll);
				
				
				ps.setString(1, id);
				
				if((cvj==null || cvj.isEmpty()) && (cvm==null || cvm.isEmpty()) ) {
					ps.setString(2,"");
					ps.setString(3,"");
					ps.setString(4,"");
			}else {
				
				
				n0=1;
				
				if(cvj!=null && !cvj.isEmpty()) {
					
					cvjd=Double.parseDouble(cvj)*0.2;
					ps.setString(2,String.format("%,.1f", cvjd));
				}else {
					ps.setString(2,"");
				}
				
               if(cvm!=null && !cvm.isEmpty()) {
					
				    cvmd=Double.parseDouble(cvm)*0.8;
					ps.setString(3,String.format("%,.1f", cvmd));
				}else {
					ps.setString(3,"");
				}
				
           
                 cva=cvjd+cvmd;
				ps.setString(4,String.format("%,.1f", cva));
				}
			
				if((cvj==null || cvj.isEmpty()) && (cvm==null || cvm.isEmpty()) ) {
				 ps.setString(5, "");cmc="";
			
			      
			}else {
				
				if(cva>=grd1 && cva<=grd2){
				       ps.setString(5, "A");cmc="VIZURI SANA";
				      }else if(cva>=grd3 && cva<grd4){
				    	  ps.setString(5, "B");cmc="VIZURI";
				      }
				      else if(cva>=grd5 && cva<grd6){
				    	  ps.setString(5, "C");cmc="WASTANI";
				      }
				      else if(cva>=grd7 && cva<grd8){
				    	  ps.setString(5, "D");cmc="DHAIFU";
					      }
					      else  {
					    	  ps.setString(5, "F");cmc="MBAYA SANA";
					      }
			                 }
			      
				if((geoj==null || geoj.isEmpty()) && (geom==null || geom.isEmpty()) ) {
				
				ps.setString(6,"");
				ps.setString(7, "");
	            ps.setString(8,"");
					
			}else {
				
				
				n1=1;
				
				if(geoj!=null && !geoj.isEmpty()) {
					
					geojd=Double.parseDouble(geoj)*0.2;
					ps.setString(6,String.format("%,.1f", geojd));
				}else {
					ps.setString(6,"");
				}
				
               if(geom!=null && !geom.isEmpty()) {
					
				    geomd=Double.parseDouble(geom)*0.8;
					ps.setString(7,String.format("%,.1f", geomd));
				}else {
					ps.setString(7,"");
				}
				
           
                 geoa=geojd+geomd;
				ps.setString(8,String.format("%,.1f", geoa));
				}
		    	
				if((geoj==null || geoj.isEmpty()) && (geom==null || geom.isEmpty()) ) {
				 ps.setString(9, "");cmg="";
			}else {
				
				
				 if(geoa>=grd1 && geoa<=grd2){
				       ps.setString(9, "A");cmg="VIZURI SANA";
				      }else if(geoa>=grd3 && geoa< grd4){
				    	  ps.setString(9, "B");cmg="VIZURI";
				      }
				      else if(geoa>=grd5 && geoa< grd6){
				    	  ps.setString(9, "C");cmg="WASTANI";
				      }
				      else if(geoa>= grd7 && geoa< grd8){
				    	  ps.setString(9, "D");cmg="DHAIFU";
					      }
					      else  {
					    	  ps.setString(9, "F");cmg="MBAYA SANA";
					      }
				
			}
			    
			
				if((dinij==null || dinij.isEmpty()) && (dinim==null || dinim.isEmpty()) ) {
				
				ps.setString(10,"");
				ps.setString(11, "");
				ps.setString(12,"");
			}else {

				n2=1;
				
				if(dinij!=null && !dinij.isEmpty()) {
					
					dinijd=Double.parseDouble(dinij)*0.2;
					ps.setString(10,String.format("%,.1f", dinijd));
				}else {
					ps.setString(10,"");
				}
				
               if(dinim!=null && !dinim.isEmpty()) {
					
				    dinimd=Double.parseDouble(dinim)*0.8;
					ps.setString(11,String.format("%,.1f", dinimd));
				}else {
					ps.setString(11,"");
				}
				
               dinia=dinijd+dinimd;
				ps.setString(12, String.format("%,.1f", dinia));
				
				
				
			}
			
			
				if((dinij==null || dinij.isEmpty()) && (dinim==null || dinim.isEmpty()) ) {
				 ps.setString(13, "");cmd="";
				 
			}else {
				
				

					if(dinia>=grd1 && dinia<=grd2){
					       ps.setString(13, "A");cmd="VIZURI SANA";
					      }else if(dinia>=grd3 && dinia< grd4){
					    	  ps.setString(13, "B");cmd="VIZURI";
					      }
					      else if(dinia>=grd5 && dinia< grd6){
					    	  ps.setString(13, "C");cmd="WASTANI";
					      }
					      else if(dinia>= grd7 && dinia< grd8){
					    	  ps.setString(13, "D");cmd="DHAIFU";
						      }
						      else  {
						    	  ps.setString(13, "F");cmd="MBAYA SANA";
						      }
			}
				
					
			    	
				if((kiswaj==null || kiswaj.isEmpty()) && (kiswam==null || kiswam.isEmpty()) ) {
				
				ps.setString(14,"");
				ps.setString(15, "");
				ps.setString(16,"");
			}else {

				n3=1;
				
				if(kiswaj!=null && !kiswaj.isEmpty()) {
					
					kiswajd=Double.parseDouble(kiswaj)*0.2;
					ps.setString(14,String.format("%,.1f", kiswajd));
				}else {
					ps.setString(14,"");
				}
				
               if(kiswam!=null && !kiswam.isEmpty()) {
					
				    kiswamd=Double.parseDouble(kiswam)*0.8;
					ps.setString(15,String.format("%,.1f", kiswamd));
				}else {
					ps.setString(15,"");
				}
				
               kiswaa=kiswajd+kiswamd;
				ps.setString(16,String.format("%,.1f", kiswaa));
				
				
				
			}
			
				if((kiswaj==null || kiswaj.isEmpty()) && (kiswam==null || kiswam.isEmpty()) ) {
				
				 ps.setString(17, "");cmk="";
				
			}else {
				
				
				 if(kiswaa>=grd1 && kiswaa<=grd2){
				       ps.setString(17, "A");cmk="VIZURI SANA";
				      }else if(kiswaa>=grd3 && kiswaa< grd4){
				    	  ps.setString(17, "B");cmk="VIZURI";
				      }
				      else if(kiswaa>=grd5 && kiswaa< grd6){
				    	  ps.setString(17, "C");cmk="WASTANI";
				      }
				      else if(kiswaa>= grd7 && kiswaa< grd8){
				    	  ps.setString(17, "D");cmk="DHAIFU";
					      }
					      else  {
					    	  ps.setString(17, "F");cmk="MBAYA SANA";
					      }
			}
						
				    	
				if((englj==null || englj.isEmpty()) && (englm==null || englm.isEmpty()) ) {
				ps.setString(18,"");
				ps.setString(19, "");
				ps.setString(20,"");
				
			}else {

				n4=1;
				
				if(englj!=null && !englj.isEmpty()) {
					
					engljd=Double.parseDouble(englj)*0.2;
					ps.setString(18,String.format("%,.1f", engljd));
				}else {
					ps.setString(18,"");
				}
				
               if(englm!=null && !englm.isEmpty()) {
					
				    englmd=Double.parseDouble(englm)*0.8;
					ps.setString(19,String.format("%,.1f", englmd));
				}else {
					ps.setString(19,"");
				}
				
               engla=engljd+englmd;
				ps.setString(20,String.format("%,.1f", engla));
				
				
				
			}
				
				if((englj==null || englj.isEmpty()) && (englm==null || englm.isEmpty()) ) {
				 ps.setString(21, "");cme="";
				
			}else {
				
				
				 if(engla>=grd1 && engla<=grd2){
				       ps.setString(21, "A");cme="VIZURI SANA";
				      }else if(engla>=grd3 && engla< grd4){
				    	  ps.setString(21, "B");cme="VIZURI";
				      }
				      else if(engla>=grd5 && engla< grd6){
				    	  ps.setString(21, "C");cme="WASTANI";
				      }
				      else if(engla>= grd7 && engla< grd8){
				    	  ps.setString(21, "D");cme="DHAIFU";
					      }
					      else  {
					    	  ps.setString(21, "F");cme="MBAYA SANA";
					      }
			
			}
							
					    	
				if((phyj==null || phyj.isEmpty()) && (phym==null || phym.isEmpty()) ) {
				
				ps.setString(22,"");
				ps.setString(23, "");
				ps.setString(24,"");
			}else {

				n5=1;
				
				if(phyj!=null && !phyj.isEmpty()) {
					
					phyjd=Double.parseDouble(phyj)*0.2;
					ps.setString(22,String.format("%,.1f", phyjd));
				}else {
					ps.setString(22,"");
				}
				
               if(phym!=null && !phym.isEmpty()) {
					
				    phymd=Double.parseDouble(phym)*0.8;
					ps.setString(23,String.format("%,.1f", phymd));
				}else {
					ps.setString(23,"");
				}
				
               phya=phyjd+phymd;
				ps.setString(24,String.format("%,.1f", phya));
				
				
				
			}
			
				if((phyj==null || phyj.isEmpty()) && (phym==null || phym.isEmpty()) ) {
				 ps.setString(25, "");cmp="";
			}else {
				
				 if(phya>=grd1 && phya<=grd2){
				       ps.setString(25, "A");cmp="VIZURI SANA";
				      }else if(phya>=grd3 && phya< grd4){
				    	  ps.setString(25, "B");cmp="VIZURI";
				      }
				      else if(phya>=grd5 && phya< grd6){
				    	  ps.setString(25, "C");cmp="WASTANI";
				      }
				      else if(phya>= grd7 && phya< grd8){
				    	  ps.setString(25, "D");cmp="DHAIFU";
					      }
					      else  {
					    	  ps.setString(25, "F");cmp="MBAYA SANA";
					      }
			
				
			}
								
				if((chej==null ||chej.isEmpty()) && (chem==null || chem.isEmpty()) ) {
				
				ps.setString(26,"");
				ps.setString(27, "");
				ps.setString(28,"");
			}else {

				n6=1;
				
				if(chej!=null && !chej.isEmpty()) {
					
					chejd=Double.parseDouble(chej)*0.2;
					ps.setString(26,String.format("%,.1f", chejd));
				}else {
					ps.setString(26,"");
				}
				
               if(chem!=null && !chem.isEmpty()) {
					
				    chemd=Double.parseDouble(chem)*0.8;
					ps.setString(27,String.format("%,.1f", chemd));
				}else {
					ps.setString(27,"");
				}
				
               chea=chejd+chemd;
				ps.setString(28,String.format("%,.1f", chea));
				
				
				
			}
				
				if((chej==null ||chej.isEmpty()) && (chem==null || chem.isEmpty()) ) {
				
				  ps.setString(29, "");cmch="";
			}else {
				
				if(chea>=grd1 && chea<=grd2){
				       ps.setString(29, "A");cmch="VIZURI SANA";
				      }else if(chea>=grd3 && chea< grd4){
				    	  ps.setString(29, "B");cmch="VIZURI";
				      }
				      else if(chea>=grd5 && chea< grd6){
				    	  ps.setString(29, "C");cmch="WASTANI";
				      }
				      else if(chea>= grd7 && chea< grd8){
				    	  ps.setString(29, "D");cmch="DHAIFU";
					      }
					      else  {
					    	  ps.setString(29, "F");cmch="MBAYA SANA";
					      }
			}
				
						    	
									
				if((bioj==null ||bioj.isEmpty()) && (biom==null || biom.isEmpty()) ) {
				

		    	ps.setString(30,"");
				ps.setString(31, "");
				ps.setString(32,"");
				
			}else {

				n7=1;
				
				if(bioj!=null && !bioj.isEmpty()) {
					
					biojd=Double.parseDouble(bioj)*0.2;
					ps.setString(30,String.format("%,.1f", biojd));
				}else {
					ps.setString(30,"");
				}
				
               if(biom!=null && !biom.isEmpty()) {
					
				    biomd=Double.parseDouble(biom)*0.8;
					ps.setString(31,String.format("%,.1f", biomd));
				}else {
					ps.setString(31,"");
				}
				
               bioa=biojd+biomd;
				ps.setString(32,String.format("%,.1f", bioa));
				
				
				
			}
			
				if((bioj==null ||bioj.isEmpty()) && (biom==null || biom.isEmpty()) ) {
				
				 ps.setString(33, "");cmb="";
			}else {

		    	if(bioa>=grd1 && bioa<=grd2){
		       ps.setString(33, "A");cmb="VIZURI SANA";
		      }else if(bioa>=grd3 && bioa< grd4){
		    	  ps.setString(33, "B");cmb="VIZURI";
		      }
		      else if(bioa>=grd5 && bioa< grd6){
		    	  ps.setString(33, "C");cmb="WASTANI";
		      }
		      else if(bioa>= grd7 && bioa< grd8){
		    	  ps.setString(33, "D");cmb="DHAIFU";
			      }
			      else  {
			    	  ps.setString(33, "F");cmb="MBAYA SANA";
			      }
				
			}
				
				if((mathj==null ||mathj.isEmpty()) && (mathm==null || mathm.isEmpty()) ) {
				ps.setString(34,"");
				ps.setString(35, "");
				ps.setString(36,"");
					
				
			}else {

				n8=1;
				
				if(mathj!=null && !mathj.isEmpty()) {
					
					mathjd=Double.parseDouble(mathj)*0.2;
					ps.setString(34,String.format("%,.1f", mathjd));
				}else {
					ps.setString(34,"");
				}
				
               if(mathm!=null && !mathm.isEmpty()) {
					
				    mathmd=Double.parseDouble(mathm)*0.8;
					ps.setString(35,String.format("%,.1f", mathmd));
				}else {
					ps.setString(35,"");
				}
				
               matha=mathjd+mathmd;
				ps.setString(36,String.format("%,.1f", matha));
				
				
				
			}
							
				if((mathj==null ||mathj.isEmpty()) && (mathm==null || mathm.isEmpty()) ) {
				
				 ps.setString(37, "");cmm="";
			}else {
				
				if(matha>=grd1 && matha<=grd2){
				       ps.setString(37, "A");cmm="VIZURI SANA";
				      }else if(matha>=grd3 && matha< grd4){
				    	  ps.setString(37, "B");cmm="VIZURI";
				      }
				      else if(matha>=grd5 && matha< grd6){
				    	  ps.setString(37, "C");cmm="WASTANI";
				      }
				      else if(matha>= grd7 && matha< grd8){
				    	  ps.setString(37, "D");cmm="DHAIFU";
					      }
					      else  {
					    	  ps.setString(37, "F");cmm="MBAYA SANA";
					      }
			}
									    	
			if((hisj==null || hisj.isEmpty()) && (hism==null || hism.isEmpty()) ) {
				
				ps.setString(38,"");
				ps.setString(39, "");
				ps.setString(40,"");
				
			}else {

				n9=1;
				
				if(hisj!=null && !hisj.isEmpty()) {
					
					hisjd=Double.parseDouble(hisj)*0.2;
					ps.setString(38,String.format("%,.1f", hisjd));
				}else {
					ps.setString(38,"");
				}
				
               if(hism!=null && !hism.isEmpty()) {
					
				    hismd=Double.parseDouble(hism)*0.8;
					ps.setString(39,String.format("%,.1f", hismd));
				}else {
					ps.setString(39,"");
				}
				
               hisa=hisjd+hismd;
				ps.setString(40,String.format("%,.1f", hisa));
				
				
				
			}
						
			if((hisj==null || hisj.isEmpty()) && (hism==null || hism.isEmpty()) ) {
				  ps.setString(41, "");cmh="";
				
			}else {
				
				if(hisa>=grd1 && hisa<=grd2){
				       ps.setString(41, "A");cmh="VIZURI SANA";
				      }else if(hisa>=grd3 && hisa< grd4){
				    	  ps.setString(41, "B");cmh="VIZURI";
				      }
				      else if(hisa>=grd5 && hisa< grd6){
				    	  ps.setString(41, "C");cmh="WASTANI";
				      }
				      else if(hisa>= grd7 && hisa< grd8){
				    	  ps.setString(41, "D");cmh="DHAIFU";
					      }
					      else  {
					    	  ps.setString(41, "F");cmh="MBAYA SANA";
					      }
			
			}
										    	
			if((araj==null || araj.isEmpty()) && (aram==null || aram.isEmpty()) ) {
										    		ps.setString(42,"");
													ps.setString(43, "");
													ps.setString(44,"");
													
										    		
										    	}else {

													n10=1;
													
													if(araj!=null && !araj.isEmpty()) {
														
														arajd=Double.parseDouble(araj)*0.2;
														ps.setString(42,String.format("%,.1f", arajd));
													}else {
														ps.setString(42,"");
													}
													
									               if(aram!=null && !aram.isEmpty()) {
														
													    aramd=Double.parseDouble(aram)*0.8;
														ps.setString(43,String.format("%,.1f", aramd));
													}else {
														ps.setString(43,"");
													}
													
									               araa=arajd+aramd;
													ps.setString(44,String.format("%,.1f", araa));
													
													
													
												}
										    		
			                              if((araj==null || araj.isEmpty()) && (aram==null || aram.isEmpty()) ) {
										    		 ps.setString(45, "");cmar="";
										    		
										    	}else {
										    		

										    		
										    			if(araa>=grd1 && araa<=grd2){
										    				  ps.setString(45, "A");cmar="VIZURI SANA";
										    			}
													     
													      else if(araa>=grd3 && araa< grd4){
													    	  ps.setString(45, "B");cmar="VIZURI";
													      }
													      else if(araa>=grd5 && araa< grd6){
													    	  ps.setString(45, "C");cmar="WASTANI";
													      }
													      else if(araa>= grd7 && araa< grd8){
													    	  ps.setString(45, "D");cmar="DHAIFU";
														      }
														      else  {
														    	  ps.setString(45, "F");cmar="MBAYA SANA";
														      }
										    	
										    		
										    	}
										    		
			                              
			                          	if((litj==null || litj.isEmpty()) && (litm==null || litm.isEmpty()) ) {
								    		ps.setString(46,"");
											ps.setString(47, "");
											ps.setString(48,"");
											
								    		
								    	}else {

											n11=1;
											
											if(litj!=null && !litj.isEmpty()) {
												
												litjd=Double.parseDouble(litj)*0.2;
												ps.setString(46,String.format("%,.1f", litjd));
											}else {
												ps.setString(46,"");
											}
											
							               if(litm!=null && !litm.isEmpty()) {
												
											    litmd=Double.parseDouble(litm)*0.8;
												ps.setString(47,String.format("%,.1f", litmd));
											}else {
												ps.setString(47,"");
											}
											
							               lita=litjd+litmd;
											ps.setString(48,String.format("%,.1f", lita));
											
											
											
										}
								    		
	                              if((litj==null || litj.isEmpty()) && (litm==null || litm.isEmpty()) ) {
								    		 ps.setString(49, "");cml="";
								    		
								    	}else {
								    		

								    		
								    			if(lita>=grd1 && lita<=grd2){
								    				  ps.setString(49, "A");cml="VIZURI SANA";
								    			}
											     
											      else if(lita>=grd3 && lita< grd4){
											    	  ps.setString(49, "B");cml="VIZURI";
											      }
											      else if(lita>=grd5 && lita< grd6){
											    	  ps.setString(49, "C");cml="WASTANI";
											      }
											      else if(lita>= grd7 && lita< grd8){
											    	  ps.setString(49, "D");cml="DHAIFU";
												      }
												      else  {
												    	  ps.setString(49, "F");cml="MBAYA SANA";
												      }
								    	
								    		
								    	}
								    	
	                             
				                                  String avg="";
				                                   toto=n0+n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11;
					    							sum=cva+geoa+dinia+kiswaa+engla+phya+chea+bioa+matha+hisa+araa+lita;
					    							int i=0,j=0,p=0,total=0;
					    							double temp=0.0;
					    							String tot="";
					    							
					    							if(toto>=7) {
					    							Double mudi[]= {cva,geoa,dinia,kiswaa,engla,phya,chea,bioa,matha,hisa,araa,lita};
					    							Double ave=sum/toto;
					    						    avg=String.format("%,.4f", ave);
					    			
					    							
					    							for(i=0;i<7;i++){
					    								for(j=i+1;j<mudi.length;j++) {
					    									if( mudi[i]<mudi[j]) {
					    										temp=mudi[i];
					    										mudi[i]=mudi[j];
					    										mudi[j]=temp;
					    										
					    										
					    										
					    									}
					    									
					    								}
					    								

					    							       	if(mudi[i]>=75 && mudi[i]<=100){
					    								       p=1;
					    								      }else if(mudi[i]>=65 && mudi[i]<75){
					    								    	 p=2;
					    								      }
					    								      else if(mudi[i]>=45 && mudi[i]<65){
					    								    	  p=3;
					    								      }
					    								      else if(mudi[i]>=30 && mudi[i]<45){
					    								    	  p=4;
					    									      }
					    									  else {
					    										  p=5;
					    									      }
					    									 
					    							     	 total=p+total;
					    							     	 tot=Integer.toString(total);
					    								
					    							}

					    							

					    								
					    							}else {
					    								
					    								avg="Inc";
					    								tot="Inc";

					    								
					    							}
					    							                                                                                               

				                                   
					    							     ps.setString(50, avg);
				                                         ps.setString(51, tot);
				                                         ps.setString(52, rs.getString("class"));
				                                         ps.setString(53,rs.getString("year") );
				                                         ps.setString(54, rs.getString("first"));
				                                         ps.setString(55, rs.getString("last"));
				                                         ps.setString(56, rs.getString("gender"));
				                                         ps.setString(57, rs.getString("sch"));
				                                         ps.setString(58, cmc);
				                                         ps.setString(59, cmg);
				                                         ps.setString(60, cmk);
				                                         ps.setString(61, cme);
				                                         ps.setString(62, cmch);
				                                         ps.setString(63, cmm);
				                                         ps.setString(64, cmb);
			                                            	ps.setString(65, cmp);
			                                            	ps.setString(66, cmar);
				                                         ps.setString(67, cmh);
			                                            	ps.setString(68, cmd);
			                                            	ps.setString(69, cml);
				
				                                         ps.addBatch();
				                                         ps.executeBatch();
				
				
				
				}
				
				//System.out.println(nam1);
 				
 			}else {
 				
 				JOptionPane.showMessageDialog(null, "No user with that Record !");
 			}
			
			
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Data Already Present !");
		}
		
		
		
	}catch(Exception ex) {
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
	
	

		
	}

	private void table3() {
		if(boxn.getSelectedItem().equals("KIDATO CHA I") || boxn.getSelectedItem().equals("KIDATO CHA II") || boxn.getSelectedItem().equals("KIDATO CHA III") || boxn.getSelectedItem().equals("KIDATO CHA IV") ) {
    		try {
    			
    			String sql="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',engl as 'ENGLISH',kiswa as 'KISWAHILI',ara as 'ARABIC',math as 'MATH',geo as 'GEOGRAPHY',bio as 'BIOLOGY',dini as 'DINI',cv as 'CIVICS',his as 'HISTORY',phy as 'PHYSICS',che as 'CHEMISTRY' ,lit as LITERATURE from mark1 where class='"+boxn.getSelectedItem().toString()+"' ORDER BY gender ASC,first ASC,last ASC ";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				table2.setModel(DbUtils.resultSetToTableModel(rs));
				table2.setFont(new Font("serif",Font.PLAIN,11));
				table2.setForeground(new Color(0,0,139));
    		}catch(Exception ex) {
    			
    		}
		}
	}

	private void table2() {
 
    	boxn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			
		    	if(boxn.getSelectedItem().equals("KIDATO CHA I") || boxn.getSelectedItem().equals("KIDATO CHA II") || boxn.getSelectedItem().equals("KIDATO CHA III") || boxn.getSelectedItem().equals("KIDATO CHA IV") ) {
		    		try {
		    			
		    			String sql="Select id as 'USER ID',first as 'FIRST NAME',last as 'LAST NAME',engl as 'ENGLISH',kiswa as 'KISWAHILI',ara as 'ARABIC',math as 'MATH',geo as 'GEOGRAPHY',bio as 'BIOLOGY',dini as 'DINI',cv as 'CIVICS',his as 'HISTORY',phy as 'PHYSICS',che as 'CHEMISTRY' ,lit as LITERATURE from mark1 where class='"+boxn.getSelectedItem().toString()+"'  ORDER BY gender ASC,first ASC,last ASC";
	    				ps=con.prepareStatement(sql);
	    				rs=ps.executeQuery();
	    				table2.setModel(DbUtils.resultSetToTableModel(rs));
	    				table2.setFont(new Font("serif",Font.PLAIN,11));
	    				table2.setForeground(new Color(0,0,139));
	    				
	    				ban.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
                          try {
                        	  int rows = table2.getRowCount();
			    				for(int row = 0;row <rows; row++) {
			    					String id = (String) table2.getValueAt(row, 0);
			    					String english = (String) table2.getValueAt(row, 3);
			    					String kiswahili = (String) table2.getValueAt(row, 4);
			    					String arabic = (String) table2.getValueAt(row, 5);
			    					String mathe = (String) table2.getValueAt(row, 6);
			    					String geography = (String) table2.getValueAt(row, 7);
			    					String biology = (String) table2.getValueAt(row, 8);
			    					String din = (String) table2.getValueAt(row, 9);
			    					String civics = (String) table2.getValueAt(row, 10);
			    					String history = (String) table2.getValueAt(row, 11);
			    					String physics = (String) table2.getValueAt(row, 12);
			    					String chemistry = (String) table2.getValueAt(row, 13);
			    					String literature = (String) table2.getValueAt(row, 14);
			    					
			    					
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
			    					String g10="",m10;
			    					String g11="",m11;
			    					String avg="";
			    					String point="";
			    					
			    					double cv=0.0,geo=0.0,dini=0.0,kiswa=0.0,engl=0.0,phy=0.0,che=0.0,bio=0.0,math=0.0,his=0.0,ara=0.0,lit=0.0;
			    					String cme="",cmk="",cmd="",cma="",cmg="",cmc="",cmh="",cmp="",cmm="",cmch="",cmb="",cml="";
			    				
			    	                
			    						if(civics.isEmpty() ||civics.matches("-")) {
			    							
			    							if(civics.isEmpty()) {
			    								g0="";m0="";cmc="";
			    							}else {
			    								g0="-";m0="-";cmc="-";
			    							}
			    							
			    					}else {
			    							m0=civics;
			    						
			    					
			    					if(!civics.isEmpty() && !civics.matches("-")) {
			    						 cv=Double.parseDouble(civics);
			    					
			    					if(cv>=grd1 && cv<=grd2){
			    				       g0="A";cmc="VIZURI SANA";
			    				      }else if(cv>=grd3 && cv<grd4){
			    				    	  g0="B";cmc="VIZURI";
			    				      }
			    				      else if(cv>=grd5 && cv<grd6){
			    				    	  g0="C";cmc="WASTANI";
			    				      }
			    				      else if(cv>=grd7 && cv<grd8){
			    				    	  g0="D";cmc="DHAIFU";
			    					      }
			    					      else  if(cv>=grd9 && cv<grd10){
			    					    	  g0= "F";cmc="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						if(geography.isEmpty() ||geography.matches("-")) {

			    							if(geography.isEmpty()) {
			    								g1="";m1="";cmg="";
			    							}else {
			    								g1="-";m1="-";cmg="-";
			    							}
			    					}else {
			    							m1=geography;
			    						
			    					
			    					if(!geography.isEmpty() && !geography.matches("-")) {
			    						 geo=Double.parseDouble(geography);
			    					
			    					if(geo>=grd1 && geo<=grd2){
			    				       g1="A";cmg="VIZURI SANA";
			    				      }else if(geo>=grd3 && geo<grd4){
			    				    	  g1="B";cmg="VIZURI";
			    				      }
			    				      else if(geo>=grd5 && geo<grd6){
			    				    	  g1="C";cmg="WASTANI";
			    				      }
			    				      else if(geo>=grd7 && geo<grd8){
			    				    	  g1="D";cmg="DHAIFU";
			    					      }
			    					      else if(geo>=grd9 && geo<grd10) {
			    					    	  g1= "F";cmg="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						if(din.isEmpty() ||din.matches("-")) {

			    							if(din.isEmpty()) {
			    								g2="";m2="";cmd="";
			    							}else {
			    								g2="-";m2="-";cmd="-";
			    							}
			    					}else {
			    							m2=din;
			    						
			    					
			    					if(!din.isEmpty() && !din.matches("-")) {
			    						dini=Double.parseDouble(din);
			    					
			    					if(dini>=grd1 && dini<=grd2){
			    				       g2="A";cmd="VIZURI SANA";
			    				      }else if(dini>=grd3 && dini<grd4){
			    				    	  g2="B";cmd="VIZURI";
			    				      }
			    				      else if(dini>=grd5 && dini<grd6){
			    				    	  g2="C";cmd="WASTANI";
			    				      }
			    				      else if(dini>=grd7 && dini<grd8){
			    				    	  g2="D";cmd="DHAIFU";
			    					      }
			    					      else if(dini>=grd9 && dini<grd10) {
			    					    	  g2= "F";cmd="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						if(kiswahili.isEmpty() ||kiswahili.matches("-")) {

			    							if(kiswahili.isEmpty()) {
			    								g3="";m3="";cmk="";
			    							}else {
			    								g3="-";m3="-";cmk="-";
			    							}
			    					}else {
			    							m3=kiswahili;
			    						
			    					
			    					if(!kiswahili.isEmpty() && !kiswahili.matches("-")) {
			    						kiswa=Double.parseDouble(kiswahili);
			    					
			    					if(kiswa>=grd1 && kiswa<=grd2){
			    				       g3="A";cmk="VIZURI SANA";
			    				      }else if(kiswa>=grd3 && kiswa<grd4){
			    				    	  g3="B";cmk="VIZURI";
			    				      }
			    				      else if(kiswa>=grd5 && kiswa<grd6){
			    				    	  g3="C";cmk="WASTANI";
			    				      }
			    				      else if(kiswa>=grd7 && kiswa<grd8){
			    				    	  g3="D";cmk="DHAIFU";
			    					      }
			    					      else  if(kiswa>=grd9 && kiswa<grd10) {
			    					    	  g3= "F";cmk="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						if(english.isEmpty() ||english.matches("-")) {

			    							if(english.isEmpty()) {
			    								g4="";m4="";
			    							}else {
			    								g4="-";m4="-";
			    							}
			    					}else {
			    							m4=english;
			    						
			    					
			    					if(!english.isEmpty() && !english.matches("-")) {
			    						engl=Double.parseDouble(english);
			    					
			    					if(engl>=grd1 && engl<=grd2){
			    				       g4="A";cme="VIZURI SANA";
			    				      }else if(engl>=grd3 && engl<grd4){
			    				    	  g4="B";cme="VIZURI";
			    				      }
			    				      else if(engl>=grd5 && engl<grd6){
			    				    	  g4="C";cme="WASTANI";
			    				      }
			    				      else if(engl>=grd7 && engl<grd8){
			    				    	  g4="D";cme="DHAIFU";
			    					      }
			    					      else if(engl>=grd9 && engl<grd10) {
			    					    	  g4= "F";cme="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						if(physics.isEmpty() ||physics.matches("-")) {

			    							if(physics.isEmpty()) {
			    								g5="";m5="";cmp="";
			    							}else {
			    								g5="-";m5="-";cmp="-";
			    							}
			    					}else {
			    							m5=physics;
			    						
			    					
			    					if(!physics.isEmpty() && !physics.matches("-")) {
			    					 phy=Double.parseDouble(physics);
			    					
			    					if(phy>=grd1 && phy<=grd2){
			    				       g5="A";cmp="VIZURI SANA";
			    				      }else if(phy>=grd3 && phy<grd4){
			    				    	  g5="B";cmp="VIZURI";
			    				      }
			    				      else if(phy>=grd5 && phy<grd6){
			    				    	  g5="C";cmp="WASTANI";
			    				      }
			    				      else if(phy>=grd7 && phy<grd8){
			    				    	  g5="D";cmp="DHAIFU";
			    					      }
			    					      else  if(phy>=grd9 && phy<grd10){
			    					    	  g5= "F";cmp="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						if(chemistry.isEmpty() ||chemistry.matches("-")) {

			    							if(chemistry.isEmpty()) {
			    								g6="";m6="";cmch="";
			    							}else {
			    								g6="-";m6="-";cmch="-";
			    							}
			    					}else {
			    							m6=chemistry;
			    						
			    					
			    					if(!chemistry.isEmpty() && !chemistry.matches("-")) {
			    			     che=Double.parseDouble(chemistry);
			    					
			    					if(che>=grd1 && che<=grd2){
			    				       g6="A";cmch="VIZURI SANA";
			    				      }else if(che>=grd3 && che<grd4){
			    				    	  g6="B";cmch="VIZURI";
			    				      }
			    				      else if(che>=grd5 && che<grd6){
			    				    	  g6="C";cmch="WASTANI";
			    				      }
			    				      else if(che>=grd7 && che<grd8){
			    				    	  g6="D";cmch="DHAIFU";
			    					      }
			    					      else if(che>=grd9 && che<grd10) {
			    					    	  g6= "F";cmch="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						if(biology.isEmpty() ||biology.matches("-")) {

			    							if(biology.isEmpty()) {
			    								g7="";m7="";cmb="";
			    							}else {
			    								g7="-";m7="-";cmb="-";
			    							}
			    					}else {
			    							m7=biology;
			    						
			    					
			    					if(!biology.isEmpty() && !biology.matches("-")) {
			    						 bio=Double.parseDouble(biology);
			    					
			    					if(bio>=grd1 && bio<=grd2){
			    				       g7="A";cmb="VIZURI SANA";
			    				      }else if(bio>=grd3 && bio<grd4){
			    				    	  g7="B";cmb="VIZURI";
			    				      }
			    				      else if(bio>=grd5 && bio<grd6){
			    				    	  g7="C";cmb="WASTANI";
			    				      }
			    				      else if(bio>=grd7 && bio<grd8){
			    				    	  g7="D";cmb="DHAIFU";
			    					      }
			    					      else if(bio>=grd9 && bio<grd10) {
			    					    	  g7= "F";cmb="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						
			    						if(mathe.isEmpty() ||mathe.matches("-")) {

			    							if(mathe.isEmpty()) {
			    								g8="";m8="";cmm="";
			    							}else {
			    								g8="-";m8="-";cmm="-";
			    							}
			    					}else {
			    							m8=mathe;
			    						
			    					
			    					if(!mathe.isEmpty() && !mathe.matches("-")) {
			    						 math=Double.parseDouble(mathe);
			    					
			    					if(math>=grd1 && math<=grd2){
			    				       g8="A";cmm="VIZURI SANA";
			    				      }else if(math>=grd3 && math<grd4){
			    				    	  g8="B";cmm="VIZURI";
			    				      }
			    				      else if(math>=grd5 && math<grd6){
			    				    	  g8="C";cmm="WASTANI";
			    				      }
			    				      else if(math>=grd7 && math<grd8){
			    				    	  g8="D";cmm="DHAIFU";
			    					      }
			    					      else if(math>=grd9 && math<grd10) {
			    					    	  g8= "F";cmm="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						
			    						if(history.isEmpty() ||history.matches("-")) {

			    							if(history.isEmpty()) {
			    								g9="";m9="";cmh="";
			    							}else {
			    								g9="-";m9="-";cmh="-";
			    							}
			    					}else {
			    							m9=history;
			    						
			    					
			    					if(!history.isEmpty() && !history.matches("-")) {
			    						 his=Double.parseDouble(history);
			    					
			    					if(his>=grd1 && his<=grd2){
			    				       g9="A";cmh="VIZURI SANA";
			    				      }else if(his>=grd3 && his<grd4){
			    				    	  g9="B";cmh="VIZURI";
			    				      }
			    				      else if(his>=grd5 && his<grd6){
			    				    	  g9="C";cmh="WASTANI";
			    				      }
			    				      else if(his>=grd7 && his<grd8){
			    				    	  g9="D";cmh="DHAIFU";
			    					      }
			    					      else if(his>=grd9 && his<grd10) {
			    					    	  g9= "F";cmh="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						if(arabic.isEmpty() ||arabic.matches("-")) {

			    							if(arabic.isEmpty()) {
			    								g10="";m10="";cma="";
			    							}else {
			    								g10="-";m10="-";cma="";
			    							}
			    					}else {
			    							m10=arabic;
			    						
			    					
			    					if(!arabic.isEmpty() && !arabic.matches("-")) {
			    						 ara=Double.parseDouble(arabic);
			    					
			    					if(ara>=grd1 && ara<=grd2){
			    				       g10="A";cma="VIZURI SANA";
			    				      }else if(ara>=grd3 && ara<grd4){
			    				    	  g10="B";cma="VIZURI";
			    				      }
			    				      else if(ara>=grd5 && ara<grd6){
			    				    	  g10="C";cma="WASTANI";
			    				      }
			    				      else if(ara>=grd7 && ara<grd8){
			    				    	  g10="D";cma="DHAIFU";
			    					      }
			    					      else  if(ara>=grd9 && ara<grd10){
			    					    	  g10= "F";cma="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						if(literature.isEmpty() ||literature.matches("-")) {

			    							if(literature.isEmpty()) {
			    								g11="";m11="";cml="";
			    							}else {
			    								g11="-";m11="-";cml="";
			    							}
			    					}else {
			    							m11=literature;
			    						
			    					
			    					if(!literature.isEmpty() && !literature.matches("-")) {
			    						 lit=Double.parseDouble(literature);
			    					
			    					if(lit>=grd1 && lit<=grd2){
			    				       g11="A";cml="VIZURI SANA";
			    				      }else if(lit>=grd3 && lit<grd4){
			    				    	  g11="B";cml="VIZURI";
			    				      }
			    				      else if(lit>=grd5 && lit<grd6){
			    				    	  g11="C";cml="WASTANI";
			    				      }
			    				      else if(lit>=grd7 && lit<grd8){
			    				    	  g11="D";cml="DHAIFU";
			    					      }
			    					      else  if(lit>=grd9 && lit<grd10){
			    					    	  g11= "F";cml="MBAYA SANA";
			    					      }
			    					      
			    					}
			    					}
			    						
			    						
			    						
			    						
			    						
			    						
			    						int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n10=0,n11=0,toto=0;
			    				
			    						double sum;


			    						if(civics.matches("-") ||civics.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n0=1;
			    							cv=Double.parseDouble(civics);
			    						}
			    							
			    						if(geography.matches("-") ||geography.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n1=1;
			    						    geo=Double.parseDouble(geography);
			    						}
			    						if(din.matches("-") ||din.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n2=1;
			    						    dini=Double.parseDouble(din);
			    						}

			    						if(kiswahili.matches("-") ||kiswahili.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n3=1;
			    						    kiswa=Double.parseDouble(kiswahili);
			    						}

			    						if(english.matches("-") ||english.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n4=1;
			    						    engl=Double.parseDouble(english);
			    						}

			    						if(physics.matches("-") ||physics.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n5=1;
			    						    phy=Double.parseDouble(physics);
			    						}
			    						if(chemistry.matches("-") ||chemistry.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n6=1;
			    						    che=Double.parseDouble(chemistry);
			    						}
			    						if(biology.matches("-") ||biology.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n7=1;
			    						    bio=Double.parseDouble(biology);
			    						}

			    						if(mathe.matches("-") ||mathe.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n8=1;
			    						   math=Double.parseDouble(mathe);
			    						}
			    						
			    						if(history.matches("-") ||history.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n9=1;
			    						   his=Double.parseDouble(history);
			    						}
			    						
			    						if(arabic.matches("-") ||arabic.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n10=1;
			    						   ara=Double.parseDouble(arabic);
			    						}
			    						
			    						if(literature.matches("-") ||literature.isEmpty()) {
			    							 
			    						}else  {
			    							
			    							n11=1;
			    						   lit=Double.parseDouble(literature);
			    						}
			    							toto=n0+n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11;
			    							sum=cv+geo+dini+kiswa+engl+phy+che+bio+math+his+ara;
			    							int i=0,j=0,p=0,total=0;
			    							double temp=0.0;
			    							String tot="";
			    							
			    							if(toto>=7) {
			    							Double mudi[]= {cv,geo,dini,kiswa,engl,phy,che,bio,math,his,ara,lit};
			    							Double ave=sum/toto;
			    						    avg=String.format("%,.4f", ave);
			    			
			    							
			    							for(i=0;i<7;i++){
			    								for(j=i+1;j<mudi.length;j++) {
			    									if( mudi[i]<mudi[j]) {
			    										temp=mudi[i];
			    										mudi[i]=mudi[j];
			    										mudi[j]=temp;
			    										
			    										
			    										
			    									}
			    									
			    								}
			    								

			    							       	if(mudi[i]>=75 && mudi[i]<=100){
			    								       p=1;
			    								      }else if(mudi[i]>=65 && mudi[i]<75){
			    								    	 p=2;
			    								      }
			    								      else if(mudi[i]>=45 && mudi[i]<65){
			    								    	  p=3;
			    								      }
			    								      else if(mudi[i]>=30 && mudi[i]<45){
			    								    	  p=4;
			    									      }
			    									  else {
			    										  p=5;
			    									      }
			    									 
			    							     	 total=p+total;
			    							     	 tot=Integer.toString(total);
			    								
			    							}

			    							

			    								
			    							}else {
			    								
			    								avg="Inc";
			    								tot="Inc";

			    								
			    							}
			    							                                                                                               

			    							if(((cv>=0 &&cv<=100) ||civics.isEmpty()) && ((geo>=0 &&geo<=100) ||geography.isEmpty()) && ((dini>=0 &&dini<=100) ||din.isEmpty()) && ((kiswa>=0 &&kiswa<=100) ||kiswahili.isEmpty()) &&  ((engl>=0 &&engl<=100) ||english.isEmpty()) && ((phy>=0 &&phy<=100) ||physics.isEmpty()) && ((che>=0 &&che<=100) ||chemistry.isEmpty()) &&  ((bio>=0 &&bio<=100) ||biology.isEmpty()) && ((math>=0 &&math<=100) ||mathe.isEmpty()&& ((his>=0 && his<=100) ||history.isEmpty())&& ((ara>=0 &&ara<=100) ||arabic.isEmpty()))  && ((lit>=0 &&lit<=100) ||literature.isEmpty())   ) {
			    								

			    								
			    							    String sq="update mark1 set cv='"+m0+"',gcv='"+g0+"',his='"+m9+"',ghis='"+g9+"',ara='"+m10+"',gara='"+g10+"',geo='"+m1+"',ggeo='"+g1+"',dini='"+m2+"',gdini='"+g2+"',kiswa='"+m3+"',gkiswa='"+g3+"',engl='"+m4+"',gengl='"+g4+"',phy='"+m5+"',gphy='"+g5+"',che='"+m6+"',gche='"+g6+"',bio='"+m7+"',gbio='"+g7+"',math='"+m8+"',gmath='"+g8+"',lit='"+m11+"',glit='"+g11+"',avg='"+avg+"',point='"+tot+"',cme='"+cme+"',cmk='"+cmk+"',cmd='"+cmd+"',cma='"+cma+"',cmg='"+cmg+"',cmc='"+cmc+"',cmh='"+cmh+"',cmp='"+cmp+"',cmm='"+cmm+"',cmch='"+cmch+"',cmb='"+cmb+"',cml='"+cml+"'  where id='"+id+"' ";
			    								ps=con.prepareStatement(sq);
			    								ps.addBatch();
			    								ps.executeBatch();
			    								
			    								//JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
			    							///	t20.setText("");t21.setText("");t22.setText("");t23.setText("");t24.setText("");t25.setText("");t26.setText("");t27.setText("");t28.setText("");t29.setText("");t30.setText("");
			    								
			    						    ///	area();
			    								

			    							}else {
			    								
			    								 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    							}
			    							
			    				}
			    				   }	catch(Exception ex)	{
			    					   JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
                          }
							}
	    				});
	    				
		    		}catch(Exception ex) {
		    			JOptionPane.showMessageDialog(null, ex.getMessage());
		    		}
		    		
		    	}}
    		});
	  
  
	
	}

	private void text() {
		try {
			
			String ptext="select * from text  where rowid='"+2+"'  ";
			 ps=con.prepareStatement(ptext);
			 ResultSet pt=ps.executeQuery();
			 
			 area1.setText(pt.getString("stext"));
			 
			
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
	private void grade() {
		try {
			String sql="select * from grade where rowid ='"+2+"'  ";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			//JOptionPane.showMessageDialog(null, rs.getDouble("grade1"));\
		    grad1=rs.getString("grade1");grad2=rs.getString("grade2");grad3= rs.getString("grade3");grad4= rs.getString("grade4");grad5=rs.getString("grade5");
		    grad6=rs.getString("grade6");grad7=rs.getString("grade7");grad8=rs.getString("grade8");grad9=rs.getString("grade9");grad10=rs.getString("grade10");
		    
			text1.setText( grad1);text2.setText( grad2);text3.setText( grad3);text4.setText(grad4);text5.setText(grad5 );text6.setText( grad6);text7.setText(grad7 );
			text8.setText(grad8 );text9.setText(grad9 );text10.setText( grad10);
			
			grd1=Double.parseDouble(grad1);grd2=Double.parseDouble(grad2);grd3=Double.parseDouble(grad3);grd4=Double.parseDouble(grad4);grd5=Double.parseDouble(grad5);
			grd6=Double.parseDouble(grad6);grd7=Double.parseDouble(grad7);grd8=Double.parseDouble(grad8);grd9=Double.parseDouble(grad9);grd10=Double.parseDouble(grad10);
			
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
		
		t20.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t21.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)  || (c == '-')  )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t22.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t23.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)  || (c == '-')  )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t24.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)  || (c == '-')  )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t25.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)  || (c == '-')  )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t26.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)  || (c == '-')  )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t27.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)  || (c == '-')  )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t28.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)  || (c == '-')  )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t29.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)  || (c == '-')  )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t30.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)  || (c == '-')  )){
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
				
				String s="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user1  where id LIKE ? or first LIKE ? or last LIKE ? or gender LIKE ? or class LIKE ?  or sch LIKE ? or exam LIKE ? or year LIKE ? order by sch ";                                    
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
				table.setFont(new Font("serif",Font.PLAIN,11));
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
		        	String gg="";
		      		
		      		
		      		String sql1="select * from mark1 where id='"+id+"' ";
		          	ps=con.prepareStatement(sql1);
		          	rs=ps.executeQuery();
		          	
		          	String cv="",gcv="";
		          	String geo="",ggeo="";
		          	String dini="",gdini="";
		          	String kiswa="",gkiswa="";
		          	String engl="",gengl="";
		          	String che="",gche="";
		          	String math="",gmath="";
		          	String bio="",gbio="";
		          	String phy="",gphy="";
		          	String ara="",gara="";
		          	String his="",ghis="";
		          	String lit="",glit="";
		          	
		          	String avg=rs.getString("avg");
		          	String point=rs.getString("point");
		          	String gg1="Inc";
		          	
		          	String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="",s12="";
		          	
		          	if(!rs.getString("cv").isEmpty()) {
		          		 cv=rs.getString("cv");
			          	 gcv=rs.getString("gcv");
			          	 s1=String.format("CIVICS:      %s%4s  ", cv,gcv);
		          	}else {
		          		 s1="";
		          	}
		          	if(!rs.getString("geo").isEmpty()) {
		          		 geo=rs.getString("geo");
			          	 ggeo=rs.getString("ggeo");
			          	 s2=String.format("GEOGRAPHY:      %s%4s", geo,ggeo);
		          	}else {
		          		 s2="";
		          	}
		        	
		          	if(!rs.getString("dini").isEmpty()) {
		        		 dini=rs.getString("dini");
			             gdini=rs.getString("gdini");
			          	 s3=String.format("DINI:           %s%4s  ", dini,gdini);
		          	}else {
		          		 s3="";
		          	}
		          	
		          	if(!rs.getString("kiswa").isEmpty()) {
		          		 kiswa=rs.getString("kiswa");
			          	 gkiswa=rs.getString("gkiswa");
			          	 s4=String.format("KISWAHILI:          %s%4s", kiswa,gkiswa);
		          	}else {
		          		 s4="";
		          	}
		          	if(!rs.getString("engl").isEmpty()) {
		          		 engl=rs.getString("engl");
			          	 gengl=rs.getString("gengl");
			          	 s5=String.format("ENGLISH:  %s%4s  ", engl,gengl);
		          	}else {
		          		 s5="";
		          	}
		          	if(!rs.getString("che").isEmpty()) {
		          		 che=rs.getString("che");
			          	 gche=rs.getString("gche");
			          	 s6=String.format("CHEMISTRY:        %s%4s", che,gche);
		          	}else {
		          		 s6="";
		          	}
		          	if(!rs.getString("math").isEmpty()) {
		          		 math=rs.getString("math");
			          	 gmath=rs.getString("gmath");
			          	 s7=String.format("MATH:       %s%4s  ",math,gmath);
		          	}else {
		          		 s7="";
		          	}
		          	if(!rs.getString("bio").isEmpty()) {
		          		bio=rs.getString("bio");
			            gbio=rs.getString("gbio");
			          	 s8=String.format("BIOLOGY:             %s%4s",bio,gbio);
		          	}else {
		          		 s8="";
		          	}if(!rs.getString("phy").isEmpty()) {
		          		 phy=rs.getString("phy");
			          	gphy=rs.getString("gphy");
			          	 s9=String.format("PHYSICS: %s%4s  ",phy,gphy);
		          	}else {
		          		 s9="";
		          	}
		          	if(!rs.getString("ara").isEmpty()) {
		          		ara=rs.getString("ara");
			          	 gara=rs.getString("gara");
			          	 s10=String.format("ARABIC:   %s%4s",ara,gara);
		          	}else {
		          		 s10="";
		          	}
		          	if(!rs.getString("his").isEmpty()) {
		          		his=rs.getString("his");
			          	ghis=rs.getString("ghis");
			          	 s11=String.format("HISTORY: %s%4s",his,ghis);
		          	}else {
		          		 s11="";
		          	}
		          	
		          	if(!rs.getString("lit").isEmpty()) {
		          		lit=rs.getString("lit");
			          	glit=rs.getString("glit");
			          	 s12=String.format("LITERATURE:       %s%4s",lit,glit);
		          	}else {
		          		 s12="";
		          	}

		        	
		            	if(point.matches("Inc")) {
		            		 area.setText(s1+""+s2+"\n"+s3+""+s4+"\n"+s5+""+s6+"\n"+s7+""+s8+"\n"+s9+""+s12+"\n"+s11+"\n"+s10+"\n\nAVE:  "+avg+"     DIV:  "+gg1+    "    "   +  "  POINT:  "+point);
			           	     
				           	   
		            	}else {
		            	 	String avg1=String.format("%,.2f",Double.parseDouble(avg));
		            		
		            	 int gs=Integer.parseInt(point);
		           	     if(gs>=7 && gs<=17){
		           	       gg="I";
		           	      }else if(gs>=18 && gs<=21){
		           	    	  gg="II";
		           	      }
		           	      else if(gs>=22 && gs<=25){
		           	    	  gg="III";
		           	      }
		           	      else if(gs>=26 && gs<=33){
		           	    	  gg="IV";
		           		      }
		           		  else if(gs>=34 && gs<=35){
		           			  gg="0";
		           		      }
		           	     
		           	  area.setText(s1+""+s2+"\n"+s3+""+s4+"\n"+s5+""+s6+"\n"+s7+""+s8+"\n"+s9+""+s12+"\n"+s11+"\n"+s10+"\n\nAVE:  "+avg+"     DIV:  "+gg1+    "    "   +  "  POINT:  "+point);
		           	      
		           	     
		          		
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
		try {
			grade();
			String id=t0.getText();
			String fn=t1.getText().toUpperCase();
			String ln=t2.getText().toUpperCase();
			String gn=t3.getSelectedItem().toString();
			String cl=t4.getSelectedItem().toString();
			String exam=t6.getSelectedItem().toString();
			String year=box5.getSelectedItem().toString();
			String term=t7.getSelectedItem().toString();
			
			
			String sql="select count(id) from mark1 where id='"+t0.getText()+"' ";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			int namba=Integer.parseInt(rs.getString("count(id)"));
			if(namba==1) {
				try {
					
				
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
				String g10="",m10;
				String g11="",m11;
				String avg="";
				String point="";
				double cv=0.0,geo=0.0,dini=0.0,kiswa=0.0,engl=0.0,phy=0.0,che=0.0,bio=0.0,math=0.0,his=0.0,ara=0.0,lit=0.0;
				String cme="",cmk="",cmd="",cma="",cmg="",cmc="",cmh="",cmp="",cmm="",cmch="",cmb="",cml="";
			
				
				String sql11="select * from mark1 where id='"+id+"' ";
            	ps=con.prepareStatement(sql11);
            	rs=ps.executeQuery();
				
                t20.setText(rs.getString("cv"));
                t21.setText(rs.getString("geo"));
                t22.setText(rs.getString("dini"));
                t23.setText(rs.getString("kiswa"));
                t24.setText(rs.getString("engl"));
                t25.setText(rs.getString("phy"));
                t26.setText(rs.getString("che"));
                t27.setText(rs.getString("bio"));
                t28.setText(rs.getString("math"));
                t29.setText(rs.getString("his"));
                t30.setText(rs.getString("ara"));
                t31.setText(rs.getString("lit"));
               
                
				int result = JOptionPane.showConfirmDialog(null, pana1, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				if(result==JOptionPane.OK_OPTION ) {
					
					
					if(t20.getText().isEmpty() ||t20.getText().matches("-")) {
						
						if(t20.getText().isEmpty()) {
							g0="";m0="";cmc="";
						}else {
							g0="-";m0="-";cmc="-";
						}
						
				}else {
						m0=t20.getText();
					
				
				if(!t20.getText().isEmpty() && !t20.getText().matches("-")) {
					 cv=Double.parseDouble(t20.getText());
				
				if(cv>=grd1 && cv<=grd2){
			       g0="A";cmc="VIZURI SANA";
			      }else if(cv>=grd3 && cv<grd4){
			    	  g0="B";cmc="VIZURI";
			      }
			      else if(cv>=grd5 && cv<grd6){
			    	  g0="C";cmc="WASTANI";
			      }
			      else if(cv>=grd7 && cv<grd8){
			    	  g0="D";cmc="DHAIFU";
				      }
				      else  if(cv>=grd9 && cv<grd10){
				    	  g0= "F";cmc="MBAYA SANA";
				      }
				      
				}
				}
					
					if(t21.getText().isEmpty() ||t21.getText().matches("-")) {

						if(t21.getText().isEmpty()) {
							g1="";m1="";cmg="";
						}else {
							g1="-";m1="-";cmg="-";
						}
				}else {
						m1=t21.getText();
					
				
				if(!t21.getText().isEmpty() && !t21.getText().matches("-")) {
					 geo=Double.parseDouble(t21.getText());
				
				if(geo>=grd1 && geo<=grd2){
			       g1="A";cmg="VIZURI SANA";
			      }else if(geo>=grd3 && geo<grd4){
			    	  g1="B";cmg="VIZURI";
			      }
			      else if(geo>=grd5 && geo<grd6){
			    	  g1="C";cmg="WASTANI";
			      }
			      else if(geo>=grd7 && geo<grd8){
			    	  g1="D";cmg="DHAIFU";
				      }
				      else if(geo>=grd9 && geo<grd10) {
				    	  g1= "F";cmg="MBAYA SANA";
				      }
				      
				}
				}
					
					if(t22.getText().isEmpty() ||t22.getText().matches("-")) {

						if(t22.getText().isEmpty()) {
							g2="";m2="";cmd="";
						}else {
							g2="-";m2="-";cmd="-";
						}
				}else {
						m2=t22.getText();
					
				
				if(!t22.getText().isEmpty() && !t22.getText().matches("-")) {
					dini=Double.parseDouble(t22.getText());
				
				if(dini>=grd1 && dini<=grd2){
			       g2="A";cmd="VIZURI SANA";
			      }else if(dini>=grd3 && dini<grd4){
			    	  g2="B";cmd="VIZURI";
			      }
			      else if(dini>=grd5 && dini<grd6){
			    	  g2="C";cmd="WASTANI";
			      }
			      else if(dini>=grd7 && dini<grd8){
			    	  g2="D";cmd="DHAIFU";
				      }
				      else if(dini>=grd9 && dini<grd10) {
				    	  g2= "F";cmd="MBAYA SANA";
				      }
				      
				}
				}
					
					if(t23.getText().isEmpty() ||t23.getText().matches("-")) {

						if(t23.getText().isEmpty()) {
							g3="";m3="";cmk="";
						}else {
							g3="-";m3="-";cmk="-";
						}
				}else {
						m3=t23.getText();
					
				
				if(!t23.getText().isEmpty() && !t23.getText().matches("-")) {
					kiswa=Double.parseDouble(t23.getText());
				
				if(kiswa>=grd1 && kiswa<=grd2){
			       g3="A";cmk="VIZURI SANA";
			      }else if(kiswa>=grd3 && kiswa<grd4){
			    	  g3="B";cmk="VIZURI";
			      }
			      else if(kiswa>=grd5 && kiswa<grd6){
			    	  g3="C";cmk="WASTANI";
			      }
			      else if(kiswa>=grd7 && kiswa<grd8){
			    	  g3="D";cmk="DHAIFU";
				      }
				      else  if(kiswa>=grd9 && kiswa<grd10) {
				    	  g3= "F";cmk="MBAYA SANA";
				      }
				      
				}
				}
					
					if(t24.getText().isEmpty() ||t24.getText().matches("-")) {

						if(t24.getText().isEmpty()) {
							g4="";m4="";
						}else {
							g4="-";m4="-";
						}
				}else {
						m4=t24.getText();
					
				
				if(!t24.getText().isEmpty() && !t24.getText().matches("-")) {
					engl=Double.parseDouble(t24.getText());
				
				if(engl>=grd1 && engl<=grd2){
			       g4="A";cme="VIZURI SANA";
			      }else if(engl>=grd3 && engl<grd4){
			    	  g4="B";cme="VIZURI";
			      }
			      else if(engl>=grd5 && engl<grd6){
			    	  g4="C";cme="WASTANI";
			      }
			      else if(engl>=grd7 && engl<grd8){
			    	  g4="D";cme="DHAIFU";
				      }
				      else if(engl>=grd9 && engl<grd10) {
				    	  g4= "F";cme="MBAYA SANA";
				      }
				      
				}
				}
					
					if(t25.getText().isEmpty() ||t25.getText().matches("-")) {

						if(t25.getText().isEmpty()) {
							g5="";m5="";cmp="";
						}else {
							g5="-";m5="-";cmp="-";
						}
				}else {
						m5=t25.getText();
					
				
				if(!t25.getText().isEmpty() && !t25.getText().matches("-")) {
				 phy=Double.parseDouble(t25.getText());
				
				if(phy>=grd1 && phy<=grd2){
			       g5="A";cmp="VIZURI SANA";
			      }else if(phy>=grd3 && phy<grd4){
			    	  g5="B";cmp="VIZURI";
			      }
			      else if(phy>=grd5 && phy<grd6){
			    	  g5="C";cmp="WASTANI";
			      }
			      else if(phy>=grd7 && phy<grd8){
			    	  g5="D";cmp="DHAIFU";
				      }
				      else  if(phy>=grd9 && phy<grd10){
				    	  g5= "F";cmp="MBAYA SANA";
				      }
				      
				}
				}
					
					if(t26.getText().isEmpty() ||t26.getText().matches("-")) {

						if(t26.getText().isEmpty()) {
							g6="";m6="";cmch="";
						}else {
							g6="-";m6="-";cmch="-";
						}
				}else {
						m6=t26.getText();
					
				
				if(!t26.getText().isEmpty() && !t26.getText().matches("-")) {
		     che=Double.parseDouble(t26.getText());
				
				if(che>=grd1 && che<=grd2){
			       g6="A";cmch="VIZURI SANA";
			      }else if(che>=grd3 && che<grd4){
			    	  g6="B";cmch="VIZURI";
			      }
			      else if(che>=grd5 && che<grd6){
			    	  g6="C";cmch="WASTANI";
			      }
			      else if(che>=grd7 && che<grd8){
			    	  g6="D";cmch="DHAIFU";
				      }
				      else if(che>=grd9 && che<grd10) {
				    	  g6= "F";cmch="MBAYA SANA";
				      }
				      
				}
				}
					
					if(t27.getText().isEmpty() ||t27.getText().matches("-")) {

						if(t27.getText().isEmpty()) {
							g7="";m7="";cmb="";
						}else {
							g7="-";m7="-";cmb="-";
						}
				}else {
						m7=t27.getText();
					
				
				if(!t27.getText().isEmpty() && !t27.getText().matches("-")) {
					 bio=Double.parseDouble(t27.getText());
				
				if(bio>=grd1 && bio<=grd2){
			       g7="A";cmb="VIZURI SANA";
			      }else if(bio>=grd3 && bio<grd4){
			    	  g7="B";cmb="VIZURI";
			      }
			      else if(bio>=grd5 && bio<grd6){
			    	  g7="C";cmb="WASTANI";
			      }
			      else if(bio>=grd7 && bio<grd8){
			    	  g7="D";cmb="DHAIFU";
				      }
				      else if(bio>=grd9 && bio<grd10) {
				    	  g7= "F";cmb="MBAYA SANA";
				      }
				      
				}
				}
					
					
					if(t28.getText().isEmpty() ||t28.getText().matches("-")) {

						if(t28.getText().isEmpty()) {
							g8="";m8="";cmm="";
						}else {
							g8="-";m8="-";cmm="-";
						}
				}else {
						m8=t28.getText();
					
				
				if(!t28.getText().isEmpty() && !t28.getText().matches("-")) {
					 math=Double.parseDouble(t28.getText());
				
				if(math>=grd1 && math<=grd2){
			       g8="A";cmm="VIZURI SANA";
			      }else if(math>=grd3 && math<grd4){
			    	  g8="B";cmm="VIZURI";
			      }
			      else if(math>=grd5 && math<grd6){
			    	  g8="C";cmm="WASTANI";
			      }
			      else if(math>=grd7 && math<grd8){
			    	  g8="D";cmm="DHAIFU";
				      }
				      else if(math>=grd9 && math<grd10) {
				    	  g8= "F";cmm="MBAYA SANA";
				      }
				      
				}
				}
					
					
					if(t29.getText().isEmpty() ||t29.getText().matches("-")) {

						if(t29.getText().isEmpty()) {
							g9="";m9="";cmh="";
						}else {
							g9="-";m9="-";cmh="-";
						}
				}else {
						m9=t29.getText();
					
				
				if(!t29.getText().isEmpty() && !t29.getText().matches("-")) {
					 his=Double.parseDouble(t29.getText());
				
				if(his>=grd1 && his<=grd2){
			       g9="A";cmh="VIZURI SANA";
			      }else if(his>=grd3 && his<grd4){
			    	  g9="B";cmh="VIZURI";
			      }
			      else if(his>=grd5 && his<grd6){
			    	  g9="C";cmh="WASTANI";
			      }
			      else if(his>=grd7 && his<grd8){
			    	  g9="D";cmh="DHAIFU";
				      }
				      else if(his>=grd9 && his<grd10) {
				    	  g9= "F";cmh="MBAYA SANA";
				      }
				      
				}
				}
					if(t30.getText().isEmpty() ||t30.getText().matches("-")) {

						if(t30.getText().isEmpty()) {
							g10="";m10="";cma="";
						}else {
							g10="-";m10="-";cma="";
						}
				}else {
						m10=t30.getText();
					
				
				if(!t30.getText().isEmpty() && !t30.getText().matches("-")) {
					 ara=Double.parseDouble(t30.getText());
				
				if(ara>=grd1 && ara<=grd2){
			       g10="A";cma="VIZURI SANA";
			      }else if(ara>=grd3 && ara<grd4){
			    	  g10="B";cma="VIZURI";
			      }
			      else if(ara>=grd5 && ara<grd6){
			    	  g10="C";cma="WASTANI";
			      }
			      else if(ara>=grd7 && ara<grd8){
			    	  g10="D";cma="DHAIFU";
				      }
				      else  if(ara>=grd9 && ara<grd10){
				    	  g10= "F";cma="MBAYA SANA";
				      }
				      
				}
				}
					
					if(t31.getText().isEmpty() ||t31.getText().matches("-")) {

						if(t31.getText().isEmpty()) {
							g11="";m11="";cml="";
						}else {
							g11="-";m11="-";cml="";
						}
				}else {
						m11=t31.getText();
					
				
				if(!t31.getText().isEmpty() && !t31.getText().matches("-")) {
					 lit=Double.parseDouble(t31.getText());
				
				if(lit>=grd1 && lit<=grd2){
			       g11="A";cml="VIZURI SANA";
			      }else if(lit>=grd3 && lit<grd4){
			    	  g11="B";cml="VIZURI";
			      }
			      else if(lit>=grd5 && lit<grd6){
			    	  g11="C";cml="WASTANI";
			      }
			      else if(lit>=grd7 && lit<grd8){
			    	  g11="D";cml="DHAIFU";
				      }
				      else  if(lit>=grd9 && lit<grd10){
				    	  g11= "F";cml="MBAYA SANA";
				      }
				      
				}
				}
					
					
					
					
					
					int n0=0, n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n10=0,n11=0,toto=0;
			
					double sum;


					if(t20.getText().matches("-") ||t20.getText().isEmpty()) {
						 
					}else  {
						
						n0=1;
						cv=Double.parseDouble(t20.getText());
					}
						
					if(t21.getText().matches("-") ||t21.getText().isEmpty()) {
						 
					}else  {
						
						n1=1;
					    geo=Double.parseDouble(t21.getText());
					}
					if(t22.getText().matches("-") ||t22.getText().isEmpty()) {
						 
					}else  {
						
						n2=1;
					    dini=Double.parseDouble(t22.getText());
					}

					if(t23.getText().matches("-") ||t23.getText().isEmpty()) {
						 
					}else  {
						
						n3=1;
					    kiswa=Double.parseDouble(t23.getText());
					}

					if(t24.getText().matches("-") ||t24.getText().isEmpty()) {
						 
					}else  {
						
						n4=1;
					    engl=Double.parseDouble(t24.getText());
					}

					if(t25.getText().matches("-") ||t25.getText().isEmpty()) {
						 
					}else  {
						
						n5=1;
					    phy=Double.parseDouble(t25.getText());
					}
					if(t26.getText().matches("-") ||t26.getText().isEmpty()) {
						 
					}else  {
						
						n6=1;
					    che=Double.parseDouble(t26.getText());
					}
					if(t27.getText().matches("-") ||t27.getText().isEmpty()) {
						 
					}else  {
						
						n7=1;
					    bio=Double.parseDouble(t27.getText());
					}

					if(t28.getText().matches("-") ||t28.getText().isEmpty()) {
						 
					}else  {
						
						n8=1;
					   math=Double.parseDouble(t28.getText());
					}
					
					if(t29.getText().matches("-") ||t29.getText().isEmpty()) {
						 
					}else  {
						
						n9=1;
					   his=Double.parseDouble(t29.getText());
					}
					
						 
					if(t30.getText().matches("-") ||t30.getText().isEmpty()) {
					}else  {
						
						n10=1;
					   ara=Double.parseDouble(t30.getText());
					}
					
					if(t31.getText().matches("-") ||t31.getText().isEmpty()) {
					}else  {
						
						n11=1;
					   lit=Double.parseDouble(t31.getText());
					}
						toto=n0+n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11;
						sum=cv+geo+dini+kiswa+engl+phy+che+bio+math+his+ara+lit;
						int i=0,j=0,p=0,total=0;
						double temp=0.0;
						String tot="";
						
						if(toto>=7) {
						Double mudi[]= {cv,geo,dini,kiswa,engl,phy,che,bio,math,his,ara,lit};
						Double ave=sum/toto;
					    avg=String.format("%,.4f", ave);
		
						
						for(i=0;i<7;i++){
							for(j=i+1;j<mudi.length;j++) {
								if( mudi[i]<mudi[j]) {
									temp=mudi[i];
									mudi[i]=mudi[j];
									mudi[j]=temp;
									
									
									
								}
								
							}
							

						       	if(mudi[i]>=75 && mudi[i]<=100){
							       p=1;
							      }else if(mudi[i]>=65 && mudi[i]<75){
							    	 p=2;
							      }
							      else if(mudi[i]>=45 && mudi[i]<65){
							    	  p=3;
							      }
							      else if(mudi[i]>=30 && mudi[i]<45){
							    	  p=4;
								      }
								  else {
									  p=5;
								      }
								 
						     	 total=p+total;
						     	 tot=Integer.toString(total);
							
						}

						

							
						}else {
							
							avg="Inc";
							tot="Inc";

							
						}
						                                                                                               

						if(((cv>=0 &&cv<=100) ||t20.getText().isEmpty()) && ((geo>=0 &&geo<=100) ||t21.getText().isEmpty()) && ((dini>=0 &&dini<=100) ||t22.getText().isEmpty()) && ((kiswa>=0 &&kiswa<=100) ||t23.getText().isEmpty()) &&  ((engl>=0 &&engl<=100) ||t24.getText().isEmpty()) && ((phy>=0 &&phy<=100) ||t25.getText().isEmpty()) && ((che>=0 &&che<=100) ||t26.getText().isEmpty()) &&  ((bio>=0 &&bio<=100) ||t27.getText().isEmpty()) && ((math>=0 &&math<=100) ||t28.getText().isEmpty()&& ((his>=0 && his<=100) ||t29.getText().isEmpty())&& ((ara>=0 &&ara<=100) ||t30.getText().isEmpty()))&& ((lit>=0 &&lit<=100) ||t31.getText().isEmpty())  ) {
							

							
						    String sq="update mark1 set cv='"+m0+"',gcv='"+g0+"',his='"+m9+"',ghis='"+g9+"',ara='"+m10+"',gara='"+g10+"',geo='"+m1+"',ggeo='"+g1+"',dini='"+m2+"',gdini='"+g2+"',kiswa='"+m3+"',gkiswa='"+g3+"',engl='"+m4+"',gengl='"+g4+"',phy='"+m5+"',gphy='"+g5+"',che='"+m6+"',gche='"+g6+"',bio='"+m7+"',gbio='"+g7+"',math='"+m8+"',gmath='"+g8+"',lit='"+m11+"',glit='"+g11+"',avg='"+avg+"',point='"+tot+"',cme='"+cme+"',cmk='"+cmk+"',cmd='"+cmd+"',cma='"+cma+"',cmg='"+cmg+"',cmc='"+cmc+"',cmh='"+cmh+"',cmp='"+cmp+"',cmm='"+cmm+"',cmch='"+cmch+"',cmb='"+cmb+"',cml='"+cml+"'  where id='"+id+"' ";
							ps=con.prepareStatement(sq);
							ps.execute();
							
							JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
							t20.setText("");t21.setText("");t22.setText("");t23.setText("");t24.setText("");t25.setText("");t26.setText("");t27.setText("");t28.setText("");t29.setText("");t30.setText("");t31.setText("");
							
					    	area();

						}else {
							
							 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
						}
						
						
						
				    	
				
				
					//JOptionPane.showMessageDialog(null, point);
				
				
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
				
				

				 String sq="insert into mark1(id,cv,gcv,geo,ggeo,dini,gdini,kiswa,gkiswa,engl,gengl,phy,gphy,che,gche,bio,gbio,math,gmath,his,ghis,ara,gara,lit,glit,aco,gaco,bk,gbk,avg,point,class,exam,year,first,last,gender,sch) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				 ps=con.prepareStatement(sq);
				 ps.setString(1,id.toUpperCase());
				 ps.setString(2,"");
				 ps.setString(3, "");
				 ps.setString(4,"");
				 ps.setString(5,"");
				 ps.setString(6, "");
				 ps.setString(7,"");
				 ps.setString(8,"");
				 ps.setString(9, "");
				 ps.setString(10,"");
				 ps.setString(11,"");
				 ps.setString(12, "");
				 ps.setString(13,"");
				 ps.setString(14,"");
				 ps.setString(15, "");
				 ps.setString(16,"");
				 ps.setString(17,"");
				 ps.setString(18, "");
				 ps.setString(19,"");
				 ps.setString(20,"");
				 ps.setString(21,"");
				 ps.setString(22,"");
				 ps.setString(23,"");
				 ps.setString(24,"");
				 ps.setString(25,"");
				 ps.setString(26,null);
				 ps.setString(27,null);
				 ps.setString(28,null);
				 ps.setString(29,null);
				 ps.setString(30, "Inc");
			   	ps.setString(31, "Inc");
			    ps.setString(32,cl);
		    	ps.setString(33,exam);	
			    ps.setString(34,year);
			    ps.setString(35,fn);
			    ps.setString(36,ln);	
			    ps.setString(37,gn);
			    ps.setString(38,term);
			 
				 
			    ps.execute();

               t20.setText("");t21.setText("");t22.setText("");t23.setText("");t24.setText("");t25.setText("");t26.setText("");t27.setText("");t28.setText("");
			
				
			}
			
			
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
	}

	private void resert() {
		t0.setText("");t1.setText("");t2.setText("");t3.setSelectedItem(null);t4.setSelectedItem(null);t5.setSelectedItem(null);t6.setSelectedItem(null);area.setText("");field.setText("");box5.setSelectedItem(null);
		table();sch.setSelectedItem(null);t17.setSelectedItem(null);t7.setSelectedItem(null);
		
	}

	private void button() {
		
		
		ba4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="KIDATO CHA IV";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'TERM' from user1 where class= '"+da1+"' ORDER BY gender ASC,first ASC,last ASC ";
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
		
		ba1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="KIDATO CHA I";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'TERM' from user1 where class= '"+da1+"' ORDER BY gender ASC,first ASC,last ASC";
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
                	 
                        String da1="KIDATO CHA II";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'TERM' from user1 where class= '"+da1+"' ORDER BY gender ASC,first ASC,last ASC";
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
                	 
                        String da1="KIDATO CHA III";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'TERM' from user1 where class= '"+da1+"' ORDER BY gender ASC,first ASC,last ASC";
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
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			    
				if(!t0.getText().isEmpty()||!t0.getText().matches("")) {
					
					int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
					        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
						
					if(result==JOptionPane.OK_OPTION){
						
						if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
							
							 int a=0;

						Document document=new Document(PageSize.A4);
						
						 PdfPTable mudi = new PdfPTable(3);
					     PdfPCell cell=new PdfPCell(new Phrase(""));
					     cell.setColspan(3);
					     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					     cell.setBackgroundColor(new BaseColor(255,250,205));
					     mudi.addCell(cell);
					     
					     PdfPTable mudi1 = new PdfPTable(1);
					     PdfPCell cell1=new PdfPCell(new Phrase(""));
					     cell1.setColspan(3);
					     cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
					     cell1.setBackgroundColor(new BaseColor(250,240,230));
					     mudi1.addCell(cell1);
					     
					       // mudi.addCell("SID");
						   
						    mudi.addCell("SUBJECTS");
						    mudi.addCell("MARKS");
						    mudi.addCell("GRADES");
						   
						    
						
						 try {
							
							 
						 String sq="select * from user1 where id='"+t0.getText()+"' and exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ";
						 ps=con.prepareStatement(sq);
						 rs=ps.executeQuery();
						 
						    
						 
						 }catch(Exception ex) {
							 JOptionPane.showMessageDialog(null, ex.getMessage());
						 }
						 
						 try {
							 String sqq="select * from mark1 where id='"+t0.getText()+"'  and exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' ";
							 ps=con.prepareStatement(sqq);
							 ResultSet rs1=ps.executeQuery();
							 
								 String sqqq="select * from user1 where id='"+t0.getText()+"'  and exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' ";
								 ps=con.prepareStatement(sqqq);
								 ResultSet rs2=ps.executeQuery();
							 
							 String pt=rs1.getString("point");
							 String gg="";String p ="";
							 
							 
							 if(rs1.getString("point").matches("Inc")) {
				            	gg="Inc";
				            		
				            		
				            	}else {
				            		
				            	 int gs=Integer.parseInt(rs1.getString("point"));
				           	     if(gs>=7 && gs<=17){
				           	       gg="I";
				           	      }else if(gs>=18 && gs<=21){
				           	    	  gg="II";
				           	      }
				           	      else if(gs>=22 && gs<=25){
				           	    	  gg="III";
				           	      }
				           	      else if(gs>=26 && gs<=33){
				           	    	  gg="IV";
				           		      }
				           		  else if(gs>=34 && gs<=35){
				           			  gg="0";
				           		      }
					    							
				            	}
					    		
							 
							     String count="select count(id) from mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'";
								ps=con.prepareStatement(count);
								ResultSet rss=ps.executeQuery();
								
								String nam=rss.getString("count(id)");
								
								
								    String cou="select * from mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and id='"+t0.getText()+"'  order by case when avg = 'Inc' then 1 else 0 end, avg DESC, cv DESC,geo DESC,dini DESC,engl DESC,kiswa DESC,phy DESC,che DESC,bio DESC,math DESC" ;
									ps=con.prepareStatement(cou);
									ResultSet rs22=ps.executeQuery();
								
								while(rs22.next()) {
									
									a++;
								}
			                   
			                   if((rs2.getString("combi").matches("SCIENCE"))){
			                	   String cv=rs1.getString("cv");
			                	   String gcv=rs1.getString("gcv");
			                	   String geo=rs1.getString("geo");
			                	   String ggeo=rs1.getString("ggeo");
			                	   String dini=rs1.getString("dini");
			                	   String gdini=rs1.getString("gdini");
			                	   String kiswa=rs1.getString("kiswa");
			                	   String gkiswa=rs1.getString("gkiswa");
			                	   String engl=rs1.getString("engl");
			                	   String gengl=rs1.getString("gengl");
			                	   String phy=rs1.getString("phy");
			                	   String gphy=rs1.getString("gphy");
			                	   String che=rs1.getString("che");
			                	   String gche=rs1.getString("gche");
			                	   String math=rs1.getString("math");
			                	   String gmath=rs1.getString("gmath");
			                	   String bio=rs1.getString("bio");
			                	   String gbio=rs1.getString("gbio");
			                	   String ave=rs1.getString("avg");
			                	 
			                	   //JOptionPane.showMessageDialog(null, p);
			                	   cell=new PdfPCell(new Phrase("CIVICS"));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(cv));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(gcv));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase("GEOGRAPHY"));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(geo));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(ggeo));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase("DINI"));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(dini));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(gdini));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase("KISWAHILI"));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(kiswa));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(gkiswa));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase("ENGLISH"));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(engl));
				                      mudi.addCell(cell);
				                      cell=new PdfPCell(new Phrase(gengl));
				                      mudi.addCell(cell);
				                      
				                     
			   					  cell=new PdfPCell(new Phrase("PHYSICS"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(phy));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gphy));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase("CHEMISTRY"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(che));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gche));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase("BIOLOGY"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(bio));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gbio));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase("MATHEMATICS"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(math));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gmath));
			                      mudi.addCell(cell);
			                      cell1=new PdfPCell(new Phrase("Average "+" "+ave+"  "+"POSITION "+"  "+a+"  "+"OUT of"+" "+nam));
			                      cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
			                      mudi1.addCell(cell1);
			                      cell1=new PdfPCell(new Phrase("\n"));
				      		       cell1.setBorder(0);
				      		       mudi1.addCell(cell1);
			                      cell1=new PdfPCell(new Phrase("You scored DIVISION "+" "+gg+"  "+"of POINT "+"  "+pt));
			                      cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
			                      mudi1.addCell(cell1);
			                      
			                      
			                      
			                   }
			                   else if((rs2.getString("combi").matches("ARTS"))){
			                	  
			                   }
			                 
					    		
					    	}
							 
					
							 
						 catch(Exception ex) {
							 JOptionPane.showMessageDialog(null, ex.getMessage());
						 }
						
						try {
							PdfWriter.getInstance(document, new FileOutputStream("StuReport.pdf"));
							document.open();
							Image im=Image.getInstance("fide1.png");
							document .add(im);
						
							document.add(new Paragraph("\t\t\t                     FIDEL CASTRO SECONDARY SCHOOL",FontFactory.getFont(FontFactory.TIMES_ROMAN,19,Font.BOLD,new BaseColor(128,128,0))));
							document.add(new Paragraph("                                                 STUDENT'S REPORT",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(46,139,87))));
							document.add(new Paragraph("\n"));
							document.add(new Paragraph("                                                              "+et.getSelectedItem().toString()+"  TEST"));
							document.add(new Paragraph("                                                             "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString()));
							//document.add(new Paragraph("DATE:              \t\t"+dt.format(timer.getTime())));
							//document.add(new Paragraph("TIME:               \t\t"+df.format(timer.getTime())));
							document.add(new Paragraph("\n\n"));
							document.add(new Paragraph("JINA LA MWANAFUNZI:  "+rs.getString("first")+"  "+rs.getString("last")));
							document.add(new Paragraph("GENDER:  "+rs.getString("gender")));
							document.add(new Paragraph("CLASS:  "+rs.getString("class")));
							document.add(new Paragraph("CLASS TYPE:  "+rs.getString("combi")));
							document.add(new Paragraph("\n\n"));
							document.add(mudi);
							document.add(new Paragraph("\n"));
							document.add(mudi1);
							document.add(new Paragraph("\n\n"));
							document.add(new Paragraph("Comment:.............................................                            Comment:............................................."));
							document.add(new Paragraph("Head Teacher                                                                   Class Teacher"));
							document.add(new Paragraph("Sign..........                                                                         Sign:.........."));
							//document.add(new Paragraph(dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
							
							document.close();
							JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
							Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"StuReport.pdf");


						
							
						} catch (Exception e2) {
							 JOptionPane.showMessageDialog(null, "No User of that Records !");
						}finally{
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
					
				}else {
					JOptionPane.showMessageDialog(null, "Select User From the Table !");
				}
				
			
			}
			});
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!t0.getText().isEmpty()&&!t0.getText().matches("")) {
					
					update();
				
			}else {
				JOptionPane.showMessageDialog(null, "Select User from the Table !");
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
				    String term=t7.getSelectedItem().toString();t17.setSelectedItem(term);
					
					
				int result = JOptionPane.showConfirmDialog(null, pana, "Update Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if(t10.getText() != null &&!t10.getText().trim().isEmpty()&&
						t11.getText() != null &&!t11.getText().trim().isEmpty() && t12.getText() != null &&!t12.getText().trim().isEmpty() &&
						t13.getSelectedItem() != null &&!((String) t13.getSelectedItem()).trim().isEmpty() && 	t14.getSelectedItem() != null
						&&!((String) t14.getSelectedItem()).trim().isEmpty()
						&& 	t16.getSelectedItem() != null &&!((String) t16.getSelectedItem()).trim().isEmpty() && box15.getSelectedItem() != null &&!((String) box15.getSelectedItem()).trim().isEmpty()
						&& 	t17.getSelectedItem() != null &&!((String) t17.getSelectedItem()).trim().isEmpty() ){
					if(t11.getText().matches("^[\\p{L} .'-]+$") && t12.getText().matches("^[\\p{L} .'-]+$")) {
						
					
				if( result==JOptionPane.OK_OPTION) {
					
					try {
						String mud= t11.getText();
						 mud=mud.replaceAll("'", "''");
						String mk="";
						String mk2="Inc";
						
						String sql="update  user1 set id='"+(t10.getText().toUpperCase()).replaceAll("'", "''")+"',  first='"+(t11.getText().toUpperCase()).replaceAll("'", "''")+"' ,last='"+(t12.getText().toUpperCase()).replaceAll("'", "''")+"',gender='"+t13.getSelectedItem().toString()+"',class='"+t14.getSelectedItem().toString()+"',exam='"+t16.getSelectedItem().toString()+"' ,year='"+box15.getSelectedItem().toString()+"',sch='"+t17.getSelectedItem().toString()+"' where  id='"+t0.getText()+"' ";
						ps=con.prepareStatement(sql);
						ps.execute();
						
					    String sq="update mark1 set id='"+(t10.getText().toUpperCase()).replaceAll("'", "''")+"', class='"+t14.getSelectedItem().toString()+"',exam='"+t16.getSelectedItem().toString()+"',year='"+box15.getSelectedItem().toString()+"',first='"+mud.toUpperCase()+"' ,last='"+(t12.getText().toUpperCase()).replaceAll("'", "''")+"',gender='"+t13.getSelectedItem().toString()+"' ,sch='"+t17.getSelectedItem().toString()+"'where id='"+t0.getText()+"' "; 
						ps=con.prepareStatement(sq);
						ps.execute();
							
						if(!cl.matches(t4.getSelectedItem().toString())) {
							 String sqq="update mark1 set phy='"+mk+"',gphy='"+mk+"',che='"+mk+"',gche='"+mk+"',math='"+mk+"',gmath='"+mk+"',bio='"+mk+"',gbio='"+mk+"',geo='"+mk+"',ggeo='"+mk+"',dini='"+mk+"',gdini='"+mk+"',cv='"+mk+"',gcv='"+mk+"',engl='"+mk+"',gengl='"+mk+"',kiswa='"+mk+"',gkiswa='"+mk+"' ,point='"+mk2+"' where id='"+t0.getText()+"' ";
							 ps=con.prepareStatement(sqq);
							 ps.execute();
							
						}
						
						String s=String.format("%s   %s",fn ,"Updated Successfully !");
						JOptionPane.showMessageDialog(b1, s);
						
						table();
					   	resert();

					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null,ex.getStackTrace());//"ID is Already Registered to Another Student !"
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
			String sq1="delete  from user1 where id='"+t0.getText()+"' ";
			ps=con.prepareStatement(sq1);
			ps.execute();
			ps.close();
			
			String sq="delete  from mark1 where id='"+t0.getText()+"' ";
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

			public void actionPerformed(ActionEvent e) {
				String id=t0.getText().toUpperCase();
				
				
				if(t0.getText() != null &&!t0.getText().trim().isEmpty()&&
						t1.getText() != null &&!t1.getText().trim().isEmpty() && t2.getText() != null &&!t2.getText().trim().isEmpty() &&
						t3.getSelectedItem() != null &&!((String) t3.getSelectedItem()).trim().isEmpty() && 	t4.getSelectedItem() != null
						&&!((String) t4.getSelectedItem()).trim().isEmpty() 
							 && 	t7.getSelectedItem() != null &&!((String) t7.getSelectedItem()).trim().isEmpty()	 && 	t6.getSelectedItem() != null &&!((String) t6.getSelectedItem()).trim().isEmpty()&&box5.getSelectedItem() != null &&!((String) box5.getSelectedItem()).trim().isEmpty()
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
						
						
						String sq="insert into user1(id,first,last,gender,class,exam,year,sch) values (?,?,?,?,?,?,?,?)";
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
					JOptionPane.showMessageDialog(null, "User of that ID Already Registered !");//
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
		 
			
			String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'TERM' from user1 order by class ,gender ASC,first ASC,last ASC";
			
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
		                 
						}catch(Exception esss){
						JOptionPane.showMessageDialog(null, esss.getStackTrace());
						}
				
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
					JOptionPane.showMessageDialog(null, esss.getStackTrace());
					}finally{
		  	             try{
		  	                 rs.close();
		  	                 ps.close();
		  	             }catch(Exception ex){
		  	                 ex.getMessage();
		  	             }}
					
				}
					
				});
				
			
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
	JMenu other=new JMenu("Other");
	bar.add(other);
	JMenuItem form=new JMenuItem("Attendance Form");
	other.add(form);
	JMenu help=new JMenu("Help");
	bar.add(help);
	JMenuItem about=new JMenuItem("About System");
	help.add(about);about.setIcon(ab);
	JMenuItem pri=new JMenuItem("Primary");
	//file.add(pri);pri.setIcon(pr);
	
	JMenuItem level=new JMenuItem("Form 5&6");
	//file.add(level);level.setIcon(ad);

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
	JMenu term=new JMenu("Term");
	rep.add(term);
	JMenuItem ter=new JMenuItem("Class Report");
	term.add(ter);
	JMenuItem sp=new JMenuItem("Students Report");
	term.add(sp);
	
	
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
	
	JMenuItem addc=new JMenuItem("Add Series");
	set.add(addc);
	
	JMenuItem delc=new JMenuItem("Delete Series");
	set.add(delc);
	
	JMenuItem grade=new JMenuItem("Update Grade");
	set.add(grade);

	JMenuItem resu=new JMenuItem("Create Archieve");
	set.add(resu);
	
	addc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			
			int result = JOptionPane.showConfirmDialog(null, pa7, "Add Category",
		            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			
			if(result==JOptionPane.OK_OPTION ) {
				
				String text=txt1.getText().toUpperCase();
				
				try {
					

					
				      String sql2 ="select count(name) from category where name = '"+text+"'  ";
			    	  ps=con.prepareStatement(sql2);
			    	  rs=ps.executeQuery();
			    	 int count=Integer.parseInt(rs.getString("count(name)"));
			    	 
					if(count<=0) {
						
						
						String sql="Insert into category(name) values (?)";
						ps=con.prepareStatement(sql);
						ps.setString(1, text);
						ps.execute();
						
						t6.removeAllItems();
						box73.removeAllItems();
						box74.removeAllItems();
						et.removeAllItems();
						txt2.removeAllItems();
						
						combi();
						JOptionPane.showMessageDialog(null, "Category Added Successfuly !");
						
						
						
						
					}else {
						JOptionPane.showMessageDialog(null, "Category Already Exist !");
					}
				
				
				
			
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			
			}		
		}
		});
	
	
	delc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			
			int result = JOptionPane.showConfirmDialog(null, pa8, "Add Category",
		            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			
			if(result==JOptionPane.OK_OPTION ) {
				
				String tt=txt2.getSelectedItem().toString();
				
				try {
					
					String sql="Delete  from category where name='"+tt+"' ";
					ps=con.prepareStatement(sql);
					ps.execute();
					
					t6.removeAllItems();
					box73.removeAllItems();
					box74.removeAllItems();
					et.removeAllItems();
					txt2.removeAllItems();
					
					combi();
					
					JOptionPane.showMessageDialog(null, "Category Deleted Successfuly !");
					
					
				
					
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			
			}		
		}
		});
	
	ter.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			int result = JOptionPane.showConfirmDialog(null, pa6, "Select ",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			if(result==JOptionPane.OK_OPTION){
				
				if(t42.getSelectedItem() != null &&!((String) t42.getSelectedItem()).trim().isEmpty()&&t40.getSelectedItem() != null &&!((String) t40.getSelectedItem()).trim().isEmpty()&&t41.getSelectedItem() != null &&!((String) t41.getSelectedItem()).trim().isEmpty() ) {
					
					
					
					
					
					term();
					
					
				  	Document document=new Document(PageSize.A4.rotate());
				  	
				  	
					 Calendar timer=Calendar.getInstance();
					 timer.getTime();
					 SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
					 SimpleDateFormat dt=new SimpleDateFormat("MMM dd,  yyyy");
					 
				
				 
				try {

					

	 				int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0;
			    	int ppa=0,ppb=0,ppc=0,ppd=0,ppf=0;
					int ggga=0,gggb=0,gggc=0,gggd=0,gggf=0;
					int cca=0,ccb=0,ccc=0,ccd=0,ccf=0;
					int bba=0,bbb=0,bbc=0,bbd=0,bbf=0;
					int mma=0,mmb=0,mmc=0,mmd=0,mmf=0;
					int dda=0,ddb=0,ddc=0,ddd=0,ddf=0;
					int kka=0,kkb=0,kkc=0,kkd=0,kkf=0;
					int nna=0,nnb=0,nnc=0,nnd=0,nnf=0;
					int zza=0,zzb=0,zzc=0,zzd=0,zzf=0;
					int hha=0,hhb=0,hhc=0,hhd=0,hhf=0;
					int rra=0,rrb=0,rrc=0,rrd=0,rrf=0;
					
					
					
			    
			    	String count="select count(id) from term1 where year='"+t40.getSelectedItem().toString()+"' and  term='"+t41.getSelectedItem().toString()+"' and  class='"+t42.getSelectedItem().toString()+"'  ";
	     			ps=con.prepareStatement(count);
	     			ResultSet rss=ps.executeQuery();
	     			
	     			
	     			String sqqq="select point from term1 where year='"+t40.getSelectedItem().toString()+"' and  term='"+t41.getSelectedItem().toString()+"' and  class='"+t42.getSelectedItem().toString()+"'  ";
			    	ps=con.prepareStatement(sqqq);
			    	rs=ps.executeQuery();
			    	
			    	    String sq="SELECT *, RANK () OVER (  order by case when ave = 'Inc' then 1 else 0 end, ave DESC ) AS rank  FROM term1 where year='"+t40.getSelectedItem().toString()+"' and  term='"+t41.getSelectedItem().toString()+"' and  class='"+t42.getSelectedItem().toString()+"' ";
					 	ps=con.prepareStatement(sq);
					 	ResultSet rr=ps.executeQuery();
					 	
					 	
					 	 String sg="select * from term1 where year='"+t40.getSelectedItem().toString()+"' and  term='"+t41.getSelectedItem().toString()+"' and  class='"+t42.getSelectedItem().toString()+"'  ";
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
						    mudi.setWidthPercentage(105);					    
						    cell.setColspan(36);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
					     
					    
	      		    	 
	      		    	PdfPTable mudi23 = new PdfPTable(1);
					     PdfPCell cell23=new PdfPCell(new Phrase(""));
					     cell23.setColspan(4);
					     
					     mudi23.setWidthPercentage(105);
					     Image im=Image.getInstance("other.png");
	      		    	 cell.setBorder(0);
	       		    	 mudi23.addCell(cell23);
	      		    	 mudi23.addCell(im);
	      		    	 
	      		    	 cell = new PdfPCell(new Phrase("\n", FontFactory.getFont("COURIER_BOLD", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						    mudi23.addCell(cell);
					     
	      		    	   cell = new PdfPCell(new Phrase(school+" SECONDARY SCHOOL", FontFactory.getFont("Arial", 25, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						   // cell.setColspan(4);
						    mudi23.addCell(cell);
						    
						    cell = new PdfPCell(new Phrase("MATOKEO YA  "+t41.getSelectedItem().toString()+"\n"+t42.getSelectedItem().toString()+"   "+t40.getSelectedItem().toString(), FontFactory.getFont("Arial", 20, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						   // cell.setColspan(4);
						    mudi23.addCell(cell);
						    
						    cell = new PdfPCell(new Phrase("", FontFactory.getFont("Arial", 20, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						   // cell.setColspan(4);
						    mudi23.addCell(cell);
						    
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
						   
						     
						     
							   cell = new PdfPCell(new Phrase("JINA KAMILI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(8);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JINS",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("CIVICS",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
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
							    cell = new PdfPCell(new Phrase("KISW",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ENG",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("CHEM",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("MATH",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("BIO",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("PHY",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ARAB",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HISTRY",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("WAST",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("PNT",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DIV",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
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
							    cell = new PdfPCell(new Phrase("A",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							   
						     
						 	String a="";
						    	
						    	try {
						    		while(rr.next()) {
						    			
						    			a=rr.getString("rank");
						    			
						    			String fn=rr.getString("first");
							    		String ln=rr.getString("last");
							    		
						                String gn=rr.getString("gender");
						                
						                cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(8);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 8, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
							          	
						               
						                String cv=rr.getString("cva");String gcv=rr.getString("gcv");
						                String dini=rr.getString("dinia");String gdini=rr.getString("gdini");
						                String kiswa=rr.getString("kiswaa");String gkiswa=rr.getString("gkiswa");
						                String engl=rr.getString("engla");String gengl=rr.getString("gengl");
						                String che=rr.getString("chea");String gche=rr.getString("gche");
						                String math=rr.getString("matha");String gmath=rr.getString("gmath");
						                String bio=rr.getString("bioa");String gbio=rr.getString("gbio");
						                String phy=rr.getString("phya");String gphy=rr.getString("gphy");
						                String ara=rr.getString("araa");String gara=rr.getString("gara");
						                String his=rr.getString("hisa");String ghis=rr.getString("ghis");
						                String geo=rr.getString("geoa");String ggeo=rr.getString("ggeo");
						                
							          	
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
									    cell = new PdfPCell(new Phrase(che,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gche,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
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
									    cell = new PdfPCell(new Phrase(bio,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbio,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(phy,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gphy,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
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
							         
						                      if(rr.getString("point").matches("Inc")) {
									    			p="Inc";
									    		}else {
									    			int mark=Integer.parseInt(rr.getString("point"));
										    		
										    		if(mark>=7 && mark<=17) {
										    			p="I";
										    		}else if(mark>=18 && mark<=21) {
										    			p="II";
										    		}else if(mark>=22 && mark<=25) {
										    			p="III";
										    		}
										    		else if(mark>=26 && mark<=33) {
										    			p="IV";
										    		}else if(mark>=34&& mark<=35) {
										    			p="O";
									    		}
									    		
									    		}
						                      
						                        String po=rr.getString("point");
								                cell=new PdfPCell(new Phrase(po));
								                cell.setHorizontalAlignment(1);
								             
								                
								                String ave=rr.getString("ave");
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
											    
											    cell = new PdfPCell(new Phrase(po,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(1);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase(p,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(1);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase(a+"",FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(1);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
						                   
						    			
						    		}
						    		
						    		
						    		
						    	
						    	while(rs.next()) {
						    		
						    		if(rs.getString("point").matches("Inc")) {
						    			count5++;
						    			
						    		}else {
						    			int mark=Integer.parseInt(rs.getString("point"));
							    		
							    		if(mark>=7 && mark<=17) {
							    			count1++;
							    		}else if(mark>=18 && mark<=21) {
							    			count2=count2+1;
							    		}else if(mark>=22 && mark<=25) {
							    			count3++;
							    		}
							    		else if(mark>=26 && mark<=33) {
							    			count4++;
							    		}else if(mark>=34 && mark<=35) {
							    			count0++;
							    			
							    		
							    		}
						    
							    		
						    		}
						    		}
						    	
						    	
						    	try {
						    		
						    		
						    		while(grs.next()) {
						    			
						    			 if(grs.getString("gcv") != null) {
								    			
							                 String mg=grs.getString("gcv");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         ggga++;
							   	    		}else if(mg.matches("B")) {
							   			    	   gggb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   gggc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   gggd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   gggf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("ggeo") != null) {
								    			
							                 String mg=grs.getString("ggeo");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         bba++;
							   	    		}else if(mg.matches("B")) {
							   			    	   bbb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   bbc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   bbd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   bbf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("gdini") != null) {
								    			
							                 String mg=grs.getString("gdini");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         dda++;
							   	    		}else if(mg.matches("B")) {
							   			    	   ddb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   ddc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   ddd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   ddf++;
							   			    		}
								    		
							    		 }
						    			 
						    			 if(grs.getString("gkiswa") != null) {
								    			
							                 String mg=grs.getString("gkiswa");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         kka++;
							   	    		}else if(mg.matches("B")) {
							   			    	   kkb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   kkc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   kkd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   kkf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("gengl") != null) {
								    			
							                 String mg=grs.getString("gengl");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         nna++;
							   	    		}else if(mg.matches("B")) {
							   			    	   nnb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   nnc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   nnd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   nnf++;
							   			    		}
						    			 }
						    			 if(grs.getString("gphy") != null) {
								    			
							                 String mg=grs.getString("gphy");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         ppa++;
							   	    		}else if(mg.matches("B")) {
							   			    	   ppb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   ppc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   ppd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   ppf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("gche") != null) {
								    			
							                 String mg=grs.getString("gche");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         cca++;
							   	    		}else if(mg.matches("B")) {
							   			    	   ccb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   ccc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   ccd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   ccf++;
							   			    		}
						    			 }
						    			
						    			 
						    			 if(grs.getString("gbio") != null) {
								    			
							                 String mg=grs.getString("gbio");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         zza++;
							   	    		}else if(mg.matches("B")) {
							   			    	   zzb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   zzc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   zzd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   zzf++;
							   			    		}
						    			 }
						    			
						    			 if(grs.getString("gmath") != null) {
								    			
							                 String mg=grs.getString("gmath");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         mma++;
							   	    		}else if(mg.matches("B")) {
							   			    	   mmb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   mmc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   mmd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   mmf++;
							   			    		}
						    			 }
						    			
						    			 
						    			 if(grs.getString("ghis") != null) {
								    			
							                 String mg=grs.getString("ghis");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         hha++;
							   	    		}else if(mg.matches("B")) {
							   			    	   hhb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   hhc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   hhd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   hhf++;
							   			    		}
						    			 }
						    			
						    			 if(grs.getString("gara") != null) {
								    			
							                 String mg=grs.getString("gara");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         rra++;
							   	    		}else if(mg.matches("B")) {
							   			    	   rrb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   rrc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   rrd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   rrf++;
							   			    		}
						    			 }
						    			
						    		}
						    		String sm=String.format("SUBJECT ANALYSIS");
									cell2=new PdfPCell(new Phrase(sm));
									cell2.setHorizontalAlignment(1);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						            
						            String s0=String.format("*****");
									cell2=new PdfPCell(new Phrase(s0));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						            
						    	 
						        	 String s=String.format(" %s","CIVICS:  A="+ggga+"   B="+gggb+"   C="+gggc+"   D="+gggd+"      F="+gggf);
									cell2=new PdfPCell(new Phrase(s));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((ggga+gggb+gggc+gggd+gggf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						          
						           
						            
						            String s1=String.format(" %s","GEOGRAPHY:  A="+bba+"   B="+bbb+"   C="+bbc+"   D="+bbd+"   F="+bbf);
									cell2=new PdfPCell(new Phrase(s1));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((bba+bbb+bbc+bbd+bbf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s2=String.format(" %s","DINI:  A="+dda+"   B="+ddb+"   C="+ddc+"   D="+ddd+"   F="+ddf);
									cell2=new PdfPCell(new Phrase(s2));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((dda+ddb+ddc+ddd+ddf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						    		
						            
						            String s3=String.format(" %s","KISWAHILI:  A="+kka+"   B="+kkb+"   C="+kkc+"   D="+kkd+"   F="+kkf);
									cell2=new PdfPCell(new Phrase(s3));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((kka+kkb+kkc+kkd+kkf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s4=String.format(" %s","ENGLISH:  A="+nna+"   B="+nnb+"   C="+nnc+"   D="+nnd+"   F="+nnf);
									cell2=new PdfPCell(new Phrase(s4));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((nna+nnb+nnc+nnd+nnf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s5=String.format(" %s","PHYSICS:  A="+ppa+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   F="+ppf);
									cell2=new PdfPCell(new Phrase(s5));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((ppa+ppb+ppc+ppd+ppf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						    		
						            String s6=String.format(" %s","CHEMISTRY:  A="+cca+"   B="+ccb+"   C="+ccc+"   D="+ccd+"   F="+ccf);
									cell2=new PdfPCell(new Phrase(s6));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((cca+ccb+ccc+ccd+ccf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s7=String.format(" %s","BIOLOGY:  A="+zza+"   B="+zzb+"   C="+zzc+"   D="+zzd+"   F="+zzf);
									cell2=new PdfPCell(new Phrase(s7));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((zza+zzb+zzc+zzd+zzf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s8=String.format(" %s","B/MATH:  A="+mma+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   F="+mmf);
									cell2=new PdfPCell(new Phrase(s8));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((mma+mmb+mmc+mmd+mmf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						    		
									
									 String s9=String.format(" %s","HISTORY:  A="+hha+"   B="+hhb+"   C="+hhc+"   D="+hhd+"   F="+hhf);
										cell2=new PdfPCell(new Phrase(s9));
										cell2.setHorizontalAlignment(1);
										 cell2.setBorder(0);
										mudi2.setWidthPercentage(50);
										if((hha+hhb+hhc+hhd+hhf)>0) {
											 mudi2.addCell(cell2); 
							    		}
							    		
										
										 String s10=String.format(" %s","ARABIC:  A="+rra+"   B="+rrb+"   C="+rrc+"   D="+rrd+"   F="+rrf);
											cell2=new PdfPCell(new Phrase(s10));
											cell2.setHorizontalAlignment(1);
											 cell2.setBorder(0);
											mudi2.setWidthPercentage(50);
											if((rra+rrb+rrc+rrd+rrf)>0) {
												 mudi2.addCell(cell2); 
								    		}
								    		
						    		
						    		
						    	}catch(Exception ex) {
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	}catch(Exception ex){
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	
						    	 try {
						     			String sqq="select count(id) from  term1 where year='"+t40.getSelectedItem().toString()+"' and  term='"+t41.getSelectedItem().toString()+"' and  class='"+t42.getSelectedItem().toString()+"'   ";
						     			ps=con.prepareStatement(sqq);
						     			rs=ps.executeQuery();
						     			
						     			
						     			
						     			String sum=rs.getString("count(id)");
						     			String s=String.format(" %s"," JUMLA YA WANAFUNZI="+sum+":  DIV I="+count1+":  DIV II="+count2+":  DIV III="+count3+":  DIV IV="+count4+":  DIV O="+count0+":  WASIOKAMILISHA="+count5);
						     			cell1=new PdfPCell(new Phrase(s));
						     			cell1.setHorizontalAlignment(1);
						     			mudi.setWidthPercentage(105);mudi1.setWidthPercentage(105);
						                 mudi1.addCell(cell1);
						     			
						     		}catch(Exception ex) {
						     			JOptionPane.showMessageDialog(null, ex.getMessage());
						     		}

						    	
						    	 
						    	 
						    	 
	                   
						    try {
						    	
						    	
						    	 DefaultPieDataset pie=new DefaultPieDataset();
					   			 pie.setValue("DIVISION I", new Double(count1));
					   			 pie.setValue("DIVISION II", new Double(count2));
					   			 pie.setValue("DIVISION III", new Double(count3));
					   			 pie.setValue("DIVISION IV", new Double(count4));
					   			 pie.setValue("DIVISION O", new Double(count0));
						
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
							              
							                ChartUtilities.saveChartAsPNG(file1, chart, 750, 350,info);
											} catch (IOException e) {
												e.printStackTrace();
											}
						    
						    	
						    	
						    
						    	
						    }catch(Exception ex) {
						    	JOptionPane.showMessageDialog(null, ex.getStackTrace());
						    }


						    PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(t40.getSelectedItem().toString().replaceAll("'", "''")+".pdf"));
							document.open();
							
						Image image=Image.getInstance("Chartt.png");
						Image img=Image.getInstance("barcode.png");
						
						document.add(mudi23);
						
						//document.add(new Paragraph("TIME:               \t\t"+df.format(timer.getTime())));
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(mudi);
						document.add(new Paragraph("\n"));
						document.add(mudi2);
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(image);
						//document.add(new Paragraph("\n"));
						//document.add(img);
					//	document.add(new Paragraph("                                                                                                                                                                                                                                                                                            "+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						//document.add(new Paragraph("FIDEL CASTRO SECONDARY SCHOOL                "+et.getSelectedItem().toString()+"  EXAM RESULT                "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString() +"\n"+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )  ) );
						document.close();

						 JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
					      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+t40.getSelectedItem().toString().replaceAll("'", "''")+".pdf");
					      
						
	     				
	     				
	     			}else {
	     				JOptionPane.showMessageDialog(null, "No user with that Record !");
	     			}
	     			
			
			 
				} catch (Exception e) {
				JOptionPane.showMessageDialog(null,e.getStackTrace());
				} finally{
	  	             try{
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
				
				
				
					
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Cant't Accept Empty Value !");
				}
					
				
			}}
		});

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
									
									if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
										
										
										
										String sq1="delete  from mark11 where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ";
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
		
		if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
			
			
			try {
				
				 String sqq ="select count(id) from mark1 where exam = '"+et.getSelectedItem().toString()+"' and class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ";
		    	  ps=con.prepareStatement(sqq);
		    	 rs=ps.executeQuery();
		    	 int cou=Integer.parseInt(rs.getString("count(id)"));
		    	 
				if(cou>0) {
					

				    String sql2 ="select count(id) from mark11 where exam = '"+et.getSelectedItem().toString()+"' and class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ";
			    	  ps=con.prepareStatement(sql2);
			    	 rs=ps.executeQuery();
			    	 int count=Integer.parseInt(rs.getString("count(id)"));
			    	 
			    	 
					if(count>0 )
					{
						JOptionPane.showMessageDialog(null, "Data Already Present !");
					}
					else{
						 String sq="INSERT into mark11(id,cv,gcv,geo,ggeo,dini,gdini,kiswa,gkiswa,engl,gengl,phy,gphy,che,gche,bio,gbio,math,gmath,his,ghis,ara,gara,lit,glit,aco,gaco,bk,gbk,avg,point,class,exam,year,first,last,gender,sch,cmc,cmg,cmd,cmk,cme,cmch,cmm,cmb,cmp,cma,cmh,cml) SELECT id,cv,gcv,geo,ggeo,dini,gdini,kiswa,gkiswa,engl,gengl,phy,gphy,che,gche,bio,gbio,math,gmath,his,ghis,ara,gara,lit,glit,aco,gaco,bk,gbk,avg,point,class,exam,year,first,last,gender,sch,cmc,cmg,cmd,cmk,cme,cmch,cmm,cmb,cmp,cma,cmh,cml FROM mark1 WHERE exam='"+et.getSelectedItem().toString()+"' AND class='"+ct.getSelectedItem().toString()+"'  AND  year='"+ac.getSelectedItem().toString()+"'     ";
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
					if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
						
						String sqqq="select * from user1  where   class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' ORDER BY gender ASC,first ASC,last ASC";
				    	ps=con.prepareStatement(sqqq);
				    	rs=ps.executeQuery();
				    	
						
						PdfPTable mudi23 = new PdfPTable(1);
					     PdfPCell cell23=new PdfPCell(new Phrase(""));
					    
					     mudi23.setWidthPercentage(105);
					     Image im=Image.getInstance("other.png");
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
							document.add(new Paragraph("            "+school+"   SECONDARY SCHOOL",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("                                             ATTENDANCE FORM",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("                                             "+ct.getSelectedItem()+"  -  "+ac.getSelectedItem(),FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
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
				
				if(text1.getText() != null &&!text1.getText().trim().isEmpty() && text2.getText() != null &&!text2.getText().trim().isEmpty() &&text3.getText() != null &&!text3.getText().trim().isEmpty() && text4.getText() != null &&!text4.getText().trim().isEmpty() && text5.getText() != null &&!text5.getText().trim().isEmpty() && text6.getText() != null &&!text6.getText().trim().isEmpty() && text7.getText() != null &&!text7.getText().trim().isEmpty() && text8.getText() != null &&!text8.getText().trim().isEmpty() && text9.getText() != null &&!text9.getText().trim().isEmpty() && text10.getText() != null &&!text10.getText().trim().isEmpty() ) {
					
					grade1=Double.parseDouble(text1.getText());grade2=Double.parseDouble(text2.getText());grade3=Double.parseDouble(text3.getText());
					grade4=Double.parseDouble(text4.getText());grade5=Double.parseDouble(text5.getText());grade6=Double.parseDouble(text6.getText());
					grade7=Double.parseDouble(text7.getText());grade8=Double.parseDouble(text8.getText());
					grade9=Double.parseDouble(text9.getText());grade10=Double.parseDouble(text10.getText());
					
					
					if( (grade1>=0 && grade1<=100)&&(grade2>=0 && grade2<=100)&&(grade3>=0 && grade3<=100)&&(grade4>=0 && grade4<=100)&&(grade5>=0 && grade5<=100)&&(grade6>=0 && grade6<=100)&&(grade7>=0 && grade7<=100)&&(grade8>=0 && grade8<=100)&&(grade9>=0 && grade9<=100)&&(grade10>=0 && grade10<=100) ) {
						
						try {
							String sql="update grade set grade1='"+grade1+"',grade2='"+grade2+"',grade3='"+grade3+"',grade4='"+grade4+"',grade5='"+grade5+"',grade6='"+grade6+"',grade7='"+grade7+"',grade8='"+grade8+"',grade9='"+grade9+"',grade10='"+grade10+"' where rowid='"+2+"'  ";
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
			l.setSize(610,330);
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
									

							            String sqq="update mark1 set phy='"+mk+"',gphy='"+mk+"',che='"+mk+"',gche='"+mk+"',math='"+mk+"',gmath='"+mk+"',bio='"+mk+"',gbio='"+mk+"',geo='"+mk+"',ggeo='"+mk+"',dini='"+mk+"',gdini='"+mk+"',cv='"+mk+"',gcv='"+mk+"',engl='"+mk+"',gengl='"+mk+"',kiswa='"+mk+"',gkiswa='"+mk+"' ,his='"+mk+"',ghis='"+mk+"',ara='"+mk+"',gara='"+mk+"',lit='"+mk+"',glit='"+mk+"' ,point='"+mk2+"',avg='"+mk2+"' where  class='"+box2.getSelectedItem().toString()+"' ";
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
								 
					         if(((box69.getSelectedItem() != null &&!((String) box69.getSelectedItem()).trim().isEmpty()) &&(box70.getSelectedItem() != null &&!((String) box70.getSelectedItem()).trim().isEmpty())) && ((box73.getSelectedItem() != null &&!((String) box73.getSelectedItem()).trim().isEmpty()) &&(box74.getSelectedItem() != null &&!((String) box74.getSelectedItem()).trim().isEmpty())) || ((box71.getSelectedItem() != null &&!((String) box71.getSelectedItem()).trim().isEmpty()) &&(box72.getSelectedItem() != null &&!((String) box72.getSelectedItem()).trim().isEmpty())) && ((box75.getSelectedItem() != null )) )    {
								
							        if(result==JOptionPane.OK_OPTION) {
							        	
							        
							        	
							        	
							        		
							        		String sql1="update  user1 set  class='"+box70.getSelectedItem().toString()+"',exam='"+box74.getSelectedItem().toString()+"' ,year='"+box72.getSelectedItem().toString()+"' ,sch='"+box76.getSelectedItem().toString()+"' where  class='"+box69.getSelectedItem().toString()+"' ";
											ps=con.prepareStatement(sql1);
											ps.execute();
											String sql11="update  mark1 set  class='"+box70.getSelectedItem().toString()+"',exam='"+box74.getSelectedItem().toString()+"',year='"+box72.getSelectedItem().toString()+"',sch='"+box76.getSelectedItem().toString()+"' where  class='"+box69.getSelectedItem().toString()+"' ";
											ps=con.prepareStatement(sql11);
											ps.execute();
								        	
							        
										JOptionPane.showMessageDialog(null,"Updated Successfully !");
										box69.setSelectedItem(null);box70.setSelectedItem(null);box71.setSelectedItem(null);box72.setSelectedItem(null);
										box73.setSelectedItem(null);box74.setSelectedItem(null);box75.setSelectedItem(null);box76.setSelectedItem(null);
										table();
							        	
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
								
								 String[] choices =  {"KIDATO CHA I","KIDATO CHA II","KIDATO CHA III","KIDATO CHA IV"};
								    String input1 = (String) JOptionPane.showInputDialog(null, "Select Class to DELETE","Select ", JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
								     
								 
								String s1=String.format("%s   %s  %s","Are you sure you want to Delete,",input1,"Class");
								String s2=String.format("%s   %s  %s",input1,"Class","Deleted Successfully !");
								
								int mudi=JOptionPane.showConfirmDialog(b4, s1,"Delete ALL Class", JOptionPane.YES_NO_OPTION);
								if(mudi==JOptionPane.YES_OPTION)
								{
							
							String sq1="delete  from user1 where Class='"+input1+"' ";
							ps=con.prepareStatement(sq1);
							ps.execute();
							ps.close();
							
							String sq2="delete  from mark1 where Class='"+input1+"' ";
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
	
	
	
	 level.addActionListener(new ActionListener(){
		 
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
			Mudi level=new Mudi();
			level.setVisible(true);
			level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			level.setSize(1365,765);
			level.setResizable(false);
			level.setIconImage(Toolkit.getDefaultToolkit().getImage(level.getClass().getResource("/lo.png")));

			}});
	
	 pri.addActionListener(new ActionListener(){
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
			Primary level=new Primary();
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

					

     				int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0;
			    	int ppa=0,ppb=0,ppc=0,ppd=0,ppf=0;
					int ggga=0,gggb=0,gggc=0,gggd=0,gggf=0;
					int cca=0,ccb=0,ccc=0,ccd=0,ccf=0;
					int bba=0,bbb=0,bbc=0,bbd=0,bbf=0;
					int mma=0,mmb=0,mmc=0,mmd=0,mmf=0;
					int dda=0,ddb=0,ddc=0,ddd=0,ddf=0;
					int kka=0,kkb=0,kkc=0,kkd=0,kkf=0;
					int nna=0,nnb=0,nnc=0,nnd=0,nnf=0;
					int zza=0,zzb=0,zzc=0,zzd=0,zzf=0;
					int hha=0,hhb=0,hhc=0,hhd=0,hhf=0;
					int rra=0,rrb=0,rrc=0,rrd=0,rrf=0;
					int lla=0,llb=0,llc=0,lld=0,llf=0;
					
					
					
			    
			    	String count="select count(id) from mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"'  ";
	     			ps=con.prepareStatement(count);
	     			ResultSet rss=ps.executeQuery();
	     			
	     			
	     			String sqqq="select point from mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem().toString()+"'";
			    	ps=con.prepareStatement(sqqq);
			    	rs=ps.executeQuery();
			    	
			    	    String sq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' ";
					 	ps=con.prepareStatement(sq);
					 	ResultSet rr=ps.executeQuery();
					 	
					 	
					 	 String sg="select * from mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem().toString()+"'";
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
						    mudi.setWidthPercentage(105);					    
						    cell.setColspan(36);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
					     
					    
	      		    	 
	      		    	PdfPTable mudi23 = new PdfPTable(1);
					     PdfPCell cell23=new PdfPCell(new Phrase(""));
					     cell23.setColspan(4);
					     
					     mudi23.setWidthPercentage(105);
					     Image im=Image.getInstance("other.png");
	      		    	 cell.setBorder(0);
	       		    	 mudi23.addCell(cell23);
	      		    	 mudi23.addCell(im);
	      		    	 
	      		    	 cell = new PdfPCell(new Phrase("\n", FontFactory.getFont("COURIER_BOLD", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						    mudi23.addCell(cell);
					     
	      		    	   cell = new PdfPCell(new Phrase(school+" SECONDARY SCHOOL", FontFactory.getFont("Arial", 25, Font.BOLD, BaseColor.BLACK)));
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
						   
						     
						     
							   cell = new PdfPCell(new Phrase("JINA KAMILI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(6);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JINS",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("CIVICS",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
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
							    cell = new PdfPCell(new Phrase("KISW",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ENG",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("CHEM",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("MATH",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("BIO",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("PHY",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ARAB",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HISTRY",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("LITERAT",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);//cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("WAST",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("PNT",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DIV",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
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
							    cell.setHorizontalAlignment(1);//cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);//cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							   
						     
						 	String a="";
						    	
						    	try {
						    		while(rr.next()) {
						    			
						    			a=rr.getString("rank");
						    			
						    			String fn=rr.getString("first");
							    		String ln=rr.getString("last");
							    		
						                String gn=rr.getString("gender");
						                
						                cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(6);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 8, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
							          	
						               
						                String cv=rr.getString("cv");String gcv=rr.getString("gcv");
						                String dini=rr.getString("dini");String gdini=rr.getString("gdini");
						                String kiswa=rr.getString("kiswa");String gkiswa=rr.getString("gkiswa");
						                String engl=rr.getString("engl");String gengl=rr.getString("gengl");
						                String che=rr.getString("che");String gche=rr.getString("gche");
						                String math=rr.getString("math");String gmath=rr.getString("gmath");
						                String bio=rr.getString("bio");String gbio=rr.getString("gbio");
						                String phy=rr.getString("phy");String gphy=rr.getString("gphy");
						                String ara=rr.getString("ara");String gara=rr.getString("gara");
						                String his=rr.getString("his");String ghis=rr.getString("ghis");
						                String geo=rr.getString("geo");String ggeo=rr.getString("ggeo");
						                String lit=rr.getString("lit");String glit=rr.getString("glit");
						                
							          	
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
									    cell = new PdfPCell(new Phrase(che,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gche,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
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
									    cell = new PdfPCell(new Phrase(bio,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbio,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(phy,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gphy,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
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
									    cell = new PdfPCell(new Phrase(lit,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(glit,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
							         
						                      if(rr.getString("point").matches("Inc")) {
									    			p="Inc";
									    		}else {
									    			int mark=Integer.parseInt(rr.getString("point"));
										    		
										    		if(mark>=7 && mark<=17) {
										    			p="I";
										    		}else if(mark>=18 && mark<=21) {
										    			p="II";
										    		}else if(mark>=22 && mark<=25) {
										    			p="III";
										    		}
										    		else if(mark>=26 && mark<=33) {
										    			p="IV";
										    		}else if(mark>=34&& mark<=35) {
										    			p="O";
									    		}
									    		
									    		}
						                      
						                        String po=rr.getString("point");
								                cell=new PdfPCell(new Phrase(po));
								                cell.setHorizontalAlignment(1);
								             
								                
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
											    
											    cell = new PdfPCell(new Phrase(po,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(1);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase(p,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(1);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase(a+"",FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(1);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
						                   
						    			
						    		}
						    		
						    		
						    		
						    	
						    	while(rs.next()) {
						    		
						    		if(rs.getString("point").matches("Inc")) {
						    			count5++;
						    			
						    		}else {
						    			int mark=Integer.parseInt(rs.getString("point"));
							    		
							    		if(mark>=7 && mark<=17) {
							    			count1++;
							    		}else if(mark>=18 && mark<=21) {
							    			count2=count2+1;
							    		}else if(mark>=22 && mark<=25) {
							    			count3++;
							    		}
							    		else if(mark>=26 && mark<=33) {
							    			count4++;
							    		}else if(mark>=34 && mark<=35) {
							    			count0++;
							    			
							    		
							    		}
						    
							    		
						    		}
						    		}
						    	
						    	
						    	try {
						    		
						    		
						    		while(grs.next()) {
						    			
						    			 if(grs.getString("gcv") != null) {
								    			
							                 String mg=grs.getString("gcv");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         ggga++;
							   	    		}else if(mg.matches("B")) {
							   			    	   gggb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   gggc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   gggd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   gggf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("ggeo") != null) {
								    			
							                 String mg=grs.getString("ggeo");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         bba++;
							   	    		}else if(mg.matches("B")) {
							   			    	   bbb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   bbc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   bbd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   bbf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("gdini") != null) {
								    			
							                 String mg=grs.getString("gdini");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         dda++;
							   	    		}else if(mg.matches("B")) {
							   			    	   ddb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   ddc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   ddd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   ddf++;
							   			    		}
								    		
							    		 }
						    			 
						    			 if(grs.getString("gkiswa") != null) {
								    			
							                 String mg=grs.getString("gkiswa");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         kka++;
							   	    		}else if(mg.matches("B")) {
							   			    	   kkb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   kkc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   kkd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   kkf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("gengl") != null) {
								    			
							                 String mg=grs.getString("gengl");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         nna++;
							   	    		}else if(mg.matches("B")) {
							   			    	   nnb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   nnc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   nnd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   nnf++;
							   			    		}
						    			 }
						    			 if(grs.getString("gphy") != null) {
								    			
							                 String mg=grs.getString("gphy");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         ppa++;
							   	    		}else if(mg.matches("B")) {
							   			    	   ppb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   ppc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   ppd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   ppf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("gche") != null) {
								    			
							                 String mg=grs.getString("gche");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         cca++;
							   	    		}else if(mg.matches("B")) {
							   			    	   ccb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   ccc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   ccd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   ccf++;
							   			    		}
						    			 }
						    			
						    			 
						    			 if(grs.getString("gbio") != null) {
								    			
							                 String mg=grs.getString("gbio");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         zza++;
							   	    		}else if(mg.matches("B")) {
							   			    	   zzb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   zzc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   zzd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   zzf++;
							   			    		}
						    			 }
						    			
						    			 if(grs.getString("gmath") != null) {
								    			
							                 String mg=grs.getString("gmath");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         mma++;
							   	    		}else if(mg.matches("B")) {
							   			    	   mmb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   mmc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   mmd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   mmf++;
							   			    		}
						    			 }
						    			
						    			 
						    			 if(grs.getString("ghis") != null) {
								    			
							                 String mg=grs.getString("ghis");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         hha++;
							   	    		}else if(mg.matches("B")) {
							   			    	   hhb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   hhc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   hhd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   hhf++;
							   			    		}
						    			 }
						    			
						    			 if(grs.getString("gara") != null) {
								    			
							                 String mg=grs.getString("gara");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         rra++;
							   	    		}else if(mg.matches("B")) {
							   			    	   rrb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   rrc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   rrd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   rrf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("glit") != null) {
								    			
							                 String mg=grs.getString("glit");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         lla++;
							   	    		}else if(mg.matches("B")) {
							   			    	   llb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   llc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   lld++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   llf++;
							   			    		}
						    			 }
						    			
						    		}
						    		String sm=String.format("SUBJECT ANALYSIS");
									cell2=new PdfPCell(new Phrase(sm));
									cell2.setHorizontalAlignment(1);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						            
						            String s0=String.format("*****");
									cell2=new PdfPCell(new Phrase(s0));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						            
						    	 
						        	 String s=String.format(" %s","CIVICS:  A="+ggga+"   B="+gggb+"   C="+gggc+"   D="+gggd+"      F="+gggf);
									cell2=new PdfPCell(new Phrase(s));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((ggga+gggb+gggc+gggd+gggf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						          
						           
						            
						            String s1=String.format(" %s","GEOGRAPHY:  A="+bba+"   B="+bbb+"   C="+bbc+"   D="+bbd+"   F="+bbf);
									cell2=new PdfPCell(new Phrase(s1));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((bba+bbb+bbc+bbd+bbf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s2=String.format(" %s","DINI:  A="+dda+"   B="+ddb+"   C="+ddc+"   D="+ddd+"   F="+ddf);
									cell2=new PdfPCell(new Phrase(s2));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((dda+ddb+ddc+ddd+ddf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						    		
						            
						            String s3=String.format(" %s","KISWAHILI:  A="+kka+"   B="+kkb+"   C="+kkc+"   D="+kkd+"   F="+kkf);
									cell2=new PdfPCell(new Phrase(s3));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((kka+kkb+kkc+kkd+kkf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s4=String.format(" %s","ENGLISH:  A="+nna+"   B="+nnb+"   C="+nnc+"   D="+nnd+"   F="+nnf);
									cell2=new PdfPCell(new Phrase(s4));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((nna+nnb+nnc+nnd+nnf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s5=String.format(" %s","PHYSICS:  A="+ppa+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   F="+ppf);
									cell2=new PdfPCell(new Phrase(s5));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((ppa+ppb+ppc+ppd+ppf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						    		
						            String s6=String.format(" %s","CHEMISTRY:  A="+cca+"   B="+ccb+"   C="+ccc+"   D="+ccd+"   F="+ccf);
									cell2=new PdfPCell(new Phrase(s6));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((cca+ccb+ccc+ccd+ccf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s7=String.format(" %s","BIOLOGY:  A="+zza+"   B="+zzb+"   C="+zzc+"   D="+zzd+"   F="+zzf);
									cell2=new PdfPCell(new Phrase(s7));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((zza+zzb+zzc+zzd+zzf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s8=String.format(" %s","B/MATH:  A="+mma+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   F="+mmf);
									cell2=new PdfPCell(new Phrase(s8));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((mma+mmb+mmc+mmd+mmf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						    		
									
									 String s9=String.format(" %s","HISTORY:  A="+hha+"   B="+hhb+"   C="+hhc+"   D="+hhd+"   F="+hhf);
										cell2=new PdfPCell(new Phrase(s9));
										cell2.setHorizontalAlignment(1);
										 cell2.setBorder(0);
										mudi2.setWidthPercentage(50);
										if((hha+hhb+hhc+hhd+hhf)>0) {
											 mudi2.addCell(cell2); 
							    		}
							    		
										
										 String s10=String.format(" %s","ARABIC:  A="+rra+"   B="+rrb+"   C="+rrc+"   D="+rrd+"   F="+rrf);
											cell2=new PdfPCell(new Phrase(s10));
											cell2.setHorizontalAlignment(1);
											 cell2.setBorder(0);
											mudi2.setWidthPercentage(50);
											if((rra+rrb+rrc+rrd+rrf)>0) {
												 mudi2.addCell(cell2); 
								    		}
											

											 String s11=String.format(" %s","LITERATURE:  A="+lla+"   B="+llb+"   C="+llc+"   D="+lld+"   F="+llf);
												cell2=new PdfPCell(new Phrase(s11));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(50);
												if((lla+llb+llc+lld+llf)>0) {
													 mudi2.addCell(cell2); 
									    		}
								    		
						    		
						    		
						    	}catch(Exception ex) {
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	}catch(Exception ex){
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	
						    	 try {
						     			String sqq="select count(id) from mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem().toString()+"'";
						     			ps=con.prepareStatement(sqq);
						     			rs=ps.executeQuery();
						     			
						     			
						     			
						     			String sum=rs.getString("count(id)");
						     			String s=String.format(" %s"," JUMLA YA WANAFUNZI="+sum+":  DIV I="+count1+":  DIV II="+count2+":  DIV III="+count3+":  DIV IV="+count4+":  DIV O="+count0+":  WASIOKAMILISHA="+count5);
						     			cell1=new PdfPCell(new Phrase(s));
						     			cell1.setHorizontalAlignment(1);
						     			mudi.setWidthPercentage(105);mudi1.setWidthPercentage(105);
						                 mudi1.addCell(cell1);
						     			
						     		}catch(Exception ex) {
						     			JOptionPane.showMessageDialog(null, ex.getMessage());
						     		}

						    	
						    	 
						    	 
						    	 
                       
						    try {
						    	
						    	
						    	 DefaultPieDataset pie=new DefaultPieDataset();
					   			 pie.setValue("DIVISION I", new Double(count1));
					   			 pie.setValue("DIVISION II", new Double(count2));
					   			 pie.setValue("DIVISION III", new Double(count3));
					   			 pie.setValue("DIVISION IV", new Double(count4));
					   			 pie.setValue("DIVISION O", new Double(count0));
						
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
							              
							                ChartUtilities.saveChartAsPNG(file1, chart, 750, 350,info);
											} catch (IOException e) {
												e.printStackTrace();
											}
						    
						    	
						    	
						    
						    	
						    }catch(Exception ex) {
						    	JOptionPane.showMessageDialog(null, ex.getMessage());
						    }


						    PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf"));
							document.open();
							
						Image image=Image.getInstance("Chartt.png");
						Image img=Image.getInstance("barcode.png");
						
						document.add(mudi23);
						
						//document.add(new Paragraph("TIME:               \t\t"+df.format(timer.getTime())));
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(mudi);
						document.add(new Paragraph("\n"));
						document.add(mudi2);
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(image);
						//document.add(new Paragraph("\n"));
						//document.add(img);
					//	document.add(new Paragraph("                                                                                                                                                                                                                                                                                            "+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						//document.add(new Paragraph("FIDEL CASTRO SECONDARY SCHOOL                "+et.getSelectedItem().toString()+"  EXAM RESULT                "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString() +"\n"+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )  ) );
						document.close();

						 JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
					      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf");
					      
						
	     				
	     				
	     			}else {
	     				JOptionPane.showMessageDialog(null, "No user with that Record !");
	     			}
	     			
			
			 
				} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				} finally{
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
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	clao.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
			
			int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			
			if(result==JOptionPane.OK_OPTION){
				
				if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
					
				  	Document document=new Document(PageSize.A4.rotate());
				  	
				  	
					 Calendar timer=Calendar.getInstance();
					 timer.getTime();
					 SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
					 SimpleDateFormat dt=new SimpleDateFormat("MMM dd,  yyyy");
					 
				
				 
				try {

					

     				int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0;
			    	int ppa=0,ppb=0,ppc=0,ppd=0,ppf=0;
					int ggga=0,gggb=0,gggc=0,gggd=0,gggf=0;
					int cca=0,ccb=0,ccc=0,ccd=0,ccf=0;
					int bba=0,bbb=0,bbc=0,bbd=0,bbf=0;
					int mma=0,mmb=0,mmc=0,mmd=0,mmf=0;
					int dda=0,ddb=0,ddc=0,ddd=0,ddf=0;
					int kka=0,kkb=0,kkc=0,kkd=0,kkf=0;
					int nna=0,nnb=0,nnc=0,nnd=0,nnf=0;
					int zza=0,zzb=0,zzc=0,zzd=0,zzf=0;
					int hha=0,hhb=0,hhc=0,hhd=0,hhf=0;
					int rra=0,rrb=0,rrc=0,rrd=0,rrf=0;
					int lla=0,llb=0,llc=0,lld=0,llf=0;
					
					
					
			    
			    	String count="select count(id) from mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"'  ";
	     			ps=con.prepareStatement(count);
	     			ResultSet rss=ps.executeQuery();
	     			
	     			
	     			String sqqq="select point from mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem().toString()+"'";
			    	ps=con.prepareStatement(sqqq);
			    	rs=ps.executeQuery();
			    	
			    	    String sq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' ";
					 	ps=con.prepareStatement(sq);
					 	ResultSet rr=ps.executeQuery();
					 	
					 	
					 	 String sg="select * from mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem().toString()+"'";
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
						    mudi.setWidthPercentage(105);					    
						    cell.setColspan(36);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
					     
					    
	      		    	 
	      		    	PdfPTable mudi23 = new PdfPTable(1);
					     PdfPCell cell23=new PdfPCell(new Phrase(""));
					     cell23.setColspan(4);
					     
					     mudi23.setWidthPercentage(105);
					     Image im=Image.getInstance("other.png");
	      		    	 cell.setBorder(0);
	       		    	 mudi23.addCell(cell23);
	      		    	 mudi23.addCell(im);
	      		    	 
	      		    	 cell = new PdfPCell(new Phrase("\n", FontFactory.getFont("COURIER_BOLD", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setBorder(0);
						    cell.setHorizontalAlignment(1);
						    mudi23.addCell(cell);
					     
	      		    	   cell = new PdfPCell(new Phrase(school+" SECONDARY SCHOOL", FontFactory.getFont("Arial", 25, Font.BOLD, BaseColor.BLACK)));
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
						   
						     
						     
							   cell = new PdfPCell(new Phrase("JINA KAMILI",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(6);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("JINS",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("CIVICS",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
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
							    cell = new PdfPCell(new Phrase("KISW",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ENG",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("CHEM",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("MATH",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("BIO",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("PHY",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ARAB",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("HISTRY",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("LITERAT",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);//cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("WAST",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("PNT",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DIV",FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
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
							    cell.setHorizontalAlignment(1);//cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("D",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);
							    cell.setHorizontalAlignment(1);//cell.setBackgroundColor(new BaseColor(135,206,235));
							    mudi.addCell(cell);
							   
						     
						 	String a="";
						    	
						    	try {
						    		while(rr.next()) {
						    			
						    			a=rr.getString("rank");
						    			
						    			String fn=rr.getString("first");
							    		String ln=rr.getString("last");
							    		
						                String gn=rr.getString("gender");
						                
						                cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 8, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(6);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 8, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
							          	
						               
						                String cv=rr.getString("cv");String gcv=rr.getString("gcv");
						                String dini=rr.getString("dini");String gdini=rr.getString("gdini");
						                String kiswa=rr.getString("kiswa");String gkiswa=rr.getString("gkiswa");
						                String engl=rr.getString("engl");String gengl=rr.getString("gengl");
						                String che=rr.getString("che");String gche=rr.getString("gche");
						                String math=rr.getString("math");String gmath=rr.getString("gmath");
						                String bio=rr.getString("bio");String gbio=rr.getString("gbio");
						                String phy=rr.getString("phy");String gphy=rr.getString("gphy");
						                String ara=rr.getString("ara");String gara=rr.getString("gara");
						                String his=rr.getString("his");String ghis=rr.getString("ghis");
						                String geo=rr.getString("geo");String ggeo=rr.getString("ggeo");
						                String lit=rr.getString("lit");String glit=rr.getString("glit");
						                
							          	
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
									    cell = new PdfPCell(new Phrase(che,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gche,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
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
									    cell = new PdfPCell(new Phrase(bio,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbio,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(phy,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gphy,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
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
									    cell = new PdfPCell(new Phrase(lit,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(glit,FontFactory.getFont("Arial", 9, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
							         
						                      if(rr.getString("point").matches("Inc")) {
									    			p="Inc";
									    		}else {
									    			int mark=Integer.parseInt(rr.getString("point"));
										    		
										    		if(mark>=7 && mark<=17) {
										    			p="I";
										    		}else if(mark>=18 && mark<=21) {
										    			p="II";
										    		}else if(mark>=22 && mark<=25) {
										    			p="III";
										    		}
										    		else if(mark>=26 && mark<=33) {
										    			p="IV";
										    		}else if(mark>=34&& mark<=35) {
										    			p="O";
									    		}
									    		
									    		}
						                      
						                        String po=rr.getString("point");
								                cell=new PdfPCell(new Phrase(po));
								                cell.setHorizontalAlignment(1);
								             
								                
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
											    
											    cell = new PdfPCell(new Phrase(po,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(1);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase(p,FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(1);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase(a+"",FontFactory.getFont("Arial", 9, Font.BOLD, BaseColor.BLACK)));
											    cell.setColspan(1);
											   cell.setHorizontalAlignment(1);
											    mudi.addCell(cell);
						                   
						    			
						    		}
						    		
						    		
						    		
						    	
						    	while(rs.next()) {
						    		
						    		if(rs.getString("point").matches("Inc")) {
						    			count5++;
						    			
						    		}else {
						    			int mark=Integer.parseInt(rs.getString("point"));
							    		
							    		if(mark>=7 && mark<=17) {
							    			count1++;
							    		}else if(mark>=18 && mark<=21) {
							    			count2=count2+1;
							    		}else if(mark>=22 && mark<=25) {
							    			count3++;
							    		}
							    		else if(mark>=26 && mark<=33) {
							    			count4++;
							    		}else if(mark>=34 && mark<=35) {
							    			count0++;
							    			
							    		
							    		}
						    
							    		
						    		}
						    		}
						    	
						    	
						    	try {
						    		
						    		
						    		while(grs.next()) {
						    			
						    			 if(grs.getString("gcv") != null) {
								    			
							                 String mg=grs.getString("gcv");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         ggga++;
							   	    		}else if(mg.matches("B")) {
							   			    	   gggb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   gggc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   gggd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   gggf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("ggeo") != null) {
								    			
							                 String mg=grs.getString("ggeo");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         bba++;
							   	    		}else if(mg.matches("B")) {
							   			    	   bbb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   bbc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   bbd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   bbf++;
							   			    		}
								    		
							    		 }
							    		 
						    			 if(grs.getString("gdini") != null) {
								    			
							                 String mg=grs.getString("gdini");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         dda++;
							   	    		}else if(mg.matches("B")) {
							   			    	   ddb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   ddc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   ddd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   ddf++;
							   			    		}
								    		
							    		 }
						    			 
						    			 if(grs.getString("gkiswa") != null) {
								    			
							                 String mg=grs.getString("gkiswa");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         kka++;
							   	    		}else if(mg.matches("B")) {
							   			    	   kkb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   kkc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   kkd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   kkf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("gengl") != null) {
								    			
							                 String mg=grs.getString("gengl");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         nna++;
							   	    		}else if(mg.matches("B")) {
							   			    	   nnb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   nnc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   nnd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   nnf++;
							   			    		}
						    			 }
						    			 if(grs.getString("gphy") != null) {
								    			
							                 String mg=grs.getString("gphy");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         ppa++;
							   	    		}else if(mg.matches("B")) {
							   			    	   ppb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   ppc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   ppd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   ppf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("gche") != null) {
								    			
							                 String mg=grs.getString("gche");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         cca++;
							   	    		}else if(mg.matches("B")) {
							   			    	   ccb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   ccc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   ccd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   ccf++;
							   			    		}
						    			 }
						    			
						    			 
						    			 if(grs.getString("gbio") != null) {
								    			
							                 String mg=grs.getString("gbio");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         zza++;
							   	    		}else if(mg.matches("B")) {
							   			    	   zzb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   zzc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   zzd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   zzf++;
							   			    		}
						    			 }
						    			
						    			 if(grs.getString("gmath") != null) {
								    			
							                 String mg=grs.getString("gmath");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         mma++;
							   	    		}else if(mg.matches("B")) {
							   			    	   mmb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   mmc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   mmd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   mmf++;
							   			    		}
						    			 }
						    			
						    			 
						    			 if(grs.getString("ghis") != null) {
								    			
							                 String mg=grs.getString("ghis");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         hha++;
							   	    		}else if(mg.matches("B")) {
							   			    	   hhb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   hhc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   hhd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   hhf++;
							   			    		}
						    			 }
						    			
						    			 if(grs.getString("gara") != null) {
								    			
							                 String mg=grs.getString("gara");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         rra++;
							   	    		}else if(mg.matches("B")) {
							   			    	   rrb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   rrc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   rrd++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   rrf++;
							   			    		}
						    			 }
						    			 
						    			 if(grs.getString("glit") != null) {
								    			
							                 String mg=grs.getString("glit");
							   	    		
							   	    		if(mg.matches("A")) {
							   	    	         lla++;
							   	    		}else if(mg.matches("B")) {
							   			    	   llb++;
							   			    		}
							   	    		else if(mg.matches("C")) {
							   			    	   llc++;
							   			    		}
							   	    		else if(mg.matches("D")) {
							   			    	   lld++;
							   			    		}
							   	    		else if(mg.matches("F")) {
							   			    	   llf++;
							   			    		}
						    			 }
						    			
						    		}
						    		String sm=String.format("SUBJECT ANALYSIS");
									cell2=new PdfPCell(new Phrase(sm));
									cell2.setHorizontalAlignment(1);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						            
						            String s0=String.format("*****");
									cell2=new PdfPCell(new Phrase(s0));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						            
						    	 
						        	 String s=String.format(" %s","CIVICS:  A="+ggga+"   B="+gggb+"   C="+gggc+"   D="+gggd+"      F="+gggf);
									cell2=new PdfPCell(new Phrase(s));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((ggga+gggb+gggc+gggd+gggf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						          
						           
						            
						            String s1=String.format(" %s","GEOGRAPHY:  A="+bba+"   B="+bbb+"   C="+bbc+"   D="+bbd+"   F="+bbf);
									cell2=new PdfPCell(new Phrase(s1));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((bba+bbb+bbc+bbd+bbf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s2=String.format(" %s","DINI:  A="+dda+"   B="+ddb+"   C="+ddc+"   D="+ddd+"   F="+ddf);
									cell2=new PdfPCell(new Phrase(s2));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((dda+ddb+ddc+ddd+ddf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						    		
						            
						            String s3=String.format(" %s","KISWAHILI:  A="+kka+"   B="+kkb+"   C="+kkc+"   D="+kkd+"   F="+kkf);
									cell2=new PdfPCell(new Phrase(s3));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((kka+kkb+kkc+kkd+kkf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s4=String.format(" %s","ENGLISH:  A="+nna+"   B="+nnb+"   C="+nnc+"   D="+nnd+"   F="+nnf);
									cell2=new PdfPCell(new Phrase(s4));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((nna+nnb+nnc+nnd+nnf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s5=String.format(" %s","PHYSICS:  A="+ppa+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   F="+ppf);
									cell2=new PdfPCell(new Phrase(s5));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((ppa+ppb+ppc+ppd+ppf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						    		
						            String s6=String.format(" %s","CHEMISTRY:  A="+cca+"   B="+ccb+"   C="+ccc+"   D="+ccd+"   F="+ccf);
									cell2=new PdfPCell(new Phrase(s6));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((cca+ccb+ccc+ccd+ccf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s7=String.format(" %s","BIOLOGY:  A="+zza+"   B="+zzb+"   C="+zzc+"   D="+zzd+"   F="+zzf);
									cell2=new PdfPCell(new Phrase(s7));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((zza+zzb+zzc+zzd+zzf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						            
						            String s8=String.format(" %s","B/MATH:  A="+mma+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   F="+mmf);
									cell2=new PdfPCell(new Phrase(s8));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((mma+mmb+mmc+mmd+mmf)>0) {
										 mudi2.addCell(cell2); 
						    		}
						    		
									
									 String s9=String.format(" %s","HISTORY:  A="+hha+"   B="+hhb+"   C="+hhc+"   D="+hhd+"   F="+hhf);
										cell2=new PdfPCell(new Phrase(s9));
										cell2.setHorizontalAlignment(1);
										 cell2.setBorder(0);
										mudi2.setWidthPercentage(50);
										if((hha+hhb+hhc+hhd+hhf)>0) {
											 mudi2.addCell(cell2); 
							    		}
							    		
										
										 String s10=String.format(" %s","ARABIC:  A="+rra+"   B="+rrb+"   C="+rrc+"   D="+rrd+"   F="+rrf);
											cell2=new PdfPCell(new Phrase(s10));
											cell2.setHorizontalAlignment(1);
											 cell2.setBorder(0);
											mudi2.setWidthPercentage(50);
											if((rra+rrb+rrc+rrd+rrf)>0) {
												 mudi2.addCell(cell2); 
								    		}
											
											 String s11=String.format(" %s","LITERATURE:  A="+lla+"   B="+llb+"   C="+llc+"   D="+lld+"   F="+llf);
												cell2=new PdfPCell(new Phrase(s11));
												cell2.setHorizontalAlignment(1);
												 cell2.setBorder(0);
												mudi2.setWidthPercentage(50);
												if((lla+llb+llc+lld+llf)>0) {
													 mudi2.addCell(cell2); 
									    		}
								    		
						    		
						    		
						    	}catch(Exception ex) {
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	}catch(Exception ex){
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	}
						    	
						    	
						    	 try {
						     			String sqq="select count(id) from mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+jj.getSelectedItem().toString()+"'";
						     			ps=con.prepareStatement(sqq);
						     			rs=ps.executeQuery();
						     			
						     			
						     			
						     			String sum=rs.getString("count(id)");
						     			String s=String.format(" %s"," JUMLA YA WANAFUNZI="+sum+":  DIV I="+count1+":  DIV II="+count2+":  DIV III="+count3+":  DIV IV="+count4+":  DIV O="+count0+":  WASIOKAMILISHA="+count5);
						     			cell1=new PdfPCell(new Phrase(s));
						     			cell1.setHorizontalAlignment(1);
						     			mudi.setWidthPercentage(105);mudi1.setWidthPercentage(105);
						                 mudi1.addCell(cell1);
						     			
						     		}catch(Exception ex) {
						     			JOptionPane.showMessageDialog(null, ex.getMessage());
						     		}

						    	
						    	 
						    	 
						    	 
                       
						    try {
						    	
						    	
						    	 DefaultPieDataset pie=new DefaultPieDataset();
					   			 pie.setValue("DIVISION I", new Double(count1));
					   			 pie.setValue("DIVISION II", new Double(count2));
					   			 pie.setValue("DIVISION III", new Double(count3));
					   			 pie.setValue("DIVISION IV", new Double(count4));
					   			 pie.setValue("DIVISION O", new Double(count0));
						
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
							              
							                ChartUtilities.saveChartAsPNG(file1, chart, 750, 350,info);
											} catch (IOException e) {
												e.printStackTrace();
											}
						    
						    	
						    	
						    
						    	
						    }catch(Exception ex) {
						    	JOptionPane.showMessageDialog(null, ex.getMessage());
						    }


						    PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf"));
							document.open();
							
						Image image=Image.getInstance("Chartt.png");
						Image img=Image.getInstance("barcode.png");
						
						document.add(mudi23);
						
						//document.add(new Paragraph("TIME:               \t\t"+df.format(timer.getTime())));
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(mudi);
						document.add(new Paragraph("\n"));
						document.add(mudi2);
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(image);
						//document.add(new Paragraph("\n"));
						//document.add(img);
					//	document.add(new Paragraph("                                                                                                                                                                                                                                                                                            "+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						//document.add(new Paragraph("FIDEL CASTRO SECONDARY SCHOOL                "+et.getSelectedItem().toString()+"  EXAM RESULT                "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString() +"\n"+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )  ) );
						document.close();

						 JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
					      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf");
					      
						
	     				
	     				
	     			}else {
	     				JOptionPane.showMessageDialog(null, "No user with that Record !");
	     			}
	     			
			
			 
				} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				} finally{
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
					
					if(jj.getSelectedItem() != null &&!((String) jj.getSelectedItem()).trim().isEmpty() &&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
						
						    String a="";String p="";
						    String count="select count(id) from mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' ";
							ps=con.prepareStatement(count);
							ResultSet rss=ps.executeQuery();
							
							String sqqq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' ";
					    	ps=con.prepareStatement(sqqq);
					    	rs=ps.executeQuery();
							
					    	String sq1="select point from mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"'";
					    	ps=con.prepareStatement(sq1);
					    	ResultSet rs1=ps.executeQuery();
							
					    	 int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0;
					    	 
					    	 int nam=Integer.parseInt(rss.getString("count(id)"));
					    	 
								if(nam !=0) {
									
									while(rs1.next()) {
							    	
							    		if(rs1.getString("point").matches("Inc")) {
							    			count5++;
							    			
							    		}else {
							    			int mark=Integer.parseInt(rs1.getString("point"));
								    		
								    		if(mark>=7 && mark<=17) {
								    			count1++;
								    		}else if(mark>=18 && mark<=21) {
								    			count2=count2+1;
								    		}else if(mark>=22 && mark<=25) {
								    			count3++;
								    		}
								    		else if(mark>=26 && mark<=33) {
								    			count4++;
								    		}else if(mark>=34 && mark<=35) {
								    			count0++;
								    			
								    		
								    		
								    		
								    		}
							    
								    		
							    		}
							    		}
									   
									 XSSFWorkbook workbook = new XSSFWorkbook(); 
								      XSSFSheet spreadsheet = workbook.createSheet("STUDENT'S REPORT");
									 XSSFRow row = spreadsheet.createRow(1);
								     XSSFCell cell = (XSSFCell) row.createCell((short) 1);
								     
								     String sum=rss.getString("count(id)");
						     		 String s=String.format(" %s","JUMLA YA WANAFUNZI="+sum+":  DIV I="+count1+":  DIV II="+count2+":  DIV III="+count3+":  DIV IV="+count4+":  DIV O="+count0+":  INCOMPLETE="+count5);
						     			
									
						     			
								      XSSFCellStyle style3 = workbook.createCellStyle();
								      XSSFFont font = workbook.createFont();
								      font.setFontHeightInPoints((short) 20);
								      font.setFontName("VERDANA");
								      font.setBold(true);
								      XSSFCellStyle style = workbook.createCellStyle();
								      style.setFont(font);
								  
								      cell.setCellStyle(style3);
								      row = spreadsheet.createRow(3);
								      cell = (XSSFCell) row.createCell(1);
								      cell.setCellValue("             "+school+" SECONDARY SCHOOL");
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
								      row = spreadsheet.createRow(6);
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
								      cell.setCellValue("MCHANGANUO WA MASOMO                                                   .");
								      cell = row.createCell(4);
								      cell.setCellValue("POINT");
								      cell = row.createCell(5);
								      cell.setCellValue("DIV");
								      cell = row.createCell(6);
								      cell.setCellValue("WAST");
								      cell = row.createCell(7);
								      cell.setCellValue("NAF");
								    
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
							         
							       
							            String cv="",gcv="";
							          	String geo="",ggeo="";
							          	String dini="",gdini="";
							          	String kiswa="",gkiswa="";
							          	String engl="",gengl="";
							          	String che="",gche="";
							          	String math="",gmath="";
							          	String bio="",gbio="";
							          	String phy="",gphy="";
							          	String ara="",gara="";
							          	String his="",ghis="";
							        	String lit="",glit="";
							          	
							          	
							          	String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="",s12="";
							          	
							          	if(!rs.getString("cv").isEmpty()) {
							          		 cv=rs.getString("cv");
								          	 gcv=rs.getString("gcv");
								          	 s1=String.format("CIV:%s%2s  ", cv,gcv);
							          	}else {
							          		 s1="";
							          	}
							          	if(!rs.getString("geo").isEmpty()) {
							          		 geo=rs.getString("geo");
								          	 ggeo=rs.getString("ggeo");
								          	 s2=String.format("GEO:%s%2s  ", geo,ggeo);
							          	}else {
							          		 s2="";
							          	}
							        	
							          	if(!rs.getString("dini").isEmpty()) {
							        		 dini=rs.getString("dini");
								             gdini=rs.getString("gdini");
								          	 s3=String.format("DINI:%s%2s   ", dini,gdini);
							          	}else {
							          		 s3="";
							          	}
							          	
							          	if(!rs.getString("kiswa").isEmpty()) {
							          		 kiswa=rs.getString("kiswa");
								          	 gkiswa=rs.getString("gkiswa");
								          	 s4=String.format("KISW:%s%2s   ", kiswa,gkiswa);
							          	}else {
							          		 s4="";
							          	}
							          	if(!rs.getString("engl").isEmpty()) {
							          		 engl=rs.getString("engl");
								          	 gengl=rs.getString("gengl");
								          	 s5=String.format("ENGL:%s%2s   ", engl,gengl);
							          	}else {
							          		 s5="";
							          	}
							          	if(!rs.getString("che").isEmpty()) {
							          		 che=rs.getString("che");
								          	 gche=rs.getString("gche");
								          	 s6=String.format("CHE:%s%2s   ", che,gche);
							          	}else {
							          		 s6="";
							          	}
							          	if(!rs.getString("math").isEmpty()) {
							          		 math=rs.getString("math");
								          	 gmath=rs.getString("gmath");
								          	 s7=String.format("MATH:%s%2s   ",math,gmath);
							          	}else {
							          		 s7="";
							          	}
							          	if(!rs.getString("bio").isEmpty()) {
							          		bio=rs.getString("bio");
								            gbio=rs.getString("gbio");
								          	 s8=String.format("BIO:%s%2s   ",bio,gbio);
							          	}else {
							          		 s8="";
							          	}if(!rs.getString("phy").isEmpty()) {
							          		 phy=rs.getString("phy");
								          	gphy=rs.getString("gphy");
								          	 s9=String.format("PHY:%s%2s   ",phy,gphy);
							          	}else {
							          		 s9="";
							          	}
							          	if(!rs.getString("ara").isEmpty()) {
							          		ara=rs.getString("ara");
								          	 gara=rs.getString("gara");
								          	 s10=String.format("ARA:%s%2s   ",ara,gara);
							          	}else {
							          		 s10="";
							          	}
							          	if(!rs.getString("his").isEmpty()) {
							          		his=rs.getString("his");
								          	ghis=rs.getString("ghis");
								          	 s11=String.format("HIS:%s%2s   ",his,ghis);
							          	}else {
							          		 s11="";
							          	}
							          	
							          	if(!rs.getString("lit").isEmpty()) {
							          		lit=rs.getString("lit");
								          	glit=rs.getString("glit");
								          	 s12=String.format("LIT:%s%2s   ",lit,glit);
							          	}else {
							          		 s12="";
							          	}
							         
							              cell = row.createCell(3);
								          cell.setCellValue(s1+""+s2+""+s3+""+s4+""+s5+""+s6+""+s7+""+s8+""+s9+""+s10+""+s11+""+s12);
								         
							         
							      
							         cell = row.createCell(4);
							         cell.setCellValue(rs.getString("point"));
							         
							         if(rs.getString("point").matches("Inc")) {
							    			p="Inc";
							    		}else {
							    			int mark=Integer.parseInt(rs.getString("point"));
								    		
								    		if(mark>=7 && mark<=17) {
								    			p="I";
								    		}else if(mark>=18 && mark<=21) {
								    			p="II";
								    		}else if(mark>=22 && mark<=25) {
								    			p="III";
								    		}
								    		else if(mark>=26 && mark<=33) {
								    			p="IV";
								    		}else if(mark>=34&& mark<=35) {
								    			p="O";
							    		}
							    		
							    		}
							         cell = row.createCell(5);
							          cell.setCellValue(p);
							          
							          
								     	 String ave=rs.getString("avg");
								     	 String av;
								     	 if(ave.matches("Inc")) {
								     		 av="Inc";
								     	 }else {
								     		 av=String.format("%.2f",Double.parseDouble(ave));
								     	 }
								     	
								     	 cell = row.createCell(6);
								          cell.setCellValue(av);
								          
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
				JOptionPane.showMessageDialog(null, ex.getStackTrace());
			}finally{
 	             try{
  	                 rs.close();
  	                 ps.close();
  	             }catch(Exception ex){
  	                 ex.getMessage();
  	             }}
		}});
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	expo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
				        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
					
				if(result==JOptionPane.OK_OPTION ){
					
					if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
						
						    String a="";String p="";
						    String count="select count(id) from mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' ";
							ps=con.prepareStatement(count);
							ResultSet rss=ps.executeQuery();
							
							String sqqq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' ";
					    	ps=con.prepareStatement(sqqq);
					    	rs=ps.executeQuery();
							
					    	String sq1="select point from mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"'";
					    	ps=con.prepareStatement(sq1);
					    	ResultSet rs1=ps.executeQuery();
							
					    	 int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0;
					    	 
					    	 int nam=Integer.parseInt(rss.getString("count(id)"));
					    	 
								if(nam !=0) {
									
									while(rs1.next()) {
							    	
							    		if(rs1.getString("point").matches("Inc")) {
							    			count5++;
							    			
							    		}else {
							    			int mark=Integer.parseInt(rs1.getString("point"));
								    		
								    		if(mark>=7 && mark<=17) {
								    			count1++;
								    		}else if(mark>=18 && mark<=21) {
								    			count2=count2+1;
								    		}else if(mark>=22 && mark<=25) {
								    			count3++;
								    		}
								    		else if(mark>=26 && mark<=33) {
								    			count4++;
								    		}else if(mark>=34 && mark<=35) {
								    			count0++;
								    			
								    		
								    		
								    		
								    		}
							    
								    		
							    		}
							    		}
									   
									 XSSFWorkbook workbook = new XSSFWorkbook(); 
								      XSSFSheet spreadsheet = workbook.createSheet("STUDENT'S REPORT");
									 XSSFRow row = spreadsheet.createRow(1);
								     XSSFCell cell = (XSSFCell) row.createCell((short) 1);
								     
								     String sum=rss.getString("count(id)");
						     		 String s=String.format(" %s","JUMLA YA WANAFUNZI="+sum+":  DIV I="+count1+":  DIV II="+count2+":  DIV III="+count3+":  DIV IV="+count4+":  DIV O="+count0+":  INCOMPLETE="+count5);
						     			
									
						     			
								      XSSFCellStyle style3 = workbook.createCellStyle();
								      XSSFFont font = workbook.createFont();
								      font.setFontHeightInPoints((short) 20);
								      font.setFontName("VERDANA");
								      font.setBold(true);
								      XSSFCellStyle style = workbook.createCellStyle();
								      style.setFont(font);
								  
								      cell.setCellStyle(style3);
								      row = spreadsheet.createRow(3);
								      cell = (XSSFCell) row.createCell(1);
								      cell.setCellValue("             "+school+" SECONDARY SCHOOL");
								      cell.setCellStyle(style);
								      
								      XSSFFont font1 = workbook.createFont();
								      font1.setFontHeightInPoints((short) 12);
								      font1.setFontName("VERDANA");
								     // font1.setBold(true);
								      XSSFCellStyle style1 = workbook.createCellStyle();
								      style1.setFont(font1);
								  
								  
								     // cell.setCellStyle(style3);
								      row = spreadsheet.createRow(5);
								      cell = (XSSFCell) row.createCell(1);
								      cell.setCellValue(" MATOKEO YA "+et.getSelectedItem().toString()+""+"                               "+ct.getSelectedItem().toString()+" - "+ac.getSelectedItem().toString());
								      
								      XSSFFont font2 = workbook.createFont();
								      font2.setFontHeightInPoints((short) 10);
								      font2.setFontName("VERDANA");
								     // font1.setBold(true);
								      XSSFCellStyle style2 = workbook.createCellStyle();
								      style2.setFont(font2);
								      row = spreadsheet.createRow(6);
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
								      cell.setCellValue("MCHANGANUO WA MASOMO                                                   .");
								      cell = row.createCell(4);
								      cell.setCellValue("POINT");
								      cell = row.createCell(5);
								      cell.setCellValue("DIV");
								      cell = row.createCell(6);
								      cell.setCellValue("WAST");
								      cell = row.createCell(7);
								      cell.setCellValue("NAF");
								    
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
							         
							       
							            String cv="",gcv="";
							          	String geo="",ggeo="";
							          	String dini="",gdini="";
							          	String kiswa="",gkiswa="";
							          	String engl="",gengl="";
							          	String che="",gche="";
							          	String math="",gmath="";
							          	String bio="",gbio="";
							          	String phy="",gphy="";
							          	String ara="",gara="";
							          	String his="",ghis="";
							          	String lit="",glit="";
							          	
							          	
							          	String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="",s12="";
							          	
							          	if(!rs.getString("cv").isEmpty()) {
							          		 cv=rs.getString("cv");
								          	 gcv=rs.getString("gcv");
								          	 s1=String.format("CIV:%s%2s  ", cv,gcv);
							          	}else {
							          		 s1="";
							          	}
							          	if(!rs.getString("geo").isEmpty()) {
							          		 geo=rs.getString("geo");
								          	 ggeo=rs.getString("ggeo");
								          	 s2=String.format("GEO:%s%2s  ", geo,ggeo);
							          	}else {
							          		 s2="";
							          	}
							        	
							          	if(!rs.getString("dini").isEmpty()) {
							        		 dini=rs.getString("dini");
								             gdini=rs.getString("gdini");
								          	 s3=String.format("DINI:%s%2s   ", dini,gdini);
							          	}else {
							          		 s3="";
							          	}
							          	
							          	if(!rs.getString("kiswa").isEmpty()) {
							          		 kiswa=rs.getString("kiswa");
								          	 gkiswa=rs.getString("gkiswa");
								          	 s4=String.format("KISW:%s%2s   ", kiswa,gkiswa);
							          	}else {
							          		 s4="";
							          	}
							          	if(!rs.getString("engl").isEmpty()) {
							          		 engl=rs.getString("engl");
								          	 gengl=rs.getString("gengl");
								          	 s5=String.format("ENGL:%s%2s   ", engl,gengl);
							          	}else {
							          		 s5="";
							          	}
							          	if(!rs.getString("che").isEmpty()) {
							          		 che=rs.getString("che");
								          	 gche=rs.getString("gche");
								          	 s6=String.format("CHE:%s%2s   ", che,gche);
							          	}else {
							          		 s6="";
							          	}
							          	if(!rs.getString("math").isEmpty()) {
							          		 math=rs.getString("math");
								          	 gmath=rs.getString("gmath");
								          	 s7=String.format("MATH:%s%2s   ",math,gmath);
							          	}else {
							          		 s7="";
							          	}
							          	if(!rs.getString("bio").isEmpty()) {
							          		bio=rs.getString("bio");
								            gbio=rs.getString("gbio");
								          	 s8=String.format("BIO:%s%2s   ",bio,gbio);
							          	}else {
							          		 s8="";
							          	}if(!rs.getString("phy").isEmpty()) {
							          		 phy=rs.getString("phy");
								          	gphy=rs.getString("gphy");
								          	 s9=String.format("PHY:%s%2s   ",phy,gphy);
							          	}else {
							          		 s9="";
							          	}
							          	if(!rs.getString("ara").isEmpty()) {
							          		ara=rs.getString("ara");
								          	 gara=rs.getString("gara");
								          	 s10=String.format("ARA:%s%2s   ",ara,gara);
							          	}else {
							          		 s10="";
							          	}
							          	if(!rs.getString("his").isEmpty()) {
							          		his=rs.getString("his");
								          	ghis=rs.getString("ghis");
								          	 s11=String.format("HIS:%s%2s   ",his,ghis);
							          	}else {
							          		 s11="";
							          	}
							          	
							          	if(!rs.getString("lit").isEmpty()) {
							          		lit=rs.getString("lit");
								          	glit=rs.getString("glit");
								          	 s12=String.format("LIT:%s%2s   ",lit,glit);
							          	}else {
							          		 s12="";
							          	}
							         
							              cell = row.createCell(3);
								          cell.setCellValue(s1+""+s2+""+s3+""+s4+""+s5+""+s6+""+s7+""+s8+""+s9+""+s10+""+s11+""+s12);
								         
							         
							      
							         cell = row.createCell(4);
							         cell.setCellValue(rs.getString("point"));
							         
							         if(rs.getString("point").matches("Inc")) {
							    			p="Inc";
							    		}else {
							    			int mark=Integer.parseInt(rs.getString("point"));
								    		
								    		if(mark>=7 && mark<=17) {
								    			p="I";
								    		}else if(mark>=18 && mark<=21) {
								    			p="II";
								    		}else if(mark>=22 && mark<=25) {
								    			p="III";
								    		}
								    		else if(mark>=26 && mark<=33) {
								    			p="IV";
								    		}else if(mark>=34&& mark<=35) {
								    			p="O";
							    		}
							    		
							    		}
							         cell = row.createCell(5);
							          cell.setCellValue(p);
							          
							          
								     	 String ave=rs.getString("avg");
								     	 String av;
								     	 if(ave.matches("Inc")) {
								     		 av="Inc";
								     	 }else {
								     		 av=String.format("%.2f",Double.parseDouble(ave));
								     	 }
								     	
								     	 cell = row.createCell(6);
								          cell.setCellValue(av);
								          
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
				JOptionPane.showMessageDialog(null, ex.getStackTrace());
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
				//text();
				int result1 = JOptionPane.showConfirmDialog(null, panel4, "Edit ",
				        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

				if(result1==JOptionPane.OK_OPTION) {
					
					int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
					        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
						
					if(result==JOptionPane.OK_OPTION) {

						if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
							
							String sql="update  text set  stext='"+area1.getText()+"' where rowid= '"+2+"'  ";
							ps=con.prepareStatement(sql);
							ps.execute();	
							//JOptionPane.showMessageDialog(b1,"Success !");
							
							     String count="select count(id) from mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' ";
								 ps=con.prepareStatement(count);
								 ResultSet rss=ps.executeQuery();
								
								int nam=Integer.parseInt(rss.getString("count(id)"));
								if(nam !=0) {
									
									
									try {
										  Calendar timer=Calendar.getInstance();
							    		  timer.getTime();
							    		  
							    		  SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
							    		  time.setText(df.format(timer.getTime()));time.setIcon(alarm);
							    		  SimpleDateFormat dt=new SimpleDateFormat("E dd MMM ,  yyyy");
							    		   String p="";
										
							    		    Document document=new Document(PageSize.A4);
										  //  PdfWriter.getInstance(document, new FileOutputStream("ReportForm.pdf"));
										    document.open();
										    PdfPTable mudi = new PdfPTable(4);
										    
									   
										
									    String sq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark1  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"'";
									 	ps=con.prepareStatement(sq);
									 	ResultSet rs=ps.executeQuery();
									 
									 	 String a="";

									    
										
										 while(rs.next()) {
											
											 
											 
										 	 a=rs.getString("rank");
										 	 
											 String ave=rs.getString("avg");
										 	 String av;
										 	 
										 	 if(ave.matches("Inc")) {
										 		 av="Inc";
										 	 }else {
										 		 av=String.format("%.2f",Double.parseDouble(ave)); 	
												  
										 	 }
										 	
											 
											    	
												 if(rs.getString("point").matches("Inc")) {
											  			p="Inc";
											  		}else {
											  			int mark=Integer.parseInt(rs.getString("point"));
												    		
												    		if(mark>=7 && mark<=17) {
												    			p="I";
												    		}else if(mark>=18 && mark<=21) {
												    			p="II";
												    		}else if(mark>=22 && mark<=25) {
												    			p="III";
												    		}
												    		else if(mark>=26 && mark<=33) {
												    			p="IV";
												    		}else if(mark>=34&& mark<=35) {
												    			p="O";
											  		}
											  		
											  		}
												    String cmc="",cmg="",cmd="",cmk="",cme="",cmche="",cmm="",cmb="",cmp="",cma="",cmh="",cml="";
											        String cv="",gcv="";
										          	String geo="",ggeo="";
										          	String dini="",gdini="";
										          	String kiswa="",gkiswa="";
										          	String engl="",gengl="";
										          	String che="",gche="";
										          	String math="",gmath="";
										          	String bio="",gbio="";
										          	String phy="",gphy="";
										          	String ara="",gara="";
										          	String his="",ghis="";
										        	String lit="",glit="";
										          	
										          	
										          
									         	     Image im=Image.getInstance("other.png");
									         	     PdfPCell cell;
									         	    mudi.setWidthPercentage(105);
									         	    cell = new PdfPCell(im,false);
												    cell.setColspan(4);
												    cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("\n"));
												    cell.setBorder(0);
												    cell.setColspan(4);
												   // mudi.addCell(cell);
												    
												   
												    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    
												    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);
								                     
												    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);

												    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+"       "+jj.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    
												    
												    
												    
												    cell = new PdfPCell(new Phrase("\n"));
												    cell.setBorder(0);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    
												    cell=new PdfPCell(new Phrase("JINA: "+rs.getString("first")+" "+rs.getString("last")+"        JINSIA: "+rs.getString("gender")+"      "+rs.getString("class"),FontFactory.getFont("serif", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    

												    cell = new PdfPCell(new Phrase(""));
												    cell.setBorder(0);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("MAONI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
									                   
													    
														if(!rs.getString("cv").isEmpty()) {
											          		 cv=rs.getString("cv");cmc=rs.getString("cmc");
												          	 gcv=rs.getString("gcv");
												          	 
												          	   cell = new PdfPCell(new Phrase("CIVICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cv));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gcv));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmc));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    
											          	}else {
											          		 
											          	}
											          	if(!rs.getString("geo").isEmpty()) {
											          		 geo=rs.getString("geo");cmg=rs.getString("cmg");
												          	 ggeo=rs.getString("ggeo");
												          	 
												            	cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(geo));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(ggeo));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmg));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          
											          	}
											        	
											          	if(!rs.getString("dini").isEmpty()) {
											        		 dini=rs.getString("dini"); cmd=rs.getString("cmd"); 
												             gdini=rs.getString("gdini");
												             
												             cell = new PdfPCell(new Phrase("DINI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(dini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gdini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmd));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	 
											          	}else {
											          		
											          	}
											          	
											          	if(!rs.getString("kiswa").isEmpty()) {
											          		 kiswa=rs.getString("kiswa");  cmk=rs.getString("cmk"); 
												          	 gkiswa=rs.getString("gkiswa");
												          	 
												          	cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(kiswa));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gkiswa));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmk));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("engl").isEmpty()) {
											          		 engl=rs.getString("engl"); cme=rs.getString("cme");
												          	 gengl=rs.getString("gengl");
												          	 
												             	cell = new PdfPCell(new Phrase("ENGLISH", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(engl));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gengl));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cme));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("che").isEmpty()) {
											          		 che=rs.getString("che");cmche=rs.getString("cmch");
												          	 gche=rs.getString("gche");
												          	 
												            	cell = new PdfPCell(new Phrase("CHEMISTRY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(che));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gche));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmche));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("math").isEmpty()) {
											          		 math=rs.getString("math");cmm=rs.getString("cmm");
												          	 gmath=rs.getString("gmath");
												          	 
												          	cell = new PdfPCell(new Phrase("MATHEMATICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(math));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gmath));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmm));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	 
											          	}else {
											          		
											          	}
											          	if(!rs.getString("bio").isEmpty()) {
											          		bio=rs.getString("bio");cmb=rs.getString("cmb");
												            gbio=rs.getString("gbio");
												            
												            cell = new PdfPCell(new Phrase("BIOLOGY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(bio));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gbio));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmb));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	 
											          	}else {
											          		
											          	}if(!rs.getString("phy").isEmpty()) {
											          		 phy=rs.getString("phy"); cmp=rs.getString("cmp"); 
												          	gphy=rs.getString("gphy");
												          	
												          	cell = new PdfPCell(new Phrase("PHYSICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(phy));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gphy));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmp));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("ara").isEmpty()) {
											          		ara=rs.getString("ara"); cma=rs.getString("cma");
												          	 gara=rs.getString("gara");
												          	 
												          	cell = new PdfPCell(new Phrase("ARABIC", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(ara));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gara));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cma));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	
											          	if(!rs.getString("his").isEmpty()) {
											          		his=rs.getString("his");cmh=rs.getString("cmh"); 
												          	ghis=rs.getString("ghis");
												          	
												          	cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(his));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(ghis));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmh));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	
											        	if(!rs.getString("lit").isEmpty()) {
											          		lit=rs.getString("lit");cml=rs.getString("cml"); 
												          	glit=rs.getString("glit");
												          	
												          	cell = new PdfPCell(new Phrase("LITERATURE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(lit));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(glit));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cml));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
									                  
									      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs.getString("point")+"\nWASTANI NI "+"  "+av+"    "+"NAFASI YAKE NI"+"    "+a+"    KATI YA WANAFUNZI   "+nam+"   KATIKA DARASA"   ));
									      		       cell.setHorizontalAlignment(1);
									      		      cell.setColspan(4);
									                    mudi.addCell(cell);
									                   
									      		     cell = new PdfPCell(new Phrase("\n"));
													    cell.setBorder(0);
													    cell.setColspan(4);
													    mudi.addCell(cell);
											 
													    cell=new PdfPCell(new Phrase(area1.getText()));
										      		       cell.setBorder(0);
										      		     cell.setColspan(4);
										      		       mudi.addCell(cell);
											  
											 
										 }
										 
										 
										     PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
											document.open();
											
											
											document.add(mudi);
											//document.add(new Paragraph(dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
											
											document.close();
											JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
											Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Report.pdf");

											
									    	 
										
									}catch(Exception ex) {
										JOptionPane.showMessageDialog(null, ex.getStackTrace());
									}finally{
						  	             try{
						  	                 rs.close();
						  	                 ps.close();
						  	             }catch(Exception ex){
						  	                 ex.getMessage();
						  	             }}
									
									
									
								}else {
									
									JOptionPane.showMessageDialog(null, "No user with that Record !");
								}
									
								
							      
						} else {
							JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
						}
							      
					}
						
					
				}
	      
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
		      

		}
		});
	/////////////////////////////////////////////////
	
	sp.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				//text();
				int result1 = JOptionPane.showConfirmDialog(null, panel4, "Edit ",
				        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

				if(result1==JOptionPane.OK_OPTION) {
					
					int result = JOptionPane.showConfirmDialog(null, pa6, "Select ",
					        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
						
					if(result==JOptionPane.OK_OPTION) {

						if(t42.getSelectedItem() != null &&!((String) t42.getSelectedItem()).trim().isEmpty()&&t40.getSelectedItem() != null &&!((String) t40.getSelectedItem()).trim().isEmpty()&&t41.getSelectedItem() != null &&!((String) t41.getSelectedItem()).trim().isEmpty() ) {
							
							String sql="update  text set  stext='"+area1.getText()+"' where rowid= '"+2+"'  ";
							ps=con.prepareStatement(sql);
							ps.execute();	
							//JOptionPane.showMessageDialog(b1,"Success !");
							
							     String count="select count(id) from term1 where year='"+t40.getSelectedItem().toString()+"' and  term='"+t41.getSelectedItem().toString()+"' and  class='"+t42.getSelectedItem().toString()+"'  ";
								 ps=con.prepareStatement(count);
								 ResultSet rss=ps.executeQuery();
								
								int nam=Integer.parseInt(rss.getString("count(id)"));
								if(nam !=0) {
									
									
									try {
										  Calendar timer=Calendar.getInstance();
							    		  timer.getTime();
							    		  
							    		  SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
							    		  time.setText(df.format(timer.getTime()));time.setIcon(alarm);
							    		  SimpleDateFormat dt=new SimpleDateFormat("E dd MMM ,  yyyy");
							    		   String p="";
										
							    		    Document document=new Document(PageSize.A4);
										    PdfWriter.getInstance(document, new FileOutputStream("ReportForm.pdf"));
										    document.open();
										    PdfPTable mudi = new PdfPTable(6);
										    
									   
										
									    String sq="SELECT *, RANK () OVER (  order by case when ave = 'Inc' then 1 else 0 end, ave DESC ) AS rank FROM term1 where year='"+t40.getSelectedItem().toString()+"' and  term='"+t41.getSelectedItem().toString()+"' and  class='"+t42.getSelectedItem().toString()+"' ";
									 	ps=con.prepareStatement(sq);
									 	ResultSet rs=ps.executeQuery();
									 
									 	 String a="";

									    
										
										 while(rs.next()) {
											
											 
											 
										 	 a=rs.getString("rank");
										 	 
											 String ave=rs.getString("ave");
										 	 String av;
										 	 
										 	 if(ave.matches("Inc")) {
										 		 av="Inc";
										 	 }else {
										 		 av=String.format("%.2f",Double.parseDouble(ave)); 	
												  
										 	 }
										 	
											 
											    	
												 if(rs.getString("point").matches("Inc")) {
											  			p="Inc";
											  		}else {
											  			int mark=Integer.parseInt(rs.getString("point"));
												    		
												    		if(mark>=7 && mark<=17) {
												    			p="I";
												    		}else if(mark>=18 && mark<=21) {
												    			p="II";
												    		}else if(mark>=22 && mark<=25) {
												    			p="III";
												    		}
												    		else if(mark>=26 && mark<=33) {
												    			p="IV";
												    		}else if(mark>=34&& mark<=35) {
												    			p="O";
											  		}
											  		
											  		}
												    String cmc="",cmg="",cmd="",cmk="",cme="",cmche="",cmm="",cmb="",cmp="",cma="",cmh="";
											        String cv="",gcv="";  String cvj="" ; String cvm="";
										          	String geo="",ggeo="";String geoj="" ; String geom="";
										          	String dini="",gdini="";String dinij="" ; String dinim="";
										          	String kiswa="",gkiswa="";String kiswaj="" ; String kiswam="";
										          	String engl="",gengl="";String englj="" ; String englm="";
										          	String che="",gche="";String chej="" ; String chem="";
										          	String math="",gmath="";String mathj="" ; String mathm="";
										          	String bio="",gbio="";String bioj="" ; String biom="";
										          	String phy="",gphy="";String phyj="" ; String phym="";
										          	String ara="",gara="";String araj="" ; String aram="";
										          	String his="",ghis="";String hisj="" ; String hism="";
										          	
										          	
										          
									         	     Image im=Image.getInstance("other.png");
									         	     PdfPCell cell;
									         	    mudi.setWidthPercentage(105);
									         	    cell = new PdfPCell(im,false);
												    cell.setColspan(6);
												    cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("\n"));
												    cell.setBorder(0);
												    cell.setColspan(6);
												   // mudi.addCell(cell);
												    
												   
												    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(6);
												    mudi.addCell(cell);
												    
												    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(6);
												    mudi.addCell(cell);
								                     
												    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(6);
												    mudi.addCell(cell);

												    cell=new PdfPCell(new Phrase(t41.getSelectedItem().toString()+"       "+t42.getSelectedItem().toString()+" - "+""+t40.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(6);
												    mudi.addCell(cell);
												    
												    
												    
												    
												    cell = new PdfPCell(new Phrase("\n"));
												    cell.setBorder(0);
												    cell.setColspan(6);
												    mudi.addCell(cell);
												    
												    cell=new PdfPCell(new Phrase("JINA: "+rs.getString("first")+" "+rs.getString("last")+"        JINSIA: "+rs.getString("gender")+"      "+rs.getString("class"),FontFactory.getFont("serif", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(6);
												    mudi.addCell(cell);
												    

												    cell = new PdfPCell(new Phrase("\n"));
												    cell.setBorder(0);
												    cell.setColspan(6);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("MASOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("JARIBIO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("MTIHANI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("WASTANI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("MAONI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
									                   
													    
														if(!rs.getString("cva").isEmpty()) {
															// av=String.format("%.2f",Double.parseDouble(ave)); 	
															 cvj=rs.getString("cvj");
															 cvm=rs.getString("cvm");
											          		 cv=rs.getString("cva");cmc=rs.getString("cmc");
												          	 gcv=rs.getString("gcv");
												          	 
												          	   cell = new PdfPCell(new Phrase("CIVICS", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cvj));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cvm));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cv));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gcv));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmc));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    
											          	}else {
											          		 
											          	}
											          	if(!rs.getString("geoa").isEmpty()) {
											          		 geoj=rs.getString("geoj");
											          		 geom=rs.getString("geom");
											          		 geo=rs.getString("geoa");cmg=rs.getString("cmg");
												          	 ggeo=rs.getString("ggeo");
												          	 
												            	cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 13, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(geoj));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(geom));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(geo));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(ggeo));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmg));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          
											          	}
											        	
											          	if(!rs.getString("dinia").isEmpty()) {
											          		dinij=rs.getString("dinij");
											          		dinim=rs.getString("dinim");
											        		 dini=rs.getString("dinia"); cmd=rs.getString("cmd"); 
												             gdini=rs.getString("gdini");
												             
												             cell = new PdfPCell(new Phrase("DINI", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(dinij));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(dinim));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(dini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gdini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmd));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	 
											          	}else {
											          		
											          	}
											          	
											          	if(!rs.getString("kiswaa").isEmpty()) {
											          		 kiswaj=rs.getString("kiswaj");
											          		 kiswam=rs.getString("kiswam");
											          		 kiswa=rs.getString("kiswaa");  cmk=rs.getString("cmk"); 
												          	 gkiswa=rs.getString("gkiswa");
												          	 
												          	cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(kiswaj));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(kiswam));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(kiswa));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gkiswa));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmk));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("engla").isEmpty()) {
											          		englj=rs.getString("englj");
											          		englm=rs.getString("englm");
											          		 engl=rs.getString("engla"); cme=rs.getString("cme");
												          	 gengl=rs.getString("gengl");
												          	 
												             	cell = new PdfPCell(new Phrase("ENGLISH", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(englj));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(englm));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(engl));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gengl));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cme));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("chea").isEmpty()) {
											          		chej=rs.getString("chej");
											          		chem=rs.getString("chem");
											          		 che=rs.getString("chea");cmche=rs.getString("cmch");
												          	 gche=rs.getString("gche");
												          	 
												            	cell = new PdfPCell(new Phrase("CHEMISTRY", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(chej));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(chem));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(che));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gche));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmche));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("matha").isEmpty()) {
											          		 mathj=rs.getString("mathj");
											          		 mathm=rs.getString("mathm");
											          		 math=rs.getString("matha");cmm=rs.getString("cmm");
												          	 gmath=rs.getString("gmath");
												          	 
												          	cell = new PdfPCell(new Phrase("MATHEMATICS", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(mathj));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(mathm));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(math));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gmath));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmm));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	 
											          	}else {
											          		
											          	}
											          	if(!rs.getString("bioa").isEmpty()) {
											          		bioj=rs.getString("bioj");
											          		biom=rs.getString("biom");
											          		bio=rs.getString("bioa");cmb=rs.getString("cmb");
												            gbio=rs.getString("gbio");
												            
												            cell = new PdfPCell(new Phrase("BIOLOGY", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(bioj));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(biom));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(bio));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gbio));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmb));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	 
											          	}else {
											          		
											          	}if(!rs.getString("phya").isEmpty()) {
											          		 phyj=rs.getString("phyj"); 
											          		 phym=rs.getString("phym"); 
											          		 phy=rs.getString("phya"); cmp=rs.getString("cmp"); 
												          	gphy=rs.getString("gphy");
												          	
												          	cell = new PdfPCell(new Phrase("PHYSICS", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(phyj));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(phym));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(phy));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gphy));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmp));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("araa").isEmpty()) {
											          		araj=rs.getString("araj"); 
											          		aram=rs.getString("aram"); 
											          		ara=rs.getString("araa"); cma=rs.getString("cmar");
												          	 gara=rs.getString("gara");
												          	 
												          	cell = new PdfPCell(new Phrase("ARABIC", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(araj));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(aram));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(ara));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gara));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cma));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("hisa").isEmpty()) {
											          		hisj=rs.getString("hisj");
											          		hism=rs.getString("hism");
											          		his=rs.getString("hisa");cmh=rs.getString("cmh"); 
												          	ghis=rs.getString("ghis");
												          	
												          	cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 12, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(hisj));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(hism));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(his));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(ghis));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmh));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	
													     
									                  
									      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs.getString("point")+"\nWASTANI NI "+"  "+av+"    "+"NAFASI YAKE NI"+"    "+a+"    KATI YA WANAFUNZI   "+nam+"   KATIKA DARASA"   ));
									      		       cell.setHorizontalAlignment(1);
									      		      cell.setColspan(6);
									                    mudi.addCell(cell);
									                   
									      		     cell = new PdfPCell(new Phrase("\n"));
													    cell.setBorder(0);
													    cell.setColspan(6);
													    mudi.addCell(cell);
											 
													    cell=new PdfPCell(new Phrase(area1.getText()));
										      		       cell.setBorder(0);
										      		     cell.setColspan(6);
										      		       mudi.addCell(cell);
											  
											 
										 }
										 
										 
										     PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
											document.open();
											
											
											document.add(mudi);
											//document.add(new Paragraph(dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
											
											document.close();
											JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
											Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Report.pdf");

											
									    	 
										
									}catch(Exception ex) {
										JOptionPane.showMessageDialog(null, ex.getStackTrace());
									}finally{
						  	             try{
						  	                 rs.close();
						  	                 ps.close();
						  	             }catch(Exception ex){
						  	                 ex.getMessage();
						  	             }}
									
									
									
								}else {
									
									JOptionPane.showMessageDialog(null, "No user with that Record !");
								}
									
								
							      
						} else {
							JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
						}
							      
					}
						
					
				}
	      
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
		      

		}
		});
	orep.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				//text();
				int result1 = JOptionPane.showConfirmDialog(null, panel4, "Edit ",
				        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

				if(result1==JOptionPane.OK_OPTION) {
					
					int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
					        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
						
					if(result==JOptionPane.OK_OPTION) {

						if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
							
							String sql="update  text set  stext='"+area1.getText()+"' where rowid= '"+2+"'  ";
							ps=con.prepareStatement(sql);
							ps.execute();	
							//JOptionPane.showMessageDialog(b1,"Success !");
							
							     String count="select count(id) from mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"' ";
								 ps=con.prepareStatement(count);
								 ResultSet rss=ps.executeQuery();
								
								int nam=Integer.parseInt(rss.getString("count(id)"));
								if(nam !=0) {
									
									
									try {
										  Calendar timer=Calendar.getInstance();
							    		  timer.getTime();
							    		  
							    		  SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
							    		  time.setText(df.format(timer.getTime()));time.setIcon(alarm);
							    		  SimpleDateFormat dt=new SimpleDateFormat("E dd MMM ,  yyyy");
							    		   String p="";
										
							    		    Document document=new Document(PageSize.A4);
										    PdfWriter.getInstance(document, new FileOutputStream("ReportForm.pdf"));
										    document.open();
										    PdfPTable mudi = new PdfPTable(4);
										    
									   
										
									    String sq="SELECT *, RANK () OVER (  order by case when avg = 'Inc' then 1 else 0 end, avg DESC ) AS rank FROM mark11  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+jj.getSelectedItem().toString()+"'";
									 	ps=con.prepareStatement(sq);
									 	ResultSet rs=ps.executeQuery();
									 
									 	 String a="";

									    
										
										 while(rs.next()) {
											
											 
											 
										 	 a=rs.getString("rank");
										 	 
											 String ave=rs.getString("avg");
										 	 String av;
										 	 
										 	 if(ave.matches("Inc")) {
										 		 av="Inc";
										 	 }else {
										 		 av=String.format("%.2f",Double.parseDouble(ave)); 	
												  
										 	 }
										 	
											 
											    	
												 if(rs.getString("point").matches("Inc")) {
											  			p="Inc";
											  		}else {
											  			int mark=Integer.parseInt(rs.getString("point"));
												    		
												    		if(mark>=7 && mark<=17) {
												    			p="I";
												    		}else if(mark>=18 && mark<=21) {
												    			p="II";
												    		}else if(mark>=22 && mark<=25) {
												    			p="III";
												    		}
												    		else if(mark>=26 && mark<=33) {
												    			p="IV";
												    		}else if(mark>=34&& mark<=35) {
												    			p="O";
											  		}
											  		
											  		}
												    String cmc="",cmg="",cmd="",cmk="",cme="",cmche="",cmm="",cmb="",cmp="",cma="",cmh="";
											        String cv="",gcv="";
										          	String geo="",ggeo="";
										          	String dini="",gdini="";
										          	String kiswa="",gkiswa="";
										          	String engl="",gengl="";
										          	String che="",gche="";
										          	String math="",gmath="";
										          	String bio="",gbio="";
										          	String phy="",gphy="";
										          	String ara="",gara="";
										          	String his="",ghis="";
										          	
										          	
										          
									         	     Image im=Image.getInstance("other.png");
									         	     PdfPCell cell;
									         	    mudi.setWidthPercentage(105);
									         	    cell = new PdfPCell(im,false);
												    cell.setColspan(4);
												    cell.setHorizontalAlignment(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("\n"));
												    cell.setBorder(0);
												    cell.setColspan(4);
												   // mudi.addCell(cell);
												    
												   
												    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    
												    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);
								                     
												    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+"       "+jj.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    
												    
												    
												    
												    cell = new PdfPCell(new Phrase("\n"));
												    cell.setBorder(0);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    
												    cell=new PdfPCell(new Phrase("JINA: "+rs.getString("first")+" "+rs.getString("last")+"        JINSIA: "+rs.getString("gender")+"      "+rs.getString("class"),FontFactory.getFont("serif", 14, Font.BOLD, BaseColor.BLACK)));
												    cell.setBorder(0);
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    

												    cell = new PdfPCell(new Phrase("\n"));
												    cell.setBorder(0);
												    cell.setColspan(4);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase("MAONI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
									                   
													    
														if(!rs.getString("cv").isEmpty()) {
											          		 cv=rs.getString("cv");cmc=rs.getString("cmc");
												          	 gcv=rs.getString("gcv");
												          	 
												          	   cell = new PdfPCell(new Phrase("CIVICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cv));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gcv));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmc));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    
											          	}else {
											          		 
											          	}
											          	if(!rs.getString("geo").isEmpty()) {
											          		 geo=rs.getString("geo");cmg=rs.getString("cmg");
												          	 ggeo=rs.getString("ggeo");
												          	 
												            	cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(geo));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(ggeo));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmg));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          
											          	}
											        	
											          	if(!rs.getString("dini").isEmpty()) {
											        		 dini=rs.getString("dini"); cmd=rs.getString("cmd"); 
												             gdini=rs.getString("gdini");
												             
												             cell = new PdfPCell(new Phrase("DINI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(dini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gdini));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmd));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	 
											          	}else {
											          		
											          	}
											          	
											          	if(!rs.getString("kiswa").isEmpty()) {
											          		 kiswa=rs.getString("kiswa");  cmk=rs.getString("cmk"); 
												          	 gkiswa=rs.getString("gkiswa");
												          	 
												          	cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(kiswa));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gkiswa));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmk));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("engl").isEmpty()) {
											          		 engl=rs.getString("engl"); cme=rs.getString("cme");
												          	 gengl=rs.getString("gengl");
												          	 
												             	cell = new PdfPCell(new Phrase("ENGLISH", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(engl));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gengl));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cme));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("che").isEmpty()) {
											          		 che=rs.getString("che");cmche=rs.getString("cmch");
												          	 gche=rs.getString("gche");
												          	 
												            	cell = new PdfPCell(new Phrase("CHEMISTRY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(che));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gche));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmche));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("math").isEmpty()) {
											          		 math=rs.getString("math");cmm=rs.getString("cmm");
												          	 gmath=rs.getString("gmath");
												          	 
												          	cell = new PdfPCell(new Phrase("MATHEMATICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(math));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gmath));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmm));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	 
											          	}else {
											          		
											          	}
											          	if(!rs.getString("bio").isEmpty()) {
											          		bio=rs.getString("bio");cmb=rs.getString("cmb");
												            gbio=rs.getString("gbio");
												            
												            cell = new PdfPCell(new Phrase("BIOLOGY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(bio));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gbio));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmb));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	 
											          	}else {
											          		
											          	}if(!rs.getString("phy").isEmpty()) {
											          		 phy=rs.getString("phy"); cmp=rs.getString("cmp"); 
												          	gphy=rs.getString("gphy");
												          	
												          	cell = new PdfPCell(new Phrase("PHYSICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(phy));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gphy));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmp));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("ara").isEmpty()) {
											          		ara=rs.getString("ara"); cma=rs.getString("cma");
												          	 gara=rs.getString("gara");
												          	 
												          	cell = new PdfPCell(new Phrase("ARABIC", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(ara));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(gara));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cma));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	if(!rs.getString("his").isEmpty()) {
											          		his=rs.getString("his");cmh=rs.getString("cmh"); 
												          	ghis=rs.getString("ghis");
												          	
												          	cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
															   // cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(his));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(ghis));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
															    cell = new PdfPCell(new Phrase(cmh));							
															    cell.setHorizontalAlignment(1);
															    cell.setColspan(1);
															    mudi.addCell(cell);
												          	
											          	}else {
											          		
											          	}
											          	
													     
									                  
									      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs.getString("point")+"\nWASTANI NI "+"  "+av+"    "+"NAFASI YAKE NI"+"    "+a+"    KATI YA WANAFUNZI   "+nam+"   KATIKA DARASA"   ));
									      		       cell.setHorizontalAlignment(1);
									      		      cell.setColspan(4);
									                    mudi.addCell(cell);
									                   
									      		     cell = new PdfPCell(new Phrase("\n"));
													    cell.setBorder(0);
													    cell.setColspan(4);
													    mudi.addCell(cell);
											 
													    cell=new PdfPCell(new Phrase(area1.getText()));
										      		       cell.setBorder(0);
										      		     cell.setColspan(4);
										      		       mudi.addCell(cell);
											  
											 
										 }
										 
										 
										     PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
											document.open();
											
											
											document.add(mudi);
											//document.add(new Paragraph(dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
											
											document.close();
											JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
											Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Report.pdf");

											
									    	 
										
									}catch(Exception ex) {
										JOptionPane.showMessageDialog(null, ex.getStackTrace());
									}finally{
						  	             try{
						  	                 rs.close();
						  	                 ps.close();
						  	             }catch(Exception ex){
						  	                 ex.getMessage();
						  	             }}
									
									
									
								}else {
									
									JOptionPane.showMessageDialog(null, "No user with that Record !");
								}
									
								
							      
						} else {
							JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
						}
							      
					}
						
					
				}
	      
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
		      

		}
		});
	
	about.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			
			Icon at=new ImageIcon(this.getClass().getResource("/z.png"));
		   JOptionPane.showMessageDialog(null, "\tSTUDENT’S RESULT MANAGEMENT SYSTEM\n**************************************************\nThis Software was Designed and Created by\n MOHAMED YUSUPH.This is not a free Software \nand you are not allowed to re-distribute it without\n the prior permission of the developer\n  \nDeveloper’s Contacts:\n************************\nPhone +255 778 939 544 / +255 675 785 592\nEmail: myusuph2@gmail.com\n \nCOPYRIGHT RESERVED ©2018-2019", "About Software", 0, at);
		
			
			
		}});
	
	
	
	

	hash=new JLabel("                                                                                                " );
	bar.add(hash);
	//bar.add(sign);
	empty=new JLabel("                                                                                                 ");
	kappa=new JLabel("FORM  I-IV                                                                ");
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
