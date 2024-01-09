package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame{
    //private String ticket_date;
    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.WHITE);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/logo.jpg")));
	NewLabel.setBounds(0, 0, 1920, 990);
	add(NewLabel); 
        
        JLabel AirlineManagementSystem = new JLabel("Welcome To Coders Airline, Your home in the sky");
	AirlineManagementSystem.setForeground(Color.BLACK);
        AirlineManagementSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
	AirlineManagementSystem.setBounds(400, 60, 1000, 55);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFO");
	AirlineSystem.add(FlightDetails);
		
	JMenuItem PassengerDetails = new JMenuItem("JOURNEY_DETAILS");
	AirlineSystem.add(PassengerDetails);
		
	JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
	AirlineSystem.add(SectorDetails_1);

        JMenu Details = new JMenu("DETAILS");
        Details.setForeground(Color.BLUE);
        menuBar.add(Details);

        JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER_DETAILS");
        Details.add(ReservationDetails);

        JMenuItem BookingDetails = new JMenuItem("TICKET BOOKING");
        Details.add(BookingDetails);

        JMenu Cancel = new JMenu("CANCELLATION");
        Cancel.setForeground(Color.BLUE);
        menuBar.add(Cancel);

        JMenuItem Cancellation = new JMenuItem("CANCELLATION");
        Cancel.add(Cancellation);
		
	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
	});
        
	ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_Customer();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});

        BookingDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new BookTicket();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
		
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Cancel();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
	});
		
        setSize(1950,1090);
	setVisible(true);
    }
}
