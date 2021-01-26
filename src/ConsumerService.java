
public class ConsumerService  {
	ConsumerDao consumerDao;
	public ConsumerService(ConsumerDao consumerDao) {
		this.consumerDao = consumerDao;
	}
	public void add(Consumer consumer) {
		consumerDao.add(consumer);
		System.out.println("Consumer Add : business code");
	}
	public void update(Consumer consumer) {
		consumerDao.update(consumer);
		System.out.println("Consumer Update : business code");
	}
	public void delete(Consumer consumer) {
		consumerDao.delete(consumer);
		System.out.println("Consumer Delete : business code");
	}
	
	
}
