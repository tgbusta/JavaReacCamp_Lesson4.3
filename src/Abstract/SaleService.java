package Abstract;

import Entities.Campaign;
import Entities.Member;

public interface SaleService {
	void sale(Member member);
	void campaignSale(Member member, Campaign campaign);

}
