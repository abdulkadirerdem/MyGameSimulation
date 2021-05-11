package adapters;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicLocator locator = new KPSPublicLocator();
		try {
			KPSPublicSoap client = locator.getKPSPublicSoap();
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());

		} catch (Exception error) {
			System.out.println(error.getMessage());
			return false;
		}
	}

}

//package adapters;
//
//import abstracts.CustomerCheckService;
//import entities.Customer;
//import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
//import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
//
//public class MernisServiceAdapter implements CustomerCheckService {
//
//	@Override
//	public boolean checkIfRealPerson(Customer customer) {
//		KPSPublicLocator locator = new KPSPublicLocator();
//		try {
//			KPSPublicSoap client = locator.getKPSPublicSoap();
//			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
//					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
//					customer.getDateOfBirth().getYear());
//
//		} catch (Exception error) {
//			System.out.println(error.getMessage());
//			return false;
//		}
//	}
//}
