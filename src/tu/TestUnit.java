package tu;

import java.util.List;

import com.solucionesenjambre.interapp.fs.dto.Users;
import com.solucionesenjambre.interapp.fs.dto.VwDates;
import com.solucionesenjambre.interapp.fs.dto.VwSports;
import com.solucionesenjambre.interapp.tier.TeamsTier;
import com.solucionesenjambre.interapp.tier.UsersTier;
import com.solucionesenjambre.interapp.tier.VwDatesTier;
import com.solucionesenjambre.interapp.tier.VwSportsTier;

public class TestUnit{

	public static void main(String[] args)
	{
		TestUnit tu = new TestUnit();
		
		tu.Dates();
	}
	
	private void Users1()
	{
		UsersTier tier = new UsersTier();
		
		List<Users> usuarios = tier.findUser("capturista", "CAP");
		
		for (Users users : usuarios)
		{
			System.out.println("User: " + users);
		}
	}
	
	private void Users2()
	{
		UsersTier tier = new UsersTier();
		
		boolean usuarios = tier.set("35418415454", "1234567890", ".", 2);
		
		System.out.println(usuarios);
	}
	
	private void Users3()
	{
		int pk = 0;
		
		UsersTier tier = new UsersTier();
		
		List<Users> usuarios = tier.findBySeed("uuid()");
		
		for (Users users : usuarios)
		{
			System.out.println("User: " + users);
			pk = users.getUserId();
			
			boolean done = tier.delete(pk);
			System.out.println(done);
		}
	}
	
	private void VwSports1()
	{
		VwSportsTier tier = new VwSportsTier();
		
		List<VwSports> usuarios = tier.getByEvent(2);
		
		for (VwSports users : usuarios)
		{
			System.out.println("User: " + users);
		}
	}
	
	private void Teams()
	{
		TeamsTier tier = new TeamsTier();
		String[] params = new String[4];
		
		params[0] = "33";
		params[1] = "5";
		params[2] = "1";
		params[3] = "1";
		
		int teamId = tier.findId(params);
		
		System.out.println(teamId);
	}
	
	private void Dates()
	{
		VwDatesTier tier = new VwDatesTier();
		
		List<VwDates> vwDates = tier.getByEvent(2);
		
		for (VwDates date : vwDates)
		{
			System.out.println("Date: " + date);
		}
	}

}
