package mail;

/**
 * @author Shubham sharma
 *
 */
public class animalBean {
	public String getNewsid() {
		return newsid;
	}

	public void setNewsid(String newsid) {
		this.newsid = newsid;
	}

	public String getNewstitle() {
		return newstitle;
	}

	public void setNewstitle(String newstitle) {
		this.newstitle = newstitle;
	}

	public String getNewsdecription() {
		return newsdecription;
	}

	public void setNewsdecription(String newsdecription) {
		this.newsdecription = newsdecription;
	}

	public String getCreateon() {
		return createon;
	}

	public void setCreateon(String createon) {
		this.createon = createon;
	}

	private String newsid;
	private String newstitle;
	private String newsdecription;
	private String createon;

	@Override
	public String toString() {
		String output = "id: " + getNewsid() + " title: " + getNewstitle() + " newsdec: " + getNewsdecription();

		return output;
	}
}
