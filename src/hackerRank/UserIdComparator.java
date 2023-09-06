package hackerRank;
import java.util.*;

public class UserIdComparator implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		// TODO Auto-generated method stub
		return user1.getId() - user2.getId();
	}

}
