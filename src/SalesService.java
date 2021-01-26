
public class SalesService {
	
	ICampaignService campaignService ;
	public SalesService(ICampaignService campaignService) {
		this.campaignService = campaignService;
	}
	
	

	public void sales(Consumer consumer) {
		System.out.println("Tüketici Adý Soyadý : " + consumer.getFirstName() + " " + consumer.getLastName());
		System.out.println("Bir kahve satýldý");
		campaignService.applyCampaign();
	}
	
	
}
