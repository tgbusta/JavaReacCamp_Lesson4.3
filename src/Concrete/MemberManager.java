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
		System.out.println(member.getName() + " " + member.getSurname() +"'ya ait kimlik numaras� E-Devlet taraf�ndan do�ruland�, kullan�c� kayd� yap�ld�.");
			
	
	}

	

	@Override
	public void update(Member member) {
		
		System.out.println(member.getUserName() + " kullan�c�s�na ait bilgiler g�ncellendi.");
		
	}

	@Override
	public void delete(Member member) {
		
		System.out.println(member.getUserName() + " kullan�c� hesab�na ait bilgiler silindi.");
		
	}

	
	
}
