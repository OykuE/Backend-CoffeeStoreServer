
public class StarbucksConsumerService extends ConsumerService{

	public StarbucksConsumerService(ConsumerDao consumerDao) {
		super(consumerDao);
		
	}
	
	public void add(Consumer consumer) {
		System.out.println("E Devlet Kontrolü Yapýldý");
		System.out.println("Consumer Add : business code");
		consumerDao.add(consumer);
	}
	
	public void update(Consumer consumer) {
		System.out.println("E Devlet Kontrolü Yapýldý");
		System.out.println("Consumer Update : business code");
		consumerDao.update(consumer);
	}

	

}
