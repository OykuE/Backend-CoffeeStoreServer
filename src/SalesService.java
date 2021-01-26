
public class SalesService {
	
	ICampaignService campaignService ;
	public SalesService(ICampaignService campaignService) {
		this.campaignService = campaignService;
	}
	
	

	public void sales(Consumer consumer) {
		System.out.println("T�ketici Ad� Soyad� : " + consumer.getFirstName() + " " + consumer.getLastName());
		System.out.println("Bir kahve sat�ld�");
		campaignService.applyCampaign();
	}
	
	
}
