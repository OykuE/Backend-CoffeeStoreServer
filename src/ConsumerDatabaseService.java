
public class ConsumerDatabaseService {
	ConsumerService consumerService ;
	public ConsumerDatabaseService(ConsumerService consumerService) {
		this.consumerService = consumerService;
	}
	
	public void add(Consumer consumer) {
		consumerService.add(consumer);
		
	}
	public void delete(Consumer consumer) {
		consumerService.delete(consumer);
	}
	public void update(Consumer consumer) {
		consumerService.update(consumer);
	}
	
	
}
