package com.manas.basics.util;
import java.util.*;
import com.manas.basics.dao.*;
import com.manas.basics.dto.*;
public class Test {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner scn=new Scanner(System.in);
		AccountDAO accountDAO = new AccountDAO();
		while(flag) {
			System.out.println("What operation you want to do?,choose 1 for insert,2 for fetch by id,3 for update,4 for delete");
			int choose=scn.nextInt();
			switch(choose) {
			case 1:
				AccountDTO accountDTO = new AccountDTO();
				System.out.println("Enter user ID");
				accountDTO.setId(scn.nextLong());
				System.out.println("Enter AccountHolderName");
			    accountDTO.setAcHolderName(scn.next());
			    System.out.println("Enter Account Number");
			    accountDTO.setAcNumber(scn.next());
			    System.out.println("Enter Account Balance");
			    accountDTO.setBalance(scn.nextDouble());
			    System.out.println("Enter Account address");
			    accountDTO.setAddress(scn.next());
			    System.out.println("Enter mobile number");
			    accountDTO.setMobNum(scn.nextLong());
			    accountDAO.saveAccountDetails(accountDTO);
			    System.out.println("Data Successfully entered");
			    System.out.println(accountDTO);
			    break;
			case 2:
				System.out.println("Enter user ID");
				accountDAO.getAccountdetailsById(scn.nextLong());
				System.out.println(accountDAO);
				break;
			case 3:
				System.out.println("Enter Id that you want to update");
				Long id=scn.nextLong();
				System.out.println("what you want to update");
				System.out.println("type 1 for Ac Balance");
				System.out.println("type 2 for mob number");
				System.out.println("type 3 for address");
				int ch=scn.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter balance");
					accountDAO.updateAcountBalance(id,scn.nextDouble());
					break;
				case 2:
					System.out.println("Enter mob number");
					accountDAO.updateMobileNumber(id,scn.nextLong());
					break;
				case 3:
					System.out.println("Enter Account Address");
					accountDAO.updateAcountAdress(id, scn.next());
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
			case 4:
				System.out.println("Enter User ID");
				accountDAO.deleteAccount(scn.nextLong());
				break;
			default:
				System.out.println("Invalid Input");
			}
			System.out.println("do you want to execute again?(Y/N)");
			String st=scn.next();
			if(st.equalsIgnoreCase("Y"))continue;
			else flag=false;
		}
		scn.close();
		
	}

}
