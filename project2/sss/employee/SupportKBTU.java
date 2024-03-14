package employee;
    
import java.util.Vector;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import employee.*;
import enums.*;
import student.*;
import system.*;
import interfaces.*;
import researcher.*;

public class SupportKBTU extends User implements SendMesseges,Serializable {
    
    public SupportKBTU() {
    }
    public SupportKBTU(String iD, String password, String login, String name, String surname,
			Date birthDate, String email, Language language, Gender gender, int salary) {
		super(iD, password, login, name, surname, birthDate, email, language, gender, salary);
	}
	public void run() throws Exception {
		System.out.println("Welcome!");
		 while(true){
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader bReader=new BufferedReader(isr);
				System.out.println("What do you want to do?\n 1) view all Applications\n 2) change Order status \n 3) view Accepted Orders \n 4) Exit");
				int choice =Integer.parseInt( bReader.readLine());
				if(choice==1){
					viewApplications();
				}
				else if (choice==2){
					System.out.println("what is id of order?");
					int idOrder=Integer.parseInt(bReader.readLine());
					System.out.println("to what status to change?(1)Accepted2)done)");
					
					int choiceOrderType=Integer.parseInt(bReader.readLine());
					if(choiceOrderType==1) {
						acceptOrder(idOrder,OrderStatus.ACCEPTED);
					}else if(choiceOrderType==2) {
						acceptOrder(idOrder,OrderStatus.DONE);
					}
				}
				else if (choice==3){
					viewAcceptedOrders();
				}
				else if (choice==4){
					System.out.println("Bye bye");
					try {
						DataBase.write();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				}
			}
	}    public void viewApplications() {
    	DataBase dataBase=DataBase.getInstance();
        for (Order order : dataBase.getOrders()) {
            if (order.getStatus() == OrderStatus.NEW) {
                System.out.println("New Order ID: " + order.getOrderId() + ", Description: " + order.getDescription());
            }
        }
    }

    public void acceptOrder(int orderId,OrderStatus o) {
    	DataBase dataBase=DataBase.getInstance();
    	dataBase.changeOrderStatus(orderId, o);
    }

    public void viewAcceptedOrders() {
    	DataBase dataBase=DataBase.getInstance();
        for (Order order : dataBase.getOrders()) {
            if (order.getStatus() == OrderStatus.ACCEPTED) {
                System.out.println("Accepted Order ID: " + order.getOrderId() + ", Description: " + order.getDescription());
            }
        }
    }
	@Override
	public void readMessege() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sendMessege() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sendComplain() {
		// TODO Auto-generated method stub
		
	}

    
    
}
