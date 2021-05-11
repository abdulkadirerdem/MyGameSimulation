package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya oluþturuldu: " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi: " + campaign.getCampaignName());
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Kampanya süresi bitti yada kaldýrýldý: " + campaign.getCampaignName());
	}

}
