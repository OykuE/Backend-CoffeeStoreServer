
public class CustomerDao {
	public void add(Customer customer) {
		System.out.println("Müşteri veritabanına eklendi");
	}	
	
	public void delete(Customer customer) {
		System.out.println("Müşteri veritabanından silindi");
	}
	
	public void update(Customer customer) {
		System.out.println("Müşteri veritabanında güncellendi");
	}
}
