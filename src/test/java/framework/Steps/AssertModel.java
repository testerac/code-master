package framework.Steps;

import lombok.Data;

/**
 * @program:
 * @description:用来存储断言数据的对象
 * @author: Mr.libb
 * @creat: 2022-08-03 16-48
 **/
@Data
public class AssertModel {
    private String actual;
    private String matcher;
    private String expect;
    private String reason;

}
