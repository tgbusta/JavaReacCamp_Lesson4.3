package Concrete;

import Abstract.MemberService;
import Entities.Member;



public class MemberManager implements MemberService{
	
	public MemberCheckEDevlet checkEDevlet;
	
	public MemberManager(MemberCheckEDevlet checkEDevlet) {
	this.checkEDevlet = checkEDevlet;
	}
	
	@Override
	public void add(Member member) {

		checkEDevlet.checkMember(member);	
		System.out.println(member.getName() + " " + member.getSurname() +"'ya ait kimlik numarasý E-Devlet tarafýndan doðrulandý, kullanýcý kaydý yapýldý.");
			
	
	}

	

	@Override
	public void update(Member member) {
		
		System.out.println(member.getUserName() + " kullanýcýsýna ait bilgiler güncellendi.");
		
	}

	@Override
	public void delete(Member member) {
		
		System.out.println(member.getUserName() + " kullanýcý hesabýna ait bilgiler silindi.");
		
	}

	
	
}
