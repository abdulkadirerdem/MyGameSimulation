package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya olu�turuldu: " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi: " + campaign.getCampaignName());
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Kampanya s�resi bitti yada kald�r�ld�: " + campaign.getCampaignName());
	}

}
