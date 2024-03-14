package communication;
import java.util.Vector;
import java.util.Map;
import java.util.Objects;
import java.util.List;
import java.time.LocalDate;
import java.util.Date;

import employee.*;
import student.*;
import system.*;
import interfaces.*;
import researcher.*;
import enums.*;


public class News {
	private static News instance;
    private String topic;
    
    private Map<User,String> comments;
    
    private Vector<Message> messages = new Vector<Message>();
    
	public News() {
		
	}

    public String getTopic() {
        return this.topic;
    }
    
  
    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    public Map<User,String> getComments() {
        return this.comments;
    }
    public void setComments(Map<User,String> comments) {
        this.comments = comments;
    }
    
    public void removeComment(User u) {
    	comments.remove(u);
    }
    public void autoTopCitedResercher() {
        DataBase database = DataBase.getInstance();
        database.addNewsAboutTopCited();
    }
	@Override
	public int hashCode() {
		return Objects.hash(comments, messages, topic);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		News other = (News) obj;
		return Objects.equals(comments, other.comments)
				&& Objects.equals(messages, other.messages) && Objects.equals(topic, other.topic);
	}
	@Override
	public String toString() {
		return "News [topic=" + topic +  ", comments=" + comments + ", message=" + messages + "]";
	}
	
	
	
	

//	Methods
	
	public static News getNewsBoard() {
		if(instance == null) {
			instance = new News();
		}
		
		return instance;
	}
	
	public void makePublication(Message message) {
		if(message.getUser() instanceof User) {
			messages.add(message);
		}
	}
	public void showPublications() {
		for(Message message: this.messages) {
			System.out.println(message);
		}
	}
	public void deletePublication(Message message) {
		if(message.getUser() instanceof User) {
			messages.remove(message);
		}
	}
    
	
	
	

    
    
}
