package Abstract;

import Concrete.MemberCheckEDevlet;
import Entities.Member;

public interface MemberService {
	void add(Member member);
	void update(Member member);
	void delete(Member member);
	}
