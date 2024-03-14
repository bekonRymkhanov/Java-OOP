package communication;
import java.util.Vector;
import java.util.Map;
import java.util.Objects;
import java.util.List;
import java.util.Date;

import employee.*;
import student.*;
import system.*;
import interfaces.*;
import researcher.*;
import enums.*;

public class Message {
	
	private String text;
	private Date date;
	private User sender;
	
	public Message(String text, User sender) {
		this.text = text;
		this.date = new Date();
		this.sender = sender;
	}
	
	public User getUser() {
		return this.sender;
	}
	
	
	public int hashCode() {
		return Objects.hash(date, sender, text);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return Objects.equals(date, other.date) && Objects.equals(sender, other.sender)
				&& Objects.equals(text, other.text);
	}

	public String toString() {
		return "\nSender:  " + this.sender + "\nMessage: " + this.text + "\t" + this.date;
	}
}
