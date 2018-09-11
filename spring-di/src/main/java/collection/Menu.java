package collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Menu {

	private List<ISand> sandList;
	private Set<ISand> sandSet;
	private Map<String, ISand> sandMap;
	private Properties props;

	public Menu() {
		System.out.println("Menu 기본 생성자");
	}

	public void setSandList(List<ISand> sandList) {
		this.sandList = sandList;
	}

	public void printList() {
		for (ISand sand : sandList) {
			sand.info();
		}
	}

	public void setSandSet(Set<ISand> sandSet) {
		this.sandSet = sandSet;
	}

	public void printSet() {
		for (ISand set : sandSet) {
			set.info();
		}
	}

	public void setSandMap(Map<String, ISand> sandMap) {
		this.sandMap = sandMap;
	}

	public void printMap() {

		Set<String> keys = sandMap.keySet();

		for (String key : keys) {
			ISand sand = sandMap.get(key);
			sand.info();
		}
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public void printProps() {
		System.out.println(props.getProperty("ham"));
		System.out.println(props.getProperty("cheese"));
		System.out.println(props.getProperty("hamCheese"));
	}
}
