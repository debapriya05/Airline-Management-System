package airline.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookTicket extends JFrame { // Seventh

    private JTextField textField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6;

    public static void main(String[] args) {
        new BookTicket();
    }

    public BookTicket() {
        initialize();
    }

    private void initialize() {
        setTitle("TICKET BOOKING");
        getContentPane().setBackground(Color.WHITE);
        setBounds(100, 100, 801, 472);
        setLayout(null);

        JLabel Booking = new JLabel("TICKET BOOKING");
        Booking.setFont(new Font("Tahoma", Font.PLAIN, 31));
        Booking.setBounds(185, 24, 259, 38);
        add(Booking);

        /*JLabel PassengerNo = new JLabel("PASSENGER NO");
        PassengerNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
        PassengerNo.setBounds(60, 100, 132, 26);
        add(PassengerNo);*/

        JLabel BookingClass = new JLabel("BOOKING CLASS");
        BookingClass.setFont(new Font("Tahoma", Font.PLAIN, 17));
        BookingClass.setBounds(60, 150, 150, 27);
        add(BookingClass);

        JLabel TicketId = new JLabel("TICKET_ID");
        TicketId.setFont(new Font("Tahoma", Font.PLAIN, 17));
        TicketId.setBounds(60, 200, 150, 27);
        add(TicketId);

        JLabel FlightCode = new JLabel("FLIGHT_CODE");
        FlightCode.setFont(new Font("Tahoma", Font.PLAIN, 17));
        FlightCode.setBounds(60, 250, 150, 27);
        add(FlightCode);

        JLabel Source = new JLabel("SOURCE");
        Source.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Source.setBounds(60, 300, 150, 27);
        add(Source);

        JLabel Destination = new JLabel("DESTINATION");
        Destination.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Destination.setBounds(60, 350, 150, 27);
        add(Destination);

        JLabel TicketDate = new JLabel("TICKET DATE");
        TicketDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
        TicketDate.setBounds(60, 400, 180, 27);
        add(TicketDate);

        JButton Book = new JButton("BOOK");
        Book.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Book.setBackground(Color.BLACK);
        Book.setForeground(Color.WHITE);
        Book.setBounds(250, 450, 150, 30);
        add(Book);

        /*textField = new JTextField();
        textField.setBounds(250, 100, 150, 27);
        add(textField);*/

        textField_1 = new JTextField();
        textField_1.setBounds(250, 150, 150, 27);
        add(textField_1);

        textField_2 = new JTextField();
        textField_2.setBounds(250, 200, 150, 27);
        add(textField_2);

        textField_3 = new JTextField();
        textField_3.setBounds(250, 250, 150, 27);
        add(textField_3);

        textField_4 = new JTextField();
        textField_4.setBounds(250, 300, 150, 27);
        add(textField_4);

        textField_5 = new JTextField();
        textField_5.setBounds(250, 350, 150, 27);
        add(textField_5);

        textField_6 = new JTextField();
        textField_6.setBounds(250, 400, 150, 27);
        add(textField_6);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/ticket.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(470, 100, 250, 250);
        add(NewLabel);

        Book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                /*String passenger_no = textField.getText();*/
                String booking_class = textField_1.getText();
                String ticket_id = textField_2.getText();
                String flight_code = textField_3.getText();
                String source = textField_4.getText();
                String destination = textField_5.getText();
                String ticket_date=textField_6.getText();

                try {
                    conn c = new conn();
                    String str = "INSERT INTO ticket values('" + booking_class + "', '" + ticket_id + "', '" + flight_code + "', '" + source + "', '" + destination + "', '" + ticket_date + "')";

                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "Ticket Booked");
                    setVisible(false);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        setSize(900, 600);
        setVisible(true);
        setLocation(400, 200);
    }
}