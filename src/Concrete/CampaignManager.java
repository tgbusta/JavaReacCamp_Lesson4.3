package Concrete;

import Abstract.CampainService.CampaignService;
import Entities.Campaign;
import Entities.Member;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya olu�turuldu");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya silindi");
		
	}
	
	
}
