package framework.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import framework.actions.ApiActionModel;
import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * @program:
 * @description:接口对象类
 * @author: Mr.libb
 * @creat: 2022-08-03 16-28
 **/
@Data
public class ApiObjectModel {
    private String name;
    private HashMap<String, ApiActionModel> actions;

    public static ApiObjectModel load(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        return objectMapper.readValue(new File(path),ApiObjectModel.class);
    }
}
