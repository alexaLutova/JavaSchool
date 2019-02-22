package classwork.util.xml;

import classwork.params.entity.template.Fallback;
import classwork.util.AbstractFileReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlFileReader extends AbstractFileReader {
	private Fallback fallback;
	public XmlFileReader(Object mapper, String fileName) {

		super(mapper, fileName);
                this.fallback=fallback;

	}
	
	@Override
	public void readFile() {
		System.out.println("yyСчитываем данные из файла " + fileName);
		try {
			XmlMapper o = (XmlMapper)mapper;
			fallback = o.readValue(new File(fileName), Fallback.class);
			//o.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), fallback);
			System.out.println("Данные считаны из файла " + fileName);
		}catch (ClassCastException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	
	}
}
