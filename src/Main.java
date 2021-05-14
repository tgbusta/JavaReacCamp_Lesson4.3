import Concrete.MemberCheckEDevlet;
import Concrete.MemberManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Member;

public class Main {

	public static void main(String[] args) {

		Member member1= new Member("Tuðba", "Usta", "11278057417", 1980);
		
		MemberManager memberManager = new MemberManager(new MemberCheckEDevlet());
		memberManager.add(member1);

		
		Campaign campain1= new Campaign(1, "Yeni üyelikte %50 indirim");
		
		SaleManager saleManager = new SaleManager();
		
		saleManager.sale(member1);
		saleManager.campaignSale(member1, campain1);
	}

}
