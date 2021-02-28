package day14constructorsstatickeywordarrays;

public class Pet {

	public static void main(String[] args) {
		
		
		Dog.eat(); //to acces static methods just class name is enough..
		
		Dog obj1=new Dog(); //non static method in order to call in othere class ..
		
		obj1.drink();//to acces non static methods , you must creat an object.
		
		obj1.eat();// it doesnt recommendet but it works as well ,
		            //because it is long way and java gives you notification  with yellow underline 
		
		//https://files.slack.com/files-pri/T01HX4GLWRM-F01NR8GJ805/screen_shot_2021-02-21_at_2.13.06_pm.png
		
		//https://files.slack.com/files-pri/T01HX4GLWRM-F01P0G3Q876/screen_shot_2021-02-21_at_2.15.59_pm.png
		
		//https://files.slack.com/files-pri/T01HX4GLWRM-F01NUBF78BU/screen_shot_2021-02-21_at_2.29.39_pm.png
		
		//https://files.slack.com/files-pri/T01HX4GLWRM-F01P0GNV70C/screen_shot_2021-02-21_at_2.44.49_pm.png
		
		//https://files.slack.com/files-pri/T01HX4GLWRM-F01PJ6VAANL/screen_shot_2021-02-21_at_2.52.10_pm.png
		
		
	}

}
