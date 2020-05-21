package b_foreach_test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.omg.Messaging.SyncScopeHelper;

import a_default_static_method.SavingAccount;

public class TestIterable {

	public static void main(String[] args) { 
		
		List<SavingAccount> saving_accounts = new ArrayList<SavingAccount>();
		saving_accounts.add(new SavingAccount("Amit",4000));
		saving_accounts.add(new SavingAccount("Manoj",3670));
		saving_accounts.add(new SavingAccount("Joy",66782));
		saving_accounts.add(new SavingAccount("Herry",6788));
		
		System.out.println("test");
		/*
		@FunctionalInterface
		public interface Consumer<T>
		{
			void accept(T t);
		}
		*/
		
		/*Consumer<SavingAccount> c1 = (SavingAccount s) ->  System.out.println(s.getName());
		Consumer<SavingAccount> c2 = (SavingAccount s) ->  System.out.println(s.getBal());
		
		//saving_accounts.forEach(s ->  System.out.println(s.getBal()));
		saving_accounts.forEach(ob ->{
			if(ob.getBal() > 4000)
			System.out.println(ob.getName());
					
		}*/
		
		saving_accounts.forEach((SavingAccount s)-> System.out.println(s.getName()));
		
		saving_accounts.forEach(System.out::println);
		
		
		
		
	}

}
