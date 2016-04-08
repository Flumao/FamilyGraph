package org.flumao.urlife.util;

import java.util.ArrayList;
import java.util.List;

import org.flumao.urlife.entity.Node;
import org.flumao.urlife.entity.User;

/**
 * GraphUtil 
 * 
 * @author Flumao
 * 
 */
public class GraphUtil {
	/**
	 * Wraps User to Node
	 * @param users
	 * @return
	 */
	public static List<Node> setColorAndShape(List<User> users) {
		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < users.size(); i++) {
			Node node = new Node(users.get(i), i);
			nodes.add(node);
		}
		return nodes;
	}

}
