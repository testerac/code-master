package framework.Steps;

import lombok.Data;


import org.junit.jupiter.api.function.Executable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @program:
 * @description:step run result
 * @author: Mr.libb
 * @creat: 2022-08-03 16-51
 **/
@Data
public class StepResult {
    private ArrayList<Executable> assertList;
    private HashMap<String,String> stepVariables = new HashMap<>();
}
