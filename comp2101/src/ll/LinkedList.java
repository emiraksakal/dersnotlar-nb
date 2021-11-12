package ll;

/**
 *
 * @author btek (modified by cmshalom)
 * @version 2020
 */

class Student {
	private String name;
	private int id;
	private Student friend;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		friend = null;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Student getFriend() {
		return friend;
	}

	public void setFriend(Student friend) {
		this.friend = friend;
	}

	public String toString() {
		String friendName = friend != null ? friend.name : "none yet";
		return ("Student:" + name + ",id: " + id + 
				",friend: " + friendName);
	}    
}

public class LinkedList {
	private Student head=null;
	private Student tail= null;

	public static void main(String[] args) {

		Student boray = new Student("boray", 45);
		Student ahmet = new Student("ahmet", 18);
		Student reyhan = new Student("reyhan", 23);

		LinkedList halay = new LinkedList();
		halay.prepend(boray);
		halay.append(ahmet);
		halay.append(reyhan);

		Student s4 = new Student("mordo", 25);
		halay.prepend(s4);

		System.out.println("HALAY:");
		System.out.println(halay);

	}

	public void prepend(Student s){
		s.setFriend(head);
		head = s;
		if (tail==null) tail = s;
	}

	public void append(Student s){
		if (head==null){
			head = s;
		} else{
			tail.setFriend(s);;
		}
		tail = s;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		Student s = head;
		while (s!=null){
			sb.append(s.toString());
			sb.append("\n");
			s = s.getFriend();
		}
		return sb.toString();
	}
}