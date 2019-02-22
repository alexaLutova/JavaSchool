package factory.method;

import classwork.params.entity.template.Fallback;
import classwork.util.AbstractFileReader;
import classwork.util.json.JsonFileReader;
import classwork.util.xml.XmlFileReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.codehaus.jackson.map.ObjectMapper;

public class FileReaderFactory {
    protected String fileName;
    protected Fallback fallback;

    private FileReaderFactory(String fileName) {
        this.fileName = fileName;

    }
    public AbstractFileReader fileReader(String typeFile){
        switch (typeFile){
            case "json":
                return new JsonFileReader(new ObjectMapper(), fileName );
            default:
                return new XmlFileReader(new XmlMapper(), fileName );
        }
    }
    public static final FileReaderFactory newFileReaderFactory(String fileName){
        return new FileReaderFactory(fileName);
    }
}
