package kr.co.mlec.day19;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Exam05 {
	public static void main(String[] args) {
		// Dom parser�� Ȱ���ϱ� ���� �ܰ�
		// 1. DocumentBuilderFactory ��ü�� ��´�
		// 2. factory ��ü�� �̿��ؼ� DocumentBuilder ��ü�� ��´�
		// 3. parser�� ���ؼ� xml �Ľ��� ����

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			// DOM �ļ�
			DocumentBuilder builder = factory.newDocumentBuilder();

			// xml �Ľ�
			// �Ľ̵� Document ��ü�� family.xml ������ ������ ��� �ִ�
			Document doc = builder.parse("src/kr/co/mlec/day19/family.xml");
			// �Ľ̵� ����� ������
			NodeList list = doc.getElementsByTagName("family");
			// �ΰ��� �־�� �Ѵ�, getLength() ����Ʈ�� ũ�� ��ȯ
			System.out.println("family �±� �� : " + list.getLength());

			for (int i = 0; i < list.getLength(); i++) {
				// family �±׿� ���� ����
				Node node = list.item(i);
				// family �±��� �ڽ� �±׿� ����
				NodeList cList = node.getChildNodes();
				System.out.println("family �ڽ� �� : " + cList.getLength());

				for (int j = 0; j < cList.getLength(); j++) {
					// textNode(����), father, mother, me, brother
					Node cNode = cList.item(j);
					// textNode(����) �ɷ�����
					String name = cNode.getNodeName();
					if (name.equals("#text"))
						continue;
					String value = cNode.getTextContent();
					System.out.println("Node name : " + name + ", value : " + value);

				}

			}

		} catch (Exception e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}
	}
}
