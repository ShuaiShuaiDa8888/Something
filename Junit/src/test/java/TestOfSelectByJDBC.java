import model.Student;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import searchVO.StudentSearchVO;
import utils.DBHelper;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by weishuai on 2018/2/13.
 */
public class TestOfSelectByJDBC {

    private static Logger logger = Logger.getLogger(TestOfSelectByJDBC.class);

    private DBHelper dbHelper;
    private StudentSearchVO studentSearchVO;
    private SelectByJDBC selectByJDBC;
    String sql = "SELECT * FROM students WHERE 1=1 AND id = ?";

    @Before
    public void init() {
        studentSearchVO = new StudentSearchVO();
        selectByJDBC = new SelectByJDBC();
    }

    @Test
    public void selectByJDBC() throws Exception {
        try {
            dbHelper = new DBHelper(sql);
            List<Student> studentList = selectByJDBC.listTable(Student.class, dbHelper, studentSearchVO, sql);
            logger.info("一般信息");
            System.out.println(studentList);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
