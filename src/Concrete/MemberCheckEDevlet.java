package Concrete;

import Abstract.MemberCheckService;
import Entities.Member;

public class MemberCheckEDevlet implements MemberCheckService{

	public void checkMember(Member member) {
	System.out.println("E-Devlet doðrulamasý baþarýlý");
	}

}
