import java.io.IOException;

import org.activiti.engine.task.Task;
import org.activiti.engine.test.ActivitiTestCase;
import org.activiti.engine.test.Deployment;


public class MyBusinessProcessTest{
	public static void main(String[] args) {
		 try {
			new ProcessBuilder("notepad.exe").start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}      
	      