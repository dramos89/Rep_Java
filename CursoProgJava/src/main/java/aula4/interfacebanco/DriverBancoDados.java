package aula4.interfacebanco;

public interface DriverBancoDados {
	
	public int update(String updateSql);
	public void insertInto(String insertIntoSql);
}
