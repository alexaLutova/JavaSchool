package classwork.util.json;

import classwork.params.entity.template.Fallback;
import classwork.util.AbstractFileReader;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonFileReader extends AbstractFileReader {
	private Fallback fallback;
	public JsonFileReader(ObjectMapper mapper, String fileName) {

		super(mapper, fileName);


	}
	
	@Override
	public void readFile() {

		System.out.println("tt????????? ?????? ?? ????? " + fileName);
		try {
			ObjectMapper o = (ObjectMapper)mapper;
			fallback = o.readValue(new File(fileName), Fallback.class);
			//o.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), fallback);
			System.out.println("?????? ??????? ?? ????? " + fileName);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	
	}
}
