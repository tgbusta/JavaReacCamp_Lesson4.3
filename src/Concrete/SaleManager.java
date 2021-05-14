package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Member;

public class SaleManager implements SaleService{

	@Override
	public void sale(Member member) {
		System.out.println("Oyun hesabýnýza tanýmlandý.");		
	}

	@Override
	public void campaignSale(Member member, Campaign campaign) {
		System.out.println(member.getName() + " " + member.getSurname() + " kullanýcýsý için " + campaign.getDescription() + " kampanyasý uygulandý.");		
		
	}

}
