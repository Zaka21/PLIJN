package P1P2;

import java.text.ParseException;
import java.util.List;

public interface StudentDao {
	
	public List<Student> findAll();
	
	public List<Student> findByCode(String code) throws ParseException;

}
