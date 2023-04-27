package SeriallizationandDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SeriallizationandDeserialization {
	
	
	
	static void Deserialization() {
		String jsonData= "{\r\n"
				+ "  \"name\" : \"Rahul\",\r\n"
				+ "  \"className\" : \"grad\",\r\n"
				+ "  \"roll\" : 2,\r\n"
				+ "  \"id\" : 1\r\n"
				+ "}";
		ObjectMapper objMapper = new ObjectMapper();
		try {
		Student student = objMapper.readValue(jsonData, Student.class);
		System.out.println(student.name);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) throws JsonProcessingException {

		Student std= new Student();
		
		std.setName("Rahul");
		std.setId(1);
		std.setRoll(2);
		std.setClassName("grad");
		
		ObjectMapper objMapper = new ObjectMapper();
				
			String jsonData=	objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(std);
		
		System.out.println(jsonData);
	
		Deserialization();
	}
	

}
