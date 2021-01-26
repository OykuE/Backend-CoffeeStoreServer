
public class Main {

	public static void main(String[] args) {
		
		SalesService salesService = new SalesService(new StarbucksCampaignService());
		
		ConsumerService consumerService = new ConsumerService(new ConsumerDao());
		
		ConsumerDatabaseService consumerDatabaseService = new ConsumerDatabaseService(new StarbucksConsumerService(new ConsumerDao()));
		
		CampaignDao campaignDao = new CampaignDao();
		
		
		Consumer consumer = new Consumer();
		consumer.setId(1);
		consumer.setIdentityNumber("23456789");
		consumer.setFirstName("Öykü");
		consumer.setLastName("Ergün");
		consumer.setBirthYear("1998");
		
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCustomerId("234");
		customer.setCustomerName("Starbucks");
	
		Campaign campaign = new Campaign();
		campaign.setCampaignName("Starbucks yýldýz kampanyasý");
		campaign.setId(1);
		
		campaignDao.add(campaign);
		System.out.println(" ");
		
		consumerDatabaseService.add(consumer);
		System.out.println(" ");
		
		salesService.sales(consumer);
		
		
	}

}
